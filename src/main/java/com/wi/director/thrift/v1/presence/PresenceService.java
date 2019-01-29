/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.presence;

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
public class PresenceService {

  public interface Iface {

    public List<PresenceState> getPresenceState(List<String> userIds) throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public List<PresenceState> getPresenceState(List<String> userIds) throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException
    {
      send_getPresenceState(userIds);
      return recv_getPresenceState();
    }

    public void send_getPresenceState(List<String> userIds) throws org.apache.thrift.TException
    {
      getPresenceState_args args = new getPresenceState_args();
      args.setUserIds(userIds);
      sendBase("getPresenceState", args);
    }

    public List<PresenceState> recv_getPresenceState() throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException
    {
      getPresenceState_result result = new getPresenceState_result();
      receiveBase(result, "getPresenceState");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.err != null) {
        throw result.err;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "getPresenceState failed: unknown result");
    }

  }
  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("getPresenceState", new getPresenceState());
      return processMap;
    }

    public static class getPresenceState<I extends Iface> extends org.apache.thrift.ProcessFunction<I, getPresenceState_args> {
      public getPresenceState() {
        super("getPresenceState");
      }

      public getPresenceState_args getEmptyArgsInstance() {
        return new getPresenceState_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public getPresenceState_result getResult(I iface, getPresenceState_args args) throws org.apache.thrift.TException {
        getPresenceState_result result = new getPresenceState_result();
        try {
          result.success = iface.getPresenceState(args.userIds);
        } catch (com.wi.director.thrift.v1.common.SystemException err) {
          result.err = err;
        }
        return result;
      }
    }

  }

  public static class getPresenceState_args implements org.apache.thrift.TBase<getPresenceState_args, getPresenceState_args._Fields>, java.io.Serializable, Cloneable, Comparable<getPresenceState_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getPresenceState_args");

    private static final org.apache.thrift.protocol.TField USER_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("userIds", org.apache.thrift.protocol.TType.LIST, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getPresenceState_argsStandardSchemeFactory());
    }

    public List<String> userIds; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      USER_IDS((short)1, "userIds");

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
          case 1: // USER_IDS
            return USER_IDS;
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
      tmpMap.put(_Fields.USER_IDS, new org.apache.thrift.meta_data.FieldMetaData("userIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
              new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getPresenceState_args.class, metaDataMap);
    }

    public getPresenceState_args() {
    }

    public getPresenceState_args(
      List<String> userIds)
    {
      this();
      this.userIds = userIds;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getPresenceState_args(getPresenceState_args other) {
      if (other.isSetUserIds()) {
        List<String> __this__userIds = new ArrayList<String>(other.userIds);
        this.userIds = __this__userIds;
      }
    }

    public getPresenceState_args deepCopy() {
      return new getPresenceState_args(this);
    }

    @Override
    public void clear() {
      this.userIds = null;
    }

    public int getUserIdsSize() {
      return (this.userIds == null) ? 0 : this.userIds.size();
    }

    public java.util.Iterator<String> getUserIdsIterator() {
      return (this.userIds == null) ? null : this.userIds.iterator();
    }

    public void addToUserIds(String elem) {
      if (this.userIds == null) {
        this.userIds = new ArrayList<String>();
      }
      this.userIds.add(elem);
    }

    public List<String> getUserIds() {
      return this.userIds;
    }

    public getPresenceState_args setUserIds(List<String> userIds) {
      this.userIds = userIds;
      return this;
    }

    public void unsetUserIds() {
      this.userIds = null;
    }

    /** Returns true if field userIds is set (has been assigned a value) and false otherwise */
    public boolean isSetUserIds() {
      return this.userIds != null;
    }

    public void setUserIdsIsSet(boolean value) {
      if (!value) {
        this.userIds = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case USER_IDS:
        if (value == null) {
          unsetUserIds();
        } else {
          setUserIds((List<String>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case USER_IDS:
        return getUserIds();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case USER_IDS:
        return isSetUserIds();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getPresenceState_args)
        return this.equals((getPresenceState_args)that);
      return false;
    }

    public boolean equals(getPresenceState_args that) {
      if (that == null)
        return false;

      boolean this_present_userIds = true && this.isSetUserIds();
      boolean that_present_userIds = true && that.isSetUserIds();
      if (this_present_userIds || that_present_userIds) {
        if (!(this_present_userIds && that_present_userIds))
          return false;
        if (!this.userIds.equals(that.userIds))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_userIds = true && (isSetUserIds());
      list.add(present_userIds);
      if (present_userIds)
        list.add(userIds);

      return list.hashCode();
    }

    @Override
    public int compareTo(getPresenceState_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetUserIds()).compareTo(other.isSetUserIds());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetUserIds()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userIds, other.userIds);
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
      StringBuilder sb = new StringBuilder("getPresenceState_args(");
      boolean first = true;

      sb.append("userIds:");
      if (this.userIds == null) {
        sb.append("null");
      } else {
        sb.append(this.userIds);
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

    private static class getPresenceState_argsStandardSchemeFactory implements SchemeFactory {
      public getPresenceState_argsStandardScheme getScheme() {
        return new getPresenceState_argsStandardScheme();
      }
    }

    private static class getPresenceState_argsStandardScheme extends StandardScheme<getPresenceState_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getPresenceState_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // USER_IDS
              if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                {
                  org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                  struct.userIds = new ArrayList<String>(_list0.size);
                  String _elem1;
                  for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                  {
                    _elem1 = iprot.readString();
                    struct.userIds.add(_elem1);
                  }
                  iprot.readListEnd();
                }
                struct.setUserIdsIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getPresenceState_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.userIds != null) {
          oprot.writeFieldBegin(USER_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.userIds.size()));
            for (String _iter3 : struct.userIds)
            {
              oprot.writeString(_iter3);
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

  public static class getPresenceState_result implements org.apache.thrift.TBase<getPresenceState_result, getPresenceState_result._Fields>, java.io.Serializable, Cloneable, Comparable<getPresenceState_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getPresenceState_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.LIST, (short)0);
    private static final org.apache.thrift.protocol.TField ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("err", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getPresenceState_resultStandardSchemeFactory());
    }

    public List<PresenceState> success; // required
    public com.wi.director.thrift.v1.common.SystemException err; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success"),
      ERR((short)1, "err");

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
          case 0: // SUCCESS
            return SUCCESS;
          case 1: // ERR
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

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
              new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PresenceState.class))));
      tmpMap.put(_Fields.ERR, new org.apache.thrift.meta_data.FieldMetaData("err", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getPresenceState_result.class, metaDataMap);
    }

    public getPresenceState_result() {
    }

    public getPresenceState_result(
      List<PresenceState> success,
      com.wi.director.thrift.v1.common.SystemException err)
    {
      this();
      this.success = success;
      this.err = err;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getPresenceState_result(getPresenceState_result other) {
      if (other.isSetSuccess()) {
        List<PresenceState> __this__success = new ArrayList<PresenceState>(other.success.size());
        for (PresenceState other_element : other.success) {
          __this__success.add(other_element);
        }
        this.success = __this__success;
      }
      if (other.isSetErr()) {
        this.err = new com.wi.director.thrift.v1.common.SystemException(other.err);
      }
    }

    public getPresenceState_result deepCopy() {
      return new getPresenceState_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
      this.err = null;
    }

    public int getSuccessSize() {
      return (this.success == null) ? 0 : this.success.size();
    }

    public java.util.Iterator<PresenceState> getSuccessIterator() {
      return (this.success == null) ? null : this.success.iterator();
    }

    public void addToSuccess(PresenceState elem) {
      if (this.success == null) {
        this.success = new ArrayList<PresenceState>();
      }
      this.success.add(elem);
    }

    public List<PresenceState> getSuccess() {
      return this.success;
    }

    public getPresenceState_result setSuccess(List<PresenceState> success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public com.wi.director.thrift.v1.common.SystemException getErr() {
      return this.err;
    }

    public getPresenceState_result setErr(com.wi.director.thrift.v1.common.SystemException err) {
      this.err = err;
      return this;
    }

    public void unsetErr() {
      this.err = null;
    }

    /** Returns true if field err is set (has been assigned a value) and false otherwise */
    public boolean isSetErr() {
      return this.err != null;
    }

    public void setErrIsSet(boolean value) {
      if (!value) {
        this.err = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((List<PresenceState>)value);
        }
        break;

      case ERR:
        if (value == null) {
          unsetErr();
        } else {
          setErr((com.wi.director.thrift.v1.common.SystemException)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      case ERR:
        return getErr();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      case ERR:
        return isSetErr();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getPresenceState_result)
        return this.equals((getPresenceState_result)that);
      return false;
    }

    public boolean equals(getPresenceState_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      boolean this_present_err = true && this.isSetErr();
      boolean that_present_err = true && that.isSetErr();
      if (this_present_err || that_present_err) {
        if (!(this_present_err && that_present_err))
          return false;
        if (!this.err.equals(that.err))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success);

      boolean present_err = true && (isSetErr());
      list.add(present_err);
      if (present_err)
        list.add(err);

      return list.hashCode();
    }

    @Override
    public int compareTo(getPresenceState_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetErr()).compareTo(other.isSetErr());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetErr()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.err, other.err);
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
      StringBuilder sb = new StringBuilder("getPresenceState_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("err:");
      if (this.err == null) {
        sb.append("null");
      } else {
        sb.append(this.err);
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

    private static class getPresenceState_resultStandardSchemeFactory implements SchemeFactory {
      public getPresenceState_resultStandardScheme getScheme() {
        return new getPresenceState_resultStandardScheme();
      }
    }

    private static class getPresenceState_resultStandardScheme extends StandardScheme<getPresenceState_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getPresenceState_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                {
                  org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
                  struct.success = new ArrayList<PresenceState>(_list4.size);
                  PresenceState _elem5;
                  for (int _i6 = 0; _i6 < _list4.size; ++_i6)
                  {
                    _elem5 = com.wi.director.thrift.v1.presence.PresenceState.findByValue(iprot.readI32());
                    struct.success.add(_elem5);
                  }
                  iprot.readListEnd();
                }
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 1: // ERR
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.err = new com.wi.director.thrift.v1.common.SystemException();
                struct.err.read(iprot);
                struct.setErrIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getPresenceState_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.success.size()));
            for (PresenceState _iter7 : struct.success)
            {
              oprot.writeI32(_iter7.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        if (struct.err != null) {
          oprot.writeFieldBegin(ERR_FIELD_DESC);
          struct.err.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

  }

}
