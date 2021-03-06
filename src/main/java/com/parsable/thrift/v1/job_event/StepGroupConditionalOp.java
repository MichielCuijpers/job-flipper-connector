/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.job_event;

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
public class StepGroupConditionalOp implements org.apache.thrift.TBase<StepGroupConditionalOp, StepGroupConditionalOp._Fields>, java.io.Serializable, Cloneable, Comparable<StepGroupConditionalOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StepGroupConditionalOp");

  private static final org.apache.thrift.protocol.TField JOB_STEP_GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobStepGroupId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STEP_GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stepGroupId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_YES_FIELD_DESC = new org.apache.thrift.protocol.TField("isYes", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StepGroupConditionalOpStandardSchemeFactory());
  }

  public String jobStepGroupId; // required
  public String stepGroupId; // optional
  public boolean isYes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_STEP_GROUP_ID((short)1, "jobStepGroupId"),
    STEP_GROUP_ID((short)2, "stepGroupId"),
    IS_YES((short)3, "isYes");

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
        case 1: // JOB_STEP_GROUP_ID
          return JOB_STEP_GROUP_ID;
        case 2: // STEP_GROUP_ID
          return STEP_GROUP_ID;
        case 3: // IS_YES
          return IS_YES;
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
  private static final int __ISYES_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STEP_GROUP_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_STEP_GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("jobStepGroupId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.STEP_GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("stepGroupId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.IS_YES, new org.apache.thrift.meta_data.FieldMetaData("isYes", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StepGroupConditionalOp.class, metaDataMap);
  }

  public StepGroupConditionalOp() {
  }

  public StepGroupConditionalOp(
    String jobStepGroupId,
    boolean isYes)
  {
    this();
    this.jobStepGroupId = jobStepGroupId;
    this.isYes = isYes;
    setIsYesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StepGroupConditionalOp(StepGroupConditionalOp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobStepGroupId()) {
      this.jobStepGroupId = other.jobStepGroupId;
    }
    if (other.isSetStepGroupId()) {
      this.stepGroupId = other.stepGroupId;
    }
    this.isYes = other.isYes;
  }

  public StepGroupConditionalOp deepCopy() {
    return new StepGroupConditionalOp(this);
  }

  @Override
  public void clear() {
    this.jobStepGroupId = null;
    this.stepGroupId = null;
    setIsYesIsSet(false);
    this.isYes = false;
  }

  public String getJobStepGroupId() {
    return this.jobStepGroupId;
  }

  public StepGroupConditionalOp setJobStepGroupId(String jobStepGroupId) {
    this.jobStepGroupId = jobStepGroupId;
    return this;
  }

  public void unsetJobStepGroupId() {
    this.jobStepGroupId = null;
  }

  /** Returns true if field jobStepGroupId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobStepGroupId() {
    return this.jobStepGroupId != null;
  }

  public void setJobStepGroupIdIsSet(boolean value) {
    if (!value) {
      this.jobStepGroupId = null;
    }
  }

  public String getStepGroupId() {
    return this.stepGroupId;
  }

  public StepGroupConditionalOp setStepGroupId(String stepGroupId) {
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

  public boolean isIsYes() {
    return this.isYes;
  }

  public StepGroupConditionalOp setIsYes(boolean isYes) {
    this.isYes = isYes;
    setIsYesIsSet(true);
    return this;
  }

  public void unsetIsYes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISYES_ISSET_ID);
  }

  /** Returns true if field isYes is set (has been assigned a value) and false otherwise */
  public boolean isSetIsYes() {
    return EncodingUtils.testBit(__isset_bitfield, __ISYES_ISSET_ID);
  }

  public void setIsYesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISYES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_STEP_GROUP_ID:
      if (value == null) {
        unsetJobStepGroupId();
      } else {
        setJobStepGroupId((String)value);
      }
      break;

    case STEP_GROUP_ID:
      if (value == null) {
        unsetStepGroupId();
      } else {
        setStepGroupId((String)value);
      }
      break;

    case IS_YES:
      if (value == null) {
        unsetIsYes();
      } else {
        setIsYes((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_STEP_GROUP_ID:
      return getJobStepGroupId();

    case STEP_GROUP_ID:
      return getStepGroupId();

    case IS_YES:
      return isIsYes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_STEP_GROUP_ID:
      return isSetJobStepGroupId();
    case STEP_GROUP_ID:
      return isSetStepGroupId();
    case IS_YES:
      return isSetIsYes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StepGroupConditionalOp)
      return this.equals((StepGroupConditionalOp)that);
    return false;
  }

  public boolean equals(StepGroupConditionalOp that) {
    if (that == null)
      return false;

    boolean this_present_jobStepGroupId = true && this.isSetJobStepGroupId();
    boolean that_present_jobStepGroupId = true && that.isSetJobStepGroupId();
    if (this_present_jobStepGroupId || that_present_jobStepGroupId) {
      if (!(this_present_jobStepGroupId && that_present_jobStepGroupId))
        return false;
      if (!this.jobStepGroupId.equals(that.jobStepGroupId))
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

    boolean this_present_isYes = true;
    boolean that_present_isYes = true;
    if (this_present_isYes || that_present_isYes) {
      if (!(this_present_isYes && that_present_isYes))
        return false;
      if (this.isYes != that.isYes)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobStepGroupId = true && (isSetJobStepGroupId());
    list.add(present_jobStepGroupId);
    if (present_jobStepGroupId)
      list.add(jobStepGroupId);

    boolean present_stepGroupId = true && (isSetStepGroupId());
    list.add(present_stepGroupId);
    if (present_stepGroupId)
      list.add(stepGroupId);

    boolean present_isYes = true;
    list.add(present_isYes);
    if (present_isYes)
      list.add(isYes);

    return list.hashCode();
  }

  @Override
  public int compareTo(StepGroupConditionalOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobStepGroupId()).compareTo(other.isSetJobStepGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobStepGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobStepGroupId, other.jobStepGroupId);
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
    lastComparison = Boolean.valueOf(isSetIsYes()).compareTo(other.isSetIsYes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsYes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isYes, other.isYes);
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
    StringBuilder sb = new StringBuilder("StepGroupConditionalOp(");
    boolean first = true;

    sb.append("jobStepGroupId:");
    if (this.jobStepGroupId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobStepGroupId);
    }
    first = false;
    if (isSetStepGroupId()) {
      if (!first) sb.append(", ");
      sb.append("stepGroupId:");
      if (this.stepGroupId == null) {
        sb.append("null");
      } else {
        sb.append(this.stepGroupId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("isYes:");
    sb.append(this.isYes);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (jobStepGroupId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobStepGroupId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'isYes' because it's a primitive and you chose the non-beans generator.
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

  private static class StepGroupConditionalOpStandardSchemeFactory implements SchemeFactory {
    public StepGroupConditionalOpStandardScheme getScheme() {
      return new StepGroupConditionalOpStandardScheme();
    }
  }

  private static class StepGroupConditionalOpStandardScheme extends StandardScheme<StepGroupConditionalOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StepGroupConditionalOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_STEP_GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobStepGroupId = iprot.readString();
              struct.setJobStepGroupIdIsSet(true);
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
          case 3: // IS_YES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isYes = iprot.readBool();
              struct.setIsYesIsSet(true);
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
      if (!struct.isSetIsYes()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'isYes' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StepGroupConditionalOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobStepGroupId != null) {
        oprot.writeFieldBegin(JOB_STEP_GROUP_ID_FIELD_DESC);
        oprot.writeString(struct.jobStepGroupId);
        oprot.writeFieldEnd();
      }
      if (struct.stepGroupId != null) {
        if (struct.isSetStepGroupId()) {
          oprot.writeFieldBegin(STEP_GROUP_ID_FIELD_DESC);
          oprot.writeString(struct.stepGroupId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(IS_YES_FIELD_DESC);
      oprot.writeBool(struct.isYes);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

