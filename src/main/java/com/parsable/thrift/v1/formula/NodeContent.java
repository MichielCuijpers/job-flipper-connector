/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.formula;

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
 * A formula term represents an parameter/argument to a formula function at a particular location.
 */
public class NodeContent extends org.apache.thrift.TUnion<NodeContent, NodeContent._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NodeContent");
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FIELD_REF_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldRef", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OPERATION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("operationName", org.apache.thrift.protocol.TType.I32, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the value is an "immediate" value, and re-uses the type of field execution data
     */
    VALUE((short)1, "value"),
    /**
     * the value is a reference to another field's input value
     */
    FIELD_REF((short)2, "fieldRef"),
    /**
     * the value is a result of calling the named function
     * 
     * @see OpName
     */
    OPERATION_NAME((short)3, "operationName");

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
        case 1: // VALUE
          return VALUE;
        case 2: // FIELD_REF
          return FIELD_REF;
        case 3: // OPERATION_NAME
          return OPERATION_NAME;
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
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.field_data.ExecutionData.class)));
    tmpMap.put(_Fields.FIELD_REF, new org.apache.thrift.meta_data.FieldMetaData("fieldRef", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FieldReference.class)));
    tmpMap.put(_Fields.OPERATION_NAME, new org.apache.thrift.meta_data.FieldMetaData("operationName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, OpName.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NodeContent.class, metaDataMap);
  }

  public NodeContent() {
    super();
  }

  public NodeContent(_Fields setField, Object value) {
    super(setField, value);
  }

  public NodeContent(NodeContent other) {
    super(other);
  }
  public NodeContent deepCopy() {
    return new NodeContent(this);
  }

  public static NodeContent value(com.wi.director.thrift.v1.field_data.ExecutionData value) {
    NodeContent x = new NodeContent();
    x.setValue(value);
    return x;
  }

  public static NodeContent fieldRef(FieldReference value) {
    NodeContent x = new NodeContent();
    x.setFieldRef(value);
    return x;
  }

  public static NodeContent operationName(OpName value) {
    NodeContent x = new NodeContent();
    x.setOperationName(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case VALUE:
        if (value instanceof com.wi.director.thrift.v1.field_data.ExecutionData) {
          break;
        }
        throw new ClassCastException("Was expecting value of type com.wi.director.thrift.v1.field_data.ExecutionData for field 'value', but got " + value.getClass().getSimpleName());
      case FIELD_REF:
        if (value instanceof FieldReference) {
          break;
        }
        throw new ClassCastException("Was expecting value of type FieldReference for field 'fieldRef', but got " + value.getClass().getSimpleName());
      case OPERATION_NAME:
        if (value instanceof OpName) {
          break;
        }
        throw new ClassCastException("Was expecting value of type OpName for field 'operationName', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case VALUE:
          if (field.type == VALUE_FIELD_DESC.type) {
            com.wi.director.thrift.v1.field_data.ExecutionData value;
            value = new com.wi.director.thrift.v1.field_data.ExecutionData();
            value.read(iprot);
            return value;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FIELD_REF:
          if (field.type == FIELD_REF_FIELD_DESC.type) {
            FieldReference fieldRef;
            fieldRef = new FieldReference();
            fieldRef.read(iprot);
            return fieldRef;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case OPERATION_NAME:
          if (field.type == OPERATION_NAME_FIELD_DESC.type) {
            OpName operationName;
            operationName = com.parsable.thrift.v1.formula.OpName.findByValue(iprot.readI32());
            return operationName;
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
      case VALUE:
        com.wi.director.thrift.v1.field_data.ExecutionData value = (com.wi.director.thrift.v1.field_data.ExecutionData)value_;
        value.write(oprot);
        return;
      case FIELD_REF:
        FieldReference fieldRef = (FieldReference)value_;
        fieldRef.write(oprot);
        return;
      case OPERATION_NAME:
        OpName operationName = (OpName)value_;
        oprot.writeI32(operationName.getValue());
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
        case VALUE:
          com.wi.director.thrift.v1.field_data.ExecutionData value;
          value = new com.wi.director.thrift.v1.field_data.ExecutionData();
          value.read(iprot);
          return value;
        case FIELD_REF:
          FieldReference fieldRef;
          fieldRef = new FieldReference();
          fieldRef.read(iprot);
          return fieldRef;
        case OPERATION_NAME:
          OpName operationName;
          operationName = com.parsable.thrift.v1.formula.OpName.findByValue(iprot.readI32());
          return operationName;
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
      case VALUE:
        com.wi.director.thrift.v1.field_data.ExecutionData value = (com.wi.director.thrift.v1.field_data.ExecutionData)value_;
        value.write(oprot);
        return;
      case FIELD_REF:
        FieldReference fieldRef = (FieldReference)value_;
        fieldRef.write(oprot);
        return;
      case OPERATION_NAME:
        OpName operationName = (OpName)value_;
        oprot.writeI32(operationName.getValue());
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case VALUE:
        return VALUE_FIELD_DESC;
      case FIELD_REF:
        return FIELD_REF_FIELD_DESC;
      case OPERATION_NAME:
        return OPERATION_NAME_FIELD_DESC;
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


  /**
   * the value is an "immediate" value, and re-uses the type of field execution data
   */
  public com.wi.director.thrift.v1.field_data.ExecutionData getValue() {
    if (getSetField() == _Fields.VALUE) {
      return (com.wi.director.thrift.v1.field_data.ExecutionData)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'value' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * the value is an "immediate" value, and re-uses the type of field execution data
   */
  public void setValue(com.wi.director.thrift.v1.field_data.ExecutionData value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.VALUE;
    value_ = value;
  }

  /**
   * the value is a reference to another field's input value
   */
  public FieldReference getFieldRef() {
    if (getSetField() == _Fields.FIELD_REF) {
      return (FieldReference)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'fieldRef' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * the value is a reference to another field's input value
   */
  public void setFieldRef(FieldReference value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.FIELD_REF;
    value_ = value;
  }

  /**
   * the value is a result of calling the named function
   * 
   * @see OpName
   */
  public OpName getOperationName() {
    if (getSetField() == _Fields.OPERATION_NAME) {
      return (OpName)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'operationName' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * the value is a result of calling the named function
   * 
   * @see OpName
   */
  public void setOperationName(OpName value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.OPERATION_NAME;
    value_ = value;
  }

  public boolean isSetValue() {
    return setField_ == _Fields.VALUE;
  }


  public boolean isSetFieldRef() {
    return setField_ == _Fields.FIELD_REF;
  }


  public boolean isSetOperationName() {
    return setField_ == _Fields.OPERATION_NAME;
  }


  public boolean equals(Object other) {
    if (other instanceof NodeContent) {
      return equals((NodeContent)other);
    } else {
      return false;
    }
  }

  public boolean equals(NodeContent other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(NodeContent other) {
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
