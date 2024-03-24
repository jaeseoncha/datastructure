package com.jaeseon.datastructure.chapter1;

public class GaussianSum {

    public static void main(String[] args) {


        double result = gss(7);
        System.out.println("result = " + result);

    }

    public static double gss(double dynamicNum ){

        double startNum =1;

        double result=(startNum + dynamicNum ) * (dynamicNum /2);


        return result;
    }


}
