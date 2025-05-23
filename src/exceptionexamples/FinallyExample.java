package exceptionexamples;

public class FinallyExample {
    public static void main(String[] args) {
        int a=10, b=10;
        int res=0;
        try{
            res = a/b;
            System.out.println("ending try block");
        } catch (Exception e) {
            System.out.println("Exception occurred : "+e.getMessage());
        }
        finally{
            System.out.println("It will always execute");
        }
        System.out.println("after try catch finally");
    }
}
