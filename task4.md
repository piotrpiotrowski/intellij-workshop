# Task4 - Refactoring

1. Add `pizzaName` parameter to `OrderServiceImpl.order()`
    * open test - **Ctrl+N**/**Cmd+O** and type `OSIS`
    * go to first test case - **Ctrl+F12**/**Cmd+F12** and type `should`
    * press **Ctrl+F6**/**Cmd+F6** on method `order()` to open `Change signature` popup:
      * press **Alt+Insert**/**Ctrl+N** to add parameter
      * provide type `String`
      * provide name `pizzaName`
      * provide default value `Margarita`
      * press **Ctrl+ENTER** to confirm
1. Add `String size` parameter
1. Add `String crustType` parameter
1. Method having more then 2 params is not good programming practice, so let fix it:
   * go to interface by pressing **Ctrl+B**/**Cmd+B**
   * extract parameter object - **Ctrl+Shift+Alt+T 6**/**Ctrl+T 6**
1. Extract variable `order`:
   * select `new OrderDto(clientId, "hawajska", "small", "thin")` - press **Ctrl+W**/**Alt+UP** 3 times
   * press **Ctrl+Alt+V**/**Cmd+Alt+V** on selection
   * name it `order`
   * go to `def` and press **Alt+ENTER** and pick `Declare explicite type`
1. Move variable to `given:` block:
   * add new line above variable - press **Ctrl+Alt+ENTER**/**Cmd+Alt+ENTER**
   * type `given:`
   * go back to variable and press **Ctrl+Shift+ENTER**/**Cmd+Shift+ENTER** 
1. Extract variable from `def pizzaName = "hawajska"`
1. Extract variable from `def size = "small"`
1. Extract variable from `def crustType = "thin"`
1. Replace `def` with `String`:
   * enable block selection mode - **Cmd+Shift+8**
   * select 3x3 cells and type `String`
   * disable block selection mode - **Cmd+Shift+8**
1. Move `given:` key to the top of method - **Shift+Alt+UP** 3 times   
1. Constructor of `OrderDto` has more then 2 params so lets review options to improve it:
   * first attempt is to create static factory method:
      * go to constructor definition - **Ctrl+B**/**Cmd+B**
      * open refactoring popup menu **Ctrl+Shift+Alt+T**/**Ctrl+T**
      * use refactor called `Replace Constructor with Factory Method` 
      * call it `create` an press **Ctrl+ENTER**
      > This refactor makes constructor `private` and replace all its occurences with factory method
