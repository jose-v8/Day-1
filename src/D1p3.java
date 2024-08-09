import java.util.Scanner;

public class D1p3 {
    void checkTwoStringEqual()
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the First string  : ");
        String s1 = inp.nextLine();

        System.out.print("Enter the Second string : ");
        String s2= inp.nextLine();

        if (s1.equals(s2)){
            System.out.print("They are equal");
        }
        else {
            System.out.print("They are not equal");
        }
//
//        System.out.print(s1);
//        System.out.print(s2);
//        if (s1==s2){
//            System.out.print("Yes");
//
//        }
//        else {
//            System.out.print("No");
//        }



    }

}
