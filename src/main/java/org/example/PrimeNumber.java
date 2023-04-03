package org.example;

import java.util.Arrays;

public class PrimeNumber {
    public int primaryNum(int n) {
        int count=0;
        if(n<=2){
            return 0;
        }
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,false);

        int x=(int)Math.sqrt(n);
        for(int i=2;i<=x;i++){
            if(arr[i]==false){
                for(int j=i*i;j<n;j=j+i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==false){
                count++;
            }
        }
        return count;
    }
}
