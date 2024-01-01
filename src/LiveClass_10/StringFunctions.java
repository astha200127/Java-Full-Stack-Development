package LiveClass_10;

import java.util.Arrays;

public class StringFunctions
{
    public static void main(String[] args) {  //length
        String s = "Astha Kumari";
        System.out.println(s.length());

        //concatenation
        String a = "Ashwani";
        String b = "Upadhyay";
        String c = a + b;
        System.out.println(c);

        //to char array
        String p = "Sakshi";
        char ch[] = p.toCharArray();
        System.out.println(ch);
        System.out.println(Arrays.toString(ch));

        //charAt
        String q = "khushi";
        System.out.println(q.charAt(1));

        //compareTo
        String s1 = "Hello";
        String s2 = "Hi";
        int res = s1.compareTo(s2);
        System.out.println(res);

        //equals()
        System.out.println(s1.equals(s2));

        //contains
        String s3 = "Hello I am Astha taking Ashwani Sir's Class";
        System.out.println(s3.contains("Astha"));
        System.out.println(s3.contains("astha"));

        //indexOf()
        System.out.println(s3.indexOf("a"));

        //replaceOf()
        String ss="Ashwani World";
        String res2=ss.replace("Ashwani", "Hello");
        System.out.println(res2);

        //subString
        String r1 = "Hello I am Astha taking Ashwani Sir's Class";
        String r2=r1.substring(0, 7);
        String r3=r1.substring(6);
        System.out.println(r2);
        System.out.println(r3);
    }
}
