
class Bike{
    String name;
    String model;
    int year;
    double price;
    Bike(String name,String model,int year,double price){
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
        System.out.println("company :"+name+"\nmodel name : "+model+"\nyear : "+year+"\nprice : "+price);
    }
}
public class BikeDetails {
    public static void main(String[]args){
        Bike obj = new Bike("bajaj", "pulsar", 2012, 90000.00);
    }
}
