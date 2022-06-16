package nl.saxion.cos.type;

public enum DataType {
    STRING("a", "Ljava/lang/String;"),
    INT("i", "I"),
    FLOAT("f", "F"),
    BOOL("i", "I"),
    VOID("v", "V");

    private final String descriptor;
    private final String mnemonic;

    DataType(String mnemonic, String descriptor) {
        this.mnemonic = mnemonic;
        this.descriptor = descriptor;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public String getMnemonic() {
        return mnemonic;
    }
}
