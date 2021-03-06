/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.analytics;

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
public class NumberArg implements org.apache.thrift.TBase<NumberArg, NumberArg._Fields>, java.io.Serializable, Cloneable, Comparable<NumberArg> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NumberArg");

  private static final org.apache.thrift.protocol.TField VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("vals", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TOLERANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("tolerance", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NumberArgStandardSchemeFactory());
  }

  public List<Double> vals; // required
  public double tolerance; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALS((short)1, "vals"),
    TOLERANCE((short)2, "tolerance");

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
        case 1: // VALS
          return VALS;
        case 2: // TOLERANCE
          return TOLERANCE;
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
  private static final int __TOLERANCE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOLERANCE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALS, new org.apache.thrift.meta_data.FieldMetaData("vals", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.TOLERANCE, new org.apache.thrift.meta_data.FieldMetaData("tolerance", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NumberArg.class, metaDataMap);
  }

  public NumberArg() {
  }

  public NumberArg(
    List<Double> vals)
  {
    this();
    this.vals = vals;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NumberArg(NumberArg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetVals()) {
      List<Double> __this__vals = new ArrayList<Double>(other.vals);
      this.vals = __this__vals;
    }
    this.tolerance = other.tolerance;
  }

  public NumberArg deepCopy() {
    return new NumberArg(this);
  }

  @Override
  public void clear() {
    this.vals = null;
    setToleranceIsSet(false);
    this.tolerance = 0.0;
  }

  public int getValsSize() {
    return (this.vals == null) ? 0 : this.vals.size();
  }

  public java.util.Iterator<Double> getValsIterator() {
    return (this.vals == null) ? null : this.vals.iterator();
  }

  public void addToVals(double elem) {
    if (this.vals == null) {
      this.vals = new ArrayList<Double>();
    }
    this.vals.add(elem);
  }

  public List<Double> getVals() {
    return this.vals;
  }

  public NumberArg setVals(List<Double> vals) {
    this.vals = vals;
    return this;
  }

  public void unsetVals() {
    this.vals = null;
  }

  /** Returns true if field vals is set (has been assigned a value) and false otherwise */
  public boolean isSetVals() {
    return this.vals != null;
  }

  public void setValsIsSet(boolean value) {
    if (!value) {
      this.vals = null;
    }
  }

  public double getTolerance() {
    return this.tolerance;
  }

  public NumberArg setTolerance(double tolerance) {
    this.tolerance = tolerance;
    setToleranceIsSet(true);
    return this;
  }

  public void unsetTolerance() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOLERANCE_ISSET_ID);
  }

  /** Returns true if field tolerance is set (has been assigned a value) and false otherwise */
  public boolean isSetTolerance() {
    return EncodingUtils.testBit(__isset_bitfield, __TOLERANCE_ISSET_ID);
  }

  public void setToleranceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOLERANCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALS:
      if (value == null) {
        unsetVals();
      } else {
        setVals((List<Double>)value);
      }
      break;

    case TOLERANCE:
      if (value == null) {
        unsetTolerance();
      } else {
        setTolerance((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALS:
      return getVals();

    case TOLERANCE:
      return getTolerance();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALS:
      return isSetVals();
    case TOLERANCE:
      return isSetTolerance();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NumberArg)
      return this.equals((NumberArg)that);
    return false;
  }

  public boolean equals(NumberArg that) {
    if (that == null)
      return false;

    boolean this_present_vals = true && this.isSetVals();
    boolean that_present_vals = true && that.isSetVals();
    if (this_present_vals || that_present_vals) {
      if (!(this_present_vals && that_present_vals))
        return false;
      if (!this.vals.equals(that.vals))
        return false;
    }

    boolean this_present_tolerance = true && this.isSetTolerance();
    boolean that_present_tolerance = true && that.isSetTolerance();
    if (this_present_tolerance || that_present_tolerance) {
      if (!(this_present_tolerance && that_present_tolerance))
        return false;
      if (this.tolerance != that.tolerance)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_vals = true && (isSetVals());
    list.add(present_vals);
    if (present_vals)
      list.add(vals);

    boolean present_tolerance = true && (isSetTolerance());
    list.add(present_tolerance);
    if (present_tolerance)
      list.add(tolerance);

    return list.hashCode();
  }

  @Override
  public int compareTo(NumberArg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetVals()).compareTo(other.isSetVals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVals()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vals, other.vals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTolerance()).compareTo(other.isSetTolerance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTolerance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tolerance, other.tolerance);
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
    StringBuilder sb = new StringBuilder("NumberArg(");
    boolean first = true;

    sb.append("vals:");
    if (this.vals == null) {
      sb.append("null");
    } else {
      sb.append(this.vals);
    }
    first = false;
    if (isSetTolerance()) {
      if (!first) sb.append(", ");
      sb.append("tolerance:");
      sb.append(this.tolerance);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (vals == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'vals' was not present! Struct: " + toString());
    }
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

  private static class NumberArgStandardSchemeFactory implements SchemeFactory {
    public NumberArgStandardScheme getScheme() {
      return new NumberArgStandardScheme();
    }
  }

  private static class NumberArgStandardScheme extends StandardScheme<NumberArg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NumberArg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.vals = new ArrayList<Double>(_list0.size);
                double _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readDouble();
                  struct.vals.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setValsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOLERANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.tolerance = iprot.readDouble();
              struct.setToleranceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NumberArg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.vals != null) {
        oprot.writeFieldBegin(VALS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.vals.size()));
          for (double _iter3 : struct.vals)
          {
            oprot.writeDouble(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetTolerance()) {
        oprot.writeFieldBegin(TOLERANCE_FIELD_DESC);
        oprot.writeDouble(struct.tolerance);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

