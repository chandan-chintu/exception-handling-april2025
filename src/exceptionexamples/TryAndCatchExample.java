package exceptionexamples;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a =10, b=0, res=0;
        try{
            // monitor code
            System.out.println("inside the try block before exception occurs");
            res=a/b;
            System.out.println("inside the try block after exception occurs");
        } catch (ArithmeticException e1){
            // handling exception
            System.out.println("Exception occurred : "+e1.getMessage());
        }

        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        System.out.println("res is : "+res);

    }
}
