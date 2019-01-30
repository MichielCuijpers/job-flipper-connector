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
public class AllRolesResult implements org.apache.thrift.TBase<AllRolesResult, AllRolesResult._Fields>, java.io.Serializable, Cloneable, Comparable<AllRolesResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AllRolesResult");

  private static final org.apache.thrift.protocol.TField USER_ROLE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("userRoleIds", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField ID_ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField("idRoles", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AllRolesResultStandardSchemeFactory());
  }

  /**
   * User id to role id list, all this user's assigned roles on the team
   */
  public Map<String,List<String>> userRoleIds; // required
  /**
   * All the job roles contained in the above map, indexed by job role id
   */
  public Map<String,JobRole> idRoles; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * User id to role id list, all this user's assigned roles on the team
     */
    USER_ROLE_IDS((short)1, "userRoleIds"),
    /**
     * All the job roles contained in the above map, indexed by job role id
     */
    ID_ROLES((short)2, "idRoles");

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
        case 1: // USER_ROLE_IDS
          return USER_ROLE_IDS;
        case 2: // ID_ROLES
          return ID_ROLES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ROLE_IDS, new org.apache.thrift.meta_data.FieldMetaData("userRoleIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.ID_ROLES, new org.apache.thrift.meta_data.FieldMetaData("idRoles", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobRole.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AllRolesResult.class, metaDataMap);
  }

  public AllRolesResult() {
  }

  public AllRolesResult(
    Map<String,List<String>> userRoleIds,
    Map<String,JobRole> idRoles)
  {
    this();
    this.userRoleIds = userRoleIds;
    this.idRoles = idRoles;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AllRolesResult(AllRolesResult other) {
    if (other.isSetUserRoleIds()) {
      Map<String,List<String>> __this__userRoleIds = new HashMap<String,List<String>>(other.userRoleIds.size());
      for (Map.Entry<String, List<String>> other_element : other.userRoleIds.entrySet()) {

        String other_element_key = other_element.getKey();
        List<String> other_element_value = other_element.getValue();

        String __this__userRoleIds_copy_key = other_element_key;

        List<String> __this__userRoleIds_copy_value = new ArrayList<String>(other_element_value);

        __this__userRoleIds.put(__this__userRoleIds_copy_key, __this__userRoleIds_copy_value);
      }
      this.userRoleIds = __this__userRoleIds;
    }
    if (other.isSetIdRoles()) {
      Map<String,JobRole> __this__idRoles = new HashMap<String,JobRole>(other.idRoles.size());
      for (Map.Entry<String, JobRole> other_element : other.idRoles.entrySet()) {

        String other_element_key = other_element.getKey();
        JobRole other_element_value = other_element.getValue();

        String __this__idRoles_copy_key = other_element_key;

        JobRole __this__idRoles_copy_value = new JobRole(other_element_value);

        __this__idRoles.put(__this__idRoles_copy_key, __this__idRoles_copy_value);
      }
      this.idRoles = __this__idRoles;
    }
  }

  public AllRolesResult deepCopy() {
    return new AllRolesResult(this);
  }

  @Override
  public void clear() {
    this.userRoleIds = null;
    this.idRoles = null;
  }

  public int getUserRoleIdsSize() {
    return (this.userRoleIds == null) ? 0 : this.userRoleIds.size();
  }

  public void putToUserRoleIds(String key, List<String> val) {
    if (this.userRoleIds == null) {
      this.userRoleIds = new HashMap<String,List<String>>();
    }
    this.userRoleIds.put(key, val);
  }

  /**
   * User id to role id list, all this user's assigned roles on the team
   */
  public Map<String,List<String>> getUserRoleIds() {
    return this.userRoleIds;
  }

  /**
   * User id to role id list, all this user's assigned roles on the team
   */
  public AllRolesResult setUserRoleIds(Map<String,List<String>> userRoleIds) {
    this.userRoleIds = userRoleIds;
    return this;
  }

  public void unsetUserRoleIds() {
    this.userRoleIds = null;
  }

  /** Returns true if field userRoleIds is set (has been assigned a value) and false otherwise */
  public boolean isSetUserRoleIds() {
    return this.userRoleIds != null;
  }

  public void setUserRoleIdsIsSet(boolean value) {
    if (!value) {
      this.userRoleIds = null;
    }
  }

  public int getIdRolesSize() {
    return (this.idRoles == null) ? 0 : this.idRoles.size();
  }

  public void putToIdRoles(String key, JobRole val) {
    if (this.idRoles == null) {
      this.idRoles = new HashMap<String,JobRole>();
    }
    this.idRoles.put(key, val);
  }

  /**
   * All the job roles contained in the above map, indexed by job role id
   */
  public Map<String,JobRole> getIdRoles() {
    return this.idRoles;
  }

  /**
   * All the job roles contained in the above map, indexed by job role id
   */
  public AllRolesResult setIdRoles(Map<String,JobRole> idRoles) {
    this.idRoles = idRoles;
    return this;
  }

  public void unsetIdRoles() {
    this.idRoles = null;
  }

  /** Returns true if field idRoles is set (has been assigned a value) and false otherwise */
  public boolean isSetIdRoles() {
    return this.idRoles != null;
  }

  public void setIdRolesIsSet(boolean value) {
    if (!value) {
      this.idRoles = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ROLE_IDS:
      if (value == null) {
        unsetUserRoleIds();
      } else {
        setUserRoleIds((Map<String,List<String>>)value);
      }
      break;

    case ID_ROLES:
      if (value == null) {
        unsetIdRoles();
      } else {
        setIdRoles((Map<String,JobRole>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ROLE_IDS:
      return getUserRoleIds();

    case ID_ROLES:
      return getIdRoles();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ROLE_IDS:
      return isSetUserRoleIds();
    case ID_ROLES:
      return isSetIdRoles();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AllRolesResult)
      return this.equals((AllRolesResult)that);
    return false;
  }

  public boolean equals(AllRolesResult that) {
    if (that == null)
      return false;

    boolean this_present_userRoleIds = true && this.isSetUserRoleIds();
    boolean that_present_userRoleIds = true && that.isSetUserRoleIds();
    if (this_present_userRoleIds || that_present_userRoleIds) {
      if (!(this_present_userRoleIds && that_present_userRoleIds))
        return false;
      if (!this.userRoleIds.equals(that.userRoleIds))
        return false;
    }

    boolean this_present_idRoles = true && this.isSetIdRoles();
    boolean that_present_idRoles = true && that.isSetIdRoles();
    if (this_present_idRoles || that_present_idRoles) {
      if (!(this_present_idRoles && that_present_idRoles))
        return false;
      if (!this.idRoles.equals(that.idRoles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userRoleIds = true && (isSetUserRoleIds());
    list.add(present_userRoleIds);
    if (present_userRoleIds)
      list.add(userRoleIds);

    boolean present_idRoles = true && (isSetIdRoles());
    list.add(present_idRoles);
    if (present_idRoles)
      list.add(idRoles);

    return list.hashCode();
  }

  @Override
  public int compareTo(AllRolesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserRoleIds()).compareTo(other.isSetUserRoleIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserRoleIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userRoleIds, other.userRoleIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdRoles()).compareTo(other.isSetIdRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdRoles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idRoles, other.idRoles);
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
    StringBuilder sb = new StringBuilder("AllRolesResult(");
    boolean first = true;

    sb.append("userRoleIds:");
    if (this.userRoleIds == null) {
      sb.append("null");
    } else {
      sb.append(this.userRoleIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("idRoles:");
    if (this.idRoles == null) {
      sb.append("null");
    } else {
      sb.append(this.idRoles);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AllRolesResultStandardSchemeFactory implements SchemeFactory {
    public AllRolesResultStandardScheme getScheme() {
      return new AllRolesResultStandardScheme();
    }
  }

  private static class AllRolesResultStandardScheme extends StandardScheme<AllRolesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AllRolesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ROLE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map12 = iprot.readMapBegin();
                struct.userRoleIds = new HashMap<String,List<String>>(2*_map12.size);
                String _key13;
                List<String> _val14;
                for (int _i15 = 0; _i15 < _map12.size; ++_i15)
                {
                  _key13 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                    _val14 = new ArrayList<String>(_list16.size);
                    String _elem17;
                    for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                    {
                      _elem17 = iprot.readString();
                      _val14.add(_elem17);
                    }
                    iprot.readListEnd();
                  }
                  struct.userRoleIds.put(_key13, _val14);
                }
                iprot.readMapEnd();
              }
              struct.setUserRoleIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID_ROLES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map19 = iprot.readMapBegin();
                struct.idRoles = new HashMap<String,JobRole>(2*_map19.size);
                String _key20;
                JobRole _val21;
                for (int _i22 = 0; _i22 < _map19.size; ++_i22)
                {
                  _key20 = iprot.readString();
                  _val21 = new JobRole();
                  _val21.read(iprot);
                  struct.idRoles.put(_key20, _val21);
                }
                iprot.readMapEnd();
              }
              struct.setIdRolesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AllRolesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userRoleIds != null) {
        oprot.writeFieldBegin(USER_ROLE_IDS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.userRoleIds.size()));
          for (Map.Entry<String, List<String>> _iter23 : struct.userRoleIds.entrySet())
          {
            oprot.writeString(_iter23.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter23.getValue().size()));
              for (String _iter24 : _iter23.getValue())
              {
                oprot.writeString(_iter24);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.idRoles != null) {
        oprot.writeFieldBegin(ID_ROLES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.idRoles.size()));
          for (Map.Entry<String, JobRole> _iter25 : struct.idRoles.entrySet())
          {
            oprot.writeString(_iter25.getKey());
            _iter25.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
