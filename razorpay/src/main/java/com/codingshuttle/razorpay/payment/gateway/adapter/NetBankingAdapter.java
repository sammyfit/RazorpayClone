package com.codingshuttle.razorpay.payment.gateway.adapter;

import com.codingshuttle.razorpay.payment.gateway.PaymentAdapter;
import com.codingshuttle.razorpay.payment.gateway.dto.PaymentRequest;
import com.codingshuttle.razorpay.payment.gateway.dto.PaymentResult;
import org.springframework.core.annotation.Order;

public class NetBankingAdapter implements PaymentAdapter {

    @Override
    public PaymentResult initiate(PaymentRequest request) {
        return null;
    }
}
