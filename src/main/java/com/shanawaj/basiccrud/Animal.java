package com.shanawaj.basiccrud;

public class Animal {
    String eat;
    String sound;

    Animal(String eat,String sound){
        this.eat = eat;
        this.sound = sound;
    }

   public String getdeatils(){
        System.out.println(" "+eat+"\n"+sound);
       return "";
   }
    void eat() {
        System.out.println("Animal is eating");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}
 class Dog extends Animal{
    Dog(String eat,String sound){
        super(eat,sound);
        this.eat = eat;
        this.sound=sound;
    }
    String getdogdeatils(){
        return ""+eat+"\n"+sound;
    }

    @Override
     void eat(){
        System.out.println("Dog is eating");
    }
    void sound(){
        System.out.println("Dog makes a sound");
    }


}
