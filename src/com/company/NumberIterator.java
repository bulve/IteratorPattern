package com.company;

public class NumberIterator {

    private int [] numberArray;
    private int index;

    public NumberIterator(int [] numberArray){
        this.numberArray = numberArray;
    }

    public boolean hasNext(){
        return numberArray.length > index;
    }

    public int next() {

        if (numberArray[index] % 2 == 0 && numberArray[index] < 40){
            return numberArray[index++];
        }else{
            index++;
            return next();
        }
    }


}
