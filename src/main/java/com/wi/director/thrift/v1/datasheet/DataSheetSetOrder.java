/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.datasheet;

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
public class DataSheetSetOrder implements org.apache.thrift.TBase<DataSheetSetOrder, DataSheetSetOrder._Fields>, java.io.Serializable, Cloneable, Comparable<DataSheetSetOrder> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataSheetSetOrder");

  private static final org.apache.thrift.protocol.TField FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("field", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ASC_FIELD_DESC = new org.apache.thrift.protocol.TField("asc", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataSheetSetOrderStandardSchemeFactory());
  }

  /**
   * 
   * @see DataSheetSetOrderBy
   */
  public DataSheetSetOrderBy field; // required
  public boolean asc; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see DataSheetSetOrderBy
     */
    FIELD((short)1, "field"),
    ASC((short)2, "asc");

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
        case 1: // FIELD
          return FIELD;
        case 2: // ASC
          return ASC;
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
  private static final int __ASC_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD, new org.apache.thrift.meta_data.FieldMetaData("field", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DataSheetSetOrderBy.class)));
    tmpMap.put(_Fields.ASC, new org.apache.thrift.meta_data.FieldMetaData("asc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataSheetSetOrder.class, metaDataMap);
  }

  public DataSheetSetOrder() {
    this.asc = true;

  }

  public DataSheetSetOrder(
    DataSheetSetOrderBy field,
    boolean asc)
  {
    this();
    this.field = field;
    this.asc = asc;
    setAscIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataSheetSetOrder(DataSheetSetOrder other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetField()) {
      this.field = other.field;
    }
    this.asc = other.asc;
  }

  public DataSheetSetOrder deepCopy() {
    return new DataSheetSetOrder(this);
  }

  @Override
  public void clear() {
    this.field = null;
    this.asc = true;

  }

  /**
   * 
   * @see DataSheetSetOrderBy
   */
  public DataSheetSetOrderBy getField() {
    return this.field;
  }

  /**
   * 
   * @see DataSheetSetOrderBy
   */
  public DataSheetSetOrder setField(DataSheetSetOrderBy field) {
    this.field = field;
    return this;
  }

  public void unsetField() {
    this.field = null;
  }

  /** Returns true if field field is set (has been assigned a value) and false otherwise */
  public boolean isSetField() {
    return this.field != null;
  }

  public void setFieldIsSet(boolean value) {
    if (!value) {
      this.field = null;
    }
  }

  public boolean isAsc() {
    return this.asc;
  }

  public DataSheetSetOrder setAsc(boolean asc) {
    this.asc = asc;
    setAscIsSet(true);
    return this;
  }

  public void unsetAsc() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ASC_ISSET_ID);
  }

  /** Returns true if field asc is set (has been assigned a value) and false otherwise */
  public boolean isSetAsc() {
    return EncodingUtils.testBit(__isset_bitfield, __ASC_ISSET_ID);
  }

  public void setAscIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ASC_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD:
      if (value == null) {
        unsetField();
      } else {
        setField((DataSheetSetOrderBy)value);
      }
      break;

    case ASC:
      if (value == null) {
        unsetAsc();
      } else {
        setAsc((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD:
      return getField();

    case ASC:
      return isAsc();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD:
      return isSetField();
    case ASC:
      return isSetAsc();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataSheetSetOrder)
      return this.equals((DataSheetSetOrder)that);
    return false;
  }

  public boolean equals(DataSheetSetOrder that) {
    if (that == null)
      return false;

    boolean this_present_field = true && this.isSetField();
    boolean that_present_field = true && that.isSetField();
    if (this_present_field || that_present_field) {
      if (!(this_present_field && that_present_field))
        return false;
      if (!this.field.equals(that.field))
        return false;
    }

    boolean this_present_asc = true;
    boolean that_present_asc = true;
    if (this_present_asc || that_present_asc) {
      if (!(this_present_asc && that_present_asc))
        return false;
      if (this.asc != that.asc)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_field = true && (isSetField());
    list.add(present_field);
    if (present_field)
      list.add(field.getValue());

    boolean present_asc = true;
    list.add(present_asc);
    if (present_asc)
      list.add(asc);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataSheetSetOrder other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetField()).compareTo(other.isSetField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field, other.field);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAsc()).compareTo(other.isSetAsc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAsc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.asc, other.asc);
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
    StringBuilder sb = new StringBuilder("DataSheetSetOrder(");
    boolean first = true;

    sb.append("field:");
    if (this.field == null) {
      sb.append("null");
    } else {
      sb.append(this.field);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("asc:");
    sb.append(this.asc);
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

  private static class DataSheetSetOrderStandardSchemeFactory implements SchemeFactory {
    public DataSheetSetOrderStandardScheme getScheme() {
      return new DataSheetSetOrderStandardScheme();
    }
  }

  private static class DataSheetSetOrderStandardScheme extends StandardScheme<DataSheetSetOrder> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataSheetSetOrder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.field = com.wi.director.thrift.v1.datasheet.DataSheetSetOrderBy.findByValue(iprot.readI32());
              struct.setFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ASC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.asc = iprot.readBool();
              struct.setAscIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataSheetSetOrder struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.field != null) {
        oprot.writeFieldBegin(FIELD_FIELD_DESC);
        oprot.writeI32(struct.field.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ASC_FIELD_DESC);
      oprot.writeBool(struct.asc);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

