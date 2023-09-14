package Giris;
import java.util.Scanner;


public class cinZodyagiHesaplama {
    public static void main(String[] args) {

        int year,mod;

        Scanner input=new Scanner(System.in);

        System.out.println();
        System.out.print("***ÇİN ZODYAĞI HESAPLAMA");
        System.out.println();

        System.out.println("Lütfen Doğum tarihinizi giriniz.");
        System.out.println();

        System.out.print("Doğum Tarihi: ");
        year=input.nextInt();

        System.out.println();

        mod=year%12;

        switch (mod)
        {
            case 0:
                System.out.println("MAYMUN yılında doğdunuz");
                break;

            case 1:
                System.out.println("HOROZ yılında doğdunuz");
                break;

            case 2:
                System.out.println("KÖPEK yılında doğdunuz");
                break;

            case 3:
                System.out.println("DOMUZ yılında doğdunuz");
                break;

            case 4:
                System.out.println("FARE yılında doğdunuz");
                break;

            case 5:
                System.out.println("ÖKÜZ yılında doğdunuz");
                break;

            case 6:
                System.out.println("KAPLAN yılında doğdunuz");
                break;

            case 7:
                System.out.println("TAVŞAN yılında doğdunuz");
                break;

            case 8:
                System.out.println("EJDERHA yılında doğdunuz");
                break;

            case 9:
                System.out.println("YILAN yılında doğdunuz");
                break;

            case 10:
                System.out.println("AT yılında doğdunuz");
                break;

            case 11:
                System.out.println("KOYUN yılında doğdunuz");
                break;

            default:
                System.out.println("Hatalı giriş yaptınız !!" );
                System.out.println("Lütfen pozitif tamsayı giriniz." );


        }



    }
}
