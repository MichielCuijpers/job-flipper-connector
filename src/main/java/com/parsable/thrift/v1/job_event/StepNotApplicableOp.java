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
public class StepNotApplicableOp implements org.apache.thrift.TBase<StepNotApplicableOp, StepNotApplicableOp._Fields>, java.io.Serializable, Cloneable, Comparable<StepNotApplicableOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StepNotApplicableOp");

  private static final org.apache.thrift.protocol.TField JOB_STEP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobStepId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STEP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stepId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_NOT_APPLICABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("isNotApplicable", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StepNotApplicableOpStandardSchemeFactory());
  }

  public String jobStepId; // required
  public String stepId; // optional
  public boolean isNotApplicable; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_STEP_ID((short)1, "jobStepId"),
    STEP_ID((short)2, "stepId"),
    IS_NOT_APPLICABLE((short)3, "isNotApplicable");

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
        case 1: // JOB_STEP_ID
          return JOB_STEP_ID;
        case 2: // STEP_ID
          return STEP_ID;
        case 3: // IS_NOT_APPLICABLE
          return IS_NOT_APPLICABLE;
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
  private static final int __ISNOTAPPLICABLE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STEP_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_STEP_ID, new org.apache.thrift.meta_data.FieldMetaData("jobStepId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.STEP_ID, new org.apache.thrift.meta_data.FieldMetaData("stepId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.IS_NOT_APPLICABLE, new org.apache.thrift.meta_data.FieldMetaData("isNotApplicable", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StepNotApplicableOp.class, metaDataMap);
  }

  public StepNotApplicableOp() {
  }

  public StepNotApplicableOp(
    String jobStepId,
    boolean isNotApplicable)
  {
    this();
    this.jobStepId = jobStepId;
    this.isNotApplicable = isNotApplicable;
    setIsNotApplicableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StepNotApplicableOp(StepNotApplicableOp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobStepId()) {
      this.jobStepId = other.jobStepId;
    }
    if (other.isSetStepId()) {
      this.stepId = other.stepId;
    }
    this.isNotApplicable = other.isNotApplicable;
  }

  public StepNotApplicableOp deepCopy() {
    return new StepNotApplicableOp(this);
  }

  @Override
  public void clear() {
    this.jobStepId = null;
    this.stepId = null;
    setIsNotApplicableIsSet(false);
    this.isNotApplicable = false;
  }

  public String getJobStepId() {
    return this.jobStepId;
  }

  public StepNotApplicableOp setJobStepId(String jobStepId) {
    this.jobStepId = jobStepId;
    return this;
  }

  public void unsetJobStepId() {
    this.jobStepId = null;
  }

  /** Returns true if field jobStepId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobStepId() {
    return this.jobStepId != null;
  }

  public void setJobStepIdIsSet(boolean value) {
    if (!value) {
      this.jobStepId = null;
    }
  }

  public String getStepId() {
    return this.stepId;
  }

  public StepNotApplicableOp setStepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  public void unsetStepId() {
    this.stepId = null;
  }

  /** Returns true if field stepId is set (has been assigned a value) and false otherwise */
  public boolean isSetStepId() {
    return this.stepId != null;
  }

  public void setStepIdIsSet(boolean value) {
    if (!value) {
      this.stepId = null;
    }
  }

  public boolean isIsNotApplicable() {
    return this.isNotApplicable;
  }

  public StepNotApplicableOp setIsNotApplicable(boolean isNotApplicable) {
    this.isNotApplicable = isNotApplicable;
    setIsNotApplicableIsSet(true);
    return this;
  }

  public void unsetIsNotApplicable() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISNOTAPPLICABLE_ISSET_ID);
  }

  /** Returns true if field isNotApplicable is set (has been assigned a value) and false otherwise */
  public boolean isSetIsNotApplicable() {
    return EncodingUtils.testBit(__isset_bitfield, __ISNOTAPPLICABLE_ISSET_ID);
  }

  public void setIsNotApplicableIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISNOTAPPLICABLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_STEP_ID:
      if (value == null) {
        unsetJobStepId();
      } else {
        setJobStepId((String)value);
      }
      break;

    case STEP_ID:
      if (value == null) {
        unsetStepId();
      } else {
        setStepId((String)value);
      }
      break;

    case IS_NOT_APPLICABLE:
      if (value == null) {
        unsetIsNotApplicable();
      } else {
        setIsNotApplicable((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_STEP_ID:
      return getJobStepId();

    case STEP_ID:
      return getStepId();

    case IS_NOT_APPLICABLE:
      return isIsNotApplicable();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_STEP_ID:
      return isSetJobStepId();
    case STEP_ID:
      return isSetStepId();
    case IS_NOT_APPLICABLE:
      return isSetIsNotApplicable();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StepNotApplicableOp)
      return this.equals((StepNotApplicableOp)that);
    return false;
  }

  public boolean equals(StepNotApplicableOp that) {
    if (that == null)
      return false;

    boolean this_present_jobStepId = true && this.isSetJobStepId();
    boolean that_present_jobStepId = true && that.isSetJobStepId();
    if (this_present_jobStepId || that_present_jobStepId) {
      if (!(this_present_jobStepId && that_present_jobStepId))
        return false;
      if (!this.jobStepId.equals(that.jobStepId))
        return false;
    }

    boolean this_present_stepId = true && this.isSetStepId();
    boolean that_present_stepId = true && that.isSetStepId();
    if (this_present_stepId || that_present_stepId) {
      if (!(this_present_stepId && that_present_stepId))
        return false;
      if (!this.stepId.equals(that.stepId))
        return false;
    }

    boolean this_present_isNotApplicable = true;
    boolean that_present_isNotApplicable = true;
    if (this_present_isNotApplicable || that_present_isNotApplicable) {
      if (!(this_present_isNotApplicable && that_present_isNotApplicable))
        return false;
      if (this.isNotApplicable != that.isNotApplicable)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobStepId = true && (isSetJobStepId());
    list.add(present_jobStepId);
    if (present_jobStepId)
      list.add(jobStepId);

    boolean present_stepId = true && (isSetStepId());
    list.add(present_stepId);
    if (present_stepId)
      list.add(stepId);

    boolean present_isNotApplicable = true;
    list.add(present_isNotApplicable);
    if (present_isNotApplicable)
      list.add(isNotApplicable);

    return list.hashCode();
  }

  @Override
  public int compareTo(StepNotApplicableOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobStepId()).compareTo(other.isSetJobStepId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobStepId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobStepId, other.jobStepId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStepId()).compareTo(other.isSetStepId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStepId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stepId, other.stepId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsNotApplicable()).compareTo(other.isSetIsNotApplicable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsNotApplicable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isNotApplicable, other.isNotApplicable);
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
    StringBuilder sb = new StringBuilder("StepNotApplicableOp(");
    boolean first = true;

    sb.append("jobStepId:");
    if (this.jobStepId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobStepId);
    }
    first = false;
    if (isSetStepId()) {
      if (!first) sb.append(", ");
      sb.append("stepId:");
      if (this.stepId == null) {
        sb.append("null");
      } else {
        sb.append(this.stepId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("isNotApplicable:");
    sb.append(this.isNotApplicable);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (jobStepId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobStepId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'isNotApplicable' because it's a primitive and you chose the non-beans generator.
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

  private static class StepNotApplicableOpStandardSchemeFactory implements SchemeFactory {
    public StepNotApplicableOpStandardScheme getScheme() {
      return new StepNotApplicableOpStandardScheme();
    }
  }

  private static class StepNotApplicableOpStandardScheme extends StandardScheme<StepNotApplicableOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StepNotApplicableOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_STEP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobStepId = iprot.readString();
              struct.setJobStepIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STEP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stepId = iprot.readString();
              struct.setStepIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_NOT_APPLICABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isNotApplicable = iprot.readBool();
              struct.setIsNotApplicableIsSet(true);
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
      if (!struct.isSetIsNotApplicable()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'isNotApplicable' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StepNotApplicableOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobStepId != null) {
        oprot.writeFieldBegin(JOB_STEP_ID_FIELD_DESC);
        oprot.writeString(struct.jobStepId);
        oprot.writeFieldEnd();
      }
      if (struct.stepId != null) {
        if (struct.isSetStepId()) {
          oprot.writeFieldBegin(STEP_ID_FIELD_DESC);
          oprot.writeString(struct.stepId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(IS_NOT_APPLICABLE_FIELD_DESC);
      oprot.writeBool(struct.isNotApplicable);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

