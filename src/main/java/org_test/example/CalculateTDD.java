package org_test.example;


public class CalculateTDD {

    public Long add(String s) {

        String arr[]=s.split(",");

        Long sum=0L;
        for(String x:arr){
            if(x.isEmpty()){
                sum+=0;
                continue;
            }
            sum+=Integer.parseInt(x);
        }
        return sum;
    }
}
