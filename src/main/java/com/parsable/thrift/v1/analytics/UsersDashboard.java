/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.analytics;

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
public class UsersDashboard implements org.apache.thrift.TBase<UsersDashboard, UsersDashboard._Fields>, java.io.Serializable, Cloneable, Comparable<UsersDashboard> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UsersDashboard");

  private static final org.apache.thrift.protocol.TField INCLUDE_ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField("includeRoles", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField INCLUDE_ANY_ROLE_FIELD_DESC = new org.apache.thrift.protocol.TField("includeAnyRole", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I32, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UsersDashboardStandardSchemeFactory());
  }

  public List<com.wi.director.thrift.v1.user.TeamRole> includeRoles; // optional
  public boolean includeAnyRole; // required
  /**
   * 
   * @see SummaryColumn
   */
  public SummaryColumn total; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INCLUDE_ROLES((short)1, "includeRoles"),
    INCLUDE_ANY_ROLE((short)2, "includeAnyRole"),
    /**
     * 
     * @see SummaryColumn
     */
    TOTAL((short)10, "total");

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
        case 1: // INCLUDE_ROLES
          return INCLUDE_ROLES;
        case 2: // INCLUDE_ANY_ROLE
          return INCLUDE_ANY_ROLE;
        case 10: // TOTAL
          return TOTAL;
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
  private static final int __INCLUDEANYROLE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INCLUDE_ROLES,_Fields.TOTAL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INCLUDE_ROLES, new org.apache.thrift.meta_data.FieldMetaData("includeRoles", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.wi.director.thrift.v1.user.TeamRole.class))));
    tmpMap.put(_Fields.INCLUDE_ANY_ROLE, new org.apache.thrift.meta_data.FieldMetaData("includeAnyRole", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SummaryColumn.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UsersDashboard.class, metaDataMap);
  }

  public UsersDashboard() {
    this.total = com.parsable.thrift.v1.analytics.SummaryColumn.EXCLUDE;

  }

  public UsersDashboard(
    boolean includeAnyRole)
  {
    this();
    this.includeAnyRole = includeAnyRole;
    setIncludeAnyRoleIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UsersDashboard(UsersDashboard other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIncludeRoles()) {
      List<com.wi.director.thrift.v1.user.TeamRole> __this__includeRoles = new ArrayList<com.wi.director.thrift.v1.user.TeamRole>(other.includeRoles.size());
      for (com.wi.director.thrift.v1.user.TeamRole other_element : other.includeRoles) {
        __this__includeRoles.add(other_element);
      }
      this.includeRoles = __this__includeRoles;
    }
    this.includeAnyRole = other.includeAnyRole;
    if (other.isSetTotal()) {
      this.total = other.total;
    }
  }

  public UsersDashboard deepCopy() {
    return new UsersDashboard(this);
  }

  @Override
  public void clear() {
    this.includeRoles = null;
    setIncludeAnyRoleIsSet(false);
    this.includeAnyRole = false;
    this.total = com.parsable.thrift.v1.analytics.SummaryColumn.EXCLUDE;

  }

  public int getIncludeRolesSize() {
    return (this.includeRoles == null) ? 0 : this.includeRoles.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.user.TeamRole> getIncludeRolesIterator() {
    return (this.includeRoles == null) ? null : this.includeRoles.iterator();
  }

  public void addToIncludeRoles(com.wi.director.thrift.v1.user.TeamRole elem) {
    if (this.includeRoles == null) {
      this.includeRoles = new ArrayList<com.wi.director.thrift.v1.user.TeamRole>();
    }
    this.includeRoles.add(elem);
  }

  public List<com.wi.director.thrift.v1.user.TeamRole> getIncludeRoles() {
    return this.includeRoles;
  }

  public UsersDashboard setIncludeRoles(List<com.wi.director.thrift.v1.user.TeamRole> includeRoles) {
    this.includeRoles = includeRoles;
    return this;
  }

  public void unsetIncludeRoles() {
    this.includeRoles = null;
  }

  /** Returns true if field includeRoles is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeRoles() {
    return this.includeRoles != null;
  }

  public void setIncludeRolesIsSet(boolean value) {
    if (!value) {
      this.includeRoles = null;
    }
  }

  public boolean isIncludeAnyRole() {
    return this.includeAnyRole;
  }

  public UsersDashboard setIncludeAnyRole(boolean includeAnyRole) {
    this.includeAnyRole = includeAnyRole;
    setIncludeAnyRoleIsSet(true);
    return this;
  }

  public void unsetIncludeAnyRole() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCLUDEANYROLE_ISSET_ID);
  }

  /** Returns true if field includeAnyRole is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeAnyRole() {
    return EncodingUtils.testBit(__isset_bitfield, __INCLUDEANYROLE_ISSET_ID);
  }

  public void setIncludeAnyRoleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCLUDEANYROLE_ISSET_ID, value);
  }

  /**
   * 
   * @see SummaryColumn
   */
  public SummaryColumn getTotal() {
    return this.total;
  }

  /**
   * 
   * @see SummaryColumn
   */
  public UsersDashboard setTotal(SummaryColumn total) {
    this.total = total;
    return this;
  }

  public void unsetTotal() {
    this.total = null;
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return this.total != null;
  }

  public void setTotalIsSet(boolean value) {
    if (!value) {
      this.total = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INCLUDE_ROLES:
      if (value == null) {
        unsetIncludeRoles();
      } else {
        setIncludeRoles((List<com.wi.director.thrift.v1.user.TeamRole>)value);
      }
      break;

    case INCLUDE_ANY_ROLE:
      if (value == null) {
        unsetIncludeAnyRole();
      } else {
        setIncludeAnyRole((Boolean)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((SummaryColumn)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INCLUDE_ROLES:
      return getIncludeRoles();

    case INCLUDE_ANY_ROLE:
      return isIncludeAnyRole();

    case TOTAL:
      return getTotal();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INCLUDE_ROLES:
      return isSetIncludeRoles();
    case INCLUDE_ANY_ROLE:
      return isSetIncludeAnyRole();
    case TOTAL:
      return isSetTotal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UsersDashboard)
      return this.equals((UsersDashboard)that);
    return false;
  }

  public boolean equals(UsersDashboard that) {
    if (that == null)
      return false;

    boolean this_present_includeRoles = true && this.isSetIncludeRoles();
    boolean that_present_includeRoles = true && that.isSetIncludeRoles();
    if (this_present_includeRoles || that_present_includeRoles) {
      if (!(this_present_includeRoles && that_present_includeRoles))
        return false;
      if (!this.includeRoles.equals(that.includeRoles))
        return false;
    }

    boolean this_present_includeAnyRole = true;
    boolean that_present_includeAnyRole = true;
    if (this_present_includeAnyRole || that_present_includeAnyRole) {
      if (!(this_present_includeAnyRole && that_present_includeAnyRole))
        return false;
      if (this.includeAnyRole != that.includeAnyRole)
        return false;
    }

    boolean this_present_total = true && this.isSetTotal();
    boolean that_present_total = true && that.isSetTotal();
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (!this.total.equals(that.total))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_includeRoles = true && (isSetIncludeRoles());
    list.add(present_includeRoles);
    if (present_includeRoles)
      list.add(includeRoles);

    boolean present_includeAnyRole = true;
    list.add(present_includeAnyRole);
    if (present_includeAnyRole)
      list.add(includeAnyRole);

    boolean present_total = true && (isSetTotal());
    list.add(present_total);
    if (present_total)
      list.add(total.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(UsersDashboard other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIncludeRoles()).compareTo(other.isSetIncludeRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeRoles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeRoles, other.includeRoles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeAnyRole()).compareTo(other.isSetIncludeAnyRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeAnyRole()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeAnyRole, other.includeAnyRole);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(other.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, other.total);
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
    StringBuilder sb = new StringBuilder("UsersDashboard(");
    boolean first = true;

    if (isSetIncludeRoles()) {
      sb.append("includeRoles:");
      if (this.includeRoles == null) {
        sb.append("null");
      } else {
        sb.append(this.includeRoles);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("includeAnyRole:");
    sb.append(this.includeAnyRole);
    first = false;
    if (isSetTotal()) {
      if (!first) sb.append(", ");
      sb.append("total:");
      if (this.total == null) {
        sb.append("null");
      } else {
        sb.append(this.total);
      }
      first = false;
    }
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

  private static class UsersDashboardStandardSchemeFactory implements SchemeFactory {
    public UsersDashboardStandardScheme getScheme() {
      return new UsersDashboardStandardScheme();
    }
  }

  private static class UsersDashboardStandardScheme extends StandardScheme<UsersDashboard> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UsersDashboard struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INCLUDE_ROLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
                struct.includeRoles = new ArrayList<com.wi.director.thrift.v1.user.TeamRole>(_list12.size);
                com.wi.director.thrift.v1.user.TeamRole _elem13;
                for (int _i14 = 0; _i14 < _list12.size; ++_i14)
                {
                  _elem13 = com.wi.director.thrift.v1.user.TeamRole.findByValue(iprot.readI32());
                  struct.includeRoles.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setIncludeRolesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INCLUDE_ANY_ROLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.includeAnyRole = iprot.readBool();
              struct.setIncludeAnyRoleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total = com.parsable.thrift.v1.analytics.SummaryColumn.findByValue(iprot.readI32());
              struct.setTotalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UsersDashboard struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.includeRoles != null) {
        if (struct.isSetIncludeRoles()) {
          oprot.writeFieldBegin(INCLUDE_ROLES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.includeRoles.size()));
            for (com.wi.director.thrift.v1.user.TeamRole _iter15 : struct.includeRoles)
            {
              oprot.writeI32(_iter15.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(INCLUDE_ANY_ROLE_FIELD_DESC);
      oprot.writeBool(struct.includeAnyRole);
      oprot.writeFieldEnd();
      if (struct.total != null) {
        if (struct.isSetTotal()) {
          oprot.writeFieldBegin(TOTAL_FIELD_DESC);
          oprot.writeI32(struct.total.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

