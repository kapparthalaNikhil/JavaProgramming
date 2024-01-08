import java.util.*;
public class test1 {
    public static void main(String[] args) {
        //1.String s = "harith" find charAt index value 2
        String s = "harith";
        System.out.println(s.charAt(2));

        //2.compare two strings using equals method
        String a = "Harith";
        String b = "harith";
        System.out.println(a.equals(b));

        //3.convert harith to HARITH
        System.out.println(s.toUpperCase());

        //4.join two strings 
        //string s1 = "welcome to spec"
        //string s2 = "cse javac b section"
        //output : string s1,string s2
        String x = "welcome to spec";
        String y = "cse javac b section";
        String z = String.join(",",x,y);
        System.out.println(z);

        //5.count the tokens in the Strings
        //"welcome to st.peters engineering college"
        StringTokenizer u = new StringTokenizer("welcome to st.peters engineering college"," ");
        System.out.println(u.countTokens());

        //6.replace String
        //String = "teddy bear"
        //o/p : donald bear
        String s4 = new String("teddy bear");
        String []sen = s4.split(" ");
        sen[0]="donald";
        System.out.println(Arrays.toString(sen));
    }
}
