import java.util.*;
import java.io.*;
/**
 * Décrivez votre classe calculatrice ici.
 *
 * @author ABDELMOUMENE
 * @version 21/03/18
 */
public class MoteurRPN
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
   private Stack<Double> stack;
   public Stack<Double> getStack(){ return stack; }
    /**
     * Constructeur d'objets de classe calculatrice
     */
    public MoteurRPN()
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
    public Stack<Double> calc(Operation p){
            try{
                push(p.eval(pop(), pop()));
                return stack;
            } catch(EmptyStackException e){
                return stack;
            } catch(IllegalArgumentException e){
                return stack;
            }
    }
    public static void main(){
        MoteurRPN c = new MoteurRPN();
        SaisieRPN s = new SaisieRPN(c);
    }
}
