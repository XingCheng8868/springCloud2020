package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_Ok(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_OK,/(ćoć)/~~------";
    }

    @Override
    public String paymentInfo_timeOut(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_timeOut,/(ćoć)/~~-------";
    }
}
