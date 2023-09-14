package Giris;
import java.util.Scanner;


public class BasitKullaniciGirisi {
    public static void main(String[] args) {

        String userName,password;
        Scanner inp=new Scanner(System.in);


        System.out.println("KULLANICI ADI ve ŞİFRENİZİ giriniz: ");


        System.out.print("Kullanıcı Adı: ");
        userName=inp.nextLine();
        System.out.print("Şifre: ");
        password=inp.nextLine();


        if (userName.equals("Cuma") && password.equals("BigCoder"))
        {
            System.out.println("Giriş Başarılı");
        }
        else
        {
            System.out.println("Hatalı Giriş Yaptınız");
        }


    }
}
