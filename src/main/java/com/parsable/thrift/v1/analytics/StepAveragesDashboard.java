/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.analytics;

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
public class StepAveragesDashboard implements org.apache.thrift.TBase<StepAveragesDashboard, StepAveragesDashboard._Fields>, java.io.Serializable, Cloneable, Comparable<StepAveragesDashboard> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StepAveragesDashboard");

  private static final org.apache.thrift.protocol.TField REQUIRE_TEMPLATES_FIELD_DESC = new org.apache.thrift.protocol.TField("requireTemplates", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("jobMetadata", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TEMPLATE_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("templateMetadata", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StepAveragesDashboardStandardSchemeFactory());
  }

  public List<String> requireTemplates; // optional
  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> jobMetadata; // optional
  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> templateMetadata; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUIRE_TEMPLATES((short)1, "requireTemplates"),
    JOB_METADATA((short)2, "jobMetadata"),
    TEMPLATE_METADATA((short)3, "templateMetadata");

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
        case 1: // REQUIRE_TEMPLATES
          return REQUIRE_TEMPLATES;
        case 2: // JOB_METADATA
          return JOB_METADATA;
        case 3: // TEMPLATE_METADATA
          return TEMPLATE_METADATA;
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
  private static final _Fields optionals[] = {_Fields.REQUIRE_TEMPLATES,_Fields.JOB_METADATA,_Fields.TEMPLATE_METADATA};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUIRE_TEMPLATES, new org.apache.thrift.meta_data.FieldMetaData("requireTemplates", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "UUID"))));
    tmpMap.put(_Fields.JOB_METADATA, new org.apache.thrift.meta_data.FieldMetaData("jobMetadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.metadata.MetadataEntry.class))));
    tmpMap.put(_Fields.TEMPLATE_METADATA, new org.apache.thrift.meta_data.FieldMetaData("templateMetadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.metadata.MetadataEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StepAveragesDashboard.class, metaDataMap);
  }

  public StepAveragesDashboard() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StepAveragesDashboard(StepAveragesDashboard other) {
    if (other.isSetRequireTemplates()) {
      List<String> __this__requireTemplates = new ArrayList<String>(other.requireTemplates.size());
      for (String other_element : other.requireTemplates) {
        __this__requireTemplates.add(other_element);
      }
      this.requireTemplates = __this__requireTemplates;
    }
    if (other.isSetJobMetadata()) {
      List<com.wi.director.thrift.v1.metadata.MetadataEntry> __this__jobMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>(other.jobMetadata.size());
      for (com.wi.director.thrift.v1.metadata.MetadataEntry other_element : other.jobMetadata) {
        __this__jobMetadata.add(new com.wi.director.thrift.v1.metadata.MetadataEntry(other_element));
      }
      this.jobMetadata = __this__jobMetadata;
    }
    if (other.isSetTemplateMetadata()) {
      List<com.wi.director.thrift.v1.metadata.MetadataEntry> __this__templateMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>(other.templateMetadata.size());
      for (com.wi.director.thrift.v1.metadata.MetadataEntry other_element : other.templateMetadata) {
        __this__templateMetadata.add(new com.wi.director.thrift.v1.metadata.MetadataEntry(other_element));
      }
      this.templateMetadata = __this__templateMetadata;
    }
  }

  public StepAveragesDashboard deepCopy() {
    return new StepAveragesDashboard(this);
  }

  @Override
  public void clear() {
    this.requireTemplates = null;
    this.jobMetadata = null;
    this.templateMetadata = null;
  }

  public int getRequireTemplatesSize() {
    return (this.requireTemplates == null) ? 0 : this.requireTemplates.size();
  }

  public java.util.Iterator<String> getRequireTemplatesIterator() {
    return (this.requireTemplates == null) ? null : this.requireTemplates.iterator();
  }

  public void addToRequireTemplates(String elem) {
    if (this.requireTemplates == null) {
      this.requireTemplates = new ArrayList<String>();
    }
    this.requireTemplates.add(elem);
  }

  public List<String> getRequireTemplates() {
    return this.requireTemplates;
  }

  public StepAveragesDashboard setRequireTemplates(List<String> requireTemplates) {
    this.requireTemplates = requireTemplates;
    return this;
  }

  public void unsetRequireTemplates() {
    this.requireTemplates = null;
  }

  /** Returns true if field requireTemplates is set (has been assigned a value) and false otherwise */
  public boolean isSetRequireTemplates() {
    return this.requireTemplates != null;
  }

  public void setRequireTemplatesIsSet(boolean value) {
    if (!value) {
      this.requireTemplates = null;
    }
  }

  public int getJobMetadataSize() {
    return (this.jobMetadata == null) ? 0 : this.jobMetadata.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.metadata.MetadataEntry> getJobMetadataIterator() {
    return (this.jobMetadata == null) ? null : this.jobMetadata.iterator();
  }

  public void addToJobMetadata(com.wi.director.thrift.v1.metadata.MetadataEntry elem) {
    if (this.jobMetadata == null) {
      this.jobMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>();
    }
    this.jobMetadata.add(elem);
  }

  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> getJobMetadata() {
    return this.jobMetadata;
  }

  public StepAveragesDashboard setJobMetadata(List<com.wi.director.thrift.v1.metadata.MetadataEntry> jobMetadata) {
    this.jobMetadata = jobMetadata;
    return this;
  }

  public void unsetJobMetadata() {
    this.jobMetadata = null;
  }

  /** Returns true if field jobMetadata is set (has been assigned a value) and false otherwise */
  public boolean isSetJobMetadata() {
    return this.jobMetadata != null;
  }

  public void setJobMetadataIsSet(boolean value) {
    if (!value) {
      this.jobMetadata = null;
    }
  }

  public int getTemplateMetadataSize() {
    return (this.templateMetadata == null) ? 0 : this.templateMetadata.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.metadata.MetadataEntry> getTemplateMetadataIterator() {
    return (this.templateMetadata == null) ? null : this.templateMetadata.iterator();
  }

  public void addToTemplateMetadata(com.wi.director.thrift.v1.metadata.MetadataEntry elem) {
    if (this.templateMetadata == null) {
      this.templateMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>();
    }
    this.templateMetadata.add(elem);
  }

  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> getTemplateMetadata() {
    return this.templateMetadata;
  }

  public StepAveragesDashboard setTemplateMetadata(List<com.wi.director.thrift.v1.metadata.MetadataEntry> templateMetadata) {
    this.templateMetadata = templateMetadata;
    return this;
  }

  public void unsetTemplateMetadata() {
    this.templateMetadata = null;
  }

  /** Returns true if field templateMetadata is set (has been assigned a value) and false otherwise */
  public boolean isSetTemplateMetadata() {
    return this.templateMetadata != null;
  }

  public void setTemplateMetadataIsSet(boolean value) {
    if (!value) {
      this.templateMetadata = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUIRE_TEMPLATES:
      if (value == null) {
        unsetRequireTemplates();
      } else {
        setRequireTemplates((List<String>)value);
      }
      break;

    case JOB_METADATA:
      if (value == null) {
        unsetJobMetadata();
      } else {
        setJobMetadata((List<com.wi.director.thrift.v1.metadata.MetadataEntry>)value);
      }
      break;

    case TEMPLATE_METADATA:
      if (value == null) {
        unsetTemplateMetadata();
      } else {
        setTemplateMetadata((List<com.wi.director.thrift.v1.metadata.MetadataEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUIRE_TEMPLATES:
      return getRequireTemplates();

    case JOB_METADATA:
      return getJobMetadata();

    case TEMPLATE_METADATA:
      return getTemplateMetadata();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUIRE_TEMPLATES:
      return isSetRequireTemplates();
    case JOB_METADATA:
      return isSetJobMetadata();
    case TEMPLATE_METADATA:
      return isSetTemplateMetadata();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StepAveragesDashboard)
      return this.equals((StepAveragesDashboard)that);
    return false;
  }

  public boolean equals(StepAveragesDashboard that) {
    if (that == null)
      return false;

    boolean this_present_requireTemplates = true && this.isSetRequireTemplates();
    boolean that_present_requireTemplates = true && that.isSetRequireTemplates();
    if (this_present_requireTemplates || that_present_requireTemplates) {
      if (!(this_present_requireTemplates && that_present_requireTemplates))
        return false;
      if (!this.requireTemplates.equals(that.requireTemplates))
        return false;
    }

    boolean this_present_jobMetadata = true && this.isSetJobMetadata();
    boolean that_present_jobMetadata = true && that.isSetJobMetadata();
    if (this_present_jobMetadata || that_present_jobMetadata) {
      if (!(this_present_jobMetadata && that_present_jobMetadata))
        return false;
      if (!this.jobMetadata.equals(that.jobMetadata))
        return false;
    }

    boolean this_present_templateMetadata = true && this.isSetTemplateMetadata();
    boolean that_present_templateMetadata = true && that.isSetTemplateMetadata();
    if (this_present_templateMetadata || that_present_templateMetadata) {
      if (!(this_present_templateMetadata && that_present_templateMetadata))
        return false;
      if (!this.templateMetadata.equals(that.templateMetadata))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_requireTemplates = true && (isSetRequireTemplates());
    list.add(present_requireTemplates);
    if (present_requireTemplates)
      list.add(requireTemplates);

    boolean present_jobMetadata = true && (isSetJobMetadata());
    list.add(present_jobMetadata);
    if (present_jobMetadata)
      list.add(jobMetadata);

    boolean present_templateMetadata = true && (isSetTemplateMetadata());
    list.add(present_templateMetadata);
    if (present_templateMetadata)
      list.add(templateMetadata);

    return list.hashCode();
  }

  @Override
  public int compareTo(StepAveragesDashboard other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequireTemplates()).compareTo(other.isSetRequireTemplates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequireTemplates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requireTemplates, other.requireTemplates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobMetadata()).compareTo(other.isSetJobMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobMetadata, other.jobMetadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTemplateMetadata()).compareTo(other.isSetTemplateMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemplateMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.templateMetadata, other.templateMetadata);
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
    StringBuilder sb = new StringBuilder("StepAveragesDashboard(");
    boolean first = true;

    if (isSetRequireTemplates()) {
      sb.append("requireTemplates:");
      if (this.requireTemplates == null) {
        sb.append("null");
      } else {
        sb.append(this.requireTemplates);
      }
      first = false;
    }
    if (isSetJobMetadata()) {
      if (!first) sb.append(", ");
      sb.append("jobMetadata:");
      if (this.jobMetadata == null) {
        sb.append("null");
      } else {
        sb.append(this.jobMetadata);
      }
      first = false;
    }
    if (isSetTemplateMetadata()) {
      if (!first) sb.append(", ");
      sb.append("templateMetadata:");
      if (this.templateMetadata == null) {
        sb.append("null");
      } else {
        sb.append(this.templateMetadata);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StepAveragesDashboardStandardSchemeFactory implements SchemeFactory {
    public StepAveragesDashboardStandardScheme getScheme() {
      return new StepAveragesDashboardStandardScheme();
    }
  }

  private static class StepAveragesDashboardStandardScheme extends StandardScheme<StepAveragesDashboard> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StepAveragesDashboard struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUIRE_TEMPLATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list92 = iprot.readListBegin();
                struct.requireTemplates = new ArrayList<String>(_list92.size);
                String _elem93;
                for (int _i94 = 0; _i94 < _list92.size; ++_i94)
                {
                  _elem93 = iprot.readString();
                  struct.requireTemplates.add(_elem93);
                }
                iprot.readListEnd();
              }
              struct.setRequireTemplatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list95 = iprot.readListBegin();
                struct.jobMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>(_list95.size);
                com.wi.director.thrift.v1.metadata.MetadataEntry _elem96;
                for (int _i97 = 0; _i97 < _list95.size; ++_i97)
                {
                  _elem96 = new com.wi.director.thrift.v1.metadata.MetadataEntry();
                  _elem96.read(iprot);
                  struct.jobMetadata.add(_elem96);
                }
                iprot.readListEnd();
              }
              struct.setJobMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEMPLATE_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list98 = iprot.readListBegin();
                struct.templateMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>(_list98.size);
                com.wi.director.thrift.v1.metadata.MetadataEntry _elem99;
                for (int _i100 = 0; _i100 < _list98.size; ++_i100)
                {
                  _elem99 = new com.wi.director.thrift.v1.metadata.MetadataEntry();
                  _elem99.read(iprot);
                  struct.templateMetadata.add(_elem99);
                }
                iprot.readListEnd();
              }
              struct.setTemplateMetadataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StepAveragesDashboard struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.requireTemplates != null) {
        if (struct.isSetRequireTemplates()) {
          oprot.writeFieldBegin(REQUIRE_TEMPLATES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.requireTemplates.size()));
            for (String _iter101 : struct.requireTemplates)
            {
              oprot.writeString(_iter101);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobMetadata != null) {
        if (struct.isSetJobMetadata()) {
          oprot.writeFieldBegin(JOB_METADATA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.jobMetadata.size()));
            for (com.wi.director.thrift.v1.metadata.MetadataEntry _iter102 : struct.jobMetadata)
            {
              _iter102.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.templateMetadata != null) {
        if (struct.isSetTemplateMetadata()) {
          oprot.writeFieldBegin(TEMPLATE_METADATA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.templateMetadata.size()));
            for (com.wi.director.thrift.v1.metadata.MetadataEntry _iter103 : struct.templateMetadata)
            {
              _iter103.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

