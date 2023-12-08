package com.aledesma.loops;

public class InfiniteFor {
    public static void main(String[] args) {
        for(int i=0; i<10; ) {                  // Line 3
            i = i++;
            System.out.println("Hello World");  // Line 5
        }
    }
}
