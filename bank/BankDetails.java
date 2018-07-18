
package com.niit.bank;


public class BankDetails {
    int flag=-1;
    Double balance;
    public BankDetails(Double balance){
        this.balance=balance;
    }
    //for checking successive transactions
     public void withdrawl(int withdraw_balance)
     {
        double amount_deduct=0;
          if(flag==1){
              amount_deduct=(0.004*withdraw_balance+withdraw_balance);
             balance=balance-amount_deduct; //for 2nd case of withdrawal
           
             
          }
          else{
            // amount_deduct=(0.005*withdraw_balance+withdraw_balance);
          balance=balance-(0.005*withdraw_balance+withdraw_balance);//for 1st case of withdrawal
         
          }
          flag=0;
          
         }
   public void deposit(int deposit_balance)
   {
      double amount_added=0;
      if(flag==0)  {
          amount_added=(0.002*deposit_balance+deposit_balance);
      balance=balance+amount_added;//for 2nd case of deposit
     }
      else {
          amount_added=(0.0025*deposit_balance+deposit_balance);
       balance=balance+amount_added;//for 1st case of deposit
       
      }
      flag=1;
    
   }

 public void display(){
 System.out.println("Total balance"+balance);}
}

