package Giris;
import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {

        double boy,index;    int kilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu 'm' cinsinde giriniz: ");
        boy= input.nextDouble();
        System.out.print("Lütfen kilonuzu 'kg' cinsinde giriniz: ");
        kilo=input.nextInt();

        index=kilo/(boy*boy);

        System.out.print("Vücut kitle indeksiniz:" + index);


    }
}
