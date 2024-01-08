//  find the area of rectangle by using classes and objects - area = l *b and perimeter = 2*(l+b)

import java.util.*;
class AreaAndPerimeter{
    int length;
    int breadth;
    void area(int a,int b){
        length = a ;
        breadth = b;
        System.out.println("Area of the rectangle : "+length*breadth);
    }
    void perimeter(int a,int b){
        length = a;
        breadth = b;
        System.out.println("perimeter of the rectangle : " + 2*(length+breadth));
    }
}
public class AreaRect {
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rectangle length : ");
        a = sc.nextInt();
        System.out.println("Enter the rectangle breadth : ");
        b = sc.nextInt();
        AreaAndPerimeter obj = new AreaAndPerimeter();
        obj.area(a,b);
        obj.perimeter(a, b);
    }
    
}
