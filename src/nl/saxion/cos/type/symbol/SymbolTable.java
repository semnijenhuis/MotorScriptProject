package nl.saxion.cos.type.symbol;

import nl.saxion.cos.compiler.CompilerException;
import nl.saxion.cos.type.DataType;

import java.util.HashMap;

public class SymbolTable {

    private int lastUsedIndex;
    private final SymbolTable parentScope;

    private final HashMap<String, Symbol> symbols = new HashMap<>();

    public SymbolTable(SymbolTable parent, int lastUsedIndex) {
        this.parentScope = parent;
        this.lastUsedIndex = lastUsedIndex;
    }

    public void addVariableSymbol(String name, DataType type) {
        //Uncomment this code if variable overriding is not allowed. (in MotorScript it is)
//        if(symbols.get(name) != null) {
//            throw new CompilerException("Variable " + name + " already exists in the scope");
//        }

        this.symbols.put(name, new VariableSymbol(name, type, lastUsedIndex++));
    }

    public void addObjectSymbol(String name) {

        if (symbols.get(name) != null) {
            throw new CompilerException("Object " + name + " already exists in the scope");

        }
        symbols.put(name, new ObjectSymbol(name, lastUsedIndex++));
    }

    public void addFunctionSymbol(String name, DataType type, DataType[] paramTypes) {
        if (symbols.get(name) != null) {
            throw new CompilerException("Function " + name + "already exists in the scope");
        }
        symbols.put(name, new FunctionSymbol(name, type, paramTypes));
    }

    public Symbol lookup(String name) {
        Symbol symbol = this.symbols.get(name);
        if (symbol == null && parentScope != null) {
            symbol = parentScope.lookup(name);
        }
        return symbol;
    }

    public SymbolTable openScope(int lastStackIndex) {
        return new SymbolTable(this, lastStackIndex);
    }

    public SymbolTable closeScope() {
        return this.parentScope;
    }

    public int getLastUsedIndex() {
        return this.lastUsedIndex;
    }

    public SymbolTable openFunctionScope() {
        return openScope(0);
    }
}
