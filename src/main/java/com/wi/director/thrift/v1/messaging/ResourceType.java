/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.messaging;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ResourceType implements org.apache.thrift.TEnum {
  JOB(1),
  USER(2),
  STEP(3),
  DOCUMENT(4),
  JOB_ROLE(5),
  ALL_USERS_IN_JOB(6),
  FIELD(7),
  OTHER(8),
  LOOKUP_ID(9);

  private final int value;

  private ResourceType(int value) {
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
  public static ResourceType findByValue(int value) { 
    switch (value) {
      case 1:
        return JOB;
      case 2:
        return USER;
      case 3:
        return STEP;
      case 4:
        return DOCUMENT;
      case 5:
        return JOB_ROLE;
      case 6:
        return ALL_USERS_IN_JOB;
      case 7:
        return FIELD;
      case 8:
        return OTHER;
      case 9:
        return LOOKUP_ID;
      default:
        return null;
    }
  }
}
