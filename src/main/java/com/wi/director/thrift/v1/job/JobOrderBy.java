/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.job;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum JobOrderBy implements org.apache.thrift.TEnum {
  TITLE(1),
  CREATED_AT(2),
  PLANNED_START_AT(3),
  LAST_MODIFIED_AT(4),
  JOB_TYPE(5),
  STARTED_AT(6),
  COMPLETED_AT(7),
  LOOKUP_ID(8);

  private final int value;

  private JobOrderBy(int value) {
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
  public static JobOrderBy findByValue(int value) { 
    switch (value) {
      case 1:
        return TITLE;
      case 2:
        return CREATED_AT;
      case 3:
        return PLANNED_START_AT;
      case 4:
        return LAST_MODIFIED_AT;
      case 5:
        return JOB_TYPE;
      case 6:
        return STARTED_AT;
      case 7:
        return COMPLETED_AT;
      case 8:
        return LOOKUP_ID;
      default:
        return null;
    }
  }
}
