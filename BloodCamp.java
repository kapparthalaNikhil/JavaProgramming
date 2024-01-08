// 2. blood donation -> age should be greater than 18 and weight should be greater than 50 ,health status will active
// calculate the cgpa of different subjects
import java.util.*;
class Details{
    String name;
    int age ;
    float weight;
    String health;
    void enterData(String a,int b,float c,String d){
        name = a;
        age = b;
        weight = c;
        health = d;
    }
    void conditions(){
        if(age>18 && weight>=50 && health=="active"){
            System.out.println(name+" YOUR ARE ELIGIBLE TO DONATE THE BLOOD");
        }else{
            System.out.println(name+" YOUR ARE NOT ELIGIBLE TO DONATE THE BLOOD.");
        }
        if(health=="active"){
            System.out.println("YOUR HEALTH IS ACTIVE");
        }else if(health!="active"){
            System.out.println("YOUR HEALTH IS LOW");
        }else{
            System.out.println("Enter the correct option");
        }
        }
        
    }

public class BloodCamp {
    public static void main(String[]args){
        String a;
        int b;
        float c;
        String d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        a = sc.next();
        System.out.print("Enter your age : ");
        b = sc.nextInt();
        System.out.print("Enter your weight : ");
        c = sc.nextFloat();
        System.out.print("Enter your health (active/low) : ");
        d = sc.next();
        Details obj = new Details();
        obj.enterData(a,b,c,d);
        obj.conditions();
    }
    
}
