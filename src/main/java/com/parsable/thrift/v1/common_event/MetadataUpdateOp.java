/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.common_event;

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
public class MetadataUpdateOp implements org.apache.thrift.TBase<MetadataUpdateOp, MetadataUpdateOp._Fields>, java.io.Serializable, Cloneable, Comparable<MetadataUpdateOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetadataUpdateOp");

  private static final org.apache.thrift.protocol.TField METADATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("metadataId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField VALUE_WITH_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("valueWithIds", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetadataUpdateOpStandardSchemeFactory());
  }

  public String metadataId; // required
  public String key; // optional
  public com.wi.director.thrift.v1.metadata.MetadataValue value; // required
  public com.wi.director.thrift.v1.metadata.MetadataValueWithIds valueWithIds; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA_ID((short)1, "metadataId"),
    KEY((short)2, "key"),
    VALUE((short)3, "value"),
    VALUE_WITH_IDS((short)4, "valueWithIds");

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
        case 1: // METADATA_ID
          return METADATA_ID;
        case 2: // KEY
          return KEY;
        case 3: // VALUE
          return VALUE;
        case 4: // VALUE_WITH_IDS
          return VALUE_WITH_IDS;
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
  private static final _Fields optionals[] = {_Fields.KEY,_Fields.VALUE_WITH_IDS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA_ID, new org.apache.thrift.meta_data.FieldMetaData("metadataId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.metadata.MetadataValue.class)));
    tmpMap.put(_Fields.VALUE_WITH_IDS, new org.apache.thrift.meta_data.FieldMetaData("valueWithIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.metadata.MetadataValueWithIds.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetadataUpdateOp.class, metaDataMap);
  }

  public MetadataUpdateOp() {
  }

  public MetadataUpdateOp(
    String metadataId,
    com.wi.director.thrift.v1.metadata.MetadataValue value)
  {
    this();
    this.metadataId = metadataId;
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetadataUpdateOp(MetadataUpdateOp other) {
    if (other.isSetMetadataId()) {
      this.metadataId = other.metadataId;
    }
    if (other.isSetKey()) {
      this.key = other.key;
    }
    if (other.isSetValue()) {
      this.value = new com.wi.director.thrift.v1.metadata.MetadataValue(other.value);
    }
    if (other.isSetValueWithIds()) {
      this.valueWithIds = new com.wi.director.thrift.v1.metadata.MetadataValueWithIds(other.valueWithIds);
    }
  }

  public MetadataUpdateOp deepCopy() {
    return new MetadataUpdateOp(this);
  }

  @Override
  public void clear() {
    this.metadataId = null;
    this.key = null;
    this.value = null;
    this.valueWithIds = null;
  }

  public String getMetadataId() {
    return this.metadataId;
  }

  public MetadataUpdateOp setMetadataId(String metadataId) {
    this.metadataId = metadataId;
    return this;
  }

  public void unsetMetadataId() {
    this.metadataId = null;
  }

  /** Returns true if field metadataId is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadataId() {
    return this.metadataId != null;
  }

  public void setMetadataIdIsSet(boolean value) {
    if (!value) {
      this.metadataId = null;
    }
  }

  public String getKey() {
    return this.key;
  }

  public MetadataUpdateOp setKey(String key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public com.wi.director.thrift.v1.metadata.MetadataValue getValue() {
    return this.value;
  }

  public MetadataUpdateOp setValue(com.wi.director.thrift.v1.metadata.MetadataValue value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public com.wi.director.thrift.v1.metadata.MetadataValueWithIds getValueWithIds() {
    return this.valueWithIds;
  }

  public MetadataUpdateOp setValueWithIds(com.wi.director.thrift.v1.metadata.MetadataValueWithIds valueWithIds) {
    this.valueWithIds = valueWithIds;
    return this;
  }

  public void unsetValueWithIds() {
    this.valueWithIds = null;
  }

  /** Returns true if field valueWithIds is set (has been assigned a value) and false otherwise */
  public boolean isSetValueWithIds() {
    return this.valueWithIds != null;
  }

  public void setValueWithIdsIsSet(boolean value) {
    if (!value) {
      this.valueWithIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METADATA_ID:
      if (value == null) {
        unsetMetadataId();
      } else {
        setMetadataId((String)value);
      }
      break;

    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((com.wi.director.thrift.v1.metadata.MetadataValue)value);
      }
      break;

    case VALUE_WITH_IDS:
      if (value == null) {
        unsetValueWithIds();
      } else {
        setValueWithIds((com.wi.director.thrift.v1.metadata.MetadataValueWithIds)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA_ID:
      return getMetadataId();

    case KEY:
      return getKey();

    case VALUE:
      return getValue();

    case VALUE_WITH_IDS:
      return getValueWithIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METADATA_ID:
      return isSetMetadataId();
    case KEY:
      return isSetKey();
    case VALUE:
      return isSetValue();
    case VALUE_WITH_IDS:
      return isSetValueWithIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetadataUpdateOp)
      return this.equals((MetadataUpdateOp)that);
    return false;
  }

  public boolean equals(MetadataUpdateOp that) {
    if (that == null)
      return false;

    boolean this_present_metadataId = true && this.isSetMetadataId();
    boolean that_present_metadataId = true && that.isSetMetadataId();
    if (this_present_metadataId || that_present_metadataId) {
      if (!(this_present_metadataId && that_present_metadataId))
        return false;
      if (!this.metadataId.equals(that.metadataId))
        return false;
    }

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_valueWithIds = true && this.isSetValueWithIds();
    boolean that_present_valueWithIds = true && that.isSetValueWithIds();
    if (this_present_valueWithIds || that_present_valueWithIds) {
      if (!(this_present_valueWithIds && that_present_valueWithIds))
        return false;
      if (!this.valueWithIds.equals(that.valueWithIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metadataId = true && (isSetMetadataId());
    list.add(present_metadataId);
    if (present_metadataId)
      list.add(metadataId);

    boolean present_key = true && (isSetKey());
    list.add(present_key);
    if (present_key)
      list.add(key);

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_valueWithIds = true && (isSetValueWithIds());
    list.add(present_valueWithIds);
    if (present_valueWithIds)
      list.add(valueWithIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetadataUpdateOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetadataId()).compareTo(other.isSetMetadataId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadataId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadataId, other.metadataId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValueWithIds()).compareTo(other.isSetValueWithIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueWithIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valueWithIds, other.valueWithIds);
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
    StringBuilder sb = new StringBuilder("MetadataUpdateOp(");
    boolean first = true;

    sb.append("metadataId:");
    if (this.metadataId == null) {
      sb.append("null");
    } else {
      sb.append(this.metadataId);
    }
    first = false;
    if (isSetKey()) {
      if (!first) sb.append(", ");
      sb.append("key:");
      if (this.key == null) {
        sb.append("null");
      } else {
        sb.append(this.key);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (isSetValueWithIds()) {
      if (!first) sb.append(", ");
      sb.append("valueWithIds:");
      if (this.valueWithIds == null) {
        sb.append("null");
      } else {
        sb.append(this.valueWithIds);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (metadataId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadataId' was not present! Struct: " + toString());
    }
    if (value == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'value' was not present! Struct: " + toString());
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

  private static class MetadataUpdateOpStandardSchemeFactory implements SchemeFactory {
    public MetadataUpdateOpStandardScheme getScheme() {
      return new MetadataUpdateOpStandardScheme();
    }
  }

  private static class MetadataUpdateOpStandardScheme extends StandardScheme<MetadataUpdateOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetadataUpdateOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadataId = iprot.readString();
              struct.setMetadataIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.value = new com.wi.director.thrift.v1.metadata.MetadataValue();
              struct.value.read(iprot);
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUE_WITH_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.valueWithIds = new com.wi.director.thrift.v1.metadata.MetadataValueWithIds();
              struct.valueWithIds.read(iprot);
              struct.setValueWithIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetadataUpdateOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadataId != null) {
        oprot.writeFieldBegin(METADATA_ID_FIELD_DESC);
        oprot.writeString(struct.metadataId);
        oprot.writeFieldEnd();
      }
      if (struct.key != null) {
        if (struct.isSetKey()) {
          oprot.writeFieldBegin(KEY_FIELD_DESC);
          oprot.writeString(struct.key);
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        struct.value.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.valueWithIds != null) {
        if (struct.isSetValueWithIds()) {
          oprot.writeFieldBegin(VALUE_WITH_IDS_FIELD_DESC);
          struct.valueWithIds.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

