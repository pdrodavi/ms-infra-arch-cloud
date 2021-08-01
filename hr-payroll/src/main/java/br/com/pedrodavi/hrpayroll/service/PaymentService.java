package br.com.pedrodavi.hrpayroll.service;

import br.com.pedrodavi.hrpayroll.model.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return Payment.builder()
                .name("Pedro")
                .dailyIncome(200.0)
                .days(days)
                .build();
    }

}
