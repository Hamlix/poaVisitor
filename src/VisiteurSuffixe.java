/**
 * Created by galax on 07/11/2016.
 */
public class VisiteurSuffixe implements IVisitor {
    @Override
    public void visit(Client c) {
       /* Fonction qui ne marche pas
       c.getComponents().stream.forEach(commande -> commande.accept(visiteur.this)); */
        System.out.println("Je suis un client !");
    }

    @Override
    public void visit(Commande o) {

    }

    @Override
    public void visit(Ligne l) {

    }

    @Override
    public void visit(GroupeClient gc) {

    }
}
