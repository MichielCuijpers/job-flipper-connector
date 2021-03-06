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
/**
 * Team membership information
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class TeamMembership implements org.apache.thrift.TBase<TeamMembership, TeamMembership._Fields>, java.io.Serializable, Cloneable, Comparable<TeamMembership> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TeamMembership");

  private static final org.apache.thrift.protocol.TField ADDED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("addedAt", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField UPDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAt", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField REMOVED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("removedAt", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField("roles", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TeamMembershipStandardSchemeFactory());
  }

  public long addedAt; // required
  public long updatedAt; // required
  public long removedAt; // required
  public List<TeamRole> roles; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADDED_AT((short)1, "addedAt"),
    UPDATED_AT((short)2, "updatedAt"),
    REMOVED_AT((short)3, "removedAt"),
    ROLES((short)4, "roles");

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
        case 1: // ADDED_AT
          return ADDED_AT;
        case 2: // UPDATED_AT
          return UPDATED_AT;
        case 3: // REMOVED_AT
          return REMOVED_AT;
        case 4: // ROLES
          return ROLES;
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
  private static final int __ADDEDAT_ISSET_ID = 0;
  private static final int __UPDATEDAT_ISSET_ID = 1;
  private static final int __REMOVEDAT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADDED_AT, new org.apache.thrift.meta_data.FieldMetaData("addedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("updatedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REMOVED_AT, new org.apache.thrift.meta_data.FieldMetaData("removedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ROLES, new org.apache.thrift.meta_data.FieldMetaData("roles", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TeamRole.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TeamMembership.class, metaDataMap);
  }

  public TeamMembership() {
  }

  public TeamMembership(
    long addedAt,
    long updatedAt,
    long removedAt,
    List<TeamRole> roles)
  {
    this();
    this.addedAt = addedAt;
    setAddedAtIsSet(true);
    this.updatedAt = updatedAt;
    setUpdatedAtIsSet(true);
    this.removedAt = removedAt;
    setRemovedAtIsSet(true);
    this.roles = roles;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TeamMembership(TeamMembership other) {
    __isset_bitfield = other.__isset_bitfield;
    this.addedAt = other.addedAt;
    this.updatedAt = other.updatedAt;
    this.removedAt = other.removedAt;
    if (other.isSetRoles()) {
      List<TeamRole> __this__roles = new ArrayList<TeamRole>(other.roles.size());
      for (TeamRole other_element : other.roles) {
        __this__roles.add(other_element);
      }
      this.roles = __this__roles;
    }
  }

  public TeamMembership deepCopy() {
    return new TeamMembership(this);
  }

  @Override
  public void clear() {
    setAddedAtIsSet(false);
    this.addedAt = 0;
    setUpdatedAtIsSet(false);
    this.updatedAt = 0;
    setRemovedAtIsSet(false);
    this.removedAt = 0;
    this.roles = null;
  }

  public long getAddedAt() {
    return this.addedAt;
  }

  public TeamMembership setAddedAt(long addedAt) {
    this.addedAt = addedAt;
    setAddedAtIsSet(true);
    return this;
  }

  public void unsetAddedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADDEDAT_ISSET_ID);
  }

  /** Returns true if field addedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetAddedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __ADDEDAT_ISSET_ID);
  }

  public void setAddedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADDEDAT_ISSET_ID, value);
  }

  public long getUpdatedAt() {
    return this.updatedAt;
  }

  public TeamMembership setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
    setUpdatedAtIsSet(true);
    return this;
  }

  public void unsetUpdatedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATEDAT_ISSET_ID);
  }

  /** Returns true if field updatedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATEDAT_ISSET_ID);
  }

  public void setUpdatedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATEDAT_ISSET_ID, value);
  }

  public long getRemovedAt() {
    return this.removedAt;
  }

  public TeamMembership setRemovedAt(long removedAt) {
    this.removedAt = removedAt;
    setRemovedAtIsSet(true);
    return this;
  }

  public void unsetRemovedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REMOVEDAT_ISSET_ID);
  }

  /** Returns true if field removedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetRemovedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __REMOVEDAT_ISSET_ID);
  }

  public void setRemovedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REMOVEDAT_ISSET_ID, value);
  }

  public int getRolesSize() {
    return (this.roles == null) ? 0 : this.roles.size();
  }

  public java.util.Iterator<TeamRole> getRolesIterator() {
    return (this.roles == null) ? null : this.roles.iterator();
  }

  public void addToRoles(TeamRole elem) {
    if (this.roles == null) {
      this.roles = new ArrayList<TeamRole>();
    }
    this.roles.add(elem);
  }

  public List<TeamRole> getRoles() {
    return this.roles;
  }

  public TeamMembership setRoles(List<TeamRole> roles) {
    this.roles = roles;
    return this;
  }

  public void unsetRoles() {
    this.roles = null;
  }

  /** Returns true if field roles is set (has been assigned a value) and false otherwise */
  public boolean isSetRoles() {
    return this.roles != null;
  }

  public void setRolesIsSet(boolean value) {
    if (!value) {
      this.roles = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADDED_AT:
      if (value == null) {
        unsetAddedAt();
      } else {
        setAddedAt((Long)value);
      }
      break;

    case UPDATED_AT:
      if (value == null) {
        unsetUpdatedAt();
      } else {
        setUpdatedAt((Long)value);
      }
      break;

    case REMOVED_AT:
      if (value == null) {
        unsetRemovedAt();
      } else {
        setRemovedAt((Long)value);
      }
      break;

    case ROLES:
      if (value == null) {
        unsetRoles();
      } else {
        setRoles((List<TeamRole>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADDED_AT:
      return getAddedAt();

    case UPDATED_AT:
      return getUpdatedAt();

    case REMOVED_AT:
      return getRemovedAt();

    case ROLES:
      return getRoles();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADDED_AT:
      return isSetAddedAt();
    case UPDATED_AT:
      return isSetUpdatedAt();
    case REMOVED_AT:
      return isSetRemovedAt();
    case ROLES:
      return isSetRoles();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TeamMembership)
      return this.equals((TeamMembership)that);
    return false;
  }

  public boolean equals(TeamMembership that) {
    if (that == null)
      return false;

    boolean this_present_addedAt = true;
    boolean that_present_addedAt = true;
    if (this_present_addedAt || that_present_addedAt) {
      if (!(this_present_addedAt && that_present_addedAt))
        return false;
      if (this.addedAt != that.addedAt)
        return false;
    }

    boolean this_present_updatedAt = true;
    boolean that_present_updatedAt = true;
    if (this_present_updatedAt || that_present_updatedAt) {
      if (!(this_present_updatedAt && that_present_updatedAt))
        return false;
      if (this.updatedAt != that.updatedAt)
        return false;
    }

    boolean this_present_removedAt = true;
    boolean that_present_removedAt = true;
    if (this_present_removedAt || that_present_removedAt) {
      if (!(this_present_removedAt && that_present_removedAt))
        return false;
      if (this.removedAt != that.removedAt)
        return false;
    }

    boolean this_present_roles = true && this.isSetRoles();
    boolean that_present_roles = true && that.isSetRoles();
    if (this_present_roles || that_present_roles) {
      if (!(this_present_roles && that_present_roles))
        return false;
      if (!this.roles.equals(that.roles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_addedAt = true;
    list.add(present_addedAt);
    if (present_addedAt)
      list.add(addedAt);

    boolean present_updatedAt = true;
    list.add(present_updatedAt);
    if (present_updatedAt)
      list.add(updatedAt);

    boolean present_removedAt = true;
    list.add(present_removedAt);
    if (present_removedAt)
      list.add(removedAt);

    boolean present_roles = true && (isSetRoles());
    list.add(present_roles);
    if (present_roles)
      list.add(roles);

    return list.hashCode();
  }

  @Override
  public int compareTo(TeamMembership other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAddedAt()).compareTo(other.isSetAddedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addedAt, other.addedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdatedAt()).compareTo(other.isSetUpdatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedAt, other.updatedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemovedAt()).compareTo(other.isSetRemovedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemovedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.removedAt, other.removedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoles()).compareTo(other.isSetRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roles, other.roles);
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
    StringBuilder sb = new StringBuilder("TeamMembership(");
    boolean first = true;

    sb.append("addedAt:");
    sb.append(this.addedAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedAt:");
    sb.append(this.updatedAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("removedAt:");
    sb.append(this.removedAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("roles:");
    if (this.roles == null) {
      sb.append("null");
    } else {
      sb.append(this.roles);
    }
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

  private static class TeamMembershipStandardSchemeFactory implements SchemeFactory {
    public TeamMembershipStandardScheme getScheme() {
      return new TeamMembershipStandardScheme();
    }
  }

  private static class TeamMembershipStandardScheme extends StandardScheme<TeamMembership> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TeamMembership struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADDED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.addedAt = iprot.readI64();
              struct.setAddedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UPDATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updatedAt = iprot.readI64();
              struct.setUpdatedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REMOVED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.removedAt = iprot.readI64();
              struct.setRemovedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.roles = new ArrayList<TeamRole>(_list0.size);
                TeamRole _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = com.wi.director.thrift.v1.user.TeamRole.findByValue(iprot.readI32());
                  struct.roles.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRolesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TeamMembership struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ADDED_AT_FIELD_DESC);
      oprot.writeI64(struct.addedAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATED_AT_FIELD_DESC);
      oprot.writeI64(struct.updatedAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REMOVED_AT_FIELD_DESC);
      oprot.writeI64(struct.removedAt);
      oprot.writeFieldEnd();
      if (struct.roles != null) {
        oprot.writeFieldBegin(ROLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.roles.size()));
          for (TeamRole _iter3 : struct.roles)
          {
            oprot.writeI32(_iter3.getValue());
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

