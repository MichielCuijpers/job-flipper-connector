/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.jobrole;

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
public class TemplatePermissions implements org.apache.thrift.TBase<TemplatePermissions, TemplatePermissions._Fields>, java.io.Serializable, Cloneable, Comparable<TemplatePermissions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TemplatePermissions");

  private static final org.apache.thrift.protocol.TField ADD_TEMPLATES_FIELD_DESC = new org.apache.thrift.protocol.TField("addTemplates", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ADD_SETS_FIELD_DESC = new org.apache.thrift.protocol.TField("addSets", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TemplatePermissionsStandardSchemeFactory());
  }

  public boolean addTemplates; // required
  public boolean addSets; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADD_TEMPLATES((short)1, "addTemplates"),
    ADD_SETS((short)2, "addSets");

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
        case 1: // ADD_TEMPLATES
          return ADD_TEMPLATES;
        case 2: // ADD_SETS
          return ADD_SETS;
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
  private static final int __ADDTEMPLATES_ISSET_ID = 0;
  private static final int __ADDSETS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADD_TEMPLATES, new org.apache.thrift.meta_data.FieldMetaData("addTemplates", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ADD_SETS, new org.apache.thrift.meta_data.FieldMetaData("addSets", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TemplatePermissions.class, metaDataMap);
  }

  public TemplatePermissions() {
  }

  public TemplatePermissions(
    boolean addTemplates,
    boolean addSets)
  {
    this();
    this.addTemplates = addTemplates;
    setAddTemplatesIsSet(true);
    this.addSets = addSets;
    setAddSetsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TemplatePermissions(TemplatePermissions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.addTemplates = other.addTemplates;
    this.addSets = other.addSets;
  }

  public TemplatePermissions deepCopy() {
    return new TemplatePermissions(this);
  }

  @Override
  public void clear() {
    setAddTemplatesIsSet(false);
    this.addTemplates = false;
    setAddSetsIsSet(false);
    this.addSets = false;
  }

  public boolean isAddTemplates() {
    return this.addTemplates;
  }

  public TemplatePermissions setAddTemplates(boolean addTemplates) {
    this.addTemplates = addTemplates;
    setAddTemplatesIsSet(true);
    return this;
  }

  public void unsetAddTemplates() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADDTEMPLATES_ISSET_ID);
  }

  /** Returns true if field addTemplates is set (has been assigned a value) and false otherwise */
  public boolean isSetAddTemplates() {
    return EncodingUtils.testBit(__isset_bitfield, __ADDTEMPLATES_ISSET_ID);
  }

  public void setAddTemplatesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADDTEMPLATES_ISSET_ID, value);
  }

  public boolean isAddSets() {
    return this.addSets;
  }

  public TemplatePermissions setAddSets(boolean addSets) {
    this.addSets = addSets;
    setAddSetsIsSet(true);
    return this;
  }

  public void unsetAddSets() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADDSETS_ISSET_ID);
  }

  /** Returns true if field addSets is set (has been assigned a value) and false otherwise */
  public boolean isSetAddSets() {
    return EncodingUtils.testBit(__isset_bitfield, __ADDSETS_ISSET_ID);
  }

  public void setAddSetsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADDSETS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADD_TEMPLATES:
      if (value == null) {
        unsetAddTemplates();
      } else {
        setAddTemplates((Boolean)value);
      }
      break;

    case ADD_SETS:
      if (value == null) {
        unsetAddSets();
      } else {
        setAddSets((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADD_TEMPLATES:
      return isAddTemplates();

    case ADD_SETS:
      return isAddSets();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADD_TEMPLATES:
      return isSetAddTemplates();
    case ADD_SETS:
      return isSetAddSets();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TemplatePermissions)
      return this.equals((TemplatePermissions)that);
    return false;
  }

  public boolean equals(TemplatePermissions that) {
    if (that == null)
      return false;

    boolean this_present_addTemplates = true;
    boolean that_present_addTemplates = true;
    if (this_present_addTemplates || that_present_addTemplates) {
      if (!(this_present_addTemplates && that_present_addTemplates))
        return false;
      if (this.addTemplates != that.addTemplates)
        return false;
    }

    boolean this_present_addSets = true;
    boolean that_present_addSets = true;
    if (this_present_addSets || that_present_addSets) {
      if (!(this_present_addSets && that_present_addSets))
        return false;
      if (this.addSets != that.addSets)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_addTemplates = true;
    list.add(present_addTemplates);
    if (present_addTemplates)
      list.add(addTemplates);

    boolean present_addSets = true;
    list.add(present_addSets);
    if (present_addSets)
      list.add(addSets);

    return list.hashCode();
  }

  @Override
  public int compareTo(TemplatePermissions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAddTemplates()).compareTo(other.isSetAddTemplates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddTemplates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addTemplates, other.addTemplates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddSets()).compareTo(other.isSetAddSets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddSets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addSets, other.addSets);
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
    StringBuilder sb = new StringBuilder("TemplatePermissions(");
    boolean first = true;

    sb.append("addTemplates:");
    sb.append(this.addTemplates);
    first = false;
    if (!first) sb.append(", ");
    sb.append("addSets:");
    sb.append(this.addSets);
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

  private static class TemplatePermissionsStandardSchemeFactory implements SchemeFactory {
    public TemplatePermissionsStandardScheme getScheme() {
      return new TemplatePermissionsStandardScheme();
    }
  }

  private static class TemplatePermissionsStandardScheme extends StandardScheme<TemplatePermissions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TemplatePermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADD_TEMPLATES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.addTemplates = iprot.readBool();
              struct.setAddTemplatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ADD_SETS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.addSets = iprot.readBool();
              struct.setAddSetsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TemplatePermissions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ADD_TEMPLATES_FIELD_DESC);
      oprot.writeBool(struct.addTemplates);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ADD_SETS_FIELD_DESC);
      oprot.writeBool(struct.addSets);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

