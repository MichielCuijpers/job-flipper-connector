/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.job_event;

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
public class MaterializeOp implements org.apache.thrift.TBase<MaterializeOp, MaterializeOp._Fields>, java.io.Serializable, Cloneable, Comparable<MaterializeOp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MaterializeOp");

  private static final org.apache.thrift.protocol.TField STEP_GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("stepGroup", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TEMPLATE_VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("templateVersions", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TEMPLATE_DOCS_FIELD_DESC = new org.apache.thrift.protocol.TField("templateDocs", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MaterializeOpStandardSchemeFactory());
  }

  public com.wi.director.thrift.v1.step.BaseStep stepGroup; // required
  public List<com.wi.director.thrift.v1.common.VersionRef> templateVersions; // required
  public List<com.wi.director.thrift.v1.document.Document> templateDocs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STEP_GROUP((short)1, "stepGroup"),
    TEMPLATE_VERSIONS((short)2, "templateVersions"),
    TEMPLATE_DOCS((short)3, "templateDocs");

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
        case 1: // STEP_GROUP
          return STEP_GROUP;
        case 2: // TEMPLATE_VERSIONS
          return TEMPLATE_VERSIONS;
        case 3: // TEMPLATE_DOCS
          return TEMPLATE_DOCS;
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
    tmpMap.put(_Fields.STEP_GROUP, new org.apache.thrift.meta_data.FieldMetaData("stepGroup", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.step.BaseStep.class)));
    tmpMap.put(_Fields.TEMPLATE_VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("templateVersions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.common.VersionRef.class))));
    tmpMap.put(_Fields.TEMPLATE_DOCS, new org.apache.thrift.meta_data.FieldMetaData("templateDocs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.document.Document.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MaterializeOp.class, metaDataMap);
  }

  public MaterializeOp() {
  }

  public MaterializeOp(
    com.wi.director.thrift.v1.step.BaseStep stepGroup,
    List<com.wi.director.thrift.v1.common.VersionRef> templateVersions,
    List<com.wi.director.thrift.v1.document.Document> templateDocs)
  {
    this();
    this.stepGroup = stepGroup;
    this.templateVersions = templateVersions;
    this.templateDocs = templateDocs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MaterializeOp(MaterializeOp other) {
    if (other.isSetStepGroup()) {
      this.stepGroup = new com.wi.director.thrift.v1.step.BaseStep(other.stepGroup);
    }
    if (other.isSetTemplateVersions()) {
      List<com.wi.director.thrift.v1.common.VersionRef> __this__templateVersions = new ArrayList<com.wi.director.thrift.v1.common.VersionRef>(other.templateVersions.size());
      for (com.wi.director.thrift.v1.common.VersionRef other_element : other.templateVersions) {
        __this__templateVersions.add(new com.wi.director.thrift.v1.common.VersionRef(other_element));
      }
      this.templateVersions = __this__templateVersions;
    }
    if (other.isSetTemplateDocs()) {
      List<com.wi.director.thrift.v1.document.Document> __this__templateDocs = new ArrayList<com.wi.director.thrift.v1.document.Document>(other.templateDocs.size());
      for (com.wi.director.thrift.v1.document.Document other_element : other.templateDocs) {
        __this__templateDocs.add(new com.wi.director.thrift.v1.document.Document(other_element));
      }
      this.templateDocs = __this__templateDocs;
    }
  }

  public MaterializeOp deepCopy() {
    return new MaterializeOp(this);
  }

  @Override
  public void clear() {
    this.stepGroup = null;
    this.templateVersions = null;
    this.templateDocs = null;
  }

  public com.wi.director.thrift.v1.step.BaseStep getStepGroup() {
    return this.stepGroup;
  }

  public MaterializeOp setStepGroup(com.wi.director.thrift.v1.step.BaseStep stepGroup) {
    this.stepGroup = stepGroup;
    return this;
  }

  public void unsetStepGroup() {
    this.stepGroup = null;
  }

  /** Returns true if field stepGroup is set (has been assigned a value) and false otherwise */
  public boolean isSetStepGroup() {
    return this.stepGroup != null;
  }

  public void setStepGroupIsSet(boolean value) {
    if (!value) {
      this.stepGroup = null;
    }
  }

  public int getTemplateVersionsSize() {
    return (this.templateVersions == null) ? 0 : this.templateVersions.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.common.VersionRef> getTemplateVersionsIterator() {
    return (this.templateVersions == null) ? null : this.templateVersions.iterator();
  }

  public void addToTemplateVersions(com.wi.director.thrift.v1.common.VersionRef elem) {
    if (this.templateVersions == null) {
      this.templateVersions = new ArrayList<com.wi.director.thrift.v1.common.VersionRef>();
    }
    this.templateVersions.add(elem);
  }

  public List<com.wi.director.thrift.v1.common.VersionRef> getTemplateVersions() {
    return this.templateVersions;
  }

  public MaterializeOp setTemplateVersions(List<com.wi.director.thrift.v1.common.VersionRef> templateVersions) {
    this.templateVersions = templateVersions;
    return this;
  }

  public void unsetTemplateVersions() {
    this.templateVersions = null;
  }

  /** Returns true if field templateVersions is set (has been assigned a value) and false otherwise */
  public boolean isSetTemplateVersions() {
    return this.templateVersions != null;
  }

  public void setTemplateVersionsIsSet(boolean value) {
    if (!value) {
      this.templateVersions = null;
    }
  }

  public int getTemplateDocsSize() {
    return (this.templateDocs == null) ? 0 : this.templateDocs.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.document.Document> getTemplateDocsIterator() {
    return (this.templateDocs == null) ? null : this.templateDocs.iterator();
  }

  public void addToTemplateDocs(com.wi.director.thrift.v1.document.Document elem) {
    if (this.templateDocs == null) {
      this.templateDocs = new ArrayList<com.wi.director.thrift.v1.document.Document>();
    }
    this.templateDocs.add(elem);
  }

  public List<com.wi.director.thrift.v1.document.Document> getTemplateDocs() {
    return this.templateDocs;
  }

  public MaterializeOp setTemplateDocs(List<com.wi.director.thrift.v1.document.Document> templateDocs) {
    this.templateDocs = templateDocs;
    return this;
  }

  public void unsetTemplateDocs() {
    this.templateDocs = null;
  }

  /** Returns true if field templateDocs is set (has been assigned a value) and false otherwise */
  public boolean isSetTemplateDocs() {
    return this.templateDocs != null;
  }

  public void setTemplateDocsIsSet(boolean value) {
    if (!value) {
      this.templateDocs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STEP_GROUP:
      if (value == null) {
        unsetStepGroup();
      } else {
        setStepGroup((com.wi.director.thrift.v1.step.BaseStep)value);
      }
      break;

    case TEMPLATE_VERSIONS:
      if (value == null) {
        unsetTemplateVersions();
      } else {
        setTemplateVersions((List<com.wi.director.thrift.v1.common.VersionRef>)value);
      }
      break;

    case TEMPLATE_DOCS:
      if (value == null) {
        unsetTemplateDocs();
      } else {
        setTemplateDocs((List<com.wi.director.thrift.v1.document.Document>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STEP_GROUP:
      return getStepGroup();

    case TEMPLATE_VERSIONS:
      return getTemplateVersions();

    case TEMPLATE_DOCS:
      return getTemplateDocs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STEP_GROUP:
      return isSetStepGroup();
    case TEMPLATE_VERSIONS:
      return isSetTemplateVersions();
    case TEMPLATE_DOCS:
      return isSetTemplateDocs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MaterializeOp)
      return this.equals((MaterializeOp)that);
    return false;
  }

  public boolean equals(MaterializeOp that) {
    if (that == null)
      return false;

    boolean this_present_stepGroup = true && this.isSetStepGroup();
    boolean that_present_stepGroup = true && that.isSetStepGroup();
    if (this_present_stepGroup || that_present_stepGroup) {
      if (!(this_present_stepGroup && that_present_stepGroup))
        return false;
      if (!this.stepGroup.equals(that.stepGroup))
        return false;
    }

    boolean this_present_templateVersions = true && this.isSetTemplateVersions();
    boolean that_present_templateVersions = true && that.isSetTemplateVersions();
    if (this_present_templateVersions || that_present_templateVersions) {
      if (!(this_present_templateVersions && that_present_templateVersions))
        return false;
      if (!this.templateVersions.equals(that.templateVersions))
        return false;
    }

    boolean this_present_templateDocs = true && this.isSetTemplateDocs();
    boolean that_present_templateDocs = true && that.isSetTemplateDocs();
    if (this_present_templateDocs || that_present_templateDocs) {
      if (!(this_present_templateDocs && that_present_templateDocs))
        return false;
      if (!this.templateDocs.equals(that.templateDocs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stepGroup = true && (isSetStepGroup());
    list.add(present_stepGroup);
    if (present_stepGroup)
      list.add(stepGroup);

    boolean present_templateVersions = true && (isSetTemplateVersions());
    list.add(present_templateVersions);
    if (present_templateVersions)
      list.add(templateVersions);

    boolean present_templateDocs = true && (isSetTemplateDocs());
    list.add(present_templateDocs);
    if (present_templateDocs)
      list.add(templateDocs);

    return list.hashCode();
  }

  @Override
  public int compareTo(MaterializeOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStepGroup()).compareTo(other.isSetStepGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStepGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stepGroup, other.stepGroup);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTemplateVersions()).compareTo(other.isSetTemplateVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemplateVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.templateVersions, other.templateVersions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTemplateDocs()).compareTo(other.isSetTemplateDocs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemplateDocs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.templateDocs, other.templateDocs);
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
    StringBuilder sb = new StringBuilder("MaterializeOp(");
    boolean first = true;

    sb.append("stepGroup:");
    if (this.stepGroup == null) {
      sb.append("null");
    } else {
      sb.append(this.stepGroup);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("templateVersions:");
    if (this.templateVersions == null) {
      sb.append("null");
    } else {
      sb.append(this.templateVersions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("templateDocs:");
    if (this.templateDocs == null) {
      sb.append("null");
    } else {
      sb.append(this.templateDocs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (stepGroup == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stepGroup' was not present! Struct: " + toString());
    }
    if (templateVersions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'templateVersions' was not present! Struct: " + toString());
    }
    if (templateDocs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'templateDocs' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (stepGroup != null) {
      stepGroup.validate();
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

  private static class MaterializeOpStandardSchemeFactory implements SchemeFactory {
    public MaterializeOpStandardScheme getScheme() {
      return new MaterializeOpStandardScheme();
    }
  }

  private static class MaterializeOpStandardScheme extends StandardScheme<MaterializeOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MaterializeOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STEP_GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stepGroup = new com.wi.director.thrift.v1.step.BaseStep();
              struct.stepGroup.read(iprot);
              struct.setStepGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TEMPLATE_VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.templateVersions = new ArrayList<com.wi.director.thrift.v1.common.VersionRef>(_list8.size);
                com.wi.director.thrift.v1.common.VersionRef _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new com.wi.director.thrift.v1.common.VersionRef();
                  _elem9.read(iprot);
                  struct.templateVersions.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setTemplateVersionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEMPLATE_DOCS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.templateDocs = new ArrayList<com.wi.director.thrift.v1.document.Document>(_list11.size);
                com.wi.director.thrift.v1.document.Document _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = new com.wi.director.thrift.v1.document.Document();
                  _elem12.read(iprot);
                  struct.templateDocs.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setTemplateDocsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MaterializeOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stepGroup != null) {
        oprot.writeFieldBegin(STEP_GROUP_FIELD_DESC);
        struct.stepGroup.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.templateVersions != null) {
        oprot.writeFieldBegin(TEMPLATE_VERSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.templateVersions.size()));
          for (com.wi.director.thrift.v1.common.VersionRef _iter14 : struct.templateVersions)
          {
            _iter14.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.templateDocs != null) {
        oprot.writeFieldBegin(TEMPLATE_DOCS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.templateDocs.size()));
          for (com.wi.director.thrift.v1.document.Document _iter15 : struct.templateDocs)
          {
            _iter15.write(oprot);
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

