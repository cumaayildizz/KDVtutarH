package Giris;

import java.util.Scanner;

public class uceVeDordeTamBolunmeSarti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number,counter=0;   //counter aritmetik ort. bulmak için kullanılacak sayaç
        int total;  total=0;


        System.out.println();
        System.out.print("Lütfen bir sayı giriniz: ");
        number=input.nextInt();


        if(number>=0)
        {
            System.out.println("3'e ve 4'e tam bölünen sayılar:");

            for(int i=1;i<=number;i++)
            {
                if(i%3==0 && i%4==0)
                {
                    total+=i;
                    System.out.print(i+"-");
                    counter++;  //3 v3 4e bölünen sayılar döngüye girdikçe sayaç da 1 er 1 er artar.

                }

            }

            double ort;           // ortalamayı bulmak için bir değişken atadım.
            ort=total/counter;    // Toplam bölü işlemin dönme miktarı(sayaç) biz ort verir.

            System.out.println();
            System.out.println("3'e ve 4'e tam bölünen sayıoların toplamı: ");
            System.out.println();
            System.out.print("Toplam: "+ total);
            System.out.println();
            System.out.print("Ortalama: "+ort);


        }

        else
        {
            System.out.println("Lütfen pozitif tam sayı giriniz!!");
        }



    }

}









