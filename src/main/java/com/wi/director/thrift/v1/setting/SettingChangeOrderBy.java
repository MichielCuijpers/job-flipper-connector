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

public enum SettingChangeOrderBy implements org.apache.thrift.TEnum {
  CHANGE_NUMBER(1),
  AUTHOR(2);

  private final int value;

  private SettingChangeOrderBy(int value) {
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
  public static SettingChangeOrderBy findByValue(int value) { 
    switch (value) {
      case 1:
        return CHANGE_NUMBER;
      case 2:
        return AUTHOR;
      default:
        return null;
    }
  }
}
