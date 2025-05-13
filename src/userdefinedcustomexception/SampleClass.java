package userdefinedcustomexception;

public class SampleClass {
    public static void main(String[] args) {
        try{
            int a=100;
            if(a==100){
                throw new UserNotFoundException("a is 100 and it is user defined custom exception");

                // added new code
            }
        } catch (Exception e) {
             // added new code
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
