package Basics_Java.B3_DatatypesAndCasting;

class Demo {
    String name;         // default null
    int[] numbers;       // default null
    Employee emp;        // default null
    Level level;         // default null (enum)

    void printDefaults() {
        System.out.println("String: " + name);
        System.out.println("Array: " + numbers);
        System.out.println("Class Object: " + emp);
        System.out.println("Enum: " + level);
    }
}

class Employee {
    String name;
    double salary;
}

enum Level { LOW, MEDIUM, HIGH }

public class B3_NonPrimitive_DefaultValuesDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.printDefaults();
    }
}

// String: null
// Array: null
// Class Object: null
// Enum: null