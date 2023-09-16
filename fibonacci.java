package Giris;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c,n;

        System.out.println("****FİBONACCİ SERİSİ****");
        System.out.println();
        System.out.println("Fibonacci sayısının ilk N rakamını yazdırınız");
        System.out.println();
        // 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 - kendinden bir önceki ile toplanır

        System.out.println("Fibonacci sayısının kaç basamağını görmek istersiniz?");
        System.out.print("Basamak sayısı: ");
        n=input.nextInt();


        a=1;
        b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=1;i<=(n-2);i++) // Fibonacci serisinin ilk iki elemanı direkt oalrak yazdırıldığıdan döngü     için 13 eleman daha gerekmektedir

        {
            c=a+b;  // c değeri bulunduktan sonra her bir adım için döngü bir adım ileri kayar
            a=b; // yani a->b ye b->c ye dönüşerek tekrar döngüye girer
            b=c;
            System.out.println(c);
        }
        System.out.println();
        System.out.println("FINISH");

    }
}
