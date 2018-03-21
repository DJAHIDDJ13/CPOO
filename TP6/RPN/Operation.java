
/**
 * Décrivez votre classe operation ici.
 *
 * @author ABDELMOUMENE
 * @version 21/03/18
 */
public enum Operation
{
    PLUS('+'){
        public double eval(double d1, double d2){
            return d1+d2;
        }
    },
    MOINS('-'){
        public double eval(double d1, double d2){
            return d1-d2;
        }
    },
    MULT('*'){
        public double eval(double d1, double d2){
            return d1*d2;
        }
    },
    DIV('/'){
        public double eval(double d1, double d2){
            if(d2==0){
                throw new IllegalArgumentException("Div by 0");
            }
            return d1/d2;
        }        
    };
    private char symbole;
    Operation(char c){
        symbole = c;
    }
    
    public abstract double eval(double d1, double d2);
}
