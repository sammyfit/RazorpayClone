package com.codingshuttle.razorpay.operations.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class SettlementPaymentId {
    private UUID settlementId;
    private UUID paymentId;
}
