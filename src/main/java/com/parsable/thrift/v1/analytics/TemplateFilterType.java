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

public enum TemplateFilterType implements org.apache.thrift.TEnum {
  STATE(1),
  TYPE(2);

  private final int value;

  private TemplateFilterType(int value) {
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
  public static TemplateFilterType findByValue(int value) { 
    switch (value) {
      case 1:
        return STATE;
      case 2:
        return TYPE;
      default:
        return null;
    }
  }
}
