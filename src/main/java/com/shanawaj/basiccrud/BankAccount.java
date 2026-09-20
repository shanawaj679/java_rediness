package com.shanawaj.basiccrud;

public class BankAccount {
   private Integer accountnumber;
    private Integer balance;

    BankAccount(Integer accountnumber, Integer balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    Integer getaccountnumber() {
        return accountnumber;
    }
    Integer getBalance(){
        return balance;
    }
    Integer deposit(Integer amount){
        if(amount <= 0){
          System.out.println("Invalid amount");
          return 0;
        }
        this.balance = this.balance + amount;

        return balance;
    }
    Integer withdraw(Integer amount){
        if(this.balance <=amount){
            System.out.println("amount is greater than your savings");
            return 0;
        }
        this.balance = this.balance - amount;
        return balance;
    }
}

