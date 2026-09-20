package com.shanawaj.basiccrud;
import java.util.*;

public class DSA_array {
    public static void main(String[] args){
        //find max -min
        int number[] = {12, 5, 8, 20, 3, 3};


        Integer max = number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.println(max);

        Integer min = number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]<min){
                min = number[i];
            }
        }
        System.out.println(min);

        int first_max;
        int second_max;
        if(number[0]>number[1]){
            first_max = number[0];
            second_max = number[1];
        }
        else{
            first_max = number[1];
            second_max = number[0];
        }
        for(int i=0;i<number.length;i++){
            if(number[i]>first_max){
                second_max = first_max;
                first_max = number[i];
            }
            else if(number[i]>second_max){
                second_max = number[i];
            }

        }
        System.out.println(first_max +" \n"+second_max);


        int first_min;
        int second_min;
        if(number[0]<number[1]){
            first_min=number[0];
            second_min=number[1];
        }
        else{
            first_min=number[1];
            second_min=number[0];
        }

        for(int i : number){
            if(i<first_min){
                second_min = first_min;
                first_min = i;
            }
            else if(i>first_min && i<second_min){
                second_min = i;
            }


        }
        System.out.println(first_min +" \n"+second_min);

        int neg_num[] = {-10, -5, -20, -3};
        int neg_min=neg_num[0];
        int neg_max=neg_num[0];
        int neg_first_max=neg_num[0];
        int neg_second_max=neg_num[1];
        for(int i : neg_num){
            if(neg_max<i){
                neg_max = i;
            }
             if(neg_min>i){
                neg_min = i;
            }
        }
        System.out.println(neg_max +" \n"+neg_min);


        //find how many times a number occours

        int arr[] = {2, 4, 2, 7, 4, 2, 9};

        ArrayList<Integer> visited = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int occourance = arr[i];
            int count = 0;

            if (visited.contains(occourance)) {
                continue;
            }
            visited.add(arr[i]);

            for(int j=0; j<arr.length;j++){
                if(occourance == arr[j]) {
                    count += 1;
                }
            }
            System.out.println(occourance + "comes this many times  " + count);

        }

    }
}
