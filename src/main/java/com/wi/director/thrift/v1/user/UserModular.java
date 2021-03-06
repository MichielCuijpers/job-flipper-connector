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
 * Information about a user, modular
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class UserModular implements org.apache.thrift.TBase<UserModular, UserModular._Fields>, java.io.Serializable, Cloneable, Comparable<UserModular> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserModular");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VALIDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("validatedAt", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField TEAM_ID_TO_MEMBERSHIP_FIELD_DESC = new org.apache.thrift.protocol.TField("teamIdToMembership", org.apache.thrift.protocol.TType.MAP, (short)101);
  private static final org.apache.thrift.protocol.TField TEAM_ID_TO_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("teamIdToStats", org.apache.thrift.protocol.TType.MAP, (short)102);
  private static final org.apache.thrift.protocol.TField TEAM_ID_TO_ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("teamIdToAttributes", org.apache.thrift.protocol.TType.MAP, (short)103);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserModularStandardSchemeFactory());
  }

  public String id; // required
  public String email; // required
  public String name; // required
  public long validatedAt; // required
  public Map<String,TeamMembership> teamIdToMembership; // optional
  public Map<String,UserStats> teamIdToStats; // optional
  public Map<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>> teamIdToAttributes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    EMAIL((short)2, "email"),
    NAME((short)3, "name"),
    VALIDATED_AT((short)4, "validatedAt"),
    TEAM_ID_TO_MEMBERSHIP((short)101, "teamIdToMembership"),
    TEAM_ID_TO_STATS((short)102, "teamIdToStats"),
    TEAM_ID_TO_ATTRIBUTES((short)103, "teamIdToAttributes");

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
        case 2: // EMAIL
          return EMAIL;
        case 3: // NAME
          return NAME;
        case 4: // VALIDATED_AT
          return VALIDATED_AT;
        case 101: // TEAM_ID_TO_MEMBERSHIP
          return TEAM_ID_TO_MEMBERSHIP;
        case 102: // TEAM_ID_TO_STATS
          return TEAM_ID_TO_STATS;
        case 103: // TEAM_ID_TO_ATTRIBUTES
          return TEAM_ID_TO_ATTRIBUTES;
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
  private static final int __VALIDATEDAT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TEAM_ID_TO_MEMBERSHIP,_Fields.TEAM_ID_TO_STATS,_Fields.TEAM_ID_TO_ATTRIBUTES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALIDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("validatedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TEAM_ID_TO_MEMBERSHIP, new org.apache.thrift.meta_data.FieldMetaData("teamIdToMembership", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TeamMembership.class))));
    tmpMap.put(_Fields.TEAM_ID_TO_STATS, new org.apache.thrift.meta_data.FieldMetaData("teamIdToStats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserStats.class))));
    tmpMap.put(_Fields.TEAM_ID_TO_ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("teamIdToAttributes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.abac.AbacAttribute.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserModular.class, metaDataMap);
  }

  public UserModular() {
  }

  public UserModular(
    String id,
    String email,
    String name,
    long validatedAt)
  {
    this();
    this.id = id;
    this.email = email;
    this.name = name;
    this.validatedAt = validatedAt;
    setValidatedAtIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserModular(UserModular other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.validatedAt = other.validatedAt;
    if (other.isSetTeamIdToMembership()) {
      Map<String,TeamMembership> __this__teamIdToMembership = new HashMap<String,TeamMembership>(other.teamIdToMembership.size());
      for (Map.Entry<String, TeamMembership> other_element : other.teamIdToMembership.entrySet()) {

        String other_element_key = other_element.getKey();
        TeamMembership other_element_value = other_element.getValue();

        String __this__teamIdToMembership_copy_key = other_element_key;

        TeamMembership __this__teamIdToMembership_copy_value = new TeamMembership(other_element_value);

        __this__teamIdToMembership.put(__this__teamIdToMembership_copy_key, __this__teamIdToMembership_copy_value);
      }
      this.teamIdToMembership = __this__teamIdToMembership;
    }
    if (other.isSetTeamIdToStats()) {
      Map<String,UserStats> __this__teamIdToStats = new HashMap<String,UserStats>(other.teamIdToStats.size());
      for (Map.Entry<String, UserStats> other_element : other.teamIdToStats.entrySet()) {

        String other_element_key = other_element.getKey();
        UserStats other_element_value = other_element.getValue();

        String __this__teamIdToStats_copy_key = other_element_key;

        UserStats __this__teamIdToStats_copy_value = new UserStats(other_element_value);

        __this__teamIdToStats.put(__this__teamIdToStats_copy_key, __this__teamIdToStats_copy_value);
      }
      this.teamIdToStats = __this__teamIdToStats;
    }
    if (other.isSetTeamIdToAttributes()) {
      Map<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>> __this__teamIdToAttributes = new HashMap<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>>(other.teamIdToAttributes.size());
      for (Map.Entry<String, List<com.wi.director.thrift.v1.abac.AbacAttribute>> other_element : other.teamIdToAttributes.entrySet()) {

        String other_element_key = other_element.getKey();
        List<com.wi.director.thrift.v1.abac.AbacAttribute> other_element_value = other_element.getValue();

        String __this__teamIdToAttributes_copy_key = other_element_key;

        List<com.wi.director.thrift.v1.abac.AbacAttribute> __this__teamIdToAttributes_copy_value = new ArrayList<com.wi.director.thrift.v1.abac.AbacAttribute>(other_element_value.size());
        for (com.wi.director.thrift.v1.abac.AbacAttribute other_element_value_element : other_element_value) {
          __this__teamIdToAttributes_copy_value.add(new com.wi.director.thrift.v1.abac.AbacAttribute(other_element_value_element));
        }

        __this__teamIdToAttributes.put(__this__teamIdToAttributes_copy_key, __this__teamIdToAttributes_copy_value);
      }
      this.teamIdToAttributes = __this__teamIdToAttributes;
    }
  }

  public UserModular deepCopy() {
    return new UserModular(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.email = null;
    this.name = null;
    setValidatedAtIsSet(false);
    this.validatedAt = 0;
    this.teamIdToMembership = null;
    this.teamIdToStats = null;
    this.teamIdToAttributes = null;
  }

  public String getId() {
    return this.id;
  }

  public UserModular setId(String id) {
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

  public String getEmail() {
    return this.email;
  }

  public UserModular setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public UserModular setName(String name) {
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

  public long getValidatedAt() {
    return this.validatedAt;
  }

  public UserModular setValidatedAt(long validatedAt) {
    this.validatedAt = validatedAt;
    setValidatedAtIsSet(true);
    return this;
  }

  public void unsetValidatedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALIDATEDAT_ISSET_ID);
  }

  /** Returns true if field validatedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetValidatedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __VALIDATEDAT_ISSET_ID);
  }

  public void setValidatedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALIDATEDAT_ISSET_ID, value);
  }

  public int getTeamIdToMembershipSize() {
    return (this.teamIdToMembership == null) ? 0 : this.teamIdToMembership.size();
  }

  public void putToTeamIdToMembership(String key, TeamMembership val) {
    if (this.teamIdToMembership == null) {
      this.teamIdToMembership = new HashMap<String,TeamMembership>();
    }
    this.teamIdToMembership.put(key, val);
  }

  public Map<String,TeamMembership> getTeamIdToMembership() {
    return this.teamIdToMembership;
  }

  public UserModular setTeamIdToMembership(Map<String,TeamMembership> teamIdToMembership) {
    this.teamIdToMembership = teamIdToMembership;
    return this;
  }

  public void unsetTeamIdToMembership() {
    this.teamIdToMembership = null;
  }

  /** Returns true if field teamIdToMembership is set (has been assigned a value) and false otherwise */
  public boolean isSetTeamIdToMembership() {
    return this.teamIdToMembership != null;
  }

  public void setTeamIdToMembershipIsSet(boolean value) {
    if (!value) {
      this.teamIdToMembership = null;
    }
  }

  public int getTeamIdToStatsSize() {
    return (this.teamIdToStats == null) ? 0 : this.teamIdToStats.size();
  }

  public void putToTeamIdToStats(String key, UserStats val) {
    if (this.teamIdToStats == null) {
      this.teamIdToStats = new HashMap<String,UserStats>();
    }
    this.teamIdToStats.put(key, val);
  }

  public Map<String,UserStats> getTeamIdToStats() {
    return this.teamIdToStats;
  }

  public UserModular setTeamIdToStats(Map<String,UserStats> teamIdToStats) {
    this.teamIdToStats = teamIdToStats;
    return this;
  }

  public void unsetTeamIdToStats() {
    this.teamIdToStats = null;
  }

  /** Returns true if field teamIdToStats is set (has been assigned a value) and false otherwise */
  public boolean isSetTeamIdToStats() {
    return this.teamIdToStats != null;
  }

  public void setTeamIdToStatsIsSet(boolean value) {
    if (!value) {
      this.teamIdToStats = null;
    }
  }

  public int getTeamIdToAttributesSize() {
    return (this.teamIdToAttributes == null) ? 0 : this.teamIdToAttributes.size();
  }

  public void putToTeamIdToAttributes(String key, List<com.wi.director.thrift.v1.abac.AbacAttribute> val) {
    if (this.teamIdToAttributes == null) {
      this.teamIdToAttributes = new HashMap<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>>();
    }
    this.teamIdToAttributes.put(key, val);
  }

  public Map<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>> getTeamIdToAttributes() {
    return this.teamIdToAttributes;
  }

  public UserModular setTeamIdToAttributes(Map<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>> teamIdToAttributes) {
    this.teamIdToAttributes = teamIdToAttributes;
    return this;
  }

  public void unsetTeamIdToAttributes() {
    this.teamIdToAttributes = null;
  }

  /** Returns true if field teamIdToAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetTeamIdToAttributes() {
    return this.teamIdToAttributes != null;
  }

  public void setTeamIdToAttributesIsSet(boolean value) {
    if (!value) {
      this.teamIdToAttributes = null;
    }
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

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case VALIDATED_AT:
      if (value == null) {
        unsetValidatedAt();
      } else {
        setValidatedAt((Long)value);
      }
      break;

    case TEAM_ID_TO_MEMBERSHIP:
      if (value == null) {
        unsetTeamIdToMembership();
      } else {
        setTeamIdToMembership((Map<String,TeamMembership>)value);
      }
      break;

    case TEAM_ID_TO_STATS:
      if (value == null) {
        unsetTeamIdToStats();
      } else {
        setTeamIdToStats((Map<String,UserStats>)value);
      }
      break;

    case TEAM_ID_TO_ATTRIBUTES:
      if (value == null) {
        unsetTeamIdToAttributes();
      } else {
        setTeamIdToAttributes((Map<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case EMAIL:
      return getEmail();

    case NAME:
      return getName();

    case VALIDATED_AT:
      return getValidatedAt();

    case TEAM_ID_TO_MEMBERSHIP:
      return getTeamIdToMembership();

    case TEAM_ID_TO_STATS:
      return getTeamIdToStats();

    case TEAM_ID_TO_ATTRIBUTES:
      return getTeamIdToAttributes();

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
    case EMAIL:
      return isSetEmail();
    case NAME:
      return isSetName();
    case VALIDATED_AT:
      return isSetValidatedAt();
    case TEAM_ID_TO_MEMBERSHIP:
      return isSetTeamIdToMembership();
    case TEAM_ID_TO_STATS:
      return isSetTeamIdToStats();
    case TEAM_ID_TO_ATTRIBUTES:
      return isSetTeamIdToAttributes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserModular)
      return this.equals((UserModular)that);
    return false;
  }

  public boolean equals(UserModular that) {
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

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
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

    boolean this_present_validatedAt = true;
    boolean that_present_validatedAt = true;
    if (this_present_validatedAt || that_present_validatedAt) {
      if (!(this_present_validatedAt && that_present_validatedAt))
        return false;
      if (this.validatedAt != that.validatedAt)
        return false;
    }

    boolean this_present_teamIdToMembership = true && this.isSetTeamIdToMembership();
    boolean that_present_teamIdToMembership = true && that.isSetTeamIdToMembership();
    if (this_present_teamIdToMembership || that_present_teamIdToMembership) {
      if (!(this_present_teamIdToMembership && that_present_teamIdToMembership))
        return false;
      if (!this.teamIdToMembership.equals(that.teamIdToMembership))
        return false;
    }

    boolean this_present_teamIdToStats = true && this.isSetTeamIdToStats();
    boolean that_present_teamIdToStats = true && that.isSetTeamIdToStats();
    if (this_present_teamIdToStats || that_present_teamIdToStats) {
      if (!(this_present_teamIdToStats && that_present_teamIdToStats))
        return false;
      if (!this.teamIdToStats.equals(that.teamIdToStats))
        return false;
    }

    boolean this_present_teamIdToAttributes = true && this.isSetTeamIdToAttributes();
    boolean that_present_teamIdToAttributes = true && that.isSetTeamIdToAttributes();
    if (this_present_teamIdToAttributes || that_present_teamIdToAttributes) {
      if (!(this_present_teamIdToAttributes && that_present_teamIdToAttributes))
        return false;
      if (!this.teamIdToAttributes.equals(that.teamIdToAttributes))
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

    boolean present_email = true && (isSetEmail());
    list.add(present_email);
    if (present_email)
      list.add(email);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_validatedAt = true;
    list.add(present_validatedAt);
    if (present_validatedAt)
      list.add(validatedAt);

    boolean present_teamIdToMembership = true && (isSetTeamIdToMembership());
    list.add(present_teamIdToMembership);
    if (present_teamIdToMembership)
      list.add(teamIdToMembership);

    boolean present_teamIdToStats = true && (isSetTeamIdToStats());
    list.add(present_teamIdToStats);
    if (present_teamIdToStats)
      list.add(teamIdToStats);

    boolean present_teamIdToAttributes = true && (isSetTeamIdToAttributes());
    list.add(present_teamIdToAttributes);
    if (present_teamIdToAttributes)
      list.add(teamIdToAttributes);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserModular other) {
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
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
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
    lastComparison = Boolean.valueOf(isSetValidatedAt()).compareTo(other.isSetValidatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidatedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validatedAt, other.validatedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTeamIdToMembership()).compareTo(other.isSetTeamIdToMembership());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTeamIdToMembership()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.teamIdToMembership, other.teamIdToMembership);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTeamIdToStats()).compareTo(other.isSetTeamIdToStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTeamIdToStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.teamIdToStats, other.teamIdToStats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTeamIdToAttributes()).compareTo(other.isSetTeamIdToAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTeamIdToAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.teamIdToAttributes, other.teamIdToAttributes);
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
    StringBuilder sb = new StringBuilder("UserModular(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
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
    sb.append("validatedAt:");
    sb.append(this.validatedAt);
    first = false;
    if (isSetTeamIdToMembership()) {
      if (!first) sb.append(", ");
      sb.append("teamIdToMembership:");
      if (this.teamIdToMembership == null) {
        sb.append("null");
      } else {
        sb.append(this.teamIdToMembership);
      }
      first = false;
    }
    if (isSetTeamIdToStats()) {
      if (!first) sb.append(", ");
      sb.append("teamIdToStats:");
      if (this.teamIdToStats == null) {
        sb.append("null");
      } else {
        sb.append(this.teamIdToStats);
      }
      first = false;
    }
    if (isSetTeamIdToAttributes()) {
      if (!first) sb.append(", ");
      sb.append("teamIdToAttributes:");
      if (this.teamIdToAttributes == null) {
        sb.append("null");
      } else {
        sb.append(this.teamIdToAttributes);
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

  private static class UserModularStandardSchemeFactory implements SchemeFactory {
    public UserModularStandardScheme getScheme() {
      return new UserModularStandardScheme();
    }
  }

  private static class UserModularStandardScheme extends StandardScheme<UserModular> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserModular struct) throws org.apache.thrift.TException {
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
          case 2: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
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
          case 4: // VALIDATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.validatedAt = iprot.readI64();
              struct.setValidatedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 101: // TEAM_ID_TO_MEMBERSHIP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                struct.teamIdToMembership = new HashMap<String,TeamMembership>(2*_map4.size);
                String _key5;
                TeamMembership _val6;
                for (int _i7 = 0; _i7 < _map4.size; ++_i7)
                {
                  _key5 = iprot.readString();
                  _val6 = new TeamMembership();
                  _val6.read(iprot);
                  struct.teamIdToMembership.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setTeamIdToMembershipIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 102: // TEAM_ID_TO_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.teamIdToStats = new HashMap<String,UserStats>(2*_map8.size);
                String _key9;
                UserStats _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readString();
                  _val10 = new UserStats();
                  _val10.read(iprot);
                  struct.teamIdToStats.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setTeamIdToStatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 103: // TEAM_ID_TO_ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map12 = iprot.readMapBegin();
                struct.teamIdToAttributes = new HashMap<String,List<com.wi.director.thrift.v1.abac.AbacAttribute>>(2*_map12.size);
                String _key13;
                List<com.wi.director.thrift.v1.abac.AbacAttribute> _val14;
                for (int _i15 = 0; _i15 < _map12.size; ++_i15)
                {
                  _key13 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                    _val14 = new ArrayList<com.wi.director.thrift.v1.abac.AbacAttribute>(_list16.size);
                    com.wi.director.thrift.v1.abac.AbacAttribute _elem17;
                    for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                    {
                      _elem17 = new com.wi.director.thrift.v1.abac.AbacAttribute();
                      _elem17.read(iprot);
                      _val14.add(_elem17);
                    }
                    iprot.readListEnd();
                  }
                  struct.teamIdToAttributes.put(_key13, _val14);
                }
                iprot.readMapEnd();
              }
              struct.setTeamIdToAttributesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserModular struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VALIDATED_AT_FIELD_DESC);
      oprot.writeI64(struct.validatedAt);
      oprot.writeFieldEnd();
      if (struct.teamIdToMembership != null) {
        if (struct.isSetTeamIdToMembership()) {
          oprot.writeFieldBegin(TEAM_ID_TO_MEMBERSHIP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.teamIdToMembership.size()));
            for (Map.Entry<String, TeamMembership> _iter19 : struct.teamIdToMembership.entrySet())
            {
              oprot.writeString(_iter19.getKey());
              _iter19.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.teamIdToStats != null) {
        if (struct.isSetTeamIdToStats()) {
          oprot.writeFieldBegin(TEAM_ID_TO_STATS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.teamIdToStats.size()));
            for (Map.Entry<String, UserStats> _iter20 : struct.teamIdToStats.entrySet())
            {
              oprot.writeString(_iter20.getKey());
              _iter20.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.teamIdToAttributes != null) {
        if (struct.isSetTeamIdToAttributes()) {
          oprot.writeFieldBegin(TEAM_ID_TO_ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.teamIdToAttributes.size()));
            for (Map.Entry<String, List<com.wi.director.thrift.v1.abac.AbacAttribute>> _iter21 : struct.teamIdToAttributes.entrySet())
            {
              oprot.writeString(_iter21.getKey());
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter21.getValue().size()));
                for (com.wi.director.thrift.v1.abac.AbacAttribute _iter22 : _iter21.getValue())
                {
                  _iter22.write(oprot);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

