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
public class TeamRoleV2 implements org.apache.thrift.TBase<TeamRoleV2, TeamRoleV2._Fields>, java.io.Serializable, Cloneable, Comparable<TeamRoleV2> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TeamRoleV2");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TEAM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("teamId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DESCRIP_FIELD_DESC = new org.apache.thrift.protocol.TField("descrip", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PERMISSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("permissions", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField SYSTEM_ROLE_FIELD_DESC = new org.apache.thrift.protocol.TField("systemRole", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField MUTABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("mutable", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TeamRoleV2StandardSchemeFactory());
  }

  public String id; // required
  public String teamId; // required
  public String name; // required
  public String descrip; // required
  public TeamPermissions permissions; // required
  /**
   * 
   * @see SystemTeamRole
   */
  public SystemTeamRole systemRole; // optional
  public boolean mutable; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TEAM_ID((short)2, "teamId"),
    NAME((short)3, "name"),
    DESCRIP((short)4, "descrip"),
    PERMISSIONS((short)5, "permissions"),
    /**
     * 
     * @see SystemTeamRole
     */
    SYSTEM_ROLE((short)6, "systemRole"),
    MUTABLE((short)7, "mutable");

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
        case 1: // ID
          return ID;
        case 2: // TEAM_ID
          return TEAM_ID;
        case 3: // NAME
          return NAME;
        case 4: // DESCRIP
          return DESCRIP;
        case 5: // PERMISSIONS
          return PERMISSIONS;
        case 6: // SYSTEM_ROLE
          return SYSTEM_ROLE;
        case 7: // MUTABLE
          return MUTABLE;
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
  private static final int __MUTABLE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SYSTEM_ROLE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEAM_ID, new org.apache.thrift.meta_data.FieldMetaData("teamId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIP, new org.apache.thrift.meta_data.FieldMetaData("descrip", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERMISSIONS, new org.apache.thrift.meta_data.FieldMetaData("permissions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TeamPermissions.class)));
    tmpMap.put(_Fields.SYSTEM_ROLE, new org.apache.thrift.meta_data.FieldMetaData("systemRole", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SystemTeamRole.class)));
    tmpMap.put(_Fields.MUTABLE, new org.apache.thrift.meta_data.FieldMetaData("mutable", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TeamRoleV2.class, metaDataMap);
  }

  public TeamRoleV2() {
  }

  public TeamRoleV2(
    String id,
    String teamId,
    String name,
    String descrip,
    TeamPermissions permissions,
    boolean mutable)
  {
    this();
    this.id = id;
    this.teamId = teamId;
    this.name = name;
    this.descrip = descrip;
    this.permissions = permissions;
    this.mutable = mutable;
    setMutableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TeamRoleV2(TeamRoleV2 other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetTeamId()) {
      this.teamId = other.teamId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDescrip()) {
      this.descrip = other.descrip;
    }
    if (other.isSetPermissions()) {
      this.permissions = new TeamPermissions(other.permissions);
    }
    if (other.isSetSystemRole()) {
      this.systemRole = other.systemRole;
    }
    this.mutable = other.mutable;
  }

  public TeamRoleV2 deepCopy() {
    return new TeamRoleV2(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.teamId = null;
    this.name = null;
    this.descrip = null;
    this.permissions = null;
    this.systemRole = null;
    setMutableIsSet(false);
    this.mutable = false;
  }

  public String getId() {
    return this.id;
  }

  public TeamRoleV2 setId(String id) {
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

  public String getTeamId() {
    return this.teamId;
  }

  public TeamRoleV2 setTeamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  public void unsetTeamId() {
    this.teamId = null;
  }

  /** Returns true if field teamId is set (has been assigned a value) and false otherwise */
  public boolean isSetTeamId() {
    return this.teamId != null;
  }

  public void setTeamIdIsSet(boolean value) {
    if (!value) {
      this.teamId = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public TeamRoleV2 setName(String name) {
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

  public TeamRoleV2 setDescrip(String descrip) {
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

  public TeamPermissions getPermissions() {
    return this.permissions;
  }

  public TeamRoleV2 setPermissions(TeamPermissions permissions) {
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

  /**
   * 
   * @see SystemTeamRole
   */
  public SystemTeamRole getSystemRole() {
    return this.systemRole;
  }

  /**
   * 
   * @see SystemTeamRole
   */
  public TeamRoleV2 setSystemRole(SystemTeamRole systemRole) {
    this.systemRole = systemRole;
    return this;
  }

  public void unsetSystemRole() {
    this.systemRole = null;
  }

  /** Returns true if field systemRole is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemRole() {
    return this.systemRole != null;
  }

  public void setSystemRoleIsSet(boolean value) {
    if (!value) {
      this.systemRole = null;
    }
  }

  public boolean isMutable() {
    return this.mutable;
  }

  public TeamRoleV2 setMutable(boolean mutable) {
    this.mutable = mutable;
    setMutableIsSet(true);
    return this;
  }

  public void unsetMutable() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MUTABLE_ISSET_ID);
  }

  /** Returns true if field mutable is set (has been assigned a value) and false otherwise */
  public boolean isSetMutable() {
    return EncodingUtils.testBit(__isset_bitfield, __MUTABLE_ISSET_ID);
  }

  public void setMutableIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MUTABLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case TEAM_ID:
      if (value == null) {
        unsetTeamId();
      } else {
        setTeamId((String)value);
      }
      break;

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
        setPermissions((TeamPermissions)value);
      }
      break;

    case SYSTEM_ROLE:
      if (value == null) {
        unsetSystemRole();
      } else {
        setSystemRole((SystemTeamRole)value);
      }
      break;

    case MUTABLE:
      if (value == null) {
        unsetMutable();
      } else {
        setMutable((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TEAM_ID:
      return getTeamId();

    case NAME:
      return getName();

    case DESCRIP:
      return getDescrip();

    case PERMISSIONS:
      return getPermissions();

    case SYSTEM_ROLE:
      return getSystemRole();

    case MUTABLE:
      return isMutable();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TEAM_ID:
      return isSetTeamId();
    case NAME:
      return isSetName();
    case DESCRIP:
      return isSetDescrip();
    case PERMISSIONS:
      return isSetPermissions();
    case SYSTEM_ROLE:
      return isSetSystemRole();
    case MUTABLE:
      return isSetMutable();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TeamRoleV2)
      return this.equals((TeamRoleV2)that);
    return false;
  }

  public boolean equals(TeamRoleV2 that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_teamId = true && this.isSetTeamId();
    boolean that_present_teamId = true && that.isSetTeamId();
    if (this_present_teamId || that_present_teamId) {
      if (!(this_present_teamId && that_present_teamId))
        return false;
      if (!this.teamId.equals(that.teamId))
        return false;
    }

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

    boolean this_present_systemRole = true && this.isSetSystemRole();
    boolean that_present_systemRole = true && that.isSetSystemRole();
    if (this_present_systemRole || that_present_systemRole) {
      if (!(this_present_systemRole && that_present_systemRole))
        return false;
      if (!this.systemRole.equals(that.systemRole))
        return false;
    }

    boolean this_present_mutable = true;
    boolean that_present_mutable = true;
    if (this_present_mutable || that_present_mutable) {
      if (!(this_present_mutable && that_present_mutable))
        return false;
      if (this.mutable != that.mutable)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_teamId = true && (isSetTeamId());
    list.add(present_teamId);
    if (present_teamId)
      list.add(teamId);

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

    boolean present_systemRole = true && (isSetSystemRole());
    list.add(present_systemRole);
    if (present_systemRole)
      list.add(systemRole.getValue());

    boolean present_mutable = true;
    list.add(present_mutable);
    if (present_mutable)
      list.add(mutable);

    return list.hashCode();
  }

  @Override
  public int compareTo(TeamRoleV2 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetTeamId()).compareTo(other.isSetTeamId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTeamId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.teamId, other.teamId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetSystemRole()).compareTo(other.isSetSystemRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemRole()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.systemRole, other.systemRole);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMutable()).compareTo(other.isSetMutable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMutable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mutable, other.mutable);
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
    StringBuilder sb = new StringBuilder("TeamRoleV2(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("teamId:");
    if (this.teamId == null) {
      sb.append("null");
    } else {
      sb.append(this.teamId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("descrip:");
    if (this.descrip == null) {
      sb.append("null");
    } else {
      sb.append(this.descrip);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("permissions:");
    if (this.permissions == null) {
      sb.append("null");
    } else {
      sb.append(this.permissions);
    }
    first = false;
    if (isSetSystemRole()) {
      if (!first) sb.append(", ");
      sb.append("systemRole:");
      if (this.systemRole == null) {
        sb.append("null");
      } else {
        sb.append(this.systemRole);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("mutable:");
    sb.append(this.mutable);
    first = false;
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TeamRoleV2StandardSchemeFactory implements SchemeFactory {
    public TeamRoleV2StandardScheme getScheme() {
      return new TeamRoleV2StandardScheme();
    }
  }

  private static class TeamRoleV2StandardScheme extends StandardScheme<TeamRoleV2> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TeamRoleV2 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TEAM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.teamId = iprot.readString();
              struct.setTeamIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DESCRIP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descrip = iprot.readString();
              struct.setDescripIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PERMISSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.permissions = new TeamPermissions();
              struct.permissions.read(iprot);
              struct.setPermissionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SYSTEM_ROLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.systemRole = com.wi.director.thrift.v1.teamrole.SystemTeamRole.findByValue(iprot.readI32());
              struct.setSystemRoleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MUTABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.mutable = iprot.readBool();
              struct.setMutableIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TeamRoleV2 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.teamId != null) {
        oprot.writeFieldBegin(TEAM_ID_FIELD_DESC);
        oprot.writeString(struct.teamId);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.descrip != null) {
        oprot.writeFieldBegin(DESCRIP_FIELD_DESC);
        oprot.writeString(struct.descrip);
        oprot.writeFieldEnd();
      }
      if (struct.permissions != null) {
        oprot.writeFieldBegin(PERMISSIONS_FIELD_DESC);
        struct.permissions.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.systemRole != null) {
        if (struct.isSetSystemRole()) {
          oprot.writeFieldBegin(SYSTEM_ROLE_FIELD_DESC);
          oprot.writeI32(struct.systemRole.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(MUTABLE_FIELD_DESC);
      oprot.writeBool(struct.mutable);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
