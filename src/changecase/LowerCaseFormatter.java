package changecase;

/**
 *
 * @author jlombardo
 */
public class LowerCaseFormatter implements TextFormatter {
    
    @Override
    public String changeCase(String s) {
        return s.toLowerCase();
    }
}
