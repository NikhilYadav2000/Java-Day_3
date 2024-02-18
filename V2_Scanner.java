// import java.util.Scanner;

// public class V2_Scanner {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num 1");
//         int a = sc.nextInt();
//         System.out.println("Enter num 2");
//         int b = sc.nextInt();
//         System.out.println("Sum is ");
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }
/*
 * Enter num 1
 * 13
 * Enter num 2
 * 10
 * Sum is
 * 23
 */

// import java.util.Scanner;

// public class V2_Scanner {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         boolean b = sc.hasNextInt(); // checks whether a number is int or not
//         System.out.println(b);
//     }
// }
/*
 * 45 is true
 * 45.0 is false
 * Nikhil is false
 */

// import java.util.Scanner;

// public class V2_Scanner {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter then String");
//         String str = sc.next(); // takes just one word from the sentence
//         System.out.println(str);
//     }
// }
/*
 * Enter then String
 * Nikhil
 * Nikhil
 * 
 * 
 * Enter then String
 * NIkhil is a good boy
 * NIkhil
 * 
 */

import java.util.Scanner;

public class V2_Scanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then String");
        String str = sc.nextLine(); // takesthe entire line
        System.out.println(str);
    }
}
/*
 * Enter then String
 * Nikhil is amazing
 * Nikhil is amazing
 * 
 */