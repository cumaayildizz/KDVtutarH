package Giris;

import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double withdrawal,deposit,balance,exit;
        int select;
        int right=3;
        String password,userName;
        balance=0;

        System.out.println("Enter your username and password");
        System.out.println();

        while (right>0){
        System.out.println("Username: ");
        userName=input.nextLine();
        System.out.println("Password: ");
        password=input.nextLine();

        if(userName.equals("spari") && password.equals("bigcoder123")){
            System.out.println("Login successful");
            System.out.println();
            System.out.println("WELCOME TO SPARİ BANK");
            System.out.println();

            System.out.println("Please press the action you want to perform");
            System.out.println("1) WITHDRAWAL\n" +
                    "2) DEPOSIT\n" +
                    "3) BALANCE INQUIRY\n" +
                    "4) EXIT\n");
            select=input.nextInt();

            System.out.println();

            switch (select){

                case 1:
                    System.out.println("Enter the amount you want to withdraw");
                    withdrawal=input.nextDouble();
                    if(balance>withdrawal){
                        balance-= withdrawal;
                        System.out.println("Available balance= " + balance);
                    }
                    else {
                        System.out.println("Insufficient balance");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit");
                    deposit=input.nextDouble();
                    balance+= deposit;
                    System.out.println("Balance= " + balance);
                    break;
                case 3:
                    System.out.println("Balance= " + balance);
                    break;
                case 4:
                    System.out.println("See you again");
                    break;

            }

        }
        else {
            --right;
            if (right==0){
                System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED. PLEASE CONTACT YOUR BANK");
            }
            else {
                System.out.println("Username or Password is wrong.Please try again!!");
                System.out.println("Remaining right:" + right);
            }
        }

        }


    }
}
