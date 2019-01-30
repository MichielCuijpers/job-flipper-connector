/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.common_event;

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
public class CloneStepGroupOp implements org.apache.thrift.TBase<CloneStepGroupOp, CloneStepGroupOp._Fields>, java.io.Serializable, Cloneable, Comparable<CloneStepGroupOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CloneStepGroupOp");

  private static final org.apache.thrift.protocol.TField PARENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parentId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STEP_GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stepGroupId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CloneStepGroupOpStandardSchemeFactory());
  }

  public String parentId; // required
  public String stepGroupId; // required
  public int position; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARENT_ID((short)1, "parentId"),
    STEP_GROUP_ID((short)2, "stepGroupId"),
    POSITION((short)3, "position");

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
        case 1: // PARENT_ID
          return PARENT_ID;
        case 2: // STEP_GROUP_ID
          return STEP_GROUP_ID;
        case 3: // POSITION
          return POSITION;
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
  private static final int __POSITION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARENT_ID, new org.apache.thrift.meta_data.FieldMetaData("parentId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.STEP_GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("stepGroupId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.POSITION, new org.apache.thrift.meta_data.FieldMetaData("position", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CloneStepGroupOp.class, metaDataMap);
  }

  public CloneStepGroupOp() {
    this.position = -1;

  }

  public CloneStepGroupOp(
    String parentId,
    String stepGroupId,
    int position)
  {
    this();
    this.parentId = parentId;
    this.stepGroupId = stepGroupId;
    this.position = position;
    setPositionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CloneStepGroupOp(CloneStepGroupOp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetParentId()) {
      this.parentId = other.parentId;
    }
    if (other.isSetStepGroupId()) {
      this.stepGroupId = other.stepGroupId;
    }
    this.position = other.position;
  }

  public CloneStepGroupOp deepCopy() {
    return new CloneStepGroupOp(this);
  }

  @Override
  public void clear() {
    this.parentId = null;
    this.stepGroupId = null;
    this.position = -1;

  }

  public String getParentId() {
    return this.parentId;
  }

  public CloneStepGroupOp setParentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  public void unsetParentId() {
    this.parentId = null;
  }

  /** Returns true if field parentId is set (has been assigned a value) and false otherwise */
  public boolean isSetParentId() {
    return this.parentId != null;
  }

  public void setParentIdIsSet(boolean value) {
    if (!value) {
      this.parentId = null;
    }
  }

  public String getStepGroupId() {
    return this.stepGroupId;
  }

  public CloneStepGroupOp setStepGroupId(String stepGroupId) {
    this.stepGroupId = stepGroupId;
    return this;
  }

  public void unsetStepGroupId() {
    this.stepGroupId = null;
  }

  /** Returns true if field stepGroupId is set (has been assigned a value) and false otherwise */
  public boolean isSetStepGroupId() {
    return this.stepGroupId != null;
  }

  public void setStepGroupIdIsSet(boolean value) {
    if (!value) {
      this.stepGroupId = null;
    }
  }

  public int getPosition() {
    return this.position;
  }

  public CloneStepGroupOp setPosition(int position) {
    this.position = position;
    setPositionIsSet(true);
    return this;
  }

  public void unsetPosition() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __POSITION_ISSET_ID);
  }

  /** Returns true if field position is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition() {
    return EncodingUtils.testBit(__isset_bitfield, __POSITION_ISSET_ID);
  }

  public void setPositionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __POSITION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARENT_ID:
      if (value == null) {
        unsetParentId();
      } else {
        setParentId((String)value);
      }
      break;

    case STEP_GROUP_ID:
      if (value == null) {
        unsetStepGroupId();
      } else {
        setStepGroupId((String)value);
      }
      break;

    case POSITION:
      if (value == null) {
        unsetPosition();
      } else {
        setPosition((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARENT_ID:
      return getParentId();

    case STEP_GROUP_ID:
      return getStepGroupId();

    case POSITION:
      return getPosition();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARENT_ID:
      return isSetParentId();
    case STEP_GROUP_ID:
      return isSetStepGroupId();
    case POSITION:
      return isSetPosition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CloneStepGroupOp)
      return this.equals((CloneStepGroupOp)that);
    return false;
  }

  public boolean equals(CloneStepGroupOp that) {
    if (that == null)
      return false;

    boolean this_present_parentId = true && this.isSetParentId();
    boolean that_present_parentId = true && that.isSetParentId();
    if (this_present_parentId || that_present_parentId) {
      if (!(this_present_parentId && that_present_parentId))
        return false;
      if (!this.parentId.equals(that.parentId))
        return false;
    }

    boolean this_present_stepGroupId = true && this.isSetStepGroupId();
    boolean that_present_stepGroupId = true && that.isSetStepGroupId();
    if (this_present_stepGroupId || that_present_stepGroupId) {
      if (!(this_present_stepGroupId && that_present_stepGroupId))
        return false;
      if (!this.stepGroupId.equals(that.stepGroupId))
        return false;
    }

    boolean this_present_position = true;
    boolean that_present_position = true;
    if (this_present_position || that_present_position) {
      if (!(this_present_position && that_present_position))
        return false;
      if (this.position != that.position)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_parentId = true && (isSetParentId());
    list.add(present_parentId);
    if (present_parentId)
      list.add(parentId);

    boolean present_stepGroupId = true && (isSetStepGroupId());
    list.add(present_stepGroupId);
    if (present_stepGroupId)
      list.add(stepGroupId);

    boolean present_position = true;
    list.add(present_position);
    if (present_position)
      list.add(position);

    return list.hashCode();
  }

  @Override
  public int compareTo(CloneStepGroupOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetParentId()).compareTo(other.isSetParentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentId, other.parentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStepGroupId()).compareTo(other.isSetStepGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStepGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stepGroupId, other.stepGroupId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPosition()).compareTo(other.isSetPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position, other.position);
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
    StringBuilder sb = new StringBuilder("CloneStepGroupOp(");
    boolean first = true;

    sb.append("parentId:");
    if (this.parentId == null) {
      sb.append("null");
    } else {
      sb.append(this.parentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stepGroupId:");
    if (this.stepGroupId == null) {
      sb.append("null");
    } else {
      sb.append(this.stepGroupId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("position:");
    sb.append(this.position);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (parentId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'parentId' was not present! Struct: " + toString());
    }
    if (stepGroupId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stepGroupId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'position' because it's a primitive and you chose the non-beans generator.
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

  private static class CloneStepGroupOpStandardSchemeFactory implements SchemeFactory {
    public CloneStepGroupOpStandardScheme getScheme() {
      return new CloneStepGroupOpStandardScheme();
    }
  }

  private static class CloneStepGroupOpStandardScheme extends StandardScheme<CloneStepGroupOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CloneStepGroupOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parentId = iprot.readString();
              struct.setParentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STEP_GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stepGroupId = iprot.readString();
              struct.setStepGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.position = iprot.readI32();
              struct.setPositionIsSet(true);
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
      if (!struct.isSetPosition()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'position' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CloneStepGroupOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.parentId != null) {
        oprot.writeFieldBegin(PARENT_ID_FIELD_DESC);
        oprot.writeString(struct.parentId);
        oprot.writeFieldEnd();
      }
      if (struct.stepGroupId != null) {
        oprot.writeFieldBegin(STEP_GROUP_ID_FIELD_DESC);
        oprot.writeString(struct.stepGroupId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(POSITION_FIELD_DESC);
      oprot.writeI32(struct.position);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
