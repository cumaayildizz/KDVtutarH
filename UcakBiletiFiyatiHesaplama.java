package Giris;
import java.util.Scanner;


public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        int age,select;
        double distance,randTrip,oneWay,total,total2,ageDiscount1,ageDiscount2,araundDiscount;
        ageDiscount1=0.2;
        ageDiscount2=0.1;
        araundDiscount=0.15;




        Scanner input=new Scanner(System.in);
        System.out.println("***HOŞGELDİNİZ***");
        System.out.println();
        System.out.println("Lütfen aşağıda verilen bilgileri eksiksiz doldurunuz");
        System.out.println();

        System.out.print("Yaşınız: ");
        age=input.nextInt();



        System.out.println("Gidilecek mesafe(km cinsinden): ");
        distance=input.nextInt();


        total=distance*(0.10);
        total2=distance*(0.10)*2;


        System.out.println("Yolculuk tipini seçiniz(1'i ve ya 2'yi seçiniz) ");
        System.out.println("TEK YÖN (1)  -  GİDİŞ-DÖNÜŞ(2)");
        select=input.nextInt();
        System.out.println();


        if(age>5 && age<60)
        {
            switch (select)
            {
                case 1:
                    oneWay=total;
                    System.out.print("Bilet Fiyatı: "+oneWay + " TL");
                    break;
                case 2:
                    randTrip=total2-(total2*araundDiscount);
                    System.out.print("Bilet Fiyatı: "+randTrip + " TL");
                    break;

            }


        }


        else if(age<=5)
        {
            switch (select)
            {
                case 1:
                    oneWay = total-(total * ageDiscount1);
                    System.out.print("Bilet Fiyatı: " + oneWay + " TL");
                    break;
                case 2:
                    randTrip = total2-(total2 * ageDiscount1)-(total2*araundDiscount);
                    System.out.print("Bilet Fiyatı: " + randTrip + " TL");
                    break;

            }
        }

        else if(age>=60)
        {
            switch (select)
            {
                case 1:
                    oneWay=total-(total*ageDiscount2);
                    System.out.print("Bilet Fiyatı: "+oneWay +" TL");
                    break;
                case 2:
                    randTrip=total2-(total2*ageDiscount2)-(total2*araundDiscount);
                    System.out.print("Bilet Fiyatı: "+randTrip +" TL");
                    break;

            }

        }

        else
        {
            System.out.println("Eksik yada hatalı giriş yaptınız!! ");
        }








        }
}
