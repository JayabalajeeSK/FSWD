package String;

import java.util.*;
// import java.util.stream.*;

public class StringAllMethodsDemo {
    public static void main(String[] args) {

        // ===============================
        // STRING CREATION (ALL WAYS)
        // ===============================
        String s1 = "Hello World";
        String s2 = new String("Java Programming");
        char[] chars = {'T','e','s','t'};
        String s3 = new String(chars);
        byte[] bytes = {65,66,67}; // ASCII
        String s4 = new String(bytes);
        String s5 = String.valueOf(12345);
        String s6 = String.join("-", "A","B","C");
        // String s7 = s1; // reference same as s1

        System.out.println("s1: "+s1+", s2: "+s2+", s3: "+s3+", s4: "+s4+", s5: "+s5+", s6: "+s6);

        // ===============================
        // BASIC METHODS
        // ===============================
        System.out.println("Length: " + s1.length());
        System.out.println("Char at 0: " + s1.charAt(0));
        System.out.println("Substring(0,5): " + s1.substring(0,5));
        System.out.println("Substring(6): " + s1.substring(6));
        System.out.println("Concat: " + s1.concat("!!!"));
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s2.toLowerCase());
        System.out.println("Trim: '" + "  hello  ".trim() + "'");
        System.out.println("Replace char: " + s1.replace('l','x'));
        System.out.println("Replace sequence: " + s1.replace("World","Java"));
        System.out.println("ReplaceAll regex: " + "abc123".replaceAll("\\d","X"));
        System.out.println("ReplaceFirst regex: " + "abc123abc".replaceFirst("abc","XYZ"));
        System.out.println("StartsWith 'He'? " + s1.startsWith("He"));
        System.out.println("EndsWith 'ld'? " + s1.endsWith("ld"));
        System.out.println("Contains 'World'? " + s1.contains("World"));
        System.out.println("IndexOf 'o': " + s1.indexOf('o'));
        System.out.println("LastIndexOf 'o': " + s1.lastIndexOf('o'));
        System.out.println("IndexOf 'l' from 3: " + s1.indexOf('l',3));

        // ===============================
        // EQUALITY & COMPARISON
        // ===============================
        String t1 = "Hello World";
        String t2 = new String("hello world");
        System.out.println("Equals: " + s1.equals(t1));
        System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase(t2));
        System.out.println("CompareTo: " + s1.compareTo(t2));
        System.out.println("CompareToIgnoreCase: " + s1.compareToIgnoreCase(t2));
        System.out.println("ContentEquals (StringBuffer): " + s1.contentEquals(new StringBuffer("Hello World")));

        // ===============================
        // SPLIT & JOIN
        // ===============================
        String fruits = "Apple,Banana,Cherry";
        String[] arr = fruits.split(",");
        System.out.println("Split: " + Arrays.toString(arr));
        String joined = String.join(" | ", arr);
        System.out.println("Join: " + joined);

        // ===============================
        // TO CHAR ARRAY / BYTE ARRAY
        // ===============================
        char[] cArr = s1.toCharArray();
        byte[] bArr = s1.getBytes();
        System.out.println("Char array: " + Arrays.toString(cArr));
        System.out.println("Byte array: " + Arrays.toString(bArr));

        // ===============================
        // VALUEOF & FORMAT
        // ===============================
        String fromInt = String.valueOf(100);
        String formatted = String.format("Name: %s, Age: %d", "Jay", 25);
        System.out.println("ValueOf: " + fromInt);
        System.out.println("Formatted: " + formatted);

        // ===============================
        // CHECK EMPTY & BLANK
        // ===============================
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty: " + empty.isEmpty());
        System.out.println("isBlank: " + blank.isBlank());

        // ===============================
        // CODE POINTS
        // ===============================
        System.out.println("CodePointAt 1: " + s1.codePointAt(1));
        System.out.println("CodePointBefore 1: " + s1.codePointBefore(1));
        System.out.println("CodePointCount 0-5: " + s1.codePointCount(0,5));

        // ===============================
        // MATCHES / REGEX
        // ===============================
        String regexStr = "abc123";
        System.out.println("Matches regex \\w+: " + regexStr.matches("\\w+"));
        System.out.println("Contains digit using regex: " + regexStr.matches(".*\\d.*"));

        // ===============================
        // CONVERSION TO OTHER TYPES
        // ===============================
        StringBuilder sb = new StringBuilder(s1);
        sb.append(" Builder");
        System.out.println("StringBuilder: " + sb);
        StringBuffer sbf = new StringBuffer(s2);
        sbf.append(" Buffer");
        System.out.println("StringBuffer: " + sbf);

        // ===============================
        // ITERATION
        // ===============================
        System.out.print("For loop chars: ");
        for(int i=0;i<s1.length();i++) System.out.print(s1.charAt(i)+" ");
        System.out.println();

        System.out.print("Enhanced for loop chars: ");
        for(char ch : s1.toCharArray()) System.out.print(ch+" ");
        System.out.println();

        // ===============================
        // 2D STRING ARRAY
        // ===============================
        String[][] str2D = {{"A","B"},{"C","D"}};
        System.out.println("2D String array: " + Arrays.deepToString(str2D));
        for(String[] row : str2D){
            for(String x : row) System.out.print(x+" ");
            System.out.println();
        }

        // 2D String → List<List<String>>
        List<List<String>> list2D = Arrays.stream(str2D)
                                         .map(Arrays::asList)
                                         .toList();
        System.out.println("2D String → List of Lists: " + list2D);

        // List<List<String>> → 2D String
        String[][] back2D = list2D.stream()
                                  .map(l -> l.toArray(new String[0]))
                                  .toArray(String[][]::new);
        System.out.println("List of Lists → 2D String array: " + Arrays.deepToString(back2D));
    }
}

