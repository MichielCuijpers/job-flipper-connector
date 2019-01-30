/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.jobtemplate;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Status of a job template
 */
public enum JobTemplateStatus implements org.apache.thrift.TEnum {
  PUBLISHED(1),
  UNPUBLISHED(2),
  IN_REVIEW(3);

  private final int value;

  private JobTemplateStatus(int value) {
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
  public static JobTemplateStatus findByValue(int value) { 
    switch (value) {
      case 1:
        return PUBLISHED;
      case 2:
        return UNPUBLISHED;
      case 3:
        return IN_REVIEW;
      default:
        return null;
    }
  }
}