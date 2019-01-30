/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.templateset;

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
 * Filtering options to be passed to queryCombined
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class TemplateUnionWhereOpts implements org.apache.thrift.TBase<TemplateUnionWhereOpts, TemplateUnionWhereOpts._Fields>, java.io.Serializable, Cloneable, Comparable<TemplateUnionWhereOpts> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TemplateUnionWhereOpts");

  private static final org.apache.thrift.protocol.TField WHERE_OPTS_FIELD_DESC = new org.apache.thrift.protocol.TField("whereOpts", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INCLUDE_TEMPLATES_FIELD_DESC = new org.apache.thrift.protocol.TField("includeTemplates", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField INCLUDE_TEMPLATE_SETS_FIELD_DESC = new org.apache.thrift.protocol.TField("includeTemplateSets", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TemplateUnionWhereOptsStandardSchemeFactory());
  }

  public com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts whereOpts; // required
  public boolean includeTemplates; // required
  public boolean includeTemplateSets; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WHERE_OPTS((short)1, "whereOpts"),
    INCLUDE_TEMPLATES((short)2, "includeTemplates"),
    INCLUDE_TEMPLATE_SETS((short)3, "includeTemplateSets");

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
        case 1: // WHERE_OPTS
          return WHERE_OPTS;
        case 2: // INCLUDE_TEMPLATES
          return INCLUDE_TEMPLATES;
        case 3: // INCLUDE_TEMPLATE_SETS
          return INCLUDE_TEMPLATE_SETS;
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
  private static final int __INCLUDETEMPLATES_ISSET_ID = 0;
  private static final int __INCLUDETEMPLATESETS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WHERE_OPTS, new org.apache.thrift.meta_data.FieldMetaData("whereOpts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts.class)));
    tmpMap.put(_Fields.INCLUDE_TEMPLATES, new org.apache.thrift.meta_data.FieldMetaData("includeTemplates", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INCLUDE_TEMPLATE_SETS, new org.apache.thrift.meta_data.FieldMetaData("includeTemplateSets", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TemplateUnionWhereOpts.class, metaDataMap);
  }

  public TemplateUnionWhereOpts() {
    this.includeTemplates = true;

    this.includeTemplateSets = true;

  }

  public TemplateUnionWhereOpts(
    com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts whereOpts,
    boolean includeTemplates,
    boolean includeTemplateSets)
  {
    this();
    this.whereOpts = whereOpts;
    this.includeTemplates = includeTemplates;
    setIncludeTemplatesIsSet(true);
    this.includeTemplateSets = includeTemplateSets;
    setIncludeTemplateSetsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TemplateUnionWhereOpts(TemplateUnionWhereOpts other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetWhereOpts()) {
      this.whereOpts = new com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts(other.whereOpts);
    }
    this.includeTemplates = other.includeTemplates;
    this.includeTemplateSets = other.includeTemplateSets;
  }

  public TemplateUnionWhereOpts deepCopy() {
    return new TemplateUnionWhereOpts(this);
  }

  @Override
  public void clear() {
    this.whereOpts = null;
    this.includeTemplates = true;

    this.includeTemplateSets = true;

  }

  public com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts getWhereOpts() {
    return this.whereOpts;
  }

  public TemplateUnionWhereOpts setWhereOpts(com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts whereOpts) {
    this.whereOpts = whereOpts;
    return this;
  }

  public void unsetWhereOpts() {
    this.whereOpts = null;
  }

  /** Returns true if field whereOpts is set (has been assigned a value) and false otherwise */
  public boolean isSetWhereOpts() {
    return this.whereOpts != null;
  }

  public void setWhereOptsIsSet(boolean value) {
    if (!value) {
      this.whereOpts = null;
    }
  }

  public boolean isIncludeTemplates() {
    return this.includeTemplates;
  }

  public TemplateUnionWhereOpts setIncludeTemplates(boolean includeTemplates) {
    this.includeTemplates = includeTemplates;
    setIncludeTemplatesIsSet(true);
    return this;
  }

  public void unsetIncludeTemplates() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCLUDETEMPLATES_ISSET_ID);
  }

  /** Returns true if field includeTemplates is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeTemplates() {
    return EncodingUtils.testBit(__isset_bitfield, __INCLUDETEMPLATES_ISSET_ID);
  }

  public void setIncludeTemplatesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCLUDETEMPLATES_ISSET_ID, value);
  }

  public boolean isIncludeTemplateSets() {
    return this.includeTemplateSets;
  }

  public TemplateUnionWhereOpts setIncludeTemplateSets(boolean includeTemplateSets) {
    this.includeTemplateSets = includeTemplateSets;
    setIncludeTemplateSetsIsSet(true);
    return this;
  }

  public void unsetIncludeTemplateSets() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCLUDETEMPLATESETS_ISSET_ID);
  }

  /** Returns true if field includeTemplateSets is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeTemplateSets() {
    return EncodingUtils.testBit(__isset_bitfield, __INCLUDETEMPLATESETS_ISSET_ID);
  }

  public void setIncludeTemplateSetsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCLUDETEMPLATESETS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WHERE_OPTS:
      if (value == null) {
        unsetWhereOpts();
      } else {
        setWhereOpts((com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts)value);
      }
      break;

    case INCLUDE_TEMPLATES:
      if (value == null) {
        unsetIncludeTemplates();
      } else {
        setIncludeTemplates((Boolean)value);
      }
      break;

    case INCLUDE_TEMPLATE_SETS:
      if (value == null) {
        unsetIncludeTemplateSets();
      } else {
        setIncludeTemplateSets((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WHERE_OPTS:
      return getWhereOpts();

    case INCLUDE_TEMPLATES:
      return isIncludeTemplates();

    case INCLUDE_TEMPLATE_SETS:
      return isIncludeTemplateSets();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WHERE_OPTS:
      return isSetWhereOpts();
    case INCLUDE_TEMPLATES:
      return isSetIncludeTemplates();
    case INCLUDE_TEMPLATE_SETS:
      return isSetIncludeTemplateSets();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TemplateUnionWhereOpts)
      return this.equals((TemplateUnionWhereOpts)that);
    return false;
  }

  public boolean equals(TemplateUnionWhereOpts that) {
    if (that == null)
      return false;

    boolean this_present_whereOpts = true && this.isSetWhereOpts();
    boolean that_present_whereOpts = true && that.isSetWhereOpts();
    if (this_present_whereOpts || that_present_whereOpts) {
      if (!(this_present_whereOpts && that_present_whereOpts))
        return false;
      if (!this.whereOpts.equals(that.whereOpts))
        return false;
    }

    boolean this_present_includeTemplates = true;
    boolean that_present_includeTemplates = true;
    if (this_present_includeTemplates || that_present_includeTemplates) {
      if (!(this_present_includeTemplates && that_present_includeTemplates))
        return false;
      if (this.includeTemplates != that.includeTemplates)
        return false;
    }

    boolean this_present_includeTemplateSets = true;
    boolean that_present_includeTemplateSets = true;
    if (this_present_includeTemplateSets || that_present_includeTemplateSets) {
      if (!(this_present_includeTemplateSets && that_present_includeTemplateSets))
        return false;
      if (this.includeTemplateSets != that.includeTemplateSets)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_whereOpts = true && (isSetWhereOpts());
    list.add(present_whereOpts);
    if (present_whereOpts)
      list.add(whereOpts);

    boolean present_includeTemplates = true;
    list.add(present_includeTemplates);
    if (present_includeTemplates)
      list.add(includeTemplates);

    boolean present_includeTemplateSets = true;
    list.add(present_includeTemplateSets);
    if (present_includeTemplateSets)
      list.add(includeTemplateSets);

    return list.hashCode();
  }

  @Override
  public int compareTo(TemplateUnionWhereOpts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWhereOpts()).compareTo(other.isSetWhereOpts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhereOpts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.whereOpts, other.whereOpts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeTemplates()).compareTo(other.isSetIncludeTemplates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeTemplates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeTemplates, other.includeTemplates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeTemplateSets()).compareTo(other.isSetIncludeTemplateSets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeTemplateSets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeTemplateSets, other.includeTemplateSets);
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
    StringBuilder sb = new StringBuilder("TemplateUnionWhereOpts(");
    boolean first = true;

    sb.append("whereOpts:");
    if (this.whereOpts == null) {
      sb.append("null");
    } else {
      sb.append(this.whereOpts);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("includeTemplates:");
    sb.append(this.includeTemplates);
    first = false;
    if (!first) sb.append(", ");
    sb.append("includeTemplateSets:");
    sb.append(this.includeTemplateSets);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (whereOpts != null) {
      whereOpts.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TemplateUnionWhereOptsStandardSchemeFactory implements SchemeFactory {
    public TemplateUnionWhereOptsStandardScheme getScheme() {
      return new TemplateUnionWhereOptsStandardScheme();
    }
  }

  private static class TemplateUnionWhereOptsStandardScheme extends StandardScheme<TemplateUnionWhereOpts> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TemplateUnionWhereOpts struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WHERE_OPTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.whereOpts = new com.wi.director.thrift.v1.jobtemplate.TemplateWhereOpts();
              struct.whereOpts.read(iprot);
              struct.setWhereOptsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INCLUDE_TEMPLATES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.includeTemplates = iprot.readBool();
              struct.setIncludeTemplatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INCLUDE_TEMPLATE_SETS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.includeTemplateSets = iprot.readBool();
              struct.setIncludeTemplateSetsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TemplateUnionWhereOpts struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.whereOpts != null) {
        oprot.writeFieldBegin(WHERE_OPTS_FIELD_DESC);
        struct.whereOpts.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INCLUDE_TEMPLATES_FIELD_DESC);
      oprot.writeBool(struct.includeTemplates);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INCLUDE_TEMPLATE_SETS_FIELD_DESC);
      oprot.writeBool(struct.includeTemplateSets);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
