package Basics_Java.Problems.Basic;

public class B1_Swap 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 19;
        System.out.println(a+" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);

        System.out.println();
        
        int a1 = 1;
        int b1 = 2;
        System.out.println(a1+" "+b1);
        a1 = a1^b1;
        b1 = a1^b1;
        a1 = a1^b1;
        System.out.println(a1+" "+b1);

        System.out.println();
        
        String a2 = "j";
        String b2 = "b";
        System.out.println(a2+" "+b2);
        String temp = a2;
        a2 = b2;
        b2 = temp;
        System.out.println(a2+" "+b2);

        System.out.println();

        int a3 = 10;
        int b3 = 20;
        System.out.println(a3+" "+b3);
        a3 = (a3 + b3) - (b3 = a3);
        System.out.println(a3+" "+b3);


    }
    
}
// 10 19
// 19 10

// 1 2
// 2 1

// j b
// b j

// 10 20
// 20 10