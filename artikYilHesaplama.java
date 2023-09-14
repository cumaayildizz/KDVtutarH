package Giris;
import java.time.Year;
import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {


        int year,mod1,mod2,mod3;

        Scanner input =new Scanner(System.in);

        System.out.println();
        System.out.println("***ARTIK YIL HESAPLAMA***");
        System.out.println();
        System.out.println();

        System.out.println("Lütfen bir tarih giriniz");
        System.out.println();

        System.out.print("Tarih: ");
        year=input.nextInt();

        mod1=year%4;  mod2=year%400;  mod3=year%100;

        if (mod1==0 )
        {
            if (mod3==0 && mod2==0)
            {
               System.out.println(year+"yılı bir artık yıldır.");
            }
            else if (mod3==0 && mod2!=0)
            {
                System.out.println(year+"yılı bir artık yıl DEĞİLDİR.");
            }
            else
            {
                System.out.println(year+"yılı bir artık yıldır.");
            }

        }

        else
        {
            System.out.println(year+"yılı bir artık yıl DEĞİLDİR.");
        }





    }
}
