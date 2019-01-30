/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.user;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * The user's role(s) in a team
 */
public enum TeamRole implements org.apache.thrift.TEnum {
  ADMIN(1),
  AUTHOR(2),
  JOBCREATOR(3),
  EXECUTOR(4),
  PARSABLE_ADMIN(5);

  private final int value;

  private TeamRole(int value) {
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
  public static TeamRole findByValue(int value) { 
    switch (value) {
      case 1:
        return ADMIN;
      case 2:
        return AUTHOR;
      case 3:
        return JOBCREATOR;
      case 4:
        return EXECUTOR;
      case 5:
        return PARSABLE_ADMIN;
      default:
        return null;
    }
  }
}