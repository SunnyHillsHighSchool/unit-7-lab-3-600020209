//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //Create array list factors composed of Integers
  ArrayList<Integer> factors = new ArrayList<Integer>();
  //Start for loop, initializing int iterator i with value 2, while i is less than number (parameter), and incrementing i by 1 each run:
  for(int i = 2; i < number; i++){
    //Start if statement; when the modulo of number and i is 0:
    if(number % i == 0){
      //Add the value of i to the array list factors
      factors.add(i);
    //End if
    }
  //End for
  }
  //Return array list factors
  return factors;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //Declare integer array list original
   ArrayList<Integer> original = new ArrayList<Integer>();
  //Start for loop, initializing int iterator i with value of size of array list minus 1, while i is greater than or equal to 0, and decreasing i by one each run:
  for(int i = nums.size() - 1; i >= 0; i--){
    //Put value returned by getListOfFactors when passing the element in array list nums at position i through the method into original array
    original = ArrayListFunHouse.getListOfFactors(nums.get(i));
    //Start if statement: if the size of array list original is equal to 0:
    if(original.size() == 0){
      //Remove element at index i fo array list nums
      nums.remove(i);
    //End if
    }
  //End for
  }
 }
}