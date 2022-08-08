package com.gsdd.dekosas.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginData {
  
  String user;
  String pass;

}
