/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.notification_event;

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
public class NotificationEvent implements org.apache.thrift.TBase<NotificationEvent, NotificationEvent._Fields>, java.io.Serializable, Cloneable, Comparable<NotificationEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NotificationEvent");

  private static final org.apache.thrift.protocol.TField PEDIGREE_FIELD_DESC = new org.apache.thrift.protocol.TField("pedigree", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PRIORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("priority", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NotificationEventStandardSchemeFactory());
  }

  public com.parsable.thrift.v1.core_event.Pedigree pedigree; // required
  /**
   * 
   * @see NotificationPriority
   */
  public NotificationPriority priority; // required
  public NotificationOp op; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PEDIGREE((short)1, "pedigree"),
    /**
     * 
     * @see NotificationPriority
     */
    PRIORITY((short)2, "priority"),
    OP((short)3, "op");

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
        case 1: // PEDIGREE
          return PEDIGREE;
        case 2: // PRIORITY
          return PRIORITY;
        case 3: // OP
          return OP;
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
    tmpMap.put(_Fields.PEDIGREE, new org.apache.thrift.meta_data.FieldMetaData("pedigree", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.Pedigree.class)));
    tmpMap.put(_Fields.PRIORITY, new org.apache.thrift.meta_data.FieldMetaData("priority", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, NotificationPriority.class)));
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NotificationOp.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NotificationEvent.class, metaDataMap);
  }

  public NotificationEvent() {
  }

  public NotificationEvent(
    com.parsable.thrift.v1.core_event.Pedigree pedigree,
    NotificationPriority priority,
    NotificationOp op)
  {
    this();
    this.pedigree = pedigree;
    this.priority = priority;
    this.op = op;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotificationEvent(NotificationEvent other) {
    if (other.isSetPedigree()) {
      this.pedigree = new com.parsable.thrift.v1.core_event.Pedigree(other.pedigree);
    }
    if (other.isSetPriority()) {
      this.priority = other.priority;
    }
    if (other.isSetOp()) {
      this.op = new NotificationOp(other.op);
    }
  }

  public NotificationEvent deepCopy() {
    return new NotificationEvent(this);
  }

  @Override
  public void clear() {
    this.pedigree = null;
    this.priority = null;
    this.op = null;
  }

  public com.parsable.thrift.v1.core_event.Pedigree getPedigree() {
    return this.pedigree;
  }

  public NotificationEvent setPedigree(com.parsable.thrift.v1.core_event.Pedigree pedigree) {
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

  /**
   * 
   * @see NotificationPriority
   */
  public NotificationPriority getPriority() {
    return this.priority;
  }

  /**
   * 
   * @see NotificationPriority
   */
  public NotificationEvent setPriority(NotificationPriority priority) {
    this.priority = priority;
    return this;
  }

  public void unsetPriority() {
    this.priority = null;
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return this.priority != null;
  }

  public void setPriorityIsSet(boolean value) {
    if (!value) {
      this.priority = null;
    }
  }

  public NotificationOp getOp() {
    return this.op;
  }

  public NotificationEvent setOp(NotificationOp op) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PEDIGREE:
      if (value == null) {
        unsetPedigree();
      } else {
        setPedigree((com.parsable.thrift.v1.core_event.Pedigree)value);
      }
      break;

    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((NotificationPriority)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((NotificationOp)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PEDIGREE:
      return getPedigree();

    case PRIORITY:
      return getPriority();

    case OP:
      return getOp();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PEDIGREE:
      return isSetPedigree();
    case PRIORITY:
      return isSetPriority();
    case OP:
      return isSetOp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NotificationEvent)
      return this.equals((NotificationEvent)that);
    return false;
  }

  public boolean equals(NotificationEvent that) {
    if (that == null)
      return false;

    boolean this_present_pedigree = true && this.isSetPedigree();
    boolean that_present_pedigree = true && that.isSetPedigree();
    if (this_present_pedigree || that_present_pedigree) {
      if (!(this_present_pedigree && that_present_pedigree))
        return false;
      if (!this.pedigree.equals(that.pedigree))
        return false;
    }

    boolean this_present_priority = true && this.isSetPriority();
    boolean that_present_priority = true && that.isSetPriority();
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (!this.priority.equals(that.priority))
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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pedigree = true && (isSetPedigree());
    list.add(present_pedigree);
    if (present_pedigree)
      list.add(pedigree);

    boolean present_priority = true && (isSetPriority());
    list.add(present_priority);
    if (present_priority)
      list.add(priority.getValue());

    boolean present_op = true && (isSetOp());
    list.add(present_op);
    if (present_op)
      list.add(op);

    return list.hashCode();
  }

  @Override
  public int compareTo(NotificationEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetPriority()).compareTo(other.isSetPriority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priority, other.priority);
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
    StringBuilder sb = new StringBuilder("NotificationEvent(");
    boolean first = true;

    sb.append("pedigree:");
    if (this.pedigree == null) {
      sb.append("null");
    } else {
      sb.append(this.pedigree);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("priority:");
    if (this.priority == null) {
      sb.append("null");
    } else {
      sb.append(this.priority);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (pedigree == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pedigree' was not present! Struct: " + toString());
    }
    if (priority == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'priority' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NotificationEventStandardSchemeFactory implements SchemeFactory {
    public NotificationEventStandardScheme getScheme() {
      return new NotificationEventStandardScheme();
    }
  }

  private static class NotificationEventStandardScheme extends StandardScheme<NotificationEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NotificationEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PEDIGREE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.pedigree = new com.parsable.thrift.v1.core_event.Pedigree();
              struct.pedigree.read(iprot);
              struct.setPedigreeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRIORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priority = com.parsable.thrift.v1.notification_event.NotificationPriority.findByValue(iprot.readI32());
              struct.setPriorityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.op = new NotificationOp();
              struct.op.read(iprot);
              struct.setOpIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NotificationEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pedigree != null) {
        oprot.writeFieldBegin(PEDIGREE_FIELD_DESC);
        struct.pedigree.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.priority != null) {
        oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
        oprot.writeI32(struct.priority.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.op != null) {
        oprot.writeFieldBegin(OP_FIELD_DESC);
        struct.op.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

