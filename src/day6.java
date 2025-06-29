import java.util.Arrays;
import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1.Write a Java program to test if the first and the last element of an array of
            integers are same. The length of the array must be greater than or equal to
         */

        System.out.println("-------------- Exercise 1 --------------");
        double [] numbers = {12,15,14,13,12,10,5,2,3,4,5,6,7,8,9,100}; //the used array in next examples:-

        boolean isEqual = true;
        for(int i = 0; i<= numbers.length-1 ; i++){
            if(numbers[0] == numbers[numbers.length-1]){
            }else{
                isEqual = false;
            }
        }
        System.out.println("is the first and last equal?: "+isEqual);






        /*2.Write a Java program to find the numbers greater than the  average of the
            numbers of a given array.
         */

        System.out.println("-------------- Exercise 2 ---------------");

        double average = 0;

        for(double number : numbers) {
            average += number;
        }
        average /= numbers.length;
        System.out.println("the average of the array is: " + average);

        System.out.print("the number in the array that greater than the average of the array is: \n");
        for(double number : numbers) {
            if(number > average) {
                System.out.print(number+"-->");
            }
        }






        /* 3.Write a Java program to get the larger value between first and last
            element of an array of integers.
        */
        System.out.println("\n-------------- Exercise 3 ---------------");

        double largest = numbers[0];
        for (int i = 0; i<=numbers.length-1; i++){
            if(largest < numbers[numbers.length-1]){
                largest = numbers[numbers.length-1];
            }
        }
        System.out.println("Larger value between first and last element: "+largest);
        //---------------- or we can just write to find the largest (without loop) ----------------:
        /*
             if(largest > numbers[numbers.length-1]) {
                System.out.println("The largest number is first index: "+largest);
            }else{
                System.out.println("The largest number is last index: "+largest);
            }
        */







        /* 4.Write a Java program to swap the first and last elements of an array and
            create a new array.
        */
        System.out.println("-------------- Exercise 4 ---------------");

        System.out.println("array before swap (old):"+ Arrays.toString(numbers));


        double temp = numbers[0];
        double lastNumber = numbers[numbers.length - 1];

        numbers[0] = lastNumber;
        numbers[numbers.length - 1] = temp;

        double [] newArray = new double[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        System.out.println("the array after swap (new): "+ Arrays.toString(newArray));






        /* 5. Write a program that places the odd elements of an array before the
            even elements.
        */
        System.out.println("-------------- Exercise 5 ---------------");

        System.out.println("original array: \n" + Arrays.toString(numbers));

        double [] newArray2 = new double[numbers.length];
        int start = 0;
        int end = numbers.length - 1;

        for (int i = 0; i <= numbers.length-1; i++) {
            if(numbers[i] % 2 == 1){
                newArray2[start++] = numbers[i];
            }else {
                newArray2[end--] = numbers[i];
            }
        }

        System.out.println("array after placing odd and evens: \n "+ Arrays.toString(newArray2));






        /* 6. Write a program that test the equality of two arrays. */
        System.out.println("-------------- Exercise 6 ---------------");

        int [] arr1 = {1,2,3,4,5,6,4};
        int [] arr2 = {1,2,3,4,5,6,2};

        boolean isEqualArrays = true;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1.length != arr2.length){
                isEqualArrays = false;
                break;
            }else if(arr1[i] == arr2[i]){
                isEqualArrays = true;
            }else{
                isEqualArrays = false;
            }
        }

        System.out.println("is arrays are equal? : " + isEqualArrays);
    }
}