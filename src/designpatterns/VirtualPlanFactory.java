package designpatterns;

public class VirtualPlanFactory implements IPlanFactory{
    @Override
    public Plan createPlan() {
        return new VirtualPlan();
    }
}
