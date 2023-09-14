package Giris;
import java.util.Scanner;


public class TaksiMetre {
    public static void main(String[] args) {

        int km,baslangicUcreti;
        double Kmucreti,toplam;  //perKm:Km başına demek
        baslangicUcreti=10;
        Kmucreti=2.20;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen gidilen  mesafeyi yaınız(km):");
        km= input.nextInt();

        toplam=(km*Kmucreti)+baslangicUcreti;
        toplam=(toplam<20)?20:toplam;


        System.out.print("Ödenecek tutar:" +toplam);








    }
}
