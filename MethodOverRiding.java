/*
 1.method in the parent class and method in the child class should be same
 2.method over riding can be implemented by using is a relationship (IS a relationship also known as inheritance)
 */
class Vehicle{
    void drive(){
        String a = "Teaches";
        System.out.println("Driver is driving");
    }
}
class MotVeh extends Vehicle{
//public class MethodOverRiding {
     void drive(){
            System.out.println("Driver is sleeping in child class");
        }
    public static void main(String[]args){
        MotVeh obj = new MotVeh();
        obj.drive();
    }
}
