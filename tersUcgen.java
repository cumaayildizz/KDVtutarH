package Giris;

import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println();
        System.out.println("***TERS ÜÇGEN YAPIMI***");
        System.out.println();
        System.out.println("Oluşturulacak üçgenin satır sayısını giriniz");
        System.out.print("Satır sayısı:");
        n = input.nextInt();

        if (n>=0){

            for(int i=1; i<=n; i++){
                for(int j=1; j<=(i-1); j++){
                    System.out.print(" ");
                }

                int b = (n+1)-i;
                for(int k=1; k<=(2*b-1); k++){
                    System.out.print("*");
                }
                System.out.println();


            }

        }
        else {
            System.out.println("Lütfen POZİTİF TAM SAYI giriniz");
        }


    }

}

