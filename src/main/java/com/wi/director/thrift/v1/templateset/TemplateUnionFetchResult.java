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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class TemplateUnionFetchResult implements org.apache.thrift.TBase<TemplateUnionFetchResult, TemplateUnionFetchResult._Fields>, java.io.Serializable, Cloneable, Comparable<TemplateUnionFetchResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TemplateUnionFetchResult");

  private static final org.apache.thrift.protocol.TField TEMPLATE_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("templateResult", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField TEMPLATE_SET_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("templateSetResult", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TemplateUnionFetchResultStandardSchemeFactory());
  }

  public Map<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult> templateResult; // required
  public Map<String,TemplateSetFetchResult> templateSetResult; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEMPLATE_RESULT((short)1, "templateResult"),
    TEMPLATE_SET_RESULT((short)2, "templateSetResult");

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
        case 1: // TEMPLATE_RESULT
          return TEMPLATE_RESULT;
        case 2: // TEMPLATE_SET_RESULT
          return TEMPLATE_SET_RESULT;
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
    tmpMap.put(_Fields.TEMPLATE_RESULT, new org.apache.thrift.meta_data.FieldMetaData("templateResult", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult.class))));
    tmpMap.put(_Fields.TEMPLATE_SET_RESULT, new org.apache.thrift.meta_data.FieldMetaData("templateSetResult", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TemplateSetFetchResult.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TemplateUnionFetchResult.class, metaDataMap);
  }

  public TemplateUnionFetchResult() {
  }

  public TemplateUnionFetchResult(
    Map<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult> templateResult,
    Map<String,TemplateSetFetchResult> templateSetResult)
  {
    this();
    this.templateResult = templateResult;
    this.templateSetResult = templateSetResult;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TemplateUnionFetchResult(TemplateUnionFetchResult other) {
    if (other.isSetTemplateResult()) {
      Map<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult> __this__templateResult = new HashMap<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult>(other.templateResult.size());
      for (Map.Entry<String, com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult> other_element : other.templateResult.entrySet()) {

        String other_element_key = other_element.getKey();
        com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult other_element_value = other_element.getValue();

        String __this__templateResult_copy_key = other_element_key;

        com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult __this__templateResult_copy_value = new com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult(other_element_value);

        __this__templateResult.put(__this__templateResult_copy_key, __this__templateResult_copy_value);
      }
      this.templateResult = __this__templateResult;
    }
    if (other.isSetTemplateSetResult()) {
      Map<String,TemplateSetFetchResult> __this__templateSetResult = new HashMap<String,TemplateSetFetchResult>(other.templateSetResult.size());
      for (Map.Entry<String, TemplateSetFetchResult> other_element : other.templateSetResult.entrySet()) {

        String other_element_key = other_element.getKey();
        TemplateSetFetchResult other_element_value = other_element.getValue();

        String __this__templateSetResult_copy_key = other_element_key;

        TemplateSetFetchResult __this__templateSetResult_copy_value = new TemplateSetFetchResult(other_element_value);

        __this__templateSetResult.put(__this__templateSetResult_copy_key, __this__templateSetResult_copy_value);
      }
      this.templateSetResult = __this__templateSetResult;
    }
  }

  public TemplateUnionFetchResult deepCopy() {
    return new TemplateUnionFetchResult(this);
  }

  @Override
  public void clear() {
    this.templateResult = null;
    this.templateSetResult = null;
  }

  public int getTemplateResultSize() {
    return (this.templateResult == null) ? 0 : this.templateResult.size();
  }

  public void putToTemplateResult(String key, com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult val) {
    if (this.templateResult == null) {
      this.templateResult = new HashMap<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult>();
    }
    this.templateResult.put(key, val);
  }

  public Map<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult> getTemplateResult() {
    return this.templateResult;
  }

  public TemplateUnionFetchResult setTemplateResult(Map<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult> templateResult) {
    this.templateResult = templateResult;
    return this;
  }

  public void unsetTemplateResult() {
    this.templateResult = null;
  }

  /** Returns true if field templateResult is set (has been assigned a value) and false otherwise */
  public boolean isSetTemplateResult() {
    return this.templateResult != null;
  }

  public void setTemplateResultIsSet(boolean value) {
    if (!value) {
      this.templateResult = null;
    }
  }

  public int getTemplateSetResultSize() {
    return (this.templateSetResult == null) ? 0 : this.templateSetResult.size();
  }

  public void putToTemplateSetResult(String key, TemplateSetFetchResult val) {
    if (this.templateSetResult == null) {
      this.templateSetResult = new HashMap<String,TemplateSetFetchResult>();
    }
    this.templateSetResult.put(key, val);
  }

  public Map<String,TemplateSetFetchResult> getTemplateSetResult() {
    return this.templateSetResult;
  }

  public TemplateUnionFetchResult setTemplateSetResult(Map<String,TemplateSetFetchResult> templateSetResult) {
    this.templateSetResult = templateSetResult;
    return this;
  }

  public void unsetTemplateSetResult() {
    this.templateSetResult = null;
  }

  /** Returns true if field templateSetResult is set (has been assigned a value) and false otherwise */
  public boolean isSetTemplateSetResult() {
    return this.templateSetResult != null;
  }

  public void setTemplateSetResultIsSet(boolean value) {
    if (!value) {
      this.templateSetResult = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEMPLATE_RESULT:
      if (value == null) {
        unsetTemplateResult();
      } else {
        setTemplateResult((Map<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult>)value);
      }
      break;

    case TEMPLATE_SET_RESULT:
      if (value == null) {
        unsetTemplateSetResult();
      } else {
        setTemplateSetResult((Map<String,TemplateSetFetchResult>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEMPLATE_RESULT:
      return getTemplateResult();

    case TEMPLATE_SET_RESULT:
      return getTemplateSetResult();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEMPLATE_RESULT:
      return isSetTemplateResult();
    case TEMPLATE_SET_RESULT:
      return isSetTemplateSetResult();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TemplateUnionFetchResult)
      return this.equals((TemplateUnionFetchResult)that);
    return false;
  }

  public boolean equals(TemplateUnionFetchResult that) {
    if (that == null)
      return false;

    boolean this_present_templateResult = true && this.isSetTemplateResult();
    boolean that_present_templateResult = true && that.isSetTemplateResult();
    if (this_present_templateResult || that_present_templateResult) {
      if (!(this_present_templateResult && that_present_templateResult))
        return false;
      if (!this.templateResult.equals(that.templateResult))
        return false;
    }

    boolean this_present_templateSetResult = true && this.isSetTemplateSetResult();
    boolean that_present_templateSetResult = true && that.isSetTemplateSetResult();
    if (this_present_templateSetResult || that_present_templateSetResult) {
      if (!(this_present_templateSetResult && that_present_templateSetResult))
        return false;
      if (!this.templateSetResult.equals(that.templateSetResult))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_templateResult = true && (isSetTemplateResult());
    list.add(present_templateResult);
    if (present_templateResult)
      list.add(templateResult);

    boolean present_templateSetResult = true && (isSetTemplateSetResult());
    list.add(present_templateSetResult);
    if (present_templateSetResult)
      list.add(templateSetResult);

    return list.hashCode();
  }

  @Override
  public int compareTo(TemplateUnionFetchResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTemplateResult()).compareTo(other.isSetTemplateResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemplateResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.templateResult, other.templateResult);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTemplateSetResult()).compareTo(other.isSetTemplateSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemplateSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.templateSetResult, other.templateSetResult);
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
    StringBuilder sb = new StringBuilder("TemplateUnionFetchResult(");
    boolean first = true;

    sb.append("templateResult:");
    if (this.templateResult == null) {
      sb.append("null");
    } else {
      sb.append(this.templateResult);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("templateSetResult:");
    if (this.templateSetResult == null) {
      sb.append("null");
    } else {
      sb.append(this.templateSetResult);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TemplateUnionFetchResultStandardSchemeFactory implements SchemeFactory {
    public TemplateUnionFetchResultStandardScheme getScheme() {
      return new TemplateUnionFetchResultStandardScheme();
    }
  }

  private static class TemplateUnionFetchResultStandardScheme extends StandardScheme<TemplateUnionFetchResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TemplateUnionFetchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEMPLATE_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map20 = iprot.readMapBegin();
                struct.templateResult = new HashMap<String,com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult>(2*_map20.size);
                String _key21;
                com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult _val22;
                for (int _i23 = 0; _i23 < _map20.size; ++_i23)
                {
                  _key21 = iprot.readString();
                  _val22 = new com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult();
                  _val22.read(iprot);
                  struct.templateResult.put(_key21, _val22);
                }
                iprot.readMapEnd();
              }
              struct.setTemplateResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TEMPLATE_SET_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map24 = iprot.readMapBegin();
                struct.templateSetResult = new HashMap<String,TemplateSetFetchResult>(2*_map24.size);
                String _key25;
                TemplateSetFetchResult _val26;
                for (int _i27 = 0; _i27 < _map24.size; ++_i27)
                {
                  _key25 = iprot.readString();
                  _val26 = new TemplateSetFetchResult();
                  _val26.read(iprot);
                  struct.templateSetResult.put(_key25, _val26);
                }
                iprot.readMapEnd();
              }
              struct.setTemplateSetResultIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TemplateUnionFetchResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.templateResult != null) {
        oprot.writeFieldBegin(TEMPLATE_RESULT_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.templateResult.size()));
          for (Map.Entry<String, com.wi.director.thrift.v1.jobtemplate.TemplateFetchResult> _iter28 : struct.templateResult.entrySet())
          {
            oprot.writeString(_iter28.getKey());
            _iter28.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.templateSetResult != null) {
        oprot.writeFieldBegin(TEMPLATE_SET_RESULT_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.templateSetResult.size()));
          for (Map.Entry<String, TemplateSetFetchResult> _iter29 : struct.templateSetResult.entrySet())
          {
            oprot.writeString(_iter29.getKey());
            _iter29.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
