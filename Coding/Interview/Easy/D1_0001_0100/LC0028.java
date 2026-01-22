package Interview.Easy.D1_0001_0100;
public class LC0028 
{
    public static void main(String[] args) 
    {
        System.out.println("jayabalajee".indexOf("ja")); //0
        System.out.println("jayabalajee".indexOf("ay"));
        System.out.println("jayabalajee".indexOf("ya"));
        System.out.println("jayabalajee".indexOf("ab"));
        System.out.println("jayabalajee".indexOf("bala"));
        System.out.println("jayabalajee".indexOf("alaj"));
        System.out.println("jayabalajee".indexOf("laje"));
        System.out.println("jayabalajee".indexOf("ajee"));
        System.out.println("jayabalajee".indexOf("jeee")); //-1
        System.out.println("jayabalajee".indexOf("jee"));
        System.out.println("jayabalajee".indexOf("ee"));

        System.out.println("jayabalajee".contains("jee")); //true
        System.out.println("jayabalajee".contains("jej")); //false
    }
    
}
