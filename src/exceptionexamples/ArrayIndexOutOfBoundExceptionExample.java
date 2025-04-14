package exceptionexamples;

public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 3, 2, 23, 66};

            System.out.println("length of the array :" + arr.length);
            System.out.println("1st index of the array : " + arr[1]);
            System.out.println("3rd index of the array : " + arr[3]);
            System.out.println("7th index of the array : " + arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occurred : "+e.getMessage());
        }
    }
}
