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
   private Stack<Double> stack;
    /**
     * Constructeur d'objets de classe calculatrice
     */
    public calculatrice()
    {
        stack = new Stack<Double>();
    }
    public void push(double n){
        stack.push(n);
    }
    public double pop(){
        try{
            return stack.pop();
        } catch(EmptyStackException e) {
            return 0;
        }
    }
    public void saisieRPN(){
        Scanner scanner = new Scanner(System.in);
        while_:while (scanner.hasNext()) {
           String s = scanner.next();
           switch(s){
                    case "+":
                        MoteurRPN(Operation.PLUS);
                        break;
                    case "-":
                        MoteurRPN(Operation.MOINS);
                        break;
                    case "*":
                        MoteurRPN(Operation.MULT);
                        break;
                    case "/":
                        MoteurRPN(Operation.DIV);
                        break;
                    case "exit":
                        try{
                            System.out.println(stack);
                        } catch(EmptyStackException e){
                            System.out.println("vide");
                        }
                        break while_;
                    default:
                        try{
                            push(Integer.parseInt(s));
                        } catch(NumberFormatException e){
                            break;
                        }
            }   
        }
        scanner.close();
    }
    public boolean MoteurRPN(Operation p){
            try{
                push(p.eval(pop(), pop()));
                return true;
            } catch(EmptyStackException e){
                return false;
            } catch(IllegalArgumentException e){
                return false;
            }
    }
    public static void main(){
        calculatrice c = new calculatrice();
        c.saisieRPN();
    }
}
