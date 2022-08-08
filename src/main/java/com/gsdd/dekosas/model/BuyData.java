package com.gsdd.dekosas.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BuyData {

  private String email;
  private String name;
  private String lastName;
  private String address;
  private String country;
  private String state;
  private String city;
  private Long number;
  private String docType;
  private Long docNumber;
  
}
