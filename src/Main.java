import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 1 to display a message" );
        System.out.println("Enter 3 to check two strings are equal or not");
        System.out.println("Enter 4 to toss the coin ");
        System.out.println("Enter 5 to check the leap year");
        System.out.println("Enter 6 to see pow 2 ");
        System.out.println("Enter 7 to check rectangle ");
        System.out.println("Enter 8 to get Sudent details ");
        System.out.println(" ");
        System.out.println("The choice is : ");

        int n= inp.nextInt();
        System.out.print("");
//        System.out.print(n);
        if (n==1){
            Display p = new Display();
            p.displayMessage();
        }
//        else if (n==2) {
//            D1p2 p =new D1p2();
//            p.defaultPrimitveDataTypeValues();
//
//        }
        else if (n==3){

            D1p3 p = new D1p3();
            p.checkTwoStringEqual();
        }
        else if (n==4)
        {
            D1p4 p= new D1p4();
            p.coinFlipPercentage();
        }
        else if (n==5)
        {
            D1q5 p= new D1q5();
            p.leapYear();
        }
        else if (n==6)
        {
            D1q6 p= new D1q6();
            p.powerof2();
        }
        else if (n==7)
        {
//            Scanner inp =new Scanner(System.in);
            System.out.print("Enter the length of the rectangle : ");
            float length = inp.nextFloat();
            System.out.println();
            System.out.print("Enter the breadth of the rectangle :");
            float breadth = inp.nextFloat();
            Rectangle r =new Rectangle(length,breadth);
            float area=r.areaRectangle();
            float perimeter=r.perimeterRectangle();
            System.out.println("The Area of the rectangle is : "+ area);
            System.out.println("The perimeter of the rectangle is "+ perimeter);
        }
        else if (n==8)
        {
            Student p = new Student();
            int a;
            String b;

            System.out.println("Enter the name of student ID : ");
            a=inp.nextInt();
            p.setStudentId(a);

            System.out.println("Enter the name of the student : ");
            b=inp.next();
            System.out.println("Name: "+b);
            p.setName(b);

            System.out.println("Enter the age of the student : ");
            a=inp.nextInt();
            p.setAge(a);

            System.out.println("Enter the grade of the student: ");
            b=inp.next();
            p.setGrade(b);

            System.out.println();
            System.out.println("The details entered are :");

            System.out.print("ID of the Student :"+ p.getStudentId()+"\n");
//            System.out.println();
            System.out.print("Name of the Stuent :"+ p.getName()+"\n");
            System.out.print("Age of the Student :"+ p.getAge()+"\n");
            System.out.print("Grade of the student:"+p.getGrade()+"\n");



        }
        else {
            System.out.println("Try again");
        }

    }
}
