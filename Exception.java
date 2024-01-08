/* Exception Handling 
exception is a run time error
error are classified into three types
1.compile time error
2.run time error
3.logical error

-> exceptions are classified into two types
1.user defined exception
2.built in exception

-> built exception are classified into two types
1.Named exception -> also Compile time exception [Ex : FileNotFound,]
2.Unnamed exception -> also Run time exception [Ex : Arithmetic,ArrayIndexOutOfBound]

-> Exception is an event which breaks the control flow of execution.
-> When an exception arises system stops working.In order to handle the exception their is a 
program called exception handler

Note : In java their is a default exception handler
default exception handler is created by java virtual machine

Role of default exception handler: 
1.It will give you name of error
2.description of the error
3.information about stack trace

there are 5 blocks to handle the exception handling
1.try block
2.catch block
3.finally 
4.throw
5.throws
 */
public class Exception {
    public static void main(String[] args) {
        int a = 10, b=0,res;
        try{
            res = a/b;
        }
        catch(ArithmeticException ae){    
            System.out.println(ae.toString());
        }
        finally{
            System.out.println("done");
        }
    }
    
}
