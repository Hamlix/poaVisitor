import java.util.ArrayList;

/**
 * Created by galax on 07/11/2016.
 */
public class Commande implements IVisitable{
    private String name;
    private String ligneName;
    private ArrayList<Ligne> listeLigne;
    //capacité max de la liste Ligne
    private int capacité=100;
    //Ou on en est du remplissage de la liste
    private int remplissage;

    public Commande(String name) {
        this.name = name;
        this.remplissage=0;
    }
/* Constructeur est inutile
    public Commande(String name, String ligneName) {
        this.name = name;
        this.ligneName = ligneName;
    }
*/
    public String getName() {
        return name;
    }

    public ArrayList<Ligne> getListeLigne() {
        return listeLigne;
    }

    public int getRemplissage() {
        return remplissage;
    }

    public void addLigne(Ligne l){
        if(this.remplissage<this.capacité){
            listeLigne.add(l);
            this.remplissage+=1;
        }
    }

    public void accept(IVisitor visiteur) {
        visiteur.visit(this);
    }
}
