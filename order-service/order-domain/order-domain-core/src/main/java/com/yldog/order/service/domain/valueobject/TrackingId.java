package com.yldog.order.service.domain.valueobject;

import com.yldog.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }


}
