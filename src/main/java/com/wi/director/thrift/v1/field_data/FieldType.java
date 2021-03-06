/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.field_data;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * The different types of inputs a Step can have. There is no longer a 1to1 mapping of field types
 * to execution data fields. To make it easier to track, there will be comments after each field type
 * indicating which execution data types it can map to.
 */
public enum FieldType implements org.apache.thrift.TEnum {
  /**
   * Text that is entered
   */
  Text(1),
  /**
   * Numerical input that can have a valid range
   */
  Number(2),
  /**
   * Selector list of options
   */
  List(3),
  Photo(4),
  Video(5),
  Audio(6),
  /**
   * A person's signature
   */
  Signature(7),
  /**
   * A date value, encoded as a 64-bit unix timestamp (in seconds)
   */
  Date(8),
  YesNo(9),
  /**
   * A url string. Will be validated for proper formatting
   */
  Link(10),
  MultiSelectList(11),
  File(12),
  /**
   * CompactList can only have two options and each option must be under 20 characters
   * It will be displayed in a flattened/compacted form for faster execution
   */
  CompactList(13),
  DateTime(14);

  private final int value;

  private FieldType(int value) {
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
  public static FieldType findByValue(int value) { 
    switch (value) {
      case 1:
        return Text;
      case 2:
        return Number;
      case 3:
        return List;
      case 4:
        return Photo;
      case 5:
        return Video;
      case 6:
        return Audio;
      case 7:
        return Signature;
      case 8:
        return Date;
      case 9:
        return YesNo;
      case 10:
        return Link;
      case 11:
        return MultiSelectList;
      case 12:
        return File;
      case 13:
        return CompactList;
      case 14:
        return DateTime;
      default:
        return null;
    }
  }
}
