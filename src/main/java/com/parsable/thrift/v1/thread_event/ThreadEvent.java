/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.thread_event;

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
public class ThreadEvent implements org.apache.thrift.TBase<ThreadEvent, ThreadEvent._Fields>, java.io.Serializable, Cloneable, Comparable<ThreadEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThreadEvent");

  private static final org.apache.thrift.protocol.TField THREAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("threadId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PEDIGREE_FIELD_DESC = new org.apache.thrift.protocol.TField("pedigree", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField RECEIVED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("receivedAt", org.apache.thrift.protocol.TType.I64, (short)20);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThreadEventStandardSchemeFactory());
  }

  public String threadId; // required
  public com.parsable.thrift.v1.core_event.Pedigree pedigree; // required
  public ThreadOp op; // required
  public long receivedAt; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_ID((short)1, "threadId"),
    PEDIGREE((short)2, "pedigree"),
    OP((short)3, "op"),
    RECEIVED_AT((short)20, "receivedAt");

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
        case 2: // PEDIGREE
          return PEDIGREE;
        case 3: // OP
          return OP;
        case 20: // RECEIVED_AT
          return RECEIVED_AT;
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
  private static final int __RECEIVEDAT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RECEIVED_AT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THREAD_ID, new org.apache.thrift.meta_data.FieldMetaData("threadId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.PEDIGREE, new org.apache.thrift.meta_data.FieldMetaData("pedigree", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.Pedigree.class)));
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThreadOp.class)));
    tmpMap.put(_Fields.RECEIVED_AT, new org.apache.thrift.meta_data.FieldMetaData("receivedAt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TimeInSecs")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThreadEvent.class, metaDataMap);
  }

  public ThreadEvent() {
  }

  public ThreadEvent(
    String threadId,
    com.parsable.thrift.v1.core_event.Pedigree pedigree,
    ThreadOp op)
  {
    this();
    this.threadId = threadId;
    this.pedigree = pedigree;
    this.op = op;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThreadEvent(ThreadEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetThreadId()) {
      this.threadId = other.threadId;
    }
    if (other.isSetPedigree()) {
      this.pedigree = new com.parsable.thrift.v1.core_event.Pedigree(other.pedigree);
    }
    if (other.isSetOp()) {
      this.op = new ThreadOp(other.op);
    }
    this.receivedAt = other.receivedAt;
  }

  public ThreadEvent deepCopy() {
    return new ThreadEvent(this);
  }

  @Override
  public void clear() {
    this.threadId = null;
    this.pedigree = null;
    this.op = null;
    setReceivedAtIsSet(false);
    this.receivedAt = 0;
  }

  public String getThreadId() {
    return this.threadId;
  }

  public ThreadEvent setThreadId(String threadId) {
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

  public com.parsable.thrift.v1.core_event.Pedigree getPedigree() {
    return this.pedigree;
  }

  public ThreadEvent setPedigree(com.parsable.thrift.v1.core_event.Pedigree pedigree) {
    this.pedigree = pedigree;
    return this;
  }

  public void unsetPedigree() {
    this.pedigree = null;
  }

  /** Returns true if field pedigree is set (has been assigned a value) and false otherwise */
  public boolean isSetPedigree() {
    return this.pedigree != null;
  }

  public void setPedigreeIsSet(boolean value) {
    if (!value) {
      this.pedigree = null;
    }
  }

  public ThreadOp getOp() {
    return this.op;
  }

  public ThreadEvent setOp(ThreadOp op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  /** Returns true if field op is set (has been assigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }

  public long getReceivedAt() {
    return this.receivedAt;
  }

  public ThreadEvent setReceivedAt(long receivedAt) {
    this.receivedAt = receivedAt;
    setReceivedAtIsSet(true);
    return this;
  }

  public void unsetReceivedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECEIVEDAT_ISSET_ID);
  }

  /** Returns true if field receivedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetReceivedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __RECEIVEDAT_ISSET_ID);
  }

  public void setReceivedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECEIVEDAT_ISSET_ID, value);
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

    case PEDIGREE:
      if (value == null) {
        unsetPedigree();
      } else {
        setPedigree((com.parsable.thrift.v1.core_event.Pedigree)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((ThreadOp)value);
      }
      break;

    case RECEIVED_AT:
      if (value == null) {
        unsetReceivedAt();
      } else {
        setReceivedAt((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case THREAD_ID:
      return getThreadId();

    case PEDIGREE:
      return getPedigree();

    case OP:
      return getOp();

    case RECEIVED_AT:
      return getReceivedAt();

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
    case PEDIGREE:
      return isSetPedigree();
    case OP:
      return isSetOp();
    case RECEIVED_AT:
      return isSetReceivedAt();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThreadEvent)
      return this.equals((ThreadEvent)that);
    return false;
  }

  public boolean equals(ThreadEvent that) {
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

    boolean this_present_pedigree = true && this.isSetPedigree();
    boolean that_present_pedigree = true && that.isSetPedigree();
    if (this_present_pedigree || that_present_pedigree) {
      if (!(this_present_pedigree && that_present_pedigree))
        return false;
      if (!this.pedigree.equals(that.pedigree))
        return false;
    }

    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }

    boolean this_present_receivedAt = true && this.isSetReceivedAt();
    boolean that_present_receivedAt = true && that.isSetReceivedAt();
    if (this_present_receivedAt || that_present_receivedAt) {
      if (!(this_present_receivedAt && that_present_receivedAt))
        return false;
      if (this.receivedAt != that.receivedAt)
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

    boolean present_pedigree = true && (isSetPedigree());
    list.add(present_pedigree);
    if (present_pedigree)
      list.add(pedigree);

    boolean present_op = true && (isSetOp());
    list.add(present_op);
    if (present_op)
      list.add(op);

    boolean present_receivedAt = true && (isSetReceivedAt());
    list.add(present_receivedAt);
    if (present_receivedAt)
      list.add(receivedAt);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThreadEvent other) {
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
    lastComparison = Boolean.valueOf(isSetPedigree()).compareTo(other.isSetPedigree());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPedigree()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pedigree, other.pedigree);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op, other.op);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceivedAt()).compareTo(other.isSetReceivedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceivedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receivedAt, other.receivedAt);
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
    StringBuilder sb = new StringBuilder("ThreadEvent(");
    boolean first = true;

    sb.append("threadId:");
    if (this.threadId == null) {
      sb.append("null");
    } else {
      sb.append(this.threadId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pedigree:");
    if (this.pedigree == null) {
      sb.append("null");
    } else {
      sb.append(this.pedigree);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("op:");
    if (this.op == null) {
      sb.append("null");
    } else {
      sb.append(this.op);
    }
    first = false;
    if (isSetReceivedAt()) {
      if (!first) sb.append(", ");
      sb.append("receivedAt:");
      sb.append(this.receivedAt);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (threadId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'threadId' was not present! Struct: " + toString());
    }
    if (pedigree == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pedigree' was not present! Struct: " + toString());
    }
    if (op == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'op' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (pedigree != null) {
      pedigree.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThreadEventStandardSchemeFactory implements SchemeFactory {
    public ThreadEventStandardScheme getScheme() {
      return new ThreadEventStandardScheme();
    }
  }

  private static class ThreadEventStandardScheme extends StandardScheme<ThreadEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThreadEvent struct) throws org.apache.thrift.TException {
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
          case 2: // PEDIGREE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.pedigree = new com.parsable.thrift.v1.core_event.Pedigree();
              struct.pedigree.read(iprot);
              struct.setPedigreeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.op = new ThreadOp();
              struct.op.read(iprot);
              struct.setOpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // RECEIVED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.receivedAt = iprot.readI64();
              struct.setReceivedAtIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThreadEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.threadId != null) {
        oprot.writeFieldBegin(THREAD_ID_FIELD_DESC);
        oprot.writeString(struct.threadId);
        oprot.writeFieldEnd();
      }
      if (struct.pedigree != null) {
        oprot.writeFieldBegin(PEDIGREE_FIELD_DESC);
        struct.pedigree.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.op != null) {
        oprot.writeFieldBegin(OP_FIELD_DESC);
        struct.op.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReceivedAt()) {
        oprot.writeFieldBegin(RECEIVED_AT_FIELD_DESC);
        oprot.writeI64(struct.receivedAt);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

