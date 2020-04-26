package queue;

public class QueuingModels {
    private float ArrivalsMean ; // lambda
    private float UnitsMean ; //meu
    private float L ;
    private float W ;
    private float Lq ;
    private float Wq ;
    private float utilizationFactor ;
    private float percentIdle ;
    private float percentK ;
    private int k ;


    //Setters And Getters


    public float getArrivalsMean() {
        return ArrivalsMean;
    }

    public void setArrivalsMean(float arrivalsMean) {
        ArrivalsMean = arrivalsMean;
    }

    public float getUnitsMean() {
        return UnitsMean;
    }

    public void setUnitsMean(float unitsMean) {
        UnitsMean = unitsMean;
    }

    public float getL() {
        return L;
    }

    public void setL(float l) {
        L = l;
    }

    public float getW() {
        return W;
    }

    public void setW(float w) {
        W = w;
    }

    public float getLq() {
        return Lq;
    }

    public void setLq(float lq) {
        Lq = lq;
    }

    public float getWq() {
        return Wq;
    }

    public void setWq(float wq) {
        Wq = wq;
    }

    public float getUtilizationFactor() {
        return utilizationFactor;
    }

    public void setUtilizationFactor(float utilizationFactor) {
        this.utilizationFactor = utilizationFactor;
    }

    public float getPercentIdle() {
        return percentIdle;
    }

    public void setPercentIdle(float percentIdle) {
        this.percentIdle = percentIdle;
    }

    public float getPercentK() {
        return percentK;
    }

    public void setPercentK(float percentK) {
        this.percentK = percentK;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}

