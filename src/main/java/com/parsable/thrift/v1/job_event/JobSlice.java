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
public class JobSlice implements org.apache.thrift.TBase<JobSlice, JobSlice._Fields>, java.io.Serializable, Cloneable, Comparable<JobSlice> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobSlice");

  private static final org.apache.thrift.protocol.TField TOP_FIELD_DESC = new org.apache.thrift.protocol.TField("top", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("jobEvents", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField BOTTOM_FIELD_DESC = new org.apache.thrift.protocol.TField("bottom", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobSliceStandardSchemeFactory());
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> top; // required
  public List<JobEvent> jobEvents; // required
  public List<com.parsable.thrift.v1.core_event.NodeVersion> bottom; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOP((short)1, "top"),
    JOB_EVENTS((short)2, "jobEvents"),
    BOTTOM((short)3, "bottom");

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
        case 1: // TOP
          return TOP;
        case 2: // JOB_EVENTS
          return JOB_EVENTS;
        case 3: // BOTTOM
          return BOTTOM;
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
    tmpMap.put(_Fields.TOP, new org.apache.thrift.meta_data.FieldMetaData("top", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
    tmpMap.put(_Fields.JOB_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("jobEvents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobEvent.class))));
    tmpMap.put(_Fields.BOTTOM, new org.apache.thrift.meta_data.FieldMetaData("bottom", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobSlice.class, metaDataMap);
  }

  public JobSlice() {
  }

  public JobSlice(
    List<com.parsable.thrift.v1.core_event.NodeVersion> top,
    List<JobEvent> jobEvents,
    List<com.parsable.thrift.v1.core_event.NodeVersion> bottom)
  {
    this();
    this.top = top;
    this.jobEvents = jobEvents;
    this.bottom = bottom;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobSlice(JobSlice other) {
    if (other.isSetTop()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__top = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.top.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.top) {
        __this__top.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.top = __this__top;
    }
    if (other.isSetJobEvents()) {
      List<JobEvent> __this__jobEvents = new ArrayList<JobEvent>(other.jobEvents.size());
      for (JobEvent other_element : other.jobEvents) {
        __this__jobEvents.add(new JobEvent(other_element));
      }
      this.jobEvents = __this__jobEvents;
    }
    if (other.isSetBottom()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__bottom = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.bottom.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.bottom) {
        __this__bottom.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.bottom = __this__bottom;
    }
  }

  public JobSlice deepCopy() {
    return new JobSlice(this);
  }

  @Override
  public void clear() {
    this.top = null;
    this.jobEvents = null;
    this.bottom = null;
  }

  public int getTopSize() {
    return (this.top == null) ? 0 : this.top.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getTopIterator() {
    return (this.top == null) ? null : this.top.iterator();
  }

  public void addToTop(com.parsable.thrift.v1.core_event.NodeVersion elem) {
    if (this.top == null) {
      this.top = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
    }
    this.top.add(elem);
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> getTop() {
    return this.top;
  }

  public JobSlice setTop(List<com.parsable.thrift.v1.core_event.NodeVersion> top) {
    this.top = top;
    return this;
  }

  public void unsetTop() {
    this.top = null;
  }

  /** Returns true if field top is set (has been assigned a value) and false otherwise */
  public boolean isSetTop() {
    return this.top != null;
  }

  public void setTopIsSet(boolean value) {
    if (!value) {
      this.top = null;
    }
  }

  public int getJobEventsSize() {
    return (this.jobEvents == null) ? 0 : this.jobEvents.size();
  }

  public java.util.Iterator<JobEvent> getJobEventsIterator() {
    return (this.jobEvents == null) ? null : this.jobEvents.iterator();
  }

  public void addToJobEvents(JobEvent elem) {
    if (this.jobEvents == null) {
      this.jobEvents = new ArrayList<JobEvent>();
    }
    this.jobEvents.add(elem);
  }

  public List<JobEvent> getJobEvents() {
    return this.jobEvents;
  }

  public JobSlice setJobEvents(List<JobEvent> jobEvents) {
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

  public int getBottomSize() {
    return (this.bottom == null) ? 0 : this.bottom.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getBottomIterator() {
    return (this.bottom == null) ? null : this.bottom.iterator();
  }

  public void addToBottom(com.parsable.thrift.v1.core_event.NodeVersion elem) {
    if (this.bottom == null) {
      this.bottom = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
    }
    this.bottom.add(elem);
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> getBottom() {
    return this.bottom;
  }

  public JobSlice setBottom(List<com.parsable.thrift.v1.core_event.NodeVersion> bottom) {
    this.bottom = bottom;
    return this;
  }

  public void unsetBottom() {
    this.bottom = null;
  }

  /** Returns true if field bottom is set (has been assigned a value) and false otherwise */
  public boolean isSetBottom() {
    return this.bottom != null;
  }

  public void setBottomIsSet(boolean value) {
    if (!value) {
      this.bottom = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOP:
      if (value == null) {
        unsetTop();
      } else {
        setTop((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
      }
      break;

    case JOB_EVENTS:
      if (value == null) {
        unsetJobEvents();
      } else {
        setJobEvents((List<JobEvent>)value);
      }
      break;

    case BOTTOM:
      if (value == null) {
        unsetBottom();
      } else {
        setBottom((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOP:
      return getTop();

    case JOB_EVENTS:
      return getJobEvents();

    case BOTTOM:
      return getBottom();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOP:
      return isSetTop();
    case JOB_EVENTS:
      return isSetJobEvents();
    case BOTTOM:
      return isSetBottom();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobSlice)
      return this.equals((JobSlice)that);
    return false;
  }

  public boolean equals(JobSlice that) {
    if (that == null)
      return false;

    boolean this_present_top = true && this.isSetTop();
    boolean that_present_top = true && that.isSetTop();
    if (this_present_top || that_present_top) {
      if (!(this_present_top && that_present_top))
        return false;
      if (!this.top.equals(that.top))
        return false;
    }

    boolean this_present_jobEvents = true && this.isSetJobEvents();
    boolean that_present_jobEvents = true && that.isSetJobEvents();
    if (this_present_jobEvents || that_present_jobEvents) {
      if (!(this_present_jobEvents && that_present_jobEvents))
        return false;
      if (!this.jobEvents.equals(that.jobEvents))
        return false;
    }

    boolean this_present_bottom = true && this.isSetBottom();
    boolean that_present_bottom = true && that.isSetBottom();
    if (this_present_bottom || that_present_bottom) {
      if (!(this_present_bottom && that_present_bottom))
        return false;
      if (!this.bottom.equals(that.bottom))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_top = true && (isSetTop());
    list.add(present_top);
    if (present_top)
      list.add(top);

    boolean present_jobEvents = true && (isSetJobEvents());
    list.add(present_jobEvents);
    if (present_jobEvents)
      list.add(jobEvents);

    boolean present_bottom = true && (isSetBottom());
    list.add(present_bottom);
    if (present_bottom)
      list.add(bottom);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobSlice other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTop()).compareTo(other.isSetTop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.top, other.top);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetBottom()).compareTo(other.isSetBottom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBottom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bottom, other.bottom);
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
    StringBuilder sb = new StringBuilder("JobSlice(");
    boolean first = true;

    sb.append("top:");
    if (this.top == null) {
      sb.append("null");
    } else {
      sb.append(this.top);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobEvents:");
    if (this.jobEvents == null) {
      sb.append("null");
    } else {
      sb.append(this.jobEvents);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bottom:");
    if (this.bottom == null) {
      sb.append("null");
    } else {
      sb.append(this.bottom);
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

  private static class JobSliceStandardSchemeFactory implements SchemeFactory {
    public JobSliceStandardScheme getScheme() {
      return new JobSliceStandardScheme();
    }
  }

  private static class JobSliceStandardScheme extends StandardScheme<JobSlice> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobSlice struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOP
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list82 = iprot.readListBegin();
                struct.top = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list82.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem83;
                for (int _i84 = 0; _i84 < _list82.size; ++_i84)
                {
                  _elem83 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem83.read(iprot);
                  struct.top.add(_elem83);
                }
                iprot.readListEnd();
              }
              struct.setTopIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list85 = iprot.readListBegin();
                struct.jobEvents = new ArrayList<JobEvent>(_list85.size);
                JobEvent _elem86;
                for (int _i87 = 0; _i87 < _list85.size; ++_i87)
                {
                  _elem86 = new JobEvent();
                  _elem86.read(iprot);
                  struct.jobEvents.add(_elem86);
                }
                iprot.readListEnd();
              }
              struct.setJobEventsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BOTTOM
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list88 = iprot.readListBegin();
                struct.bottom = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list88.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem89;
                for (int _i90 = 0; _i90 < _list88.size; ++_i90)
                {
                  _elem89 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem89.read(iprot);
                  struct.bottom.add(_elem89);
                }
                iprot.readListEnd();
              }
              struct.setBottomIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobSlice struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.top != null) {
        oprot.writeFieldBegin(TOP_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.top.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter91 : struct.top)
          {
            _iter91.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.jobEvents != null) {
        oprot.writeFieldBegin(JOB_EVENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.jobEvents.size()));
          for (JobEvent _iter92 : struct.jobEvents)
          {
            _iter92.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.bottom != null) {
        oprot.writeFieldBegin(BOTTOM_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.bottom.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter93 : struct.bottom)
          {
            _iter93.write(oprot);
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
