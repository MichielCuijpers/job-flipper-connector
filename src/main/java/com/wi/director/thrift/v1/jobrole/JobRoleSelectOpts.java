/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.jobrole;

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
public class JobRoleSelectOpts implements org.apache.thrift.TBase<JobRoleSelectOpts, JobRoleSelectOpts._Fields>, java.io.Serializable, Cloneable, Comparable<JobRoleSelectOpts> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobRoleSelectOpts");

  private static final org.apache.thrift.protocol.TField INCLUDE_RESTRICTED_USER_MODULARS_FIELD_DESC = new org.apache.thrift.protocol.TField("includeRestrictedUserModulars", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ALL_USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("allUsers", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobRoleSelectOptsStandardSchemeFactory());
  }

  /**
   * Returns restricted user ids instead of user modulars when false
   */
  public boolean includeRestrictedUserModulars; // required
  /**
   * Returns roles for all users instead of just current user's
   * Only valid for <code>getAllAssignedRoles</code>,
   * and is ignored if user is not a team admin
   */
  public boolean allUsers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Returns restricted user ids instead of user modulars when false
     */
    INCLUDE_RESTRICTED_USER_MODULARS((short)1, "includeRestrictedUserModulars"),
    /**
     * Returns roles for all users instead of just current user's
     * Only valid for <code>getAllAssignedRoles</code>,
     * and is ignored if user is not a team admin
     */
    ALL_USERS((short)2, "allUsers");

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
        case 1: // INCLUDE_RESTRICTED_USER_MODULARS
          return INCLUDE_RESTRICTED_USER_MODULARS;
        case 2: // ALL_USERS
          return ALL_USERS;
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
  private static final int __INCLUDERESTRICTEDUSERMODULARS_ISSET_ID = 0;
  private static final int __ALLUSERS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INCLUDE_RESTRICTED_USER_MODULARS, new org.apache.thrift.meta_data.FieldMetaData("includeRestrictedUserModulars", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ALL_USERS, new org.apache.thrift.meta_data.FieldMetaData("allUsers", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobRoleSelectOpts.class, metaDataMap);
  }

  public JobRoleSelectOpts() {
  }

  public JobRoleSelectOpts(
    boolean includeRestrictedUserModulars,
    boolean allUsers)
  {
    this();
    this.includeRestrictedUserModulars = includeRestrictedUserModulars;
    setIncludeRestrictedUserModularsIsSet(true);
    this.allUsers = allUsers;
    setAllUsersIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobRoleSelectOpts(JobRoleSelectOpts other) {
    __isset_bitfield = other.__isset_bitfield;
    this.includeRestrictedUserModulars = other.includeRestrictedUserModulars;
    this.allUsers = other.allUsers;
  }

  public JobRoleSelectOpts deepCopy() {
    return new JobRoleSelectOpts(this);
  }

  @Override
  public void clear() {
    setIncludeRestrictedUserModularsIsSet(false);
    this.includeRestrictedUserModulars = false;
    setAllUsersIsSet(false);
    this.allUsers = false;
  }

  /**
   * Returns restricted user ids instead of user modulars when false
   */
  public boolean isIncludeRestrictedUserModulars() {
    return this.includeRestrictedUserModulars;
  }

  /**
   * Returns restricted user ids instead of user modulars when false
   */
  public JobRoleSelectOpts setIncludeRestrictedUserModulars(boolean includeRestrictedUserModulars) {
    this.includeRestrictedUserModulars = includeRestrictedUserModulars;
    setIncludeRestrictedUserModularsIsSet(true);
    return this;
  }

  public void unsetIncludeRestrictedUserModulars() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCLUDERESTRICTEDUSERMODULARS_ISSET_ID);
  }

  /** Returns true if field includeRestrictedUserModulars is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeRestrictedUserModulars() {
    return EncodingUtils.testBit(__isset_bitfield, __INCLUDERESTRICTEDUSERMODULARS_ISSET_ID);
  }

  public void setIncludeRestrictedUserModularsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCLUDERESTRICTEDUSERMODULARS_ISSET_ID, value);
  }

  /**
   * Returns roles for all users instead of just current user's
   * Only valid for <code>getAllAssignedRoles</code>,
   * and is ignored if user is not a team admin
   */
  public boolean isAllUsers() {
    return this.allUsers;
  }

  /**
   * Returns roles for all users instead of just current user's
   * Only valid for <code>getAllAssignedRoles</code>,
   * and is ignored if user is not a team admin
   */
  public JobRoleSelectOpts setAllUsers(boolean allUsers) {
    this.allUsers = allUsers;
    setAllUsersIsSet(true);
    return this;
  }

  public void unsetAllUsers() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ALLUSERS_ISSET_ID);
  }

  /** Returns true if field allUsers is set (has been assigned a value) and false otherwise */
  public boolean isSetAllUsers() {
    return EncodingUtils.testBit(__isset_bitfield, __ALLUSERS_ISSET_ID);
  }

  public void setAllUsersIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ALLUSERS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INCLUDE_RESTRICTED_USER_MODULARS:
      if (value == null) {
        unsetIncludeRestrictedUserModulars();
      } else {
        setIncludeRestrictedUserModulars((Boolean)value);
      }
      break;

    case ALL_USERS:
      if (value == null) {
        unsetAllUsers();
      } else {
        setAllUsers((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INCLUDE_RESTRICTED_USER_MODULARS:
      return isIncludeRestrictedUserModulars();

    case ALL_USERS:
      return isAllUsers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INCLUDE_RESTRICTED_USER_MODULARS:
      return isSetIncludeRestrictedUserModulars();
    case ALL_USERS:
      return isSetAllUsers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobRoleSelectOpts)
      return this.equals((JobRoleSelectOpts)that);
    return false;
  }

  public boolean equals(JobRoleSelectOpts that) {
    if (that == null)
      return false;

    boolean this_present_includeRestrictedUserModulars = true;
    boolean that_present_includeRestrictedUserModulars = true;
    if (this_present_includeRestrictedUserModulars || that_present_includeRestrictedUserModulars) {
      if (!(this_present_includeRestrictedUserModulars && that_present_includeRestrictedUserModulars))
        return false;
      if (this.includeRestrictedUserModulars != that.includeRestrictedUserModulars)
        return false;
    }

    boolean this_present_allUsers = true;
    boolean that_present_allUsers = true;
    if (this_present_allUsers || that_present_allUsers) {
      if (!(this_present_allUsers && that_present_allUsers))
        return false;
      if (this.allUsers != that.allUsers)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_includeRestrictedUserModulars = true;
    list.add(present_includeRestrictedUserModulars);
    if (present_includeRestrictedUserModulars)
      list.add(includeRestrictedUserModulars);

    boolean present_allUsers = true;
    list.add(present_allUsers);
    if (present_allUsers)
      list.add(allUsers);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobRoleSelectOpts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIncludeRestrictedUserModulars()).compareTo(other.isSetIncludeRestrictedUserModulars());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeRestrictedUserModulars()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeRestrictedUserModulars, other.includeRestrictedUserModulars);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAllUsers()).compareTo(other.isSetAllUsers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllUsers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allUsers, other.allUsers);
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
    StringBuilder sb = new StringBuilder("JobRoleSelectOpts(");
    boolean first = true;

    sb.append("includeRestrictedUserModulars:");
    sb.append(this.includeRestrictedUserModulars);
    first = false;
    if (!first) sb.append(", ");
    sb.append("allUsers:");
    sb.append(this.allUsers);
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

  private static class JobRoleSelectOptsStandardSchemeFactory implements SchemeFactory {
    public JobRoleSelectOptsStandardScheme getScheme() {
      return new JobRoleSelectOptsStandardScheme();
    }
  }

  private static class JobRoleSelectOptsStandardScheme extends StandardScheme<JobRoleSelectOpts> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobRoleSelectOpts struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INCLUDE_RESTRICTED_USER_MODULARS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.includeRestrictedUserModulars = iprot.readBool();
              struct.setIncludeRestrictedUserModularsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALL_USERS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.allUsers = iprot.readBool();
              struct.setAllUsersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobRoleSelectOpts struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INCLUDE_RESTRICTED_USER_MODULARS_FIELD_DESC);
      oprot.writeBool(struct.includeRestrictedUserModulars);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ALL_USERS_FIELD_DESC);
      oprot.writeBool(struct.allUsers);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

