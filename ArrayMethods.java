import java.util.Arrays;

/**
 * Square class asks:
 * 1) Create an Arrays class to get user input from the values in the array.
 * 2) Return the number.
 * 3) Return the sum.
 * 4) Return the average as a double.
 * 5) Return the value of the largest integer.
 * 6) Return the index of the value of the largest integer.
 *
 * @author Daniela Kolacheva, dkolacheva@student.sdccd.edu
 * @version 1.0
 * @since 11/02/2025
 */
public class ArrayMethods{
    //int variables
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * This constructor returns the number of values in the array.
     * return number The number of values
     */
    public int count(){
        int number=0;
        for(int value:myArray){
            number++;
        }
        return number;
    }
    
    /**
     * This constructor returns the sum of values in the array.
     * return total The sum of values
     */
    public int sum(){
        int total=0;
        for(int num:myArray){
            total+=num;
        }
        return total;
    }
    
    /**
     * This constructor returns the average of the array as a double.
     * return double The double sum/count
     */
    public double average(){
       return(double)sum()/count();
    }
    
    /**
     * This constructor returns the value of the largest integer in the array.
     * return max The max of values
     */
    public int findMax(){
        int max=myArray[0];
        for(int index=1; index<myArray.length; index++){
            if(myArray[index]>max)
            max=myArray[index];
        }
        return max;
    }
    
    /**
     * This constructor returns the index of the value of the largest integer in the array.
     * return indexOfMax The index of the max of the values
     */
    public int findIndexOfMax(){
        int max=myArray[0];
        int indexOfMax=0;
        for(int i=1; i<myArray.length; i++){
            if(myArray[i]>max){
                max=myArray[i];
                indexOfMax=i;
            }
        }
        return indexOfMax;
    }
    
    /**
     * prints an int array, nicely formatted
     * @param inArray int array to print
     */
    public void print(int[] inArray){
        System.out.print("{");
        int i;
        for(i=0; i<inArray.length-1; i++){
            System.out.print(inArray[i] + ", ");
        }
        if(inArray.length>0){
            System.out.print(inArray[i]);
        }
        System.out.println("}");
    }
}