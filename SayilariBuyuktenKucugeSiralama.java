package Giris;
import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {

        int x,y,z;
        Scanner inp=new Scanner(System.in);

        System.out.println();
        System.out.println("***SAYILARI BÜYÜKTEN KÜÇÜĞE SIRALAMA***");
        System.out.println();

        System.out.println("1.Sayı: ");
        x=inp.nextInt();

        System.out.println("2.Sayı: ");
        y=inp.nextInt();

        System.out.println("3.Sayı: ");
        z=inp.nextInt();
        System.out.println();

        if(x>y && x>z && z>y)
        {
            System.out.println("1.sayı>2.say>3.sayı");
        }
        else if(x>y && x>z && z>y)
        {
            System.out.println("1.sayı>3.say>2.sayı");
        }
        else if(y>x && y>z && x>z)
        {
            System.out.println("2.sayı>1.say>3.sayı");
        }
        else if(y>x && y>z && z>x)
        {
            System.out.println("2.sayı>3.say>1.sayı");
        }
        else if(z>y && z>x && x>y)
        {
            System.out.println("3.sayı>1.say>2.sayı");
        }
        else if(z>y && z>x && y>x)
        {
            System.out.println("3.sayı>2.say>1.sayı");
        }
        else
        {
            System.out.println("HATALI GİRİŞ YAPTINIZ!!");
        }



    }
}
