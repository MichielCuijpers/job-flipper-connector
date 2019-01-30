/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.authentication;

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
 * NOHTML
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class AuthPeriods implements org.apache.thrift.TBase<AuthPeriods, AuthPeriods._Fields>, java.io.Serializable, Cloneable, Comparable<AuthPeriods> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthPeriods");

  private static final org.apache.thrift.protocol.TField WARNING_FIELD_DESC = new org.apache.thrift.protocol.TField("warning", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOCKOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("lockout", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DUMP_FIELD_DESC = new org.apache.thrift.protocol.TField("dump", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField EXPIRY_FIELD_DESC = new org.apache.thrift.protocol.TField("expiry", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthPeriodsStandardSchemeFactory());
  }

  public long warning; // required
  public long lockout; // required
  public long dump; // required
  public long expiry; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WARNING((short)1, "warning"),
    LOCKOUT((short)2, "lockout"),
    DUMP((short)3, "dump"),
    EXPIRY((short)4, "expiry");

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
        case 1: // WARNING
          return WARNING;
        case 2: // LOCKOUT
          return LOCKOUT;
        case 3: // DUMP
          return DUMP;
        case 4: // EXPIRY
          return EXPIRY;
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
  private static final int __WARNING_ISSET_ID = 0;
  private static final int __LOCKOUT_ISSET_ID = 1;
  private static final int __DUMP_ISSET_ID = 2;
  private static final int __EXPIRY_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WARNING, new org.apache.thrift.meta_data.FieldMetaData("warning", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOCKOUT, new org.apache.thrift.meta_data.FieldMetaData("lockout", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DUMP, new org.apache.thrift.meta_data.FieldMetaData("dump", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXPIRY, new org.apache.thrift.meta_data.FieldMetaData("expiry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthPeriods.class, metaDataMap);
  }

  public AuthPeriods() {
  }

  public AuthPeriods(
    long warning,
    long lockout,
    long dump,
    long expiry)
  {
    this();
    this.warning = warning;
    setWarningIsSet(true);
    this.lockout = lockout;
    setLockoutIsSet(true);
    this.dump = dump;
    setDumpIsSet(true);
    this.expiry = expiry;
    setExpiryIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthPeriods(AuthPeriods other) {
    __isset_bitfield = other.__isset_bitfield;
    this.warning = other.warning;
    this.lockout = other.lockout;
    this.dump = other.dump;
    this.expiry = other.expiry;
  }

  public AuthPeriods deepCopy() {
    return new AuthPeriods(this);
  }

  @Override
  public void clear() {
    setWarningIsSet(false);
    this.warning = 0;
    setLockoutIsSet(false);
    this.lockout = 0;
    setDumpIsSet(false);
    this.dump = 0;
    setExpiryIsSet(false);
    this.expiry = 0;
  }

  public long getWarning() {
    return this.warning;
  }

  public AuthPeriods setWarning(long warning) {
    this.warning = warning;
    setWarningIsSet(true);
    return this;
  }

  public void unsetWarning() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WARNING_ISSET_ID);
  }

  /** Returns true if field warning is set (has been assigned a value) and false otherwise */
  public boolean isSetWarning() {
    return EncodingUtils.testBit(__isset_bitfield, __WARNING_ISSET_ID);
  }

  public void setWarningIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WARNING_ISSET_ID, value);
  }

  public long getLockout() {
    return this.lockout;
  }

  public AuthPeriods setLockout(long lockout) {
    this.lockout = lockout;
    setLockoutIsSet(true);
    return this;
  }

  public void unsetLockout() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOCKOUT_ISSET_ID);
  }

  /** Returns true if field lockout is set (has been assigned a value) and false otherwise */
  public boolean isSetLockout() {
    return EncodingUtils.testBit(__isset_bitfield, __LOCKOUT_ISSET_ID);
  }

  public void setLockoutIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOCKOUT_ISSET_ID, value);
  }

  public long getDump() {
    return this.dump;
  }

  public AuthPeriods setDump(long dump) {
    this.dump = dump;
    setDumpIsSet(true);
    return this;
  }

  public void unsetDump() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DUMP_ISSET_ID);
  }

  /** Returns true if field dump is set (has been assigned a value) and false otherwise */
  public boolean isSetDump() {
    return EncodingUtils.testBit(__isset_bitfield, __DUMP_ISSET_ID);
  }

  public void setDumpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DUMP_ISSET_ID, value);
  }

  public long getExpiry() {
    return this.expiry;
  }

  public AuthPeriods setExpiry(long expiry) {
    this.expiry = expiry;
    setExpiryIsSet(true);
    return this;
  }

  public void unsetExpiry() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPIRY_ISSET_ID);
  }

  /** Returns true if field expiry is set (has been assigned a value) and false otherwise */
  public boolean isSetExpiry() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPIRY_ISSET_ID);
  }

  public void setExpiryIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPIRY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WARNING:
      if (value == null) {
        unsetWarning();
      } else {
        setWarning((Long)value);
      }
      break;

    case LOCKOUT:
      if (value == null) {
        unsetLockout();
      } else {
        setLockout((Long)value);
      }
      break;

    case DUMP:
      if (value == null) {
        unsetDump();
      } else {
        setDump((Long)value);
      }
      break;

    case EXPIRY:
      if (value == null) {
        unsetExpiry();
      } else {
        setExpiry((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WARNING:
      return getWarning();

    case LOCKOUT:
      return getLockout();

    case DUMP:
      return getDump();

    case EXPIRY:
      return getExpiry();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WARNING:
      return isSetWarning();
    case LOCKOUT:
      return isSetLockout();
    case DUMP:
      return isSetDump();
    case EXPIRY:
      return isSetExpiry();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthPeriods)
      return this.equals((AuthPeriods)that);
    return false;
  }

  public boolean equals(AuthPeriods that) {
    if (that == null)
      return false;

    boolean this_present_warning = true;
    boolean that_present_warning = true;
    if (this_present_warning || that_present_warning) {
      if (!(this_present_warning && that_present_warning))
        return false;
      if (this.warning != that.warning)
        return false;
    }

    boolean this_present_lockout = true;
    boolean that_present_lockout = true;
    if (this_present_lockout || that_present_lockout) {
      if (!(this_present_lockout && that_present_lockout))
        return false;
      if (this.lockout != that.lockout)
        return false;
    }

    boolean this_present_dump = true;
    boolean that_present_dump = true;
    if (this_present_dump || that_present_dump) {
      if (!(this_present_dump && that_present_dump))
        return false;
      if (this.dump != that.dump)
        return false;
    }

    boolean this_present_expiry = true;
    boolean that_present_expiry = true;
    if (this_present_expiry || that_present_expiry) {
      if (!(this_present_expiry && that_present_expiry))
        return false;
      if (this.expiry != that.expiry)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_warning = true;
    list.add(present_warning);
    if (present_warning)
      list.add(warning);

    boolean present_lockout = true;
    list.add(present_lockout);
    if (present_lockout)
      list.add(lockout);

    boolean present_dump = true;
    list.add(present_dump);
    if (present_dump)
      list.add(dump);

    boolean present_expiry = true;
    list.add(present_expiry);
    if (present_expiry)
      list.add(expiry);

    return list.hashCode();
  }

  @Override
  public int compareTo(AuthPeriods other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWarning()).compareTo(other.isSetWarning());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWarning()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.warning, other.warning);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLockout()).compareTo(other.isSetLockout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLockout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lockout, other.lockout);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDump()).compareTo(other.isSetDump());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDump()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dump, other.dump);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpiry()).compareTo(other.isSetExpiry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpiry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expiry, other.expiry);
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
    StringBuilder sb = new StringBuilder("AuthPeriods(");
    boolean first = true;

    sb.append("warning:");
    sb.append(this.warning);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lockout:");
    sb.append(this.lockout);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dump:");
    sb.append(this.dump);
    first = false;
    if (!first) sb.append(", ");
    sb.append("expiry:");
    sb.append(this.expiry);
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

  private static class AuthPeriodsStandardSchemeFactory implements SchemeFactory {
    public AuthPeriodsStandardScheme getScheme() {
      return new AuthPeriodsStandardScheme();
    }
  }

  private static class AuthPeriodsStandardScheme extends StandardScheme<AuthPeriods> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthPeriods struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WARNING
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.warning = iprot.readI64();
              struct.setWarningIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCKOUT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lockout = iprot.readI64();
              struct.setLockoutIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DUMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dump = iprot.readI64();
              struct.setDumpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXPIRY
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expiry = iprot.readI64();
              struct.setExpiryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthPeriods struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(WARNING_FIELD_DESC);
      oprot.writeI64(struct.warning);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOCKOUT_FIELD_DESC);
      oprot.writeI64(struct.lockout);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DUMP_FIELD_DESC);
      oprot.writeI64(struct.dump);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EXPIRY_FIELD_DESC);
      oprot.writeI64(struct.expiry);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
