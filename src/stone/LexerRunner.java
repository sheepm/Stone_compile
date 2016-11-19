package stone;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Administrator on 2016/11/19 0019.
 */
public class LexerRunner {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader("d:\\hello.txt"));
        Lexer lexer = new Lexer(reader);
        for (Token t; (t = lexer.read()) != Token.EOF;){
            System.out.print("=> " + t.getText());
        }
    }
}
