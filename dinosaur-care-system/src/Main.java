import exception.DinosaurIllException;
import exception.EnclosureBreachedException;
import system.DinosaurCareSystem;

public class Main {
    public static void main(String[] args) {
        DinosaurCareSystem careSystem=new DinosaurCareSystem();
        try {
            careSystem.handleDinosaurHealth();

        } catch (DinosaurIllException e) {
            System.out.println("Xatolik"+e.getMessage());
        }
        try {
            careSystem.handleSecurity();
        } catch (EnclosureBreachedException e) {
            System.out.println("Xatolik"+e.getMessage());
        }
    }
}