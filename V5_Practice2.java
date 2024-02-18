import java.util.Scanner;
public class V5_Practice2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1. Expression
        // float a = 7 / 4 * 9 / 2; //4.0
        // float a = 7 / 4.0f * 9 / 2.0f; // 7.875
        // System.out.println(a);

        // Encrypt and Decrypt
        // System.out.println("Enter your Grade");
        // char grade = B;
        // grade = (char)(grade+ 8);s
        // System.out.println(grade);
        // grade = (char)(grade- 8);
        // System.out.println(grade);

        // 3. Comparision
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(num > 13);
    }
}
