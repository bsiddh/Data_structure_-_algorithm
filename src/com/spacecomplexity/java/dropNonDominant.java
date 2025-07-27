package com.spacecomplexity.java;

public class dropNonDominant {

  public static void  nonDominant(int n){
    //  O(n^2+n)=O(n^2) => non-dominant example
      //n^2 has high priority
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
               System.out.println(i+" "+j);
            }
        }

        for (int k=0;k<n;k++){
          System.out.println(k);
        }
    }

    public static void main(String[] args) {
        nonDominant(10);
    }
}
