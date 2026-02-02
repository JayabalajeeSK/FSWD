package Basics_Java.B4_Variables;
public class B4_Variables {

    static int count = 0;      // static variable
    int id;                    // instance variable

    public void setId(int id) {
        int temp = id;         // local variable
        this.id = temp;
        count++;               // static variable shared by all objects
    }

    public void show() {
        System.out.println("ID = " + id + ", Count = " + count);
    }

    public static void main(String[] args) {
        B4_Variables v1 = new B4_Variables();
        v1.setId(10);
        v1.show();

        B4_Variables v2 = new B4_Variables();
        v2.setId(20);
        v2.show();
    }
}
// ID = 10, Count = 1
// ID = 20, Count = 2