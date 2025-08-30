import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
        // Integer[] arr1={1,2,3,4,5};
        // arr1[0]=10;
        // int[] arr1= new int[7];
        // PrintArray(arr1);

        //  String[] arr2={"A","B","C","D"};
        // System.out.println(Arrays.toString(arr2));
 
        //   String[][] arr2={{"A","B"},{"C","D"}};
        // System.out.println(Arrays.deepToString(arr2));

        String[][] arr4=new String[3][2];
        System.out.println(Arrays.deepToString(arr4));
    }

    public static <T> void PrintArray(T[] arr){

        for(T x:arr){
            System.out.println(x+"x");
        }
    }
}