
/**
 * Décrivez votre classe ClFraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction implements interfaceFraction
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtr
    private int num;
    private int den;
    /**
     * Constructeur d'objets de classe ClFraction
     */
    public Fraction(int num, int den)
    {
        this.num = num;
        this.den = den;
    }
    public Fraction(int num)
    {

        this.num = num;
        this.den = 0;
    }
    public Fraction()
    {

        this.num = 1;
        this.den = 0;
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
}
