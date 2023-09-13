import java.util.Scanner;
public class NotOrtalaması {
    public static void main(String[] args) {

        int fizik,kimya,matematik,turkce,tarih,muzik;
        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen notlarınızı giriniz:");

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();
        System.out.print("Matematik notu: ");
        matematik=input.nextInt();
        System.out.print("Kimya notu: ");
        kimya=input.nextInt();
        System.out.print("Müzik notu: ");
        muzik=input.nextInt();
        System.out.print("Türkçe notu: ");
        turkce=input.nextInt();
        System.out.print("Tarih notu: ");
        tarih=input.nextInt();

        double ortalama;
        ortalama= (fizik+kimya+matematik+turkce+tarih+muzik)/6;

        System.out.println("Not ortalamanız: "+ortalama);

        /*
        String sonuc;
        sonuc=(ortalama>=60)? "GEÇTİNİZ":"KALDINIZ";
         */
        System.out.println("Geçtiyseniz TRUE,Kaldıysanız FALSE olarak görünecek");

        System.out.println("Herhangi bir rakama basınız");
        int x=input.nextInt();

        boolean sonuc= (ortalama>=60)? true:false;

        System.out.println(sonuc);








    }
}