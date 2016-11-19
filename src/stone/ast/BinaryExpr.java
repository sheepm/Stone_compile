package stone.ast;

import java.util.List;

/**
 * Created by sheepm on 2016/11/19 0019.
 */
public class BinaryExpr extends ASTList{

    public BinaryExpr(List<ASTree> list) {
        super(list);
    }

    public ASTree left(){
        return child(0);
    }

    public String operator(){
        return ((ASTLeaf)child(1)).token().getText();
    }

    public ASTree right(){
        return child(2);
    }
}
