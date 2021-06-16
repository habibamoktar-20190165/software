package com.company;


import java.util.Scanner;
/**
 * this is e wallet  class aggregate from player and owner
 * its important to transfer money from player to owner and adding money
 * showing balance
 * @author basmala Mostafa
 * @version 1.0
 * @since 11 November 2021
 */
public class Ewallet {
    private double balance;
    private double amount;

    public Ewallet(){
        balance=0.0;
        amount=0.0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    /**
     *
     * @return amount
     */
    public double getAmount() {
        return amount;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * showing your balance after the withdraw
     * @param money
     * @return  balance
     */
    public void withdraw(double money){
        if(balance<money){
            System.out.println("Your Balance isn't Enough");
        }
        else{
            balance=balance-money;
            System.out.println("Your balance now="+balance);
        }
    }
    /**
     * showing your balance after the deposit
     * @param money
     * @return  balance
     */
    public void deposit(double money){
        balance=balance+money;
        System.out.println("Your balance now="+balance);

    }
    /**
     * check money in e wallet
     * @param id
     * @return
     */
   public void checkMyBalance(long id){
        System.out.println("Your balance is: "+balance);
    }
    /**
     * player transfer money to owner
     * @param money
     */
    public void transferMoney(double money){
            System.out.println("Enter your ID and your e-mail,please:");
        Scanner input=new Scanner(System.in);
        long id=input.nextLong();
        String email=input.next();
        balance=balance-money;

        System.out.println("Your Balance now is: "+balance);
    }

}
