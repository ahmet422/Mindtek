package designpatterns;

public class DigitalPlanFactory implements IPlanFactory{
    @Override
    public Plan createPlan() {
        return new DigitalPlan();
    }
}
