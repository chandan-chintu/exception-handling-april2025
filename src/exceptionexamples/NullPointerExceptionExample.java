package exceptionexamples;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String msg1 = "Hi hello";
            String msg2 = null;
            System.out.println("length of msg1 is : " + msg1.length());
            System.out.println("length of msg2 is : " + msg2.length());
            //added dummy lines

            //added dummy lines

        }catch (NullPointerException e){
            //added dummy lines

            System.out.println("Exception occurred : "+e.getMessage());

        }

    }
}
