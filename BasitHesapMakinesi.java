package Giris;
import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

        double n1,n2,result;       int select;

        Scanner inp=new Scanner(System.in);

        System.out.println("Cuma YILDIZ basit hesap makinesine Hoş Geldiniz");

        System.out.println("Lütfen sayı giriniz");

        System.out.print("1.Sayı: ");
        n1= inp.nextDouble();

        System.out.print("1.Sayı: ");
        n2=inp.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1.(+)   2.(-)   3.(x)   4.(/)");
        select= inp.nextInt();
        switch (select) {
            case 1:
                result=(n1+n2);
                System.out.println("Sonuç: "+result);
                        break;
            case 2:
                result=(n1-n2);
                System.out.println("Sonuç: "+result);
                break;

            case 3:
                result=(n1*n2);
                System.out.println("Sonuç: "+result);
                break;
            case 4:
                result=(n1/n2);
                if(n2==0){ System.out.println("Sayı 0'a bölünemez.Tanımsız ifade.");}
                System.out.println("Sonuç: "+result);
                break;

            default:
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz!");
                break;

        }

        System.out.println();
        System.out.println("Başka bir işlemde görüşmek üzere...");
    }
}
