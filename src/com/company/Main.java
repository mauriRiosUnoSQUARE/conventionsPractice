package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean canBeDividedBy3(int value){
        if(value%3==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static ArrayList generateNumbers(int value){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<value;i++){
            numbers.add(i);
        }
        return numbers;
    }
    public static void main(String[] args) {
        final String NAME = "Mauricio";
        Scanner input = new Scanner(System.in);
        System.out.print("Value? ");
        Integer value = input.nextInt();
        ArrayList<Integer> numbers = generateNumbers(value);
        for(int i=0;i<numbers.size();i++){
            if(canBeDividedBy3(numbers.get(i))){
                System.out.print(numbers.get(i)+" " + NAME + System.lineSeparator());
            }
            else{
                System.out.print(numbers.get(i) + System.lineSeparator());
            }
        }

    }
}
