## Task 2 - Debuging

We need to debug `OrderService.order()` to find out what is wrong with current implementation.
> Debugging is not as fluent process as writing code so in some cases usage of mouse is more convinient.

### Steps
1. Toogle breakpoint on `throw new IllegalArgumentException()` - **Ctrl+F8**/**Cmd+F8**
    > To edit breakpoint [options](https://www.jetbrains.com/help/idea/configuring-breakpoints.html) press **Ctrl+Shift+F8**/**Cmd+Shift+F8**, then options can be changed by mouse or using old schoole technique **Alt+(Underscorred letter)**. In order to get even more options press **Ctrl+Shift+F8**/**Cmd+Shift+F8** again. 
1. Run debuger - **Ctrl+F9**/**Ctrl+D**
    > When you running test first time use **Ctrl+Shift+F10**/**Ctrl+Shift+R**
    When you running debugger first time use **Ctrl+Shift+F9**/**Ctrl+Shift+D**
1. Ooups, we went too far, because the interesting part is `if` statment:
   * do not worry just set breakpoint on `if` 
   * click right button on top of stack and pick *Drop Frame*
   * resume debuger - **F9**
1. Now we stopped on `if` finally, we need to understand which condition is wrong:
    * select first one - **Ctrl+W**/**Alt+UP**
    * press **Alt+F8**
    * *Eveluate expression* pops up, press **ENTER** to evaluate
    * first condition looks ok, so lets do the same for the second one
1.    
