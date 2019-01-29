/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.common;

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
 * Options for externally managed content, used by import-related services.
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class ExternalOpts implements org.apache.thrift.TBase<ExternalOpts, ExternalOpts._Fields>, java.io.Serializable, Cloneable, Comparable<ExternalOpts> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExternalOpts");

  private static final org.apache.thrift.protocol.TField EXTERNALLY_MANAGED_FIELD_DESC = new org.apache.thrift.protocol.TField("externallyManaged", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField EXTERNAL_SYSTEM_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("externalSystemName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXTERNAL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("externalId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXTERNAL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("externalVersion", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExternalOptsStandardSchemeFactory());
  }

  /**
   * true if content is continually being externally managed, false if one-time import
   */
  public boolean externallyManaged; // optional
  /**
   * external system name
   */
  public String externalSystemName; // optional
  /**
   * external id, should be unique
   */
  public String externalId; // optional
  /**
   * external version for the external id + system
   */
  public String externalVersion; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * true if content is continually being externally managed, false if one-time import
     */
    EXTERNALLY_MANAGED((short)1, "externallyManaged"),
    /**
     * external system name
     */
    EXTERNAL_SYSTEM_NAME((short)2, "externalSystemName"),
    /**
     * external id, should be unique
     */
    EXTERNAL_ID((short)3, "externalId"),
    /**
     * external version for the external id + system
     */
    EXTERNAL_VERSION((short)4, "externalVersion");

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
        case 1: // EXTERNALLY_MANAGED
          return EXTERNALLY_MANAGED;
        case 2: // EXTERNAL_SYSTEM_NAME
          return EXTERNAL_SYSTEM_NAME;
        case 3: // EXTERNAL_ID
          return EXTERNAL_ID;
        case 4: // EXTERNAL_VERSION
          return EXTERNAL_VERSION;
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
  private static final int __EXTERNALLYMANAGED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXTERNALLY_MANAGED,_Fields.EXTERNAL_SYSTEM_NAME,_Fields.EXTERNAL_ID,_Fields.EXTERNAL_VERSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXTERNALLY_MANAGED, new org.apache.thrift.meta_data.FieldMetaData("externallyManaged", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.EXTERNAL_SYSTEM_NAME, new org.apache.thrift.meta_data.FieldMetaData("externalSystemName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTERNAL_ID, new org.apache.thrift.meta_data.FieldMetaData("externalId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTERNAL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("externalVersion", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExternalOpts.class, metaDataMap);
  }

  public ExternalOpts() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExternalOpts(ExternalOpts other) {
    __isset_bitfield = other.__isset_bitfield;
    this.externallyManaged = other.externallyManaged;
    if (other.isSetExternalSystemName()) {
      this.externalSystemName = other.externalSystemName;
    }
    if (other.isSetExternalId()) {
      this.externalId = other.externalId;
    }
    if (other.isSetExternalVersion()) {
      this.externalVersion = other.externalVersion;
    }
  }

  public ExternalOpts deepCopy() {
    return new ExternalOpts(this);
  }

  @Override
  public void clear() {
    setExternallyManagedIsSet(false);
    this.externallyManaged = false;
    this.externalSystemName = null;
    this.externalId = null;
    this.externalVersion = null;
  }

  /**
   * true if content is continually being externally managed, false if one-time import
   */
  public boolean isExternallyManaged() {
    return this.externallyManaged;
  }

  /**
   * true if content is continually being externally managed, false if one-time import
   */
  public ExternalOpts setExternallyManaged(boolean externallyManaged) {
    this.externallyManaged = externallyManaged;
    setExternallyManagedIsSet(true);
    return this;
  }

  public void unsetExternallyManaged() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXTERNALLYMANAGED_ISSET_ID);
  }

  /** Returns true if field externallyManaged is set (has been assigned a value) and false otherwise */
  public boolean isSetExternallyManaged() {
    return EncodingUtils.testBit(__isset_bitfield, __EXTERNALLYMANAGED_ISSET_ID);
  }

  public void setExternallyManagedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXTERNALLYMANAGED_ISSET_ID, value);
  }

  /**
   * external system name
   */
  public String getExternalSystemName() {
    return this.externalSystemName;
  }

  /**
   * external system name
   */
  public ExternalOpts setExternalSystemName(String externalSystemName) {
    this.externalSystemName = externalSystemName;
    return this;
  }

  public void unsetExternalSystemName() {
    this.externalSystemName = null;
  }

  /** Returns true if field externalSystemName is set (has been assigned a value) and false otherwise */
  public boolean isSetExternalSystemName() {
    return this.externalSystemName != null;
  }

  public void setExternalSystemNameIsSet(boolean value) {
    if (!value) {
      this.externalSystemName = null;
    }
  }

  /**
   * external id, should be unique
   */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * external id, should be unique
   */
  public ExternalOpts setExternalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  public void unsetExternalId() {
    this.externalId = null;
  }

  /** Returns true if field externalId is set (has been assigned a value) and false otherwise */
  public boolean isSetExternalId() {
    return this.externalId != null;
  }

  public void setExternalIdIsSet(boolean value) {
    if (!value) {
      this.externalId = null;
    }
  }

  /**
   * external version for the external id + system
   */
  public String getExternalVersion() {
    return this.externalVersion;
  }

  /**
   * external version for the external id + system
   */
  public ExternalOpts setExternalVersion(String externalVersion) {
    this.externalVersion = externalVersion;
    return this;
  }

  public void unsetExternalVersion() {
    this.externalVersion = null;
  }

  /** Returns true if field externalVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetExternalVersion() {
    return this.externalVersion != null;
  }

  public void setExternalVersionIsSet(boolean value) {
    if (!value) {
      this.externalVersion = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXTERNALLY_MANAGED:
      if (value == null) {
        unsetExternallyManaged();
      } else {
        setExternallyManaged((Boolean)value);
      }
      break;

    case EXTERNAL_SYSTEM_NAME:
      if (value == null) {
        unsetExternalSystemName();
      } else {
        setExternalSystemName((String)value);
      }
      break;

    case EXTERNAL_ID:
      if (value == null) {
        unsetExternalId();
      } else {
        setExternalId((String)value);
      }
      break;

    case EXTERNAL_VERSION:
      if (value == null) {
        unsetExternalVersion();
      } else {
        setExternalVersion((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXTERNALLY_MANAGED:
      return isExternallyManaged();

    case EXTERNAL_SYSTEM_NAME:
      return getExternalSystemName();

    case EXTERNAL_ID:
      return getExternalId();

    case EXTERNAL_VERSION:
      return getExternalVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXTERNALLY_MANAGED:
      return isSetExternallyManaged();
    case EXTERNAL_SYSTEM_NAME:
      return isSetExternalSystemName();
    case EXTERNAL_ID:
      return isSetExternalId();
    case EXTERNAL_VERSION:
      return isSetExternalVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExternalOpts)
      return this.equals((ExternalOpts)that);
    return false;
  }

  public boolean equals(ExternalOpts that) {
    if (that == null)
      return false;

    boolean this_present_externallyManaged = true && this.isSetExternallyManaged();
    boolean that_present_externallyManaged = true && that.isSetExternallyManaged();
    if (this_present_externallyManaged || that_present_externallyManaged) {
      if (!(this_present_externallyManaged && that_present_externallyManaged))
        return false;
      if (this.externallyManaged != that.externallyManaged)
        return false;
    }

    boolean this_present_externalSystemName = true && this.isSetExternalSystemName();
    boolean that_present_externalSystemName = true && that.isSetExternalSystemName();
    if (this_present_externalSystemName || that_present_externalSystemName) {
      if (!(this_present_externalSystemName && that_present_externalSystemName))
        return false;
      if (!this.externalSystemName.equals(that.externalSystemName))
        return false;
    }

    boolean this_present_externalId = true && this.isSetExternalId();
    boolean that_present_externalId = true && that.isSetExternalId();
    if (this_present_externalId || that_present_externalId) {
      if (!(this_present_externalId && that_present_externalId))
        return false;
      if (!this.externalId.equals(that.externalId))
        return false;
    }

    boolean this_present_externalVersion = true && this.isSetExternalVersion();
    boolean that_present_externalVersion = true && that.isSetExternalVersion();
    if (this_present_externalVersion || that_present_externalVersion) {
      if (!(this_present_externalVersion && that_present_externalVersion))
        return false;
      if (!this.externalVersion.equals(that.externalVersion))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_externallyManaged = true && (isSetExternallyManaged());
    list.add(present_externallyManaged);
    if (present_externallyManaged)
      list.add(externallyManaged);

    boolean present_externalSystemName = true && (isSetExternalSystemName());
    list.add(present_externalSystemName);
    if (present_externalSystemName)
      list.add(externalSystemName);

    boolean present_externalId = true && (isSetExternalId());
    list.add(present_externalId);
    if (present_externalId)
      list.add(externalId);

    boolean present_externalVersion = true && (isSetExternalVersion());
    list.add(present_externalVersion);
    if (present_externalVersion)
      list.add(externalVersion);

    return list.hashCode();
  }

  @Override
  public int compareTo(ExternalOpts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExternallyManaged()).compareTo(other.isSetExternallyManaged());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternallyManaged()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.externallyManaged, other.externallyManaged);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExternalSystemName()).compareTo(other.isSetExternalSystemName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternalSystemName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.externalSystemName, other.externalSystemName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExternalId()).compareTo(other.isSetExternalId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternalId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.externalId, other.externalId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExternalVersion()).compareTo(other.isSetExternalVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExternalVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.externalVersion, other.externalVersion);
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
    StringBuilder sb = new StringBuilder("ExternalOpts(");
    boolean first = true;

    if (isSetExternallyManaged()) {
      sb.append("externallyManaged:");
      sb.append(this.externallyManaged);
      first = false;
    }
    if (isSetExternalSystemName()) {
      if (!first) sb.append(", ");
      sb.append("externalSystemName:");
      if (this.externalSystemName == null) {
        sb.append("null");
      } else {
        sb.append(this.externalSystemName);
      }
      first = false;
    }
    if (isSetExternalId()) {
      if (!first) sb.append(", ");
      sb.append("externalId:");
      if (this.externalId == null) {
        sb.append("null");
      } else {
        sb.append(this.externalId);
      }
      first = false;
    }
    if (isSetExternalVersion()) {
      if (!first) sb.append(", ");
      sb.append("externalVersion:");
      if (this.externalVersion == null) {
        sb.append("null");
      } else {
        sb.append(this.externalVersion);
      }
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExternalOptsStandardSchemeFactory implements SchemeFactory {
    public ExternalOptsStandardScheme getScheme() {
      return new ExternalOptsStandardScheme();
    }
  }

  private static class ExternalOptsStandardScheme extends StandardScheme<ExternalOpts> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExternalOpts struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXTERNALLY_MANAGED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.externallyManaged = iprot.readBool();
              struct.setExternallyManagedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXTERNAL_SYSTEM_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.externalSystemName = iprot.readString();
              struct.setExternalSystemNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXTERNAL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.externalId = iprot.readString();
              struct.setExternalIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTERNAL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.externalVersion = iprot.readString();
              struct.setExternalVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExternalOpts struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetExternallyManaged()) {
        oprot.writeFieldBegin(EXTERNALLY_MANAGED_FIELD_DESC);
        oprot.writeBool(struct.externallyManaged);
        oprot.writeFieldEnd();
      }
      if (struct.externalSystemName != null) {
        if (struct.isSetExternalSystemName()) {
          oprot.writeFieldBegin(EXTERNAL_SYSTEM_NAME_FIELD_DESC);
          oprot.writeString(struct.externalSystemName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.externalId != null) {
        if (struct.isSetExternalId()) {
          oprot.writeFieldBegin(EXTERNAL_ID_FIELD_DESC);
          oprot.writeString(struct.externalId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.externalVersion != null) {
        if (struct.isSetExternalVersion()) {
          oprot.writeFieldBegin(EXTERNAL_VERSION_FIELD_DESC);
          oprot.writeString(struct.externalVersion);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

