## Task 2 - Debugging

We need to debug `OrderService.order()` to find out what is wrong with current implementation.
> Debugging is not as fluent process as writing code so in some cases usage of mouse is more convenient.

> If you wan to start from this task, checkout solution for task1 by **Alt+` 7 task_1_tdd**/**Ctrl+V 7 task_1_tdd**

### Steps
1. Toggle breakpoint on `throw new IllegalArgumentException()` - **Ctrl+F8**/**Cmd+F8**
    > To edit breakpoint [options](https://www.jetbrains.com/help/idea/configuring-breakpoints.html) press **Ctrl+Shift+F8**/**Cmd+Shift+F8**, then options can be changed by mouse or using old school technique **Alt+(Underscored letter)**. In order to get even more options press **Ctrl+Shift+F8**/**Cmd+Shift+F8** again. 
1. Run debugger - **Ctrl+F9**/**Ctrl+D**
    > When you running test first time use **Ctrl+Shift+F10**/**Ctrl+Shift+R**
    When you running debugger first time use **Ctrl+Shift+F9**/**Ctrl+Shift+D**
1. Oops, we went too far, because the interesting part is `if` statement (at least know that code works correctly for `clientId=null` case):
   * do not worry just set breakpoint on `if` 
   * click right button on top of stack and pick *Drop Frame*
   * resume debugger - **F9**
   * continue to next line - **F8**
   * continue to next test case `clientId=""`- **F9**
1. Now we stopped on `if` again, go into `isEmpty()` method - **F7**
    > if you want to go back level up press **Shift+F8**
1. We need to understand which condition is wrong:
    * select first one - **Ctrl+W**/**Alt+UP**
    * press **Alt+F8**
    * *Evaluate expression* pops up, press **ENTER** to evaluate
    * first condition looks ok, so lets do the same for the second one
1. I looks like second condition is broken even if both sides of expression are `""` it returns `false`:
    * Take a look at it closer, `==` is highlighted, lets check available options - **Alt+ENTER**
    * Now I we see, strings are compared by `equals()`, so pick *Replace == with equals()`*
    * Stop debugger - **Ctrl+F2**/**Shift+F2**
1. Run tests again - **Ctrl+F10**/**Ctrl+R**
1. Once tests are passing we should commit the code - **Ctrl+K***/**Cmd+K**
    > *Commit popup* has many useful checkboxes, such as *Reformat code*, *Optimize imports* and *Perform code analysis* make sure that they are checked 
    
*[Next task - Java 11 Module  >>](task3.md)*
