package Giris;

import java.util.Scanner;

public class basamakSayisiniToplayanProgram {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number,numberCounter=0 ,numberDigits=0;
        int tempNumber;

        System.out.println("***BİR SAYININ BASAMAK SAYISININ TOPLAMINI VEREN PROGRAM***");
        System.out.println();

        System.out.print("Sayı giriniz: ");
        number=input.nextInt();

        tempNumber=number;

        while (tempNumber!=0){

            tempNumber/=10;
            numberCounter++; //sayaç görevi görüp basamak sayısını sayar
        }
        System.out.println();
        System.out.print("Bu sayının basamak sayısı: "+numberCounter);
        System.out.println();

        tempNumber=number;

        int stepValue=0;
        int tempmNumberDigits;
        tempmNumberDigits=numberDigits;  //başka bir döngüde kullanabilmek için geçici bir değer oluşturdum

        int total=0;
        while (tempNumber!=0){

            stepValue=tempNumber%10;
            tempNumber/=10;
            tempmNumberDigits ++;
            total+=stepValue;

            System.out.print(tempmNumberDigits + ". basamak=" + stepValue);
            System.out.println();

        }
        
        System.out.print("Yazılan sayının basamak değeri toplamı :" + total);
        System.out.println();

    }
}
