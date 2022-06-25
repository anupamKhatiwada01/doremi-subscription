package com.example.geektrust;

import java.time.LocalDate;

class Plan{

  public String type;

  private String category;

  private Integer price;  
 
  private LocalDate dateOfPurchase;

  private Integer validity;

  Plan(String type,String category,Integer price,LocalDate dateOfPurchase,Integer validity){
   
    this.type = type;
    this.category = category;
    this.price = price;
    this.dateOfPurchase = dateOfPurchase;
    this.validity = validity;
    
  }

  public String getType(){
    return this.type;
  }

  public String getCategory(){
     return this.category;
  }
 
  public Integer getPrice(){
    return this.price;
  }

  public LocalDate getDateOfPurchase(){
    return this.dateOfPurchase;
  }

  public Integer getValidity(){
    return this.validity;
  }

  
}


class MusicPlan extends Plan{
  MusicPlan(String category,Integer price,LocalDate dateOfPurchase,Integer validity){
    super("music",category,price,dateOfPurchase,validity);
  }
}

class VideoPlan extends Plan{
  VideoPlan(String category,Integer price,LocalDate dateOfPurchase,Integer validity){
    super("video",category,price,dateOfPurchase,validity);
  }
}

class PodcastPlan extends Plan{
  PodcastPlan(String category,Integer price,LocalDate dateOfPurchase,Integer validity){
    super("podcast",category,price,dateOfPurchase,validity);
  }
}


