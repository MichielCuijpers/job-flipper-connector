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
public class RecurredJobInfo implements org.apache.thrift.TBase<RecurredJobInfo, RecurredJobInfo._Fields>, java.io.Serializable, Cloneable, Comparable<RecurredJobInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RecurredJobInfo");

  private static final org.apache.thrift.protocol.TField RECURRING_JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("recurringJobId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RECURRING_RULE_FIELD_DESC = new org.apache.thrift.protocol.TField("recurringRule", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RecurredJobInfoStandardSchemeFactory());
  }

  public String recurringJobId; // required
  public JobRecurringRule recurringRule; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RECURRING_JOB_ID((short)1, "recurringJobId"),
    RECURRING_RULE((short)2, "recurringRule");

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
        case 1: // RECURRING_JOB_ID
          return RECURRING_JOB_ID;
        case 2: // RECURRING_RULE
          return RECURRING_RULE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECURRING_JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("recurringJobId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECURRING_RULE, new org.apache.thrift.meta_data.FieldMetaData("recurringRule", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobRecurringRule.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RecurredJobInfo.class, metaDataMap);
  }

  public RecurredJobInfo() {
  }

  public RecurredJobInfo(
    String recurringJobId,
    JobRecurringRule recurringRule)
  {
    this();
    this.recurringJobId = recurringJobId;
    this.recurringRule = recurringRule;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RecurredJobInfo(RecurredJobInfo other) {
    if (other.isSetRecurringJobId()) {
      this.recurringJobId = other.recurringJobId;
    }
    if (other.isSetRecurringRule()) {
      this.recurringRule = new JobRecurringRule(other.recurringRule);
    }
  }

  public RecurredJobInfo deepCopy() {
    return new RecurredJobInfo(this);
  }

  @Override
  public void clear() {
    this.recurringJobId = null;
    this.recurringRule = null;
  }

  public String getRecurringJobId() {
    return this.recurringJobId;
  }

  public RecurredJobInfo setRecurringJobId(String recurringJobId) {
    this.recurringJobId = recurringJobId;
    return this;
  }

  public void unsetRecurringJobId() {
    this.recurringJobId = null;
  }

  /** Returns true if field recurringJobId is set (has been assigned a value) and false otherwise */
  public boolean isSetRecurringJobId() {
    return this.recurringJobId != null;
  }

  public void setRecurringJobIdIsSet(boolean value) {
    if (!value) {
      this.recurringJobId = null;
    }
  }

  public JobRecurringRule getRecurringRule() {
    return this.recurringRule;
  }

  public RecurredJobInfo setRecurringRule(JobRecurringRule recurringRule) {
    this.recurringRule = recurringRule;
    return this;
  }

  public void unsetRecurringRule() {
    this.recurringRule = null;
  }

  /** Returns true if field recurringRule is set (has been assigned a value) and false otherwise */
  public boolean isSetRecurringRule() {
    return this.recurringRule != null;
  }

  public void setRecurringRuleIsSet(boolean value) {
    if (!value) {
      this.recurringRule = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECURRING_JOB_ID:
      if (value == null) {
        unsetRecurringJobId();
      } else {
        setRecurringJobId((String)value);
      }
      break;

    case RECURRING_RULE:
      if (value == null) {
        unsetRecurringRule();
      } else {
        setRecurringRule((JobRecurringRule)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECURRING_JOB_ID:
      return getRecurringJobId();

    case RECURRING_RULE:
      return getRecurringRule();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECURRING_JOB_ID:
      return isSetRecurringJobId();
    case RECURRING_RULE:
      return isSetRecurringRule();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RecurredJobInfo)
      return this.equals((RecurredJobInfo)that);
    return false;
  }

  public boolean equals(RecurredJobInfo that) {
    if (that == null)
      return false;

    boolean this_present_recurringJobId = true && this.isSetRecurringJobId();
    boolean that_present_recurringJobId = true && that.isSetRecurringJobId();
    if (this_present_recurringJobId || that_present_recurringJobId) {
      if (!(this_present_recurringJobId && that_present_recurringJobId))
        return false;
      if (!this.recurringJobId.equals(that.recurringJobId))
        return false;
    }

    boolean this_present_recurringRule = true && this.isSetRecurringRule();
    boolean that_present_recurringRule = true && that.isSetRecurringRule();
    if (this_present_recurringRule || that_present_recurringRule) {
      if (!(this_present_recurringRule && that_present_recurringRule))
        return false;
      if (!this.recurringRule.equals(that.recurringRule))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_recurringJobId = true && (isSetRecurringJobId());
    list.add(present_recurringJobId);
    if (present_recurringJobId)
      list.add(recurringJobId);

    boolean present_recurringRule = true && (isSetRecurringRule());
    list.add(present_recurringRule);
    if (present_recurringRule)
      list.add(recurringRule);

    return list.hashCode();
  }

  @Override
  public int compareTo(RecurredJobInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRecurringJobId()).compareTo(other.isSetRecurringJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecurringJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recurringJobId, other.recurringJobId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecurringRule()).compareTo(other.isSetRecurringRule());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecurringRule()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recurringRule, other.recurringRule);
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
    StringBuilder sb = new StringBuilder("RecurredJobInfo(");
    boolean first = true;

    sb.append("recurringJobId:");
    if (this.recurringJobId == null) {
      sb.append("null");
    } else {
      sb.append(this.recurringJobId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recurringRule:");
    if (this.recurringRule == null) {
      sb.append("null");
    } else {
      sb.append(this.recurringRule);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (recurringRule != null) {
      recurringRule.validate();
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

  private static class RecurredJobInfoStandardSchemeFactory implements SchemeFactory {
    public RecurredJobInfoStandardScheme getScheme() {
      return new RecurredJobInfoStandardScheme();
    }
  }

  private static class RecurredJobInfoStandardScheme extends StandardScheme<RecurredJobInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RecurredJobInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECURRING_JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recurringJobId = iprot.readString();
              struct.setRecurringJobIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECURRING_RULE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.recurringRule = new JobRecurringRule();
              struct.recurringRule.read(iprot);
              struct.setRecurringRuleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RecurredJobInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.recurringJobId != null) {
        oprot.writeFieldBegin(RECURRING_JOB_ID_FIELD_DESC);
        oprot.writeString(struct.recurringJobId);
        oprot.writeFieldEnd();
      }
      if (struct.recurringRule != null) {
        oprot.writeFieldBegin(RECURRING_RULE_FIELD_DESC);
        struct.recurringRule.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

