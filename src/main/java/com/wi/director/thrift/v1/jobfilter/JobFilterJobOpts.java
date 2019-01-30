/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.jobfilter;

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
public class JobFilterJobOpts implements org.apache.thrift.TBase<JobFilterJobOpts, JobFilterJobOpts._Fields>, java.io.Serializable, Cloneable, Comparable<JobFilterJobOpts> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobFilterJobOpts");

  private static final org.apache.thrift.protocol.TField OPTS_FIELD_DESC = new org.apache.thrift.protocol.TField("opts", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PLANNER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("plannerId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField JOB_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("jobMetadata", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField TEMPLATE_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("templateMetadata", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobFilterJobOptsStandardSchemeFactory());
  }

  public CommonFilterOpts opts; // required
  /**
   * Job planner user id
   */
  public String plannerId; // optional
  /**
   * Job metadata
   */
  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> jobMetadata; // optional
  /**
   * Template metadata on the job
   */
  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> templateMetadata; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPTS((short)1, "opts"),
    /**
     * Job planner user id
     */
    PLANNER_ID((short)2, "plannerId"),
    /**
     * Job metadata
     */
    JOB_METADATA((short)3, "jobMetadata"),
    /**
     * Template metadata on the job
     */
    TEMPLATE_METADATA((short)4, "templateMetadata");

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
        case 1: // OPTS
          return OPTS;
        case 2: // PLANNER_ID
          return PLANNER_ID;
        case 3: // JOB_METADATA
          return JOB_METADATA;
        case 4: // TEMPLATE_METADATA
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
  private static final _Fields optionals[] = {_Fields.PLANNER_ID,_Fields.JOB_METADATA,_Fields.TEMPLATE_METADATA};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPTS, new org.apache.thrift.meta_data.FieldMetaData("opts", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CommonFilterOpts.class)));
    tmpMap.put(_Fields.PLANNER_ID, new org.apache.thrift.meta_data.FieldMetaData("plannerId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_METADATA, new org.apache.thrift.meta_data.FieldMetaData("jobMetadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.metadata.MetadataEntry.class))));
    tmpMap.put(_Fields.TEMPLATE_METADATA, new org.apache.thrift.meta_data.FieldMetaData("templateMetadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.metadata.MetadataEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobFilterJobOpts.class, metaDataMap);
  }

  public JobFilterJobOpts() {
  }

  public JobFilterJobOpts(
    CommonFilterOpts opts)
  {
    this();
    this.opts = opts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobFilterJobOpts(JobFilterJobOpts other) {
    if (other.isSetOpts()) {
      this.opts = new CommonFilterOpts(other.opts);
    }
    if (other.isSetPlannerId()) {
      this.plannerId = other.plannerId;
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

  public JobFilterJobOpts deepCopy() {
    return new JobFilterJobOpts(this);
  }

  @Override
  public void clear() {
    this.opts = null;
    this.plannerId = null;
    this.jobMetadata = null;
    this.templateMetadata = null;
  }

  public CommonFilterOpts getOpts() {
    return this.opts;
  }

  public JobFilterJobOpts setOpts(CommonFilterOpts opts) {
    this.opts = opts;
    return this;
  }

  public void unsetOpts() {
    this.opts = null;
  }

  /** Returns true if field opts is set (has been assigned a value) and false otherwise */
  public boolean isSetOpts() {
    return this.opts != null;
  }

  public void setOptsIsSet(boolean value) {
    if (!value) {
      this.opts = null;
    }
  }

  /**
   * Job planner user id
   */
  public String getPlannerId() {
    return this.plannerId;
  }

  /**
   * Job planner user id
   */
  public JobFilterJobOpts setPlannerId(String plannerId) {
    this.plannerId = plannerId;
    return this;
  }

  public void unsetPlannerId() {
    this.plannerId = null;
  }

  /** Returns true if field plannerId is set (has been assigned a value) and false otherwise */
  public boolean isSetPlannerId() {
    return this.plannerId != null;
  }

  public void setPlannerIdIsSet(boolean value) {
    if (!value) {
      this.plannerId = null;
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

  /**
   * Job metadata
   */
  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> getJobMetadata() {
    return this.jobMetadata;
  }

  /**
   * Job metadata
   */
  public JobFilterJobOpts setJobMetadata(List<com.wi.director.thrift.v1.metadata.MetadataEntry> jobMetadata) {
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

  /**
   * Template metadata on the job
   */
  public List<com.wi.director.thrift.v1.metadata.MetadataEntry> getTemplateMetadata() {
    return this.templateMetadata;
  }

  /**
   * Template metadata on the job
   */
  public JobFilterJobOpts setTemplateMetadata(List<com.wi.director.thrift.v1.metadata.MetadataEntry> templateMetadata) {
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
    case OPTS:
      if (value == null) {
        unsetOpts();
      } else {
        setOpts((CommonFilterOpts)value);
      }
      break;

    case PLANNER_ID:
      if (value == null) {
        unsetPlannerId();
      } else {
        setPlannerId((String)value);
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
    case OPTS:
      return getOpts();

    case PLANNER_ID:
      return getPlannerId();

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
    case OPTS:
      return isSetOpts();
    case PLANNER_ID:
      return isSetPlannerId();
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
    if (that instanceof JobFilterJobOpts)
      return this.equals((JobFilterJobOpts)that);
    return false;
  }

  public boolean equals(JobFilterJobOpts that) {
    if (that == null)
      return false;

    boolean this_present_opts = true && this.isSetOpts();
    boolean that_present_opts = true && that.isSetOpts();
    if (this_present_opts || that_present_opts) {
      if (!(this_present_opts && that_present_opts))
        return false;
      if (!this.opts.equals(that.opts))
        return false;
    }

    boolean this_present_plannerId = true && this.isSetPlannerId();
    boolean that_present_plannerId = true && that.isSetPlannerId();
    if (this_present_plannerId || that_present_plannerId) {
      if (!(this_present_plannerId && that_present_plannerId))
        return false;
      if (!this.plannerId.equals(that.plannerId))
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

    boolean present_opts = true && (isSetOpts());
    list.add(present_opts);
    if (present_opts)
      list.add(opts);

    boolean present_plannerId = true && (isSetPlannerId());
    list.add(present_plannerId);
    if (present_plannerId)
      list.add(plannerId);

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
  public int compareTo(JobFilterJobOpts other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOpts()).compareTo(other.isSetOpts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opts, other.opts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPlannerId()).compareTo(other.isSetPlannerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlannerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plannerId, other.plannerId);
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
    StringBuilder sb = new StringBuilder("JobFilterJobOpts(");
    boolean first = true;

    sb.append("opts:");
    if (this.opts == null) {
      sb.append("null");
    } else {
      sb.append(this.opts);
    }
    first = false;
    if (isSetPlannerId()) {
      if (!first) sb.append(", ");
      sb.append("plannerId:");
      if (this.plannerId == null) {
        sb.append("null");
      } else {
        sb.append(this.plannerId);
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
    if (opts != null) {
      opts.validate();
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

  private static class JobFilterJobOptsStandardSchemeFactory implements SchemeFactory {
    public JobFilterJobOptsStandardScheme getScheme() {
      return new JobFilterJobOptsStandardScheme();
    }
  }

  private static class JobFilterJobOptsStandardScheme extends StandardScheme<JobFilterJobOpts> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobFilterJobOpts struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.opts = new CommonFilterOpts();
              struct.opts.read(iprot);
              struct.setOptsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PLANNER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.plannerId = iprot.readString();
              struct.setPlannerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JOB_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.jobMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>(_list8.size);
                com.wi.director.thrift.v1.metadata.MetadataEntry _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new com.wi.director.thrift.v1.metadata.MetadataEntry();
                  _elem9.read(iprot);
                  struct.jobMetadata.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setJobMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TEMPLATE_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.templateMetadata = new ArrayList<com.wi.director.thrift.v1.metadata.MetadataEntry>(_list11.size);
                com.wi.director.thrift.v1.metadata.MetadataEntry _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = new com.wi.director.thrift.v1.metadata.MetadataEntry();
                  _elem12.read(iprot);
                  struct.templateMetadata.add(_elem12);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobFilterJobOpts struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.opts != null) {
        oprot.writeFieldBegin(OPTS_FIELD_DESC);
        struct.opts.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.plannerId != null) {
        if (struct.isSetPlannerId()) {
          oprot.writeFieldBegin(PLANNER_ID_FIELD_DESC);
          oprot.writeString(struct.plannerId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobMetadata != null) {
        if (struct.isSetJobMetadata()) {
          oprot.writeFieldBegin(JOB_METADATA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.jobMetadata.size()));
            for (com.wi.director.thrift.v1.metadata.MetadataEntry _iter14 : struct.jobMetadata)
            {
              _iter14.write(oprot);
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
            for (com.wi.director.thrift.v1.metadata.MetadataEntry _iter15 : struct.templateMetadata)
            {
              _iter15.write(oprot);
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
