package dip.lab3.instructor.solution1;

/**
 *
 * @author Instlogin
 */
public class GoodMorningMessageInputStrategy implements MessageInputStrategy {
    private static final String MSG = "Good Morning";
    
    public final Message getMessage() {
        Message msg = new Message(MSG);
        return msg;
    }
}
