import java.io.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.io.*;
/**
 * Décrivez votre classe SaisieRPN ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class SaisieRPN
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    /**
     * Constructeur d'objets de classe SaisieRPN
     */
    public SaisieRPN(MoteurRPN c){
        Scanner scanner = new Scanner(System.in);
        while_:while (scanner.hasNext()) {
           String s = scanner.next();
           switch(s){
                    case "+":
                        c.calc(Operation.PLUS);
                        break;
                    case "-":
                        c.calc(Operation.MOINS);
                        break;
                    case "*":
                        c.calc(Operation.MULT);
                        break;
                    case "/":
                        c.calc(Operation.DIV);
                        break;
                    case "affich":
                        try{
                            System.out.println(c.getStack());
                        } catch(EmptyStackException e){
                            System.out.println("vide");
                        }
                        break;
                    case "exit":
                        break while_;
                    default:
                        try{
                            c.push(Integer.parseInt(s));
                        } catch(NumberFormatException e){
                            break;
                        }
                    }
        }
        scanner.close();
    }


}
