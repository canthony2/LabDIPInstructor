
package dip.lab2.instructor.solution1;

/**
 *
 * @author Instlogin
 */
public class TipService {
    private TipCalculator tipCalculator;

    public TipService(TipCalculator tipCalculator) {
        setTipCalculator(tipCalculator);
    }
    
    public double getTip() {
       return tipCalculator.getCalculatedTip();
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    
}
