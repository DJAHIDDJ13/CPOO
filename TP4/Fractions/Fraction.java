
/**
 * Décrivez votre classe ClFraction ici.
 *
 * @author ABDELMOUMENE
 * @version 7/07/18
 */
public class Fraction implements interfaceFraction
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int num;
    public int getNum(){
        return num;
    }
    private int den;
    public int getDen(){
        return den;
    }
    /**
     * Constructeur d'objets de classe Fraction
     */
    public Fraction(int num, int den)
    {
        this.num = num;
        this.den = den;
    }
    public Fraction(int num)
    {
        this(num, 1);
    }
    public Fraction()
    {
        this(0);
    }
    public Fraction add(Fraction f){
        return new Fraction(f.num*den+f.den*num,f.den * den);
    }
    public boolean equals(Fraction f){
        return f.num * den == f.den * num;
    }
    public double valeur(){
        return ((double) num)/((double)den);
    }
    public String toString(){
        return num+"/"+den;
    }
}
