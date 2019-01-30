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
public class JobSliceAndVersion implements org.apache.thrift.TBase<JobSliceAndVersion, JobSliceAndVersion._Fields>, java.io.Serializable, Cloneable, Comparable<JobSliceAndVersion> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobSliceAndVersion");

  private static final org.apache.thrift.protocol.TField LATEST_FIELD_DESC = new org.apache.thrift.protocol.TField("latest", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_SLICE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSlice", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobSliceAndVersionStandardSchemeFactory());
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> latest; // required
  public JobSlice jobSlice; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LATEST((short)1, "latest"),
    JOB_SLICE((short)2, "jobSlice");

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
        case 1: // LATEST
          return LATEST;
        case 2: // JOB_SLICE
          return JOB_SLICE;
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
    tmpMap.put(_Fields.LATEST, new org.apache.thrift.meta_data.FieldMetaData("latest", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
    tmpMap.put(_Fields.JOB_SLICE, new org.apache.thrift.meta_data.FieldMetaData("jobSlice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobSlice.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobSliceAndVersion.class, metaDataMap);
  }

  public JobSliceAndVersion() {
  }

  public JobSliceAndVersion(
    List<com.parsable.thrift.v1.core_event.NodeVersion> latest,
    JobSlice jobSlice)
  {
    this();
    this.latest = latest;
    this.jobSlice = jobSlice;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobSliceAndVersion(JobSliceAndVersion other) {
    if (other.isSetLatest()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__latest = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.latest.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.latest) {
        __this__latest.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.latest = __this__latest;
    }
    if (other.isSetJobSlice()) {
      this.jobSlice = new JobSlice(other.jobSlice);
    }
  }

  public JobSliceAndVersion deepCopy() {
    return new JobSliceAndVersion(this);
  }

  @Override
  public void clear() {
    this.latest = null;
    this.jobSlice = null;
  }

  public int getLatestSize() {
    return (this.latest == null) ? 0 : this.latest.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getLatestIterator() {
    return (this.latest == null) ? null : this.latest.iterator();
  }

  public void addToLatest(com.parsable.thrift.v1.core_event.NodeVersion elem) {
    if (this.latest == null) {
      this.latest = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
    }
    this.latest.add(elem);
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> getLatest() {
    return this.latest;
  }

  public JobSliceAndVersion setLatest(List<com.parsable.thrift.v1.core_event.NodeVersion> latest) {
    this.latest = latest;
    return this;
  }

  public void unsetLatest() {
    this.latest = null;
  }

  /** Returns true if field latest is set (has been assigned a value) and false otherwise */
  public boolean isSetLatest() {
    return this.latest != null;
  }

  public void setLatestIsSet(boolean value) {
    if (!value) {
      this.latest = null;
    }
  }

  public JobSlice getJobSlice() {
    return this.jobSlice;
  }

  public JobSliceAndVersion setJobSlice(JobSlice jobSlice) {
    this.jobSlice = jobSlice;
    return this;
  }

  public void unsetJobSlice() {
    this.jobSlice = null;
  }

  /** Returns true if field jobSlice is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSlice() {
    return this.jobSlice != null;
  }

  public void setJobSliceIsSet(boolean value) {
    if (!value) {
      this.jobSlice = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LATEST:
      if (value == null) {
        unsetLatest();
      } else {
        setLatest((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
      }
      break;

    case JOB_SLICE:
      if (value == null) {
        unsetJobSlice();
      } else {
        setJobSlice((JobSlice)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LATEST:
      return getLatest();

    case JOB_SLICE:
      return getJobSlice();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LATEST:
      return isSetLatest();
    case JOB_SLICE:
      return isSetJobSlice();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobSliceAndVersion)
      return this.equals((JobSliceAndVersion)that);
    return false;
  }

  public boolean equals(JobSliceAndVersion that) {
    if (that == null)
      return false;

    boolean this_present_latest = true && this.isSetLatest();
    boolean that_present_latest = true && that.isSetLatest();
    if (this_present_latest || that_present_latest) {
      if (!(this_present_latest && that_present_latest))
        return false;
      if (!this.latest.equals(that.latest))
        return false;
    }

    boolean this_present_jobSlice = true && this.isSetJobSlice();
    boolean that_present_jobSlice = true && that.isSetJobSlice();
    if (this_present_jobSlice || that_present_jobSlice) {
      if (!(this_present_jobSlice && that_present_jobSlice))
        return false;
      if (!this.jobSlice.equals(that.jobSlice))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_latest = true && (isSetLatest());
    list.add(present_latest);
    if (present_latest)
      list.add(latest);

    boolean present_jobSlice = true && (isSetJobSlice());
    list.add(present_jobSlice);
    if (present_jobSlice)
      list.add(jobSlice);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobSliceAndVersion other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLatest()).compareTo(other.isSetLatest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latest, other.latest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobSlice()).compareTo(other.isSetJobSlice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSlice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSlice, other.jobSlice);
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
    StringBuilder sb = new StringBuilder("JobSliceAndVersion(");
    boolean first = true;

    sb.append("latest:");
    if (this.latest == null) {
      sb.append("null");
    } else {
      sb.append(this.latest);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobSlice:");
    if (this.jobSlice == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSlice);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (jobSlice != null) {
      jobSlice.validate();
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

  private static class JobSliceAndVersionStandardSchemeFactory implements SchemeFactory {
    public JobSliceAndVersionStandardScheme getScheme() {
      return new JobSliceAndVersionStandardScheme();
    }
  }

  private static class JobSliceAndVersionStandardScheme extends StandardScheme<JobSliceAndVersion> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobSliceAndVersion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LATEST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list94 = iprot.readListBegin();
                struct.latest = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list94.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem95;
                for (int _i96 = 0; _i96 < _list94.size; ++_i96)
                {
                  _elem95 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem95.read(iprot);
                  struct.latest.add(_elem95);
                }
                iprot.readListEnd();
              }
              struct.setLatestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_SLICE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobSlice = new JobSlice();
              struct.jobSlice.read(iprot);
              struct.setJobSliceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobSliceAndVersion struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.latest != null) {
        oprot.writeFieldBegin(LATEST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.latest.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter97 : struct.latest)
          {
            _iter97.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.jobSlice != null) {
        oprot.writeFieldBegin(JOB_SLICE_FIELD_DESC);
        struct.jobSlice.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
