/*
 * As we all know final variable declared can only be initialized once whereas the reference variable once declared
 *  final can never be reassigned as it will start referring to another object which makes usage of the final impracticable. 
 * But note here that with final we are bound not to refer to another object but within the object data can be changed which 
 * means we can change the state of the object but not reference.

Arrays are also an object so final arrays come into play.
 The same concept does apply to final arrays that are we can not make the final array refer to some other array but 
 the data within an array that is made final can be changed/manipulated.
 */

import java.util.Arrays;

public class FinalArray {
 
    public static void main(String[] args) {
        
        final int a;
        a=10;//can be initlized once only 
        System.out.println(a);

        //a=20;//gives error
       final int[] arr={1,2,3,4,5,6,8};

        int[] arr2={8,6,5,4,3,2,1};
        // arr=arr2;//gives error

        arr[6]=7;//works fine
        System.out.println(Arrays.toString(arr));




    }
 }