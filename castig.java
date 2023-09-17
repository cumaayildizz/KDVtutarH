package Giris;

import java.util.Objects;
import java.util.Scanner;

public class castig {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int tamSayi;  double ondalikliSayi;

        System.out.print("Sayıları tersine çeviren program :)");
        System.out.println();

        System.out.print("TAM SAYI GİRİN:");
        tamSayi=input.nextInt();

        System.out.print("ONDALIKLI SAYI GİRİN:");
        ondalikliSayi =input.nextDouble();

        tamSayi= (int) ondalikliSayi;
        System.out.println("sonuç");
        System.out.print("tam sayı: "+tamSayi );
        System.out.println();
        ondalikliSayi=tamSayi;
        System.out.print("ondalıklı sayı: "+ondalikliSayi);






    }
}
