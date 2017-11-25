package org.siemasoft.pizza.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.siemasoft.pizza.service.api.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public void order(String clientId) {
        if (StringUtils.isEmpty(clientId)) {
            throw new IllegalArgumentException();
        }
    }
}