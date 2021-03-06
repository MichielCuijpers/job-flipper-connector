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
public class RejectEventOp implements org.apache.thrift.TBase<RejectEventOp, RejectEventOp._Fields>, java.io.Serializable, Cloneable, Comparable<RejectEventOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RejectEventOp");

  private static final org.apache.thrift.protocol.TField REJECTED_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("rejectedEvents", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RejectEventOpStandardSchemeFactory());
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> rejectedEvents; // required
  public com.wi.director.thrift.v1.common.SystemException error; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REJECTED_EVENTS((short)1, "rejectedEvents"),
    ERROR((short)2, "error");

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
        case 1: // REJECTED_EVENTS
          return REJECTED_EVENTS;
        case 2: // ERROR
          return ERROR;
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
  private static final _Fields optionals[] = {_Fields.ERROR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REJECTED_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("rejectedEvents", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RejectEventOp.class, metaDataMap);
  }

  public RejectEventOp() {
  }

  public RejectEventOp(
    List<com.parsable.thrift.v1.core_event.NodeVersion> rejectedEvents)
  {
    this();
    this.rejectedEvents = rejectedEvents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RejectEventOp(RejectEventOp other) {
    if (other.isSetRejectedEvents()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__rejectedEvents = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.rejectedEvents.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.rejectedEvents) {
        __this__rejectedEvents.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.rejectedEvents = __this__rejectedEvents;
    }
    if (other.isSetError()) {
      this.error = new com.wi.director.thrift.v1.common.SystemException(other.error);
    }
  }

  public RejectEventOp deepCopy() {
    return new RejectEventOp(this);
  }

  @Override
  public void clear() {
    this.rejectedEvents = null;
    this.error = null;
  }

  public int getRejectedEventsSize() {
    return (this.rejectedEvents == null) ? 0 : this.rejectedEvents.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getRejectedEventsIterator() {
    return (this.rejectedEvents == null) ? null : this.rejectedEvents.iterator();
  }

  public void addToRejectedEvents(com.parsable.thrift.v1.core_event.NodeVersion elem) {
    if (this.rejectedEvents == null) {
      this.rejectedEvents = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
    }
    this.rejectedEvents.add(elem);
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> getRejectedEvents() {
    return this.rejectedEvents;
  }

  public RejectEventOp setRejectedEvents(List<com.parsable.thrift.v1.core_event.NodeVersion> rejectedEvents) {
    this.rejectedEvents = rejectedEvents;
    return this;
  }

  public void unsetRejectedEvents() {
    this.rejectedEvents = null;
  }

  /** Returns true if field rejectedEvents is set (has been assigned a value) and false otherwise */
  public boolean isSetRejectedEvents() {
    return this.rejectedEvents != null;
  }

  public void setRejectedEventsIsSet(boolean value) {
    if (!value) {
      this.rejectedEvents = null;
    }
  }

  public com.wi.director.thrift.v1.common.SystemException getError() {
    return this.error;
  }

  public RejectEventOp setError(com.wi.director.thrift.v1.common.SystemException error) {
    this.error = error;
    return this;
  }

  public void unsetError() {
    this.error = null;
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return this.error != null;
  }

  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REJECTED_EVENTS:
      if (value == null) {
        unsetRejectedEvents();
      } else {
        setRejectedEvents((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
      }
      break;

    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((com.wi.director.thrift.v1.common.SystemException)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REJECTED_EVENTS:
      return getRejectedEvents();

    case ERROR:
      return getError();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REJECTED_EVENTS:
      return isSetRejectedEvents();
    case ERROR:
      return isSetError();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RejectEventOp)
      return this.equals((RejectEventOp)that);
    return false;
  }

  public boolean equals(RejectEventOp that) {
    if (that == null)
      return false;

    boolean this_present_rejectedEvents = true && this.isSetRejectedEvents();
    boolean that_present_rejectedEvents = true && that.isSetRejectedEvents();
    if (this_present_rejectedEvents || that_present_rejectedEvents) {
      if (!(this_present_rejectedEvents && that_present_rejectedEvents))
        return false;
      if (!this.rejectedEvents.equals(that.rejectedEvents))
        return false;
    }

    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_rejectedEvents = true && (isSetRejectedEvents());
    list.add(present_rejectedEvents);
    if (present_rejectedEvents)
      list.add(rejectedEvents);

    boolean present_error = true && (isSetError());
    list.add(present_error);
    if (present_error)
      list.add(error);

    return list.hashCode();
  }

  @Override
  public int compareTo(RejectEventOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRejectedEvents()).compareTo(other.isSetRejectedEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRejectedEvents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rejectedEvents, other.rejectedEvents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError()).compareTo(other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
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
    StringBuilder sb = new StringBuilder("RejectEventOp(");
    boolean first = true;

    sb.append("rejectedEvents:");
    if (this.rejectedEvents == null) {
      sb.append("null");
    } else {
      sb.append(this.rejectedEvents);
    }
    first = false;
    if (isSetError()) {
      if (!first) sb.append(", ");
      sb.append("error:");
      if (this.error == null) {
        sb.append("null");
      } else {
        sb.append(this.error);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (rejectedEvents == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rejectedEvents' was not present! Struct: " + toString());
    }
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

  private static class RejectEventOpStandardSchemeFactory implements SchemeFactory {
    public RejectEventOpStandardScheme getScheme() {
      return new RejectEventOpStandardScheme();
    }
  }

  private static class RejectEventOpStandardScheme extends StandardScheme<RejectEventOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RejectEventOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REJECTED_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
                struct.rejectedEvents = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list4.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem5;
                for (int _i6 = 0; _i6 < _list4.size; ++_i6)
                {
                  _elem5 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem5.read(iprot);
                  struct.rejectedEvents.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.setRejectedEventsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.error = new com.wi.director.thrift.v1.common.SystemException();
              struct.error.read(iprot);
              struct.setErrorIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RejectEventOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rejectedEvents != null) {
        oprot.writeFieldBegin(REJECTED_EVENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.rejectedEvents.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter7 : struct.rejectedEvents)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.error != null) {
        if (struct.isSetError()) {
          oprot.writeFieldBegin(ERROR_FIELD_DESC);
          struct.error.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

