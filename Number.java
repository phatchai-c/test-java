import java.util.Scanner;
public class AddTwoNumbers2 {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = kb.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = kb.nextInt();
        
        kb.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}

