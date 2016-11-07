/**
 * Created by galax on 07/11/2016.
 */
public class Commande implements IVisitable{
    private String name;
    private String ligneName;

    public Commande(String name) {
        this.name = name;
    }

    public Commande(String name, String ligneName) {
        this.name = name;
        this.ligneName = ligneName;
    }

    public String getName() {
        return name;
    }
    public void addLigne(Ligne l){
        this.ligneName=l.getName();
    }

    public void accept(IVisitor visiteur) {

    }
}
