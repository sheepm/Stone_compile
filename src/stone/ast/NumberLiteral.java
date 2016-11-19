package stone.ast;

import stone.Token;

/**
 * Created by Administrator on 2016/11/19 0019.
 */
public class NumberLiteral extends ASTLeaf {

    public NumberLiteral(Token t) {
        super(t);
    }

    public int value(){
        return token().getNumber();
    }
}
