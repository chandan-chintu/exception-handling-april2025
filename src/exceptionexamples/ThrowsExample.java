package exceptionexamples;

public class ThrowsExample {

    public static void demo() throws IllegalAccessException, InterruptedException {
        int a=10;
        if(a==0){
            throw new ArithmeticException("a is 0 and it is unchecked exception");
        }
        if(a==10){
            throw new InterruptedException("a is 10 and it is checked exception");
        }
        if(a==20){
            throw new ArrayIndexOutOfBoundsException("a is 20 and it is unchecked exception");
        }
        if(a==30){
            throw new IllegalAccessException("a is 30 and it is checked exception");
        }
    }

    public static void main(String[] args) {
        try{
            //ThrowsExample t = new ThrowsExample();
            demo();
        } catch(Exception e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
