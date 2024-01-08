class Student{
    int rollno = 511;
    String name = "Reeshap";
    char sec = 'C';
}
public class StudentDetails {
    public static void main(String[]args){
        Student obj = new Student();
        System.out.println(obj.rollno);
        System.out.println(obj.name);
        System.out.println(obj.sec);
    }
}
