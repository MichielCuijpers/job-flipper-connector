/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.team_event;

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
public class SubdomainProperty implements org.apache.thrift.TBase<SubdomainProperty, SubdomainProperty._Fields>, java.io.Serializable, Cloneable, Comparable<SubdomainProperty> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SubdomainProperty");

  private static final org.apache.thrift.protocol.TField SUBDOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("subdomain", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SubdomainPropertyStandardSchemeFactory());
  }

  public String subdomain; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUBDOMAIN((short)1, "subdomain");

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
        case 1: // SUBDOMAIN
          return SUBDOMAIN;
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
    tmpMap.put(_Fields.SUBDOMAIN, new org.apache.thrift.meta_data.FieldMetaData("subdomain", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SubdomainProperty.class, metaDataMap);
  }

  public SubdomainProperty() {
  }

  public SubdomainProperty(
    String subdomain)
  {
    this();
    this.subdomain = subdomain;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubdomainProperty(SubdomainProperty other) {
    if (other.isSetSubdomain()) {
      this.subdomain = other.subdomain;
    }
  }

  public SubdomainProperty deepCopy() {
    return new SubdomainProperty(this);
  }

  @Override
  public void clear() {
    this.subdomain = null;
  }

  public String getSubdomain() {
    return this.subdomain;
  }

  public SubdomainProperty setSubdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

  public void unsetSubdomain() {
    this.subdomain = null;
  }

  /** Returns true if field subdomain is set (has been assigned a value) and false otherwise */
  public boolean isSetSubdomain() {
    return this.subdomain != null;
  }

  public void setSubdomainIsSet(boolean value) {
    if (!value) {
      this.subdomain = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUBDOMAIN:
      if (value == null) {
        unsetSubdomain();
      } else {
        setSubdomain((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUBDOMAIN:
      return getSubdomain();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUBDOMAIN:
      return isSetSubdomain();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubdomainProperty)
      return this.equals((SubdomainProperty)that);
    return false;
  }

  public boolean equals(SubdomainProperty that) {
    if (that == null)
      return false;

    boolean this_present_subdomain = true && this.isSetSubdomain();
    boolean that_present_subdomain = true && that.isSetSubdomain();
    if (this_present_subdomain || that_present_subdomain) {
      if (!(this_present_subdomain && that_present_subdomain))
        return false;
      if (!this.subdomain.equals(that.subdomain))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_subdomain = true && (isSetSubdomain());
    list.add(present_subdomain);
    if (present_subdomain)
      list.add(subdomain);

    return list.hashCode();
  }

  @Override
  public int compareTo(SubdomainProperty other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSubdomain()).compareTo(other.isSetSubdomain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubdomain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subdomain, other.subdomain);
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
    StringBuilder sb = new StringBuilder("SubdomainProperty(");
    boolean first = true;

    sb.append("subdomain:");
    if (this.subdomain == null) {
      sb.append("null");
    } else {
      sb.append(this.subdomain);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (subdomain == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'subdomain' was not present! Struct: " + toString());
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

  private static class SubdomainPropertyStandardSchemeFactory implements SchemeFactory {
    public SubdomainPropertyStandardScheme getScheme() {
      return new SubdomainPropertyStandardScheme();
    }
  }

  private static class SubdomainPropertyStandardScheme extends StandardScheme<SubdomainProperty> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SubdomainProperty struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUBDOMAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subdomain = iprot.readString();
              struct.setSubdomainIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SubdomainProperty struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.subdomain != null) {
        oprot.writeFieldBegin(SUBDOMAIN_FIELD_DESC);
        oprot.writeString(struct.subdomain);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

