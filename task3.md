## Task 3 - Refactoring



Steps
1. Java 9 is available so this is good moment to use it:
   * install jdk9 on your machine
   * configure jdk9 project structure - **Ctrl+Alt+Shift+S**/**Cmd+;**
     * add it in *Project* tab
     * pick it in *Modules* tab
   * set `sourceCompatibility = 9` in `build.gradle`
1. Now we can create first module in project root directory:
    * go to *Project* panel - **Alt+1**/**Cmd+1**
    * move to root using UP arrow
    * press **Alt+Insert**/**Cmd+N**
    * provide name `pizza-service`
1. Setup multi-module project structore:
    * open *build.gradle*
    * find it on the list of recently opened files - **Ctrl+E**/**Cmd+E**
    * select everything - **Ctrl+A**/**Cmd+A**
    * wrap in block - **Ctrl+Alt+T 5**/**Cmd+Alt+T 5**
    * go to the top of the block - **Ctrl+[**/**Cmd+[**
    * type *allProjects*
    * reformat file - **Ctrl+Alt+L**/**Cmd+Alt+L**
1. Clean up *pizza-service/build.gradle* like below
    ```
    dependencies {
    }
    ```
1. Remove folder *pizza-service/src* -  **Delete**
1. Move folder *src* to *pizza-service* module - **F6**
