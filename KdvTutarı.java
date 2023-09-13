package Giris;
import java.util.Scanner;


public class KdvTutarı {
    public static void main(String[] args) {

        double ilkTutar, SonTutar, Kdv8, Kdv18;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen alışveriş Tutarınızı giriniz: ");
        ilkTutar = input.nextDouble();
        System.out.println("KDVsiz ürün Tutarı: " + ilkTutar);


        if (1000 >= ilkTutar)
        {
            Kdv18 = ilkTutar * (0.18);
            SonTutar = ilkTutar + Kdv18;
            System.out.println("Uygulanan KDV MİKTARI %8");

            System.out.println("TUTAR: " + SonTutar);
        }
        else if (1000.0 < ilkTutar)
        {
            Kdv8 = ilkTutar * (0.08);
            SonTutar = ilkTutar + Kdv8;
            System.out.println("Uygulanan KDV MİKTARI %8");

            System.out.println("TUTAR: " + SonTutar);
        }
        else if (0 > ilkTutar)
        {
            System.out.println("Hatalı Giriş Yaptnız. Lütfen Tekrar Deneyiniz!");


        }
        else
        {
            System.out.println("Lütfen Bir Sayı Giriniz!");

        }
    }
}
