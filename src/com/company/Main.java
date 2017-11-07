package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numberArray  = new int[101];

        for (int index = 0; index < 100; index++){
            numberArray[index] = (int)(Math.random()*100);
        }
        NumberIterator numberIterator = new NumberIterator(numberArray);

        while (numberIterator.hasNext()){
            System.out.println(numberIterator.next());
        }

    }
}
