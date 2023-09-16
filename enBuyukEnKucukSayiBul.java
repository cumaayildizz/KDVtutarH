package Giris;

import java.util.Scanner;

public class enBuyukEnKucukSayiBul {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,r,enBuyuk,enKucuk;
        enBuyuk=0;  enKucuk=0;

        System.out.println();
        System.out.println("***KLAVYEDEN GİRİLEN n'TANE SAYIDAN EN BÜYÜK VE EN KÜĞÜNÜ BUL***");
        System.out.println();
        System.out.println("Kaç sayı girmek istersiniz?");
        System.out.print("Girilecek sayı sayısı: ");
        n=input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i+".Sayı: ");
            r=input.nextInt();
            if (i==1) {enBuyuk=r; enKucuk=r; }
            else{
                if(enBuyuk<r) {enBuyuk=r;}
                else if(enKucuk>r) {enKucuk=r;}
            }
        }
        System.out.println();
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);





    }
}
