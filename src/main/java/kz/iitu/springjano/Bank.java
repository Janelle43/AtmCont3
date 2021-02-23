package kz.iitu.springjano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank {
    private BankService bankService;
//ioc
    @Autowired
    public Bank(BankService bankService){

        this.bankService = bankService;
    }
 public void infoBank(){
     bankService.checkAcc();
 }



}
