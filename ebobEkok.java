package Giris;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,n2;
        int ebob=1,ekok=1;
        int i=1;

        System.out.println("***GİRİLEN İKİ SAYININ EBOB ve EKOK DEĞERLERİNİ BULMA***");
        System.out.println();
        System.out.print("1.Sayı: ");
        n1=input.nextInt();
        System.out.print("2.Sayı: ");
        n2=input.nextInt();
        System.out.println();

        if(n1>=0 && n2>=0){

            while(i<=n1 && i<=n2){
                i++;
                if(n1%i==0 & n2%i==0){
                    ebob=i;
                }
            }
            System.out.println("EBOB: "+ ebob);

            while (i<=(n1*n2)){
                if (i%n1==0 & i%n2==0){
                    ekok=i;
                    break;
                }
                i++;
            }
            System.out.println("EKOK: "+ ekok);

        }

        else {
            System.out.println("Hatalı sayı girişi.Lütfen POZİTİF TAM SAYI giriniz.");

        }








    }
}
