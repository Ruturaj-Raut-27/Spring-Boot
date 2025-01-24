package com.tka.SpringBankAPI;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SBI")
public class SBIControler {

	@PostMapping("/deposit")
	public String depositAPI() {
		return "Money deposited in SBI bank";
	}
	
	@PostMapping("/withdraw")
	public String withdrawAPI() {
		return "Money withdrawn from SBI bank";
	}
	
	@PostMapping("/balance")
	public String checkBalanceAPI() {
		return "this is your balance in SBI bank";
	}
}
