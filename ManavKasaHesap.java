package Giris;
import java.util.Scanner;

public class ManavKasaHesap {
    public static void main(String[] args) {

        double elmakg=3.67,armutkg=2.14,domateskg=1.11,muzkg=0.95,patlicankg=5.00;
        double elma,armut,domates,patlican,muz;
        double total;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen aldğınız elma(kg) ağırlığını giriniz: ");
        elma=input.nextDouble();
        System.out.print("Lütfen aldğınız armut(kg) ağırlığını giriniz: ");
        armut=input.nextDouble();
        System.out.print("Lütfen aldğınız domates(kg) ağırlığını giriniz: ");
        domates=input.nextDouble();
        System.out.print("Lütfen aldğınız muz(kg) ağırlığını giriniz: ");
        muz=input.nextDouble();
        System.out.print("Lütfen aldğınız patlıcan(kg) ağırlığını giriniz: ");
        patlican=input.nextDouble();

        total=(elma*elmakg)+(armut*armutkg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);


        System.out.println("Toplam tutar: "+total);




    }
}
