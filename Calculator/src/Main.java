import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //Reading system input
          // get user in number
        System.out.println("Birinchi raqamni kiriting");
        double firstNumber =scanner.nextDouble();

        System.out.println("Ikkinchi raqamni kiriting");
        double secondNumber =scanner.nextDouble();

        System.out.println("Amalni tanlang (+,-,*,/): ");
        char operation =scanner.next().charAt(0);

        double result;

        switch (operation){
            case '+':
                result=firstNumber+secondNumber;
                System.out.println("Natija: "+result);
                break;
            case '-':
                result=firstNumber-secondNumber;
                System.out.println("Natija: "+result);
                break;
            case '*':
                result=firstNumber*secondNumber;
                System.out.println("Natija: "+result);
                break;
            case '/':
                if (secondNumber!=0){
                    result=firstNumber/secondNumber;
                    System.out.println("Natija: "+result);
                }else{
                    System.out.println("Nolga bolish mumkin emas");
                }
                break;
            default:
                System.out.println("Notug'ri amal kiritildi");

        }
        scanner.close();

    }
}