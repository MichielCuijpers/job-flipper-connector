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
public class JobActivity implements org.apache.thrift.TBase<JobActivity, JobActivity._Fields>, java.io.Serializable, Cloneable, Comparable<JobActivity> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobActivity");

  private static final org.apache.thrift.protocol.TField LAST_MESSAGE_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("lastMessageAt", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LAST_MESSAGE_SEQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("lastMessageSeqId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_MESSAGE_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("lastMessageText", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LAST_EXECUTION_DATA_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("lastExecutionDataAt", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField LAST_EXECUTION_DATA_SEQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("lastExecutionDataSeqId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField LAST_MODIFIED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("lastModifiedAt", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobActivityStandardSchemeFactory());
  }

  public long lastMessageAt; // required
  public long lastMessageSeqId; // required
  public String lastMessageText; // required
  public long lastExecutionDataAt; // required
  public long lastExecutionDataSeqId; // required
  public long lastModifiedAt; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LAST_MESSAGE_AT((short)1, "lastMessageAt"),
    LAST_MESSAGE_SEQ_ID((short)2, "lastMessageSeqId"),
    LAST_MESSAGE_TEXT((short)3, "lastMessageText"),
    LAST_EXECUTION_DATA_AT((short)4, "lastExecutionDataAt"),
    LAST_EXECUTION_DATA_SEQ_ID((short)5, "lastExecutionDataSeqId"),
    LAST_MODIFIED_AT((short)6, "lastModifiedAt");

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
        case 1: // LAST_MESSAGE_AT
          return LAST_MESSAGE_AT;
        case 2: // LAST_MESSAGE_SEQ_ID
          return LAST_MESSAGE_SEQ_ID;
        case 3: // LAST_MESSAGE_TEXT
          return LAST_MESSAGE_TEXT;
        case 4: // LAST_EXECUTION_DATA_AT
          return LAST_EXECUTION_DATA_AT;
        case 5: // LAST_EXECUTION_DATA_SEQ_ID
          return LAST_EXECUTION_DATA_SEQ_ID;
        case 6: // LAST_MODIFIED_AT
          return LAST_MODIFIED_AT;
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
  private static final int __LASTMESSAGEAT_ISSET_ID = 0;
  private static final int __LASTMESSAGESEQID_ISSET_ID = 1;
  private static final int __LASTEXECUTIONDATAAT_ISSET_ID = 2;
  private static final int __LASTEXECUTIONDATASEQID_ISSET_ID = 3;
  private static final int __LASTMODIFIEDAT_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LAST_MESSAGE_AT, new org.apache.thrift.meta_data.FieldMetaData("lastMessageAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_MESSAGE_SEQ_ID, new org.apache.thrift.meta_data.FieldMetaData("lastMessageSeqId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_MESSAGE_TEXT, new org.apache.thrift.meta_data.FieldMetaData("lastMessageText", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_EXECUTION_DATA_AT, new org.apache.thrift.meta_data.FieldMetaData("lastExecutionDataAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_EXECUTION_DATA_SEQ_ID, new org.apache.thrift.meta_data.FieldMetaData("lastExecutionDataSeqId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_MODIFIED_AT, new org.apache.thrift.meta_data.FieldMetaData("lastModifiedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobActivity.class, metaDataMap);
  }

  public JobActivity() {
  }

  public JobActivity(
    long lastMessageAt,
    long lastMessageSeqId,
    String lastMessageText,
    long lastExecutionDataAt,
    long lastExecutionDataSeqId,
    long lastModifiedAt)
  {
    this();
    this.lastMessageAt = lastMessageAt;
    setLastMessageAtIsSet(true);
    this.lastMessageSeqId = lastMessageSeqId;
    setLastMessageSeqIdIsSet(true);
    this.lastMessageText = lastMessageText;
    this.lastExecutionDataAt = lastExecutionDataAt;
    setLastExecutionDataAtIsSet(true);
    this.lastExecutionDataSeqId = lastExecutionDataSeqId;
    setLastExecutionDataSeqIdIsSet(true);
    this.lastModifiedAt = lastModifiedAt;
    setLastModifiedAtIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobActivity(JobActivity other) {
    __isset_bitfield = other.__isset_bitfield;
    this.lastMessageAt = other.lastMessageAt;
    this.lastMessageSeqId = other.lastMessageSeqId;
    if (other.isSetLastMessageText()) {
      this.lastMessageText = other.lastMessageText;
    }
    this.lastExecutionDataAt = other.lastExecutionDataAt;
    this.lastExecutionDataSeqId = other.lastExecutionDataSeqId;
    this.lastModifiedAt = other.lastModifiedAt;
  }

  public JobActivity deepCopy() {
    return new JobActivity(this);
  }

  @Override
  public void clear() {
    setLastMessageAtIsSet(false);
    this.lastMessageAt = 0;
    setLastMessageSeqIdIsSet(false);
    this.lastMessageSeqId = 0;
    this.lastMessageText = null;
    setLastExecutionDataAtIsSet(false);
    this.lastExecutionDataAt = 0;
    setLastExecutionDataSeqIdIsSet(false);
    this.lastExecutionDataSeqId = 0;
    setLastModifiedAtIsSet(false);
    this.lastModifiedAt = 0;
  }

  public long getLastMessageAt() {
    return this.lastMessageAt;
  }

  public JobActivity setLastMessageAt(long lastMessageAt) {
    this.lastMessageAt = lastMessageAt;
    setLastMessageAtIsSet(true);
    return this;
  }

  public void unsetLastMessageAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTMESSAGEAT_ISSET_ID);
  }

  /** Returns true if field lastMessageAt is set (has been assigned a value) and false otherwise */
  public boolean isSetLastMessageAt() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTMESSAGEAT_ISSET_ID);
  }

  public void setLastMessageAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTMESSAGEAT_ISSET_ID, value);
  }

  public long getLastMessageSeqId() {
    return this.lastMessageSeqId;
  }

  public JobActivity setLastMessageSeqId(long lastMessageSeqId) {
    this.lastMessageSeqId = lastMessageSeqId;
    setLastMessageSeqIdIsSet(true);
    return this;
  }

  public void unsetLastMessageSeqId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTMESSAGESEQID_ISSET_ID);
  }

  /** Returns true if field lastMessageSeqId is set (has been assigned a value) and false otherwise */
  public boolean isSetLastMessageSeqId() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTMESSAGESEQID_ISSET_ID);
  }

  public void setLastMessageSeqIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTMESSAGESEQID_ISSET_ID, value);
  }

  public String getLastMessageText() {
    return this.lastMessageText;
  }

  public JobActivity setLastMessageText(String lastMessageText) {
    this.lastMessageText = lastMessageText;
    return this;
  }

  public void unsetLastMessageText() {
    this.lastMessageText = null;
  }

  /** Returns true if field lastMessageText is set (has been assigned a value) and false otherwise */
  public boolean isSetLastMessageText() {
    return this.lastMessageText != null;
  }

  public void setLastMessageTextIsSet(boolean value) {
    if (!value) {
      this.lastMessageText = null;
    }
  }

  public long getLastExecutionDataAt() {
    return this.lastExecutionDataAt;
  }

  public JobActivity setLastExecutionDataAt(long lastExecutionDataAt) {
    this.lastExecutionDataAt = lastExecutionDataAt;
    setLastExecutionDataAtIsSet(true);
    return this;
  }

  public void unsetLastExecutionDataAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTEXECUTIONDATAAT_ISSET_ID);
  }

  /** Returns true if field lastExecutionDataAt is set (has been assigned a value) and false otherwise */
  public boolean isSetLastExecutionDataAt() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTEXECUTIONDATAAT_ISSET_ID);
  }

  public void setLastExecutionDataAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTEXECUTIONDATAAT_ISSET_ID, value);
  }

  public long getLastExecutionDataSeqId() {
    return this.lastExecutionDataSeqId;
  }

  public JobActivity setLastExecutionDataSeqId(long lastExecutionDataSeqId) {
    this.lastExecutionDataSeqId = lastExecutionDataSeqId;
    setLastExecutionDataSeqIdIsSet(true);
    return this;
  }

  public void unsetLastExecutionDataSeqId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTEXECUTIONDATASEQID_ISSET_ID);
  }

  /** Returns true if field lastExecutionDataSeqId is set (has been assigned a value) and false otherwise */
  public boolean isSetLastExecutionDataSeqId() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTEXECUTIONDATASEQID_ISSET_ID);
  }

  public void setLastExecutionDataSeqIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTEXECUTIONDATASEQID_ISSET_ID, value);
  }

  public long getLastModifiedAt() {
    return this.lastModifiedAt;
  }

  public JobActivity setLastModifiedAt(long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    setLastModifiedAtIsSet(true);
    return this;
  }

  public void unsetLastModifiedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTMODIFIEDAT_ISSET_ID);
  }

  /** Returns true if field lastModifiedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModifiedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTMODIFIEDAT_ISSET_ID);
  }

  public void setLastModifiedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTMODIFIEDAT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LAST_MESSAGE_AT:
      if (value == null) {
        unsetLastMessageAt();
      } else {
        setLastMessageAt((Long)value);
      }
      break;

    case LAST_MESSAGE_SEQ_ID:
      if (value == null) {
        unsetLastMessageSeqId();
      } else {
        setLastMessageSeqId((Long)value);
      }
      break;

    case LAST_MESSAGE_TEXT:
      if (value == null) {
        unsetLastMessageText();
      } else {
        setLastMessageText((String)value);
      }
      break;

    case LAST_EXECUTION_DATA_AT:
      if (value == null) {
        unsetLastExecutionDataAt();
      } else {
        setLastExecutionDataAt((Long)value);
      }
      break;

    case LAST_EXECUTION_DATA_SEQ_ID:
      if (value == null) {
        unsetLastExecutionDataSeqId();
      } else {
        setLastExecutionDataSeqId((Long)value);
      }
      break;

    case LAST_MODIFIED_AT:
      if (value == null) {
        unsetLastModifiedAt();
      } else {
        setLastModifiedAt((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LAST_MESSAGE_AT:
      return getLastMessageAt();

    case LAST_MESSAGE_SEQ_ID:
      return getLastMessageSeqId();

    case LAST_MESSAGE_TEXT:
      return getLastMessageText();

    case LAST_EXECUTION_DATA_AT:
      return getLastExecutionDataAt();

    case LAST_EXECUTION_DATA_SEQ_ID:
      return getLastExecutionDataSeqId();

    case LAST_MODIFIED_AT:
      return getLastModifiedAt();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LAST_MESSAGE_AT:
      return isSetLastMessageAt();
    case LAST_MESSAGE_SEQ_ID:
      return isSetLastMessageSeqId();
    case LAST_MESSAGE_TEXT:
      return isSetLastMessageText();
    case LAST_EXECUTION_DATA_AT:
      return isSetLastExecutionDataAt();
    case LAST_EXECUTION_DATA_SEQ_ID:
      return isSetLastExecutionDataSeqId();
    case LAST_MODIFIED_AT:
      return isSetLastModifiedAt();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobActivity)
      return this.equals((JobActivity)that);
    return false;
  }

  public boolean equals(JobActivity that) {
    if (that == null)
      return false;

    boolean this_present_lastMessageAt = true;
    boolean that_present_lastMessageAt = true;
    if (this_present_lastMessageAt || that_present_lastMessageAt) {
      if (!(this_present_lastMessageAt && that_present_lastMessageAt))
        return false;
      if (this.lastMessageAt != that.lastMessageAt)
        return false;
    }

    boolean this_present_lastMessageSeqId = true;
    boolean that_present_lastMessageSeqId = true;
    if (this_present_lastMessageSeqId || that_present_lastMessageSeqId) {
      if (!(this_present_lastMessageSeqId && that_present_lastMessageSeqId))
        return false;
      if (this.lastMessageSeqId != that.lastMessageSeqId)
        return false;
    }

    boolean this_present_lastMessageText = true && this.isSetLastMessageText();
    boolean that_present_lastMessageText = true && that.isSetLastMessageText();
    if (this_present_lastMessageText || that_present_lastMessageText) {
      if (!(this_present_lastMessageText && that_present_lastMessageText))
        return false;
      if (!this.lastMessageText.equals(that.lastMessageText))
        return false;
    }

    boolean this_present_lastExecutionDataAt = true;
    boolean that_present_lastExecutionDataAt = true;
    if (this_present_lastExecutionDataAt || that_present_lastExecutionDataAt) {
      if (!(this_present_lastExecutionDataAt && that_present_lastExecutionDataAt))
        return false;
      if (this.lastExecutionDataAt != that.lastExecutionDataAt)
        return false;
    }

    boolean this_present_lastExecutionDataSeqId = true;
    boolean that_present_lastExecutionDataSeqId = true;
    if (this_present_lastExecutionDataSeqId || that_present_lastExecutionDataSeqId) {
      if (!(this_present_lastExecutionDataSeqId && that_present_lastExecutionDataSeqId))
        return false;
      if (this.lastExecutionDataSeqId != that.lastExecutionDataSeqId)
        return false;
    }

    boolean this_present_lastModifiedAt = true;
    boolean that_present_lastModifiedAt = true;
    if (this_present_lastModifiedAt || that_present_lastModifiedAt) {
      if (!(this_present_lastModifiedAt && that_present_lastModifiedAt))
        return false;
      if (this.lastModifiedAt != that.lastModifiedAt)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_lastMessageAt = true;
    list.add(present_lastMessageAt);
    if (present_lastMessageAt)
      list.add(lastMessageAt);

    boolean present_lastMessageSeqId = true;
    list.add(present_lastMessageSeqId);
    if (present_lastMessageSeqId)
      list.add(lastMessageSeqId);

    boolean present_lastMessageText = true && (isSetLastMessageText());
    list.add(present_lastMessageText);
    if (present_lastMessageText)
      list.add(lastMessageText);

    boolean present_lastExecutionDataAt = true;
    list.add(present_lastExecutionDataAt);
    if (present_lastExecutionDataAt)
      list.add(lastExecutionDataAt);

    boolean present_lastExecutionDataSeqId = true;
    list.add(present_lastExecutionDataSeqId);
    if (present_lastExecutionDataSeqId)
      list.add(lastExecutionDataSeqId);

    boolean present_lastModifiedAt = true;
    list.add(present_lastModifiedAt);
    if (present_lastModifiedAt)
      list.add(lastModifiedAt);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobActivity other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLastMessageAt()).compareTo(other.isSetLastMessageAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastMessageAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastMessageAt, other.lastMessageAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastMessageSeqId()).compareTo(other.isSetLastMessageSeqId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastMessageSeqId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastMessageSeqId, other.lastMessageSeqId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastMessageText()).compareTo(other.isSetLastMessageText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastMessageText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastMessageText, other.lastMessageText);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastExecutionDataAt()).compareTo(other.isSetLastExecutionDataAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastExecutionDataAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastExecutionDataAt, other.lastExecutionDataAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastExecutionDataSeqId()).compareTo(other.isSetLastExecutionDataSeqId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastExecutionDataSeqId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastExecutionDataSeqId, other.lastExecutionDataSeqId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastModifiedAt()).compareTo(other.isSetLastModifiedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModifiedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastModifiedAt, other.lastModifiedAt);
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
    StringBuilder sb = new StringBuilder("JobActivity(");
    boolean first = true;

    sb.append("lastMessageAt:");
    sb.append(this.lastMessageAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastMessageSeqId:");
    sb.append(this.lastMessageSeqId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastMessageText:");
    if (this.lastMessageText == null) {
      sb.append("null");
    } else {
      sb.append(this.lastMessageText);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastExecutionDataAt:");
    sb.append(this.lastExecutionDataAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastExecutionDataSeqId:");
    sb.append(this.lastExecutionDataSeqId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastModifiedAt:");
    sb.append(this.lastModifiedAt);
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

  private static class JobActivityStandardSchemeFactory implements SchemeFactory {
    public JobActivityStandardScheme getScheme() {
      return new JobActivityStandardScheme();
    }
  }

  private static class JobActivityStandardScheme extends StandardScheme<JobActivity> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobActivity struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LAST_MESSAGE_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastMessageAt = iprot.readI64();
              struct.setLastMessageAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LAST_MESSAGE_SEQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastMessageSeqId = iprot.readI64();
              struct.setLastMessageSeqIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_MESSAGE_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastMessageText = iprot.readString();
              struct.setLastMessageTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LAST_EXECUTION_DATA_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastExecutionDataAt = iprot.readI64();
              struct.setLastExecutionDataAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LAST_EXECUTION_DATA_SEQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastExecutionDataSeqId = iprot.readI64();
              struct.setLastExecutionDataSeqIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LAST_MODIFIED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastModifiedAt = iprot.readI64();
              struct.setLastModifiedAtIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobActivity struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LAST_MESSAGE_AT_FIELD_DESC);
      oprot.writeI64(struct.lastMessageAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_MESSAGE_SEQ_ID_FIELD_DESC);
      oprot.writeI64(struct.lastMessageSeqId);
      oprot.writeFieldEnd();
      if (struct.lastMessageText != null) {
        oprot.writeFieldBegin(LAST_MESSAGE_TEXT_FIELD_DESC);
        oprot.writeString(struct.lastMessageText);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_EXECUTION_DATA_AT_FIELD_DESC);
      oprot.writeI64(struct.lastExecutionDataAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_EXECUTION_DATA_SEQ_ID_FIELD_DESC);
      oprot.writeI64(struct.lastExecutionDataSeqId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_MODIFIED_AT_FIELD_DESC);
      oprot.writeI64(struct.lastModifiedAt);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

