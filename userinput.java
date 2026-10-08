

import java.util.*;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);
        System.out.println("Enter String");
        String name = sc.next();
        System.out.println(name);
    }
}