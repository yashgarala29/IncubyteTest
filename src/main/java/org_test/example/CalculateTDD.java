package org_test.example;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateTDD {

    public Long add(String s) {
        System.out.println("Input String s"+s);
        String delimiter=",";
        if (s.length()>2&&s.charAt(0)=='/'&&s.charAt(1)=='/') {
            delimiter = String.valueOf(s.charAt(2));
            s=s.substring(5);
        }
        System.out.println(delimiter);
        System.out.println(s);

        String arr[]=s.split(delimiter);
        Long sum=0L;
        for(String x:arr){
            System.out.println("x"+x);
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
