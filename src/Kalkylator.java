import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.lang.Math;

public class Kalkylator{

    public static class Swinglayout{
        JFrame f;
        Swinglayout(){
            f=new JFrame();
            JFrame frame = new JFrame("Kalkylator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //skapar Jframe med knappar
            final JTextField tfformel = new JTextField();
            final JTextField tfa = new JTextField();
            final JTextField tfb = new JTextField();
            final JTextField tfans = new JTextField();

            tfans.setEditable(false);
            tfformel.setEditable(false);
            tfformel.setBounds(50,50, 100,20);
            tfa.setBounds(50,100, 100,20);
            tfb.setBounds(170,100, 100,20);
            tfans.setBounds(50,150,200,20);

            JButton Addition = new JButton("Addition");
            JButton Subtraktion = new JButton("Subtraktion");
            JButton Multiplikation = new JButton("Multiplikation");
            JButton Division = new JButton("Division");
            JButton Pythagoras = new JButton("Pythagoras");
            JButton Derivata = new JButton("Derivata");
            JButton Calculate = new JButton("Calculate");
            //en actionlistener som märker av när man klickar på additionsknappen
            Addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.add(tfformel);
                f.add(tfa);
                f.add(tfb);
                f.add(tfans);
                tfformel.setText("a + b = c");
                tfa.setText("Write your a here");
                tfb.setText("Write your b here");
                tfans.setText("Your answer appear here");
                //actionlistener som märker av när man trycker på calculate och sedan räknar ut additionen.
                Calculate.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        int answer = calculateaddition();
                        tfans.setText(String.valueOf(answer));

                    }
                    //räknar ut addition i ui.
                    private int calculateaddition() {
                        String stringa = tfa.getText();
                        String stringb = tfb.getText();
                        int a = Integer. parseInt(stringa);
                        int b = Integer. parseInt(stringb);

                        int answer = a + b;
                        return answer;
                    }
                });
                    }
                });
            f.add(Addition);f.add(Subtraktion);f.add(Multiplikation);f.add(Division);f.add(Pythagoras);f.add(Derivata);

            f.setLayout(new FlowLayout(FlowLayout.LEFT));
            f.add(Calculate);

            f.setSize(1920,1080);
            f.setVisible(true);

    }

        }
    public static void main(String[] args){
        //drar igång layouten
        new Swinglayout();
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