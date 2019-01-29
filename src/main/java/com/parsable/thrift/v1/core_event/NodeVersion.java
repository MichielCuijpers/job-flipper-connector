/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.core_event;

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
public class NodeVersion implements org.apache.thrift.TBase<NodeVersion, NodeVersion._Fields>, java.io.Serializable, Cloneable, Comparable<NodeVersion> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NodeVersion");

  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CLIENT_SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("clientSessionId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("seqId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NodeVersionStandardSchemeFactory());
  }

  public String sessionId; // required
  public String clientSessionId; // optional
  public long seqId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_ID((short)1, "sessionId"),
    CLIENT_SESSION_ID((short)2, "clientSessionId"),
    SEQ_ID((short)3, "seqId");

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
        case 1: // SESSION_ID
          return SESSION_ID;
        case 2: // CLIENT_SESSION_ID
          return CLIENT_SESSION_ID;
        case 3: // SEQ_ID
          return SEQ_ID;
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
  private static final int __SEQID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CLIENT_SESSION_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.CLIENT_SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("clientSessionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.SEQ_ID, new org.apache.thrift.meta_data.FieldMetaData("seqId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NodeVersion.class, metaDataMap);
  }

  public NodeVersion() {
  }

  public NodeVersion(
    String sessionId,
    long seqId)
  {
    this();
    this.sessionId = sessionId;
    this.seqId = seqId;
    setSeqIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NodeVersion(NodeVersion other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSessionId()) {
      this.sessionId = other.sessionId;
    }
    if (other.isSetClientSessionId()) {
      this.clientSessionId = other.clientSessionId;
    }
    this.seqId = other.seqId;
  }

  public NodeVersion deepCopy() {
    return new NodeVersion(this);
  }

  @Override
  public void clear() {
    this.sessionId = null;
    this.clientSessionId = null;
    setSeqIdIsSet(false);
    this.seqId = 0;
  }

  public String getSessionId() {
    return this.sessionId;
  }

  public NodeVersion setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public void unsetSessionId() {
    this.sessionId = null;
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return this.sessionId != null;
  }

  public void setSessionIdIsSet(boolean value) {
    if (!value) {
      this.sessionId = null;
    }
  }

  public String getClientSessionId() {
    return this.clientSessionId;
  }

  public NodeVersion setClientSessionId(String clientSessionId) {
    this.clientSessionId = clientSessionId;
    return this;
  }

  public void unsetClientSessionId() {
    this.clientSessionId = null;
  }

  /** Returns true if field clientSessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetClientSessionId() {
    return this.clientSessionId != null;
  }

  public void setClientSessionIdIsSet(boolean value) {
    if (!value) {
      this.clientSessionId = null;
    }
  }

  public long getSeqId() {
    return this.seqId;
  }

  public NodeVersion setSeqId(long seqId) {
    this.seqId = seqId;
    setSeqIdIsSet(true);
    return this;
  }

  public void unsetSeqId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQID_ISSET_ID);
  }

  /** Returns true if field seqId is set (has been assigned a value) and false otherwise */
  public boolean isSetSeqId() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQID_ISSET_ID);
  }

  public void setSeqIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((String)value);
      }
      break;

    case CLIENT_SESSION_ID:
      if (value == null) {
        unsetClientSessionId();
      } else {
        setClientSessionId((String)value);
      }
      break;

    case SEQ_ID:
      if (value == null) {
        unsetSeqId();
      } else {
        setSeqId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_ID:
      return getSessionId();

    case CLIENT_SESSION_ID:
      return getClientSessionId();

    case SEQ_ID:
      return getSeqId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SESSION_ID:
      return isSetSessionId();
    case CLIENT_SESSION_ID:
      return isSetClientSessionId();
    case SEQ_ID:
      return isSetSeqId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NodeVersion)
      return this.equals((NodeVersion)that);
    return false;
  }

  public boolean equals(NodeVersion that) {
    if (that == null)
      return false;

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (!this.sessionId.equals(that.sessionId))
        return false;
    }

    boolean this_present_clientSessionId = true && this.isSetClientSessionId();
    boolean that_present_clientSessionId = true && that.isSetClientSessionId();
    if (this_present_clientSessionId || that_present_clientSessionId) {
      if (!(this_present_clientSessionId && that_present_clientSessionId))
        return false;
      if (!this.clientSessionId.equals(that.clientSessionId))
        return false;
    }

    boolean this_present_seqId = true;
    boolean that_present_seqId = true;
    if (this_present_seqId || that_present_seqId) {
      if (!(this_present_seqId && that_present_seqId))
        return false;
      if (this.seqId != that.seqId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_sessionId = true && (isSetSessionId());
    list.add(present_sessionId);
    if (present_sessionId)
      list.add(sessionId);

    boolean present_clientSessionId = true && (isSetClientSessionId());
    list.add(present_clientSessionId);
    if (present_clientSessionId)
      list.add(clientSessionId);

    boolean present_seqId = true;
    list.add(present_seqId);
    if (present_seqId)
      list.add(seqId);

    return list.hashCode();
  }

  @Override
  public int compareTo(NodeVersion other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClientSessionId()).compareTo(other.isSetClientSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientSessionId, other.clientSessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeqId()).compareTo(other.isSetSeqId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeqId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seqId, other.seqId);
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
    StringBuilder sb = new StringBuilder("NodeVersion(");
    boolean first = true;

    sb.append("sessionId:");
    if (this.sessionId == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionId);
    }
    first = false;
    if (isSetClientSessionId()) {
      if (!first) sb.append(", ");
      sb.append("clientSessionId:");
      if (this.clientSessionId == null) {
        sb.append("null");
      } else {
        sb.append(this.clientSessionId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("seqId:");
    sb.append(this.seqId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (sessionId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'seqId' because it's a primitive and you chose the non-beans generator.
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

  private static class NodeVersionStandardSchemeFactory implements SchemeFactory {
    public NodeVersionStandardScheme getScheme() {
      return new NodeVersionStandardScheme();
    }
  }

  private static class NodeVersionStandardScheme extends StandardScheme<NodeVersion> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NodeVersion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionId = iprot.readString();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLIENT_SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clientSessionId = iprot.readString();
              struct.setClientSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.seqId = iprot.readI64();
              struct.setSeqIdIsSet(true);
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
      if (!struct.isSetSeqId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'seqId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NodeVersion struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sessionId != null) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeString(struct.sessionId);
        oprot.writeFieldEnd();
      }
      if (struct.clientSessionId != null) {
        if (struct.isSetClientSessionId()) {
          oprot.writeFieldBegin(CLIENT_SESSION_ID_FIELD_DESC);
          oprot.writeString(struct.clientSessionId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(SEQ_ID_FIELD_DESC);
      oprot.writeI64(struct.seqId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

