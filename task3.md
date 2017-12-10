## Task 3 - First module in Java 9 

> If you wan to start from this task, checkout solution for task2 by **Alt+` 7 task_2_debuging**/**Ctrl+V 7 task_2_debuging**

Steps
1. Java 9 is available so this is good moment to use it:
   * install jdk9 on your machine
   * configure jdk9 project structure - **Ctrl+Alt+Shift+S**/**Cmd+;**
     * add it in `Project` tab
     * pick it in `Modules` tab
   * set `sourceCompatibility = '9'` in `build.gradle` - **Ctrl+E**/**Cmd+E**
   * add `targetCompatibility = '9'`
1. Now we can create first module in project root directory:
    * go to `Project` panel - **Alt+1**/**Cmd+1**
    * move to root using UP arrow
    * press **Alt+Insert**/**Cmd+N**
    * provide name `pizza-service`
1. Setup multi-module project structure:
    * open `build.gradle` finding it on the list of recently edited files - **Ctrl+Shift+E**/**Cmd+Shift+E**
    * select everything - **Ctrl+A**/**Cmd+A**
    * wrap in block - **Ctrl+Alt+T 5**/**Cmd+Alt+T 5**
    * go to the top of the block - **Ctrl+\[**/**Cmd+\[**
    * start typing `subprojects`
    * reformat file - **Ctrl+Alt+L**/**Cmd+Alt+L**
    * remove `group` - press in line **Ctrl+Y**/**Cmd+Backspace**
    * replase `java` plugin with `java-library`
    * change `testCompile` to `testImplementation` - press on word **Ctrl+Shift+Alt+J**/**Ctrl+G** and type `testImplementation`
    * add below code on the end of `subprojects` block:
    ```groovy
        afterEvaluate { Project project ->
        repositories {
            jcenter()
        }
        if (project.hasProperty("moduleName")) {
            compileJava {
                destinationDir = project.file("build/mods")
                options.compilerArgs = [
                        '--module-path', classpath.asPath,
                        '--module-source-path', sourceSets.main.java.srcDirs.join(System.getProperty('path.separator')),
                        '-m', moduleName,
                ]
                doLast {
                    copy {
                        from file(new File(destinationDir, moduleName))
                        into sourceSets.main.java.outputDir.absolutePath
                    }
                }
             }
          }
       }
    ```
1. Clean up `pizza-service/build.gradle`:
    * open it by **Ctrl+Shoft+N**/**Cmd+Shift+O**
    * start typing `pizza-` and press **Ctrl+SPACE**/**Cmd+SPACE**
    * type `/buil` and press **Ctrl+SPACE**/**Cmd+SPACE**
    * remove unnecessary lines - **Ctrl+Y**/**Cmd+Backspace**
    ```groovy
    ext.moduleName = 'org.siemasoft.pizza.service'
    dependencies {
    }
    ```
1. Remove folder `pizza-service/src`:
    * go to navigation bar - **Alt+HOME**/**Cmd+UP**
    * move left - **LEFT**
    * move down and find `src` - **DOWN**
      > You can filter by typing desired name
    * delete pressing **Delete**
1.  Create module directory in `pizza-service`
    * go to navigation bar - **Alt+HOME**/**Cmd+UP**
    * move to `pizza-service`
    * insert directory with name `src/main/java/org.siemasoft.pizza.service` -  **Alt+Insert**/**Cmd+N**
1. Move class `OrderService` to `pizza-service/src/main/java/org.siemasoft.pizza.service/impl` module - **F6**
    > Remember smart-completation works also here
1. Move test `OrderServiceSpec` to `pizza-service/src/test/groovy/org/siemasoft/pizza/service/impl` module - **F6**    
1. Make sure all files are added to git:
    * go to `Version Control` tab - **Alt+9**/**Cmd+9**
    * review list, all should be under `Default` set,
    * if you have any file under `Unversioned Files` set add them - **Ctrl+Alt+A**/**Cmd+Alt+A**
    
    > You can group you changes in changelist.
    It can be usefull when changed some files for local purpuses and do not want to commit them by mistake.
    In this tab you can create your own changelist and manage them.
    Commit changes popup let you select changelist to use in dropdown on the top
1. Add `module-info.java` to `pizza-service/src/java`:
    * use navigation bar to select folder `pizza-service/src/java/org.siemasoft.pizza.service` -  **Alt+HOME**/**Cmd+UP**
    * create file `module-info.java` by pressing **Alt+Insert**/**Cmd+N**
    * find it on the list by typing `module` and press **ENTER**
    * fill placeholder inside by module nane `org.siemasoft.pizza.service`
1. Idea behind the modules is to improve encapsulation, so we shoudl expose behavior of `OderService` by interface:
    * go to `OrderServce` - **Ctrl+N**/**Cmd+O**
    * rename it to `OrderServceImpl` - **Shift+F6**
    * go to order method by pressing **Ctrl+F12**/**Cmd+F12** and typing `ord`
    * extrat interface **Ctrl+Shift+Alt 0**/**Ctrl+T 0**
    * name it `OrderService`
1. Move interface to new package *api*:
    * go to `OrderService` - **Ctrl+N**/**Cmd+O**
    * move it to package `api` - **F6**
1. Export interface to outside world:
    * go to interface - press outside of method **Ctrl+U**/**Cmd+U** 
    * copy it's name with package name - **Ctrl+Shift+Alt+C**/**Cmd+Shift+Alt+C**
    * go to `module-info.java` by pressing **Ctrl+Shift+E**/**Cmd+Shift+E** and finding it by name on the list
    * add `export` and paste content of clipboard
    * add semicolon on the end pressing **Ctrl+Shift+ENTER**/**Cmd+Shift+ENTER**, should be like that:
      ```java
      module org.siemasoft.pizza.service {
        exports org.siemasoft.pizza.service.api.OrderService;
      }
      ```
    * it does not work, check compilation error - **Ctrl+F1**/**Cmd+F1**
    * I see we need to provide package name, so delete `.OrderService` - **Ctrl+W BACKSPACE**/**Alt+UP BACKSPACE**
    * copy module name for the future use
1. Run tests
