package collection;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int [] arr =  {10,38,48,3,4};

        Arrays.sort(arr);
       int  ans =  Arrays.binarySearch(arr,38
        );
        System.out.println(ans);

    }
}
