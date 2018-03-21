import java.util.*;
import java.io.*;
/**
 * Décrivez votre classe calculatrice ici.
 *
 * @author ABDELMOUMENE
 * @version 21/03/18
 */
public class calculatrice
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
   private double stack[];
   private int top;
   public static double MAX_VALUE = 10000000.0;
   public double MIN_VALUE = 0.00001;

    /**
     * Constructeur d'objets de classe calculatrice
     */
    public calculatrice()
    {
        // initialisation des variables d'instance
        stack = new double[100];
        top = 0;
    }
    public void push(double n){
        stack[top] = n;
        top++;
    }
    public double pop(){
        top--;
        return stack[top];
    }
    public void MoteurRPN(String s){
            double d1, d2;
            Operation p;

            switch(s){
                    case "+":
                        d1 = pop();
                        d2 = pop();
                        p = Operation.PLUS;
                        push(p.eval(d1,d2));
                    break;
                    case "-":
                        d1 = pop();
                        d2 = pop();
                        p = Operation.MOINS;
                        push(p.eval(d1,d2));
                    break;
                    case "*":
                        d1 = pop();
                        d2 = pop();
                        p = Operation.MULT;
                        push(p.eval(d1,d2));
                    break;
                    case "/":
                        d1 = pop();
                        d2 = pop();
                        p = Operation.DIV;
                        push(p.eval(d1,d2));
                    break;
                    default: push(Double.parseDouble(s));
            }
            for(int i=0; i<top; i++)
                System.out.println(stack[i]);
    }
    public static void main(){
        calculatrice c = new calculatrice();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            c.MoteurRPN(scanner.next());
        }
        scanner.close();
    }
}
