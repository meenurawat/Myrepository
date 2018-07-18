/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.niit.bank.BankDetails;

import java.util.*;
public class Accountdetails {
     public static void main(String[] args){
     char char1;//for continue yes or no
     Double balance;//availabl balance
     int withdraw_balance,deposit_balance;//input for withdraw and deposit amount
     BankDetails b=new BankDetails(100.00);
         BankDetails b1=new BankDetails(150.00);

    Scanner sc=  new Scanner(System.in);
    do
    {
    System.out.println("1. withdrawl");
    System.out.println("2. deposit");
    System.out.println("enter your choice");
    int ch=sc.nextInt();//variable for switch cases
    switch(ch)
    {
        case 1: System.out.println("enter withdrwal amount");
                 withdraw_balance=sc.nextInt();
                 b.withdrawl(withdraw_balance);//method for withdrawal in bankaccount
                break;
        case 2 :System.out.println("enter deposit amount"); 
                deposit_balance=sc.nextInt();
                b1.deposit(deposit_balance);//method for deposit in bankaccount
                break;
        
    }
    System.out.println("do you want to continue - y/n");
     char1=sc.next().charAt(0);
            }
    while(char1!='n');
   b.display();
    }

}
