package com.Homework;

public class Main {

    public static void main(String[] args) {
        int numThree = 3;
        int numFive = 5;

        for (int num = 0; num <= 100; num++){
            if(num == numThree){
                if(num == numFive){
                    System.out.println("MitchellHertel");
                    numThree = numThree + 3;
                    numFive = numFive + 5;
                } else{
                    System.out.println("Mitchell");
                    numThree = numThree + 3;
                }
            } else if(num == numFive){
                System.out.println("Hertel");
                numFive = numFive + 5;
            } else{
                System.out.println(num);
            }
        }
    }
}
