/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.job_event;

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
public class CreateClientDocumentsResult implements org.apache.thrift.TBase<CreateClientDocumentsResult, CreateClientDocumentsResult._Fields>, java.io.Serializable, Cloneable, Comparable<CreateClientDocumentsResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateClientDocumentsResult");

  private static final org.apache.thrift.protocol.TField CREATED_PENDING_DOCUMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("createdPendingDocuments", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EXISTING_DOCUMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("existingDocuments", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField FAILED_DOCUMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("failedDocuments", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateClientDocumentsResultStandardSchemeFactory());
  }

  public List<com.wi.director.thrift.v1.document.Document> createdPendingDocuments; // required
  public List<com.wi.director.thrift.v1.document.Document> existingDocuments; // required
  public List<com.wi.director.thrift.v1.document.Document> failedDocuments; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREATED_PENDING_DOCUMENTS((short)1, "createdPendingDocuments"),
    EXISTING_DOCUMENTS((short)2, "existingDocuments"),
    FAILED_DOCUMENTS((short)3, "failedDocuments");

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
        case 1: // CREATED_PENDING_DOCUMENTS
          return CREATED_PENDING_DOCUMENTS;
        case 2: // EXISTING_DOCUMENTS
          return EXISTING_DOCUMENTS;
        case 3: // FAILED_DOCUMENTS
          return FAILED_DOCUMENTS;
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
    tmpMap.put(_Fields.CREATED_PENDING_DOCUMENTS, new org.apache.thrift.meta_data.FieldMetaData("createdPendingDocuments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.document.Document.class))));
    tmpMap.put(_Fields.EXISTING_DOCUMENTS, new org.apache.thrift.meta_data.FieldMetaData("existingDocuments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.document.Document.class))));
    tmpMap.put(_Fields.FAILED_DOCUMENTS, new org.apache.thrift.meta_data.FieldMetaData("failedDocuments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.document.Document.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateClientDocumentsResult.class, metaDataMap);
  }

  public CreateClientDocumentsResult() {
  }

  public CreateClientDocumentsResult(
    List<com.wi.director.thrift.v1.document.Document> createdPendingDocuments,
    List<com.wi.director.thrift.v1.document.Document> existingDocuments,
    List<com.wi.director.thrift.v1.document.Document> failedDocuments)
  {
    this();
    this.createdPendingDocuments = createdPendingDocuments;
    this.existingDocuments = existingDocuments;
    this.failedDocuments = failedDocuments;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateClientDocumentsResult(CreateClientDocumentsResult other) {
    if (other.isSetCreatedPendingDocuments()) {
      List<com.wi.director.thrift.v1.document.Document> __this__createdPendingDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>(other.createdPendingDocuments.size());
      for (com.wi.director.thrift.v1.document.Document other_element : other.createdPendingDocuments) {
        __this__createdPendingDocuments.add(new com.wi.director.thrift.v1.document.Document(other_element));
      }
      this.createdPendingDocuments = __this__createdPendingDocuments;
    }
    if (other.isSetExistingDocuments()) {
      List<com.wi.director.thrift.v1.document.Document> __this__existingDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>(other.existingDocuments.size());
      for (com.wi.director.thrift.v1.document.Document other_element : other.existingDocuments) {
        __this__existingDocuments.add(new com.wi.director.thrift.v1.document.Document(other_element));
      }
      this.existingDocuments = __this__existingDocuments;
    }
    if (other.isSetFailedDocuments()) {
      List<com.wi.director.thrift.v1.document.Document> __this__failedDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>(other.failedDocuments.size());
      for (com.wi.director.thrift.v1.document.Document other_element : other.failedDocuments) {
        __this__failedDocuments.add(new com.wi.director.thrift.v1.document.Document(other_element));
      }
      this.failedDocuments = __this__failedDocuments;
    }
  }

  public CreateClientDocumentsResult deepCopy() {
    return new CreateClientDocumentsResult(this);
  }

  @Override
  public void clear() {
    this.createdPendingDocuments = null;
    this.existingDocuments = null;
    this.failedDocuments = null;
  }

  public int getCreatedPendingDocumentsSize() {
    return (this.createdPendingDocuments == null) ? 0 : this.createdPendingDocuments.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.document.Document> getCreatedPendingDocumentsIterator() {
    return (this.createdPendingDocuments == null) ? null : this.createdPendingDocuments.iterator();
  }

  public void addToCreatedPendingDocuments(com.wi.director.thrift.v1.document.Document elem) {
    if (this.createdPendingDocuments == null) {
      this.createdPendingDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>();
    }
    this.createdPendingDocuments.add(elem);
  }

  public List<com.wi.director.thrift.v1.document.Document> getCreatedPendingDocuments() {
    return this.createdPendingDocuments;
  }

  public CreateClientDocumentsResult setCreatedPendingDocuments(List<com.wi.director.thrift.v1.document.Document> createdPendingDocuments) {
    this.createdPendingDocuments = createdPendingDocuments;
    return this;
  }

  public void unsetCreatedPendingDocuments() {
    this.createdPendingDocuments = null;
  }

  /** Returns true if field createdPendingDocuments is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedPendingDocuments() {
    return this.createdPendingDocuments != null;
  }

  public void setCreatedPendingDocumentsIsSet(boolean value) {
    if (!value) {
      this.createdPendingDocuments = null;
    }
  }

  public int getExistingDocumentsSize() {
    return (this.existingDocuments == null) ? 0 : this.existingDocuments.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.document.Document> getExistingDocumentsIterator() {
    return (this.existingDocuments == null) ? null : this.existingDocuments.iterator();
  }

  public void addToExistingDocuments(com.wi.director.thrift.v1.document.Document elem) {
    if (this.existingDocuments == null) {
      this.existingDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>();
    }
    this.existingDocuments.add(elem);
  }

  public List<com.wi.director.thrift.v1.document.Document> getExistingDocuments() {
    return this.existingDocuments;
  }

  public CreateClientDocumentsResult setExistingDocuments(List<com.wi.director.thrift.v1.document.Document> existingDocuments) {
    this.existingDocuments = existingDocuments;
    return this;
  }

  public void unsetExistingDocuments() {
    this.existingDocuments = null;
  }

  /** Returns true if field existingDocuments is set (has been assigned a value) and false otherwise */
  public boolean isSetExistingDocuments() {
    return this.existingDocuments != null;
  }

  public void setExistingDocumentsIsSet(boolean value) {
    if (!value) {
      this.existingDocuments = null;
    }
  }

  public int getFailedDocumentsSize() {
    return (this.failedDocuments == null) ? 0 : this.failedDocuments.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.document.Document> getFailedDocumentsIterator() {
    return (this.failedDocuments == null) ? null : this.failedDocuments.iterator();
  }

  public void addToFailedDocuments(com.wi.director.thrift.v1.document.Document elem) {
    if (this.failedDocuments == null) {
      this.failedDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>();
    }
    this.failedDocuments.add(elem);
  }

  public List<com.wi.director.thrift.v1.document.Document> getFailedDocuments() {
    return this.failedDocuments;
  }

  public CreateClientDocumentsResult setFailedDocuments(List<com.wi.director.thrift.v1.document.Document> failedDocuments) {
    this.failedDocuments = failedDocuments;
    return this;
  }

  public void unsetFailedDocuments() {
    this.failedDocuments = null;
  }

  /** Returns true if field failedDocuments is set (has been assigned a value) and false otherwise */
  public boolean isSetFailedDocuments() {
    return this.failedDocuments != null;
  }

  public void setFailedDocumentsIsSet(boolean value) {
    if (!value) {
      this.failedDocuments = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CREATED_PENDING_DOCUMENTS:
      if (value == null) {
        unsetCreatedPendingDocuments();
      } else {
        setCreatedPendingDocuments((List<com.wi.director.thrift.v1.document.Document>)value);
      }
      break;

    case EXISTING_DOCUMENTS:
      if (value == null) {
        unsetExistingDocuments();
      } else {
        setExistingDocuments((List<com.wi.director.thrift.v1.document.Document>)value);
      }
      break;

    case FAILED_DOCUMENTS:
      if (value == null) {
        unsetFailedDocuments();
      } else {
        setFailedDocuments((List<com.wi.director.thrift.v1.document.Document>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATED_PENDING_DOCUMENTS:
      return getCreatedPendingDocuments();

    case EXISTING_DOCUMENTS:
      return getExistingDocuments();

    case FAILED_DOCUMENTS:
      return getFailedDocuments();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CREATED_PENDING_DOCUMENTS:
      return isSetCreatedPendingDocuments();
    case EXISTING_DOCUMENTS:
      return isSetExistingDocuments();
    case FAILED_DOCUMENTS:
      return isSetFailedDocuments();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateClientDocumentsResult)
      return this.equals((CreateClientDocumentsResult)that);
    return false;
  }

  public boolean equals(CreateClientDocumentsResult that) {
    if (that == null)
      return false;

    boolean this_present_createdPendingDocuments = true && this.isSetCreatedPendingDocuments();
    boolean that_present_createdPendingDocuments = true && that.isSetCreatedPendingDocuments();
    if (this_present_createdPendingDocuments || that_present_createdPendingDocuments) {
      if (!(this_present_createdPendingDocuments && that_present_createdPendingDocuments))
        return false;
      if (!this.createdPendingDocuments.equals(that.createdPendingDocuments))
        return false;
    }

    boolean this_present_existingDocuments = true && this.isSetExistingDocuments();
    boolean that_present_existingDocuments = true && that.isSetExistingDocuments();
    if (this_present_existingDocuments || that_present_existingDocuments) {
      if (!(this_present_existingDocuments && that_present_existingDocuments))
        return false;
      if (!this.existingDocuments.equals(that.existingDocuments))
        return false;
    }

    boolean this_present_failedDocuments = true && this.isSetFailedDocuments();
    boolean that_present_failedDocuments = true && that.isSetFailedDocuments();
    if (this_present_failedDocuments || that_present_failedDocuments) {
      if (!(this_present_failedDocuments && that_present_failedDocuments))
        return false;
      if (!this.failedDocuments.equals(that.failedDocuments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_createdPendingDocuments = true && (isSetCreatedPendingDocuments());
    list.add(present_createdPendingDocuments);
    if (present_createdPendingDocuments)
      list.add(createdPendingDocuments);

    boolean present_existingDocuments = true && (isSetExistingDocuments());
    list.add(present_existingDocuments);
    if (present_existingDocuments)
      list.add(existingDocuments);

    boolean present_failedDocuments = true && (isSetFailedDocuments());
    list.add(present_failedDocuments);
    if (present_failedDocuments)
      list.add(failedDocuments);

    return list.hashCode();
  }

  @Override
  public int compareTo(CreateClientDocumentsResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCreatedPendingDocuments()).compareTo(other.isSetCreatedPendingDocuments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedPendingDocuments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdPendingDocuments, other.createdPendingDocuments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExistingDocuments()).compareTo(other.isSetExistingDocuments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExistingDocuments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.existingDocuments, other.existingDocuments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailedDocuments()).compareTo(other.isSetFailedDocuments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailedDocuments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failedDocuments, other.failedDocuments);
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
    StringBuilder sb = new StringBuilder("CreateClientDocumentsResult(");
    boolean first = true;

    sb.append("createdPendingDocuments:");
    if (this.createdPendingDocuments == null) {
      sb.append("null");
    } else {
      sb.append(this.createdPendingDocuments);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("existingDocuments:");
    if (this.existingDocuments == null) {
      sb.append("null");
    } else {
      sb.append(this.existingDocuments);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("failedDocuments:");
    if (this.failedDocuments == null) {
      sb.append("null");
    } else {
      sb.append(this.failedDocuments);
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

  private static class CreateClientDocumentsResultStandardSchemeFactory implements SchemeFactory {
    public CreateClientDocumentsResultStandardScheme getScheme() {
      return new CreateClientDocumentsResultStandardScheme();
    }
  }

  private static class CreateClientDocumentsResultStandardScheme extends StandardScheme<CreateClientDocumentsResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateClientDocumentsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CREATED_PENDING_DOCUMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list70 = iprot.readListBegin();
                struct.createdPendingDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>(_list70.size);
                com.wi.director.thrift.v1.document.Document _elem71;
                for (int _i72 = 0; _i72 < _list70.size; ++_i72)
                {
                  _elem71 = new com.wi.director.thrift.v1.document.Document();
                  _elem71.read(iprot);
                  struct.createdPendingDocuments.add(_elem71);
                }
                iprot.readListEnd();
              }
              struct.setCreatedPendingDocumentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXISTING_DOCUMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list73 = iprot.readListBegin();
                struct.existingDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>(_list73.size);
                com.wi.director.thrift.v1.document.Document _elem74;
                for (int _i75 = 0; _i75 < _list73.size; ++_i75)
                {
                  _elem74 = new com.wi.director.thrift.v1.document.Document();
                  _elem74.read(iprot);
                  struct.existingDocuments.add(_elem74);
                }
                iprot.readListEnd();
              }
              struct.setExistingDocumentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FAILED_DOCUMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list76 = iprot.readListBegin();
                struct.failedDocuments = new ArrayList<com.wi.director.thrift.v1.document.Document>(_list76.size);
                com.wi.director.thrift.v1.document.Document _elem77;
                for (int _i78 = 0; _i78 < _list76.size; ++_i78)
                {
                  _elem77 = new com.wi.director.thrift.v1.document.Document();
                  _elem77.read(iprot);
                  struct.failedDocuments.add(_elem77);
                }
                iprot.readListEnd();
              }
              struct.setFailedDocumentsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateClientDocumentsResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.createdPendingDocuments != null) {
        oprot.writeFieldBegin(CREATED_PENDING_DOCUMENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.createdPendingDocuments.size()));
          for (com.wi.director.thrift.v1.document.Document _iter79 : struct.createdPendingDocuments)
          {
            _iter79.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.existingDocuments != null) {
        oprot.writeFieldBegin(EXISTING_DOCUMENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.existingDocuments.size()));
          for (com.wi.director.thrift.v1.document.Document _iter80 : struct.existingDocuments)
          {
            _iter80.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.failedDocuments != null) {
        oprot.writeFieldBegin(FAILED_DOCUMENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.failedDocuments.size()));
          for (com.wi.director.thrift.v1.document.Document _iter81 : struct.failedDocuments)
          {
            _iter81.write(oprot);
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
