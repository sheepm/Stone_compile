package stone.ast;


import java.util.Iterator;

/**
 * Created by sheepm on 2016/11/19 0019.
 */
public abstract class ASTree implements Iterable<ASTree>{

    public abstract ASTree child(int i);

    public abstract int numChildren();

    public abstract Iterator<ASTree> children();

    public abstract String location();

    @Override
    public Iterator<ASTree> iterator() {
        return children();
    }
}
