import java.util.Scanner;
public class V3_CalculatorExercise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 1st Subject");
        int sub1 = sc.nextInt();
        System.out.println("Enter Marks of 2nd Subject");
        int sub2 = sc.nextInt();
        System.out.println("Enter Marks of 3rd Subject");
        int sub3 = sc.nextInt();
        System.out.println("Enter Marks of 4th Subject");
        int sub4 = sc.nextInt();
        System.out.println("Enter Marks of 5th Subject");
        int sub5 = sc.nextInt();

        int per = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println(per);
    }
}
