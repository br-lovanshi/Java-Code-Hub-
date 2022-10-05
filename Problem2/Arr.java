package Problem2;

import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {
        System.out.println("Inter the arr size ");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the elements ");

        int[] ar = new int[n];
        for(int i =0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("ente the index of elements ");
        int ind = sc.nextInt();

        if(ar.length == 0){
            System.out.println("empty arr ");
        }
//        int i = 0;
        int ans =0;
        for(int i = 0;i<ar.length;i++){
            if(i == ind){
               ans = ar[i];
               break;

            }
        }
        System.out.println("The array element at index " + ind + " is " + ans);
        System.out.println("The array element successfully accessed");

    }
}
