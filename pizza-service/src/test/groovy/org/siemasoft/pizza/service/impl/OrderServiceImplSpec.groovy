package org.siemasoft.pizza.service.impl

import org.siemasoft.pizza.service.api.OrderService
import spock.lang.Specification
import spock.lang.Unroll

class OrderServiceImplSpec extends Specification {

    OrderService service = new OrderServiceImpl()

    @Unroll
    def "should throw IllegalArgumentException when clientId #caseDescription"() {
        when:
        service.order(clientId)

        then:
        thrown(IllegalArgumentException)

        where:
        clientId | caseDescription
        null     | "is null"
        ""       | "is empty"
    }
}