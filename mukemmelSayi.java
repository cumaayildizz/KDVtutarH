package Giris;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,total=0;

        System.out.println();
        System.out.println("***MÜKEMMEL SAYI BULMA PROGRAMI");
        System.out.println();
        System.out.print("Bir sayı giriniz: ");
        n=input.nextInt();
        System.out.println();

        if(n>0){

            for (int i=1; i<n; i++){
                if (n%i==0){
                    total+=i;
                }
            }

            if(total==n)
            {System.out.println("Bu bir MÜKEMMEL SAYIdır");
            }
            else {
                System.out.println("Bu bir Mükemmel sayı DEĞİLDİR");
            }
        }
        else {System.out.println("Lütfen POZİTİF TAM SAYI giriniz!!");}

    }
}
