package org_test.example;


public class CalculateTDD {

    public Long add(String s) {
        System.out.println("Input String s"+s);
        String arr[]=s.split(",");

        Long sum=0L;
        for(String x:arr){
            if(x.equalsIgnoreCase("\\n")){
                return -1L;
            }
            String slace_n="\\n";
            String[] new_x =x.split(slace_n);

            for(String intrator:new_x) {
                System.out.println(intrator);
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
