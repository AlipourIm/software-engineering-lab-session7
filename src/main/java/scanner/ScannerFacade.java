package scanner;

import scanner.token.Token;
import scanner.type.Type;

import java.util.Scanner;

public class ScannerFacade {
    private final Scanner scanner;
    private lexicalAnalyzer la;

    public ScannerFacade(Scanner scanner) {
        this.scanner = scanner;
    }

    private void initializeLexicalAnalyzer() {
        if (this.la == null)
            this.la = new lexicalAnalyzer(this.scanner);
    }

    public Token getNextToken() {
        initializeLexicalAnalyzer();
        return this.la.getNextToken();
    }

    public static Token newTokenFromString(String value) {
        return new Token(Token.getTyepFormString(value), value);
    }
}
