/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.field_data;

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
public class FieldDataService {

  public interface Iface {

    /**
     * Get all pre-defined measurement units
     * 
     * @param teamId
     */
    public List<NumberUnitQuantity> getNumberUnits(String teamId) throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException;

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

    public List<NumberUnitQuantity> getNumberUnits(String teamId) throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException
    {
      send_getNumberUnits(teamId);
      return recv_getNumberUnits();
    }

    public void send_getNumberUnits(String teamId) throws org.apache.thrift.TException
    {
      getNumberUnits_args args = new getNumberUnits_args();
      args.setTeamId(teamId);
      sendBase("getNumberUnits", args);
    }

    public List<NumberUnitQuantity> recv_getNumberUnits() throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException
    {
      getNumberUnits_result result = new getNumberUnits_result();
      receiveBase(result, "getNumberUnits");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.err != null) {
        throw result.err;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "getNumberUnits failed: unknown result");
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
      processMap.put("getNumberUnits", new getNumberUnits());
      return processMap;
    }

    public static class getNumberUnits<I extends Iface> extends org.apache.thrift.ProcessFunction<I, getNumberUnits_args> {
      public getNumberUnits() {
        super("getNumberUnits");
      }

      public getNumberUnits_args getEmptyArgsInstance() {
        return new getNumberUnits_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public getNumberUnits_result getResult(I iface, getNumberUnits_args args) throws org.apache.thrift.TException {
        getNumberUnits_result result = new getNumberUnits_result();
        try {
          result.success = iface.getNumberUnits(args.teamId);
        } catch (com.wi.director.thrift.v1.common.SystemException err) {
          result.err = err;
        }
        return result;
      }
    }

  }

  public static class getNumberUnits_args implements org.apache.thrift.TBase<getNumberUnits_args, getNumberUnits_args._Fields>, java.io.Serializable, Cloneable, Comparable<getNumberUnits_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getNumberUnits_args");

    private static final org.apache.thrift.protocol.TField TEAM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("teamId", org.apache.thrift.protocol.TType.STRING, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getNumberUnits_argsStandardSchemeFactory());
    }

    public String teamId; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      TEAM_ID((short)1, "teamId");

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
          case 1: // TEAM_ID
            return TEAM_ID;
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
      tmpMap.put(_Fields.TEAM_ID, new org.apache.thrift.meta_data.FieldMetaData("teamId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING          , "UUID")));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getNumberUnits_args.class, metaDataMap);
    }

    public getNumberUnits_args() {
    }

    public getNumberUnits_args(
      String teamId)
    {
      this();
      this.teamId = teamId;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getNumberUnits_args(getNumberUnits_args other) {
      if (other.isSetTeamId()) {
        this.teamId = other.teamId;
      }
    }

    public getNumberUnits_args deepCopy() {
      return new getNumberUnits_args(this);
    }

    @Override
    public void clear() {
      this.teamId = null;
    }

    public String getTeamId() {
      return this.teamId;
    }

    public getNumberUnits_args setTeamId(String teamId) {
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

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case TEAM_ID:
        if (value == null) {
          unsetTeamId();
        } else {
          setTeamId((String)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case TEAM_ID:
        return getTeamId();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case TEAM_ID:
        return isSetTeamId();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getNumberUnits_args)
        return this.equals((getNumberUnits_args)that);
      return false;
    }

    public boolean equals(getNumberUnits_args that) {
      if (that == null)
        return false;

      boolean this_present_teamId = true && this.isSetTeamId();
      boolean that_present_teamId = true && that.isSetTeamId();
      if (this_present_teamId || that_present_teamId) {
        if (!(this_present_teamId && that_present_teamId))
          return false;
        if (!this.teamId.equals(that.teamId))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_teamId = true && (isSetTeamId());
      list.add(present_teamId);
      if (present_teamId)
        list.add(teamId);

      return list.hashCode();
    }

    @Override
    public int compareTo(getNumberUnits_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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
      StringBuilder sb = new StringBuilder("getNumberUnits_args(");
      boolean first = true;

      sb.append("teamId:");
      if (this.teamId == null) {
        sb.append("null");
      } else {
        sb.append(this.teamId);
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

    private static class getNumberUnits_argsStandardSchemeFactory implements SchemeFactory {
      public getNumberUnits_argsStandardScheme getScheme() {
        return new getNumberUnits_argsStandardScheme();
      }
    }

    private static class getNumberUnits_argsStandardScheme extends StandardScheme<getNumberUnits_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getNumberUnits_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // TEAM_ID
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.teamId = iprot.readString();
                struct.setTeamIdIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getNumberUnits_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.teamId != null) {
          oprot.writeFieldBegin(TEAM_ID_FIELD_DESC);
          oprot.writeString(struct.teamId);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

  }

  public static class getNumberUnits_result implements org.apache.thrift.TBase<getNumberUnits_result, getNumberUnits_result._Fields>, java.io.Serializable, Cloneable, Comparable<getNumberUnits_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getNumberUnits_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.LIST, (short)0);
    private static final org.apache.thrift.protocol.TField ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("err", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getNumberUnits_resultStandardSchemeFactory());
    }

    public List<NumberUnitQuantity> success; // required
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
              new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NumberUnitQuantity.class))));
      tmpMap.put(_Fields.ERR, new org.apache.thrift.meta_data.FieldMetaData("err", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getNumberUnits_result.class, metaDataMap);
    }

    public getNumberUnits_result() {
    }

    public getNumberUnits_result(
      List<NumberUnitQuantity> success,
      com.wi.director.thrift.v1.common.SystemException err)
    {
      this();
      this.success = success;
      this.err = err;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getNumberUnits_result(getNumberUnits_result other) {
      if (other.isSetSuccess()) {
        List<NumberUnitQuantity> __this__success = new ArrayList<NumberUnitQuantity>(other.success.size());
        for (NumberUnitQuantity other_element : other.success) {
          __this__success.add(new NumberUnitQuantity(other_element));
        }
        this.success = __this__success;
      }
      if (other.isSetErr()) {
        this.err = new com.wi.director.thrift.v1.common.SystemException(other.err);
      }
    }

    public getNumberUnits_result deepCopy() {
      return new getNumberUnits_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
      this.err = null;
    }

    public int getSuccessSize() {
      return (this.success == null) ? 0 : this.success.size();
    }

    public java.util.Iterator<NumberUnitQuantity> getSuccessIterator() {
      return (this.success == null) ? null : this.success.iterator();
    }

    public void addToSuccess(NumberUnitQuantity elem) {
      if (this.success == null) {
        this.success = new ArrayList<NumberUnitQuantity>();
      }
      this.success.add(elem);
    }

    public List<NumberUnitQuantity> getSuccess() {
      return this.success;
    }

    public getNumberUnits_result setSuccess(List<NumberUnitQuantity> success) {
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

    public getNumberUnits_result setErr(com.wi.director.thrift.v1.common.SystemException err) {
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
          setSuccess((List<NumberUnitQuantity>)value);
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
      if (that instanceof getNumberUnits_result)
        return this.equals((getNumberUnits_result)that);
      return false;
    }

    public boolean equals(getNumberUnits_result that) {
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
    public int compareTo(getNumberUnits_result other) {
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
      StringBuilder sb = new StringBuilder("getNumberUnits_result(");
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

    private static class getNumberUnits_resultStandardSchemeFactory implements SchemeFactory {
      public getNumberUnits_resultStandardScheme getScheme() {
        return new getNumberUnits_resultStandardScheme();
      }
    }

    private static class getNumberUnits_resultStandardScheme extends StandardScheme<getNumberUnits_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getNumberUnits_result struct) throws org.apache.thrift.TException {
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
                  org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                  struct.success = new ArrayList<NumberUnitQuantity>(_list18.size);
                  NumberUnitQuantity _elem19;
                  for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                  {
                    _elem19 = new NumberUnitQuantity();
                    _elem19.read(iprot);
                    struct.success.add(_elem19);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getNumberUnits_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.success.size()));
            for (NumberUnitQuantity _iter21 : struct.success)
            {
              _iter21.write(oprot);
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
