/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.debugreport;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum DebugReportType implements org.apache.thrift.TEnum {
  NORMAL(0),
  NO_EMAIL(1);

  private final int value;

  private DebugReportType(int value) {
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
  public static DebugReportType findByValue(int value) { 
    switch (value) {
      case 0:
        return NORMAL;
      case 1:
        return NO_EMAIL;
      default:
        return null;
    }
  }
}