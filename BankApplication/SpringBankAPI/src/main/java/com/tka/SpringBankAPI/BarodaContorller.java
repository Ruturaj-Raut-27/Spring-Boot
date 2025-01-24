package com.tka.SpringBankAPI;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Baroda")
public class BarodaContorller {

	@PostMapping("/deposit")
	public String depositAPI() {
		return "Money deposited in Baroda bank";
	}
	
	@PostMapping("/withdraw")
	public String withdrawAPI() {
		return "Money withdrawn from Baroda bank";
	}
	
	@PostMapping("/balance")
	public String checkBalanceAPI() {
		return "this is your balance in Baroda bank";
	}
}
