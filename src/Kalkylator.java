import java.util.Scanner;
public class Kalkylator{
    public static void main(String[] args){
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int int1,int2,whichcalculation;
        int1 = inp.nextInt();
        int2 = inp.nextInt();
        System.out.println("Type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division.");
        whichcalculation = inp.nextInt();
        switch (whichcalculation) {
            case 1:
                System.out.println(addition( int1,int2));
                break;
            case 2:
                System.out.println(subtraction( int1,int2));
                break;
            case 3:
                System.out.println(multiplication( int1,int2));
                break;
            case 4:
                System.out.println(division( int1,int2));
                break;
        }

    }

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
}