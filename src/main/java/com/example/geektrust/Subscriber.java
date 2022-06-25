package com.example.geektrust;


import java.util.*;
import java.util.stream.*;

class Subscriber{


    private Integer numberOfDevices = 0;
    private ArrayList<Plan> plans = new ArrayList<Plan>();
    private Topup topup;

  
    
    public Boolean buyPlan(Plan plan){
    
      List<Plan> filteredPlans = this.plans.stream().filter(p -> p.getType().equals(plan.getType()) && p.getCategory().equals(plan.getCategory())).collect(Collectors.toList());

      if(filteredPlans.size()>0) return false;
      this.plans.add(plan);
      return true;
    }


    public Boolean addTopUp(Topup topup){
      if(this.plans.size()==0 || this.numberOfDevices>1) return false;
      this.topup = topup;
      return true;
    }
    

  
}