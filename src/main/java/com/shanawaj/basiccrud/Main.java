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

Animal a1 = new Animal("animal eats shit","animal makes sound");
System.out.println(a1.getdeatils());
a1.eat();
a1.sound();

Dog d1 = new Dog("dogs are shit", "dogs bark");
System.out.println(d1.getdeatils());
d1.eat();
d1.sound();

Animal a2 = new Dog("dogs are very good","Dogs bark when they see someone else");
System.out.println(a2.getdeatils());
a2.eat();
a2.sound();

Payment p1 = new Upipayment();
Payment p2 = new Cardpayment();
p1.pay();
p2.pay();

    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
