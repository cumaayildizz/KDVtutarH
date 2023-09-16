package Giris;

import java.util.Scanner;

public class tekSayiGirisi {
    public static void main(String[] args) {

        int k,total=0; //toplam değerini atayıp 0a eşitliyoruz

        Scanner input=new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz: ");
            k=input.nextInt();

            if (k%4==0){
                total+=k;

            }

        }while (k%2==0);

        System.out.println();
        System.out.print("Çift ve 4'ün katı olan sayılar TOPLAMI:");
        System.out.println();
        System.out.print("TOPLAM: "+total);

    }
}
