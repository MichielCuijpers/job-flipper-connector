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
public class MessageOp implements org.apache.thrift.TBase<MessageOp, MessageOp._Fields>, java.io.Serializable, Cloneable, Comparable<MessageOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MessageOp");

  private static final org.apache.thrift.protocol.TField BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("body", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STRUCTURED_BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("structuredBody", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("category", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageOpStandardSchemeFactory());
  }

  public String body; // required
  public com.wi.director.thrift.v1.messaging.StructuredBody structuredBody; // optional
  /**
   * 
   * @see com.wi.director.thrift.v1.messaging.ThreadMessageCategory
   */
  public com.wi.director.thrift.v1.messaging.ThreadMessageCategory category; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BODY((short)1, "body"),
    STRUCTURED_BODY((short)2, "structuredBody"),
    /**
     * 
     * @see com.wi.director.thrift.v1.messaging.ThreadMessageCategory
     */
    CATEGORY((short)3, "category");

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
        case 1: // BODY
          return BODY;
        case 2: // STRUCTURED_BODY
          return STRUCTURED_BODY;
        case 3: // CATEGORY
          return CATEGORY;
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
  private static final _Fields optionals[] = {_Fields.STRUCTURED_BODY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BODY, new org.apache.thrift.meta_data.FieldMetaData("body", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STRUCTURED_BODY, new org.apache.thrift.meta_data.FieldMetaData("structuredBody", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.messaging.StructuredBody.class)));
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("category", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.wi.director.thrift.v1.messaging.ThreadMessageCategory.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MessageOp.class, metaDataMap);
  }

  public MessageOp() {
  }

  public MessageOp(
    String body,
    com.wi.director.thrift.v1.messaging.ThreadMessageCategory category)
  {
    this();
    this.body = body;
    this.category = category;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageOp(MessageOp other) {
    if (other.isSetBody()) {
      this.body = other.body;
    }
    if (other.isSetStructuredBody()) {
      this.structuredBody = new com.wi.director.thrift.v1.messaging.StructuredBody(other.structuredBody);
    }
    if (other.isSetCategory()) {
      this.category = other.category;
    }
  }

  public MessageOp deepCopy() {
    return new MessageOp(this);
  }

  @Override
  public void clear() {
    this.body = null;
    this.structuredBody = null;
    this.category = null;
  }

  public String getBody() {
    return this.body;
  }

  public MessageOp setBody(String body) {
    this.body = body;
    return this;
  }

  public void unsetBody() {
    this.body = null;
  }

  /** Returns true if field body is set (has been assigned a value) and false otherwise */
  public boolean isSetBody() {
    return this.body != null;
  }

  public void setBodyIsSet(boolean value) {
    if (!value) {
      this.body = null;
    }
  }

  public com.wi.director.thrift.v1.messaging.StructuredBody getStructuredBody() {
    return this.structuredBody;
  }

  public MessageOp setStructuredBody(com.wi.director.thrift.v1.messaging.StructuredBody structuredBody) {
    this.structuredBody = structuredBody;
    return this;
  }

  public void unsetStructuredBody() {
    this.structuredBody = null;
  }

  /** Returns true if field structuredBody is set (has been assigned a value) and false otherwise */
  public boolean isSetStructuredBody() {
    return this.structuredBody != null;
  }

  public void setStructuredBodyIsSet(boolean value) {
    if (!value) {
      this.structuredBody = null;
    }
  }

  /**
   * 
   * @see com.wi.director.thrift.v1.messaging.ThreadMessageCategory
   */
  public com.wi.director.thrift.v1.messaging.ThreadMessageCategory getCategory() {
    return this.category;
  }

  /**
   * 
   * @see com.wi.director.thrift.v1.messaging.ThreadMessageCategory
   */
  public MessageOp setCategory(com.wi.director.thrift.v1.messaging.ThreadMessageCategory category) {
    this.category = category;
    return this;
  }

  public void unsetCategory() {
    this.category = null;
  }

  /** Returns true if field category is set (has been assigned a value) and false otherwise */
  public boolean isSetCategory() {
    return this.category != null;
  }

  public void setCategoryIsSet(boolean value) {
    if (!value) {
      this.category = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BODY:
      if (value == null) {
        unsetBody();
      } else {
        setBody((String)value);
      }
      break;

    case STRUCTURED_BODY:
      if (value == null) {
        unsetStructuredBody();
      } else {
        setStructuredBody((com.wi.director.thrift.v1.messaging.StructuredBody)value);
      }
      break;

    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((com.wi.director.thrift.v1.messaging.ThreadMessageCategory)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BODY:
      return getBody();

    case STRUCTURED_BODY:
      return getStructuredBody();

    case CATEGORY:
      return getCategory();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BODY:
      return isSetBody();
    case STRUCTURED_BODY:
      return isSetStructuredBody();
    case CATEGORY:
      return isSetCategory();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageOp)
      return this.equals((MessageOp)that);
    return false;
  }

  public boolean equals(MessageOp that) {
    if (that == null)
      return false;

    boolean this_present_body = true && this.isSetBody();
    boolean that_present_body = true && that.isSetBody();
    if (this_present_body || that_present_body) {
      if (!(this_present_body && that_present_body))
        return false;
      if (!this.body.equals(that.body))
        return false;
    }

    boolean this_present_structuredBody = true && this.isSetStructuredBody();
    boolean that_present_structuredBody = true && that.isSetStructuredBody();
    if (this_present_structuredBody || that_present_structuredBody) {
      if (!(this_present_structuredBody && that_present_structuredBody))
        return false;
      if (!this.structuredBody.equals(that.structuredBody))
        return false;
    }

    boolean this_present_category = true && this.isSetCategory();
    boolean that_present_category = true && that.isSetCategory();
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_body = true && (isSetBody());
    list.add(present_body);
    if (present_body)
      list.add(body);

    boolean present_structuredBody = true && (isSetStructuredBody());
    list.add(present_structuredBody);
    if (present_structuredBody)
      list.add(structuredBody);

    boolean present_category = true && (isSetCategory());
    list.add(present_category);
    if (present_category)
      list.add(category.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(MessageOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBody()).compareTo(other.isSetBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.body, other.body);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStructuredBody()).compareTo(other.isSetStructuredBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStructuredBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.structuredBody, other.structuredBody);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCategory()).compareTo(other.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.category, other.category);
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
    StringBuilder sb = new StringBuilder("MessageOp(");
    boolean first = true;

    sb.append("body:");
    if (this.body == null) {
      sb.append("null");
    } else {
      sb.append(this.body);
    }
    first = false;
    if (isSetStructuredBody()) {
      if (!first) sb.append(", ");
      sb.append("structuredBody:");
      if (this.structuredBody == null) {
        sb.append("null");
      } else {
        sb.append(this.structuredBody);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("category:");
    if (this.category == null) {
      sb.append("null");
    } else {
      sb.append(this.category);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (body == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'body' was not present! Struct: " + toString());
    }
    if (category == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'category' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (structuredBody != null) {
      structuredBody.validate();
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

  private static class MessageOpStandardSchemeFactory implements SchemeFactory {
    public MessageOpStandardScheme getScheme() {
      return new MessageOpStandardScheme();
    }
  }

  private static class MessageOpStandardScheme extends StandardScheme<MessageOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MessageOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BODY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.body = iprot.readString();
              struct.setBodyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STRUCTURED_BODY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.structuredBody = new com.wi.director.thrift.v1.messaging.StructuredBody();
              struct.structuredBody.read(iprot);
              struct.setStructuredBodyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.category = com.wi.director.thrift.v1.messaging.ThreadMessageCategory.findByValue(iprot.readI32());
              struct.setCategoryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MessageOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.body != null) {
        oprot.writeFieldBegin(BODY_FIELD_DESC);
        oprot.writeString(struct.body);
        oprot.writeFieldEnd();
      }
      if (struct.structuredBody != null) {
        if (struct.isSetStructuredBody()) {
          oprot.writeFieldBegin(STRUCTURED_BODY_FIELD_DESC);
          struct.structuredBody.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.category != null) {
        oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
        oprot.writeI32(struct.category.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

