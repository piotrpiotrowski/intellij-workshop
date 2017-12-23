package org.siemasoft.pizza.service.impl

import org.siemasoft.pizza.service.api.OrderDto
import org.siemasoft.pizza.service.api.OrderService
import spock.lang.Specification
import spock.lang.Unroll

class OrderServiceImplSpec extends Specification {

    OrderService service = new OrderServiceImpl()

    @Unroll
    def "should throw IllegalArgumentException when clientId #caseDescription"() {
        given:
            String pizzaName = "hawajska"
            String size = "small"
            String crustType = "thin"
            OrderDto order = OrderDto.builder()
                                     .clientId(clientId)
                                     .pizzaName(pizzaName)
                                     .size(size)
                                     .crustType(crustType)
                                     .build()

        when:
            service.order(order)

        then:
            thrown(IllegalArgumentException)

        where:
            clientId | caseDescription
            null     | "is null"
            ""       | "is empty"
    }
}