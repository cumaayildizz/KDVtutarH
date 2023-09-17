package Giris;

import java.util.Scanner;

public class islemOnceligi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.println();
        System.out.print("Yapılacak işlem = ");
        System.out.print("(1.Sayı)+[(2.Sayı)*(3.Sayı)]-(2.Sayı)");
        System.out.println();
        System.out.println("İşlem yapılacak sayıları giriniz: ");
        System.out.println();

        System.out.print("1.Sayı: ");
        a = input.nextInt();

        System.out.print("2.Sayı: ");
        b = input.nextInt();

        System.out.print("3.Sayı: ");
        c = input.nextInt();

        int total;
        total= a+b*c-b;

        System.out.println();
        System.out.print("Sonuç: " + total);





    }
}
