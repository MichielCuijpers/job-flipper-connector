/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.diff;

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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class NumberDiff implements org.apache.thrift.TBase<NumberDiff, NumberDiff._Fields>, java.io.Serializable, Cloneable, Comparable<NumberDiff> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NumberDiff");

  private static final org.apache.thrift.protocol.TField LATEST_CHANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("latestChange", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OTHER_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("otherValue", org.apache.thrift.protocol.TType.DOUBLE, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NumberDiffStandardSchemeFactory());
  }

  public Change latestChange; // required
  public double otherValue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LATEST_CHANGE((short)1, "latestChange"),
    OTHER_VALUE((short)10, "otherValue");

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
        case 1: // LATEST_CHANGE
          return LATEST_CHANGE;
        case 10: // OTHER_VALUE
          return OTHER_VALUE;
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
  private static final int __OTHERVALUE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OTHER_VALUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LATEST_CHANGE, new org.apache.thrift.meta_data.FieldMetaData("latestChange", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Change.class)));
    tmpMap.put(_Fields.OTHER_VALUE, new org.apache.thrift.meta_data.FieldMetaData("otherValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NumberDiff.class, metaDataMap);
  }

  public NumberDiff() {
  }

  public NumberDiff(
    Change latestChange)
  {
    this();
    this.latestChange = latestChange;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NumberDiff(NumberDiff other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetLatestChange()) {
      this.latestChange = new Change(other.latestChange);
    }
    this.otherValue = other.otherValue;
  }

  public NumberDiff deepCopy() {
    return new NumberDiff(this);
  }

  @Override
  public void clear() {
    this.latestChange = null;
    setOtherValueIsSet(false);
    this.otherValue = 0.0;
  }

  public Change getLatestChange() {
    return this.latestChange;
  }

  public NumberDiff setLatestChange(Change latestChange) {
    this.latestChange = latestChange;
    return this;
  }

  public void unsetLatestChange() {
    this.latestChange = null;
  }

  /** Returns true if field latestChange is set (has been assigned a value) and false otherwise */
  public boolean isSetLatestChange() {
    return this.latestChange != null;
  }

  public void setLatestChangeIsSet(boolean value) {
    if (!value) {
      this.latestChange = null;
    }
  }

  public double getOtherValue() {
    return this.otherValue;
  }

  public NumberDiff setOtherValue(double otherValue) {
    this.otherValue = otherValue;
    setOtherValueIsSet(true);
    return this;
  }

  public void unsetOtherValue() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OTHERVALUE_ISSET_ID);
  }

  /** Returns true if field otherValue is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherValue() {
    return EncodingUtils.testBit(__isset_bitfield, __OTHERVALUE_ISSET_ID);
  }

  public void setOtherValueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OTHERVALUE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LATEST_CHANGE:
      if (value == null) {
        unsetLatestChange();
      } else {
        setLatestChange((Change)value);
      }
      break;

    case OTHER_VALUE:
      if (value == null) {
        unsetOtherValue();
      } else {
        setOtherValue((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LATEST_CHANGE:
      return getLatestChange();

    case OTHER_VALUE:
      return getOtherValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LATEST_CHANGE:
      return isSetLatestChange();
    case OTHER_VALUE:
      return isSetOtherValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NumberDiff)
      return this.equals((NumberDiff)that);
    return false;
  }

  public boolean equals(NumberDiff that) {
    if (that == null)
      return false;

    boolean this_present_latestChange = true && this.isSetLatestChange();
    boolean that_present_latestChange = true && that.isSetLatestChange();
    if (this_present_latestChange || that_present_latestChange) {
      if (!(this_present_latestChange && that_present_latestChange))
        return false;
      if (!this.latestChange.equals(that.latestChange))
        return false;
    }

    boolean this_present_otherValue = true && this.isSetOtherValue();
    boolean that_present_otherValue = true && that.isSetOtherValue();
    if (this_present_otherValue || that_present_otherValue) {
      if (!(this_present_otherValue && that_present_otherValue))
        return false;
      if (this.otherValue != that.otherValue)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_latestChange = true && (isSetLatestChange());
    list.add(present_latestChange);
    if (present_latestChange)
      list.add(latestChange);

    boolean present_otherValue = true && (isSetOtherValue());
    list.add(present_otherValue);
    if (present_otherValue)
      list.add(otherValue);

    return list.hashCode();
  }

  @Override
  public int compareTo(NumberDiff other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLatestChange()).compareTo(other.isSetLatestChange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatestChange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latestChange, other.latestChange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOtherValue()).compareTo(other.isSetOtherValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtherValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otherValue, other.otherValue);
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
    StringBuilder sb = new StringBuilder("NumberDiff(");
    boolean first = true;

    sb.append("latestChange:");
    if (this.latestChange == null) {
      sb.append("null");
    } else {
      sb.append(this.latestChange);
    }
    first = false;
    if (isSetOtherValue()) {
      if (!first) sb.append(", ");
      sb.append("otherValue:");
      sb.append(this.otherValue);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (latestChange != null) {
      latestChange.validate();
    }
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

  private static class NumberDiffStandardSchemeFactory implements SchemeFactory {
    public NumberDiffStandardScheme getScheme() {
      return new NumberDiffStandardScheme();
    }
  }

  private static class NumberDiffStandardScheme extends StandardScheme<NumberDiff> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NumberDiff struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LATEST_CHANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.latestChange = new Change();
              struct.latestChange.read(iprot);
              struct.setLatestChangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // OTHER_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.otherValue = iprot.readDouble();
              struct.setOtherValueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NumberDiff struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.latestChange != null) {
        oprot.writeFieldBegin(LATEST_CHANGE_FIELD_DESC);
        struct.latestChange.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOtherValue()) {
        oprot.writeFieldBegin(OTHER_VALUE_FIELD_DESC);
        oprot.writeDouble(struct.otherValue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

