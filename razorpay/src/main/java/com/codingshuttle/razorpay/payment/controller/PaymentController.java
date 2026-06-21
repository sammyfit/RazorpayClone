package com.codingshuttle.razorpay.payment.controller;

import com.codingshuttle.razorpay.payment.dto.request.PaymentInitRequest;
import com.codingshuttle.razorpay.payment.dto.response.PaymentResponse;
import com.codingshuttle.razorpay.payment.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/v1/payments")
@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;
    UUID merchantId = UUID.fromString("859a5ffb-6708-48bd-a6df-afba2e836650");

    @PostMapping
    public ResponseEntity<PaymentResponse> initiate(@RequestBody @Valid PaymentInitRequest request){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(paymentService.initiate(merchantId, request));
    }
}
