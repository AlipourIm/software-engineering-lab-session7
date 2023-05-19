package semantic.symbol;

import codeGenerator.varType;

public class BoolSymbol extends Symbol{
    public BoolSymbol(int address) {
        super(address);
    }

    @Override
    public varType getVarType() {
        return varType.Bool;
    }
}
