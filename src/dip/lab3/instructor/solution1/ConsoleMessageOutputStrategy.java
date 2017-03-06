package dip.lab3.instructor.solution1;

/**
 *
 * @author Instlogin
 */
public class ConsoleMessageOutputStrategy implements MessageOutputStrategy {
    
    @Override
    public final void sendMessage(final MessageInputStrategy msgInput) {
        Message msg = msgInput.getMessage();
        System.out.println(msg.getMessageAsString());
    }
    
}
