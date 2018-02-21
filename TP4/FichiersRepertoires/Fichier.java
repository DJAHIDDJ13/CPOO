
/**
 * Décrivez votre classe abstraite Fichier ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Fichier
{
    // variable d'instance - remplacez cet exemple par le vôtre
    private String nom;
    private int taille;
    
    public Fichier(String nom, int taille){
        this.nom = nom;
        this.taille = taille;
    }
    public String toString(){
        return nom+" "+taille;
    }
}
