import java.util.Scanner;
public class D1q6 {
    void powerof2()
    {
        int n=-1;
        boolean a= true;

        while(a)
        {
            System.out.print("Enter a integer >=0 and < 31 : ");
            Scanner inp = new Scanner(System.in);
            n= inp.nextInt();
            if (n<31 && n>=0)
            {
                break;
            }
            else
            {
                System.out.print("Check the input and enter input : ");
            }

        }
        for (int i=0;i<=n;i++)
        {
//            System.out.println("Value of 2^"+i+" is "+(int)Math.pow(2,i) +" is " + D1q5.leapYear((int)Math.pow(2,i)););
            System.out.print("Value of 2^"+i+" is "+(int)Math.pow(2,i) );
            D1q5.leapYear((int)Math.pow(2,i));
            System.out.println(" ");
        }
    }
}
