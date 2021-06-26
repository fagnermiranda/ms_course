package br.com.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hrpayroll.entities.Payment;
import br.com.hrpayroll.entities.Worker;
import br.com.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired 
	private WorkerFeignClient workerFeignClient;
	
	public Payment get(long workerId, int days) {
		
		Worker worker =  workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(),worker.getDailyIncome(), days);
	}

}
