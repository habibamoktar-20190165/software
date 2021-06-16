package com.company;

import java.util.Scanner;
/**
 *
 *
 * @author basmala Mostafa
 * @version 1.0
 * @since 11 November 2021
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input =new Scanner(System.in);
        int choice1;
        int choice2;
        int choice3;
        int choice4;
        double mm;
        String location;
        double amount;
        Owner obj1;
        Playground obj2;
        Reservations obj3;
        Ewallet obj4=new Ewallet();
        Ewallet obj6=new Ewallet();
        Player obj5;
        String name,email;
        long ID,phone,password;
        int size,price;
        String name_playground;
        double available_hours;
        while(true){
            System.out.println("Welcome to our Playground :)");
            System.out.println("select one of the following choices ,please:");
            System.out.println("1-Register and Make account in our Playground");
            System.out.println("2-Exit");
            System.out.print("\n");
            choice1=input.nextInt();
            if(choice1==1) {
                while(true){
                    System.out.println("select one of the following choices ,please:");
                    System.out.println("1-Register as Owner");
                    System.out.println("2-Register as Player:");
                    System.out.println("3-Back");
                    System.out.print("\n");
                    choice2 = input.nextInt();
                    if (choice2 == 1) {
                        System.out.println("Enter your name,please:");
                        name = input.next();
                        System.out.println("Enter your email,please:");
                        email = input.next();
                        System.out.println("Enter your phone,please:");
                        phone = input.nextLong();
                        System.out.println("Enter your password,please:");
                        password = input.nextLong();
                        System.out.println("Enter your ID,please:");
                        ID = input.nextLong();
                        obj3 = new Reservations(name, email, phone, password, ID);
                        obj1 = new Owner(obj3);
                        System.out.println("Your Registration is Done successfully");

                        while (true) {
                            System.out.print("\n");
                            System.out.println("select one of the following choices ,please:");
                            System.out.println("1-Register a playground");
                            System.out.println("2-View all bookings in your playground");
                            System.out.println("3-Add money in your e-wallet");
                            System.out.println("4-Check your money in your E-wallet");
                            System.out.println("5-Withdraw money from my e-wallet");
                            System.out.println("6-Exit");
                            System.out.print("\n");
                            choice3 = input.nextInt();
                            if (choice3 == 6) {
                                break;
                            }
                            switch (choice3) {
                                case 1:
                                    System.out.println("Enter the location of your playground, please:");
                                    location = input.next();
                                    System.out.println("Enter the size of your playground, please:");
                                    size=input.nextInt();
                                    System.out.println("Enter the name of your playground, please:");
                                    name_playground=input.next();
                                    System.out.println("Enter the price per hour of your playground, please:");
                                    price=input.nextInt();
                                    System.out.println("Enter the available hours in your playground, please:");
                                    available_hours=input.nextDouble();
                                    obj2 = new Playground(location,size,name_playground,price,available_hours);
                                    System.out.println("Your Registration is Done successfully");
                                    break;
                                case 2:
                                    obj1.view_booking();
                                    break;
                                case 3:
                                    System.out.println("Enter the amount you need to add:");
                                    amount = input.nextDouble();
                                    obj4.deposit(amount);
                                    System.out.println("Your money is added successfully");
                                    break;
                                case 4:
                                    obj4.checkMyBalance(obj3.getID());
                                    break;
                                case 5:
                                    System.out.println("Enter the amount you need to withdraw,please:");
                                    amount = input.nextDouble();
                                    obj4.withdraw(amount);
                                    break;
                                default:
                                    System.out.println("Your choice is not available ,enter another one please");
                                    break;

                            }

                        }


                    } else if (choice2 == 2) {
                        System.out.println("Enter your name,please:");
                        name = input.next();
                        System.out.println("Enter your email,please:");
                        email = input.next();
                        System.out.println("Enter your phone,please:");
                        phone = input.nextLong();
                        System.out.println("Enter your password,please:");
                        password = input.nextLong();
                        System.out.println("Enter your ID,please:");
                        ID = input.nextLong();
                        obj3 = new Reservations(name, email, phone, password, ID);
                        obj5 = new Player(obj3);
                        System.out.println("Your Registration is Done successfully");
                        while (true) {
                            System.out.print("\n");
                            System.out.println("select one of the following choices ,please:");
                            System.out.println("1-Add money in your e-wallet");
                            System.out.println("2-Check your money in your E-wallet");
                            System.out.println("3-view all available times in the playground");
                            System.out.println("4-Book a slot in a playground");
                            System.out.println("5-withdraw money from my e-wallet");
                            System.out.println("6-Transfer money from your E-wallet to the playground");
                            System.out.println("7-Exit");
                            System.out.print("\n");
                            choice4 = input.nextInt();
                            if (choice4 == 7) {
                                break;
                            }
                            switch (choice4) {
                                case 1:
                                    System.out.println("Enter the amount you need to add:");
                                    amount = input.nextDouble();
                                    obj6.deposit(amount);
                                    System.out.println("Your money is added successfully");
                                    break;
                                case 2:
                                    obj6.checkMyBalance(obj3.getID());
                                    break;
                                case 3:
                                    obj2 = new Playground();
                                    obj2.showing_avahours();
                                    break;
                                case 4:
                                    obj5 = new Player();
                                    obj5.bookSlot();
                                    break;
                                case 5:
                                    System.out.println("Enter the amount you need to withdraw,please:");
                                    amount = input.nextDouble();
                                    obj6.withdraw(amount);
                                    break;
                                case 6:
                                    System.out.println("Enter the amount you need to transfer to the playground's owner,please:");
                                    amount = input.nextDouble();
                                    obj6.transferMoney(amount);
                                    System.out.println("Your amount is transferred successfully");
                                    break;
                                default:
                                    System.out.println("Not available choice ,please enter another one ....");

                            }
                        }
                    }
                    else if(choice2==3){
                        break;
                    }
                    else {
                        System.out.println("Not available choice ,enter another one ,please:");
                    }
                }

                }

            else if(choice1==2){
                break;
            }
            else{
                System.out.println("Not available choice ,enter another one ,please:");
            }

        }

    }
}
