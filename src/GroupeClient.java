import java.util.ArrayList;

/**
 * Created by galax on 07/11/2016.
 */
public class GroupeClient implements IVisitable{
    private String name;
    private ArrayList<Client> listeClient;
    //capacité max de la liste client
    private int capacité=100;
    //Ou on en est du remplissage de la liste
    private int remplissage;

    public GroupeClient(String name) {
        this.name = name;
        this.remplissage=0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Client> getListeClient() {
        return listeClient;
    }

    public int getRemplissage() {
        return remplissage;
    }

    public void addClient(Client c){
        if(this.remplissage< this.capacité){
            listeClient.add(c);
            this.remplissage+=1;
        }
    }

    @Override
    public void accept(IVisitor visiteur) {
        visiteur.visit(this);
    }
}
