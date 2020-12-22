package day01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
         java.util.ArrayList<String> adu=  new ArrayList<String> ();
         Emp eric = new Emp();
         eric.name = "Eric";
         eric.age = 24;
         eric.gender = '男';
         eric.salary = 4500;
         eric.printInfo();

         //Emp mgr = eric;
         //Emp mgr = new Emp();
         Emp mgr = null;
         eric.age += 1;
         System.out.println(mgr.age);

         mgr.salary += 2000;
         System.out.println(eric.salary);

    }
}
