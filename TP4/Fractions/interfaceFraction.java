
/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public interface interfaceFraction
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public static final int[] ZERO = {0,1};
    public static final int[] UN   = {1,1};

    public Fraction add(Fraction f);
    public boolean equals(Fraction f);
    public double valeur();
    
}
