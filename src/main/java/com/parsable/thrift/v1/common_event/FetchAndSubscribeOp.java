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
/**
 * Generated by Dendrite on a client subscription.
 * 
 * Indicates a client is interested in receiving notifications
 * for this resource. Any new events will be relayed to to client
 * as well as any existing events after the provided version.
 * This event will not be saved to the events table.
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class FetchAndSubscribeOp implements org.apache.thrift.TBase<FetchAndSubscribeOp, FetchAndSubscribeOp._Fields>, java.io.Serializable, Cloneable, Comparable<FetchAndSubscribeOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FetchAndSubscribeOp");

  private static final org.apache.thrift.protocol.TField SUBSCRIBER_FIELD_DESC = new org.apache.thrift.protocol.TField("subscriber", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FetchAndSubscribeOpStandardSchemeFactory());
  }

  public com.parsable.thrift.v1.core_event.Subscriber subscriber; // required
  public List<com.parsable.thrift.v1.core_event.NodeVersion> version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUBSCRIBER((short)1, "subscriber"),
    VERSION((short)2, "version");

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
        case 1: // SUBSCRIBER
          return SUBSCRIBER;
        case 2: // VERSION
          return VERSION;
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
    tmpMap.put(_Fields.SUBSCRIBER, new org.apache.thrift.meta_data.FieldMetaData("subscriber", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.Subscriber.class)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FetchAndSubscribeOp.class, metaDataMap);
  }

  public FetchAndSubscribeOp() {
  }

  public FetchAndSubscribeOp(
    com.parsable.thrift.v1.core_event.Subscriber subscriber,
    List<com.parsable.thrift.v1.core_event.NodeVersion> version)
  {
    this();
    this.subscriber = subscriber;
    this.version = version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FetchAndSubscribeOp(FetchAndSubscribeOp other) {
    if (other.isSetSubscriber()) {
      this.subscriber = new com.parsable.thrift.v1.core_event.Subscriber(other.subscriber);
    }
    if (other.isSetVersion()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__version = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.version.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.version) {
        __this__version.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.version = __this__version;
    }
  }

  public FetchAndSubscribeOp deepCopy() {
    return new FetchAndSubscribeOp(this);
  }

  @Override
  public void clear() {
    this.subscriber = null;
    this.version = null;
  }

  public com.parsable.thrift.v1.core_event.Subscriber getSubscriber() {
    return this.subscriber;
  }

  public FetchAndSubscribeOp setSubscriber(com.parsable.thrift.v1.core_event.Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  public void unsetSubscriber() {
    this.subscriber = null;
  }

  /** Returns true if field subscriber is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriber() {
    return this.subscriber != null;
  }

  public void setSubscriberIsSet(boolean value) {
    if (!value) {
      this.subscriber = null;
    }
  }

  public int getVersionSize() {
    return (this.version == null) ? 0 : this.version.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getVersionIterator() {
    return (this.version == null) ? null : this.version.iterator();
  }

  public void addToVersion(com.parsable.thrift.v1.core_event.NodeVersion elem) {
    if (this.version == null) {
      this.version = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
    }
    this.version.add(elem);
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> getVersion() {
    return this.version;
  }

  public FetchAndSubscribeOp setVersion(List<com.parsable.thrift.v1.core_event.NodeVersion> version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUBSCRIBER:
      if (value == null) {
        unsetSubscriber();
      } else {
        setSubscriber((com.parsable.thrift.v1.core_event.Subscriber)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUBSCRIBER:
      return getSubscriber();

    case VERSION:
      return getVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUBSCRIBER:
      return isSetSubscriber();
    case VERSION:
      return isSetVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FetchAndSubscribeOp)
      return this.equals((FetchAndSubscribeOp)that);
    return false;
  }

  public boolean equals(FetchAndSubscribeOp that) {
    if (that == null)
      return false;

    boolean this_present_subscriber = true && this.isSetSubscriber();
    boolean that_present_subscriber = true && that.isSetSubscriber();
    if (this_present_subscriber || that_present_subscriber) {
      if (!(this_present_subscriber && that_present_subscriber))
        return false;
      if (!this.subscriber.equals(that.subscriber))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_subscriber = true && (isSetSubscriber());
    list.add(present_subscriber);
    if (present_subscriber)
      list.add(subscriber);

    boolean present_version = true && (isSetVersion());
    list.add(present_version);
    if (present_version)
      list.add(version);

    return list.hashCode();
  }

  @Override
  public int compareTo(FetchAndSubscribeOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSubscriber()).compareTo(other.isSetSubscriber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subscriber, other.subscriber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    StringBuilder sb = new StringBuilder("FetchAndSubscribeOp(");
    boolean first = true;

    sb.append("subscriber:");
    if (this.subscriber == null) {
      sb.append("null");
    } else {
      sb.append(this.subscriber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (subscriber == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'subscriber' was not present! Struct: " + toString());
    }
    if (version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not present! Struct: " + toString());
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

  private static class FetchAndSubscribeOpStandardSchemeFactory implements SchemeFactory {
    public FetchAndSubscribeOpStandardScheme getScheme() {
      return new FetchAndSubscribeOpStandardScheme();
    }
  }

  private static class FetchAndSubscribeOpStandardScheme extends StandardScheme<FetchAndSubscribeOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FetchAndSubscribeOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUBSCRIBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.subscriber = new com.parsable.thrift.v1.core_event.Subscriber();
              struct.subscriber.read(iprot);
              struct.setSubscriberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.version = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list0.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem1.read(iprot);
                  struct.version.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FetchAndSubscribeOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.subscriber != null) {
        oprot.writeFieldBegin(SUBSCRIBER_FIELD_DESC);
        struct.subscriber.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.version.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter3 : struct.version)
          {
            _iter3.write(oprot);
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
