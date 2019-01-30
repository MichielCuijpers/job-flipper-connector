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
public class UserFetchResult extends org.apache.thrift.TUnion<UserFetchResult, UserFetchResult._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserFetchResult");
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("err", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER((short)1, "user"),
    ERR((short)2, "err");

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
        case 1: // USER
          return USER;
        case 2: // ERR
          return ERR;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserModular.class)));
    tmpMap.put(_Fields.ERR, new org.apache.thrift.meta_data.FieldMetaData("err", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserFetchResult.class, metaDataMap);
  }

  public UserFetchResult() {
    super();
  }

  public UserFetchResult(_Fields setField, Object value) {
    super(setField, value);
  }

  public UserFetchResult(UserFetchResult other) {
    super(other);
  }
  public UserFetchResult deepCopy() {
    return new UserFetchResult(this);
  }

  public static UserFetchResult user(UserModular value) {
    UserFetchResult x = new UserFetchResult();
    x.setUser(value);
    return x;
  }

  public static UserFetchResult err(com.wi.director.thrift.v1.common.SystemException value) {
    UserFetchResult x = new UserFetchResult();
    x.setErr(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case USER:
        if (value instanceof UserModular) {
          break;
        }
        throw new ClassCastException("Was expecting value of type UserModular for field 'user', but got " + value.getClass().getSimpleName());
      case ERR:
        if (value instanceof com.wi.director.thrift.v1.common.SystemException) {
          break;
        }
        throw new ClassCastException("Was expecting value of type com.wi.director.thrift.v1.common.SystemException for field 'err', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case USER:
          if (field.type == USER_FIELD_DESC.type) {
            UserModular user;
            user = new UserModular();
            user.read(iprot);
            return user;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case ERR:
          if (field.type == ERR_FIELD_DESC.type) {
            com.wi.director.thrift.v1.common.SystemException err;
            err = new com.wi.director.thrift.v1.common.SystemException();
            err.read(iprot);
            return err;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case USER:
        UserModular user = (UserModular)value_;
        user.write(oprot);
        return;
      case ERR:
        com.wi.director.thrift.v1.common.SystemException err = (com.wi.director.thrift.v1.common.SystemException)value_;
        err.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case USER:
          UserModular user;
          user = new UserModular();
          user.read(iprot);
          return user;
        case ERR:
          com.wi.director.thrift.v1.common.SystemException err;
          err = new com.wi.director.thrift.v1.common.SystemException();
          err.read(iprot);
          return err;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case USER:
        UserModular user = (UserModular)value_;
        user.write(oprot);
        return;
      case ERR:
        com.wi.director.thrift.v1.common.SystemException err = (com.wi.director.thrift.v1.common.SystemException)value_;
        err.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case USER:
        return USER_FIELD_DESC;
      case ERR:
        return ERR_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public UserModular getUser() {
    if (getSetField() == _Fields.USER) {
      return (UserModular)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'user' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUser(UserModular value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.USER;
    value_ = value;
  }

  public com.wi.director.thrift.v1.common.SystemException getErr() {
    if (getSetField() == _Fields.ERR) {
      return (com.wi.director.thrift.v1.common.SystemException)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'err' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setErr(com.wi.director.thrift.v1.common.SystemException value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.ERR;
    value_ = value;
  }

  public boolean isSetUser() {
    return setField_ == _Fields.USER;
  }


  public boolean isSetErr() {
    return setField_ == _Fields.ERR;
  }


  public boolean equals(Object other) {
    if (other instanceof UserFetchResult) {
      return equals((UserFetchResult)other);
    } else {
      return false;
    }
  }

  public boolean equals(UserFetchResult other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(UserFetchResult other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}