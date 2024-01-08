//package name ------> com.HDFC 
//parameterized constructor ------------> namecust,
// cust id,mobile number,balance(float)
package com.HDFC;
class A{
    A(String namecust,int custid,int mobileno,float balance){
        float withdraw = 100;
        balance = balance-withdraw;
        System.out.println(namecust);
        System.out.println(custid);
        System.out.println(mobileno);
        System.out.println(balance);
        System.out.println("balance left after withdraw : "+balance);
    }
}
public class Pack {
    public static void main(String[] args) {
        A obj = new A("varun",242,772991131,10000);
    }
}
