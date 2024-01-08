import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.StringJoiner;
import java.util.*;

public class StringToken{
    public static void main(String... args) {

        //joining strings into arrays

        String s = new String("hello world");
        String []sen = s.split(" ");
        System.out.println(Arrays.toString(sen));
        StringTokenizer st = new StringTokenizer("demo on st");
        while(st.hasMoreTokens()){
            //accessing the token one by one 
            System.out.println(st.nextToken());
        }
        //tokens counting 
        System.out.println(st.countTokens());

        //calculating string elements by spacing 
        StringTokenizer p = new StringTokenizer("hello world"," ");
        while(p.hasMoreElements()){
            System.out.println(p.nextElement());
        }

        //joining two strings using StringJoiner class
        StringJoiner sj = new StringJoiner(" ");
        sj.add("hello");
        sj.add("world");
        System.out.println(sj);

        //combining two strings
        String s1 = "harith";
        String p1 = "reddy";
        String q = String.join(",",s1,p1);
        System.out.println(q.toString());
        System.out.println(s1.substring(1));

        //StringBuilder class
        StringBuilder sb = new StringBuilder("sbec");
        sb.setCharAt(1,'p');
        System.out.println(sb.toString());
    }
}
