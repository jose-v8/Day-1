import javax.swing.*;
import java.util.Scanner;

 public class D1q5 {
    void leapYear()
    {
        int check=0;
        int n;
        boolean a;
        System.out.print("Enter a year make sure the year is above 1000 : ");
        Scanner inp =new Scanner(System.in);
        do
        {
            n= inp.nextInt();
            if (n/1000 >=1)
            {
                check=1;
            }
            else
            {
                System.out.print("Check the input and enter the year again :");
            }


        }while (check==0);

        System.out.println(" ");
         a = n%4==0 ? ( n%100==0 ? (n%400==0?true:false):true):false;

         if (a==true)
        {
            System.out.println("It is a leap Year");
        }
         else {
             System.out.println("It is not a leap year");
         }




    }
    static void leapYear(int n)
    {
        boolean a;
        a = n%4==0 ? ( n%100==0 ? (n%400==0?true:false):true):false;
        if (a==true)
        {
            System.out.println("  Which is a leap Year");
        }
        else {
            System.out.println("  Which is not a leap year");
        }

    }
}
