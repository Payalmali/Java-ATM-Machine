/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaatm;

import java.util.Scanner;

public class JavaATMM {
    float Balance;
    int PIN =2222;
    Scanner sc=new Scanner(System.in);
    public void checkpin(){
        System.out.println("Entered your pin: ");
//        Scanner sc=new Scanner(System.in);
        int enterdpin = sc.nextInt();
        if(enterdpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a Valid Pin :");
           int value = sc.nextInt();
           enteredPin(value);
           
        }
    }
    public void enteredPin(int value){
        if(value==PIN){
            menu();
        }
    }
    
    public void menu(){
        System.out.println("Enter Your Choice :");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
//        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();
        switch(opt){
            case 1:
                checkBalance();
            case 2:
                withDrawMoney();
            case 3:
                depositMoney();
            case 4:
                return;
        }       
    }
    
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withDrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
//        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance =Balance-amount;
            System.out.println("Money Withdrawl Successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount: ");
//        Scanner sc=new Scanner(System.in);
        float amt=sc.nextFloat();
        Balance=Balance + amt;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}
