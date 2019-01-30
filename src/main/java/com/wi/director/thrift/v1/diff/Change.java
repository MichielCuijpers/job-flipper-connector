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
public class Change implements org.apache.thrift.TBase<Change, Change._Fields>, java.io.Serializable, Cloneable, Comparable<Change> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Change");

  private static final org.apache.thrift.protocol.TField CHANGE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("changeType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField INDICES_FIELD_DESC = new org.apache.thrift.protocol.TField("indices", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChangeStandardSchemeFactory());
  }

  /**
   * 
   * @see ChangeType
   */
  public ChangeType changeType; // required
  public int version; // required
  public ListIndices indices; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ChangeType
     */
    CHANGE_TYPE((short)1, "changeType"),
    VERSION((short)2, "version"),
    INDICES((short)3, "indices");

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
        case 1: // CHANGE_TYPE
          return CHANGE_TYPE;
        case 2: // VERSION
          return VERSION;
        case 3: // INDICES
          return INDICES;
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
  private static final int __VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INDICES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHANGE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("changeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ChangeType.class)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INDICES, new org.apache.thrift.meta_data.FieldMetaData("indices", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ListIndices.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Change.class, metaDataMap);
  }

  public Change() {
  }

  public Change(
    ChangeType changeType,
    int version)
  {
    this();
    this.changeType = changeType;
    this.version = version;
    setVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Change(Change other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChangeType()) {
      this.changeType = other.changeType;
    }
    this.version = other.version;
    if (other.isSetIndices()) {
      this.indices = new ListIndices(other.indices);
    }
  }

  public Change deepCopy() {
    return new Change(this);
  }

  @Override
  public void clear() {
    this.changeType = null;
    setVersionIsSet(false);
    this.version = 0;
    this.indices = null;
  }

  /**
   * 
   * @see ChangeType
   */
  public ChangeType getChangeType() {
    return this.changeType;
  }

  /**
   * 
   * @see ChangeType
   */
  public Change setChangeType(ChangeType changeType) {
    this.changeType = changeType;
    return this;
  }

  public void unsetChangeType() {
    this.changeType = null;
  }

  /** Returns true if field changeType is set (has been assigned a value) and false otherwise */
  public boolean isSetChangeType() {
    return this.changeType != null;
  }

  public void setChangeTypeIsSet(boolean value) {
    if (!value) {
      this.changeType = null;
    }
  }

  public int getVersion() {
    return this.version;
  }

  public Change setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public ListIndices getIndices() {
    return this.indices;
  }

  public Change setIndices(ListIndices indices) {
    this.indices = indices;
    return this;
  }

  public void unsetIndices() {
    this.indices = null;
  }

  /** Returns true if field indices is set (has been assigned a value) and false otherwise */
  public boolean isSetIndices() {
    return this.indices != null;
  }

  public void setIndicesIsSet(boolean value) {
    if (!value) {
      this.indices = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHANGE_TYPE:
      if (value == null) {
        unsetChangeType();
      } else {
        setChangeType((ChangeType)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case INDICES:
      if (value == null) {
        unsetIndices();
      } else {
        setIndices((ListIndices)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANGE_TYPE:
      return getChangeType();

    case VERSION:
      return getVersion();

    case INDICES:
      return getIndices();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHANGE_TYPE:
      return isSetChangeType();
    case VERSION:
      return isSetVersion();
    case INDICES:
      return isSetIndices();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Change)
      return this.equals((Change)that);
    return false;
  }

  public boolean equals(Change that) {
    if (that == null)
      return false;

    boolean this_present_changeType = true && this.isSetChangeType();
    boolean that_present_changeType = true && that.isSetChangeType();
    if (this_present_changeType || that_present_changeType) {
      if (!(this_present_changeType && that_present_changeType))
        return false;
      if (!this.changeType.equals(that.changeType))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_indices = true && this.isSetIndices();
    boolean that_present_indices = true && that.isSetIndices();
    if (this_present_indices || that_present_indices) {
      if (!(this_present_indices && that_present_indices))
        return false;
      if (!this.indices.equals(that.indices))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_changeType = true && (isSetChangeType());
    list.add(present_changeType);
    if (present_changeType)
      list.add(changeType.getValue());

    boolean present_version = true;
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_indices = true && (isSetIndices());
    list.add(present_indices);
    if (present_indices)
      list.add(indices);

    return list.hashCode();
  }

  @Override
  public int compareTo(Change other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChangeType()).compareTo(other.isSetChangeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChangeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.changeType, other.changeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndices()).compareTo(other.isSetIndices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indices, other.indices);
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
    StringBuilder sb = new StringBuilder("Change(");
    boolean first = true;

    sb.append("changeType:");
    if (this.changeType == null) {
      sb.append("null");
    } else {
      sb.append(this.changeType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (isSetIndices()) {
      if (!first) sb.append(", ");
      sb.append("indices:");
      if (this.indices == null) {
        sb.append("null");
      } else {
        sb.append(this.indices);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (indices != null) {
      indices.validate();
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

  private static class ChangeStandardSchemeFactory implements SchemeFactory {
    public ChangeStandardScheme getScheme() {
      return new ChangeStandardScheme();
    }
  }

  private static class ChangeStandardScheme extends StandardScheme<Change> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Change struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANGE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.changeType = com.wi.director.thrift.v1.diff.ChangeType.findByValue(iprot.readI32());
              struct.setChangeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INDICES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.indices = new ListIndices();
              struct.indices.read(iprot);
              struct.setIndicesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Change struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.changeType != null) {
        oprot.writeFieldBegin(CHANGE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.changeType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      if (struct.indices != null) {
        if (struct.isSetIndices()) {
          oprot.writeFieldBegin(INDICES_FIELD_DESC);
          struct.indices.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
