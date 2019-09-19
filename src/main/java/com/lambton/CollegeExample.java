package com.lambton;

public class CollegeExample {
    public static void main(String[] args)
    {
      ArithmaticClass a1=new ArithmaticClass();
      System.out.println("the sum is:" +a1.add(10,20));
        System.out.println("substraction: " +a1.sub(29,5));
        System.out.println("multiplication: " +a1.mul(10,6));
        System.out.println("division: " +a1.div(35,2));
        System.out.println("mod: " +a1.mod(29,2));
    }
}
