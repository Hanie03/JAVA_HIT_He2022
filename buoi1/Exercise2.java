package buoi1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai 3 canh a, b, c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can");
            } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
                    || Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2)
                    || Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
            {
                System.out.println("Day la tam giac vuong");
            } else {
                System.out.println("Day la tam giac thuong");
            }
        } else {
            System.out.println("Ba canh a, b, c khong tao thanh tam giac");
        }

    }
}

