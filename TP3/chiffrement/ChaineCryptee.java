
/**
 * Pour cryptée les chaines des caractéres
 *
 * @author ABDELMOULMENE
 * @version 1
 */
public class ChaineCryptee
{
    private int decalage;
    private String enClair;
    /**
     * Constructeur d'objets de classe ChaineCryptee 
     * 
     * @param enClair pour initialiser la chaine des caractéres enClair
     * @param decalage pour initialiser le variable decalage
     */
    public static ChaineCryptee fromCrypte(String encryptee, int decalage)
    {
        return new ChaineCryptee(encryptee, -decalage);
    }
    public static ChaineCryptee fromClair(String enClair, int decalage)
    {
        return new ChaineCryptee(enClair, decalage);
    }
    private ChaineCryptee(String enClair, int decalage)
    {
        // initialisation des variables d'instance
        this.decalage = decalage;
        this.enClair = enClair;
    }

    /**
     * Pour voir la chaine decryptée
     * @return     la chaine des caractéres enClair decrypteé
     */
    public String decrypte()
    {
        if(decalage<0)
        {
            String res = "";
            if(enClair == null)
            {
                return null;
            }
            for(int i=0; i<enClair.length(); i++){
                res += decaleCaractere(enClair.charAt(i),decalage);
            }
            return res;
        }
        else
        {
            return enClair;
        }
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
    public String encrypte()
    {
        if(decalage<0)
        {
            return enClair;
        }
        else
        {
            String res = "";
            if(enClair == null)
            {
                return null;
            }
            for(int i=0; i<enClair.length(); i++){
                res += decaleCaractere(enClair.charAt(i),decalage);
            }
            return res;
        }
    }
}
