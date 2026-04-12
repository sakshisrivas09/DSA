package OOPS;

import java.util.Scanner;

public class UserDefinedDatatype {
    public static class Student{

        String name;
        int rno;
        double cgpa;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Sakshi";
        s1.rno = 23;
        s1.cgpa = 7.5;

        Student s2 = new Student();
        s2.name = "div";
        s2.rno = sc.nextInt();


        System.out.println(s1.name+" "+s1.rno);
        System.out.println(s2.rno);
    }



    }

