package SirChibuzorsClassWork;

public class IndependenceArrayAssignment11 {

    //1. Write a function that returns the largest element in a list

    public static int largestElement(int [] arr){
        int maximum =  arr[0];
                for(int number : arr){
                    if(number > maximum){
                        maximum = number;
                    }
                }
        return maximum;

    }
}
