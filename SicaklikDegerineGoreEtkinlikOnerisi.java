package Giris;
import java.util.Scanner;

public class SicaklikDegerineGoreEtkinlikOnerisi {
    public static void main(String[] args) {

       int degree;
       
       Scanner inp=new Scanner(System.in);

        System.out.println(); //bosluk
        System.out.println("HOS GELDİZNİZ");
        System.out.println(); //bosluk
        
        System.out.println("Sıcaklık değerini giriniz:");
        degree= inp.nextInt();
        System.out.println(); //bosluk

        if (degree<-10)
        {
            System.out.println("Sıcaklık normalin altında.Lütfen dışarı çıkmayınız");
        }
        else if(degree<=5)
        {
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (degree>5 && degree<=10)
        {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (degree>10 && degree<=15)
        {
            System.out.println("Sinemaya gidebilirsiniz");
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else if (degree>25 && degree<50)
        {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
        else if (degree>50)
        {
            System.out.println("Sıcaklık normalin üstünde.Lütfen dışarı çıkmayınız");
        }
        else
        {
            System.out.println("HATALI SICAKLIK GİRİŞİ!!");
        }


    }
}
