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
public class GetRequest implements org.apache.thrift.TBase<GetRequest, GetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetRequest");

  private static final org.apache.thrift.protocol.TField CURRENT_FIELD_DESC = new org.apache.thrift.protocol.TField("current", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ALREADY_SENT_DEVICES_FIELD_DESC = new org.apache.thrift.protocol.TField("alreadySentDevices", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField JOB_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("jobEvents", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField UNSUBSCRIBE_FIELD_DESC = new org.apache.thrift.protocol.TField("unsubscribe", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetRequestStandardSchemeFactory());
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> current; // required
  public Set<String> alreadySentDevices; // required
  public List<com.parsable.thrift.v1.job_event.JobEvent> jobEvents; // optional
  public boolean unsubscribe; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CURRENT((short)1, "current"),
    ALREADY_SENT_DEVICES((short)2, "alreadySentDevices"),
    JOB_EVENTS((short)3, "jobEvents"),
    UNSUBSCRIBE((short)4, "unsubscribe");

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
        case 1: // CURRENT
          return CURRENT;
        case 2: // ALREADY_SENT_DEVICES
          return ALREADY_SENT_DEVICES;
        case 3: // JOB_EVENTS
          return JOB_EVENTS;
        case 4: // UNSUBSCRIBE
          return UNSUBSCRIBE;
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
  private static final int __UNSUBSCRIBE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.JOB_EVENTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CURRENT, new org.apache.thrift.meta_data.FieldMetaData("current", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
    tmpMap.put(_Fields.ALREADY_SENT_DEVICES, new org.apache.thrift.meta_data.FieldMetaData("alreadySentDevices", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.JOB_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("jobEvents", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.job_event.JobEvent.class))));
    tmpMap.put(_Fields.UNSUBSCRIBE, new org.apache.thrift.meta_data.FieldMetaData("unsubscribe", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetRequest.class, metaDataMap);
  }

  public GetRequest() {
  }

  public GetRequest(
    List<com.parsable.thrift.v1.core_event.NodeVersion> current,
    Set<String> alreadySentDevices,
    boolean unsubscribe)
  {
    this();
    this.current = current;
    this.alreadySentDevices = alreadySentDevices;
    this.unsubscribe = unsubscribe;
    setUnsubscribeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetRequest(GetRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCurrent()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__current = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.current.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.current) {
        __this__current.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.current = __this__current;
    }
    if (other.isSetAlreadySentDevices()) {
      Set<String> __this__alreadySentDevices = new HashSet<String>(other.alreadySentDevices);
      this.alreadySentDevices = __this__alreadySentDevices;
    }
    if (other.isSetJobEvents()) {
      List<com.parsable.thrift.v1.job_event.JobEvent> __this__jobEvents = new ArrayList<com.parsable.thrift.v1.job_event.JobEvent>(other.jobEvents.size());
      for (com.parsable.thrift.v1.job_event.JobEvent other_element : other.jobEvents) {
        __this__jobEvents.add(new com.parsable.thrift.v1.job_event.JobEvent(other_element));
      }
      this.jobEvents = __this__jobEvents;
    }
    this.unsubscribe = other.unsubscribe;
  }

  public GetRequest deepCopy() {
    return new GetRequest(this);
  }

  @Override
  public void clear() {
    this.current = null;
    this.alreadySentDevices = null;
    this.jobEvents = null;
    setUnsubscribeIsSet(false);
    this.unsubscribe = false;
  }

  public int getCurrentSize() {
    return (this.current == null) ? 0 : this.current.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getCurrentIterator() {
    return (this.current == null) ? null : this.current.iterator();
  }

  public void addToCurrent(com.parsable.thrift.v1.core_event.NodeVersion elem) {
    if (this.current == null) {
      this.current = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
    }
    this.current.add(elem);
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> getCurrent() {
    return this.current;
  }

  public GetRequest setCurrent(List<com.parsable.thrift.v1.core_event.NodeVersion> current) {
    this.current = current;
    return this;
  }

  public void unsetCurrent() {
    this.current = null;
  }

  /** Returns true if field current is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrent() {
    return this.current != null;
  }

  public void setCurrentIsSet(boolean value) {
    if (!value) {
      this.current = null;
    }
  }

  public int getAlreadySentDevicesSize() {
    return (this.alreadySentDevices == null) ? 0 : this.alreadySentDevices.size();
  }

  public java.util.Iterator<String> getAlreadySentDevicesIterator() {
    return (this.alreadySentDevices == null) ? null : this.alreadySentDevices.iterator();
  }

  public void addToAlreadySentDevices(String elem) {
    if (this.alreadySentDevices == null) {
      this.alreadySentDevices = new HashSet<String>();
    }
    this.alreadySentDevices.add(elem);
  }

  public Set<String> getAlreadySentDevices() {
    return this.alreadySentDevices;
  }

  public GetRequest setAlreadySentDevices(Set<String> alreadySentDevices) {
    this.alreadySentDevices = alreadySentDevices;
    return this;
  }

  public void unsetAlreadySentDevices() {
    this.alreadySentDevices = null;
  }

  /** Returns true if field alreadySentDevices is set (has been assigned a value) and false otherwise */
  public boolean isSetAlreadySentDevices() {
    return this.alreadySentDevices != null;
  }

  public void setAlreadySentDevicesIsSet(boolean value) {
    if (!value) {
      this.alreadySentDevices = null;
    }
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

  public GetRequest setJobEvents(List<com.parsable.thrift.v1.job_event.JobEvent> jobEvents) {
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

  public boolean isUnsubscribe() {
    return this.unsubscribe;
  }

  public GetRequest setUnsubscribe(boolean unsubscribe) {
    this.unsubscribe = unsubscribe;
    setUnsubscribeIsSet(true);
    return this;
  }

  public void unsetUnsubscribe() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNSUBSCRIBE_ISSET_ID);
  }

  /** Returns true if field unsubscribe is set (has been assigned a value) and false otherwise */
  public boolean isSetUnsubscribe() {
    return EncodingUtils.testBit(__isset_bitfield, __UNSUBSCRIBE_ISSET_ID);
  }

  public void setUnsubscribeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNSUBSCRIBE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CURRENT:
      if (value == null) {
        unsetCurrent();
      } else {
        setCurrent((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
      }
      break;

    case ALREADY_SENT_DEVICES:
      if (value == null) {
        unsetAlreadySentDevices();
      } else {
        setAlreadySentDevices((Set<String>)value);
      }
      break;

    case JOB_EVENTS:
      if (value == null) {
        unsetJobEvents();
      } else {
        setJobEvents((List<com.parsable.thrift.v1.job_event.JobEvent>)value);
      }
      break;

    case UNSUBSCRIBE:
      if (value == null) {
        unsetUnsubscribe();
      } else {
        setUnsubscribe((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CURRENT:
      return getCurrent();

    case ALREADY_SENT_DEVICES:
      return getAlreadySentDevices();

    case JOB_EVENTS:
      return getJobEvents();

    case UNSUBSCRIBE:
      return isUnsubscribe();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CURRENT:
      return isSetCurrent();
    case ALREADY_SENT_DEVICES:
      return isSetAlreadySentDevices();
    case JOB_EVENTS:
      return isSetJobEvents();
    case UNSUBSCRIBE:
      return isSetUnsubscribe();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetRequest)
      return this.equals((GetRequest)that);
    return false;
  }

  public boolean equals(GetRequest that) {
    if (that == null)
      return false;

    boolean this_present_current = true && this.isSetCurrent();
    boolean that_present_current = true && that.isSetCurrent();
    if (this_present_current || that_present_current) {
      if (!(this_present_current && that_present_current))
        return false;
      if (!this.current.equals(that.current))
        return false;
    }

    boolean this_present_alreadySentDevices = true && this.isSetAlreadySentDevices();
    boolean that_present_alreadySentDevices = true && that.isSetAlreadySentDevices();
    if (this_present_alreadySentDevices || that_present_alreadySentDevices) {
      if (!(this_present_alreadySentDevices && that_present_alreadySentDevices))
        return false;
      if (!this.alreadySentDevices.equals(that.alreadySentDevices))
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

    boolean this_present_unsubscribe = true;
    boolean that_present_unsubscribe = true;
    if (this_present_unsubscribe || that_present_unsubscribe) {
      if (!(this_present_unsubscribe && that_present_unsubscribe))
        return false;
      if (this.unsubscribe != that.unsubscribe)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_current = true && (isSetCurrent());
    list.add(present_current);
    if (present_current)
      list.add(current);

    boolean present_alreadySentDevices = true && (isSetAlreadySentDevices());
    list.add(present_alreadySentDevices);
    if (present_alreadySentDevices)
      list.add(alreadySentDevices);

    boolean present_jobEvents = true && (isSetJobEvents());
    list.add(present_jobEvents);
    if (present_jobEvents)
      list.add(jobEvents);

    boolean present_unsubscribe = true;
    list.add(present_unsubscribe);
    if (present_unsubscribe)
      list.add(unsubscribe);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCurrent()).compareTo(other.isSetCurrent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current, other.current);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlreadySentDevices()).compareTo(other.isSetAlreadySentDevices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlreadySentDevices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alreadySentDevices, other.alreadySentDevices);
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
    lastComparison = Boolean.valueOf(isSetUnsubscribe()).compareTo(other.isSetUnsubscribe());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnsubscribe()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unsubscribe, other.unsubscribe);
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
    StringBuilder sb = new StringBuilder("GetRequest(");
    boolean first = true;

    sb.append("current:");
    if (this.current == null) {
      sb.append("null");
    } else {
      sb.append(this.current);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("alreadySentDevices:");
    if (this.alreadySentDevices == null) {
      sb.append("null");
    } else {
      sb.append(this.alreadySentDevices);
    }
    first = false;
    if (isSetJobEvents()) {
      if (!first) sb.append(", ");
      sb.append("jobEvents:");
      if (this.jobEvents == null) {
        sb.append("null");
      } else {
        sb.append(this.jobEvents);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("unsubscribe:");
    sb.append(this.unsubscribe);
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

  private static class GetRequestStandardSchemeFactory implements SchemeFactory {
    public GetRequestStandardScheme getScheme() {
      return new GetRequestStandardScheme();
    }
  }

  private static class GetRequestStandardScheme extends StandardScheme<GetRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CURRENT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.current = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list0.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem1.read(iprot);
                  struct.current.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setCurrentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALREADY_SENT_DEVICES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set3 = iprot.readSetBegin();
                struct.alreadySentDevices = new HashSet<String>(2*_set3.size);
                String _elem4;
                for (int _i5 = 0; _i5 < _set3.size; ++_i5)
                {
                  _elem4 = iprot.readString();
                  struct.alreadySentDevices.add(_elem4);
                }
                iprot.readSetEnd();
              }
              struct.setAlreadySentDevicesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JOB_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                struct.jobEvents = new ArrayList<com.parsable.thrift.v1.job_event.JobEvent>(_list6.size);
                com.parsable.thrift.v1.job_event.JobEvent _elem7;
                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                {
                  _elem7 = new com.parsable.thrift.v1.job_event.JobEvent();
                  _elem7.read(iprot);
                  struct.jobEvents.add(_elem7);
                }
                iprot.readListEnd();
              }
              struct.setJobEventsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UNSUBSCRIBE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.unsubscribe = iprot.readBool();
              struct.setUnsubscribeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.current != null) {
        oprot.writeFieldBegin(CURRENT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.current.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter9 : struct.current)
          {
            _iter9.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.alreadySentDevices != null) {
        oprot.writeFieldBegin(ALREADY_SENT_DEVICES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.alreadySentDevices.size()));
          for (String _iter10 : struct.alreadySentDevices)
          {
            oprot.writeString(_iter10);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.jobEvents != null) {
        if (struct.isSetJobEvents()) {
          oprot.writeFieldBegin(JOB_EVENTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.jobEvents.size()));
            for (com.parsable.thrift.v1.job_event.JobEvent _iter11 : struct.jobEvents)
            {
              _iter11.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(UNSUBSCRIBE_FIELD_DESC);
      oprot.writeBool(struct.unsubscribe);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

