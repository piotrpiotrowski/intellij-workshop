## Task 3 - Java 9



Steps
1. Java 9 is available so this is good moment to use it:
   * install jdk9 on your machine
   * configure jdk9 project structure - **Ctrl+Alt+Shift+S**/**Cmd+;**
     * add it in *Project* tab
     * pick it in *Modules* tab
   * set `sourceCompatibility = 9` in `build.gradle` - **Ctrl+E**/**Cmd+E**
1. Now we can create first module in project root directory:
    * go to *Project* panel - **Alt+1**/**Cmd+1**
    * move to root using UP arrow
    * press **Alt+Insert**/**Cmd+N**
    * provide name `pizza-service`
1. Setup multi-module project structure:
    * open *build.gradle* finding it on the list of recently edited files - **Ctrl+Shift+E**/**Cmd+Shift+E**
    * select everything - **Ctrl+A**/**Cmd+A**
    * wrap in block - **Ctrl+Alt+T 5**/**Cmd+Alt+T 5**
    * go to the top of the block - **Ctrl+\[**/**Cmd+\[**
    * start typing *allProjects*
    * reformat file - **Ctrl+Alt+L**/**Cmd+Alt+L**
1. Clean up *pizza-service/build.gradle*:
    * open it by **Ctrl+Shoft+N**/**Cmd+Shift+O**
    * start typing *pizza-* and press **Ctrl+SPACE**/**Cmd+SPACE**
    * type */buil* and press **Ctrl+SPACE**/**Cmd+SPACE**
    * remove unnecessary lines - **Ctrl+Y**/**Cmd+Backspace**
    ```
    dependencies {
    }
    ```
1. Remove folder *pizza-service/src*:
    * go to navigation bar - **Alt+HOME**/**Cmd+UP**
    * move left - **LEFT**
    * move down and find *src* - **DOWN**
      > You can filter by typing desired name
    * delete pressing **Delete**
1. Move folder *src* to *pizza-service* module - **F6**
    > Remember smart-completation works also here
1. Make sure all files are added to git:
    * go to *Version Control* tab - **Alt+9**/**Cmd+9**
    * review list, all should be under *Default* set,
    * if you have any file under *Unversioned Files* set add them - **Ctrl+Alt+A**/**Cmd+Alt+A**
    
    > You can group you changes in changelist.
    It can be usefull when changed some files for local purpuses and do not want to commit them by mistake.
    In this tab you can create your own changelist and manage them.
    Commit changes popup let you select changelist to use in dropdown on the top
