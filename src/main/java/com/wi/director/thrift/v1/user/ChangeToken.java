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
 * NOHTML ChangeToken is included in emails sent out to users for validation/changing passwords/etc.
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class ChangeToken implements org.apache.thrift.TBase<ChangeToken, ChangeToken._Fields>, java.io.Serializable, Cloneable, Comparable<ChangeToken> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChangeToken");

  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TOKEN_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField INVITE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("inviteType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TEAM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("teamId", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField INVITER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("inviterId", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField CREATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("createdAt", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField UPDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAt", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChangeTokenStandardSchemeFactory());
  }

  public String token; // required
  public String userId; // required
  /**
   * 
   * @see ChangeTokenType
   */
  public ChangeTokenType tokenType; // required
  public int inviteType; // required
  public String teamId; // optional
  public String inviterId; // optional
  public long createdAt; // required
  public long updatedAt; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOKEN((short)1, "token"),
    USER_ID((short)2, "userId"),
    /**
     * 
     * @see ChangeTokenType
     */
    TOKEN_TYPE((short)3, "tokenType"),
    INVITE_TYPE((short)4, "inviteType"),
    TEAM_ID((short)5, "teamId"),
    INVITER_ID((short)6, "inviterId"),
    CREATED_AT((short)7, "createdAt"),
    UPDATED_AT((short)8, "updatedAt");

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
        case 1: // TOKEN
          return TOKEN;
        case 2: // USER_ID
          return USER_ID;
        case 3: // TOKEN_TYPE
          return TOKEN_TYPE;
        case 4: // INVITE_TYPE
          return INVITE_TYPE;
        case 5: // TEAM_ID
          return TEAM_ID;
        case 6: // INVITER_ID
          return INVITER_ID;
        case 7: // CREATED_AT
          return CREATED_AT;
        case 8: // UPDATED_AT
          return UPDATED_AT;
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
  private static final int __INVITETYPE_ISSET_ID = 0;
  private static final int __CREATEDAT_ISSET_ID = 1;
  private static final int __UPDATEDAT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TEAM_ID,_Fields.INVITER_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOKEN_TYPE, new org.apache.thrift.meta_data.FieldMetaData("tokenType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ChangeTokenType.class)));
    tmpMap.put(_Fields.INVITE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("inviteType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TEAM_ID, new org.apache.thrift.meta_data.FieldMetaData("teamId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INVITER_ID, new org.apache.thrift.meta_data.FieldMetaData("inviterId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_AT, new org.apache.thrift.meta_data.FieldMetaData("createdAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("updatedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChangeToken.class, metaDataMap);
  }

  public ChangeToken() {
  }

  public ChangeToken(
    String token,
    String userId,
    ChangeTokenType tokenType,
    int inviteType,
    long createdAt,
    long updatedAt)
  {
    this();
    this.token = token;
    this.userId = userId;
    this.tokenType = tokenType;
    this.inviteType = inviteType;
    setInviteTypeIsSet(true);
    this.createdAt = createdAt;
    setCreatedAtIsSet(true);
    this.updatedAt = updatedAt;
    setUpdatedAtIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChangeToken(ChangeToken other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetToken()) {
      this.token = other.token;
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetTokenType()) {
      this.tokenType = other.tokenType;
    }
    this.inviteType = other.inviteType;
    if (other.isSetTeamId()) {
      this.teamId = other.teamId;
    }
    if (other.isSetInviterId()) {
      this.inviterId = other.inviterId;
    }
    this.createdAt = other.createdAt;
    this.updatedAt = other.updatedAt;
  }

  public ChangeToken deepCopy() {
    return new ChangeToken(this);
  }

  @Override
  public void clear() {
    this.token = null;
    this.userId = null;
    this.tokenType = null;
    setInviteTypeIsSet(false);
    this.inviteType = 0;
    this.teamId = null;
    this.inviterId = null;
    setCreatedAtIsSet(false);
    this.createdAt = 0;
    setUpdatedAtIsSet(false);
    this.updatedAt = 0;
  }

  public String getToken() {
    return this.token;
  }

  public ChangeToken setToken(String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public String getUserId() {
    return this.userId;
  }

  public ChangeToken setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  /**
   * 
   * @see ChangeTokenType
   */
  public ChangeTokenType getTokenType() {
    return this.tokenType;
  }

  /**
   * 
   * @see ChangeTokenType
   */
  public ChangeToken setTokenType(ChangeTokenType tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  public void unsetTokenType() {
    this.tokenType = null;
  }

  /** Returns true if field tokenType is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenType() {
    return this.tokenType != null;
  }

  public void setTokenTypeIsSet(boolean value) {
    if (!value) {
      this.tokenType = null;
    }
  }

  public int getInviteType() {
    return this.inviteType;
  }

  public ChangeToken setInviteType(int inviteType) {
    this.inviteType = inviteType;
    setInviteTypeIsSet(true);
    return this;
  }

  public void unsetInviteType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INVITETYPE_ISSET_ID);
  }

  /** Returns true if field inviteType is set (has been assigned a value) and false otherwise */
  public boolean isSetInviteType() {
    return EncodingUtils.testBit(__isset_bitfield, __INVITETYPE_ISSET_ID);
  }

  public void setInviteTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INVITETYPE_ISSET_ID, value);
  }

  public String getTeamId() {
    return this.teamId;
  }

  public ChangeToken setTeamId(String teamId) {
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

  public String getInviterId() {
    return this.inviterId;
  }

  public ChangeToken setInviterId(String inviterId) {
    this.inviterId = inviterId;
    return this;
  }

  public void unsetInviterId() {
    this.inviterId = null;
  }

  /** Returns true if field inviterId is set (has been assigned a value) and false otherwise */
  public boolean isSetInviterId() {
    return this.inviterId != null;
  }

  public void setInviterIdIsSet(boolean value) {
    if (!value) {
      this.inviterId = null;
    }
  }

  public long getCreatedAt() {
    return this.createdAt;
  }

  public ChangeToken setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
    setCreatedAtIsSet(true);
    return this;
  }

  public void unsetCreatedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDAT_ISSET_ID);
  }

  /** Returns true if field createdAt is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDAT_ISSET_ID);
  }

  public void setCreatedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDAT_ISSET_ID, value);
  }

  public long getUpdatedAt() {
    return this.updatedAt;
  }

  public ChangeToken setUpdatedAt(long updatedAt) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((String)value);
      }
      break;

    case TOKEN_TYPE:
      if (value == null) {
        unsetTokenType();
      } else {
        setTokenType((ChangeTokenType)value);
      }
      break;

    case INVITE_TYPE:
      if (value == null) {
        unsetInviteType();
      } else {
        setInviteType((Integer)value);
      }
      break;

    case TEAM_ID:
      if (value == null) {
        unsetTeamId();
      } else {
        setTeamId((String)value);
      }
      break;

    case INVITER_ID:
      if (value == null) {
        unsetInviterId();
      } else {
        setInviterId((String)value);
      }
      break;

    case CREATED_AT:
      if (value == null) {
        unsetCreatedAt();
      } else {
        setCreatedAt((Long)value);
      }
      break;

    case UPDATED_AT:
      if (value == null) {
        unsetUpdatedAt();
      } else {
        setUpdatedAt((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN:
      return getToken();

    case USER_ID:
      return getUserId();

    case TOKEN_TYPE:
      return getTokenType();

    case INVITE_TYPE:
      return getInviteType();

    case TEAM_ID:
      return getTeamId();

    case INVITER_ID:
      return getInviterId();

    case CREATED_AT:
      return getCreatedAt();

    case UPDATED_AT:
      return getUpdatedAt();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOKEN:
      return isSetToken();
    case USER_ID:
      return isSetUserId();
    case TOKEN_TYPE:
      return isSetTokenType();
    case INVITE_TYPE:
      return isSetInviteType();
    case TEAM_ID:
      return isSetTeamId();
    case INVITER_ID:
      return isSetInviterId();
    case CREATED_AT:
      return isSetCreatedAt();
    case UPDATED_AT:
      return isSetUpdatedAt();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChangeToken)
      return this.equals((ChangeToken)that);
    return false;
  }

  public boolean equals(ChangeToken that) {
    if (that == null)
      return false;

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_tokenType = true && this.isSetTokenType();
    boolean that_present_tokenType = true && that.isSetTokenType();
    if (this_present_tokenType || that_present_tokenType) {
      if (!(this_present_tokenType && that_present_tokenType))
        return false;
      if (!this.tokenType.equals(that.tokenType))
        return false;
    }

    boolean this_present_inviteType = true;
    boolean that_present_inviteType = true;
    if (this_present_inviteType || that_present_inviteType) {
      if (!(this_present_inviteType && that_present_inviteType))
        return false;
      if (this.inviteType != that.inviteType)
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

    boolean this_present_inviterId = true && this.isSetInviterId();
    boolean that_present_inviterId = true && that.isSetInviterId();
    if (this_present_inviterId || that_present_inviterId) {
      if (!(this_present_inviterId && that_present_inviterId))
        return false;
      if (!this.inviterId.equals(that.inviterId))
        return false;
    }

    boolean this_present_createdAt = true;
    boolean that_present_createdAt = true;
    if (this_present_createdAt || that_present_createdAt) {
      if (!(this_present_createdAt && that_present_createdAt))
        return false;
      if (this.createdAt != that.createdAt)
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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_token = true && (isSetToken());
    list.add(present_token);
    if (present_token)
      list.add(token);

    boolean present_userId = true && (isSetUserId());
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_tokenType = true && (isSetTokenType());
    list.add(present_tokenType);
    if (present_tokenType)
      list.add(tokenType.getValue());

    boolean present_inviteType = true;
    list.add(present_inviteType);
    if (present_inviteType)
      list.add(inviteType);

    boolean present_teamId = true && (isSetTeamId());
    list.add(present_teamId);
    if (present_teamId)
      list.add(teamId);

    boolean present_inviterId = true && (isSetInviterId());
    list.add(present_inviterId);
    if (present_inviterId)
      list.add(inviterId);

    boolean present_createdAt = true;
    list.add(present_createdAt);
    if (present_createdAt)
      list.add(createdAt);

    boolean present_updatedAt = true;
    list.add(present_updatedAt);
    if (present_updatedAt)
      list.add(updatedAt);

    return list.hashCode();
  }

  @Override
  public int compareTo(ChangeToken other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTokenType()).compareTo(other.isSetTokenType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenType, other.tokenType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInviteType()).compareTo(other.isSetInviteType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviteType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inviteType, other.inviteType);
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
    lastComparison = Boolean.valueOf(isSetInviterId()).compareTo(other.isSetInviterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviterId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inviterId, other.inviterId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreatedAt()).compareTo(other.isSetCreatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdAt, other.createdAt);
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
    StringBuilder sb = new StringBuilder("ChangeToken(");
    boolean first = true;

    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tokenType:");
    if (this.tokenType == null) {
      sb.append("null");
    } else {
      sb.append(this.tokenType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inviteType:");
    sb.append(this.inviteType);
    first = false;
    if (isSetTeamId()) {
      if (!first) sb.append(", ");
      sb.append("teamId:");
      if (this.teamId == null) {
        sb.append("null");
      } else {
        sb.append(this.teamId);
      }
      first = false;
    }
    if (isSetInviterId()) {
      if (!first) sb.append(", ");
      sb.append("inviterId:");
      if (this.inviterId == null) {
        sb.append("null");
      } else {
        sb.append(this.inviterId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("createdAt:");
    sb.append(this.createdAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedAt:");
    sb.append(this.updatedAt);
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

  private static class ChangeTokenStandardSchemeFactory implements SchemeFactory {
    public ChangeTokenStandardScheme getScheme() {
      return new ChangeTokenStandardScheme();
    }
  }

  private static class ChangeTokenStandardScheme extends StandardScheme<ChangeToken> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChangeToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOKEN_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tokenType = com.wi.director.thrift.v1.user.ChangeTokenType.findByValue(iprot.readI32());
              struct.setTokenTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INVITE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.inviteType = iprot.readI32();
              struct.setInviteTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TEAM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.teamId = iprot.readString();
              struct.setTeamIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INVITER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.inviterId = iprot.readString();
              struct.setInviterIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CREATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdAt = iprot.readI64();
              struct.setCreatedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // UPDATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updatedAt = iprot.readI64();
              struct.setUpdatedAtIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChangeToken struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.tokenType != null) {
        oprot.writeFieldBegin(TOKEN_TYPE_FIELD_DESC);
        oprot.writeI32(struct.tokenType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INVITE_TYPE_FIELD_DESC);
      oprot.writeI32(struct.inviteType);
      oprot.writeFieldEnd();
      if (struct.teamId != null) {
        if (struct.isSetTeamId()) {
          oprot.writeFieldBegin(TEAM_ID_FIELD_DESC);
          oprot.writeString(struct.teamId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.inviterId != null) {
        if (struct.isSetInviterId()) {
          oprot.writeFieldBegin(INVITER_ID_FIELD_DESC);
          oprot.writeString(struct.inviterId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(CREATED_AT_FIELD_DESC);
      oprot.writeI64(struct.createdAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATED_AT_FIELD_DESC);
      oprot.writeI64(struct.updatedAt);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
