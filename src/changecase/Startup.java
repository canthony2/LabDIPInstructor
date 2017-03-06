package changecase;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        TextFormatter formatter = new UpperCaseFormatter();
        FormatService service = new FormatService();
        String result = service.changeCase(formatter,"HELLO WORLD");
        System.out.println(result);
    }
}
