import java.util.*;
import java.util.stream.*;
import java.lang.Class;
class Subscriber{


    private Integer numberOfDevices = 0;
    private ArrayList<Plan> plans = new ArrayList<Plan>();

    public Boolean buyPlan(Plan plan){
      // Search the plans the user already has
      // If user has same plan and same category return false
      // The below operation is expensive. We might think of alternative ways to go about the problem.
      List<Plan> filteredPlans = this.plans.stream().filter(p -> p.getClass().equals(plan.getClass()) && p.getCategory().equals(plan.getCategory())).collect(
        Collectors.toList());
      // This means that there is a plan of same class with same category so that is not allowed
      if(filteredPlans.size()>0) return false;
      this.plans.add(plan);
      return true;
    }

    


    

    
    

  
}