package String;

import java.util.*;
// import java.util.stream.*;

public class StringCompleteDemo {
    public static void main(String[] args) {

        // ===============================
        // STRING CREATION (ALL WAYS)
        // ===============================
        String s1 = "Hello";                // literal
        String s2 = new String("World");    // new keyword
        char[] chars = {'J','a','v','a'};
        String s3 = new String(chars);      // from char array
        byte[] bytes = {65,66,67};
        String s4 = new String(bytes);      // from byte array (ASCII)
        String s5 = String.valueOf(12345);  // from int
        String s6 = String.join("-", "A","B","C"); // join method

        System.out.println("s1: " + s1 + ", s2: " + s2 + ", s3: " + s3 + ", s4: " + s4 + ", s5: " + s5 + ", s6: " + s6);

        // ===============================
        // BASIC METHODS
        // ===============================
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Char at index 1: " + s1.charAt(1));
        System.out.println("Substring (1,4): " + s1.substring(1,4));
        System.out.println("Concat s1+s2: " + s1.concat(s2));
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s2.toLowerCase());
        System.out.println("Trim: '" + "  Hello  ".trim() + "'");
        System.out.println("Replace e->a: " + s1.replace('e','a'));
        System.out.println("ReplaceAll regex: " + "abc123".replaceAll("\\d","X"));
        System.out.println("StartsWith H? " + s1.startsWith("H"));
        System.out.println("EndsWith o? " + s1.endsWith("o"));
        System.out.println("Contains 'll'? " + s1.contains("ll"));
        System.out.println("IndexOf 'l': " + s1.indexOf('l'));
        System.out.println("LastIndexOf 'l': " + s1.lastIndexOf('l'));

        // ===============================
        // EQUALITY & COMPARISON
        // ===============================
        String t1 = "Hello";
        String t2 = new String("Hello");
        System.out.println("Equals? " + t1.equals(t2));
        System.out.println("EqualsIgnoreCase? " + t1.equalsIgnoreCase("HELLO"));
        System.out.println("CompareTo: " + t1.compareTo("World"));
        System.out.println("CompareToIgnoreCase: " + t1.compareToIgnoreCase("world"));

        // ===============================
        // SPLIT & JOIN
        // ===============================
        String fruits = "Apple,Banana,Cherry";
        String[] fruitArr = fruits.split(",");
        System.out.println("Split: " + Arrays.toString(fruitArr));
        String joined = String.join(" | ", fruitArr);
        System.out.println("Joined: " + joined);

        // ===============================
        // TO CHAR ARRAY / BYTE ARRAY
        // ===============================
        char[] cArr = s1.toCharArray();
        System.out.println("Char array: " + Arrays.toString(cArr));
        byte[] bArr = s1.getBytes();
        System.out.println("Byte array: " + Arrays.toString(bArr));

        // ===============================
        // VALUE OF & FORMAT
        // ===============================
        String fromInt = String.valueOf(100);
        String formatted = String.format("Name: %s, Age: %d", "Jay", 25);
        System.out.println("ValueOf: " + fromInt);
        System.out.println("Formatted: " + formatted);

        // ===============================
        // STRING → STRINGBUILDER / STRINGBUFFER
        // ===============================
        StringBuilder sb = new StringBuilder(s1);
        sb.append(" Builder");
        System.out.println("StringBuilder: " + sb);
        sb.insert(0,"Start-");
        System.out.println("Insert: " + sb);
        sb.replace(0,5,"Begin");
        System.out.println("Replace: " + sb);
        sb.delete(0,5);
        System.out.println("Delete: " + sb);
        sb.reverse();
        System.out.println("Reverse: " + sb);

        StringBuffer sbf = new StringBuffer(s2);
        sbf.append(" Buffer");
        System.out.println("StringBuffer: " + sbf);

        // ===============================
        // ITERATION
        // ===============================
        System.out.print("For loop chars: ");
        for(int i=0;i<s1.length();i++) System.out.print(s1.charAt(i) + " ");
        System.out.println();

        System.out.print("Enhanced for loop chars: ");
        for(char ch : s1.toCharArray()) System.out.print(ch + " ");
        System.out.println();

        // ===============================
        // 2D STRING ARRAY
        // ===============================
        String[][] str2D = {{"A","B"},{"C","D"}};
        System.out.println("2D String array: " + Arrays.deepToString(str2D));

        for(int i=0;i<str2D.length;i++){
            for(int j=0;j<str2D[i].length;j++){
                System.out.print(str2D[i][j] + " ");
            }
            System.out.println();
        }

        // 2D String → List<List<String>>
        List<List<String>> list2D = Arrays.stream(str2D)
                                         .map(Arrays::asList)
                                         .toList();
        System.out.println("2D String → List of Lists: " + list2D);

        // List<List<String>> → 2D String
        String[][] backStr2D = list2D.stream()
                                     .map(l -> l.toArray(new String[0]))
                                     .toArray(String[][]::new);
        System.out.println("List of Lists → 2D String array: " + Arrays.deepToString(backStr2D));
    }
}

