package com.lambton;

public class CollegeExample {
    public static void main(String[] args)
    {
     /* ArithmaticClass a1=new ArithmaticClass();
      System.out.println("the sum is:" +a1.add(10,20));
        System.out.println("substraction: " +a1.sub(29,5));
        System.out.println("multiplication: " +a1.mul(10,6));
        System.out.println("division: " +a1.div(35,2));
        System.out.println("mod: " +a1.mod(29,2));*/

        Student s1=new Student();
        int marks[]={90,89,98,78,88};
         s1.setStudentId(1);
         s1.setFirstName("Ankita");
         s1.setLastName("Jain");
         s1.setMarks1(50);
         s1.setMarks2(75);
         s1.setMarks3(80);
         s1.setMarks4(40);
         s1.setMarks5(54);
         s1.calculateTotal();
         s1.calculatePercentage();
         s1.generateResult();
         System.out.println("Student id is: " +s1.getStudentId());
         System.out.println("Student firstname is: " +s1.getFirstName());
         System.out.println("Student lastname is: " +s1.getLastName());
         System.out.println("Student fullname is: " +s1.getFullName());
         System.out.println("the total marks are:" +s1.getTotal());
         System.out.println("the percentage is:" +s1.getPercentage());

         System.out.println("the grade is:" +s1.getResult());


    }
}
