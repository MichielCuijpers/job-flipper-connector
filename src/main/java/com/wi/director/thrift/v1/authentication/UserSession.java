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
public class UserSession implements org.apache.thrift.TBase<UserSession, UserSession._Fields>, java.io.Serializable, Cloneable, Comparable<UserSession> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserSession");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AUTH_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("authToken", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RECEIVER_FIELD_DESC = new org.apache.thrift.protocol.TField("receiver", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserSessionStandardSchemeFactory());
  }

  public String userId; // required
  public String authToken; // required
  /**
   * Only relevant for mobile device logins
   */
  public PushReceiver receiver; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    AUTH_TOKEN((short)2, "authToken"),
    /**
     * Only relevant for mobile device logins
     */
    RECEIVER((short)3, "receiver");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // AUTH_TOKEN
          return AUTH_TOKEN;
        case 3: // RECEIVER
          return RECEIVER;
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
  private static final _Fields optionals[] = {_Fields.RECEIVER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUTH_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("authToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECEIVER, new org.apache.thrift.meta_data.FieldMetaData("receiver", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PushReceiver.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserSession.class, metaDataMap);
  }

  public UserSession() {
  }

  public UserSession(
    String userId,
    String authToken)
  {
    this();
    this.userId = userId;
    this.authToken = authToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserSession(UserSession other) {
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetAuthToken()) {
      this.authToken = other.authToken;
    }
    if (other.isSetReceiver()) {
      this.receiver = new PushReceiver(other.receiver);
    }
  }

  public UserSession deepCopy() {
    return new UserSession(this);
  }

  @Override
  public void clear() {
    this.userId = null;
    this.authToken = null;
    this.receiver = null;
  }

  public String getUserId() {
    return this.userId;
  }

  public UserSession setUserId(String userId) {
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

  public String getAuthToken() {
    return this.authToken;
  }

  public UserSession setAuthToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

  public void unsetAuthToken() {
    this.authToken = null;
  }

  /** Returns true if field authToken is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthToken() {
    return this.authToken != null;
  }

  public void setAuthTokenIsSet(boolean value) {
    if (!value) {
      this.authToken = null;
    }
  }

  /**
   * Only relevant for mobile device logins
   */
  public PushReceiver getReceiver() {
    return this.receiver;
  }

  /**
   * Only relevant for mobile device logins
   */
  public UserSession setReceiver(PushReceiver receiver) {
    this.receiver = receiver;
    return this;
  }

  public void unsetReceiver() {
    this.receiver = null;
  }

  /** Returns true if field receiver is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiver() {
    return this.receiver != null;
  }

  public void setReceiverIsSet(boolean value) {
    if (!value) {
      this.receiver = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((String)value);
      }
      break;

    case AUTH_TOKEN:
      if (value == null) {
        unsetAuthToken();
      } else {
        setAuthToken((String)value);
      }
      break;

    case RECEIVER:
      if (value == null) {
        unsetReceiver();
      } else {
        setReceiver((PushReceiver)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case AUTH_TOKEN:
      return getAuthToken();

    case RECEIVER:
      return getReceiver();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case AUTH_TOKEN:
      return isSetAuthToken();
    case RECEIVER:
      return isSetReceiver();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserSession)
      return this.equals((UserSession)that);
    return false;
  }

  public boolean equals(UserSession that) {
    if (that == null)
      return false;

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_authToken = true && this.isSetAuthToken();
    boolean that_present_authToken = true && that.isSetAuthToken();
    if (this_present_authToken || that_present_authToken) {
      if (!(this_present_authToken && that_present_authToken))
        return false;
      if (!this.authToken.equals(that.authToken))
        return false;
    }

    boolean this_present_receiver = true && this.isSetReceiver();
    boolean that_present_receiver = true && that.isSetReceiver();
    if (this_present_receiver || that_present_receiver) {
      if (!(this_present_receiver && that_present_receiver))
        return false;
      if (!this.receiver.equals(that.receiver))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userId = true && (isSetUserId());
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_authToken = true && (isSetAuthToken());
    list.add(present_authToken);
    if (present_authToken)
      list.add(authToken);

    boolean present_receiver = true && (isSetReceiver());
    list.add(present_receiver);
    if (present_receiver)
      list.add(receiver);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserSession other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetAuthToken()).compareTo(other.isSetAuthToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authToken, other.authToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceiver()).compareTo(other.isSetReceiver());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiver()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiver, other.receiver);
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
    StringBuilder sb = new StringBuilder("UserSession(");
    boolean first = true;

    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("authToken:");
    if (this.authToken == null) {
      sb.append("null");
    } else {
      sb.append(this.authToken);
    }
    first = false;
    if (isSetReceiver()) {
      if (!first) sb.append(", ");
      sb.append("receiver:");
      if (this.receiver == null) {
        sb.append("null");
      } else {
        sb.append(this.receiver);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (receiver != null) {
      receiver.validate();
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

  private static class UserSessionStandardSchemeFactory implements SchemeFactory {
    public UserSessionStandardScheme getScheme() {
      return new UserSessionStandardScheme();
    }
  }

  private static class UserSessionStandardScheme extends StandardScheme<UserSession> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserSession struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AUTH_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authToken = iprot.readString();
              struct.setAuthTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECEIVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.receiver = new PushReceiver();
              struct.receiver.read(iprot);
              struct.setReceiverIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserSession struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.authToken != null) {
        oprot.writeFieldBegin(AUTH_TOKEN_FIELD_DESC);
        oprot.writeString(struct.authToken);
        oprot.writeFieldEnd();
      }
      if (struct.receiver != null) {
        if (struct.isSetReceiver()) {
          oprot.writeFieldBegin(RECEIVER_FIELD_DESC);
          struct.receiver.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

