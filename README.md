# intellij-workshop

## Task 1 - TDD
1. Create feature branch - **Alt+` 7 New Branch**/**Ctrl+V 7 New Branch**
1. Open class `org.siemasoft.intellij.workshop.OrderSerwice` - **Ctrl+N**/**Cmd+O**
1. Move it to `pizza` package - **F6**
1. Correct typo in class name - **Shift+F6**
1. Create test - **Ctrl+Shift+T**/**Cmd+Shift+T**
1. Use template to test case - **Ctrl+J**/**Cmd+J** and start typing `spgwt`
```java
def "should throw IllegalArgumentException when client id is: #clientId"() {
    given:
    
    when:
    
    then:
    
}
```
1. Go to the above the test case method - **Ctrl+[**/**Cmd+[** and **UP**
1. Create in instance of tested class by
 * typing `OrderService` when name will show in popup pick it
 * press **Spaca** and then **Ctrl+Space** to get suggestions of field name
 * pick first suggestion and press **Enter**
 * type ` = new ` and press **Ctrl+Shift+Enter**/**Cmd+Shift+Enter**
1. Go to the `when` block and type 
```java
   when:
      service.order(clientId)
```
1. Copie `then:`` block
```java
  then:
      thrown(IllegalArgumentException)
```
1. Copie `where:`` block  
```java
where:
        clientId | _
        null     | _
```        
