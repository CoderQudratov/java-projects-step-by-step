import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Reading System varieable
        Scanner scanner = new Scanner(System.in);
        // reading number
        int inputNumber =scanner.nextInt();
        if (inputNumber%2 ==0){ //checking odd or even
            System.out.println(inputNumber+": is Even");
        }else {
            System.out.println(inputNumber+": is Odd");
        }
    }
}