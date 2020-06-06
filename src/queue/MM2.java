package queue;

import java.lang.Math;

public class MM2 extends QueuingModels {

    public int getFactorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public void CalculatePo() {
        float temp, q, z, p;
        q = 0;
        this.CalculateUtilizationFactor();
        for (int i = 0; i <= (getM() - 1); i++) {
            temp =  (float) ((1 / (getFactorial(i))) * Math.pow(getUtilizationFactor(), i));
            q += temp;

        }
        z = (float) ((1 / getFactorial(getM())) * Math.pow(getUtilizationFactor(), getM())
                * (getM() * getUnitsMean() / (getM() * getUnitsMean() - getArrivalsMean())));
        p = 1 /(z + q) ;
        super.setPo(p);

    }

    public void CalculateL() {
        float temp, l;
        this.CalculateUtilizationFactor();
        this.CalculatePo();
        temp = (float) ((getArrivalsMean() * getUnitsMean() * Math.pow(getUtilizationFactor(), getM()))
                / (getFactorial(getM() - 1) * Math.pow(getM() * getUnitsMean() - getArrivalsMean(), 2)));
        l = temp * getPo() + getUtilizationFactor();
        super.setL(l);

    }

    public void CalculateW() {

        float w;
        this.CalculateL();
        w = getL() / getArrivalsMean();
        super.setW(w);

    }

    public void CalculateLq() {

        float lq;
        this.CalculateUtilizationFactor();
        this.CalculateL();
        lq = getL() - super.getUtilizationFactor();
        super.setLq(lq);

    }

    public void CalculateWq() {
        float wq;
        this.CalculateLq();
        wq = super.getLq() / super.getArrivalsMean();
        super.setWq(super.getLq() / super.getArrivalsMean());
    }

    public void CalculateUtilizationFactor() {
        float utilizationFactor = super.getArrivalsMean() / super.getUnitsMean();
        super.setUtilizationFactor(utilizationFactor);
    }

    void CalculateP() {
        float p = super.getArrivalsMean() / (super.getM() * super.getUnitsMean());
        super.setP(p);
    }

}