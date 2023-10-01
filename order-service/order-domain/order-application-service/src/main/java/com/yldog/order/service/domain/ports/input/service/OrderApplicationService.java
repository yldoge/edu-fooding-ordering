package com.yldog.order.service.domain.ports.input.service;

import com.yldog.order.service.domain.dto.create.CreateOrderCommand;
import com.yldog.order.service.domain.dto.create.CreateOrderResponse;
import com.yldog.order.service.domain.dto.track.TrackOrderQuery;
import com.yldog.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);
    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
