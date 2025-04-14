package exceptionexamples;

public class NestedTryAndCatchExample {
    public static void main(String[] args) {
        try{
            System.out.println("inside 1st try block");
            int a =10, b=10, res=0;
            res=a/b;
            System.out.println("res is : "+res);
            try{
                System.out.println("inside 2nd try block");
                int arr[]={2,44,33,11};
                System.out.println("length of arr is : "+arr.length);
                System.out.println("4th index is : "+arr[2]);
                try{
                    System.out.println("inside 3rd try block");
                    String m1 = "hi";
                    String m2 =null;
                    System.out.println("m1 length is : "+m1.length());
                    System.out.println("m2 length is : "+m2.length());
                } catch (Exception e) {
                    System.out.println("inside 3rd catch block");
                    System.out.println("Exception occurred : "+e.getMessage());
                }
            } catch (Exception e) {
                System.out.println("inside 2nd catch block");
                System.out.println("Exception occurred : "+e.getMessage());
            }
        } catch (Exception e){
            System.out.println("inside 1st catch block");
            System.out.println("Exception occurred :"+e.getMessage());
        }
    }
}
