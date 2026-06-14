package com.codingshuttle.razorpay.payment.dto.request;

import com.codingshuttle.razorpay.common.entity.Money;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.Map;

public record CreateOrderRequest(

        @NotNull(message = "Amount is required")
        Money amount,

        String receipt,

        Map<String, Object> notes,

        LocalDateTime expiresAt
   )
{ }
