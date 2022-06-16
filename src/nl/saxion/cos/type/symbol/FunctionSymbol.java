package nl.saxion.cos.type.symbol;

import nl.saxion.cos.type.DataType;

public class FunctionSymbol extends Symbol {

    private final DataType returnType;
    private final DataType[] parameterTypes;

    public FunctionSymbol(String name, DataType returnType, DataType[] parameterTypes) {
        super(name);
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public DataType[] getParamTypes() {
        return parameterTypes;
    }

}
