/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.jobtemplate;

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
 * Options for listing job templates
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class IndexOpts implements org.apache.thrift.TBase<IndexOpts, IndexOpts._Fields>, java.io.Serializable, Cloneable, Comparable<IndexOpts> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IndexOpts");

  private static final org.apache.thrift.protocol.TField SHOW_UNPUBLISHED_FIELD_DESC = new org.apache.thrift.protocol.TField("showUnpublished", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField SHOW_ARCHIVED_FIELD_DESC = new org.apache.thrift.protocol.TField("showArchived", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IndexOptsStandardSchemeFactory());
  }

  public boolean showUnpublished; // required
  public boolean showArchived; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SHOW_UNPUBLISHED((short)1, "showUnpublished"),
    SHOW_ARCHIVED((short)2, "showArchived");

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
        case 1: // SHOW_UNPUBLISHED
          return SHOW_UNPUBLISHED;
        case 2: // SHOW_ARCHIVED
          return SHOW_ARCHIVED;
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
  private static final int __SHOWUNPUBLISHED_ISSET_ID = 0;
  private static final int __SHOWARCHIVED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SHOW_UNPUBLISHED, new org.apache.thrift.meta_data.FieldMetaData("showUnpublished", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SHOW_ARCHIVED, new org.apache.thrift.meta_data.FieldMetaData("showArchived", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IndexOpts.class, metaDataMap);
  }

  public IndexOpts() {
    this.showUnpublished = true;

    this.showArchived = true;

  }

  public IndexOpts(
    boolean showUnpublished,
    boolean showArchived)
  {
    this();
    this.showUnpublished = showUnpublished;
    setShowUnpublishedIsSet(true);
    this.showArchived = showArchived;
    setShowArchivedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexOpts(IndexOpts other) {
    __isset_bitfield = other.__isset_bitfield;
    this.showUnpublished = other.showUnpublished;
    this.showArchived = other.showArchived;
  }

  public IndexOpts deepCopy() {
    return new IndexOpts(this);
  }

  @Override
  public void clear() {
    this.showUnpublished = true;

    this.showArchived = true;

  }

  public boolean isShowUnpublished() {
    return this.showUnpublished;
  }

  public IndexOpts setShowUnpublished(boolean showUnpublished) {
    this.showUnpublished = showUnpublished;
    setShowUnpublishedIsSet(true);
    return this;
  }

  public void unsetShowUnpublished() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHOWUNPUBLISHED_ISSET_ID);
  }

  /** Returns true if field showUnpublished is set (has been assigned a value) and false otherwise */
  public boolean isSetShowUnpublished() {
    return EncodingUtils.testBit(__isset_bitfield, __SHOWUNPUBLISHED_ISSET_ID);
  }

  public void setShowUnpublishedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHOWUNPUBLISHED_ISSET_ID, value);
  }

  public boolean isShowArchived() {
    return this.showArchived;
  }

  public IndexOpts setShowArchived(boolean showArchived) {
    this.showArchived = showArchived;
    setShowArchivedIsSet(true);
    return this;
  }

  public void unsetShowArchived() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHOWARCHIVED_ISSET_ID);
  }

  /** Returns true if field showArchived is set (has been assigned a value) and false otherwise */
  public boolean isSetShowArchived() {
    return EncodingUtils.testBit(__isset_bitfield, __SHOWARCHIVED_ISSET_ID);
  }

  public void setShowArchivedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHOWARCHIVED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SHOW_UNPUBLISHED:
      if (value == null) {
        unsetShowUnpublished();
      } else {
        setShowUnpublished((Boolean)value);
      }
      break;

    case SHOW_ARCHIVED:
      if (value == null) {
        unsetShowArchived();
      } else {
        setShowArchived((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SHOW_UNPUBLISHED:
      return isShowUnpublished();

    case SHOW_ARCHIVED:
      return isShowArchived();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SHOW_UNPUBLISHED:
      return isSetShowUnpublished();
    case SHOW_ARCHIVED:
      return isSetShowArchived();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IndexOpts)
      return this.equals((IndexOpts)that);
    return false;
  }

  public boolean equals(IndexOpts that) {
    if (that == null)
      return false;

    boolean this_present_showUnpublished = true;
    boolean that_present_showUnpublished = true;
    if (this_present_showUnpublished || that_present_showUnpublished) {
      if (!(this_present_showUnpublished && that_present_showUnpublished))
        return false;
      if (this.showUnpublished != that.showUnpublished)
        return false;
    }

    boolean this_present_showArchived = true;
    boolean that_present_showArchived = true;
    if (this_present_showArchived || that_present_showArchived) {
      if (!(this_present_showArchived && that_present_showArchived))
        return false;
      if (this.showArchived != that.showArchived)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_showUnpublished = true;
    list.add(present_showUnpublished);
    if (present_showUnpublished)
      list.add(showUnpublished);

    boolean present_showArchived = true;
    list.add(present_showArchived);
    if (present_showArchived)
      list.add(showArchived);

    return list.hashCode();
  }

  @Override
  public int compareTo(IndexOpts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetShowUnpublished()).compareTo(other.isSetShowUnpublished());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShowUnpublished()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.showUnpublished, other.showUnpublished);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShowArchived()).compareTo(other.isSetShowArchived());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShowArchived()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.showArchived, other.showArchived);
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
    StringBuilder sb = new StringBuilder("IndexOpts(");
    boolean first = true;

    sb.append("showUnpublished:");
    sb.append(this.showUnpublished);
    first = false;
    if (!first) sb.append(", ");
    sb.append("showArchived:");
    sb.append(this.showArchived);
    first = false;
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

  private static class IndexOptsStandardSchemeFactory implements SchemeFactory {
    public IndexOptsStandardScheme getScheme() {
      return new IndexOptsStandardScheme();
    }
  }

  private static class IndexOptsStandardScheme extends StandardScheme<IndexOpts> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IndexOpts struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SHOW_UNPUBLISHED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.showUnpublished = iprot.readBool();
              struct.setShowUnpublishedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SHOW_ARCHIVED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.showArchived = iprot.readBool();
              struct.setShowArchivedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, IndexOpts struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SHOW_UNPUBLISHED_FIELD_DESC);
      oprot.writeBool(struct.showUnpublished);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SHOW_ARCHIVED_FIELD_DESC);
      oprot.writeBool(struct.showArchived);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

