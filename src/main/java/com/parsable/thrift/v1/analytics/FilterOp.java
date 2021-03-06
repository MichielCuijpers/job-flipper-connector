/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.analytics;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum FilterOp implements org.apache.thrift.TEnum {
  CONTAINS(1),
  CONTAINS_NONE(2),
  CONTAINS_ALL(3),
  MATCHES(4),
  NOT_MATCHES(5);

  private final int value;

  private FilterOp(int value) {
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
  public static FilterOp findByValue(int value) { 
    switch (value) {
      case 1:
        return CONTAINS;
      case 2:
        return CONTAINS_NONE;
      case 3:
        return CONTAINS_ALL;
      case 4:
        return MATCHES;
      case 5:
        return NOT_MATCHES;
      default:
        return null;
    }
  }
}
