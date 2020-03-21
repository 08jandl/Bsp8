package edu.campus02;

import java.util.Arrays;

public class mitWhile {

    public static void main(String[] args){

        int[] arrayEins = new int [10];
        fibonacciArray(arrayEins);
        System.out.println(Arrays.toString(arrayEins));


        fibonacciLoop(0,1);
    }
    public static void fibonacciLoop (int a, int b) {
        System.out.println(a);
        int c = 0;
        while (b <= 1000) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;

        }
}

//// 3.	Schreibe eine Methode, welche die Zahlen der Fibonacci-Reihe berechnet. Beginne dabei immer bei 0.
//// Als Parameter soll ein Integer-Array dienen. Das Ergebnis der Methode soll ein Integer-Array sein,
//// in welchem an der ersten Stelle 0 steht und folgend die weiteren Zahlen der Fibonacci-Reihe in der richtigen Reihenfolge.
////(Tipp: Damit bestimmt die Länge des Arrays, wie viele stellen der Reihe berechnet werden sollen.)

    public static int[] fibonacciArray (int[] array){
               int fibEins = 0;
               int fibZwei = 1;

               array[0] = fibEins;
               array[1]= fibZwei;

               for (int i = 2; i < array.length-1; i++){
                  // if (fibZwei > 1000)
                   //{
                    //   break;
                   //}
                   array[i] = array[i-1] + array[i -2];

        }
                return array;
    }
    public static void printArray (int[] fibs)
    {
        for (int zahl : fibs) {
            if(zahl < 1000) {
                System.out.println(zahl);
            }
            else {
                break;
            }
        }

    }
}
