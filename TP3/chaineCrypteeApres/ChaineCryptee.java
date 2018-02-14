
/**
 * Pour cryptée les chaines des caractéres
 *
 * @author ABDELMOULMENE
 * @version 1
 */
public class ChaineCryptee
{
    private int decalage;
    private String encryptee;
    /**
     * Constructeur d'objets de classe ChaineCryptee 
     * 
     * @param encryptee pour initialiser la chaine des caractéres enClair
     * @param decalage pour initialiser le variable decalage
     */
    public ChaineCryptee(String encryptee, int decalage)
    {
        // initialisation des variables d'instance
        this.decalage = decalage;
        this.encryptee = encryptee;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     * @return     la chaine des caractéres enClair decrypteé
     */
    public String decrypte()
    {
        String res = "";
        if(encryptee == null)
        {
            return null;
        }
        for(int i=0; i<encryptee.length(); i++){
            res += decaleCaractere(encryptee.charAt(i),-decalage);
        }
        return res;
    }
    
    /**
     * Décale un caractère majuscule.
     * Les lettres en majuscule ('A' - 'Z') sont décalés de <code>decalage</code>
     * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
     *
     * @param c le caractère à décaler
     * @param decalage le décalage à appliquer
     * @return le caractère décalé
     */
    private static char decaleCaractere(char c, int decalage)
    {
        return (c < 'A' || c > 'Z')? c : (char)(Math.floorMod((c - 'A' + decalage), 26) + 'A');
    }

    /**
     * Encrypte la chaine des caracteres enClair
     * avec un decalage
     * @return la chaine enClair crypteé avec decalage si enClair est different de null sinon null
     */
    {
        return encryptee;
    }
}
