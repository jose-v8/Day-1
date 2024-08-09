import java.util.Scanner;
import java.util.Random;

public class D1p4 {
    void coinFlipPercentage()
    {
        int tc=0;
        int hc=0;
        System.out.print("Enter the number of times for the coin flip : ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for(int i=0;i<n;i++)
        {
//            System.out.println("ajkdflahdlfkh");
            double a;
            a=  Math.random();
            if (a<0.5)
            {
                tc+=1;
                System.out.println(" Try "+ (i+1) + " result : Tails");
            }
            else
            {
                hc+=1;
                System.out.println(" Try "+ (i+1) + " result : Heads");

            }


        }
//        System.out.println("value of hc "+ hc);
//        System.out.println("value of n "+ n);
        System.out.println(" Percentage of Heads is :"+((double)hc/n)*100 +"%");
        System.out.println(" Percentage of Heads is :"+((double)tc/n)*100 +"%");






    }

}
