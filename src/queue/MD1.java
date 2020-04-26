package queue;


public class MD1 extends QueuingModels {

    public void CalculateL() {
        this.CalculateLq();
        float l = super.getLq()+super.getUtilizationFactor() ;
        super.setL(l) ;

    }


    public void CalculateW() {
        this.CalculateWq();
        float w = super.getWq()+(1/getUnitsMean());
        super.setW(w);
    }


    public void CalculateLq() {
        this.CalculateWq();
        float lq = super.getWq()*super.getArrivalsMean();
        super.setLq(lq);
    }


    public void CalculateWq() {
        float wq =  super.getArrivalsMean()/((2*getUnitsMean())*(getUnitsMean()-getArrivalsMean()));
        super.setWq(wq);
    }


}
