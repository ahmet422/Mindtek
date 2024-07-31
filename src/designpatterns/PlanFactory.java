package designpatterns;

public class PlanFactory {

    public Plan createPlan(String planType){
        if(planType.equals("Domestic")) return new DomesticPlan();
        if(planType.equals("Commercial")) return new CommercialPlan();
        if(planType.equals("Institutional")) return new InstitutionalPlan();
        if(planType.equals("Digital")) return new DigitalPlan();
        return null;
    }
}
