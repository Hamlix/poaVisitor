/**
 * Created by galax on 07/11/2016.
 */
public class Client implements IVisitable{
    private String name;

    public Client(String name){
        this.name=name;
    }

    public void accept(IVisitor visiteur) {

    }
    public String getName() {
        return name;
    }
    public void addClient(Client c){

    }

}
