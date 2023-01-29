
public class Array {
    
    /**
     * Define the length of array and request how much numbers want to put in the array
     */
    
    public static int[] defineArray(int dimension){
        int array[]=new int[dimension];
        for (int i=0;i<array.length;i++){
            array[i]=i;
        }
        return array;
    }

}