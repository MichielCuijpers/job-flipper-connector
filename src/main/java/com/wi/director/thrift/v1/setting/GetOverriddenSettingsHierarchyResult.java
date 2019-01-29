/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.setting;

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
public class GetOverriddenSettingsHierarchyResult implements org.apache.thrift.TBase<GetOverriddenSettingsHierarchyResult, GetOverriddenSettingsHierarchyResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetOverriddenSettingsHierarchyResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetOverriddenSettingsHierarchyResult");

  private static final org.apache.thrift.protocol.TField SETTING_RULES_AND_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("settingRulesAndValues", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetOverriddenSettingsHierarchyResultStandardSchemeFactory());
  }

  /**
   * Note this uses SettingRuleDiff, however there is no change.
   * Only the newSettings of SettingRuleDiff will be set.
   * Done to prevent proliferation of classes.
   */
  public List<SettingRuleDiff> settingRulesAndValues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Note this uses SettingRuleDiff, however there is no change.
     * Only the newSettings of SettingRuleDiff will be set.
     * Done to prevent proliferation of classes.
     */
    SETTING_RULES_AND_VALUES((short)1, "settingRulesAndValues");

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
        case 1: // SETTING_RULES_AND_VALUES
          return SETTING_RULES_AND_VALUES;
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
    tmpMap.put(_Fields.SETTING_RULES_AND_VALUES, new org.apache.thrift.meta_data.FieldMetaData("settingRulesAndValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SettingRuleDiff.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetOverriddenSettingsHierarchyResult.class, metaDataMap);
  }

  public GetOverriddenSettingsHierarchyResult() {
  }

  public GetOverriddenSettingsHierarchyResult(
    List<SettingRuleDiff> settingRulesAndValues)
  {
    this();
    this.settingRulesAndValues = settingRulesAndValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetOverriddenSettingsHierarchyResult(GetOverriddenSettingsHierarchyResult other) {
    if (other.isSetSettingRulesAndValues()) {
      List<SettingRuleDiff> __this__settingRulesAndValues = new ArrayList<SettingRuleDiff>(other.settingRulesAndValues.size());
      for (SettingRuleDiff other_element : other.settingRulesAndValues) {
        __this__settingRulesAndValues.add(new SettingRuleDiff(other_element));
      }
      this.settingRulesAndValues = __this__settingRulesAndValues;
    }
  }

  public GetOverriddenSettingsHierarchyResult deepCopy() {
    return new GetOverriddenSettingsHierarchyResult(this);
  }

  @Override
  public void clear() {
    this.settingRulesAndValues = null;
  }

  public int getSettingRulesAndValuesSize() {
    return (this.settingRulesAndValues == null) ? 0 : this.settingRulesAndValues.size();
  }

  public java.util.Iterator<SettingRuleDiff> getSettingRulesAndValuesIterator() {
    return (this.settingRulesAndValues == null) ? null : this.settingRulesAndValues.iterator();
  }

  public void addToSettingRulesAndValues(SettingRuleDiff elem) {
    if (this.settingRulesAndValues == null) {
      this.settingRulesAndValues = new ArrayList<SettingRuleDiff>();
    }
    this.settingRulesAndValues.add(elem);
  }

  /**
   * Note this uses SettingRuleDiff, however there is no change.
   * Only the newSettings of SettingRuleDiff will be set.
   * Done to prevent proliferation of classes.
   */
  public List<SettingRuleDiff> getSettingRulesAndValues() {
    return this.settingRulesAndValues;
  }

  /**
   * Note this uses SettingRuleDiff, however there is no change.
   * Only the newSettings of SettingRuleDiff will be set.
   * Done to prevent proliferation of classes.
   */
  public GetOverriddenSettingsHierarchyResult setSettingRulesAndValues(List<SettingRuleDiff> settingRulesAndValues) {
    this.settingRulesAndValues = settingRulesAndValues;
    return this;
  }

  public void unsetSettingRulesAndValues() {
    this.settingRulesAndValues = null;
  }

  /** Returns true if field settingRulesAndValues is set (has been assigned a value) and false otherwise */
  public boolean isSetSettingRulesAndValues() {
    return this.settingRulesAndValues != null;
  }

  public void setSettingRulesAndValuesIsSet(boolean value) {
    if (!value) {
      this.settingRulesAndValues = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SETTING_RULES_AND_VALUES:
      if (value == null) {
        unsetSettingRulesAndValues();
      } else {
        setSettingRulesAndValues((List<SettingRuleDiff>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SETTING_RULES_AND_VALUES:
      return getSettingRulesAndValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SETTING_RULES_AND_VALUES:
      return isSetSettingRulesAndValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetOverriddenSettingsHierarchyResult)
      return this.equals((GetOverriddenSettingsHierarchyResult)that);
    return false;
  }

  public boolean equals(GetOverriddenSettingsHierarchyResult that) {
    if (that == null)
      return false;

    boolean this_present_settingRulesAndValues = true && this.isSetSettingRulesAndValues();
    boolean that_present_settingRulesAndValues = true && that.isSetSettingRulesAndValues();
    if (this_present_settingRulesAndValues || that_present_settingRulesAndValues) {
      if (!(this_present_settingRulesAndValues && that_present_settingRulesAndValues))
        return false;
      if (!this.settingRulesAndValues.equals(that.settingRulesAndValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_settingRulesAndValues = true && (isSetSettingRulesAndValues());
    list.add(present_settingRulesAndValues);
    if (present_settingRulesAndValues)
      list.add(settingRulesAndValues);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetOverriddenSettingsHierarchyResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSettingRulesAndValues()).compareTo(other.isSetSettingRulesAndValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettingRulesAndValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settingRulesAndValues, other.settingRulesAndValues);
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
    StringBuilder sb = new StringBuilder("GetOverriddenSettingsHierarchyResult(");
    boolean first = true;

    sb.append("settingRulesAndValues:");
    if (this.settingRulesAndValues == null) {
      sb.append("null");
    } else {
      sb.append(this.settingRulesAndValues);
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

  private static class GetOverriddenSettingsHierarchyResultStandardSchemeFactory implements SchemeFactory {
    public GetOverriddenSettingsHierarchyResultStandardScheme getScheme() {
      return new GetOverriddenSettingsHierarchyResultStandardScheme();
    }
  }

  private static class GetOverriddenSettingsHierarchyResultStandardScheme extends StandardScheme<GetOverriddenSettingsHierarchyResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetOverriddenSettingsHierarchyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SETTING_RULES_AND_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list45 = iprot.readListBegin();
                struct.settingRulesAndValues = new ArrayList<SettingRuleDiff>(_list45.size);
                SettingRuleDiff _elem46;
                for (int _i47 = 0; _i47 < _list45.size; ++_i47)
                {
                  _elem46 = new SettingRuleDiff();
                  _elem46.read(iprot);
                  struct.settingRulesAndValues.add(_elem46);
                }
                iprot.readListEnd();
              }
              struct.setSettingRulesAndValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetOverriddenSettingsHierarchyResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.settingRulesAndValues != null) {
        oprot.writeFieldBegin(SETTING_RULES_AND_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.settingRulesAndValues.size()));
          for (SettingRuleDiff _iter48 : struct.settingRulesAndValues)
          {
            _iter48.write(oprot);
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

