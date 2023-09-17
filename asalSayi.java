package Giris;

import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("***ASAL SAYI BULMA PROGRAMI***");
        System.out.println();

        int sayac=0;

        for (int j=2; j<100; j++){

            for(int i=2; i<j; i++){

                    if(j%i!=0){
    
                        sayac++;

                            if(sayac==(j-2)){
                                System.out.print( j + " - ");
                                sayac=0;
                            }

                    }
                    else { sayac=0; break; }
            }

        }



    }

}
