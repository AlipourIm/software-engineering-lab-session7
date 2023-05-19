package semantic.symbol;

import codeGenerator.varType;

public class IntSymbol extends Symbol{
    public IntSymbol(int address) {
        super(address);
    }

    @Override
    public varType getVarType() {
        return varType.Int;
    }
}
