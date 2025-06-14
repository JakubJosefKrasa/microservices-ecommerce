package com.ecommerce.orderservice.order_service.mapper;

import com.ecommerce.orderservice.order_service.dto.CreateOrderRequest;
import com.ecommerce.orderservice.order_service.dto.OrderItemResponse;
import com.ecommerce.orderservice.order_service.dto.OrderResponse;
import com.ecommerce.orderservice.order_service.model.Order;
import com.ecommerce.orderservice.order_service.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "status", source = "orderStatus")
    OrderResponse orderToOrderResponse(Order order);

    OrderItemResponse orderItemToOrderItemResponse(OrderItem orderItem);


    Order createOrderRequestToOrder(CreateOrderRequest createOrderRequest);
}
