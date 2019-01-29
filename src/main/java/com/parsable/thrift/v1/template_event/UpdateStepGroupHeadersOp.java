/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.template_event;

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
public class UpdateStepGroupHeadersOp implements org.apache.thrift.TBase<UpdateStepGroupHeadersOp, UpdateStepGroupHeadersOp._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateStepGroupHeadersOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateStepGroupHeadersOp");

  private static final org.apache.thrift.protocol.TField STEP_GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stepGroupId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HEADERS_FIELD_DESC = new org.apache.thrift.protocol.TField("headers", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UpdateStepGroupHeadersOpStandardSchemeFactory());
  }

  public String stepGroupId; // optional
  public com.wi.director.thrift.v1.group_headers.StepGroupHeaders headers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STEP_GROUP_ID((short)1, "stepGroupId"),
    HEADERS((short)2, "headers");

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
        case 1: // STEP_GROUP_ID
          return STEP_GROUP_ID;
        case 2: // HEADERS
          return HEADERS;
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
  private static final _Fields optionals[] = {_Fields.STEP_GROUP_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STEP_GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("stepGroupId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.HEADERS, new org.apache.thrift.meta_data.FieldMetaData("headers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.group_headers.StepGroupHeaders.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateStepGroupHeadersOp.class, metaDataMap);
  }

  public UpdateStepGroupHeadersOp() {
  }

  public UpdateStepGroupHeadersOp(
    com.wi.director.thrift.v1.group_headers.StepGroupHeaders headers)
  {
    this();
    this.headers = headers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateStepGroupHeadersOp(UpdateStepGroupHeadersOp other) {
    if (other.isSetStepGroupId()) {
      this.stepGroupId = other.stepGroupId;
    }
    if (other.isSetHeaders()) {
      this.headers = new com.wi.director.thrift.v1.group_headers.StepGroupHeaders(other.headers);
    }
  }

  public UpdateStepGroupHeadersOp deepCopy() {
    return new UpdateStepGroupHeadersOp(this);
  }

  @Override
  public void clear() {
    this.stepGroupId = null;
    this.headers = null;
  }

  public String getStepGroupId() {
    return this.stepGroupId;
  }

  public UpdateStepGroupHeadersOp setStepGroupId(String stepGroupId) {
    this.stepGroupId = stepGroupId;
    return this;
  }

  public void unsetStepGroupId() {
    this.stepGroupId = null;
  }

  /** Returns true if field stepGroupId is set (has been assigned a value) and false otherwise */
  public boolean isSetStepGroupId() {
    return this.stepGroupId != null;
  }

  public void setStepGroupIdIsSet(boolean value) {
    if (!value) {
      this.stepGroupId = null;
    }
  }

  public com.wi.director.thrift.v1.group_headers.StepGroupHeaders getHeaders() {
    return this.headers;
  }

  public UpdateStepGroupHeadersOp setHeaders(com.wi.director.thrift.v1.group_headers.StepGroupHeaders headers) {
    this.headers = headers;
    return this;
  }

  public void unsetHeaders() {
    this.headers = null;
  }

  /** Returns true if field headers is set (has been assigned a value) and false otherwise */
  public boolean isSetHeaders() {
    return this.headers != null;
  }

  public void setHeadersIsSet(boolean value) {
    if (!value) {
      this.headers = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STEP_GROUP_ID:
      if (value == null) {
        unsetStepGroupId();
      } else {
        setStepGroupId((String)value);
      }
      break;

    case HEADERS:
      if (value == null) {
        unsetHeaders();
      } else {
        setHeaders((com.wi.director.thrift.v1.group_headers.StepGroupHeaders)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STEP_GROUP_ID:
      return getStepGroupId();

    case HEADERS:
      return getHeaders();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STEP_GROUP_ID:
      return isSetStepGroupId();
    case HEADERS:
      return isSetHeaders();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateStepGroupHeadersOp)
      return this.equals((UpdateStepGroupHeadersOp)that);
    return false;
  }

  public boolean equals(UpdateStepGroupHeadersOp that) {
    if (that == null)
      return false;

    boolean this_present_stepGroupId = true && this.isSetStepGroupId();
    boolean that_present_stepGroupId = true && that.isSetStepGroupId();
    if (this_present_stepGroupId || that_present_stepGroupId) {
      if (!(this_present_stepGroupId && that_present_stepGroupId))
        return false;
      if (!this.stepGroupId.equals(that.stepGroupId))
        return false;
    }

    boolean this_present_headers = true && this.isSetHeaders();
    boolean that_present_headers = true && that.isSetHeaders();
    if (this_present_headers || that_present_headers) {
      if (!(this_present_headers && that_present_headers))
        return false;
      if (!this.headers.equals(that.headers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stepGroupId = true && (isSetStepGroupId());
    list.add(present_stepGroupId);
    if (present_stepGroupId)
      list.add(stepGroupId);

    boolean present_headers = true && (isSetHeaders());
    list.add(present_headers);
    if (present_headers)
      list.add(headers);

    return list.hashCode();
  }

  @Override
  public int compareTo(UpdateStepGroupHeadersOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStepGroupId()).compareTo(other.isSetStepGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStepGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stepGroupId, other.stepGroupId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeaders()).compareTo(other.isSetHeaders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeaders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headers, other.headers);
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
    StringBuilder sb = new StringBuilder("UpdateStepGroupHeadersOp(");
    boolean first = true;

    if (isSetStepGroupId()) {
      sb.append("stepGroupId:");
      if (this.stepGroupId == null) {
        sb.append("null");
      } else {
        sb.append(this.stepGroupId);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("headers:");
    if (this.headers == null) {
      sb.append("null");
    } else {
      sb.append(this.headers);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (headers == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'headers' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (headers != null) {
      headers.validate();
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

  private static class UpdateStepGroupHeadersOpStandardSchemeFactory implements SchemeFactory {
    public UpdateStepGroupHeadersOpStandardScheme getScheme() {
      return new UpdateStepGroupHeadersOpStandardScheme();
    }
  }

  private static class UpdateStepGroupHeadersOpStandardScheme extends StandardScheme<UpdateStepGroupHeadersOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateStepGroupHeadersOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STEP_GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stepGroupId = iprot.readString();
              struct.setStepGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEADERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.headers = new com.wi.director.thrift.v1.group_headers.StepGroupHeaders();
              struct.headers.read(iprot);
              struct.setHeadersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateStepGroupHeadersOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stepGroupId != null) {
        if (struct.isSetStepGroupId()) {
          oprot.writeFieldBegin(STEP_GROUP_ID_FIELD_DESC);
          oprot.writeString(struct.stepGroupId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.headers != null) {
        oprot.writeFieldBegin(HEADERS_FIELD_DESC);
        struct.headers.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

