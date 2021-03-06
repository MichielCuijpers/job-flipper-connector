/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.thread_event;

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
public class ThreadEventService {

  public interface Iface {

    /**
     * Get thread events since the last node versions. If nodeVersions is nil or empty, return all events
     * 
     * @param threadId
     * @param nodeVersions
     */
    public ThreadEventsResult getThreadEvents(String threadId, List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions) throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException;

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

    public ThreadEventsResult getThreadEvents(String threadId, List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions) throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException
    {
      send_getThreadEvents(threadId, nodeVersions);
      return recv_getThreadEvents();
    }

    public void send_getThreadEvents(String threadId, List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions) throws org.apache.thrift.TException
    {
      getThreadEvents_args args = new getThreadEvents_args();
      args.setThreadId(threadId);
      args.setNodeVersions(nodeVersions);
      sendBase("getThreadEvents", args);
    }

    public ThreadEventsResult recv_getThreadEvents() throws com.wi.director.thrift.v1.common.SystemException, org.apache.thrift.TException
    {
      getThreadEvents_result result = new getThreadEvents_result();
      receiveBase(result, "getThreadEvents");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.err != null) {
        throw result.err;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "getThreadEvents failed: unknown result");
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
      processMap.put("getThreadEvents", new getThreadEvents());
      return processMap;
    }

    public static class getThreadEvents<I extends Iface> extends org.apache.thrift.ProcessFunction<I, getThreadEvents_args> {
      public getThreadEvents() {
        super("getThreadEvents");
      }

      public getThreadEvents_args getEmptyArgsInstance() {
        return new getThreadEvents_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public getThreadEvents_result getResult(I iface, getThreadEvents_args args) throws org.apache.thrift.TException {
        getThreadEvents_result result = new getThreadEvents_result();
        try {
          result.success = iface.getThreadEvents(args.threadId, args.nodeVersions);
        } catch (com.wi.director.thrift.v1.common.SystemException err) {
          result.err = err;
        }
        return result;
      }
    }

  }

  public static class getThreadEvents_args implements org.apache.thrift.TBase<getThreadEvents_args, getThreadEvents_args._Fields>, java.io.Serializable, Cloneable, Comparable<getThreadEvents_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getThreadEvents_args");

    private static final org.apache.thrift.protocol.TField THREAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("threadId", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField NODE_VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeVersions", org.apache.thrift.protocol.TType.LIST, (short)2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getThreadEvents_argsStandardSchemeFactory());
    }

    public String threadId; // required
    public List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      THREAD_ID((short)1, "threadId"),
      NODE_VERSIONS((short)2, "nodeVersions");

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
          case 1: // THREAD_ID
            return THREAD_ID;
          case 2: // NODE_VERSIONS
            return NODE_VERSIONS;
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
      tmpMap.put(_Fields.THREAD_ID, new org.apache.thrift.meta_data.FieldMetaData("threadId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.NODE_VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("nodeVersions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
              new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.core_event.NodeVersion.class))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getThreadEvents_args.class, metaDataMap);
    }

    public getThreadEvents_args() {
    }

    public getThreadEvents_args(
      String threadId,
      List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions)
    {
      this();
      this.threadId = threadId;
      this.nodeVersions = nodeVersions;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getThreadEvents_args(getThreadEvents_args other) {
      if (other.isSetThreadId()) {
        this.threadId = other.threadId;
      }
      if (other.isSetNodeVersions()) {
        List<com.parsable.thrift.v1.core_event.NodeVersion> __this__nodeVersions = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(other.nodeVersions.size());
        for (com.parsable.thrift.v1.core_event.NodeVersion other_element : other.nodeVersions) {
          __this__nodeVersions.add(new com.parsable.thrift.v1.core_event.NodeVersion(other_element));
        }
        this.nodeVersions = __this__nodeVersions;
      }
    }

    public getThreadEvents_args deepCopy() {
      return new getThreadEvents_args(this);
    }

    @Override
    public void clear() {
      this.threadId = null;
      this.nodeVersions = null;
    }

    public String getThreadId() {
      return this.threadId;
    }

    public getThreadEvents_args setThreadId(String threadId) {
      this.threadId = threadId;
      return this;
    }

    public void unsetThreadId() {
      this.threadId = null;
    }

    /** Returns true if field threadId is set (has been assigned a value) and false otherwise */
    public boolean isSetThreadId() {
      return this.threadId != null;
    }

    public void setThreadIdIsSet(boolean value) {
      if (!value) {
        this.threadId = null;
      }
    }

    public int getNodeVersionsSize() {
      return (this.nodeVersions == null) ? 0 : this.nodeVersions.size();
    }

    public java.util.Iterator<com.parsable.thrift.v1.core_event.NodeVersion> getNodeVersionsIterator() {
      return (this.nodeVersions == null) ? null : this.nodeVersions.iterator();
    }

    public void addToNodeVersions(com.parsable.thrift.v1.core_event.NodeVersion elem) {
      if (this.nodeVersions == null) {
        this.nodeVersions = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>();
      }
      this.nodeVersions.add(elem);
    }

    public List<com.parsable.thrift.v1.core_event.NodeVersion> getNodeVersions() {
      return this.nodeVersions;
    }

    public getThreadEvents_args setNodeVersions(List<com.parsable.thrift.v1.core_event.NodeVersion> nodeVersions) {
      this.nodeVersions = nodeVersions;
      return this;
    }

    public void unsetNodeVersions() {
      this.nodeVersions = null;
    }

    /** Returns true if field nodeVersions is set (has been assigned a value) and false otherwise */
    public boolean isSetNodeVersions() {
      return this.nodeVersions != null;
    }

    public void setNodeVersionsIsSet(boolean value) {
      if (!value) {
        this.nodeVersions = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case THREAD_ID:
        if (value == null) {
          unsetThreadId();
        } else {
          setThreadId((String)value);
        }
        break;

      case NODE_VERSIONS:
        if (value == null) {
          unsetNodeVersions();
        } else {
          setNodeVersions((List<com.parsable.thrift.v1.core_event.NodeVersion>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case THREAD_ID:
        return getThreadId();

      case NODE_VERSIONS:
        return getNodeVersions();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case THREAD_ID:
        return isSetThreadId();
      case NODE_VERSIONS:
        return isSetNodeVersions();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof getThreadEvents_args)
        return this.equals((getThreadEvents_args)that);
      return false;
    }

    public boolean equals(getThreadEvents_args that) {
      if (that == null)
        return false;

      boolean this_present_threadId = true && this.isSetThreadId();
      boolean that_present_threadId = true && that.isSetThreadId();
      if (this_present_threadId || that_present_threadId) {
        if (!(this_present_threadId && that_present_threadId))
          return false;
        if (!this.threadId.equals(that.threadId))
          return false;
      }

      boolean this_present_nodeVersions = true && this.isSetNodeVersions();
      boolean that_present_nodeVersions = true && that.isSetNodeVersions();
      if (this_present_nodeVersions || that_present_nodeVersions) {
        if (!(this_present_nodeVersions && that_present_nodeVersions))
          return false;
        if (!this.nodeVersions.equals(that.nodeVersions))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_threadId = true && (isSetThreadId());
      list.add(present_threadId);
      if (present_threadId)
        list.add(threadId);

      boolean present_nodeVersions = true && (isSetNodeVersions());
      list.add(present_nodeVersions);
      if (present_nodeVersions)
        list.add(nodeVersions);

      return list.hashCode();
    }

    @Override
    public int compareTo(getThreadEvents_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetThreadId()).compareTo(other.isSetThreadId());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetThreadId()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadId, other.threadId);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetNodeVersions()).compareTo(other.isSetNodeVersions());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetNodeVersions()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeVersions, other.nodeVersions);
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
      StringBuilder sb = new StringBuilder("getThreadEvents_args(");
      boolean first = true;

      sb.append("threadId:");
      if (this.threadId == null) {
        sb.append("null");
      } else {
        sb.append(this.threadId);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("nodeVersions:");
      if (this.nodeVersions == null) {
        sb.append("null");
      } else {
        sb.append(this.nodeVersions);
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

    private static class getThreadEvents_argsStandardSchemeFactory implements SchemeFactory {
      public getThreadEvents_argsStandardScheme getScheme() {
        return new getThreadEvents_argsStandardScheme();
      }
    }

    private static class getThreadEvents_argsStandardScheme extends StandardScheme<getThreadEvents_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getThreadEvents_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // THREAD_ID
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.threadId = iprot.readString();
                struct.setThreadIdIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // NODE_VERSIONS
              if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                {
                  org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                  struct.nodeVersions = new ArrayList<com.parsable.thrift.v1.core_event.NodeVersion>(_list8.size);
                  com.parsable.thrift.v1.core_event.NodeVersion _elem9;
                  for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                  {
                    _elem9 = new com.parsable.thrift.v1.core_event.NodeVersion();
                    _elem9.read(iprot);
                    struct.nodeVersions.add(_elem9);
                  }
                  iprot.readListEnd();
                }
                struct.setNodeVersionsIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getThreadEvents_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.threadId != null) {
          oprot.writeFieldBegin(THREAD_ID_FIELD_DESC);
          oprot.writeString(struct.threadId);
          oprot.writeFieldEnd();
        }
        if (struct.nodeVersions != null) {
          oprot.writeFieldBegin(NODE_VERSIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodeVersions.size()));
            for (com.parsable.thrift.v1.core_event.NodeVersion _iter11 : struct.nodeVersions)
            {
              _iter11.write(oprot);
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

  public static class getThreadEvents_result implements org.apache.thrift.TBase<getThreadEvents_result, getThreadEvents_result._Fields>, java.io.Serializable, Cloneable, Comparable<getThreadEvents_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("getThreadEvents_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);
    private static final org.apache.thrift.protocol.TField ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("err", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new getThreadEvents_resultStandardSchemeFactory());
    }

    public ThreadEventsResult success; // required
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
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThreadEventsResult.class)));
      tmpMap.put(_Fields.ERR, new org.apache.thrift.meta_data.FieldMetaData("err", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(getThreadEvents_result.class, metaDataMap);
    }

    public getThreadEvents_result() {
    }

    public getThreadEvents_result(
      ThreadEventsResult success,
      com.wi.director.thrift.v1.common.SystemException err)
    {
      this();
      this.success = success;
      this.err = err;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public getThreadEvents_result(getThreadEvents_result other) {
      if (other.isSetSuccess()) {
        this.success = new ThreadEventsResult(other.success);
      }
      if (other.isSetErr()) {
        this.err = new com.wi.director.thrift.v1.common.SystemException(other.err);
      }
    }

    public getThreadEvents_result deepCopy() {
      return new getThreadEvents_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
      this.err = null;
    }

    public ThreadEventsResult getSuccess() {
      return this.success;
    }

    public getThreadEvents_result setSuccess(ThreadEventsResult success) {
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

    public getThreadEvents_result setErr(com.wi.director.thrift.v1.common.SystemException err) {
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
          setSuccess((ThreadEventsResult)value);
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
      if (that instanceof getThreadEvents_result)
        return this.equals((getThreadEvents_result)that);
      return false;
    }

    public boolean equals(getThreadEvents_result that) {
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
    public int compareTo(getThreadEvents_result other) {
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
      StringBuilder sb = new StringBuilder("getThreadEvents_result(");
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
      if (success != null) {
        success.validate();
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

    private static class getThreadEvents_resultStandardSchemeFactory implements SchemeFactory {
      public getThreadEvents_resultStandardScheme getScheme() {
        return new getThreadEvents_resultStandardScheme();
      }
    }

    private static class getThreadEvents_resultStandardScheme extends StandardScheme<getThreadEvents_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, getThreadEvents_result struct) throws org.apache.thrift.TException {
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
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new ThreadEventsResult();
                struct.success.read(iprot);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, getThreadEvents_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
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
