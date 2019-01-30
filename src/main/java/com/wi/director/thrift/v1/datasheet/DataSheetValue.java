/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.datasheet;

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
public class DataSheetValue extends org.apache.thrift.TUnion<DataSheetValue, DataSheetValue._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataSheetValue");
  private static final org.apache.thrift.protocol.TField NULL_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("nullValue", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("number", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Representing the default empty holder, can be customized
     */
    NULL_VALUE((short)1, "nullValue"),
    TEXT((short)2, "text"),
    NUMBER((short)3, "number");

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
        case 1: // NULL_VALUE
          return NULL_VALUE;
        case 2: // TEXT
          return TEXT;
        case 3: // NUMBER
          return NUMBER;
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
    tmpMap.put(_Fields.NULL_VALUE, new org.apache.thrift.meta_data.FieldMetaData("nullValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER, new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.common.PreciseNumber.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataSheetValue.class, metaDataMap);
  }

  public DataSheetValue() {
    super();
  }

  public DataSheetValue(_Fields setField, Object value) {
    super(setField, value);
  }

  public DataSheetValue(DataSheetValue other) {
    super(other);
  }
  public DataSheetValue deepCopy() {
    return new DataSheetValue(this);
  }

  public static DataSheetValue nullValue(String value) {
    DataSheetValue x = new DataSheetValue();
    x.setNullValue(value);
    return x;
  }

  public static DataSheetValue text(String value) {
    DataSheetValue x = new DataSheetValue();
    x.setText(value);
    return x;
  }

  public static DataSheetValue number(com.wi.director.thrift.v1.common.PreciseNumber value) {
    DataSheetValue x = new DataSheetValue();
    x.setNumber(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case NULL_VALUE:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'nullValue', but got " + value.getClass().getSimpleName());
      case TEXT:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'text', but got " + value.getClass().getSimpleName());
      case NUMBER:
        if (value instanceof com.wi.director.thrift.v1.common.PreciseNumber) {
          break;
        }
        throw new ClassCastException("Was expecting value of type com.wi.director.thrift.v1.common.PreciseNumber for field 'number', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case NULL_VALUE:
          if (field.type == NULL_VALUE_FIELD_DESC.type) {
            String nullValue;
            nullValue = iprot.readString();
            return nullValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TEXT:
          if (field.type == TEXT_FIELD_DESC.type) {
            String text;
            text = iprot.readString();
            return text;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NUMBER:
          if (field.type == NUMBER_FIELD_DESC.type) {
            com.wi.director.thrift.v1.common.PreciseNumber number;
            number = new com.wi.director.thrift.v1.common.PreciseNumber();
            number.read(iprot);
            return number;
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
      case NULL_VALUE:
        String nullValue = (String)value_;
        oprot.writeString(nullValue);
        return;
      case TEXT:
        String text = (String)value_;
        oprot.writeString(text);
        return;
      case NUMBER:
        com.wi.director.thrift.v1.common.PreciseNumber number = (com.wi.director.thrift.v1.common.PreciseNumber)value_;
        number.write(oprot);
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
        case NULL_VALUE:
          String nullValue;
          nullValue = iprot.readString();
          return nullValue;
        case TEXT:
          String text;
          text = iprot.readString();
          return text;
        case NUMBER:
          com.wi.director.thrift.v1.common.PreciseNumber number;
          number = new com.wi.director.thrift.v1.common.PreciseNumber();
          number.read(iprot);
          return number;
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
      case NULL_VALUE:
        String nullValue = (String)value_;
        oprot.writeString(nullValue);
        return;
      case TEXT:
        String text = (String)value_;
        oprot.writeString(text);
        return;
      case NUMBER:
        com.wi.director.thrift.v1.common.PreciseNumber number = (com.wi.director.thrift.v1.common.PreciseNumber)value_;
        number.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case NULL_VALUE:
        return NULL_VALUE_FIELD_DESC;
      case TEXT:
        return TEXT_FIELD_DESC;
      case NUMBER:
        return NUMBER_FIELD_DESC;
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
   * Representing the default empty holder, can be customized
   */
  public String getNullValue() {
    if (getSetField() == _Fields.NULL_VALUE) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'nullValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * Representing the default empty holder, can be customized
   */
  public void setNullValue(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.NULL_VALUE;
    value_ = value;
  }

  public String getText() {
    if (getSetField() == _Fields.TEXT) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'text' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setText(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.TEXT;
    value_ = value;
  }

  public com.wi.director.thrift.v1.common.PreciseNumber getNumber() {
    if (getSetField() == _Fields.NUMBER) {
      return (com.wi.director.thrift.v1.common.PreciseNumber)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'number' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNumber(com.wi.director.thrift.v1.common.PreciseNumber value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.NUMBER;
    value_ = value;
  }

  public boolean isSetNullValue() {
    return setField_ == _Fields.NULL_VALUE;
  }


  public boolean isSetText() {
    return setField_ == _Fields.TEXT;
  }


  public boolean isSetNumber() {
    return setField_ == _Fields.NUMBER;
  }


  public boolean equals(Object other) {
    if (other instanceof DataSheetValue) {
      return equals((DataSheetValue)other);
    } else {
      return false;
    }
  }

  public boolean equals(DataSheetValue other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(DataSheetValue other) {
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