package com.shanawaj.basiccrud;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> student = new HashMap<>();
        student.put("shanawaj",85);
        student.put("tirumala",80);
        student.put("varun",75);
        student.put("venu",70);

        System.out.println(student.get("shanawaj"));

        student.put("shanawaj",90);

            System.out.println(student.get("shanawaj"));
        student.remove("shanawaj");
        System.out.println(student.get("shanawaj"));


        for(String key : student.keySet()){
            System.out.println(student.get(key));
        }

    }
}
