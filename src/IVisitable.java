import com.sun.xml.internal.stream.Entity;

/**
 * Created by galax on 07/11/2016.
 */
public interface IVisitable {

    public void accept(IVisitor visiteur);

}

