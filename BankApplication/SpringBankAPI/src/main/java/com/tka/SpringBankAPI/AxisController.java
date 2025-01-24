package com.tka.SpringBankAPI;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Axis")
public class AxisController {

	@PostMapping("/deposit")
	public String depositAPI() {
		return "Money deposited in Axis bank";
	}
	
	@PostMapping("/withdraw")
	public String withdrawAPI() {
		return "Money withdrawn from Axis bank";
	}
	
	@PostMapping("/balance")
	public String checkBalanceAPI() {
		return "this is your balance in Axis bank";
	}
}
