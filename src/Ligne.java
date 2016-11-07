/**
 * Created by galax on 07/11/2016.
 */
public class Ligne implements IVisitable{
    private String name;

    public Ligne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(IVisitor visiteur) {
        visiteur.visit(this);
    }
}
