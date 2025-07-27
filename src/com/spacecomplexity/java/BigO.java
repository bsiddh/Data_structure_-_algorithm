package com.spacecomplexity.java;

public class BigO {

 public static void   printLogic(int n){
     //O(n^2) example

     for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
//                System.out.println(i+" "+j);
            }
        }

     //O(2n) = O(n) example

     for (int i=0;i<n;i++){
            System.out.print(i);

        }
        for (int j=0;j<n;j++){
            System.out.print(j);
        }
    }

    public static void main(String[] args) {
        printLogic(10);
    }
}
