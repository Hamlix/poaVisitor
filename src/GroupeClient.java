/**
 * Created by galax on 07/11/2016.
 */
public class GroupeClient implements IVisitable{
    private String name;

    public GroupeClient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addClient(Client c){

    }

    @Override
    public void accept(IVisitor visiteur) {

    }
}
