package com.codei.rest.unit;

import com.codei.rest.payments.PaymentRequest;
import com.codei.rest.payments.PaymentResponse;
import com.codei.rest.payments.PaymentService;
import com.codei.rest.payments.PaymentServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class PaymentServiceTest {

    @Test
    public void test() {
        PaymentService paymentService = new PaymentServiceImpl();
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setCardId("2134411");
        PaymentResponse paymentResponse = paymentService.processPayment(paymentRequest);
        Assert.assertNotNull(paymentResponse);
        Assert.assertTrue(paymentResponse.getMessage().equals("FAIL"));
    }

}
