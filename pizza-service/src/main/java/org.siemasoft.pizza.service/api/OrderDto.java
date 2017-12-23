package org.siemasoft.pizza.service.api;

public class OrderDto {

    private final String clientId;
    private final String pizzaName;
    private final String size;
    private final String crustType;

    private OrderDto(String clientId, String pizzaName, String size, String crustType) {
        this.clientId = clientId;
        this.pizzaName = pizzaName;
        this.size = size;
        this.crustType = crustType;
    }

    public static OrderDtoBuilder builder() {
        return new OrderDtoBuilder();
    }

    public String getClientId() {
        return clientId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getSize() {
        return size;
    }

    public String getCrustType() {
        return crustType;
    }

    public static class OrderDtoBuilder {

        private String clientId;
        private String pizzaName;
        private String size;
        private String crustType;

        public OrderDtoBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public OrderDtoBuilder pizzaName(String pizzaName) {
            this.pizzaName = pizzaName;
            return this;
        }

        public OrderDtoBuilder size(String size) {
            this.size = size;
            return this;
        }

        public OrderDtoBuilder crustType(String crustType) {
            this.crustType = crustType;
            return this;
        }

        public OrderDto build() {
            return new OrderDto(clientId, pizzaName, size, crustType);
        }
    }
}
