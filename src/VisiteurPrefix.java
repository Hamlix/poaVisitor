/**
 * Created by galax on 07/11/2016.
 */
public class VisiteurPrefix implements IVisitor {
    @Override
    public void visit(Client c) {
        System.out.println("Je suis un client !");
        /* Fonction qui ne marche pas
        c.getComponents().stream.forEach(commande -> commande.accept(visiteur.this));
         */
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
