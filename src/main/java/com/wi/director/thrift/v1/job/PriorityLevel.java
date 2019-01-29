/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.job;

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
public class PriorityLevel implements org.apache.thrift.TBase<PriorityLevel, PriorityLevel._Fields>, java.io.Serializable, Cloneable, Comparable<PriorityLevel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PriorityLevel");

  private static final org.apache.thrift.protocol.TField PRIORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("priority", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ARCHIVED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("archivedAt", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PriorityLevelStandardSchemeFactory());
  }

  public int priority; // required
  public String title; // required
  /**
   * unique identifier for a priority level, not a uuid for now
   */
  public String id; // required
  /**
   * priorities cannot currently be archived. this is future proofing for old clients
   */
  public long archivedAt; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIORITY((short)1, "priority"),
    TITLE((short)2, "title"),
    /**
     * unique identifier for a priority level, not a uuid for now
     */
    ID((short)3, "id"),
    /**
     * priorities cannot currently be archived. this is future proofing for old clients
     */
    ARCHIVED_AT((short)4, "archivedAt");

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
        case 1: // PRIORITY
          return PRIORITY;
        case 2: // TITLE
          return TITLE;
        case 3: // ID
          return ID;
        case 4: // ARCHIVED_AT
          return ARCHIVED_AT;
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
  private static final int __PRIORITY_ISSET_ID = 0;
  private static final int __ARCHIVEDAT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIORITY, new org.apache.thrift.meta_data.FieldMetaData("priority", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARCHIVED_AT, new org.apache.thrift.meta_data.FieldMetaData("archivedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PriorityLevel.class, metaDataMap);
  }

  public PriorityLevel() {
  }

  public PriorityLevel(
    int priority,
    String title,
    String id,
    long archivedAt)
  {
    this();
    this.priority = priority;
    setPriorityIsSet(true);
    this.title = title;
    this.id = id;
    this.archivedAt = archivedAt;
    setArchivedAtIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PriorityLevel(PriorityLevel other) {
    __isset_bitfield = other.__isset_bitfield;
    this.priority = other.priority;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.archivedAt = other.archivedAt;
  }

  public PriorityLevel deepCopy() {
    return new PriorityLevel(this);
  }

  @Override
  public void clear() {
    setPriorityIsSet(false);
    this.priority = 0;
    this.title = null;
    this.id = null;
    setArchivedAtIsSet(false);
    this.archivedAt = 0;
  }

  public int getPriority() {
    return this.priority;
  }

  public PriorityLevel setPriority(int priority) {
    this.priority = priority;
    setPriorityIsSet(true);
    return this;
  }

  public void unsetPriority() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  /** Returns true if field priority is set (has been assigned a value) and false otherwise */
  public boolean isSetPriority() {
    return EncodingUtils.testBit(__isset_bitfield, __PRIORITY_ISSET_ID);
  }

  public void setPriorityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRIORITY_ISSET_ID, value);
  }

  public String getTitle() {
    return this.title;
  }

  public PriorityLevel setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  /**
   * unique identifier for a priority level, not a uuid for now
   */
  public String getId() {
    return this.id;
  }

  /**
   * unique identifier for a priority level, not a uuid for now
   */
  public PriorityLevel setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  /**
   * priorities cannot currently be archived. this is future proofing for old clients
   */
  public long getArchivedAt() {
    return this.archivedAt;
  }

  /**
   * priorities cannot currently be archived. this is future proofing for old clients
   */
  public PriorityLevel setArchivedAt(long archivedAt) {
    this.archivedAt = archivedAt;
    setArchivedAtIsSet(true);
    return this;
  }

  public void unsetArchivedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARCHIVEDAT_ISSET_ID);
  }

  /** Returns true if field archivedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetArchivedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __ARCHIVEDAT_ISSET_ID);
  }

  public void setArchivedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARCHIVEDAT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRIORITY:
      if (value == null) {
        unsetPriority();
      } else {
        setPriority((Integer)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case ARCHIVED_AT:
      if (value == null) {
        unsetArchivedAt();
      } else {
        setArchivedAt((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIORITY:
      return getPriority();

    case TITLE:
      return getTitle();

    case ID:
      return getId();

    case ARCHIVED_AT:
      return getArchivedAt();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRIORITY:
      return isSetPriority();
    case TITLE:
      return isSetTitle();
    case ID:
      return isSetId();
    case ARCHIVED_AT:
      return isSetArchivedAt();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PriorityLevel)
      return this.equals((PriorityLevel)that);
    return false;
  }

  public boolean equals(PriorityLevel that) {
    if (that == null)
      return false;

    boolean this_present_priority = true;
    boolean that_present_priority = true;
    if (this_present_priority || that_present_priority) {
      if (!(this_present_priority && that_present_priority))
        return false;
      if (this.priority != that.priority)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_archivedAt = true;
    boolean that_present_archivedAt = true;
    if (this_present_archivedAt || that_present_archivedAt) {
      if (!(this_present_archivedAt && that_present_archivedAt))
        return false;
      if (this.archivedAt != that.archivedAt)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_priority = true;
    list.add(present_priority);
    if (present_priority)
      list.add(priority);

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_archivedAt = true;
    list.add(present_archivedAt);
    if (present_archivedAt)
      list.add(archivedAt);

    return list.hashCode();
  }

  @Override
  public int compareTo(PriorityLevel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArchivedAt()).compareTo(other.isSetArchivedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArchivedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.archivedAt, other.archivedAt);
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
    StringBuilder sb = new StringBuilder("PriorityLevel(");
    boolean first = true;

    sb.append("priority:");
    sb.append(this.priority);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("archivedAt:");
    sb.append(this.archivedAt);
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

  private static class PriorityLevelStandardSchemeFactory implements SchemeFactory {
    public PriorityLevelStandardScheme getScheme() {
      return new PriorityLevelStandardScheme();
    }
  }

  private static class PriorityLevelStandardScheme extends StandardScheme<PriorityLevel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PriorityLevel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priority = iprot.readI32();
              struct.setPriorityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ARCHIVED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.archivedAt = iprot.readI64();
              struct.setArchivedAtIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PriorityLevel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PRIORITY_FIELD_DESC);
      oprot.writeI32(struct.priority);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ARCHIVED_AT_FIELD_DESC);
      oprot.writeI64(struct.archivedAt);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

