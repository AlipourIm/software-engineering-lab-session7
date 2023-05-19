package semantic.symbol;

import codeGenerator.varType;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public abstract class Symbol {
    public int address;

    protected Symbol(int address) {
        this.address = address;
    }

    public static Symbol instantiateSymbol(SymbolType type, int address) {
        switch (type) {
            case Bool:
                return new BoolSymbol(address);
            case Int:
                return new IntSymbol(address);
            default:
                throw new IllegalArgumentException();
        }
    }

    public abstract varType getVarType();
}
