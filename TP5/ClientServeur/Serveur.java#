


import java.util.*;
/**
 * Décrivez votre classe Serveur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Serveur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Client> connectee = new ArrayList<Client>();
    private int nbrClients;
    private String lstMessage;
    /**
     * Constructeur d'objets de classe Serveur
     */
    public Serveur()
    {
        // initialisation des variables d'instance
        
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public boolean connect(Client client)
    {
        // Insérez votre code ici
        if(nbrClients<10){
            connectee.add(client);
            return true;
        }
        else
        {
            return false;
        }
    }
    public String diffuser(){
        return lstMessage;
    }
    public void diffuser(String message){
        lstMessage = message;
        
    }
}
