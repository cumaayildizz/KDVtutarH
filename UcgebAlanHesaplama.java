package Giris;
import java.util.Scanner;

public class UcgebAlanHesaplama {
    public static void main(String[] args) {

        int k1,k2,k3,u,sayınınKaresi;
        double UcgenAlan;

        Scanner kenar=new Scanner(System.in);
        System.out.println("***ÜÇGENİN ÇEVRESİNİ HESAPLAYAN PROGRAM***");
        System.out.println("Lütfen alanı hesaplanacak üçgenin 1. kenar uzunluğunu giriniz");
        k1= kenar.nextInt();
        System.out.println("Lütfen alanı hesaplanacak üçgenin 2. kenar uzunluğunu giriniz");
        k2=kenar.nextInt();
        System.out.println("Lütfen alanı hesaplanacak üçgenin 1. kenar uzunluğunu giriniz");
        k3= kenar.nextInt();

        u=(k1+k2+k3)/2;
        sayınınKaresi=u*(u-k1)*(u-k2)*(u-k3);
        UcgenAlan=Math.sqrt(sayınınKaresi);

        System.out.print("Üçgenin Alanı: "+UcgenAlan);






    }
}
