 package in404.exo61;
/**
 * Décrivez votre classe Client ici.
 *
 * @author ABDELMOUMENE
 * @version feb. 2018
 */
public class Client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    Serveur server;
    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String nom)
    {
        // initialisation des variables d'instance
        this.nom = nom;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public boolean seConnecter(Serveur serveur)
    {
        // Insérez votre code ici
        
        if(serveur.connect(this))
        {
            server = serveur;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void envoyer(String message)
    {
        server.diffuser(message);
    }
    public String recevoir()
    {
        return server.diffuser();
    }
}
