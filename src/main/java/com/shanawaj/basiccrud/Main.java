package com.shanawaj.basiccrud;


public class Main{
    static void main() {


Student s1=new Student("Shanawaj",20,600);
s1.getdetails();
s1.getage();
s1.getmarks();
Student s2 = new Student("chatgpt",1000000,999999);
s2.getdetails();
s2.getage();
s2.getmarks();

Student s3 = new Student("shanawaj",21,85);
s3.getdetails();
System.out.println(s3.getage()+""+s3.getmarks());

BankAccount b1 = new BankAccount(1234,129000);
b1.getaccountnumber();
Integer balance=b1.getBalance();
System.out.println(balance);
System.out.println(b1.deposit(0));
System.out.println(b1.withdraw(1129500));



BankAccount b2 = new BankAccount(45244,991230);
 System.out.println(b2.deposit(55500));
 System.out.println(b2.withdraw(172500));


    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
