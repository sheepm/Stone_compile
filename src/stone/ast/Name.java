package stone.ast;

import stone.Token;

/**
 * Created by sheepm on 2016/11/19 0019.
 */
public class Name extends ASTLeaf{

    public Name(Token t) {
        super(t);
    }

    public String name(){
        return token().getText();
    }
}
