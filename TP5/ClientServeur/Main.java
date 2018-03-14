
import in404.exo61.*;
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    public static void main()
    {
        Serveur s = new Serveur();
        Client c1 = new Client("c1"),c2 = new Client("c2"),c3 = new Client("c3");
        // Insérez votre code ici
        c1.seConnecter(s);
        c2.seConnecter(s);
        c3.seConnecter(s);
        System.out.println("Envoi de \"HELLO WORLD\" par c1");
        c1.envoyer("HELLO WORLD!");
        System.out.println("Recu par c2: "+ c2.recevoir());
        System.out.println("Recu par c3: "+ c2.recevoir());
    }
}
