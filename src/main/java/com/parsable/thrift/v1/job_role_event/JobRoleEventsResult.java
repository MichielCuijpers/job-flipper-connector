/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.job_role_event;

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
public class JobRoleEventsResult implements org.apache.thrift.TBase<JobRoleEventsResult, JobRoleEventsResult._Fields>, java.io.Serializable, Cloneable, Comparable<JobRoleEventsResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobRoleEventsResult");

  private static final org.apache.thrift.protocol.TField LATEST_FIELD_DESC = new org.apache.thrift.protocol.TField("latest", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("events", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobRoleEventsResultStandardSchemeFactory());
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> latest; // required
  public List<JobRoleEvent> events; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LATEST((short)1, "latest"),
    EVENTS((short)2, "events");

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
        case 2: // EVENTS
          return EVENTS;
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
    tmpMap.put(_Fields.EVENTS, new org.apache.thrift.meta_data.FieldMetaData("events", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobRoleEvent.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobRoleEventsResult.class, metaDataMap);
  }

  public JobRoleEventsResult() {
  }

  public JobRoleEventsResult(
    List<com.parsable.thrift.v1.core_event.NodeVersion> latest,
    List<JobRoleEvent> events)
  {
    this();
    this.latest = latest;
    this.events = events;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobRoleEventsResult(JobRoleEventsResult other) {
    if (other.isSetLatest()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__latest = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.latest.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.latest) {
        __this__latest.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.latest = __this__latest;
    }
    if (other.isSetEvents()) {
      List<JobRoleEvent> __this__events = new ArrayList<JobRoleEvent>(other.events.size());
      for (JobRoleEvent other_element : other.events) {
        __this__events.add(new JobRoleEvent(other_element));
      }
      this.events = __this__events;
    }
  }

  public JobRoleEventsResult deepCopy() {
    return new JobRoleEventsResult(this);
  }

  @Override
  public void clear() {
    this.latest = null;
    this.events = null;
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

  public JobRoleEventsResult setLatest(List<com.parsable.thrift.v1.core_event.NodeVersion> latest) {
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

  public int getEventsSize() {
    return (this.events == null) ? 0 : this.events.size();
  }

  public java.util.Iterator<JobRoleEvent> getEventsIterator() {
    return (this.events == null) ? null : this.events.iterator();
  }

  public void addToEvents(JobRoleEvent elem) {
    if (this.events == null) {
      this.events = new ArrayList<JobRoleEvent>();
    }
    this.events.add(elem);
  }

  public List<JobRoleEvent> getEvents() {
    return this.events;
  }

  public JobRoleEventsResult setEvents(List<JobRoleEvent> events) {
    this.events = events;
    return this;
  }

  public void unsetEvents() {
    this.events = null;
  }

  /** Returns true if field events is set (has been assigned a value) and false otherwise */
  public boolean isSetEvents() {
    return this.events != null;
  }

  public void setEventsIsSet(boolean value) {
    if (!value) {
      this.events = null;
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

    case EVENTS:
      if (value == null) {
        unsetEvents();
      } else {
        setEvents((List<JobRoleEvent>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LATEST:
      return getLatest();

    case EVENTS:
      return getEvents();

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
    case EVENTS:
      return isSetEvents();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobRoleEventsResult)
      return this.equals((JobRoleEventsResult)that);
    return false;
  }

  public boolean equals(JobRoleEventsResult that) {
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

    boolean this_present_events = true && this.isSetEvents();
    boolean that_present_events = true && that.isSetEvents();
    if (this_present_events || that_present_events) {
      if (!(this_present_events && that_present_events))
        return false;
      if (!this.events.equals(that.events))
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

    boolean present_events = true && (isSetEvents());
    list.add(present_events);
    if (present_events)
      list.add(events);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobRoleEventsResult other) {
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
    lastComparison = Boolean.valueOf(isSetEvents()).compareTo(other.isSetEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEvents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.events, other.events);
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
    StringBuilder sb = new StringBuilder("JobRoleEventsResult(");
    boolean first = true;

    sb.append("latest:");
    if (this.latest == null) {
      sb.append("null");
    } else {
      sb.append(this.latest);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("events:");
    if (this.events == null) {
      sb.append("null");
    } else {
      sb.append(this.events);
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

  private static class JobRoleEventsResultStandardSchemeFactory implements SchemeFactory {
    public JobRoleEventsResultStandardScheme getScheme() {
      return new JobRoleEventsResultStandardScheme();
    }
  }

  private static class JobRoleEventsResultStandardScheme extends StandardScheme<JobRoleEventsResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobRoleEventsResult struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.latest = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list0.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem1.read(iprot);
                  struct.latest.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLatestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.events = new ArrayList<JobRoleEvent>(_list3.size);
                JobRoleEvent _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new JobRoleEvent();
                  _elem4.read(iprot);
                  struct.events.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setEventsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobRoleEventsResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.latest != null) {
        oprot.writeFieldBegin(LATEST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.latest.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter6 : struct.latest)
          {
            _iter6.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.events != null) {
        oprot.writeFieldBegin(EVENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.events.size()));
          for (JobRoleEvent _iter7 : struct.events)
          {
            _iter7.write(oprot);
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

