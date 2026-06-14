package com.codingshuttle.razorpay.common.exception;

import lombok.Getter;
import org.aspectj.bridge.IMessage;

@Getter
public class ResourceNotFoundException extends RuntimeException{

    String errorCode;

    private final String resourceName;
    private final Object identifier;

    public ResourceNotFoundException(String resourceName, Object identifier) {
        super(resourceName + "not found" + identifier);
        this.resourceName = resourceName;
        this.identifier = identifier;
    }
}
