package gss.bank.app.bankgss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("bank/api")
@RequiredArgsConstructor
public class BankController {

	@GetMapping
	public String teste() {
		return "Teste!";
	}
}
