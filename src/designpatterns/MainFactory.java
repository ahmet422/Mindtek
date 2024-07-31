package designpatterns;

public class MainFactory {
    public static void main(String[] args) {
        PlanFactory pFactory = new PlanFactory();
        Plan dp = pFactory.createPlan("Domestic");
        dp.getRate();
        dp.calculateBill(10);
        DomesticPlan dpObj = new DomesticPlan();

        Plan cp = pFactory.createPlan("Commercial");
        cp.getRate(); //7.5
        cp.calculateBill(10);

        Plan ip = pFactory.createPlan("Institutional");
        ip.getRate();
        ip.calculateBill(10);

        DigitalPlanFactory digPlanFactory = new DigitalPlanFactory();

        Plan digP = digPlanFactory.createPlan();

        VirtualPlanFactory virtualPlanFactory = new VirtualPlanFactory();
        Plan vp = new VirtualPlanFactory().createPlan();
    }
}
