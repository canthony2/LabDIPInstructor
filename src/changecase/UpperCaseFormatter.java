package changecase;

/**
 *
 * @author jlombardo
 */
public class UpperCaseFormatter implements TextFormatter {
    
    @Override
    public String changeCase(String s) {
        return s.toUpperCase();
    }
}
