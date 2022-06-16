package nl.saxion.cos.type.symbol;

import nl.saxion.cos.type.DataType;

public class VariableSymbol extends Symbol {

    private DataType dataType;
    private final int index;

    public VariableSymbol(String name, DataType dataType, int index) {
        super(name);
        this.dataType = dataType;
        this.index = index;
    }

    public DataType getDataType() {
        return dataType;
    }

    public int getIndex() {
        return index;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
}
