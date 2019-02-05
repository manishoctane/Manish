package com.alstom.reflection.field;
public class PrivateObject {

  @SuppressWarnings("unused")
private String privateString = null;

  public PrivateObject(String privateString) {
    this.privateString = privateString;
  }
}