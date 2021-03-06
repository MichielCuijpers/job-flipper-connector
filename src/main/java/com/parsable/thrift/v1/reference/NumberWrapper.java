/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.reference;

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
public class NumberWrapper implements org.apache.thrift.TBase<NumberWrapper, NumberWrapper._Fields>, java.io.Serializable, Cloneable, Comparable<NumberWrapper> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NumberWrapper");

  private static final org.apache.thrift.protocol.TField REFERENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("reference", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("number", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NumberWrapperStandardSchemeFactory());
  }

  public Reference reference; // optional
  public com.wi.director.thrift.v1.common.PreciseNumber number; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REFERENCE((short)1, "reference"),
    NUMBER((short)2, "number");

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
        case 1: // REFERENCE
          return REFERENCE;
        case 2: // NUMBER
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

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.REFERENCE,_Fields.NUMBER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REFERENCE, new org.apache.thrift.meta_data.FieldMetaData("reference", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Reference.class)));
    tmpMap.put(_Fields.NUMBER, new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.common.PreciseNumber.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NumberWrapper.class, metaDataMap);
  }

  public NumberWrapper() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NumberWrapper(NumberWrapper other) {
    if (other.isSetReference()) {
      this.reference = new Reference(other.reference);
    }
    if (other.isSetNumber()) {
      this.number = new com.wi.director.thrift.v1.common.PreciseNumber(other.number);
    }
  }

  public NumberWrapper deepCopy() {
    return new NumberWrapper(this);
  }

  @Override
  public void clear() {
    this.reference = null;
    this.number = null;
  }

  public Reference getReference() {
    return this.reference;
  }

  public NumberWrapper setReference(Reference reference) {
    this.reference = reference;
    return this;
  }

  public void unsetReference() {
    this.reference = null;
  }

  /** Returns true if field reference is set (has been assigned a value) and false otherwise */
  public boolean isSetReference() {
    return this.reference != null;
  }

  public void setReferenceIsSet(boolean value) {
    if (!value) {
      this.reference = null;
    }
  }

  public com.wi.director.thrift.v1.common.PreciseNumber getNumber() {
    return this.number;
  }

  public NumberWrapper setNumber(com.wi.director.thrift.v1.common.PreciseNumber number) {
    this.number = number;
    return this;
  }

  public void unsetNumber() {
    this.number = null;
  }

  /** Returns true if field number is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber() {
    return this.number != null;
  }

  public void setNumberIsSet(boolean value) {
    if (!value) {
      this.number = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REFERENCE:
      if (value == null) {
        unsetReference();
      } else {
        setReference((Reference)value);
      }
      break;

    case NUMBER:
      if (value == null) {
        unsetNumber();
      } else {
        setNumber((com.wi.director.thrift.v1.common.PreciseNumber)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REFERENCE:
      return getReference();

    case NUMBER:
      return getNumber();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REFERENCE:
      return isSetReference();
    case NUMBER:
      return isSetNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NumberWrapper)
      return this.equals((NumberWrapper)that);
    return false;
  }

  public boolean equals(NumberWrapper that) {
    if (that == null)
      return false;

    boolean this_present_reference = true && this.isSetReference();
    boolean that_present_reference = true && that.isSetReference();
    if (this_present_reference || that_present_reference) {
      if (!(this_present_reference && that_present_reference))
        return false;
      if (!this.reference.equals(that.reference))
        return false;
    }

    boolean this_present_number = true && this.isSetNumber();
    boolean that_present_number = true && that.isSetNumber();
    if (this_present_number || that_present_number) {
      if (!(this_present_number && that_present_number))
        return false;
      if (!this.number.equals(that.number))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_reference = true && (isSetReference());
    list.add(present_reference);
    if (present_reference)
      list.add(reference);

    boolean present_number = true && (isSetNumber());
    list.add(present_number);
    if (present_number)
      list.add(number);

    return list.hashCode();
  }

  @Override
  public int compareTo(NumberWrapper other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReference()).compareTo(other.isSetReference());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReference()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reference, other.reference);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumber()).compareTo(other.isSetNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.number, other.number);
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
    StringBuilder sb = new StringBuilder("NumberWrapper(");
    boolean first = true;

    if (isSetReference()) {
      sb.append("reference:");
      if (this.reference == null) {
        sb.append("null");
      } else {
        sb.append(this.reference);
      }
      first = false;
    }
    if (isSetNumber()) {
      if (!first) sb.append(", ");
      sb.append("number:");
      if (this.number == null) {
        sb.append("null");
      } else {
        sb.append(this.number);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (number != null) {
      number.validate();
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

  private static class NumberWrapperStandardSchemeFactory implements SchemeFactory {
    public NumberWrapperStandardScheme getScheme() {
      return new NumberWrapperStandardScheme();
    }
  }

  private static class NumberWrapperStandardScheme extends StandardScheme<NumberWrapper> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NumberWrapper struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REFERENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.reference = new Reference();
              struct.reference.read(iprot);
              struct.setReferenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.number = new com.wi.director.thrift.v1.common.PreciseNumber();
              struct.number.read(iprot);
              struct.setNumberIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NumberWrapper struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reference != null) {
        if (struct.isSetReference()) {
          oprot.writeFieldBegin(REFERENCE_FIELD_DESC);
          struct.reference.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.number != null) {
        if (struct.isSetNumber()) {
          oprot.writeFieldBegin(NUMBER_FIELD_DESC);
          struct.number.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

