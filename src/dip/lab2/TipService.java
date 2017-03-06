package dip.lab2;

/**
 *
 * @author jlombardo
 */
public class TipService {
    private BaggageServiceTipCalculator calc;

    public TipService(BaggageServiceTipCalculator calc) {
        this.calc = calc;
    }
    
    
    public double getTip() {
        return calc.getTipForBaggeHandler();
    }
}
