package Giris;

import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {

        int n,r,total=1;
        //n ve r değerlerini kullanıcıdan alacağız.Sonuca da bir değer atayıp tanımsız olmasını engelledik.
        Scanner input=new Scanner(System.in);

        System.out.println();
        System.out.println("****GİRİLEN SAYININ ÜSSÜNÜ ALAN PROGRAM****");
        System.out.println();

        System.out.print("Üssü alınacak sayı: ");
        n=input.nextInt();

        System.out.println();

        System.out.print("Üs olacak sayı: ");
        r=input.nextInt();

        if(n>=0 && r>=0 ){

            if (n==0 && r==0){
                System.out.println(" 0^0 işlemi tanımsız");

            }

            else {

                for(int i=1; i<=r; i++){

                    total*=n;

                }
                System.out.println();
                System.out.print("Sonuç= " + total);
            }
        }


        else {

            System.out.println("LÜTFEN POZİTİF TAM SAYI GİRİNİZ!!");

        }
    }
}
