import java.util.*;
/**
 * Décrivez votre classe Repertoire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Repertoire extends Fichier
{

    private List<Fichier> fichiers; 
    private int nbrFichiers;
    private boolean estRacine;
    /**
     * Constructeur d'objets de classe Repertoire
     */
    public Repertoire(String nom, int taille, boolean estRacine)
    {
        // initialisation des variables d'instance
        super(nom, taille);
        fichiers = new ArrayList<Fichier>();
        this.estRacine = estRacine;
        nbrFichiers = 0;
    } 
    public boolean ajouter(Fichier fichier){
        if(!fichiers.contains(fichier)){
            fichiers.add(fichier);
            nbrFichiers ++;
            return true;
        } else {
            return false;
        }
    }
    public int calcTaille(){
        int total = nbrFichiers;
        for (Fichier f: fichiers) {
            if(f.getClass() == Repertoire.class){
                total += ((Repertoire)f).calcTaille();
            }
        }
        return total;
    }
}
