import java.util.LinkedList;
import java.util.List;

public class Symbol {
    private char symbol;
    private List<Symbol> symbols;

    public Symbol(char symbol) {
        this.symbol = symbol;
        this.symbols = new LinkedList<>();
    }

    public void addSymbols(List<Symbol> newSymbols) {
        symbols.addAll(newSymbols);
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public String getSymbolsAsString() {
        StringBuilder result = new StringBuilder();
        for (Symbol symbol : symbols) {
            result.append(symbol);
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return symbol + "";
    }
}