package changecase;

/**
 *
 * @author jlombardo
 */
public class TitleCaseFormatter implements TextFormatter {

    @Override
    public String changeCase(String s) {
        String[] words = s.split(" ");
        String result = "";
        for(String word : words) {
            String ch = word.substring(0, 1);
            String balance = word.substring(1);
            ch = ch.toUpperCase();
            result += ch + balance.toLowerCase() + " ";
        }
        
        return result;
    }
    
}
