package exceptionexamples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int a =10, b=10, res=0;
        try{
            // monitor code
            System.out.println("inside the try block before exception occurs");
            res=a/b;

            int arr[] = {10, 3, 2, 23, 66};

            System.out.println("length of the array :" + arr.length);
            System.out.println("1st index of the array : " + arr[1]);
            System.out.println("3rd index of the array : " + arr[3]);
            System.out.println("7th index of the array : " + arr[4]);
            System.out.println("inside the try block after exception occurs");

            String msg1 = "Hi hello";
            String msg2 = null;

            System.out.println("length of msg1 is : " + msg1.length());
            System.out.println("length of msg2 is : " + msg2.length());
        } catch (ArithmeticException e1){
            // handling exception
            System.out.println("Exception occurred : "+e1.getMessage());
        }catch (NullPointerException e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occurred : "+e.getMessage());
        }

        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        System.out.println("res is : "+res);

    }
}
