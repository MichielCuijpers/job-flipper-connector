/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.debugreport;

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
public class DebugReportParams implements org.apache.thrift.TBase<DebugReportParams, DebugReportParams._Fields>, java.io.Serializable, Cloneable, Comparable<DebugReportParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DebugReportParams");

  private static final org.apache.thrift.protocol.TField DOCS_FIELD_DESC = new org.apache.thrift.protocol.TField("docs", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField JSON_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("jsonData", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("userMessage", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField REPORT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("reportType", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DebugReportParamsStandardSchemeFactory());
  }

  public List<com.wi.director.thrift.v1.document.Document> docs; // required
  public String jsonData; // required
  public String jobId; // required
  public String userMessage; // optional
  /**
   * 
   * @see DebugReportType
   */
  public DebugReportType reportType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOCS((short)1, "docs"),
    JSON_DATA((short)2, "jsonData"),
    JOB_ID((short)3, "jobId"),
    USER_MESSAGE((short)4, "userMessage"),
    /**
     * 
     * @see DebugReportType
     */
    REPORT_TYPE((short)5, "reportType");

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
        case 1: // DOCS
          return DOCS;
        case 2: // JSON_DATA
          return JSON_DATA;
        case 3: // JOB_ID
          return JOB_ID;
        case 4: // USER_MESSAGE
          return USER_MESSAGE;
        case 5: // REPORT_TYPE
          return REPORT_TYPE;
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
  private static final _Fields optionals[] = {_Fields.USER_MESSAGE,_Fields.REPORT_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOCS, new org.apache.thrift.meta_data.FieldMetaData("docs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.document.Document.class))));
    tmpMap.put(_Fields.JSON_DATA, new org.apache.thrift.meta_data.FieldMetaData("jsonData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("jobId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("userMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPORT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("reportType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DebugReportType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DebugReportParams.class, metaDataMap);
  }

  public DebugReportParams() {
  }

  public DebugReportParams(
    List<com.wi.director.thrift.v1.document.Document> docs,
    String jsonData,
    String jobId)
  {
    this();
    this.docs = docs;
    this.jsonData = jsonData;
    this.jobId = jobId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DebugReportParams(DebugReportParams other) {
    if (other.isSetDocs()) {
      List<com.wi.director.thrift.v1.document.Document> __this__docs = new ArrayList<com.wi.director.thrift.v1.document.Document>(other.docs.size());
      for (com.wi.director.thrift.v1.document.Document other_element : other.docs) {
        __this__docs.add(new com.wi.director.thrift.v1.document.Document(other_element));
      }
      this.docs = __this__docs;
    }
    if (other.isSetJsonData()) {
      this.jsonData = other.jsonData;
    }
    if (other.isSetJobId()) {
      this.jobId = other.jobId;
    }
    if (other.isSetUserMessage()) {
      this.userMessage = other.userMessage;
    }
    if (other.isSetReportType()) {
      this.reportType = other.reportType;
    }
  }

  public DebugReportParams deepCopy() {
    return new DebugReportParams(this);
  }

  @Override
  public void clear() {
    this.docs = null;
    this.jsonData = null;
    this.jobId = null;
    this.userMessage = null;
    this.reportType = null;
  }

  public int getDocsSize() {
    return (this.docs == null) ? 0 : this.docs.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.document.Document> getDocsIterator() {
    return (this.docs == null) ? null : this.docs.iterator();
  }

  public void addToDocs(com.wi.director.thrift.v1.document.Document elem) {
    if (this.docs == null) {
      this.docs = new ArrayList<com.wi.director.thrift.v1.document.Document>();
    }
    this.docs.add(elem);
  }

  public List<com.wi.director.thrift.v1.document.Document> getDocs() {
    return this.docs;
  }

  public DebugReportParams setDocs(List<com.wi.director.thrift.v1.document.Document> docs) {
    this.docs = docs;
    return this;
  }

  public void unsetDocs() {
    this.docs = null;
  }

  /** Returns true if field docs is set (has been assigned a value) and false otherwise */
  public boolean isSetDocs() {
    return this.docs != null;
  }

  public void setDocsIsSet(boolean value) {
    if (!value) {
      this.docs = null;
    }
  }

  public String getJsonData() {
    return this.jsonData;
  }

  public DebugReportParams setJsonData(String jsonData) {
    this.jsonData = jsonData;
    return this;
  }

  public void unsetJsonData() {
    this.jsonData = null;
  }

  /** Returns true if field jsonData is set (has been assigned a value) and false otherwise */
  public boolean isSetJsonData() {
    return this.jsonData != null;
  }

  public void setJsonDataIsSet(boolean value) {
    if (!value) {
      this.jsonData = null;
    }
  }

  public String getJobId() {
    return this.jobId;
  }

  public DebugReportParams setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public void unsetJobId() {
    this.jobId = null;
  }

  /** Returns true if field jobId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return this.jobId != null;
  }

  public void setJobIdIsSet(boolean value) {
    if (!value) {
      this.jobId = null;
    }
  }

  public String getUserMessage() {
    return this.userMessage;
  }

  public DebugReportParams setUserMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  public void unsetUserMessage() {
    this.userMessage = null;
  }

  /** Returns true if field userMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetUserMessage() {
    return this.userMessage != null;
  }

  public void setUserMessageIsSet(boolean value) {
    if (!value) {
      this.userMessage = null;
    }
  }

  /**
   * 
   * @see DebugReportType
   */
  public DebugReportType getReportType() {
    return this.reportType;
  }

  /**
   * 
   * @see DebugReportType
   */
  public DebugReportParams setReportType(DebugReportType reportType) {
    this.reportType = reportType;
    return this;
  }

  public void unsetReportType() {
    this.reportType = null;
  }

  /** Returns true if field reportType is set (has been assigned a value) and false otherwise */
  public boolean isSetReportType() {
    return this.reportType != null;
  }

  public void setReportTypeIsSet(boolean value) {
    if (!value) {
      this.reportType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOCS:
      if (value == null) {
        unsetDocs();
      } else {
        setDocs((List<com.wi.director.thrift.v1.document.Document>)value);
      }
      break;

    case JSON_DATA:
      if (value == null) {
        unsetJsonData();
      } else {
        setJsonData((String)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((String)value);
      }
      break;

    case USER_MESSAGE:
      if (value == null) {
        unsetUserMessage();
      } else {
        setUserMessage((String)value);
      }
      break;

    case REPORT_TYPE:
      if (value == null) {
        unsetReportType();
      } else {
        setReportType((DebugReportType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOCS:
      return getDocs();

    case JSON_DATA:
      return getJsonData();

    case JOB_ID:
      return getJobId();

    case USER_MESSAGE:
      return getUserMessage();

    case REPORT_TYPE:
      return getReportType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOCS:
      return isSetDocs();
    case JSON_DATA:
      return isSetJsonData();
    case JOB_ID:
      return isSetJobId();
    case USER_MESSAGE:
      return isSetUserMessage();
    case REPORT_TYPE:
      return isSetReportType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DebugReportParams)
      return this.equals((DebugReportParams)that);
    return false;
  }

  public boolean equals(DebugReportParams that) {
    if (that == null)
      return false;

    boolean this_present_docs = true && this.isSetDocs();
    boolean that_present_docs = true && that.isSetDocs();
    if (this_present_docs || that_present_docs) {
      if (!(this_present_docs && that_present_docs))
        return false;
      if (!this.docs.equals(that.docs))
        return false;
    }

    boolean this_present_jsonData = true && this.isSetJsonData();
    boolean that_present_jsonData = true && that.isSetJsonData();
    if (this_present_jsonData || that_present_jsonData) {
      if (!(this_present_jsonData && that_present_jsonData))
        return false;
      if (!this.jsonData.equals(that.jsonData))
        return false;
    }

    boolean this_present_jobId = true && this.isSetJobId();
    boolean that_present_jobId = true && that.isSetJobId();
    if (this_present_jobId || that_present_jobId) {
      if (!(this_present_jobId && that_present_jobId))
        return false;
      if (!this.jobId.equals(that.jobId))
        return false;
    }

    boolean this_present_userMessage = true && this.isSetUserMessage();
    boolean that_present_userMessage = true && that.isSetUserMessage();
    if (this_present_userMessage || that_present_userMessage) {
      if (!(this_present_userMessage && that_present_userMessage))
        return false;
      if (!this.userMessage.equals(that.userMessage))
        return false;
    }

    boolean this_present_reportType = true && this.isSetReportType();
    boolean that_present_reportType = true && that.isSetReportType();
    if (this_present_reportType || that_present_reportType) {
      if (!(this_present_reportType && that_present_reportType))
        return false;
      if (!this.reportType.equals(that.reportType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_docs = true && (isSetDocs());
    list.add(present_docs);
    if (present_docs)
      list.add(docs);

    boolean present_jsonData = true && (isSetJsonData());
    list.add(present_jsonData);
    if (present_jsonData)
      list.add(jsonData);

    boolean present_jobId = true && (isSetJobId());
    list.add(present_jobId);
    if (present_jobId)
      list.add(jobId);

    boolean present_userMessage = true && (isSetUserMessage());
    list.add(present_userMessage);
    if (present_userMessage)
      list.add(userMessage);

    boolean present_reportType = true && (isSetReportType());
    list.add(present_reportType);
    if (present_reportType)
      list.add(reportType.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(DebugReportParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDocs()).compareTo(other.isSetDocs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDocs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.docs, other.docs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJsonData()).compareTo(other.isSetJsonData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJsonData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jsonData, other.jsonData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobId()).compareTo(other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobId, other.jobId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserMessage()).compareTo(other.isSetUserMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userMessage, other.userMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReportType()).compareTo(other.isSetReportType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReportType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reportType, other.reportType);
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
    StringBuilder sb = new StringBuilder("DebugReportParams(");
    boolean first = true;

    sb.append("docs:");
    if (this.docs == null) {
      sb.append("null");
    } else {
      sb.append(this.docs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jsonData:");
    if (this.jsonData == null) {
      sb.append("null");
    } else {
      sb.append(this.jsonData);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobId:");
    if (this.jobId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobId);
    }
    first = false;
    if (isSetUserMessage()) {
      if (!first) sb.append(", ");
      sb.append("userMessage:");
      if (this.userMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.userMessage);
      }
      first = false;
    }
    if (isSetReportType()) {
      if (!first) sb.append(", ");
      sb.append("reportType:");
      if (this.reportType == null) {
        sb.append("null");
      } else {
        sb.append(this.reportType);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DebugReportParamsStandardSchemeFactory implements SchemeFactory {
    public DebugReportParamsStandardScheme getScheme() {
      return new DebugReportParamsStandardScheme();
    }
  }

  private static class DebugReportParamsStandardScheme extends StandardScheme<DebugReportParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DebugReportParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOCS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.docs = new ArrayList<com.wi.director.thrift.v1.document.Document>(_list8.size);
                com.wi.director.thrift.v1.document.Document _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new com.wi.director.thrift.v1.document.Document();
                  _elem9.read(iprot);
                  struct.docs.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setDocsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JSON_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jsonData = iprot.readString();
              struct.setJsonDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobId = iprot.readString();
              struct.setJobIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userMessage = iprot.readString();
              struct.setUserMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REPORT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reportType = com.wi.director.thrift.v1.debugreport.DebugReportType.findByValue(iprot.readI32());
              struct.setReportTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DebugReportParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.docs != null) {
        oprot.writeFieldBegin(DOCS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.docs.size()));
          for (com.wi.director.thrift.v1.document.Document _iter11 : struct.docs)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.jsonData != null) {
        oprot.writeFieldBegin(JSON_DATA_FIELD_DESC);
        oprot.writeString(struct.jsonData);
        oprot.writeFieldEnd();
      }
      if (struct.jobId != null) {
        oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
        oprot.writeString(struct.jobId);
        oprot.writeFieldEnd();
      }
      if (struct.userMessage != null) {
        if (struct.isSetUserMessage()) {
          oprot.writeFieldBegin(USER_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.userMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.reportType != null) {
        if (struct.isSetReportType()) {
          oprot.writeFieldBegin(REPORT_TYPE_FIELD_DESC);
          oprot.writeI32(struct.reportType.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
