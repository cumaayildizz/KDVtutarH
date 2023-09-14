package Giris;
import javax.script.ScriptEngine;
import java.util.Scanner;


public class BasitNotOrt {
    public static void main(String[] args) {

        double ort;
        int mat,fzk,kimya,muzik,turkce;

        Scanner input=new Scanner(System.in);

        System.out.println(); //satır aralığı oluşturma için yazıldı
        System.out.println(); //satır aralığı oluşturma için yazıldı

        System.out.println("***NOT ORTALAMA HSAPLAMA***");
        System.out.println(); //satır aralığı oluşturma için yazıldı
        System.out.println(); //satır aralığı oluşturma için yazıldı
        System.out.println("Lütfen notlarınızı giriniz");
        System.out.println(); //satır aralığı oluşturma için yazıldı


        System.out.print("Fizik: ");
        fzk=input.nextInt();

        System.out.print("Matematik: ");
        mat=input.nextInt();

        System.out.print("Kimya: ");
        kimya=input.nextInt();

        System.out.print("Türkçe: ");
        turkce=input.nextInt();

        System.out.print("Müzik: ");
        muzik=input.nextInt();

        System.out.println(); //satır aralığı oluşturma için yazıldı
        System.out.println(); //satır aralığı oluşturma için yazıldı

        ort=(mat+fzk+muzik+turkce+kimya)/5;
        System.out.println("Ortalamanız: "+ort);

        System.out.println(); //satır aralığı oluşturma için yazıldı
        System.out.println(); //satır aralığı oluşturma için yazıldı

        if (ort<=100 && ort>=55)
        {
            System.out.print("TEBRİKLER sınıfı geçtiniz");
        }
        else if (ort>=0 && ort<55)
        {
            System.out.print("SINIF TEKRARI!!");
        }
        else
        {
            System.out.print("HATALI GİRİŞ YAPTINIZ!!");
        }




    }
}
