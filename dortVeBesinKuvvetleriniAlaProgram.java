package Giris;

import java.util.Scanner;

public class dortVeBesinKuvvetleriniAlaProgram {
    public static void main(String[] args) {

        int n;

        Scanner input=new Scanner(System.in);

        System.out.println();
        System.out.println("****4 ve 5in KATLARINI BULAN PROGRAM****");
        System.out.println();

        System.out.print("Bir sayı giriniz: ");
        n=input.nextInt();

        if(n>=0){   //İlk önce pozitif sayı olma şartını oluşturduk

            System.out.println();
            System.out.println("4'ün kUVVETLERİ:");

            for (int i=1; i<=n; i*=4){    //sonrasında da dögü kullanarak kuvvet aldık
                System.out.print(i+"-");

            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("5'in kUVVETLERİ:");

            for (int i=1; i<=n; i*=5){
                System.out.print(i+"-");

            }

        }

        else {
            System.out.println("LÜTFEN POZİTİF TAM SAYI GİRİNİZ");
            //pozitif sayı girilmediğinde programı sonlandırdık.
        }



    }
}
