    /*it is used to differentiate instant varaibles from  parameters .
    -> for maintaining the chainging of the constructors we use this key word
    -> for calling a method inside a class we use this keyword
    -> to call parameterized from default constructors and vice versa we use this keyword
    -> note : this keyword should be always inside the method first statement */
class Stud{
    String name="this",college;
    int roll;
    char sec;
    Stud(String name,String college,int roll,char sec){
            this.name = name;
            this.college = college;
            this.roll = roll;
            this.sec = sec;
            System.out.println(name);
    }
}
public class ThisKey {
    public static void main(String[]args){
        Stud obj = new Stud("nikhil", "SPEC", 511, 'c');
    }
}
