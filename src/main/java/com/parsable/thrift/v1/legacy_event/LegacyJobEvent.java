/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.legacy_event;

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
public class LegacyJobEvent implements org.apache.thrift.TBase<LegacyJobEvent, LegacyJobEvent._Fields>, java.io.Serializable, Cloneable, Comparable<LegacyJobEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LegacyJobEvent");

  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PEDIGREE_FIELD_DESC = new org.apache.thrift.protocol.TField("pedigree", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField IN_PLANNING_FIELD_DESC = new org.apache.thrift.protocol.TField("inPlanning", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField LEGACY_SEQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("legacySeqId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField RECEIVED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("receivedAt", org.apache.thrift.protocol.TType.I64, (short)20);
  private static final org.apache.thrift.protocol.TField SERVER_GENERATED_FIELD_DESC = new org.apache.thrift.protocol.TField("serverGenerated", org.apache.thrift.protocol.TType.BOOL, (short)100);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LegacyJobEventStandardSchemeFactory());
  }

  public String jobId; // required
  public LegacyPedigree pedigree; // required
  public LegacyJobOp op; // required
  public boolean inPlanning; // optional
  public long legacySeqId; // optional
  public long receivedAt; // optional
  public boolean serverGenerated; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_ID((short)1, "jobId"),
    PEDIGREE((short)2, "pedigree"),
    OP((short)3, "op"),
    IN_PLANNING((short)4, "inPlanning"),
    LEGACY_SEQ_ID((short)5, "legacySeqId"),
    RECEIVED_AT((short)20, "receivedAt"),
    SERVER_GENERATED((short)100, "serverGenerated");

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
        case 1: // JOB_ID
          return JOB_ID;
        case 2: // PEDIGREE
          return PEDIGREE;
        case 3: // OP
          return OP;
        case 4: // IN_PLANNING
          return IN_PLANNING;
        case 5: // LEGACY_SEQ_ID
          return LEGACY_SEQ_ID;
        case 20: // RECEIVED_AT
          return RECEIVED_AT;
        case 100: // SERVER_GENERATED
          return SERVER_GENERATED;
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
  private static final int __INPLANNING_ISSET_ID = 0;
  private static final int __LEGACYSEQID_ISSET_ID = 1;
  private static final int __RECEIVEDAT_ISSET_ID = 2;
  private static final int __SERVERGENERATED_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IN_PLANNING,_Fields.LEGACY_SEQ_ID,_Fields.RECEIVED_AT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("jobId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.PEDIGREE, new org.apache.thrift.meta_data.FieldMetaData("pedigree", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LegacyPedigree.class)));
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LegacyJobOp.class)));
    tmpMap.put(_Fields.IN_PLANNING, new org.apache.thrift.meta_data.FieldMetaData("inPlanning", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.LEGACY_SEQ_ID, new org.apache.thrift.meta_data.FieldMetaData("legacySeqId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RECEIVED_AT, new org.apache.thrift.meta_data.FieldMetaData("receivedAt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TimeInSecs")));
    tmpMap.put(_Fields.SERVER_GENERATED, new org.apache.thrift.meta_data.FieldMetaData("serverGenerated", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LegacyJobEvent.class, metaDataMap);
  }

  public LegacyJobEvent() {
    this.serverGenerated = false;

  }

  public LegacyJobEvent(
    String jobId,
    LegacyPedigree pedigree,
    LegacyJobOp op,
    boolean serverGenerated)
  {
    this();
    this.jobId = jobId;
    this.pedigree = pedigree;
    this.op = op;
    this.serverGenerated = serverGenerated;
    setServerGeneratedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LegacyJobEvent(LegacyJobEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobId()) {
      this.jobId = other.jobId;
    }
    if (other.isSetPedigree()) {
      this.pedigree = new LegacyPedigree(other.pedigree);
    }
    if (other.isSetOp()) {
      this.op = new LegacyJobOp(other.op);
    }
    this.inPlanning = other.inPlanning;
    this.legacySeqId = other.legacySeqId;
    this.receivedAt = other.receivedAt;
    this.serverGenerated = other.serverGenerated;
  }

  public LegacyJobEvent deepCopy() {
    return new LegacyJobEvent(this);
  }

  @Override
  public void clear() {
    this.jobId = null;
    this.pedigree = null;
    this.op = null;
    setInPlanningIsSet(false);
    this.inPlanning = false;
    setLegacySeqIdIsSet(false);
    this.legacySeqId = 0;
    setReceivedAtIsSet(false);
    this.receivedAt = 0;
    this.serverGenerated = false;

  }

  public String getJobId() {
    return this.jobId;
  }

  public LegacyJobEvent setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public void unsetJobId() {
    this.jobId = null;
  }

  /** Returns true if field jobId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return this.jobId != null;
  }

  public void setJobIdIsSet(boolean value) {
    if (!value) {
      this.jobId = null;
    }
  }

  public LegacyPedigree getPedigree() {
    return this.pedigree;
  }

  public LegacyJobEvent setPedigree(LegacyPedigree pedigree) {
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

  public LegacyJobOp getOp() {
    return this.op;
  }

  public LegacyJobEvent setOp(LegacyJobOp op) {
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

  public boolean isInPlanning() {
    return this.inPlanning;
  }

  public LegacyJobEvent setInPlanning(boolean inPlanning) {
    this.inPlanning = inPlanning;
    setInPlanningIsSet(true);
    return this;
  }

  public void unsetInPlanning() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INPLANNING_ISSET_ID);
  }

  /** Returns true if field inPlanning is set (has been assigned a value) and false otherwise */
  public boolean isSetInPlanning() {
    return EncodingUtils.testBit(__isset_bitfield, __INPLANNING_ISSET_ID);
  }

  public void setInPlanningIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INPLANNING_ISSET_ID, value);
  }

  public long getLegacySeqId() {
    return this.legacySeqId;
  }

  public LegacyJobEvent setLegacySeqId(long legacySeqId) {
    this.legacySeqId = legacySeqId;
    setLegacySeqIdIsSet(true);
    return this;
  }

  public void unsetLegacySeqId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEGACYSEQID_ISSET_ID);
  }

  /** Returns true if field legacySeqId is set (has been assigned a value) and false otherwise */
  public boolean isSetLegacySeqId() {
    return EncodingUtils.testBit(__isset_bitfield, __LEGACYSEQID_ISSET_ID);
  }

  public void setLegacySeqIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEGACYSEQID_ISSET_ID, value);
  }

  public long getReceivedAt() {
    return this.receivedAt;
  }

  public LegacyJobEvent setReceivedAt(long receivedAt) {
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

  public boolean isServerGenerated() {
    return this.serverGenerated;
  }

  public LegacyJobEvent setServerGenerated(boolean serverGenerated) {
    this.serverGenerated = serverGenerated;
    setServerGeneratedIsSet(true);
    return this;
  }

  public void unsetServerGenerated() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SERVERGENERATED_ISSET_ID);
  }

  /** Returns true if field serverGenerated is set (has been assigned a value) and false otherwise */
  public boolean isSetServerGenerated() {
    return EncodingUtils.testBit(__isset_bitfield, __SERVERGENERATED_ISSET_ID);
  }

  public void setServerGeneratedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SERVERGENERATED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((String)value);
      }
      break;

    case PEDIGREE:
      if (value == null) {
        unsetPedigree();
      } else {
        setPedigree((LegacyPedigree)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((LegacyJobOp)value);
      }
      break;

    case IN_PLANNING:
      if (value == null) {
        unsetInPlanning();
      } else {
        setInPlanning((Boolean)value);
      }
      break;

    case LEGACY_SEQ_ID:
      if (value == null) {
        unsetLegacySeqId();
      } else {
        setLegacySeqId((Long)value);
      }
      break;

    case RECEIVED_AT:
      if (value == null) {
        unsetReceivedAt();
      } else {
        setReceivedAt((Long)value);
      }
      break;

    case SERVER_GENERATED:
      if (value == null) {
        unsetServerGenerated();
      } else {
        setServerGenerated((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_ID:
      return getJobId();

    case PEDIGREE:
      return getPedigree();

    case OP:
      return getOp();

    case IN_PLANNING:
      return isInPlanning();

    case LEGACY_SEQ_ID:
      return getLegacySeqId();

    case RECEIVED_AT:
      return getReceivedAt();

    case SERVER_GENERATED:
      return isServerGenerated();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_ID:
      return isSetJobId();
    case PEDIGREE:
      return isSetPedigree();
    case OP:
      return isSetOp();
    case IN_PLANNING:
      return isSetInPlanning();
    case LEGACY_SEQ_ID:
      return isSetLegacySeqId();
    case RECEIVED_AT:
      return isSetReceivedAt();
    case SERVER_GENERATED:
      return isSetServerGenerated();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LegacyJobEvent)
      return this.equals((LegacyJobEvent)that);
    return false;
  }

  public boolean equals(LegacyJobEvent that) {
    if (that == null)
      return false;

    boolean this_present_jobId = true && this.isSetJobId();
    boolean that_present_jobId = true && that.isSetJobId();
    if (this_present_jobId || that_present_jobId) {
      if (!(this_present_jobId && that_present_jobId))
        return false;
      if (!this.jobId.equals(that.jobId))
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

    boolean this_present_inPlanning = true && this.isSetInPlanning();
    boolean that_present_inPlanning = true && that.isSetInPlanning();
    if (this_present_inPlanning || that_present_inPlanning) {
      if (!(this_present_inPlanning && that_present_inPlanning))
        return false;
      if (this.inPlanning != that.inPlanning)
        return false;
    }

    boolean this_present_legacySeqId = true && this.isSetLegacySeqId();
    boolean that_present_legacySeqId = true && that.isSetLegacySeqId();
    if (this_present_legacySeqId || that_present_legacySeqId) {
      if (!(this_present_legacySeqId && that_present_legacySeqId))
        return false;
      if (this.legacySeqId != that.legacySeqId)
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

    boolean this_present_serverGenerated = true;
    boolean that_present_serverGenerated = true;
    if (this_present_serverGenerated || that_present_serverGenerated) {
      if (!(this_present_serverGenerated && that_present_serverGenerated))
        return false;
      if (this.serverGenerated != that.serverGenerated)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobId = true && (isSetJobId());
    list.add(present_jobId);
    if (present_jobId)
      list.add(jobId);

    boolean present_pedigree = true && (isSetPedigree());
    list.add(present_pedigree);
    if (present_pedigree)
      list.add(pedigree);

    boolean present_op = true && (isSetOp());
    list.add(present_op);
    if (present_op)
      list.add(op);

    boolean present_inPlanning = true && (isSetInPlanning());
    list.add(present_inPlanning);
    if (present_inPlanning)
      list.add(inPlanning);

    boolean present_legacySeqId = true && (isSetLegacySeqId());
    list.add(present_legacySeqId);
    if (present_legacySeqId)
      list.add(legacySeqId);

    boolean present_receivedAt = true && (isSetReceivedAt());
    list.add(present_receivedAt);
    if (present_receivedAt)
      list.add(receivedAt);

    boolean present_serverGenerated = true;
    list.add(present_serverGenerated);
    if (present_serverGenerated)
      list.add(serverGenerated);

    return list.hashCode();
  }

  @Override
  public int compareTo(LegacyJobEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobId()).compareTo(other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobId, other.jobId);
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
    lastComparison = Boolean.valueOf(isSetInPlanning()).compareTo(other.isSetInPlanning());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInPlanning()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inPlanning, other.inPlanning);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLegacySeqId()).compareTo(other.isSetLegacySeqId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLegacySeqId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.legacySeqId, other.legacySeqId);
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
    lastComparison = Boolean.valueOf(isSetServerGenerated()).compareTo(other.isSetServerGenerated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerGenerated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverGenerated, other.serverGenerated);
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
    StringBuilder sb = new StringBuilder("LegacyJobEvent(");
    boolean first = true;

    sb.append("jobId:");
    if (this.jobId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobId);
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
    if (isSetInPlanning()) {
      if (!first) sb.append(", ");
      sb.append("inPlanning:");
      sb.append(this.inPlanning);
      first = false;
    }
    if (isSetLegacySeqId()) {
      if (!first) sb.append(", ");
      sb.append("legacySeqId:");
      sb.append(this.legacySeqId);
      first = false;
    }
    if (isSetReceivedAt()) {
      if (!first) sb.append(", ");
      sb.append("receivedAt:");
      sb.append(this.receivedAt);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("serverGenerated:");
    sb.append(this.serverGenerated);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (jobId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobId' was not present! Struct: " + toString());
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

  private static class LegacyJobEventStandardSchemeFactory implements SchemeFactory {
    public LegacyJobEventStandardScheme getScheme() {
      return new LegacyJobEventStandardScheme();
    }
  }

  private static class LegacyJobEventStandardScheme extends StandardScheme<LegacyJobEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LegacyJobEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobId = iprot.readString();
              struct.setJobIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PEDIGREE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.pedigree = new LegacyPedigree();
              struct.pedigree.read(iprot);
              struct.setPedigreeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.op = new LegacyJobOp();
              struct.op.read(iprot);
              struct.setOpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IN_PLANNING
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.inPlanning = iprot.readBool();
              struct.setInPlanningIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LEGACY_SEQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.legacySeqId = iprot.readI64();
              struct.setLegacySeqIdIsSet(true);
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
          case 100: // SERVER_GENERATED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.serverGenerated = iprot.readBool();
              struct.setServerGeneratedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LegacyJobEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobId != null) {
        oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
        oprot.writeString(struct.jobId);
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
      if (struct.isSetInPlanning()) {
        oprot.writeFieldBegin(IN_PLANNING_FIELD_DESC);
        oprot.writeBool(struct.inPlanning);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLegacySeqId()) {
        oprot.writeFieldBegin(LEGACY_SEQ_ID_FIELD_DESC);
        oprot.writeI64(struct.legacySeqId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReceivedAt()) {
        oprot.writeFieldBegin(RECEIVED_AT_FIELD_DESC);
        oprot.writeI64(struct.receivedAt);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SERVER_GENERATED_FIELD_DESC);
      oprot.writeBool(struct.serverGenerated);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

