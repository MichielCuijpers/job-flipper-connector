/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.mesh;

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
public class GetDocumentResult implements org.apache.thrift.TBase<GetDocumentResult, GetDocumentResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetDocumentResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetDocumentResult");

  private static final org.apache.thrift.protocol.TField DOCUMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("document", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WAITING_FIELD_DESC = new org.apache.thrift.protocol.TField("waiting", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetDocumentResultStandardSchemeFactory());
  }

  public ByteBuffer document; // required
  public List<MeshHeader> waiting; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOCUMENT((short)1, "document"),
    WAITING((short)2, "waiting");

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
        case 1: // DOCUMENT
          return DOCUMENT;
        case 2: // WAITING
          return WAITING;
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
    tmpMap.put(_Fields.DOCUMENT, new org.apache.thrift.meta_data.FieldMetaData("document", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.WAITING, new org.apache.thrift.meta_data.FieldMetaData("waiting", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MeshHeader.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetDocumentResult.class, metaDataMap);
  }

  public GetDocumentResult() {
  }

  public GetDocumentResult(
    ByteBuffer document,
    List<MeshHeader> waiting)
  {
    this();
    this.document = org.apache.thrift.TBaseHelper.copyBinary(document);
    this.waiting = waiting;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetDocumentResult(GetDocumentResult other) {
    if (other.isSetDocument()) {
      this.document = org.apache.thrift.TBaseHelper.copyBinary(other.document);
    }
    if (other.isSetWaiting()) {
      List<MeshHeader> __this__waiting = new ArrayList<MeshHeader>(other.waiting.size());
      for (MeshHeader other_element : other.waiting) {
        __this__waiting.add(new MeshHeader(other_element));
      }
      this.waiting = __this__waiting;
    }
  }

  public GetDocumentResult deepCopy() {
    return new GetDocumentResult(this);
  }

  @Override
  public void clear() {
    this.document = null;
    this.waiting = null;
  }

  public byte[] getDocument() {
    setDocument(org.apache.thrift.TBaseHelper.rightSize(document));
    return document == null ? null : document.array();
  }

  public ByteBuffer bufferForDocument() {
    return org.apache.thrift.TBaseHelper.copyBinary(document);
  }

  public GetDocumentResult setDocument(byte[] document) {
    this.document = document == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(document, document.length));
    return this;
  }

  public GetDocumentResult setDocument(ByteBuffer document) {
    this.document = org.apache.thrift.TBaseHelper.copyBinary(document);
    return this;
  }

  public void unsetDocument() {
    this.document = null;
  }

  /** Returns true if field document is set (has been assigned a value) and false otherwise */
  public boolean isSetDocument() {
    return this.document != null;
  }

  public void setDocumentIsSet(boolean value) {
    if (!value) {
      this.document = null;
    }
  }

  public int getWaitingSize() {
    return (this.waiting == null) ? 0 : this.waiting.size();
  }

  public java.util.Iterator<MeshHeader> getWaitingIterator() {
    return (this.waiting == null) ? null : this.waiting.iterator();
  }

  public void addToWaiting(MeshHeader elem) {
    if (this.waiting == null) {
      this.waiting = new ArrayList<MeshHeader>();
    }
    this.waiting.add(elem);
  }

  public List<MeshHeader> getWaiting() {
    return this.waiting;
  }

  public GetDocumentResult setWaiting(List<MeshHeader> waiting) {
    this.waiting = waiting;
    return this;
  }

  public void unsetWaiting() {
    this.waiting = null;
  }

  /** Returns true if field waiting is set (has been assigned a value) and false otherwise */
  public boolean isSetWaiting() {
    return this.waiting != null;
  }

  public void setWaitingIsSet(boolean value) {
    if (!value) {
      this.waiting = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOCUMENT:
      if (value == null) {
        unsetDocument();
      } else {
        setDocument((ByteBuffer)value);
      }
      break;

    case WAITING:
      if (value == null) {
        unsetWaiting();
      } else {
        setWaiting((List<MeshHeader>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOCUMENT:
      return getDocument();

    case WAITING:
      return getWaiting();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOCUMENT:
      return isSetDocument();
    case WAITING:
      return isSetWaiting();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetDocumentResult)
      return this.equals((GetDocumentResult)that);
    return false;
  }

  public boolean equals(GetDocumentResult that) {
    if (that == null)
      return false;

    boolean this_present_document = true && this.isSetDocument();
    boolean that_present_document = true && that.isSetDocument();
    if (this_present_document || that_present_document) {
      if (!(this_present_document && that_present_document))
        return false;
      if (!this.document.equals(that.document))
        return false;
    }

    boolean this_present_waiting = true && this.isSetWaiting();
    boolean that_present_waiting = true && that.isSetWaiting();
    if (this_present_waiting || that_present_waiting) {
      if (!(this_present_waiting && that_present_waiting))
        return false;
      if (!this.waiting.equals(that.waiting))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_document = true && (isSetDocument());
    list.add(present_document);
    if (present_document)
      list.add(document);

    boolean present_waiting = true && (isSetWaiting());
    list.add(present_waiting);
    if (present_waiting)
      list.add(waiting);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetDocumentResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDocument()).compareTo(other.isSetDocument());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDocument()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.document, other.document);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWaiting()).compareTo(other.isSetWaiting());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWaiting()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.waiting, other.waiting);
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
    StringBuilder sb = new StringBuilder("GetDocumentResult(");
    boolean first = true;

    sb.append("document:");
    if (this.document == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.document, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("waiting:");
    if (this.waiting == null) {
      sb.append("null");
    } else {
      sb.append(this.waiting);
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

  private static class GetDocumentResultStandardSchemeFactory implements SchemeFactory {
    public GetDocumentResultStandardScheme getScheme() {
      return new GetDocumentResultStandardScheme();
    }
  }

  private static class GetDocumentResultStandardScheme extends StandardScheme<GetDocumentResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetDocumentResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOCUMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.document = iprot.readBinary();
              struct.setDocumentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WAITING
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.waiting = new ArrayList<MeshHeader>(_list16.size);
                MeshHeader _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new MeshHeader();
                  _elem17.read(iprot);
                  struct.waiting.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setWaitingIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetDocumentResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.document != null) {
        oprot.writeFieldBegin(DOCUMENT_FIELD_DESC);
        oprot.writeBinary(struct.document);
        oprot.writeFieldEnd();
      }
      if (struct.waiting != null) {
        oprot.writeFieldBegin(WAITING_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.waiting.size()));
          for (MeshHeader _iter19 : struct.waiting)
          {
            _iter19.write(oprot);
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

