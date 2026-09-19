package com.shanawaj.basiccrud;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Student {

 String name;
 Integer age;
 Integer marks;
 Student(String name,Integer age,Integer marks){
  this.name=name;
  this.age=age;
  this.marks=marks;
 }

 Student(String name){
  this.name = name;
 }

 Student(Integer marks,Integer age){
  this.marks=marks;
  this.age=age;
 }

 int getmarks(){
   return marks;
 }

 int getage(){
  return age;
 }


 int getdetails(){
  System.out.println(name+" "+age+" "+marks+" ");
  return 0;
 }

}
