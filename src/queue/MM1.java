package queue;

public class MM1 extends QueuingModels {



    public void CalculateL() {
    float l = ( super.getArrivalsMean() / (super.getUnitsMean() - super.getArrivalsMean())) ;
        super.setL(l) ;

    }


    public void CalculateW() {
        float w = ( 1 / ( super.getUnitsMean() - super.getArrivalsMean() ) ) ;
        super.setW(w);
    }


    public void CalculateLq() {
        this.CalculateUtilizationFactor();
        this.CalculateL();
        float lq = super.getUtilizationFactor()*super.getL();
        super.setLq(lq);
    }


    public void CalculateWq() {
        this.CalculateUtilizationFactor();
        this.CalculateW();
        float wq = super.getUtilizationFactor()*super.getW();
        super.setWq(wq);
    }


    public void CalculateUtilizationFactor() {
        float utilizationFactor=super.getArrivalsMean()/super.getUnitsMean();
        super.setUtilizationFactor(utilizationFactor);
    }


    public void CalculatePercentIdle() {
        this.CalculateUtilizationFactor();
        float percentIdle=1-super.getUtilizationFactor();
        super.setPercentIdle(percentIdle);
    }

    public void CalculatePercentK() {
        this.CalculateUtilizationFactor();
        float percentK = (float) Math.pow(super.getUtilizationFactor(), (super.getK()+1));
        super.setPercentK(percentK);
    }


}

