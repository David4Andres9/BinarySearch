import java.util.Arrays;

public class Search {
    /**
     * Apply recursion to split the array in half and call the function again
     * @param numbers
     * @param numberToSearch
     * @return
     */
    public static boolean binarySearch( int[] numbers, int numberToSearch) {
        int size = numbers.length; 
        int middle = size/2;  
        if (numbers[middle] == numberToSearch)
          return true;
        else if (size == 1){
          return false;
        }
        else if (numbers[middle] > numberToSearch){
            return binarySearch(Arrays.copyOfRange(numbers,0,middle),numberToSearch);
        }
        else {
            return binarySearch(Arrays.copyOfRange(numbers,middle+1,size),numberToSearch);    
          }
        
    }
}
