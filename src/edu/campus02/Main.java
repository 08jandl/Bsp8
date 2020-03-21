package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("0");
        System.out.println("1");
        fibonacci(0,1);

    }

    //Rekursive Methode , soll die Fibonacci Reihe von 0 - 1000 ausgeben
    //0 1 1 2 3 5 8 13
    public static void fibonacci (int a, int b) {
        int c = 0;

        if (b <= 1000) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

            fibonacci(a,b);
        }
        }

                    }


