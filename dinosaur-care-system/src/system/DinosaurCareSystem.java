package system;

import exception.DinosaurIllException;
import exception.EnclosureBreachedException;

import java.util.Random;

public class DinosaurCareSystem {
    private Random random=new Random();
    public void handleDinosaurHealth() throws DinosaurIllException{
        int healthStatus=random.nextInt(2);
        if (healthStatus==0){
            throw  new DinosaurIllException("Dinozavr kassalandi");
        }else {
            System.out.println("Dino soglom ");
        }
    }
    public void handleSecurity() throws EnclosureBreachedException {
        int securityStatus=random.nextInt(3);
        if (securityStatus==0){
            throw  new EnclosureBreachedException("Yashash joyi buzildi");
        }else {
            System.out.println("yasahsh joyi xavsiz");
        }
    }
}
