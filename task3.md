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
  * open `build.gradle` in new module and make sure that `sourceCompatibility = 9`
