/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.common;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Number input with precision
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class PreciseNumber implements org.apache.thrift.TBase<PreciseNumber, PreciseNumber._Fields>, java.io.Serializable, Cloneable, Comparable<PreciseNumber> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PreciseNumber");

  private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("number", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField PRECISION_FIELD_DESC = new org.apache.thrift.protocol.TField("precision", org.apache.thrift.protocol.TType.BYTE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PreciseNumberStandardSchemeFactory());
  }

  public double number; // required
  /**
   * Definition of precision on a number: <br>
   * All non-zero digits are significant. <br>
   * Zeros between non-zero digits are significant. <br>
   * Leading zeros are never significant. <br>
   * In a number with a decimal point, trailing zeros (those to the right of the last non-zero digit) are significant. This is counted when user inputs the number as a string.
   */
  public byte precision; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUMBER((short)1, "number"),
    /**
     * Definition of precision on a number: <br>
     * All non-zero digits are significant. <br>
     * Zeros between non-zero digits are significant. <br>
     * Leading zeros are never significant. <br>
     * In a number with a decimal point, trailing zeros (those to the right of the last non-zero digit) are significant. This is counted when user inputs the number as a string.
     */
    PRECISION((short)2, "precision");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NUMBER
          return NUMBER;
        case 2: // PRECISION
          return PRECISION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUMBER_ISSET_ID = 0;
  private static final int __PRECISION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUMBER, new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PRECISION, new org.apache.thrift.meta_data.FieldMetaData("precision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PreciseNumber.class, metaDataMap);
  }

  public PreciseNumber() {
  }

  public PreciseNumber(
    double number,
    byte precision)
  {
    this();
    this.number = number;
    setNumberIsSet(true);
    this.precision = precision;
    setPrecisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PreciseNumber(PreciseNumber other) {
    __isset_bitfield = other.__isset_bitfield;
    this.number = other.number;
    this.precision = other.precision;
  }

  public PreciseNumber deepCopy() {
    return new PreciseNumber(this);
  }

  @Override
  public void clear() {
    setNumberIsSet(false);
    this.number = 0.0;
    setPrecisionIsSet(false);
    this.precision = 0;
  }

  public double getNumber() {
    return this.number;
  }

  public PreciseNumber setNumber(double number) {
    this.number = number;
    setNumberIsSet(true);
    return this;
  }

  public void unsetNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMBER_ISSET_ID);
  }

  /** Returns true if field number is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMBER_ISSET_ID);
  }

  public void setNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMBER_ISSET_ID, value);
  }

  /**
   * Definition of precision on a number: <br>
   * All non-zero digits are significant. <br>
   * Zeros between non-zero digits are significant. <br>
   * Leading zeros are never significant. <br>
   * In a number with a decimal point, trailing zeros (those to the right of the last non-zero digit) are significant. This is counted when user inputs the number as a string.
   */
  public byte getPrecision() {
    return this.precision;
  }

  /**
   * Definition of precision on a number: <br>
   * All non-zero digits are significant. <br>
   * Zeros between non-zero digits are significant. <br>
   * Leading zeros are never significant. <br>
   * In a number with a decimal point, trailing zeros (those to the right of the last non-zero digit) are significant. This is counted when user inputs the number as a string.
   */
  public PreciseNumber setPrecision(byte precision) {
    this.precision = precision;
    setPrecisionIsSet(true);
    return this;
  }

  public void unsetPrecision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  /** Returns true if field precision is set (has been assigned a value) and false otherwise */
  public boolean isSetPrecision() {
    return EncodingUtils.testBit(__isset_bitfield, __PRECISION_ISSET_ID);
  }

  public void setPrecisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRECISION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUMBER:
      if (value == null) {
        unsetNumber();
      } else {
        setNumber((Double)value);
      }
      break;

    case PRECISION:
      if (value == null) {
        unsetPrecision();
      } else {
        setPrecision((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUMBER:
      return getNumber();

    case PRECISION:
      return getPrecision();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUMBER:
      return isSetNumber();
    case PRECISION:
      return isSetPrecision();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PreciseNumber)
      return this.equals((PreciseNumber)that);
    return false;
  }

  public boolean equals(PreciseNumber that) {
    if (that == null)
      return false;

    boolean this_present_number = true;
    boolean that_present_number = true;
    if (this_present_number || that_present_number) {
      if (!(this_present_number && that_present_number))
        return false;
      if (this.number != that.number)
        return false;
    }

    boolean this_present_precision = true;
    boolean that_present_precision = true;
    if (this_present_precision || that_present_precision) {
      if (!(this_present_precision && that_present_precision))
        return false;
      if (this.precision != that.precision)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_number = true;
    list.add(present_number);
    if (present_number)
      list.add(number);

    boolean present_precision = true;
    list.add(present_precision);
    if (present_precision)
      list.add(precision);

    return list.hashCode();
  }

  @Override
  public int compareTo(PreciseNumber other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNumber()).compareTo(other.isSetNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.number, other.number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrecision()).compareTo(other.isSetPrecision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrecision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.precision, other.precision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PreciseNumber(");
    boolean first = true;

    sb.append("number:");
    sb.append(this.number);
    first = false;
    if (!first) sb.append(", ");
    sb.append("precision:");
    sb.append(this.precision);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PreciseNumberStandardSchemeFactory implements SchemeFactory {
    public PreciseNumberStandardScheme getScheme() {
      return new PreciseNumberStandardScheme();
    }
  }

  private static class PreciseNumberStandardScheme extends StandardScheme<PreciseNumber> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PreciseNumber struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.number = iprot.readDouble();
              struct.setNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRECISION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.precision = iprot.readByte();
              struct.setPrecisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PreciseNumber struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUMBER_FIELD_DESC);
      oprot.writeDouble(struct.number);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PRECISION_FIELD_DESC);
      oprot.writeByte(struct.precision);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
