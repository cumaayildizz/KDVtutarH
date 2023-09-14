package Giris;
import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {

        int r;   double pi,a,alan;
        pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen dairenin yarıçaıpını giriniz:");
        r= input.nextInt();

        System.out.println("Lütfen daire diliminin açısını giriniz:");
        a=input.nextInt();

        alan=(r*r)*pi*(a/360);
        System.out.println("Daire Alan:"+alan);


    }

}
