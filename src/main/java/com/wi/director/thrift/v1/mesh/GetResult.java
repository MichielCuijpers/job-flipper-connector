/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.mesh;

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
public class GetResult implements org.apache.thrift.TBase<GetResult, GetResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetResult");

  private static final org.apache.thrift.protocol.TField JOB_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("jobEvents", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetResultStandardSchemeFactory());
  }

  public List<com.parsable.thrift.v1.job_event.JobEvent> jobEvents; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_EVENTS((short)1, "jobEvents");

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
        case 1: // JOB_EVENTS
          return JOB_EVENTS;
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
    tmpMap.put(_Fields.JOB_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("jobEvents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.job_event.JobEvent.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetResult.class, metaDataMap);
  }

  public GetResult() {
  }

  public GetResult(
    List<com.parsable.thrift.v1.job_event.JobEvent> jobEvents)
  {
    this();
    this.jobEvents = jobEvents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetResult(GetResult other) {
    if (other.isSetJobEvents()) {
      List<com.parsable.thrift.v1.job_event.JobEvent> __this__jobEvents = new ArrayList<com.parsable.thrift.v1.job_event.JobEvent>(other.jobEvents.size());
      for (com.parsable.thrift.v1.job_event.JobEvent other_element : other.jobEvents) {
        __this__jobEvents.add(new com.parsable.thrift.v1.job_event.JobEvent(other_element));
      }
      this.jobEvents = __this__jobEvents;
    }
  }

  public GetResult deepCopy() {
    return new GetResult(this);
  }

  @Override
  public void clear() {
    this.jobEvents = null;
  }

  public int getJobEventsSize() {
    return (this.jobEvents == null) ? 0 : this.jobEvents.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.job_event.JobEvent> getJobEventsIterator() {
    return (this.jobEvents == null) ? null : this.jobEvents.iterator();
  }

  public void addToJobEvents(com.parsable.thrift.v1.job_event.JobEvent elem) {
    if (this.jobEvents == null) {
      this.jobEvents = new ArrayList<com.parsable.thrift.v1.job_event.JobEvent>();
    }
    this.jobEvents.add(elem);
  }

  public List<com.parsable.thrift.v1.job_event.JobEvent> getJobEvents() {
    return this.jobEvents;
  }

  public GetResult setJobEvents(List<com.parsable.thrift.v1.job_event.JobEvent> jobEvents) {
    this.jobEvents = jobEvents;
    return this;
  }

  public void unsetJobEvents() {
    this.jobEvents = null;
  }

  /** Returns true if field jobEvents is set (has been assigned a value) and false otherwise */
  public boolean isSetJobEvents() {
    return this.jobEvents != null;
  }

  public void setJobEventsIsSet(boolean value) {
    if (!value) {
      this.jobEvents = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_EVENTS:
      if (value == null) {
        unsetJobEvents();
      } else {
        setJobEvents((List<com.parsable.thrift.v1.job_event.JobEvent>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_EVENTS:
      return getJobEvents();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_EVENTS:
      return isSetJobEvents();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetResult)
      return this.equals((GetResult)that);
    return false;
  }

  public boolean equals(GetResult that) {
    if (that == null)
      return false;

    boolean this_present_jobEvents = true && this.isSetJobEvents();
    boolean that_present_jobEvents = true && that.isSetJobEvents();
    if (this_present_jobEvents || that_present_jobEvents) {
      if (!(this_present_jobEvents && that_present_jobEvents))
        return false;
      if (!this.jobEvents.equals(that.jobEvents))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobEvents = true && (isSetJobEvents());
    list.add(present_jobEvents);
    if (present_jobEvents)
      list.add(jobEvents);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobEvents()).compareTo(other.isSetJobEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobEvents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobEvents, other.jobEvents);
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
    StringBuilder sb = new StringBuilder("GetResult(");
    boolean first = true;

    sb.append("jobEvents:");
    if (this.jobEvents == null) {
      sb.append("null");
    } else {
      sb.append(this.jobEvents);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetResultStandardSchemeFactory implements SchemeFactory {
    public GetResultStandardScheme getScheme() {
      return new GetResultStandardScheme();
    }
  }

  private static class GetResultStandardScheme extends StandardScheme<GetResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
                struct.jobEvents = new ArrayList<com.parsable.thrift.v1.job_event.JobEvent>(_list12.size);
                com.parsable.thrift.v1.job_event.JobEvent _elem13;
                for (int _i14 = 0; _i14 < _list12.size; ++_i14)
                {
                  _elem13 = new com.parsable.thrift.v1.job_event.JobEvent();
                  _elem13.read(iprot);
                  struct.jobEvents.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setJobEventsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobEvents != null) {
        oprot.writeFieldBegin(JOB_EVENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.jobEvents.size()));
          for (com.parsable.thrift.v1.job_event.JobEvent _iter15 : struct.jobEvents)
          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

