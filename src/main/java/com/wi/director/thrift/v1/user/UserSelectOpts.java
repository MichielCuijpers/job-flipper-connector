/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.user;

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
public class UserSelectOpts implements org.apache.thrift.TBase<UserSelectOpts, UserSelectOpts._Fields>, java.io.Serializable, Cloneable, Comparable<UserSelectOpts> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserSelectOpts");

  private static final org.apache.thrift.protocol.TField INCLUDE_TEAM_MEMBERSHIP_FIELD_DESC = new org.apache.thrift.protocol.TField("includeTeamMembership", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField INCLUDE_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("includeStats", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField INCLUDE_ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("includeAttributes", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserSelectOptsStandardSchemeFactory());
  }

  public boolean includeTeamMembership; // required
  public boolean includeStats; // required
  public boolean includeAttributes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INCLUDE_TEAM_MEMBERSHIP((short)1, "includeTeamMembership"),
    INCLUDE_STATS((short)2, "includeStats"),
    INCLUDE_ATTRIBUTES((short)3, "includeAttributes");

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
        case 1: // INCLUDE_TEAM_MEMBERSHIP
          return INCLUDE_TEAM_MEMBERSHIP;
        case 2: // INCLUDE_STATS
          return INCLUDE_STATS;
        case 3: // INCLUDE_ATTRIBUTES
          return INCLUDE_ATTRIBUTES;
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
  private static final int __INCLUDETEAMMEMBERSHIP_ISSET_ID = 0;
  private static final int __INCLUDESTATS_ISSET_ID = 1;
  private static final int __INCLUDEATTRIBUTES_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INCLUDE_TEAM_MEMBERSHIP, new org.apache.thrift.meta_data.FieldMetaData("includeTeamMembership", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_STATS, new org.apache.thrift.meta_data.FieldMetaData("includeStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("includeAttributes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserSelectOpts.class, metaDataMap);
  }

  public UserSelectOpts() {
  }

  public UserSelectOpts(
    boolean includeTeamMembership,
    boolean includeStats,
    boolean includeAttributes)
  {
    this();
    this.includeTeamMembership = includeTeamMembership;
    setIncludeTeamMembershipIsSet(true);
    this.includeStats = includeStats;
    setIncludeStatsIsSet(true);
    this.includeAttributes = includeAttributes;
    setIncludeAttributesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserSelectOpts(UserSelectOpts other) {
    __isset_bitfield = other.__isset_bitfield;
    this.includeTeamMembership = other.includeTeamMembership;
    this.includeStats = other.includeStats;
    this.includeAttributes = other.includeAttributes;
  }

  public UserSelectOpts deepCopy() {
    return new UserSelectOpts(this);
  }

  @Override
  public void clear() {
    setIncludeTeamMembershipIsSet(false);
    this.includeTeamMembership = false;
    setIncludeStatsIsSet(false);
    this.includeStats = false;
    setIncludeAttributesIsSet(false);
    this.includeAttributes = false;
  }

  public boolean isIncludeTeamMembership() {
    return this.includeTeamMembership;
  }

  public UserSelectOpts setIncludeTeamMembership(boolean includeTeamMembership) {
    this.includeTeamMembership = includeTeamMembership;
    setIncludeTeamMembershipIsSet(true);
    return this;
  }

  public void unsetIncludeTeamMembership() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCLUDETEAMMEMBERSHIP_ISSET_ID);
  }

  /** Returns true if field includeTeamMembership is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeTeamMembership() {
    return EncodingUtils.testBit(__isset_bitfield, __INCLUDETEAMMEMBERSHIP_ISSET_ID);
  }

  public void setIncludeTeamMembershipIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCLUDETEAMMEMBERSHIP_ISSET_ID, value);
  }

  public boolean isIncludeStats() {
    return this.includeStats;
  }

  public UserSelectOpts setIncludeStats(boolean includeStats) {
    this.includeStats = includeStats;
    setIncludeStatsIsSet(true);
    return this;
  }

  public void unsetIncludeStats() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCLUDESTATS_ISSET_ID);
  }

  /** Returns true if field includeStats is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeStats() {
    return EncodingUtils.testBit(__isset_bitfield, __INCLUDESTATS_ISSET_ID);
  }

  public void setIncludeStatsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCLUDESTATS_ISSET_ID, value);
  }

  public boolean isIncludeAttributes() {
    return this.includeAttributes;
  }

  public UserSelectOpts setIncludeAttributes(boolean includeAttributes) {
    this.includeAttributes = includeAttributes;
    setIncludeAttributesIsSet(true);
    return this;
  }

  public void unsetIncludeAttributes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCLUDEATTRIBUTES_ISSET_ID);
  }

  /** Returns true if field includeAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeAttributes() {
    return EncodingUtils.testBit(__isset_bitfield, __INCLUDEATTRIBUTES_ISSET_ID);
  }

  public void setIncludeAttributesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCLUDEATTRIBUTES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INCLUDE_TEAM_MEMBERSHIP:
      if (value == null) {
        unsetIncludeTeamMembership();
      } else {
        setIncludeTeamMembership((Boolean)value);
      }
      break;

    case INCLUDE_STATS:
      if (value == null) {
        unsetIncludeStats();
      } else {
        setIncludeStats((Boolean)value);
      }
      break;

    case INCLUDE_ATTRIBUTES:
      if (value == null) {
        unsetIncludeAttributes();
      } else {
        setIncludeAttributes((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INCLUDE_TEAM_MEMBERSHIP:
      return isIncludeTeamMembership();

    case INCLUDE_STATS:
      return isIncludeStats();

    case INCLUDE_ATTRIBUTES:
      return isIncludeAttributes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INCLUDE_TEAM_MEMBERSHIP:
      return isSetIncludeTeamMembership();
    case INCLUDE_STATS:
      return isSetIncludeStats();
    case INCLUDE_ATTRIBUTES:
      return isSetIncludeAttributes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserSelectOpts)
      return this.equals((UserSelectOpts)that);
    return false;
  }

  public boolean equals(UserSelectOpts that) {
    if (that == null)
      return false;

    boolean this_present_includeTeamMembership = true;
    boolean that_present_includeTeamMembership = true;
    if (this_present_includeTeamMembership || that_present_includeTeamMembership) {
      if (!(this_present_includeTeamMembership && that_present_includeTeamMembership))
        return false;
      if (this.includeTeamMembership != that.includeTeamMembership)
        return false;
    }

    boolean this_present_includeStats = true;
    boolean that_present_includeStats = true;
    if (this_present_includeStats || that_present_includeStats) {
      if (!(this_present_includeStats && that_present_includeStats))
        return false;
      if (this.includeStats != that.includeStats)
        return false;
    }

    boolean this_present_includeAttributes = true;
    boolean that_present_includeAttributes = true;
    if (this_present_includeAttributes || that_present_includeAttributes) {
      if (!(this_present_includeAttributes && that_present_includeAttributes))
        return false;
      if (this.includeAttributes != that.includeAttributes)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_includeTeamMembership = true;
    list.add(present_includeTeamMembership);
    if (present_includeTeamMembership)
      list.add(includeTeamMembership);

    boolean present_includeStats = true;
    list.add(present_includeStats);
    if (present_includeStats)
      list.add(includeStats);

    boolean present_includeAttributes = true;
    list.add(present_includeAttributes);
    if (present_includeAttributes)
      list.add(includeAttributes);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserSelectOpts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIncludeTeamMembership()).compareTo(other.isSetIncludeTeamMembership());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeTeamMembership()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeTeamMembership, other.includeTeamMembership);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeStats()).compareTo(other.isSetIncludeStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeStats, other.includeStats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeAttributes()).compareTo(other.isSetIncludeAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeAttributes, other.includeAttributes);
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
    StringBuilder sb = new StringBuilder("UserSelectOpts(");
    boolean first = true;

    sb.append("includeTeamMembership:");
    sb.append(this.includeTeamMembership);
    first = false;
    if (!first) sb.append(", ");
    sb.append("includeStats:");
    sb.append(this.includeStats);
    first = false;
    if (!first) sb.append(", ");
    sb.append("includeAttributes:");
    sb.append(this.includeAttributes);
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

  private static class UserSelectOptsStandardSchemeFactory implements SchemeFactory {
    public UserSelectOptsStandardScheme getScheme() {
      return new UserSelectOptsStandardScheme();
    }
  }

  private static class UserSelectOptsStandardScheme extends StandardScheme<UserSelectOpts> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserSelectOpts struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INCLUDE_TEAM_MEMBERSHIP
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.includeTeamMembership = iprot.readBool();
              struct.setIncludeTeamMembershipIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INCLUDE_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.includeStats = iprot.readBool();
              struct.setIncludeStatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INCLUDE_ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.includeAttributes = iprot.readBool();
              struct.setIncludeAttributesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserSelectOpts struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INCLUDE_TEAM_MEMBERSHIP_FIELD_DESC);
      oprot.writeBool(struct.includeTeamMembership);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INCLUDE_STATS_FIELD_DESC);
      oprot.writeBool(struct.includeStats);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INCLUDE_ATTRIBUTES_FIELD_DESC);
      oprot.writeBool(struct.includeAttributes);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

