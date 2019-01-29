/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.abac;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum AbacActorType implements org.apache.thrift.TEnum {
  USER(0),
  TEAM(1),
  JOB(2),
  JOB_TEMPLATE(3),
  TEMPLATE_SET(4),
  ISSUE(5),
  DATASHEET(6),
  POLICY(7),
  POLICY_SET(8);

  private final int value;

  private AbacActorType(int value) {
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
  public static AbacActorType findByValue(int value) { 
    switch (value) {
      case 0:
        return USER;
      case 1:
        return TEAM;
      case 2:
        return JOB;
      case 3:
        return JOB_TEMPLATE;
      case 4:
        return TEMPLATE_SET;
      case 5:
        return ISSUE;
      case 6:
        return DATASHEET;
      case 7:
        return POLICY;
      case 8:
        return POLICY_SET;
      default:
        return null;
    }
  }
}
