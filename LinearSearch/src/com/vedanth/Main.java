package com.vedanth;

public class Main {

    public static void main(String[] args) {
        int[] nums = {23,4,5,6,7,8,67,89,42};
        int target = 7;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search in the array : return the index if the item is found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr,int target)
    {
            if (arr.length == 0)
            {
                return -1;
            }

        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if its equal to the target that we are going to search
                int element = arr[index];
                if(element == target){
                    return index;
                }
        }
        // this line will execute if none of the other return statements are executed,
        //the element does not exist, so return -1

        return -1;


    }
    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
}
