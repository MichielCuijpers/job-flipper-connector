/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.field_data;

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
 * SI unit number for number execution input
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class MeasuredUnitNumber implements org.apache.thrift.TBase<MeasuredUnitNumber, MeasuredUnitNumber._Fields>, java.io.Serializable, Cloneable, Comparable<MeasuredUnitNumber> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MeasuredUnitNumber");

  private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("number", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("unit", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MeasuredUnitNumberStandardSchemeFactory());
  }

  public com.wi.director.thrift.v1.common.PreciseNumber number; // required
  public NumberUnit unit; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUMBER((short)1, "number"),
    UNIT((short)2, "unit");

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
        case 2: // UNIT
          return UNIT;
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
  private static final _Fields optionals[] = {_Fields.UNIT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUMBER, new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.common.PreciseNumber.class)));
    tmpMap.put(_Fields.UNIT, new org.apache.thrift.meta_data.FieldMetaData("unit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NumberUnit.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MeasuredUnitNumber.class, metaDataMap);
  }

  public MeasuredUnitNumber() {
  }

  public MeasuredUnitNumber(
    com.wi.director.thrift.v1.common.PreciseNumber number)
  {
    this();
    this.number = number;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MeasuredUnitNumber(MeasuredUnitNumber other) {
    if (other.isSetNumber()) {
      this.number = new com.wi.director.thrift.v1.common.PreciseNumber(other.number);
    }
    if (other.isSetUnit()) {
      this.unit = new NumberUnit(other.unit);
    }
  }

  public MeasuredUnitNumber deepCopy() {
    return new MeasuredUnitNumber(this);
  }

  @Override
  public void clear() {
    this.number = null;
    this.unit = null;
  }

  public com.wi.director.thrift.v1.common.PreciseNumber getNumber() {
    return this.number;
  }

  public MeasuredUnitNumber setNumber(com.wi.director.thrift.v1.common.PreciseNumber number) {
    this.number = number;
    return this;
  }

  public void unsetNumber() {
    this.number = null;
  }

  /** Returns true if field number is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber() {
    return this.number != null;
  }

  public void setNumberIsSet(boolean value) {
    if (!value) {
      this.number = null;
    }
  }

  public NumberUnit getUnit() {
    return this.unit;
  }

  public MeasuredUnitNumber setUnit(NumberUnit unit) {
    this.unit = unit;
    return this;
  }

  public void unsetUnit() {
    this.unit = null;
  }

  /** Returns true if field unit is set (has been assigned a value) and false otherwise */
  public boolean isSetUnit() {
    return this.unit != null;
  }

  public void setUnitIsSet(boolean value) {
    if (!value) {
      this.unit = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUMBER:
      if (value == null) {
        unsetNumber();
      } else {
        setNumber((com.wi.director.thrift.v1.common.PreciseNumber)value);
      }
      break;

    case UNIT:
      if (value == null) {
        unsetUnit();
      } else {
        setUnit((NumberUnit)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUMBER:
      return getNumber();

    case UNIT:
      return getUnit();

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
    case UNIT:
      return isSetUnit();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MeasuredUnitNumber)
      return this.equals((MeasuredUnitNumber)that);
    return false;
  }

  public boolean equals(MeasuredUnitNumber that) {
    if (that == null)
      return false;

    boolean this_present_number = true && this.isSetNumber();
    boolean that_present_number = true && that.isSetNumber();
    if (this_present_number || that_present_number) {
      if (!(this_present_number && that_present_number))
        return false;
      if (!this.number.equals(that.number))
        return false;
    }

    boolean this_present_unit = true && this.isSetUnit();
    boolean that_present_unit = true && that.isSetUnit();
    if (this_present_unit || that_present_unit) {
      if (!(this_present_unit && that_present_unit))
        return false;
      if (!this.unit.equals(that.unit))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_number = true && (isSetNumber());
    list.add(present_number);
    if (present_number)
      list.add(number);

    boolean present_unit = true && (isSetUnit());
    list.add(present_unit);
    if (present_unit)
      list.add(unit);

    return list.hashCode();
  }

  @Override
  public int compareTo(MeasuredUnitNumber other) {
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
    lastComparison = Boolean.valueOf(isSetUnit()).compareTo(other.isSetUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unit, other.unit);
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
    StringBuilder sb = new StringBuilder("MeasuredUnitNumber(");
    boolean first = true;

    sb.append("number:");
    if (this.number == null) {
      sb.append("null");
    } else {
      sb.append(this.number);
    }
    first = false;
    if (isSetUnit()) {
      if (!first) sb.append(", ");
      sb.append("unit:");
      if (this.unit == null) {
        sb.append("null");
      } else {
        sb.append(this.unit);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (number != null) {
      number.validate();
    }
    if (unit != null) {
      unit.validate();
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

  private static class MeasuredUnitNumberStandardSchemeFactory implements SchemeFactory {
    public MeasuredUnitNumberStandardScheme getScheme() {
      return new MeasuredUnitNumberStandardScheme();
    }
  }

  private static class MeasuredUnitNumberStandardScheme extends StandardScheme<MeasuredUnitNumber> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MeasuredUnitNumber struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.number = new com.wi.director.thrift.v1.common.PreciseNumber();
              struct.number.read(iprot);
              struct.setNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.unit = new NumberUnit();
              struct.unit.read(iprot);
              struct.setUnitIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MeasuredUnitNumber struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.number != null) {
        oprot.writeFieldBegin(NUMBER_FIELD_DESC);
        struct.number.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.unit != null) {
        if (struct.isSetUnit()) {
          oprot.writeFieldBegin(UNIT_FIELD_DESC);
          struct.unit.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

