import java.util.HashMap;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;

abstract class Plan{
  

  private String category = Categories.FREE.name();
  // We will change format and use this date object later
  // For now keeping it as date object is more valuable because we can do addition/subtraction operations on it directly without worrying about the edge cases
  private LocalDate dateOfPurchase = LocalDate.now();
  
  Plan(){
   for(Categories c: Categories.values()){
     this.categories.put(c.name(), 0);
   }
  }
  private HashMap <String,Integer> categories = new HashMap<String,Integer>();
  
  public void setCategory(String category,Integer price) throws Exception {
    if(!this.categories.containsKey(category)) throw new Exception("Invalid category added");
    this.category = category;
    categories.put(this.category,price);
  }

  public String getCategory(){
     return this.category;
  }

  
}


// Prices for each plan and category are properties of particular objects so we need to contain them within the object
// We also need to store the start date for each plan. Start date will be the day the plan was purchased so it will be the current date. We will use whatever date object we can get by default for implementing this. Plus start date will be a property of the parent class as all Plans will have start date.
// When we buy a new plan we will first create an object of that particular plan, add in the catgory and the price for each category. The date will be set as the current date.
class MusicPlan extends Plan{  
  MusicPlan(String category,Integer price) throws Exception{
    try{
      super.setCategory(category.toUpperCase(),price);
    }catch(Exception e){
      throw e;
    }
  }
}

class VideoPlan extends Plan{
  VideoPlan(String category,Integer price) throws Exception{
    try{
      super.setCategory(category.toUpperCase(),price);
    }catch(Exception e){
      throw e;
    }
  }
}

class PodcastPlan extends Plan{
  PodcastPlan(String category,Integer price) throws Exception{
    try{
      super.setCategory(category.toUpperCase(),price);
    }catch(Exception e){
      throw e;
    }
  }
}