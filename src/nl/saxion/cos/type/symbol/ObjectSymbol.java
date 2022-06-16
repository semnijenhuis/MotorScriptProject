package nl.saxion.cos.type.symbol;

public class ObjectSymbol extends Symbol {

    private int index;

    public ObjectSymbol(String name, int index) {
        super(name);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
