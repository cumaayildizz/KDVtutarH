package Giris;
import java.util.Scanner;


public class BurcBulmaProgramı {
    public static void main(String[] args) {

        int month,day;
        String burc="";

        boolean isERROR = false;

        Scanner input=new Scanner(System.in);

        System.out.println();
        System.out.println("***BURCUMU BUL***");
        System.out.println();

        System.out.println("Lütfen doğduğunuz ayı SAYI ile giriniz");
        System.out.println("Örnek: Ocak ayı=1, Şubat ayı=2 olacak şekilde");
        System.out.println();

        System.out.print("Doğduğunuz ay: ");
        month=input.nextInt();
        System.out.println();

        System.out.print("Doğduğunuz gün: ");
        day=input.nextInt();
        System.out.println();

        switch (month)
        {
            case 1:
                if (day>=1 && day<=31)
                {
                    if (day<22)
                         {burc="OĞLAK";}
                    else
                         {burc="KOVA";}

                }
                else  {isERROR=true;}

                break;


            case 2:
                if (day>=1 && day<=28)
                {
                    if (day<20)
                    {burc="KOVA";}
                    else
                    {burc="BALIK";}

                }
                else  {isERROR=true;}

                break;

            case 3:
                if (day>=1 && day<=31)
                {
                    if (day<21)
                    {burc="BALIK";}
                    else
                    {burc="KOÇ";}

                }
                else  {isERROR=true;}

                break;

            case 4:
                if (day>=1 && day<=30)
                {
                    if (day<21)
                    {burc="KOÇ";}
                    else
                    {burc="BOĞA";}

                }
                else  {isERROR=true;}

                break;

            case 5:
                if (day>=1 && day<=31)
                {
                    if (day<22)
                    {burc="BOĞA";}
                    else
                    {burc="İKİZLER";}

                }
                else  {isERROR=true;}

                break;

            case 6:
                if (day>=1 && day<=30)
                {
                    if (day<23)
                    {burc="İKİZLER";}
                    else
                    {burc="YENGEÇ";}

                }
                else  {isERROR=true;}

                break;

            case 7:
                if (day>=1 && day<=31)
                {
                    if (day<23)
                    {burc="YENGEÇ";}
                    else
                    {burc="ASLAN";}

                }
                else  {isERROR=true;}

                break;

            case 8:
                if (day>=1 && day<=31)
                {
                    if (day<23)
                    {burc="ASLAN";}
                    else
                    {burc="BAŞAK";}

                }
                else  {isERROR=true;}

                break;

            case 9:
                if (day>=1 && day<=30)
                {
                    if (day<23)
                    {burc="BAŞAK";}
                    else
                    {burc="TERAZİ";}

                }
                else  {isERROR=true;}

                break;

            case 10:
                if (day>=1 && day<=31)
                {
                    if (day<23)
                    {burc="TERAZİ";}
                    else
                    {burc="AKREP";}

                }
                else  {isERROR=true;}

                break;

            case 11:
                if (day>=1 && day<=30)
                {
                    if (day<22)
                    {burc="AKREP";}
                    else
                    {burc="YAY";}

                }
                else  {isERROR=true;}

                break;

            case 12:
                if (day>=1 && day<=31)
                {
                    if (day<22)
                    {burc="YAY";}
                    else
                    {burc="OĞLAK";}

                }
                else  {isERROR=true;}

                break;

            default:
            {
                isERROR=true;
            }

        }

        if (isERROR)
        {
            System.out.println("HATALI GİRİŞ YAPTINIZ!!");
        }
        else
        {
            System.out.println("Burcunuz: "+burc);
        }

        System.out.println();
        System.out.println("Tekrar kullanmak için programı yeniden başlatın");






    }
}
