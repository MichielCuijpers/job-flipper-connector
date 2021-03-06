/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.websocket;

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
public class ThreadSubscribe implements org.apache.thrift.TBase<ThreadSubscribe, ThreadSubscribe._Fields>, java.io.Serializable, Cloneable, Comparable<ThreadSubscribe> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThreadSubscribe");

  private static final org.apache.thrift.protocol.TField THREAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("threadId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NODE_VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeVersions", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThreadSubscribeStandardSchemeFactory());
  }

  public String threadId; // required
  public List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_ID((short)1, "threadId"),
    NODE_VERSIONS((short)2, "nodeVersions");

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
        case 1: // THREAD_ID
          return THREAD_ID;
        case 2: // NODE_VERSIONS
          return NODE_VERSIONS;
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
    tmpMap.put(_Fields.THREAD_ID, new org.apache.thrift.meta_data.FieldMetaData("threadId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.NODE_VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("nodeVersions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThreadSubscribe.class, metaDataMap);
  }

  public ThreadSubscribe() {
  }

  public ThreadSubscribe(
    String threadId,
    List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions)
  {
    this();
    this.threadId = threadId;
    this.nodeVersions = nodeVersions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThreadSubscribe(ThreadSubscribe other) {
    if (other.isSetThreadId()) {
      this.threadId = other.threadId;
    }
    if (other.isSetNodeVersions()) {
      List<com.parsable.thrift.v1.core_event.NodeVersion> __this__nodeVersions = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.nodeVersions.size());
      for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.nodeVersions) {
        __this__nodeVersions.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
      }
      this.nodeVersions = __this__nodeVersions;
    }
  }

  public ThreadSubscribe deepCopy() {
    return new ThreadSubscribe(this);
  }

  @Override
  public void clear() {
    this.threadId = null;
    this.nodeVersions = null;
  }

  public String getThreadId() {
    return this.threadId;
  }

  public ThreadSubscribe setThreadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  public void unsetThreadId() {
    this.threadId = null;
  }

  /** Returns true if field threadId is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadId() {
    return this.threadId != null;
  }

  public void setThreadIdIsSet(boolean value) {
    if (!value) {
      this.threadId = null;
    }
  }

  public int getNodeVersionsSize() {
    return (this.nodeVersions == null) ? 0 : this.nodeVersions.size();
  }

  public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getNodeVersionsIterator() {
    return (this.nodeVersions == null) ? null : this.nodeVersions.iterator();
  }

  public void addToNodeVersions(com.parsable.thrift.v1.core_event.NodeVersion elem) {
    if (this.nodeVersions == null) {
      this.nodeVersions = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
    }
    this.nodeVersions.add(elem);
  }

  public List<com.parsable.thrift.v1.core_event.NodeVersion> getNodeVersions() {
    return this.nodeVersions;
  }

  public ThreadSubscribe setNodeVersions(List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions) {
    this.nodeVersions = nodeVersions;
    return this;
  }

  public void unsetNodeVersions() {
    this.nodeVersions = null;
  }

  /** Returns true if field nodeVersions is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeVersions() {
    return this.nodeVersions != null;
  }

  public void setNodeVersionsIsSet(boolean value) {
    if (!value) {
      this.nodeVersions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case THREAD_ID:
      if (value == null) {
        unsetThreadId();
      } else {
        setThreadId((String)value);
      }
      break;

    case NODE_VERSIONS:
      if (value == null) {
        unsetNodeVersions();
      } else {
        setNodeVersions((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case THREAD_ID:
      return getThreadId();

    case NODE_VERSIONS:
      return getNodeVersions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case THREAD_ID:
      return isSetThreadId();
    case NODE_VERSIONS:
      return isSetNodeVersions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThreadSubscribe)
      return this.equals((ThreadSubscribe)that);
    return false;
  }

  public boolean equals(ThreadSubscribe that) {
    if (that == null)
      return false;

    boolean this_present_threadId = true && this.isSetThreadId();
    boolean that_present_threadId = true && that.isSetThreadId();
    if (this_present_threadId || that_present_threadId) {
      if (!(this_present_threadId && that_present_threadId))
        return false;
      if (!this.threadId.equals(that.threadId))
        return false;
    }

    boolean this_present_nodeVersions = true && this.isSetNodeVersions();
    boolean that_present_nodeVersions = true && that.isSetNodeVersions();
    if (this_present_nodeVersions || that_present_nodeVersions) {
      if (!(this_present_nodeVersions && that_present_nodeVersions))
        return false;
      if (!this.nodeVersions.equals(that.nodeVersions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_threadId = true && (isSetThreadId());
    list.add(present_threadId);
    if (present_threadId)
      list.add(threadId);

    boolean present_nodeVersions = true && (isSetNodeVersions());
    list.add(present_nodeVersions);
    if (present_nodeVersions)
      list.add(nodeVersions);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThreadSubscribe other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetThreadId()).compareTo(other.isSetThreadId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadId, other.threadId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeVersions()).compareTo(other.isSetNodeVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeVersions, other.nodeVersions);
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
    StringBuilder sb = new StringBuilder("ThreadSubscribe(");
    boolean first = true;

    sb.append("threadId:");
    if (this.threadId == null) {
      sb.append("null");
    } else {
      sb.append(this.threadId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodeVersions:");
    if (this.nodeVersions == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeVersions);
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

  private static class ThreadSubscribeStandardSchemeFactory implements SchemeFactory {
    public ThreadSubscribeStandardScheme getScheme() {
      return new ThreadSubscribeStandardScheme();
    }
  }

  private static class ThreadSubscribeStandardScheme extends StandardScheme<ThreadSubscribe> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThreadSubscribe struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // THREAD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.threadId = iprot.readString();
              struct.setThreadIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NODE_VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.nodeVersions = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list0.size);
                com.parsable.thrift.v1.core_event.NodeVersion _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new com.parsable.thrift.v1.core_event.NodeVersion();
                  _elem1.read(iprot);
                  struct.nodeVersions.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setNodeVersionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThreadSubscribe struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.threadId != null) {
        oprot.writeFieldBegin(THREAD_ID_FIELD_DESC);
        oprot.writeString(struct.threadId);
        oprot.writeFieldEnd();
      }
      if (struct.nodeVersions != null) {
        oprot.writeFieldBegin(NODE_VERSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodeVersions.size()));
          for (com.parsable.thrift.v1.core_event.NodeVersion _iter3 : struct.nodeVersions)
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

