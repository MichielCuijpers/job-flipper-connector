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
public class StringDiff implements org.apache.thrift.TBase<StringDiff, StringDiff._Fields>, java.io.Serializable, Cloneable, Comparable<StringDiff> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StringDiff");

  private static final org.apache.thrift.protocol.TField LATEST_CHANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("latestChange", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OTHER_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("otherValue", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField OTHER_VALUE_WRAPPER_FIELD_DESC = new org.apache.thrift.protocol.TField("otherValueWrapper", org.apache.thrift.protocol.TType.STRUCT, (short)11);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StringDiffStandardSchemeFactory());
  }

  public Change latestChange; // required
  public String otherValue; // optional
  public com.parsable.thrift.v1.reference.StringWrapper otherValueWrapper; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LATEST_CHANGE((short)1, "latestChange"),
    OTHER_VALUE((short)10, "otherValue"),
    OTHER_VALUE_WRAPPER((short)11, "otherValueWrapper");

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
        case 11: // OTHER_VALUE_WRAPPER
          return OTHER_VALUE_WRAPPER;
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
  private static final _Fields optionals[] = {_Fields.OTHER_VALUE,_Fields.OTHER_VALUE_WRAPPER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LATEST_CHANGE, new org.apache.thrift.meta_data.FieldMetaData("latestChange", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Change.class)));
    tmpMap.put(_Fields.OTHER_VALUE, new org.apache.thrift.meta_data.FieldMetaData("otherValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OTHER_VALUE_WRAPPER, new org.apache.thrift.meta_data.FieldMetaData("otherValueWrapper", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.reference.StringWrapper.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StringDiff.class, metaDataMap);
  }

  public StringDiff() {
  }

  public StringDiff(
    Change latestChange)
  {
    this();
    this.latestChange = latestChange;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StringDiff(StringDiff other) {
    if (other.isSetLatestChange()) {
      this.latestChange = new Change(other.latestChange);
    }
    if (other.isSetOtherValue()) {
      this.otherValue = other.otherValue;
    }
    if (other.isSetOtherValueWrapper()) {
      this.otherValueWrapper = new com.parsable.thrift.v1.reference.StringWrapper(other.otherValueWrapper);
    }
  }

  public StringDiff deepCopy() {
    return new StringDiff(this);
  }

  @Override
  public void clear() {
    this.latestChange = null;
    this.otherValue = null;
    this.otherValueWrapper = null;
  }

  public Change getLatestChange() {
    return this.latestChange;
  }

  public StringDiff setLatestChange(Change latestChange) {
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

  public String getOtherValue() {
    return this.otherValue;
  }

  public StringDiff setOtherValue(String otherValue) {
    this.otherValue = otherValue;
    return this;
  }

  public void unsetOtherValue() {
    this.otherValue = null;
  }

  /** Returns true if field otherValue is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherValue() {
    return this.otherValue != null;
  }

  public void setOtherValueIsSet(boolean value) {
    if (!value) {
      this.otherValue = null;
    }
  }

  public com.parsable.thrift.v1.reference.StringWrapper getOtherValueWrapper() {
    return this.otherValueWrapper;
  }

  public StringDiff setOtherValueWrapper(com.parsable.thrift.v1.reference.StringWrapper otherValueWrapper) {
    this.otherValueWrapper = otherValueWrapper;
    return this;
  }

  public void unsetOtherValueWrapper() {
    this.otherValueWrapper = null;
  }

  /** Returns true if field otherValueWrapper is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherValueWrapper() {
    return this.otherValueWrapper != null;
  }

  public void setOtherValueWrapperIsSet(boolean value) {
    if (!value) {
      this.otherValueWrapper = null;
    }
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
        setOtherValue((String)value);
      }
      break;

    case OTHER_VALUE_WRAPPER:
      if (value == null) {
        unsetOtherValueWrapper();
      } else {
        setOtherValueWrapper((com.parsable.thrift.v1.reference.StringWrapper)value);
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

    case OTHER_VALUE_WRAPPER:
      return getOtherValueWrapper();

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
    case OTHER_VALUE_WRAPPER:
      return isSetOtherValueWrapper();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StringDiff)
      return this.equals((StringDiff)that);
    return false;
  }

  public boolean equals(StringDiff that) {
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
      if (!this.otherValue.equals(that.otherValue))
        return false;
    }

    boolean this_present_otherValueWrapper = true && this.isSetOtherValueWrapper();
    boolean that_present_otherValueWrapper = true && that.isSetOtherValueWrapper();
    if (this_present_otherValueWrapper || that_present_otherValueWrapper) {
      if (!(this_present_otherValueWrapper && that_present_otherValueWrapper))
        return false;
      if (!this.otherValueWrapper.equals(that.otherValueWrapper))
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

    boolean present_otherValueWrapper = true && (isSetOtherValueWrapper());
    list.add(present_otherValueWrapper);
    if (present_otherValueWrapper)
      list.add(otherValueWrapper);

    return list.hashCode();
  }

  @Override
  public int compareTo(StringDiff other) {
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
    lastComparison = Boolean.valueOf(isSetOtherValueWrapper()).compareTo(other.isSetOtherValueWrapper());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtherValueWrapper()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otherValueWrapper, other.otherValueWrapper);
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
    StringBuilder sb = new StringBuilder("StringDiff(");
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
      if (this.otherValue == null) {
        sb.append("null");
      } else {
        sb.append(this.otherValue);
      }
      first = false;
    }
    if (isSetOtherValueWrapper()) {
      if (!first) sb.append(", ");
      sb.append("otherValueWrapper:");
      if (this.otherValueWrapper == null) {
        sb.append("null");
      } else {
        sb.append(this.otherValueWrapper);
      }
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
    if (otherValueWrapper != null) {
      otherValueWrapper.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StringDiffStandardSchemeFactory implements SchemeFactory {
    public StringDiffStandardScheme getScheme() {
      return new StringDiffStandardScheme();
    }
  }

  private static class StringDiffStandardScheme extends StandardScheme<StringDiff> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StringDiff struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.otherValue = iprot.readString();
              struct.setOtherValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // OTHER_VALUE_WRAPPER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.otherValueWrapper = new com.parsable.thrift.v1.reference.StringWrapper();
              struct.otherValueWrapper.read(iprot);
              struct.setOtherValueWrapperIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StringDiff struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.latestChange != null) {
        oprot.writeFieldBegin(LATEST_CHANGE_FIELD_DESC);
        struct.latestChange.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.otherValue != null) {
        if (struct.isSetOtherValue()) {
          oprot.writeFieldBegin(OTHER_VALUE_FIELD_DESC);
          oprot.writeString(struct.otherValue);
          oprot.writeFieldEnd();
        }
      }
      if (struct.otherValueWrapper != null) {
        if (struct.isSetOtherValueWrapper()) {
          oprot.writeFieldBegin(OTHER_VALUE_WRAPPER_FIELD_DESC);
          struct.otherValueWrapper.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

