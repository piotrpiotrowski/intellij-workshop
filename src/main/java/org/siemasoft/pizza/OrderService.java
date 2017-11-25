package org.siemasoft.pizza;

public class OrderService {

    private static final String EMPTY = new String("");

    public void order(String clientId) {
        if (isEmpty(clientId)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isEmpty(String clientId) {
        return clientId == null || clientId.equals(EMPTY);
    }

}
