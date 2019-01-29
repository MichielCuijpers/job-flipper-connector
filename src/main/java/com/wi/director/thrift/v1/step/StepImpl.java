/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.step;

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
 * Union of Step/StepGroup
 */
public class StepImpl extends org.apache.thrift.TUnion<StepImpl, StepImpl._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StepImpl");
  private static final org.apache.thrift.protocol.TField STEP_FIELD_DESC = new org.apache.thrift.protocol.TField("step", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STEP_GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("stepGroup", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STEP((short)1, "step"),
    STEP_GROUP((short)2, "stepGroup");

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
        case 1: // STEP
          return STEP;
        case 2: // STEP_GROUP
          return STEP_GROUP;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STEP, new org.apache.thrift.meta_data.FieldMetaData("step", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Step.class)));
    tmpMap.put(_Fields.STEP_GROUP, new org.apache.thrift.meta_data.FieldMetaData("stepGroup", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StepGroup.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StepImpl.class, metaDataMap);
  }

  public StepImpl() {
    super();
  }

  public StepImpl(_Fields setField, Object value) {
    super(setField, value);
  }

  public StepImpl(StepImpl other) {
    super(other);
  }
  public StepImpl deepCopy() {
    return new StepImpl(this);
  }

  public static StepImpl step(Step value) {
    StepImpl x = new StepImpl();
    x.setStep(value);
    return x;
  }

  public static StepImpl stepGroup(StepGroup value) {
    StepImpl x = new StepImpl();
    x.setStepGroup(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case STEP:
        if (value instanceof Step) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Step for field 'step', but got " + value.getClass().getSimpleName());
      case STEP_GROUP:
        if (value instanceof StepGroup) {
          break;
        }
        throw new ClassCastException("Was expecting value of type StepGroup for field 'stepGroup', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case STEP:
          if (field.type == STEP_FIELD_DESC.type) {
            Step step;
            step = new Step();
            step.read(iprot);
            return step;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STEP_GROUP:
          if (field.type == STEP_GROUP_FIELD_DESC.type) {
            StepGroup stepGroup;
            stepGroup = new StepGroup();
            stepGroup.read(iprot);
            return stepGroup;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STEP:
        Step step = (Step)value_;
        step.write(oprot);
        return;
      case STEP_GROUP:
        StepGroup stepGroup = (StepGroup)value_;
        stepGroup.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case STEP:
          Step step;
          step = new Step();
          step.read(iprot);
          return step;
        case STEP_GROUP:
          StepGroup stepGroup;
          stepGroup = new StepGroup();
          stepGroup.read(iprot);
          return stepGroup;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STEP:
        Step step = (Step)value_;
        step.write(oprot);
        return;
      case STEP_GROUP:
        StepGroup stepGroup = (StepGroup)value_;
        stepGroup.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case STEP:
        return STEP_FIELD_DESC;
      case STEP_GROUP:
        return STEP_GROUP_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public Step getStep() {
    if (getSetField() == _Fields.STEP) {
      return (Step)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'step' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStep(Step value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STEP;
    value_ = value;
  }

  public StepGroup getStepGroup() {
    if (getSetField() == _Fields.STEP_GROUP) {
      return (StepGroup)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stepGroup' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStepGroup(StepGroup value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STEP_GROUP;
    value_ = value;
  }

  public boolean isSetStep() {
    return setField_ == _Fields.STEP;
  }


  public boolean isSetStepGroup() {
    return setField_ == _Fields.STEP_GROUP;
  }


  public boolean equals(Object other) {
    if (other instanceof StepImpl) {
      return equals((StepImpl)other);
    } else {
      return false;
    }
  }

  public boolean equals(StepImpl other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(StepImpl other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}
