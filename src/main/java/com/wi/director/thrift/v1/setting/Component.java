/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.setting;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Component implements org.apache.thrift.TEnum {
  ANDROID(1),
  IOS(2),
  WEB(3);

  private final int value;

  private Component(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Component findByValue(int value) { 
    switch (value) {
      case 1:
        return ANDROID;
      case 2:
        return IOS;
      case 3:
        return WEB;
      default:
        return null;
    }
  }
}
