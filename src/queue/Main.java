package queue;

public class Main {


    public static void main(String[] args) {
        MM1 test = new MM1();
        test.setArrivalsMean(50);
        System.out.println("lambda : " + test.getArrivalsMean());
        test.setUnitsMean(70);
        System.out.println("meu : " + test.getUnitsMean());
        test.CalculateL();
        System.out.println("L : " + test.getL());
        test.CalculateW();
        System.out.println(" W is :" + test.getW());
        test.CalculateLq();
        System.out.println(" Lq is :" + test.getLq());
        test.CalculateWq();
        System.out.println(" Wq is :" + test.getWq());
        test.CalculateUtilizationFactor();
        System.out.println(" p is :" + test.getUtilizationFactor());
        test.CalculatePercentIdle();
        System.out.println(" percent idle is :" + test.getPercentIdle());
    }
}
