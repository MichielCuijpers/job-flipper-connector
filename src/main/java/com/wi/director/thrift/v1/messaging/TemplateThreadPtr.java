/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.messaging;

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
public class TemplateThreadPtr implements org.apache.thrift.TBase<TemplateThreadPtr, TemplateThreadPtr._Fields>, java.io.Serializable, Cloneable, Comparable<TemplateThreadPtr> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TemplateThreadPtr");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STEP_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("stepPtr", org.apache.thrift.protocol.TType.STRUCT, (short)10);
  private static final org.apache.thrift.protocol.TField STEP_GROUP_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("stepGroupPtr", org.apache.thrift.protocol.TType.STRUCT, (short)11);
  private static final org.apache.thrift.protocol.TField TITLE_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("titlePtr", org.apache.thrift.protocol.TType.STRUCT, (short)12);
  private static final org.apache.thrift.protocol.TField PPE_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("ppePtr", org.apache.thrift.protocol.TType.STRUCT, (short)13);
  private static final org.apache.thrift.protocol.TField NOTICES_PTR_FIELD_DESC = new org.apache.thrift.protocol.TField("noticesPtr", org.apache.thrift.protocol.TType.STRUCT, (short)14);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TemplateThreadPtrStandardSchemeFactory());
  }

  /**
   * id of the template this struct is referencing.
   */
  public String id; // required
  public StepPtr stepPtr; // optional
  public StepGroupPtr stepGroupPtr; // optional
  public TitlePtr titlePtr; // optional
  public PpePtr ppePtr; // optional
  public NoticesPtr noticesPtr; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * id of the template this struct is referencing.
     */
    ID((short)1, "id"),
    STEP_PTR((short)10, "stepPtr"),
    STEP_GROUP_PTR((short)11, "stepGroupPtr"),
    TITLE_PTR((short)12, "titlePtr"),
    PPE_PTR((short)13, "ppePtr"),
    NOTICES_PTR((short)14, "noticesPtr");

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
        case 1: // ID
          return ID;
        case 10: // STEP_PTR
          return STEP_PTR;
        case 11: // STEP_GROUP_PTR
          return STEP_GROUP_PTR;
        case 12: // TITLE_PTR
          return TITLE_PTR;
        case 13: // PPE_PTR
          return PPE_PTR;
        case 14: // NOTICES_PTR
          return NOTICES_PTR;
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
  private static final _Fields optionals[] = {_Fields.STEP_PTR,_Fields.STEP_GROUP_PTR,_Fields.TITLE_PTR,_Fields.PPE_PTR,_Fields.NOTICES_PTR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STEP_PTR, new org.apache.thrift.meta_data.FieldMetaData("stepPtr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StepPtr.class)));
    tmpMap.put(_Fields.STEP_GROUP_PTR, new org.apache.thrift.meta_data.FieldMetaData("stepGroupPtr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StepGroupPtr.class)));
    tmpMap.put(_Fields.TITLE_PTR, new org.apache.thrift.meta_data.FieldMetaData("titlePtr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TitlePtr.class)));
    tmpMap.put(_Fields.PPE_PTR, new org.apache.thrift.meta_data.FieldMetaData("ppePtr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PpePtr.class)));
    tmpMap.put(_Fields.NOTICES_PTR, new org.apache.thrift.meta_data.FieldMetaData("noticesPtr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NoticesPtr.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TemplateThreadPtr.class, metaDataMap);
  }

  public TemplateThreadPtr() {
  }

  public TemplateThreadPtr(
    String id)
  {
    this();
    this.id = id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TemplateThreadPtr(TemplateThreadPtr other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetStepPtr()) {
      this.stepPtr = new StepPtr(other.stepPtr);
    }
    if (other.isSetStepGroupPtr()) {
      this.stepGroupPtr = new StepGroupPtr(other.stepGroupPtr);
    }
    if (other.isSetTitlePtr()) {
      this.titlePtr = new TitlePtr(other.titlePtr);
    }
    if (other.isSetPpePtr()) {
      this.ppePtr = new PpePtr(other.ppePtr);
    }
    if (other.isSetNoticesPtr()) {
      this.noticesPtr = new NoticesPtr(other.noticesPtr);
    }
  }

  public TemplateThreadPtr deepCopy() {
    return new TemplateThreadPtr(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.stepPtr = null;
    this.stepGroupPtr = null;
    this.titlePtr = null;
    this.ppePtr = null;
    this.noticesPtr = null;
  }

  /**
   * id of the template this struct is referencing.
   */
  public String getId() {
    return this.id;
  }

  /**
   * id of the template this struct is referencing.
   */
  public TemplateThreadPtr setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public StepPtr getStepPtr() {
    return this.stepPtr;
  }

  public TemplateThreadPtr setStepPtr(StepPtr stepPtr) {
    this.stepPtr = stepPtr;
    return this;
  }

  public void unsetStepPtr() {
    this.stepPtr = null;
  }

  /** Returns true if field stepPtr is set (has been assigned a value) and false otherwise */
  public boolean isSetStepPtr() {
    return this.stepPtr != null;
  }

  public void setStepPtrIsSet(boolean value) {
    if (!value) {
      this.stepPtr = null;
    }
  }

  public StepGroupPtr getStepGroupPtr() {
    return this.stepGroupPtr;
  }

  public TemplateThreadPtr setStepGroupPtr(StepGroupPtr stepGroupPtr) {
    this.stepGroupPtr = stepGroupPtr;
    return this;
  }

  public void unsetStepGroupPtr() {
    this.stepGroupPtr = null;
  }

  /** Returns true if field stepGroupPtr is set (has been assigned a value) and false otherwise */
  public boolean isSetStepGroupPtr() {
    return this.stepGroupPtr != null;
  }

  public void setStepGroupPtrIsSet(boolean value) {
    if (!value) {
      this.stepGroupPtr = null;
    }
  }

  public TitlePtr getTitlePtr() {
    return this.titlePtr;
  }

  public TemplateThreadPtr setTitlePtr(TitlePtr titlePtr) {
    this.titlePtr = titlePtr;
    return this;
  }

  public void unsetTitlePtr() {
    this.titlePtr = null;
  }

  /** Returns true if field titlePtr is set (has been assigned a value) and false otherwise */
  public boolean isSetTitlePtr() {
    return this.titlePtr != null;
  }

  public void setTitlePtrIsSet(boolean value) {
    if (!value) {
      this.titlePtr = null;
    }
  }

  public PpePtr getPpePtr() {
    return this.ppePtr;
  }

  public TemplateThreadPtr setPpePtr(PpePtr ppePtr) {
    this.ppePtr = ppePtr;
    return this;
  }

  public void unsetPpePtr() {
    this.ppePtr = null;
  }

  /** Returns true if field ppePtr is set (has been assigned a value) and false otherwise */
  public boolean isSetPpePtr() {
    return this.ppePtr != null;
  }

  public void setPpePtrIsSet(boolean value) {
    if (!value) {
      this.ppePtr = null;
    }
  }

  public NoticesPtr getNoticesPtr() {
    return this.noticesPtr;
  }

  public TemplateThreadPtr setNoticesPtr(NoticesPtr noticesPtr) {
    this.noticesPtr = noticesPtr;
    return this;
  }

  public void unsetNoticesPtr() {
    this.noticesPtr = null;
  }

  /** Returns true if field noticesPtr is set (has been assigned a value) and false otherwise */
  public boolean isSetNoticesPtr() {
    return this.noticesPtr != null;
  }

  public void setNoticesPtrIsSet(boolean value) {
    if (!value) {
      this.noticesPtr = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case STEP_PTR:
      if (value == null) {
        unsetStepPtr();
      } else {
        setStepPtr((StepPtr)value);
      }
      break;

    case STEP_GROUP_PTR:
      if (value == null) {
        unsetStepGroupPtr();
      } else {
        setStepGroupPtr((StepGroupPtr)value);
      }
      break;

    case TITLE_PTR:
      if (value == null) {
        unsetTitlePtr();
      } else {
        setTitlePtr((TitlePtr)value);
      }
      break;

    case PPE_PTR:
      if (value == null) {
        unsetPpePtr();
      } else {
        setPpePtr((PpePtr)value);
      }
      break;

    case NOTICES_PTR:
      if (value == null) {
        unsetNoticesPtr();
      } else {
        setNoticesPtr((NoticesPtr)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case STEP_PTR:
      return getStepPtr();

    case STEP_GROUP_PTR:
      return getStepGroupPtr();

    case TITLE_PTR:
      return getTitlePtr();

    case PPE_PTR:
      return getPpePtr();

    case NOTICES_PTR:
      return getNoticesPtr();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case STEP_PTR:
      return isSetStepPtr();
    case STEP_GROUP_PTR:
      return isSetStepGroupPtr();
    case TITLE_PTR:
      return isSetTitlePtr();
    case PPE_PTR:
      return isSetPpePtr();
    case NOTICES_PTR:
      return isSetNoticesPtr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TemplateThreadPtr)
      return this.equals((TemplateThreadPtr)that);
    return false;
  }

  public boolean equals(TemplateThreadPtr that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_stepPtr = true && this.isSetStepPtr();
    boolean that_present_stepPtr = true && that.isSetStepPtr();
    if (this_present_stepPtr || that_present_stepPtr) {
      if (!(this_present_stepPtr && that_present_stepPtr))
        return false;
      if (!this.stepPtr.equals(that.stepPtr))
        return false;
    }

    boolean this_present_stepGroupPtr = true && this.isSetStepGroupPtr();
    boolean that_present_stepGroupPtr = true && that.isSetStepGroupPtr();
    if (this_present_stepGroupPtr || that_present_stepGroupPtr) {
      if (!(this_present_stepGroupPtr && that_present_stepGroupPtr))
        return false;
      if (!this.stepGroupPtr.equals(that.stepGroupPtr))
        return false;
    }

    boolean this_present_titlePtr = true && this.isSetTitlePtr();
    boolean that_present_titlePtr = true && that.isSetTitlePtr();
    if (this_present_titlePtr || that_present_titlePtr) {
      if (!(this_present_titlePtr && that_present_titlePtr))
        return false;
      if (!this.titlePtr.equals(that.titlePtr))
        return false;
    }

    boolean this_present_ppePtr = true && this.isSetPpePtr();
    boolean that_present_ppePtr = true && that.isSetPpePtr();
    if (this_present_ppePtr || that_present_ppePtr) {
      if (!(this_present_ppePtr && that_present_ppePtr))
        return false;
      if (!this.ppePtr.equals(that.ppePtr))
        return false;
    }

    boolean this_present_noticesPtr = true && this.isSetNoticesPtr();
    boolean that_present_noticesPtr = true && that.isSetNoticesPtr();
    if (this_present_noticesPtr || that_present_noticesPtr) {
      if (!(this_present_noticesPtr && that_present_noticesPtr))
        return false;
      if (!this.noticesPtr.equals(that.noticesPtr))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_stepPtr = true && (isSetStepPtr());
    list.add(present_stepPtr);
    if (present_stepPtr)
      list.add(stepPtr);

    boolean present_stepGroupPtr = true && (isSetStepGroupPtr());
    list.add(present_stepGroupPtr);
    if (present_stepGroupPtr)
      list.add(stepGroupPtr);

    boolean present_titlePtr = true && (isSetTitlePtr());
    list.add(present_titlePtr);
    if (present_titlePtr)
      list.add(titlePtr);

    boolean present_ppePtr = true && (isSetPpePtr());
    list.add(present_ppePtr);
    if (present_ppePtr)
      list.add(ppePtr);

    boolean present_noticesPtr = true && (isSetNoticesPtr());
    list.add(present_noticesPtr);
    if (present_noticesPtr)
      list.add(noticesPtr);

    return list.hashCode();
  }

  @Override
  public int compareTo(TemplateThreadPtr other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStepPtr()).compareTo(other.isSetStepPtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStepPtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stepPtr, other.stepPtr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStepGroupPtr()).compareTo(other.isSetStepGroupPtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStepGroupPtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stepGroupPtr, other.stepGroupPtr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitlePtr()).compareTo(other.isSetTitlePtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitlePtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.titlePtr, other.titlePtr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPpePtr()).compareTo(other.isSetPpePtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPpePtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ppePtr, other.ppePtr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNoticesPtr()).compareTo(other.isSetNoticesPtr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoticesPtr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.noticesPtr, other.noticesPtr);
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
    StringBuilder sb = new StringBuilder("TemplateThreadPtr(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (isSetStepPtr()) {
      if (!first) sb.append(", ");
      sb.append("stepPtr:");
      if (this.stepPtr == null) {
        sb.append("null");
      } else {
        sb.append(this.stepPtr);
      }
      first = false;
    }
    if (isSetStepGroupPtr()) {
      if (!first) sb.append(", ");
      sb.append("stepGroupPtr:");
      if (this.stepGroupPtr == null) {
        sb.append("null");
      } else {
        sb.append(this.stepGroupPtr);
      }
      first = false;
    }
    if (isSetTitlePtr()) {
      if (!first) sb.append(", ");
      sb.append("titlePtr:");
      if (this.titlePtr == null) {
        sb.append("null");
      } else {
        sb.append(this.titlePtr);
      }
      first = false;
    }
    if (isSetPpePtr()) {
      if (!first) sb.append(", ");
      sb.append("ppePtr:");
      if (this.ppePtr == null) {
        sb.append("null");
      } else {
        sb.append(this.ppePtr);
      }
      first = false;
    }
    if (isSetNoticesPtr()) {
      if (!first) sb.append(", ");
      sb.append("noticesPtr:");
      if (this.noticesPtr == null) {
        sb.append("null");
      } else {
        sb.append(this.noticesPtr);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stepPtr != null) {
      stepPtr.validate();
    }
    if (stepGroupPtr != null) {
      stepGroupPtr.validate();
    }
    if (titlePtr != null) {
      titlePtr.validate();
    }
    if (ppePtr != null) {
      ppePtr.validate();
    }
    if (noticesPtr != null) {
      noticesPtr.validate();
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

  private static class TemplateThreadPtrStandardSchemeFactory implements SchemeFactory {
    public TemplateThreadPtrStandardScheme getScheme() {
      return new TemplateThreadPtrStandardScheme();
    }
  }

  private static class TemplateThreadPtrStandardScheme extends StandardScheme<TemplateThreadPtr> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TemplateThreadPtr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // STEP_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stepPtr = new StepPtr();
              struct.stepPtr.read(iprot);
              struct.setStepPtrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // STEP_GROUP_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stepGroupPtr = new StepGroupPtr();
              struct.stepGroupPtr.read(iprot);
              struct.setStepGroupPtrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // TITLE_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.titlePtr = new TitlePtr();
              struct.titlePtr.read(iprot);
              struct.setTitlePtrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 13: // PPE_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ppePtr = new PpePtr();
              struct.ppePtr.read(iprot);
              struct.setPpePtrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 14: // NOTICES_PTR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.noticesPtr = new NoticesPtr();
              struct.noticesPtr.read(iprot);
              struct.setNoticesPtrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TemplateThreadPtr struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.stepPtr != null) {
        if (struct.isSetStepPtr()) {
          oprot.writeFieldBegin(STEP_PTR_FIELD_DESC);
          struct.stepPtr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.stepGroupPtr != null) {
        if (struct.isSetStepGroupPtr()) {
          oprot.writeFieldBegin(STEP_GROUP_PTR_FIELD_DESC);
          struct.stepGroupPtr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.titlePtr != null) {
        if (struct.isSetTitlePtr()) {
          oprot.writeFieldBegin(TITLE_PTR_FIELD_DESC);
          struct.titlePtr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ppePtr != null) {
        if (struct.isSetPpePtr()) {
          oprot.writeFieldBegin(PPE_PTR_FIELD_DESC);
          struct.ppePtr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.noticesPtr != null) {
        if (struct.isSetNoticesPtr()) {
          oprot.writeFieldBegin(NOTICES_PTR_FIELD_DESC);
          struct.noticesPtr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
