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

public enum JobState implements org.apache.thrift.TEnum {
  ACTIVE(1),
  COMPLETED(2),
  PLANNING(3);

  private final int value;

  private JobState(int value) {
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
  public static JobState findByValue(int value) { 
    switch (value) {
      case 1:
        return ACTIVE;
      case 2:
        return COMPLETED;
      case 3:
        return PLANNING;
      default:
        return null;
    }
  }
}
