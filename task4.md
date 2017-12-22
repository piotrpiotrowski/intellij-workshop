# Task4 - Refactoring

1. Add `pizzaName` parameter to `OrderServiceImpl.order()`
    * open test - **Ctrl+N**/**Cmd+N** and type `OSIS`
    * go to first test case - **Ctrl+F12**/**Cmd+F12** and type `should`
    * press **Ctrl+F6**/**Cmd+F6** on method `order()` to open `Change signature` popup:
      * press **Alt+Insert**/**Ctrl+N** to add parameter
      * provide type `String`
      * provide name `pizzaName`
      * provide default value `Margarita`
      * press **Ctrl+ENTER** to confirm
1. Add `String size` parameter
1. Add `String crustType` parameter
