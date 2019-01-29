/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.metadata;

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
 * NOHTML
 * MetadataMultiselectListVal contains a list of MetadataListVal, each of which represents a chosen list option
 * Note: list was chosen over set because there are issues writing sets of objects into json. If we ever want
 * to be able to send events using a json protocol, we should avoid sets of objects
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class MetadataMultiselectListVal implements org.apache.thrift.TBase<MetadataMultiselectListVal, MetadataMultiselectListVal._Fields>, java.io.Serializable, Cloneable, Comparable<MetadataMultiselectListVal> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetadataMultiselectListVal");

  private static final org.apache.thrift.protocol.TField SELECTED_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("selectedValues", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetadataMultiselectListValStandardSchemeFactory());
  }

  public List<MetadataListVal> selectedValues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SELECTED_VALUES((short)1, "selectedValues");

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
        case 1: // SELECTED_VALUES
          return SELECTED_VALUES;
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
    tmpMap.put(_Fields.SELECTED_VALUES, new org.apache.thrift.meta_data.FieldMetaData("selectedValues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetadataListVal.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetadataMultiselectListVal.class, metaDataMap);
  }

  public MetadataMultiselectListVal() {
  }

  public MetadataMultiselectListVal(
    List<MetadataListVal> selectedValues)
  {
    this();
    this.selectedValues = selectedValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetadataMultiselectListVal(MetadataMultiselectListVal other) {
    if (other.isSetSelectedValues()) {
      List<MetadataListVal> __this__selectedValues = new ArrayList<MetadataListVal>(other.selectedValues.size());
      for (MetadataListVal other_element : other.selectedValues) {
        __this__selectedValues.add(new MetadataListVal(other_element));
      }
      this.selectedValues = __this__selectedValues;
    }
  }

  public MetadataMultiselectListVal deepCopy() {
    return new MetadataMultiselectListVal(this);
  }

  @Override
  public void clear() {
    this.selectedValues = null;
  }

  public int getSelectedValuesSize() {
    return (this.selectedValues == null) ? 0 : this.selectedValues.size();
  }

  public java.util.Iterator<MetadataListVal> getSelectedValuesIterator() {
    return (this.selectedValues == null) ? null : this.selectedValues.iterator();
  }

  public void addToSelectedValues(MetadataListVal elem) {
    if (this.selectedValues == null) {
      this.selectedValues = new ArrayList<MetadataListVal>();
    }
    this.selectedValues.add(elem);
  }

  public List<MetadataListVal> getSelectedValues() {
    return this.selectedValues;
  }

  public MetadataMultiselectListVal setSelectedValues(List<MetadataListVal> selectedValues) {
    this.selectedValues = selectedValues;
    return this;
  }

  public void unsetSelectedValues() {
    this.selectedValues = null;
  }

  /** Returns true if field selectedValues is set (has been assigned a value) and false otherwise */
  public boolean isSetSelectedValues() {
    return this.selectedValues != null;
  }

  public void setSelectedValuesIsSet(boolean value) {
    if (!value) {
      this.selectedValues = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SELECTED_VALUES:
      if (value == null) {
        unsetSelectedValues();
      } else {
        setSelectedValues((List<MetadataListVal>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SELECTED_VALUES:
      return getSelectedValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SELECTED_VALUES:
      return isSetSelectedValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetadataMultiselectListVal)
      return this.equals((MetadataMultiselectListVal)that);
    return false;
  }

  public boolean equals(MetadataMultiselectListVal that) {
    if (that == null)
      return false;

    boolean this_present_selectedValues = true && this.isSetSelectedValues();
    boolean that_present_selectedValues = true && that.isSetSelectedValues();
    if (this_present_selectedValues || that_present_selectedValues) {
      if (!(this_present_selectedValues && that_present_selectedValues))
        return false;
      if (!this.selectedValues.equals(that.selectedValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_selectedValues = true && (isSetSelectedValues());
    list.add(present_selectedValues);
    if (present_selectedValues)
      list.add(selectedValues);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetadataMultiselectListVal other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSelectedValues()).compareTo(other.isSetSelectedValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSelectedValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.selectedValues, other.selectedValues);
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
    StringBuilder sb = new StringBuilder("MetadataMultiselectListVal(");
    boolean first = true;

    sb.append("selectedValues:");
    if (this.selectedValues == null) {
      sb.append("null");
    } else {
      sb.append(this.selectedValues);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (selectedValues == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'selectedValues' was not present! Struct: " + toString());
    }
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

  private static class MetadataMultiselectListValStandardSchemeFactory implements SchemeFactory {
    public MetadataMultiselectListValStandardScheme getScheme() {
      return new MetadataMultiselectListValStandardScheme();
    }
  }

  private static class MetadataMultiselectListValStandardScheme extends StandardScheme<MetadataMultiselectListVal> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetadataMultiselectListVal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SELECTED_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.selectedValues = new ArrayList<MetadataListVal>(_list0.size);
                MetadataListVal _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new MetadataListVal();
                  _elem1.read(iprot);
                  struct.selectedValues.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSelectedValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetadataMultiselectListVal struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.selectedValues != null) {
        oprot.writeFieldBegin(SELECTED_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.selectedValues.size()));
          for (MetadataListVal _iter3 : struct.selectedValues)
          {
            _iter3.write(oprot);
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

