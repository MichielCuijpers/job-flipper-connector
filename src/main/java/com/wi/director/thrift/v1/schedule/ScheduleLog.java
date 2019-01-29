/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.schedule;

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
public class ScheduleLog implements org.apache.thrift.TBase<ScheduleLog, ScheduleLog._Fields>, java.io.Serializable, Cloneable, Comparable<ScheduleLog> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ScheduleLog");

  private static final org.apache.thrift.protocol.TField SCHEDULE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("scheduleId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RUN_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("runAt", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NEXT_RUN_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("nextRunAt", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TIME_STARTED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("timeStartedAt", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField TIME_TAKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("timeTaken", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ScheduleLogStandardSchemeFactory());
  }

  public String scheduleId; // required
  public String runAt; // required
  public String error; // required
  public String nextRunAt; // required
  public long timeStartedAt; // required
  public long timeTaken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEDULE_ID((short)1, "scheduleId"),
    RUN_AT((short)2, "runAt"),
    ERROR((short)3, "error"),
    NEXT_RUN_AT((short)4, "nextRunAt"),
    TIME_STARTED_AT((short)5, "timeStartedAt"),
    TIME_TAKEN((short)6, "timeTaken");

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
        case 1: // SCHEDULE_ID
          return SCHEDULE_ID;
        case 2: // RUN_AT
          return RUN_AT;
        case 3: // ERROR
          return ERROR;
        case 4: // NEXT_RUN_AT
          return NEXT_RUN_AT;
        case 5: // TIME_STARTED_AT
          return TIME_STARTED_AT;
        case 6: // TIME_TAKEN
          return TIME_TAKEN;
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
  private static final int __TIMESTARTEDAT_ISSET_ID = 0;
  private static final int __TIMETAKEN_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEDULE_ID, new org.apache.thrift.meta_data.FieldMetaData("scheduleId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RUN_AT, new org.apache.thrift.meta_data.FieldMetaData("runAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEXT_RUN_AT, new org.apache.thrift.meta_data.FieldMetaData("nextRunAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_STARTED_AT, new org.apache.thrift.meta_data.FieldMetaData("timeStartedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TIME_TAKEN, new org.apache.thrift.meta_data.FieldMetaData("timeTaken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ScheduleLog.class, metaDataMap);
  }

  public ScheduleLog() {
  }

  public ScheduleLog(
    String scheduleId,
    String runAt,
    String error,
    String nextRunAt,
    long timeStartedAt,
    long timeTaken)
  {
    this();
    this.scheduleId = scheduleId;
    this.runAt = runAt;
    this.error = error;
    this.nextRunAt = nextRunAt;
    this.timeStartedAt = timeStartedAt;
    setTimeStartedAtIsSet(true);
    this.timeTaken = timeTaken;
    setTimeTakenIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScheduleLog(ScheduleLog other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetScheduleId()) {
      this.scheduleId = other.scheduleId;
    }
    if (other.isSetRunAt()) {
      this.runAt = other.runAt;
    }
    if (other.isSetError()) {
      this.error = other.error;
    }
    if (other.isSetNextRunAt()) {
      this.nextRunAt = other.nextRunAt;
    }
    this.timeStartedAt = other.timeStartedAt;
    this.timeTaken = other.timeTaken;
  }

  public ScheduleLog deepCopy() {
    return new ScheduleLog(this);
  }

  @Override
  public void clear() {
    this.scheduleId = null;
    this.runAt = null;
    this.error = null;
    this.nextRunAt = null;
    setTimeStartedAtIsSet(false);
    this.timeStartedAt = 0;
    setTimeTakenIsSet(false);
    this.timeTaken = 0;
  }

  public String getScheduleId() {
    return this.scheduleId;
  }

  public ScheduleLog setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public void unsetScheduleId() {
    this.scheduleId = null;
  }

  /** Returns true if field scheduleId is set (has been assigned a value) and false otherwise */
  public boolean isSetScheduleId() {
    return this.scheduleId != null;
  }

  public void setScheduleIdIsSet(boolean value) {
    if (!value) {
      this.scheduleId = null;
    }
  }

  public String getRunAt() {
    return this.runAt;
  }

  public ScheduleLog setRunAt(String runAt) {
    this.runAt = runAt;
    return this;
  }

  public void unsetRunAt() {
    this.runAt = null;
  }

  /** Returns true if field runAt is set (has been assigned a value) and false otherwise */
  public boolean isSetRunAt() {
    return this.runAt != null;
  }

  public void setRunAtIsSet(boolean value) {
    if (!value) {
      this.runAt = null;
    }
  }

  public String getError() {
    return this.error;
  }

  public ScheduleLog setError(String error) {
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

  public String getNextRunAt() {
    return this.nextRunAt;
  }

  public ScheduleLog setNextRunAt(String nextRunAt) {
    this.nextRunAt = nextRunAt;
    return this;
  }

  public void unsetNextRunAt() {
    this.nextRunAt = null;
  }

  /** Returns true if field nextRunAt is set (has been assigned a value) and false otherwise */
  public boolean isSetNextRunAt() {
    return this.nextRunAt != null;
  }

  public void setNextRunAtIsSet(boolean value) {
    if (!value) {
      this.nextRunAt = null;
    }
  }

  public long getTimeStartedAt() {
    return this.timeStartedAt;
  }

  public ScheduleLog setTimeStartedAt(long timeStartedAt) {
    this.timeStartedAt = timeStartedAt;
    setTimeStartedAtIsSet(true);
    return this;
  }

  public void unsetTimeStartedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTARTEDAT_ISSET_ID);
  }

  /** Returns true if field timeStartedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeStartedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTARTEDAT_ISSET_ID);
  }

  public void setTimeStartedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTARTEDAT_ISSET_ID, value);
  }

  public long getTimeTaken() {
    return this.timeTaken;
  }

  public ScheduleLog setTimeTaken(long timeTaken) {
    this.timeTaken = timeTaken;
    setTimeTakenIsSet(true);
    return this;
  }

  public void unsetTimeTaken() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMETAKEN_ISSET_ID);
  }

  /** Returns true if field timeTaken is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeTaken() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMETAKEN_ISSET_ID);
  }

  public void setTimeTakenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMETAKEN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCHEDULE_ID:
      if (value == null) {
        unsetScheduleId();
      } else {
        setScheduleId((String)value);
      }
      break;

    case RUN_AT:
      if (value == null) {
        unsetRunAt();
      } else {
        setRunAt((String)value);
      }
      break;

    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((String)value);
      }
      break;

    case NEXT_RUN_AT:
      if (value == null) {
        unsetNextRunAt();
      } else {
        setNextRunAt((String)value);
      }
      break;

    case TIME_STARTED_AT:
      if (value == null) {
        unsetTimeStartedAt();
      } else {
        setTimeStartedAt((Long)value);
      }
      break;

    case TIME_TAKEN:
      if (value == null) {
        unsetTimeTaken();
      } else {
        setTimeTaken((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEDULE_ID:
      return getScheduleId();

    case RUN_AT:
      return getRunAt();

    case ERROR:
      return getError();

    case NEXT_RUN_AT:
      return getNextRunAt();

    case TIME_STARTED_AT:
      return getTimeStartedAt();

    case TIME_TAKEN:
      return getTimeTaken();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCHEDULE_ID:
      return isSetScheduleId();
    case RUN_AT:
      return isSetRunAt();
    case ERROR:
      return isSetError();
    case NEXT_RUN_AT:
      return isSetNextRunAt();
    case TIME_STARTED_AT:
      return isSetTimeStartedAt();
    case TIME_TAKEN:
      return isSetTimeTaken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScheduleLog)
      return this.equals((ScheduleLog)that);
    return false;
  }

  public boolean equals(ScheduleLog that) {
    if (that == null)
      return false;

    boolean this_present_scheduleId = true && this.isSetScheduleId();
    boolean that_present_scheduleId = true && that.isSetScheduleId();
    if (this_present_scheduleId || that_present_scheduleId) {
      if (!(this_present_scheduleId && that_present_scheduleId))
        return false;
      if (!this.scheduleId.equals(that.scheduleId))
        return false;
    }

    boolean this_present_runAt = true && this.isSetRunAt();
    boolean that_present_runAt = true && that.isSetRunAt();
    if (this_present_runAt || that_present_runAt) {
      if (!(this_present_runAt && that_present_runAt))
        return false;
      if (!this.runAt.equals(that.runAt))
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

    boolean this_present_nextRunAt = true && this.isSetNextRunAt();
    boolean that_present_nextRunAt = true && that.isSetNextRunAt();
    if (this_present_nextRunAt || that_present_nextRunAt) {
      if (!(this_present_nextRunAt && that_present_nextRunAt))
        return false;
      if (!this.nextRunAt.equals(that.nextRunAt))
        return false;
    }

    boolean this_present_timeStartedAt = true;
    boolean that_present_timeStartedAt = true;
    if (this_present_timeStartedAt || that_present_timeStartedAt) {
      if (!(this_present_timeStartedAt && that_present_timeStartedAt))
        return false;
      if (this.timeStartedAt != that.timeStartedAt)
        return false;
    }

    boolean this_present_timeTaken = true;
    boolean that_present_timeTaken = true;
    if (this_present_timeTaken || that_present_timeTaken) {
      if (!(this_present_timeTaken && that_present_timeTaken))
        return false;
      if (this.timeTaken != that.timeTaken)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_scheduleId = true && (isSetScheduleId());
    list.add(present_scheduleId);
    if (present_scheduleId)
      list.add(scheduleId);

    boolean present_runAt = true && (isSetRunAt());
    list.add(present_runAt);
    if (present_runAt)
      list.add(runAt);

    boolean present_error = true && (isSetError());
    list.add(present_error);
    if (present_error)
      list.add(error);

    boolean present_nextRunAt = true && (isSetNextRunAt());
    list.add(present_nextRunAt);
    if (present_nextRunAt)
      list.add(nextRunAt);

    boolean present_timeStartedAt = true;
    list.add(present_timeStartedAt);
    if (present_timeStartedAt)
      list.add(timeStartedAt);

    boolean present_timeTaken = true;
    list.add(present_timeTaken);
    if (present_timeTaken)
      list.add(timeTaken);

    return list.hashCode();
  }

  @Override
  public int compareTo(ScheduleLog other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetScheduleId()).compareTo(other.isSetScheduleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheduleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheduleId, other.scheduleId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunAt()).compareTo(other.isSetRunAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runAt, other.runAt);
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
    lastComparison = Boolean.valueOf(isSetNextRunAt()).compareTo(other.isSetNextRunAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextRunAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nextRunAt, other.nextRunAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeStartedAt()).compareTo(other.isSetTimeStartedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeStartedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeStartedAt, other.timeStartedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeTaken()).compareTo(other.isSetTimeTaken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeTaken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeTaken, other.timeTaken);
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
    StringBuilder sb = new StringBuilder("ScheduleLog(");
    boolean first = true;

    sb.append("scheduleId:");
    if (this.scheduleId == null) {
      sb.append("null");
    } else {
      sb.append(this.scheduleId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("runAt:");
    if (this.runAt == null) {
      sb.append("null");
    } else {
      sb.append(this.runAt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("error:");
    if (this.error == null) {
      sb.append("null");
    } else {
      sb.append(this.error);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nextRunAt:");
    if (this.nextRunAt == null) {
      sb.append("null");
    } else {
      sb.append(this.nextRunAt);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeStartedAt:");
    sb.append(this.timeStartedAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeTaken:");
    sb.append(this.timeTaken);
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

  private static class ScheduleLogStandardSchemeFactory implements SchemeFactory {
    public ScheduleLogStandardScheme getScheme() {
      return new ScheduleLogStandardScheme();
    }
  }

  private static class ScheduleLogStandardScheme extends StandardScheme<ScheduleLog> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ScheduleLog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEDULE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scheduleId = iprot.readString();
              struct.setScheduleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RUN_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.runAt = iprot.readString();
              struct.setRunAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error = iprot.readString();
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NEXT_RUN_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nextRunAt = iprot.readString();
              struct.setNextRunAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIME_STARTED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeStartedAt = iprot.readI64();
              struct.setTimeStartedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TIME_TAKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeTaken = iprot.readI64();
              struct.setTimeTakenIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ScheduleLog struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scheduleId != null) {
        oprot.writeFieldBegin(SCHEDULE_ID_FIELD_DESC);
        oprot.writeString(struct.scheduleId);
        oprot.writeFieldEnd();
      }
      if (struct.runAt != null) {
        oprot.writeFieldBegin(RUN_AT_FIELD_DESC);
        oprot.writeString(struct.runAt);
        oprot.writeFieldEnd();
      }
      if (struct.error != null) {
        oprot.writeFieldBegin(ERROR_FIELD_DESC);
        oprot.writeString(struct.error);
        oprot.writeFieldEnd();
      }
      if (struct.nextRunAt != null) {
        oprot.writeFieldBegin(NEXT_RUN_AT_FIELD_DESC);
        oprot.writeString(struct.nextRunAt);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_STARTED_AT_FIELD_DESC);
      oprot.writeI64(struct.timeStartedAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIME_TAKEN_FIELD_DESC);
      oprot.writeI64(struct.timeTaken);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

