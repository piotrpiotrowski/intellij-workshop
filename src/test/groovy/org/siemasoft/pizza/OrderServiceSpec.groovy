package org.siemasoft.pizza

import spock.lang.Specification
import spock.lang.Unroll

class OrderServiceSpec extends Specification {

    OrderService service = new OrderService()

    @Unroll
    def "should throw IllegalArgumentException when clientId #caseDescription "() {
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