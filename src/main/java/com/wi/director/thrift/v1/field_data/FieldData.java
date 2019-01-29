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
/**
 * Union of data about an input field
 */
public class FieldData extends org.apache.thrift.TUnion<FieldData, FieldData._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FieldData");
  private static final org.apache.thrift.protocol.TField NUMBER_CONSTRAINTS_FIELD_DESC = new org.apache.thrift.protocol.TField("numberConstraints", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LIST_OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("listOptions", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUMBER_CONSTRAINTS((short)1, "numberConstraints"),
    LIST_OPTIONS((short)2, "listOptions");

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
        case 1: // NUMBER_CONSTRAINTS
          return NUMBER_CONSTRAINTS;
        case 2: // LIST_OPTIONS
          return LIST_OPTIONS;
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
    tmpMap.put(_Fields.NUMBER_CONSTRAINTS, new org.apache.thrift.meta_data.FieldMetaData("numberConstraints", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NumberConstraints.class)));
    tmpMap.put(_Fields.LIST_OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("listOptions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ListOptions.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FieldData.class, metaDataMap);
  }

  public FieldData() {
    super();
  }

  public FieldData(_Fields setField, Object value) {
    super(setField, value);
  }

  public FieldData(FieldData other) {
    super(other);
  }
  public FieldData deepCopy() {
    return new FieldData(this);
  }

  public static FieldData numberConstraints(NumberConstraints value) {
    FieldData x = new FieldData();
    x.setNumberConstraints(value);
    return x;
  }

  public static FieldData listOptions(ListOptions value) {
    FieldData x = new FieldData();
    x.setListOptions(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case NUMBER_CONSTRAINTS:
        if (value instanceof NumberConstraints) {
          break;
        }
        throw new ClassCastException("Was expecting value of type NumberConstraints for field 'numberConstraints', but got " + value.getClass().getSimpleName());
      case LIST_OPTIONS:
        if (value instanceof ListOptions) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ListOptions for field 'listOptions', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case NUMBER_CONSTRAINTS:
          if (field.type == NUMBER_CONSTRAINTS_FIELD_DESC.type) {
            NumberConstraints numberConstraints;
            numberConstraints = new NumberConstraints();
            numberConstraints.read(iprot);
            return numberConstraints;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LIST_OPTIONS:
          if (field.type == LIST_OPTIONS_FIELD_DESC.type) {
            ListOptions listOptions;
            listOptions = new ListOptions();
            listOptions.read(iprot);
            return listOptions;
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
      case NUMBER_CONSTRAINTS:
        NumberConstraints numberConstraints = (NumberConstraints)value_;
        numberConstraints.write(oprot);
        return;
      case LIST_OPTIONS:
        ListOptions listOptions = (ListOptions)value_;
        listOptions.write(oprot);
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
        case NUMBER_CONSTRAINTS:
          NumberConstraints numberConstraints;
          numberConstraints = new NumberConstraints();
          numberConstraints.read(iprot);
          return numberConstraints;
        case LIST_OPTIONS:
          ListOptions listOptions;
          listOptions = new ListOptions();
          listOptions.read(iprot);
          return listOptions;
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
      case NUMBER_CONSTRAINTS:
        NumberConstraints numberConstraints = (NumberConstraints)value_;
        numberConstraints.write(oprot);
        return;
      case LIST_OPTIONS:
        ListOptions listOptions = (ListOptions)value_;
        listOptions.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case NUMBER_CONSTRAINTS:
        return NUMBER_CONSTRAINTS_FIELD_DESC;
      case LIST_OPTIONS:
        return LIST_OPTIONS_FIELD_DESC;
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


  public NumberConstraints getNumberConstraints() {
    if (getSetField() == _Fields.NUMBER_CONSTRAINTS) {
      return (NumberConstraints)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'numberConstraints' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNumberConstraints(NumberConstraints value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.NUMBER_CONSTRAINTS;
    value_ = value;
  }

  public ListOptions getListOptions() {
    if (getSetField() == _Fields.LIST_OPTIONS) {
      return (ListOptions)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'listOptions' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setListOptions(ListOptions value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LIST_OPTIONS;
    value_ = value;
  }

  public boolean isSetNumberConstraints() {
    return setField_ == _Fields.NUMBER_CONSTRAINTS;
  }


  public boolean isSetListOptions() {
    return setField_ == _Fields.LIST_OPTIONS;
  }


  public boolean equals(Object other) {
    if (other instanceof FieldData) {
      return equals((FieldData)other);
    } else {
      return false;
    }
  }

  public boolean equals(FieldData other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(FieldData other) {
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
