package org_test.example;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateTDD {

    public String add(String s) {
        System.out.println("Input String s"+s);
        List<Integer> negative=new ArrayList<>();
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

            if(x.equalsIgnoreCase("\\n")){
                return "Invalid Input";
            }

            String[] new_x = x.split(Pattern.quote("\\n"));
            for(String intrator:new_x) {
                if(intrator.isEmpty()){
                    sum+=0;
                    continue;
                }
                int t=Integer.parseInt(intrator);;
                if(t<0){
                    negative.add(t);
                    continue;

                }
                sum+=Integer.parseInt(intrator);
            }
        }
        if(negative.size()>0){
            String ne="negative numbers not allowed";
            for(Integer nnn:negative){
                ne+=" "+nnn.toString();
            }
            System.out.println(ne);
            return ne;

        }
        return Long.toString(sum) ;
    }
}
