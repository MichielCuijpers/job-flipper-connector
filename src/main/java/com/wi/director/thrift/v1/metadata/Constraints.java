/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.metadata;

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
public class Constraints implements org.apache.thrift.TBase<Constraints, Constraints._Fields>, java.io.Serializable, Cloneable, Comparable<Constraints> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Constraints");

  private static final org.apache.thrift.protocol.TField RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("range", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LIST_OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("listOptions", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConstraintsStandardSchemeFactory());
  }

  /**
   * only for numeric type; not required
   */
  public Range range; // optional
  /**
   * required for list types (both list and multi-select list)
   */
  public ListOptions listOptions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * only for numeric type; not required
     */
    RANGE((short)1, "range"),
    /**
     * required for list types (both list and multi-select list)
     */
    LIST_OPTIONS((short)2, "listOptions");

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
        case 1: // RANGE
          return RANGE;
        case 2: // LIST_OPTIONS
          return LIST_OPTIONS;
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
  private static final _Fields optionals[] = {_Fields.RANGE,_Fields.LIST_OPTIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RANGE, new org.apache.thrift.meta_data.FieldMetaData("range", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Range.class)));
    tmpMap.put(_Fields.LIST_OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("listOptions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ListOptions.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Constraints.class, metaDataMap);
  }

  public Constraints() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Constraints(Constraints other) {
    if (other.isSetRange()) {
      this.range = new Range(other.range);
    }
    if (other.isSetListOptions()) {
      this.listOptions = new ListOptions(other.listOptions);
    }
  }

  public Constraints deepCopy() {
    return new Constraints(this);
  }

  @Override
  public void clear() {
    this.range = null;
    this.listOptions = null;
  }

  /**
   * only for numeric type; not required
   */
  public Range getRange() {
    return this.range;
  }

  /**
   * only for numeric type; not required
   */
  public Constraints setRange(Range range) {
    this.range = range;
    return this;
  }

  public void unsetRange() {
    this.range = null;
  }

  /** Returns true if field range is set (has been assigned a value) and false otherwise */
  public boolean isSetRange() {
    return this.range != null;
  }

  public void setRangeIsSet(boolean value) {
    if (!value) {
      this.range = null;
    }
  }

  /**
   * required for list types (both list and multi-select list)
   */
  public ListOptions getListOptions() {
    return this.listOptions;
  }

  /**
   * required for list types (both list and multi-select list)
   */
  public Constraints setListOptions(ListOptions listOptions) {
    this.listOptions = listOptions;
    return this;
  }

  public void unsetListOptions() {
    this.listOptions = null;
  }

  /** Returns true if field listOptions is set (has been assigned a value) and false otherwise */
  public boolean isSetListOptions() {
    return this.listOptions != null;
  }

  public void setListOptionsIsSet(boolean value) {
    if (!value) {
      this.listOptions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RANGE:
      if (value == null) {
        unsetRange();
      } else {
        setRange((Range)value);
      }
      break;

    case LIST_OPTIONS:
      if (value == null) {
        unsetListOptions();
      } else {
        setListOptions((ListOptions)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RANGE:
      return getRange();

    case LIST_OPTIONS:
      return getListOptions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RANGE:
      return isSetRange();
    case LIST_OPTIONS:
      return isSetListOptions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Constraints)
      return this.equals((Constraints)that);
    return false;
  }

  public boolean equals(Constraints that) {
    if (that == null)
      return false;

    boolean this_present_range = true && this.isSetRange();
    boolean that_present_range = true && that.isSetRange();
    if (this_present_range || that_present_range) {
      if (!(this_present_range && that_present_range))
        return false;
      if (!this.range.equals(that.range))
        return false;
    }

    boolean this_present_listOptions = true && this.isSetListOptions();
    boolean that_present_listOptions = true && that.isSetListOptions();
    if (this_present_listOptions || that_present_listOptions) {
      if (!(this_present_listOptions && that_present_listOptions))
        return false;
      if (!this.listOptions.equals(that.listOptions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_range = true && (isSetRange());
    list.add(present_range);
    if (present_range)
      list.add(range);

    boolean present_listOptions = true && (isSetListOptions());
    list.add(present_listOptions);
    if (present_listOptions)
      list.add(listOptions);

    return list.hashCode();
  }

  @Override
  public int compareTo(Constraints other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRange()).compareTo(other.isSetRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.range, other.range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetListOptions()).compareTo(other.isSetListOptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetListOptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.listOptions, other.listOptions);
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
    StringBuilder sb = new StringBuilder("Constraints(");
    boolean first = true;

    if (isSetRange()) {
      sb.append("range:");
      if (this.range == null) {
        sb.append("null");
      } else {
        sb.append(this.range);
      }
      first = false;
    }
    if (isSetListOptions()) {
      if (!first) sb.append(", ");
      sb.append("listOptions:");
      if (this.listOptions == null) {
        sb.append("null");
      } else {
        sb.append(this.listOptions);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (range != null) {
      range.validate();
    }
    if (listOptions != null) {
      listOptions.validate();
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

  private static class ConstraintsStandardSchemeFactory implements SchemeFactory {
    public ConstraintsStandardScheme getScheme() {
      return new ConstraintsStandardScheme();
    }
  }

  private static class ConstraintsStandardScheme extends StandardScheme<Constraints> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Constraints struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.range = new Range();
              struct.range.read(iprot);
              struct.setRangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LIST_OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.listOptions = new ListOptions();
              struct.listOptions.read(iprot);
              struct.setListOptionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Constraints struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.range != null) {
        if (struct.isSetRange()) {
          oprot.writeFieldBegin(RANGE_FIELD_DESC);
          struct.range.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.listOptions != null) {
        if (struct.isSetListOptions()) {
          oprot.writeFieldBegin(LIST_OPTIONS_FIELD_DESC);
          struct.listOptions.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

