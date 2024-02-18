import java.util.Scanner;
public class V4_Practice1 {
    public static void main(String args[]){
        // 1. Sum of three numbers
        // int n1 = 13;
        // int n2 = 10;
        // int n3 = 23;
        // int sum = n1 + n2 + n3;
        // System.out.println(sum); // 46

        // 2. Calculate CGPA
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Marks 1");
        // float m1 = sc.nextFloat();
        // System.out.println("Enter Marks 2");
        // float m2 = sc.nextFloat();
        // System.out.println("Enter Marks 3");
        // float m3 = sc.nextFloat();

        // float CGPA = (float) (((m1+m2+m3)/3)/9.5);
        // System.out.println(CGPA);

        // 3. Greeting User
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Name");
        // String str = sc.next();
        // System.out.println("Hello " + str + " ,have a good day");

        // 4. Km to miles
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the distance in km");
        // float disInKm = sc.nextFloat();
        // float disInMiles = (float)(disInKm*0.621371);
        // System.out.println("The value in miles = " + disInMiles);
        // Enter the distance in km
        // 45
        // The value in miles = 27.961695

        // 5. Enter is int or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
