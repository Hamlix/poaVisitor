/**
 * Created by galax on 07/11/2016.
 */
public interface IVisitor {
    public void visit (Client c);
    public void visit (Commande o);
    public void visit (Ligne l);
    public void visit (GroupeClient gc);
}
