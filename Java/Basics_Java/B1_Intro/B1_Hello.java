package Basics_Java.B1_Intro;

public class B1_Hello 
{
    public static void main(String[] args) 
    {

        System.out.println("Hello World");
        
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vm.name"));
    }
}
// Hello World
// 30
// 24
// Oracle Corporation
// OpenJDK 64-Bit Server VM