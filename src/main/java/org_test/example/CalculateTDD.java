package org_test.example;


import java.util.regex.Pattern;

public class CalculateTDD {

    public Long add(String s) {
        System.out.println("Input String s"+s);
        String arr[]=s.split(",");

        Long sum=0L;
        for(String x:arr){
            if(x.equalsIgnoreCase("\\n")){
                return -1L;
            }

            String[] new_x = x.split(Pattern.quote("\\n"));
            for(String intrator:new_x) {
                if(intrator.isEmpty()){
                    sum+=0;
                    continue;
                }
                sum+=Integer.parseInt(intrator);
            }

        }
        return sum;
    }
}
