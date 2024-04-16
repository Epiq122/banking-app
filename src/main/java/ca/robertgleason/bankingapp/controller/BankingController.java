package ca.robertgleason.bankingapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingController {


    @GetMapping("/health")
    public String health() {
        return "Banking Controller is healthy and Running!";
    }
}
