package exceptionexamples;

public class ThrowExample {
    public static void main(String[] args) {
        try{
            int a=10;
            if(a==10){
                throw new RuntimeException("a value is 10  and exception thrown");
            }
            System.out.println("a value is :"+a);

            String customer = "not found";
            if(customer.equals("not found")){
                throw new RuntimeException("Customer not found");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
