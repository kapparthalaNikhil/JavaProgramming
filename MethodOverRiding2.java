/*
 Logic :
 Method over riding to calculate rate of interest 
 1.parent class -> bank
    method -> rateof interest -> sop("rate of interst is zero") 
 2.class axis extends parent class (bank)
    method rateof interest -> sop("rate of interest is 1 rupee")
 3.extends with different banks with rot
 */
class Bank{
    void RateOfInterest(){
        System.out.println("rate of interest is zero");
    }
}
class Axix extends Bank{
    void RateOfInterest(){
        System.out.println("rate of interest is 1");
    }
}
class Hdfc extends Bank{
    void RateOfInterest(){
        System.out.println("rate of interest is 3");
    }
}
class Sbi extends Bank{
    void RateOfInterest(){
        System.out.println("rate of interest is 5");
    }
}

public class MethodOverRiding2 {
    public static void main(String[]args){
        Axix obj1 = new Axix();
        Hdfc obj2 = new Hdfc();
        Sbi obj3 = new Sbi();
        obj1.RateOfInterest();
        obj2.RateOfInterest();
        obj3.RateOfInterest();
    }
}
