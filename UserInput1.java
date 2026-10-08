// import java.util.*;

// public class UserInput1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value:");
        // byte b = sc.nextByte();
        // short s = sc.nextShort();
        // int i = sc.nextInt();
        // long l = sc.nextLong();
        // float f = sc.nextFloat();
        // double d = sc.nextDouble();
        // char c = sc.next().charAt(0);
//         System.out.println("Enter String");
//         String name = sc.next();
//         System.out.println(name);
//     }
// }





// import java.util.*;

// public class UserInput1 {
//     public static void main(String[] args) {
//        char ch = 'A';
//        int n = ch;
//        System.out.println(ch + 1);
//        System.out.println((char)110);

//     }

// }


// package JAVA;

// public class UserInput1 {
//     int instanceVar = 20;
//     static int staticVar = 30;

//     public void display() {
//         int localVar = 10;
//         System.out.println("local: " + localVar);
//         System.out.println("Instance: " + instanceVar);
//         System.out.println("Static: " + staticVar);
//     }

//     public static void main(String[] args) {
//         UserInput1 obj = new UserInput1();
//         obj.display();
//     }
// }





// public class UserInput1 {
//     static void main() {
//         // arithmetic operators
//         int a = 5; int b = 10;
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(b/a);
//         System.out.println(a%b);
//     }
// }




// public class UserInput1 {
//     static void main() {
//         int a = 10;
//         int b = 20;
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }



// public class UserInput1 {
//     static void main() {
//         // arithmetic operators
//         int a = 20; int b = 40;
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(b/a);
//         System.out.println(a%b);
//     }
// }




// import java.util.Scanner;

// public class UserInput1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Age:");
//         int age = sc.nextInt();
//         if (age >= 18) {
//             System.out.println("adult");
//         }
//         if (age < 18) {
//             System.out.println("minor");
//         }
//         if (age >= 60) {
//             System.out.println("Can drive car");
//         }
//     }
// }


// import java.util.Scanner;

// public class UserInput1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Age:");
//         int age = sc.nextInt();
//         String s = (age > 18) ? "adult" : "minor";
//         System.out.println(s);
//         String b = (s=="adult") ? "Can drink" : "can't drink";
//         System.out.println(b);
//     }
// }





// public class UserInput1 {
//     public static void main(String[] args) {
        // double d = 1000000000;
        // float f = (float)d;
        // System.out.println(f);

        // char ch = 'A';
        // int n = ch;
        // System.out.println(n);

//         int a = 10084;
//         char ch = (char)a;
//         System.out.println(ch);
//     }
// }



// import java.util.Scanner;

// public class UserInput1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number:");
//         int num = sc.nextInt();

//         if ((num % 5) == 0) {
//             System.out.println("We are inside if block");
//             System.out.println("Given number is divisible by 5!!");
//         }

//         System.out.println("We are outside if block");

//     }
// }







// import java.util.Scanner;

// public class UserInput1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         int age = input.nextInt();
//         if (age>=18){
//             if (age <=60){
//                 System.out.println("Eligible for voting");
//             } else {
//                 System.out.println("Not Eligible for voting");
//             }

//         }
        

//     }
// }





// import java.util.Scanner;

// public class UserInput1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Marks:");
        
//         if (input.hasNextInt()) {
//             int marks = input.nextInt();
//             if (marks >= 90) {
//                 System.out.println("Excellent");
//             } else if (marks >= 80) {
//                 System.out.println("Good");
//             } else if (marks >= 70) {
//                 System.out.println("Average");
//             } else if (marks >= 60) {
//                 System.out.println("Below Average");
//             } else {
//                 System.out.println("Fail");
//             }
//         } else {
//             System.out.println("Invalid input. Please enter an integer value for marks.");
//         }
//     }
// }





// import java.util.Scanner;

// public class UserInput1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter total data plan (GB): ");
//         double totalData = sc.nextDouble();

//         System.out.print("Enter data used (GB): ");
//         double dataUsed = sc.nextDouble();

//         // Calculate remaining data
//         double remainingData = totalData - dataUsed;

//         System.out.println("Remaining Data: " + remainingData + " GB");

//         // Check conditions
//         if (remainingData <= 0) {
//             System.out.println("Data Exhausted");
//         } 
//         else if (remainingData <= 1) {
//             System.out.println("Low Data Alert");
//         } 
//         else if (dataUsed > 0.80 * totalData) {
//             System.out.println("High Usage Warning");
//         } 
//         else {
//             System.out.println("Usage Normal");
//         }

//         sc.close();
//     }
// }






import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
 }
}