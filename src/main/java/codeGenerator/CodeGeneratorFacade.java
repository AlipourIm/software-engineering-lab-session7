package codeGenerator;

import scanner.token.Token;

public class CodeGeneratorFacade {
    private CodeGenerator codeGenerator;

    private void initializeCodeGenerator() {
        if (codeGenerator == null) {
            this.codeGenerator = new CodeGenerator();
        }
    }

    public static Address newAddress(int num, varType varType, TypeAddress Type) {
        return new Address(num, varType, Type);
    }

    public void printMemory() {
        initializeCodeGenerator();
        this.codeGenerator.printMemory();
    }

    public void semanticFunction(int func, Token next) {
        initializeCodeGenerator();
        this.codeGenerator.semanticFunction(func, next);
    }
}
