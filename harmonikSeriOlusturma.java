package Giris;

import javax.script.ScriptEngine;
import java.util.Scanner;

public class harmonikSeriOlusturma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        double total=0;

        System.out.println("****HARMONİK SERİ BULAN VE TOPLAYAN PROGRAM****");
        System.out.println();
        System.out.print("Sayı giriniz: ");
        number=input.nextInt();
        System.out.println();

        System.out.println("HARMONİK SERİ DİZİSİ:");

        for(int i=1; i<=number; i++){

            total+=(1.0/i);
            System.out.print(1 + "/" + i + "+" );
        }

        System.out.println();
        System.out.println("Sonuç: " + total);


    }
}
