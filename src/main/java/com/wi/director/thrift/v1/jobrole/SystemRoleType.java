/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.jobrole;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SystemRoleType implements org.apache.thrift.TEnum {
  JOB_CREATOR(1),
  ISSUE_CREATOR(2),
  /**
   * Deprecated *
   */
  OBSERVER(200);

  private final int value;

  private SystemRoleType(int value) {
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
  public static SystemRoleType findByValue(int value) { 
    switch (value) {
      case 1:
        return JOB_CREATOR;
      case 2:
        return ISSUE_CREATOR;
      case 200:
        return OBSERVER;
      default:
        return null;
    }
  }
}
