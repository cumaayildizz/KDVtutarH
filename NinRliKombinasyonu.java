package Giris;

import java.util.Scanner;

public class NinRliKombinasyonu {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n,r;
        int faktoryelN=1,faktoryelR=1, faktoryelFark=1;
        double kombinasyon=1;                  //kombinasyon ve faktöriyeli tanımlayabilmek için değer atadık

        System.out.println();
        System.out.println("****N'in R'li KOMBİNASYONU*****");
        System.out.println();

        System.out.print("n değerini girin: ");
        n=input.nextInt();

        System.out.println();

        System.out.print("r değerini girin: ");
        r=input.nextInt();
        //n ve r değerlerimizi kullanıcıdan istedik

        System.out.println();

        if(n>0 && r>0 && n>r){

            for (int i=1;i<=n;i++){
                faktoryelN*=i;
            }

            System.out.print("n!= "+ faktoryelN);

            System.out.println();

            for (int i=1;i<=r;i++){
                faktoryelR*=i;
            }

            System.out.print("r!= " + faktoryelR);

            System.out.println();

            int fark;
            fark=n-r;

            for (int i=1;i<=fark;i++){
                faktoryelFark*=i;
            }

            System.out.print( "(n-r)!= " + faktoryelFark);
            System.out.println();

            kombinasyon=(faktoryelN/(faktoryelR*faktoryelFark));

            System.out.println();
            System.out.print("(n,r)!= "+kombinasyon);


        }

        else {
            System.out.println("Hatalı giriş!!");
        }



    }
}
