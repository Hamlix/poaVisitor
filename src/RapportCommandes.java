/**
 * Created by galax on 07/11/2016.
 */
public class RapportCommandes implements IVisitor {
    @Override
    public void visit(Client c) {
        System.out.println("Le visiteur a visité le client "+c.getName()+"qui a "+c.getRemplissage()+" commandes.");
    }

    @Override
    public void visit(Commande o) {
        System.out.println("Le visiteur a visité la commande"+o.getName()+"qui a "+o.getRemplissage()+" lignes.");
    }

    @Override
    public void visit(Ligne l) {
        System.out.println("Le visiteur a visité la ligne"+l.getName()+".");
    }

    @Override
    public void visit(GroupeClient gc) {
        System.out.println("Le visiteur a visité le groupe client "+gc.getName()+"qui a "+gc.getRemplissage()+" clients.");
    }
}
