package com.example.geektrust;

class Topup{
  
  private String category;
  private Integer devices;
  private Integer validity;
  private Integer price; 
  private Integer totalPrice;
    
  
  Topup(String category,Integer devices,Integer validity,Integer price){
    this.category = category;
    this.devices = devices;
    this.validity = validity;
    this.price = price;
  }

  public void setTotalPrice(Integer months){
    this.totalPrice = months*this.price;
  }

  public Integer getTotalPrice(){
    return this.totalPrice;
  }

  public String getCategory(){
    return this.category;
  }

  public Integer getDevices(){
    return this.devices;
  }

  public Integer getValidity(){
    return this.validity;
  }

  public Integer getPrice(){
    return this.price;
  }
  
}