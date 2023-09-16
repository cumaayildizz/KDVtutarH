package Giris;

import java.util.Scanner;

public class yildizlardanElmasOlusturma {
    public static void main(String[] args) {

       int numberLine;
        Scanner input= new Scanner(System.in);


        System.out.println("***YILDIZLARDAN ELMAS OLUŞTURMA***");
        System.out.println();
        System.out.println("Elmasınız kaç satırdan oluşsun?");
        System.out.print("SATIR SAYISI: ");
        numberLine=input.nextInt();

        int space=numberLine/2;
        int star=1;               //koşulda kullanabilmem için star ve space değişkenleri oluşturdum

       if(numberLine>0){

           for (int i=0; i<numberLine; i++ ){

               for (int j = 0; j < space ; j++) {
                   System.out.print(" ");
               }

               for (int k = 1; k <= star ; k++) {
                   System.out.print("*");
               }

               System.out.println();

               if (i<numberLine/2){
                   space--;
                   star+=2;
               }
               else {
                   space++;
                   star-=2;
               }
           }
       }

       else {

           System.out.println("HATALI SAYI GİRİŞİ!! LÜTFEN POZİTİF TAM SAYI GİRİNİZ");
       }


    }
}
