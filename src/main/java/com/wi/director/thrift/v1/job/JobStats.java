/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.job;

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
public class JobStats implements org.apache.thrift.TBase<JobStats, JobStats._Fields>, java.io.Serializable, Cloneable, Comparable<JobStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobStats");

  private static final org.apache.thrift.protocol.TField COMPLETED_STEPS_FIELD_DESC = new org.apache.thrift.protocol.TField("completedSteps", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_STEPS_FIELD_DESC = new org.apache.thrift.protocol.TField("totalSteps", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobStatsStandardSchemeFactory());
  }

  public int completedSteps; // required
  public int totalSteps; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMPLETED_STEPS((short)1, "completedSteps"),
    TOTAL_STEPS((short)2, "totalSteps");

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
        case 1: // COMPLETED_STEPS
          return COMPLETED_STEPS;
        case 2: // TOTAL_STEPS
          return TOTAL_STEPS;
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
  private static final int __COMPLETEDSTEPS_ISSET_ID = 0;
  private static final int __TOTALSTEPS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMPLETED_STEPS, new org.apache.thrift.meta_data.FieldMetaData("completedSteps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_STEPS, new org.apache.thrift.meta_data.FieldMetaData("totalSteps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobStats.class, metaDataMap);
  }

  public JobStats() {
  }

  public JobStats(
    int completedSteps,
    int totalSteps)
  {
    this();
    this.completedSteps = completedSteps;
    setCompletedStepsIsSet(true);
    this.totalSteps = totalSteps;
    setTotalStepsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobStats(JobStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.completedSteps = other.completedSteps;
    this.totalSteps = other.totalSteps;
  }

  public JobStats deepCopy() {
    return new JobStats(this);
  }

  @Override
  public void clear() {
    setCompletedStepsIsSet(false);
    this.completedSteps = 0;
    setTotalStepsIsSet(false);
    this.totalSteps = 0;
  }

  public int getCompletedSteps() {
    return this.completedSteps;
  }

  public JobStats setCompletedSteps(int completedSteps) {
    this.completedSteps = completedSteps;
    setCompletedStepsIsSet(true);
    return this;
  }

  public void unsetCompletedSteps() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMPLETEDSTEPS_ISSET_ID);
  }

  /** Returns true if field completedSteps is set (has been assigned a value) and false otherwise */
  public boolean isSetCompletedSteps() {
    return EncodingUtils.testBit(__isset_bitfield, __COMPLETEDSTEPS_ISSET_ID);
  }

  public void setCompletedStepsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMPLETEDSTEPS_ISSET_ID, value);
  }

  public int getTotalSteps() {
    return this.totalSteps;
  }

  public JobStats setTotalSteps(int totalSteps) {
    this.totalSteps = totalSteps;
    setTotalStepsIsSet(true);
    return this;
  }

  public void unsetTotalSteps() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALSTEPS_ISSET_ID);
  }

  /** Returns true if field totalSteps is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalSteps() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALSTEPS_ISSET_ID);
  }

  public void setTotalStepsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALSTEPS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMPLETED_STEPS:
      if (value == null) {
        unsetCompletedSteps();
      } else {
        setCompletedSteps((Integer)value);
      }
      break;

    case TOTAL_STEPS:
      if (value == null) {
        unsetTotalSteps();
      } else {
        setTotalSteps((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMPLETED_STEPS:
      return getCompletedSteps();

    case TOTAL_STEPS:
      return getTotalSteps();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMPLETED_STEPS:
      return isSetCompletedSteps();
    case TOTAL_STEPS:
      return isSetTotalSteps();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobStats)
      return this.equals((JobStats)that);
    return false;
  }

  public boolean equals(JobStats that) {
    if (that == null)
      return false;

    boolean this_present_completedSteps = true;
    boolean that_present_completedSteps = true;
    if (this_present_completedSteps || that_present_completedSteps) {
      if (!(this_present_completedSteps && that_present_completedSteps))
        return false;
      if (this.completedSteps != that.completedSteps)
        return false;
    }

    boolean this_present_totalSteps = true;
    boolean that_present_totalSteps = true;
    if (this_present_totalSteps || that_present_totalSteps) {
      if (!(this_present_totalSteps && that_present_totalSteps))
        return false;
      if (this.totalSteps != that.totalSteps)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_completedSteps = true;
    list.add(present_completedSteps);
    if (present_completedSteps)
      list.add(completedSteps);

    boolean present_totalSteps = true;
    list.add(present_totalSteps);
    if (present_totalSteps)
      list.add(totalSteps);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCompletedSteps()).compareTo(other.isSetCompletedSteps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompletedSteps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.completedSteps, other.completedSteps);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalSteps()).compareTo(other.isSetTotalSteps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalSteps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalSteps, other.totalSteps);
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
    StringBuilder sb = new StringBuilder("JobStats(");
    boolean first = true;

    sb.append("completedSteps:");
    sb.append(this.completedSteps);
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalSteps:");
    sb.append(this.totalSteps);
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

  private static class JobStatsStandardSchemeFactory implements SchemeFactory {
    public JobStatsStandardScheme getScheme() {
      return new JobStatsStandardScheme();
    }
  }

  private static class JobStatsStandardScheme extends StandardScheme<JobStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMPLETED_STEPS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.completedSteps = iprot.readI32();
              struct.setCompletedStepsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL_STEPS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalSteps = iprot.readI32();
              struct.setTotalStepsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COMPLETED_STEPS_FIELD_DESC);
      oprot.writeI32(struct.completedSteps);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_STEPS_FIELD_DESC);
      oprot.writeI32(struct.totalSteps);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

