/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.teamrole;

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
public class TeamRoleParams implements org.apache.thrift.TBase<TeamRoleParams, TeamRoleParams._Fields>, java.io.Serializable, Cloneable, Comparable<TeamRoleParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TeamRoleParams");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DESCRIP_FIELD_DESC = new org.apache.thrift.protocol.TField("descrip", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PERMISSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("permissions", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TeamRoleParamsStandardSchemeFactory());
  }

  public String name; // optional
  public String descrip; // optional
  public com.wi.director.thrift.v1.setting.SettingsForm permissions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    DESCRIP((short)2, "descrip"),
    PERMISSIONS((short)3, "permissions");

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
        case 1: // NAME
          return NAME;
        case 2: // DESCRIP
          return DESCRIP;
        case 3: // PERMISSIONS
          return PERMISSIONS;
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
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.DESCRIP,_Fields.PERMISSIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIP, new org.apache.thrift.meta_data.FieldMetaData("descrip", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERMISSIONS, new org.apache.thrift.meta_data.FieldMetaData("permissions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.setting.SettingsForm.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TeamRoleParams.class, metaDataMap);
  }

  public TeamRoleParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TeamRoleParams(TeamRoleParams other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDescrip()) {
      this.descrip = other.descrip;
    }
    if (other.isSetPermissions()) {
      this.permissions = new com.wi.director.thrift.v1.setting.SettingsForm(other.permissions);
    }
  }

  public TeamRoleParams deepCopy() {
    return new TeamRoleParams(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.descrip = null;
    this.permissions = null;
  }

  public String getName() {
    return this.name;
  }

  public TeamRoleParams setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDescrip() {
    return this.descrip;
  }

  public TeamRoleParams setDescrip(String descrip) {
    this.descrip = descrip;
    return this;
  }

  public void unsetDescrip() {
    this.descrip = null;
  }

  /** Returns true if field descrip is set (has been assigned a value) and false otherwise */
  public boolean isSetDescrip() {
    return this.descrip != null;
  }

  public void setDescripIsSet(boolean value) {
    if (!value) {
      this.descrip = null;
    }
  }

  public com.wi.director.thrift.v1.setting.SettingsForm getPermissions() {
    return this.permissions;
  }

  public TeamRoleParams setPermissions(com.wi.director.thrift.v1.setting.SettingsForm permissions) {
    this.permissions = permissions;
    return this;
  }

  public void unsetPermissions() {
    this.permissions = null;
  }

  /** Returns true if field permissions is set (has been assigned a value) and false otherwise */
  public boolean isSetPermissions() {
    return this.permissions != null;
  }

  public void setPermissionsIsSet(boolean value) {
    if (!value) {
      this.permissions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DESCRIP:
      if (value == null) {
        unsetDescrip();
      } else {
        setDescrip((String)value);
      }
      break;

    case PERMISSIONS:
      if (value == null) {
        unsetPermissions();
      } else {
        setPermissions((com.wi.director.thrift.v1.setting.SettingsForm)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case DESCRIP:
      return getDescrip();

    case PERMISSIONS:
      return getPermissions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case DESCRIP:
      return isSetDescrip();
    case PERMISSIONS:
      return isSetPermissions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TeamRoleParams)
      return this.equals((TeamRoleParams)that);
    return false;
  }

  public boolean equals(TeamRoleParams that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_descrip = true && this.isSetDescrip();
    boolean that_present_descrip = true && that.isSetDescrip();
    if (this_present_descrip || that_present_descrip) {
      if (!(this_present_descrip && that_present_descrip))
        return false;
      if (!this.descrip.equals(that.descrip))
        return false;
    }

    boolean this_present_permissions = true && this.isSetPermissions();
    boolean that_present_permissions = true && that.isSetPermissions();
    if (this_present_permissions || that_present_permissions) {
      if (!(this_present_permissions && that_present_permissions))
        return false;
      if (!this.permissions.equals(that.permissions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_descrip = true && (isSetDescrip());
    list.add(present_descrip);
    if (present_descrip)
      list.add(descrip);

    boolean present_permissions = true && (isSetPermissions());
    list.add(present_permissions);
    if (present_permissions)
      list.add(permissions);

    return list.hashCode();
  }

  @Override
  public int compareTo(TeamRoleParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescrip()).compareTo(other.isSetDescrip());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescrip()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descrip, other.descrip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPermissions()).compareTo(other.isSetPermissions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermissions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.permissions, other.permissions);
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
    StringBuilder sb = new StringBuilder("TeamRoleParams(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetDescrip()) {
      if (!first) sb.append(", ");
      sb.append("descrip:");
      if (this.descrip == null) {
        sb.append("null");
      } else {
        sb.append(this.descrip);
      }
      first = false;
    }
    if (isSetPermissions()) {
      if (!first) sb.append(", ");
      sb.append("permissions:");
      if (this.permissions == null) {
        sb.append("null");
      } else {
        sb.append(this.permissions);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (permissions != null) {
      permissions.validate();
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

  private static class TeamRoleParamsStandardSchemeFactory implements SchemeFactory {
    public TeamRoleParamsStandardScheme getScheme() {
      return new TeamRoleParamsStandardScheme();
    }
  }

  private static class TeamRoleParamsStandardScheme extends StandardScheme<TeamRoleParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TeamRoleParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCRIP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descrip = iprot.readString();
              struct.setDescripIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PERMISSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.permissions = new com.wi.director.thrift.v1.setting.SettingsForm();
              struct.permissions.read(iprot);
              struct.setPermissionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TeamRoleParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.descrip != null) {
        if (struct.isSetDescrip()) {
          oprot.writeFieldBegin(DESCRIP_FIELD_DESC);
          oprot.writeString(struct.descrip);
          oprot.writeFieldEnd();
        }
      }
      if (struct.permissions != null) {
        if (struct.isSetPermissions()) {
          oprot.writeFieldBegin(PERMISSIONS_FIELD_DESC);
          struct.permissions.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
