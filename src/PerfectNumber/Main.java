package PerfectNumber;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int number =10;
        Stack<Integer> remainders = new Stack<>();

        for(int i=1;i<number;i++){
            if(number % i == 0){
                remainders.push(i);
            }
        }

        System.out.println("Every diviser for the number "+ number + " is: "  +remainders);

        int total=0;
        int size = remainders.size();
        for(int i=0;i<size;i++){
            total = total + remainders.pop();
        }
        System.out.println("Number given: " + number);
        System.out.println("Remainders total: " +total);
        System.out.println(number == total ? "Perfect Number" : "Not a Perfect Number");
    }
}
