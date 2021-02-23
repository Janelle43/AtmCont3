package kz.iitu.springjano;
import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
public class UserProxy implements BankService{
    HashMap<Integer, Integer> passw = new HashMap<Integer, Integer>();
private UserReal userReal = new UserReal();
    @Override
    public void checkBalance() {
userReal.checkBalance();
    }

    @Override
    public void withDraw() {
userReal.withDraw();
    }

    @Override
    public void topUp() {
   userReal.topUp();
    }

    @Override
    public void checkAcc() {
userReal.checkAcc();
    }
}
