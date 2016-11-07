import com.sun.xml.internal.stream.Entity;

import java.util.ArrayList;

/**
 * Created by galax on 07/11/2016.
 */
public class Client implements IVisitable{
    private String name;
    private ArrayList<Commande> listeCommande;
    //capacité max de la liste commande
    private int capacité=100;
    //Ou on en est du remplissage de la liste
    private int remplissage;

    public Client(String name){
        this.name=name;
        this.remplissage=0;
    }

    public int getRemplissage() {
        return remplissage;
    }

    public ArrayList<Commande> getListeCommande() {
        return listeCommande;
    }

    public String getName() {
        return name;
    }
    public void addCommande(Commande c){
        if(this.remplissage < this.capacité){
            this.listeCommande.add(c);
            this.remplissage+=1;
        }
    }

    @Override
    public void accept(IVisitor visiteur) {
        visiteur.visit(this);
    }

}
