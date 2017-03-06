package dip.lab3.instructor.solution1;

/**
 *
 * @author Instlogin
 */
public class MessageService {
    private MessageInputStrategy input;
    private MessageOutputStrategy output;
    
    public MessageService(MessageInputStrategy input, MessageOutputStrategy output) {
        this.input = input;
        this.output = output;
    }
    
    public void produceMessage() {
        output.sendMessage(input);
    }

    public MessageInputStrategy getInput() {
        return input;
    }

    public void setInput(MessageInputStrategy input) {
        this.input = input;
    }

    public MessageOutputStrategy getOutput() {
        return output;
    }

    public void setOutput(MessageOutputStrategy output) {
        this.output = output;
    }
    
    
}
