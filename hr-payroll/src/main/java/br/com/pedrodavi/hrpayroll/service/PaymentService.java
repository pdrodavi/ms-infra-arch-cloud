package br.com.pedrodavi.hrpayroll.service;

import br.com.pedrodavi.hrpayroll.model.entity.Payment;
import br.com.pedrodavi.hrpayroll.model.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClients.findById(workerId).getBody();

        return Payment.builder()
                .name(worker.getName())
                .dailyIncome(worker.getDailyIncome())
                .days(days)
                .build();
    }

}
