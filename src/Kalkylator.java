import java.util.Scanner;
import java.lang.Math;

public class Kalkylator{
    public static void main(String[] args){
        //Declarar mina ints.
        int int1=0,int2=0,whichcalculation,derivata1=0,derivata2=0;
        String x,upphöj;

        //Scanner som scannar efter input i consolen.
        Scanner inp = new Scanner(System.in);

        //Välj vilken kalkylation.
        System.out.println("Type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for pythagoras, 6 for derivative.");
        whichcalculation = inp.nextInt();
        if(whichcalculation < 6) {
            //Vilka ints som ska beräknas med den valda kalkylationen.
            System.out.println("Enter first and second number:");
            int1 = inp.nextInt();
            int2 = inp.nextInt();
        }
        else {
            System.out.println("Enter what you want to derive separately");
            derivata1 = inp.nextInt();
            x = inp.next();
            derivata2 = inp.nextInt();
        }
            switch (whichcalculation) {
                case 1:
                    System.out.println(addition(int1, int2));
                    break;
                case 2:
                    System.out.println(subtraction(int1, int2));
                    break;
                case 3:
                    System.out.println(multiplication(int1, int2));
                    break;
                case 4:
                    System.out.println(division(int1, int2));
                    break;
                case 5:
                    System.out.println(pythagoras(int1, int2));
                    break;
                case 6:
                    System.out.println(derivative(derivata1, derivata2));
            }



    }
    //Alla uträkningar.
    public static int addition(int int1, int int2) {
        int answer = int1 + int2;
        return answer;
    }

    public static int subtraction(int int1, int int2) {
        int answer = int1 - int2;
        return answer;
    }
    public static int multiplication(int int1, int int2) {
        int answer = int1 * int2;
        return answer;
    }
    public static int division(int int1, int int2) {
        int answer = int1 / int2;
        return answer;
    }
    public static double pythagoras(int int1, int int2){
        int pythagorascalc = int1 * int1 + int2 *int2;
        double answer = Math.sqrt(pythagorascalc);
        return answer;
    }
    public static String derivative(int derivata1, int derivata2){
        int k = derivata1 * derivata2;
        int n = derivata2 - 1;
        String derivataans = k +"x^" + n;
        return derivataans;
    }
}