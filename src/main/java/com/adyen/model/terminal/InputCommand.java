/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InputCommand
 */
public enum InputCommand {
  
  DECIMALSTRING("DecimalString"),
  
  DIGITSTRING("DigitString"),
  
  GETANYKEY("GetAnyKey"),
  
  GETCONFIRMATION("GetConfirmation"),
  
  GETFUNCTIONKEY("GetFunctionKey"),
  
  GETMENUENTRY("GetMenuEntry"),
  
  PASSWORD("Password"),
  
  SITEMANAGER("SiteManager"),
  
  TEXTSTRING("TextString");

  private String value;

  InputCommand(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InputCommand fromValue(String value) {
    for (InputCommand b : InputCommand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

