package com.codewarstraining.codewarstraining.kyu6;

public class multiplesof3or5 {

    public int solution(int number) {
        int sum=0;

        for(int i=1; i<number; i++){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        return sum;
    }

}
