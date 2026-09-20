package com.shanawaj.basiccrud;

import java.util.ArrayList;

public class Array {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);

        numbers.add(2);

        numbers.add(3);

        numbers.add(4);

        numbers.add(5);

        for (int n =0; n<numbers.size();n++) {

            System.out.println(numbers.get(n));

        }

        ArrayList<String> names = new ArrayList<>();
        names.add("shanawaj");
        names.add("varun");
        names.add("tirumala");
        names.add("venu");

        for(int i = 0 ; i<names.size();i++){
            System.out.println(names.get(i));
            if(i==1){
                names.remove(i);
                names.add("rahul");
            }

        }

        for(String name : names){
            System.out.println(name);
        }
    }
}
