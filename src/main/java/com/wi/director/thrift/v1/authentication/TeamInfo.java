/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.authentication;

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
public class TeamInfo implements org.apache.thrift.TBase<TeamInfo, TeamInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TeamInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TeamInfo");

  private static final org.apache.thrift.protocol.TField BOOL_SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("boolSettings", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField TEXT_SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("textSettings", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField OPTION_SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("optionSettings", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField PRIORITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("priorities", org.apache.thrift.protocol.TType.LIST, (short)20);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TeamInfoStandardSchemeFactory());
  }

  public Map<String,Boolean> boolSettings; // required
  public Map<String,String> textSettings; // required
  public Map<String,String> optionSettings; // required
  public List<com.wi.director.thrift.v1.job.PriorityLevel> priorities; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOOL_SETTINGS((short)1, "boolSettings"),
    TEXT_SETTINGS((short)2, "textSettings"),
    OPTION_SETTINGS((short)3, "optionSettings"),
    PRIORITIES((short)20, "priorities");

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
        case 1: // BOOL_SETTINGS
          return BOOL_SETTINGS;
        case 2: // TEXT_SETTINGS
          return TEXT_SETTINGS;
        case 3: // OPTION_SETTINGS
          return OPTION_SETTINGS;
        case 20: // PRIORITIES
          return PRIORITIES;
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
  private static final _Fields optionals[] = {_Fields.PRIORITIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOOL_SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("boolSettings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    tmpMap.put(_Fields.TEXT_SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("textSettings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OPTION_SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("optionSettings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PRIORITIES, new org.apache.thrift.meta_data.FieldMetaData("priorities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.job.PriorityLevel.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TeamInfo.class, metaDataMap);
  }

  public TeamInfo() {
  }

  public TeamInfo(
    Map<String,Boolean> boolSettings,
    Map<String,String> textSettings,
    Map<String,String> optionSettings)
  {
    this();
    this.boolSettings = boolSettings;
    this.textSettings = textSettings;
    this.optionSettings = optionSettings;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TeamInfo(TeamInfo other) {
    if (other.isSetBoolSettings()) {
      Map<String,Boolean> __this__boolSettings = new HashMap<String,Boolean>(other.boolSettings);
      this.boolSettings = __this__boolSettings;
    }
    if (other.isSetTextSettings()) {
      Map<String,String> __this__textSettings = new HashMap<String,String>(other.textSettings);
      this.textSettings = __this__textSettings;
    }
    if (other.isSetOptionSettings()) {
      Map<String,String> __this__optionSettings = new HashMap<String,String>(other.optionSettings);
      this.optionSettings = __this__optionSettings;
    }
    if (other.isSetPriorities()) {
      List<com.wi.director.thrift.v1.job.PriorityLevel> __this__priorities = new ArrayList<com.wi.director.thrift.v1.job.PriorityLevel>(other.priorities.size());
      for (com.wi.director.thrift.v1.job.PriorityLevel other_element : other.priorities) {
        __this__priorities.add(new com.wi.director.thrift.v1.job.PriorityLevel(other_element));
      }
      this.priorities = __this__priorities;
    }
  }

  public TeamInfo deepCopy() {
    return new TeamInfo(this);
  }

  @Override
  public void clear() {
    this.boolSettings = null;
    this.textSettings = null;
    this.optionSettings = null;
    this.priorities = null;
  }

  public int getBoolSettingsSize() {
    return (this.boolSettings == null) ? 0 : this.boolSettings.size();
  }

  public void putToBoolSettings(String key, boolean val) {
    if (this.boolSettings == null) {
      this.boolSettings = new HashMap<String,Boolean>();
    }
    this.boolSettings.put(key, val);
  }

  public Map<String,Boolean> getBoolSettings() {
    return this.boolSettings;
  }

  public TeamInfo setBoolSettings(Map<String,Boolean> boolSettings) {
    this.boolSettings = boolSettings;
    return this;
  }

  public void unsetBoolSettings() {
    this.boolSettings = null;
  }

  /** Returns true if field boolSettings is set (has been assigned a value) and false otherwise */
  public boolean isSetBoolSettings() {
    return this.boolSettings != null;
  }

  public void setBoolSettingsIsSet(boolean value) {
    if (!value) {
      this.boolSettings = null;
    }
  }

  public int getTextSettingsSize() {
    return (this.textSettings == null) ? 0 : this.textSettings.size();
  }

  public void putToTextSettings(String key, String val) {
    if (this.textSettings == null) {
      this.textSettings = new HashMap<String,String>();
    }
    this.textSettings.put(key, val);
  }

  public Map<String,String> getTextSettings() {
    return this.textSettings;
  }

  public TeamInfo setTextSettings(Map<String,String> textSettings) {
    this.textSettings = textSettings;
    return this;
  }

  public void unsetTextSettings() {
    this.textSettings = null;
  }

  /** Returns true if field textSettings is set (has been assigned a value) and false otherwise */
  public boolean isSetTextSettings() {
    return this.textSettings != null;
  }

  public void setTextSettingsIsSet(boolean value) {
    if (!value) {
      this.textSettings = null;
    }
  }

  public int getOptionSettingsSize() {
    return (this.optionSettings == null) ? 0 : this.optionSettings.size();
  }

  public void putToOptionSettings(String key, String val) {
    if (this.optionSettings == null) {
      this.optionSettings = new HashMap<String,String>();
    }
    this.optionSettings.put(key, val);
  }

  public Map<String,String> getOptionSettings() {
    return this.optionSettings;
  }

  public TeamInfo setOptionSettings(Map<String,String> optionSettings) {
    this.optionSettings = optionSettings;
    return this;
  }

  public void unsetOptionSettings() {
    this.optionSettings = null;
  }

  /** Returns true if field optionSettings is set (has been assigned a value) and false otherwise */
  public boolean isSetOptionSettings() {
    return this.optionSettings != null;
  }

  public void setOptionSettingsIsSet(boolean value) {
    if (!value) {
      this.optionSettings = null;
    }
  }

  public int getPrioritiesSize() {
    return (this.priorities == null) ? 0 : this.priorities.size();
  }

  public java.util.Iterator<com.wi.director.thrift.v1.job.PriorityLevel> getPrioritiesIterator() {
    return (this.priorities == null) ? null : this.priorities.iterator();
  }

  public void addToPriorities(com.wi.director.thrift.v1.job.PriorityLevel elem) {
    if (this.priorities == null) {
      this.priorities = new ArrayList<com.wi.director.thrift.v1.job.PriorityLevel>();
    }
    this.priorities.add(elem);
  }

  public List<com.wi.director.thrift.v1.job.PriorityLevel> getPriorities() {
    return this.priorities;
  }

  public TeamInfo setPriorities(List<com.wi.director.thrift.v1.job.PriorityLevel> priorities) {
    this.priorities = priorities;
    return this;
  }

  public void unsetPriorities() {
    this.priorities = null;
  }

  /** Returns true if field priorities is set (has been assigned a value) and false otherwise */
  public boolean isSetPriorities() {
    return this.priorities != null;
  }

  public void setPrioritiesIsSet(boolean value) {
    if (!value) {
      this.priorities = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BOOL_SETTINGS:
      if (value == null) {
        unsetBoolSettings();
      } else {
        setBoolSettings((Map<String,Boolean>)value);
      }
      break;

    case TEXT_SETTINGS:
      if (value == null) {
        unsetTextSettings();
      } else {
        setTextSettings((Map<String,String>)value);
      }
      break;

    case OPTION_SETTINGS:
      if (value == null) {
        unsetOptionSettings();
      } else {
        setOptionSettings((Map<String,String>)value);
      }
      break;

    case PRIORITIES:
      if (value == null) {
        unsetPriorities();
      } else {
        setPriorities((List<com.wi.director.thrift.v1.job.PriorityLevel>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BOOL_SETTINGS:
      return getBoolSettings();

    case TEXT_SETTINGS:
      return getTextSettings();

    case OPTION_SETTINGS:
      return getOptionSettings();

    case PRIORITIES:
      return getPriorities();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BOOL_SETTINGS:
      return isSetBoolSettings();
    case TEXT_SETTINGS:
      return isSetTextSettings();
    case OPTION_SETTINGS:
      return isSetOptionSettings();
    case PRIORITIES:
      return isSetPriorities();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TeamInfo)
      return this.equals((TeamInfo)that);
    return false;
  }

  public boolean equals(TeamInfo that) {
    if (that == null)
      return false;

    boolean this_present_boolSettings = true && this.isSetBoolSettings();
    boolean that_present_boolSettings = true && that.isSetBoolSettings();
    if (this_present_boolSettings || that_present_boolSettings) {
      if (!(this_present_boolSettings && that_present_boolSettings))
        return false;
      if (!this.boolSettings.equals(that.boolSettings))
        return false;
    }

    boolean this_present_textSettings = true && this.isSetTextSettings();
    boolean that_present_textSettings = true && that.isSetTextSettings();
    if (this_present_textSettings || that_present_textSettings) {
      if (!(this_present_textSettings && that_present_textSettings))
        return false;
      if (!this.textSettings.equals(that.textSettings))
        return false;
    }

    boolean this_present_optionSettings = true && this.isSetOptionSettings();
    boolean that_present_optionSettings = true && that.isSetOptionSettings();
    if (this_present_optionSettings || that_present_optionSettings) {
      if (!(this_present_optionSettings && that_present_optionSettings))
        return false;
      if (!this.optionSettings.equals(that.optionSettings))
        return false;
    }

    boolean this_present_priorities = true && this.isSetPriorities();
    boolean that_present_priorities = true && that.isSetPriorities();
    if (this_present_priorities || that_present_priorities) {
      if (!(this_present_priorities && that_present_priorities))
        return false;
      if (!this.priorities.equals(that.priorities))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_boolSettings = true && (isSetBoolSettings());
    list.add(present_boolSettings);
    if (present_boolSettings)
      list.add(boolSettings);

    boolean present_textSettings = true && (isSetTextSettings());
    list.add(present_textSettings);
    if (present_textSettings)
      list.add(textSettings);

    boolean present_optionSettings = true && (isSetOptionSettings());
    list.add(present_optionSettings);
    if (present_optionSettings)
      list.add(optionSettings);

    boolean present_priorities = true && (isSetPriorities());
    list.add(present_priorities);
    if (present_priorities)
      list.add(priorities);

    return list.hashCode();
  }

  @Override
  public int compareTo(TeamInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBoolSettings()).compareTo(other.isSetBoolSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBoolSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.boolSettings, other.boolSettings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTextSettings()).compareTo(other.isSetTextSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textSettings, other.textSettings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOptionSettings()).compareTo(other.isSetOptionSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptionSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.optionSettings, other.optionSettings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriorities()).compareTo(other.isSetPriorities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriorities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priorities, other.priorities);
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
    StringBuilder sb = new StringBuilder("TeamInfo(");
    boolean first = true;

    sb.append("boolSettings:");
    if (this.boolSettings == null) {
      sb.append("null");
    } else {
      sb.append(this.boolSettings);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("textSettings:");
    if (this.textSettings == null) {
      sb.append("null");
    } else {
      sb.append(this.textSettings);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("optionSettings:");
    if (this.optionSettings == null) {
      sb.append("null");
    } else {
      sb.append(this.optionSettings);
    }
    first = false;
    if (isSetPriorities()) {
      if (!first) sb.append(", ");
      sb.append("priorities:");
      if (this.priorities == null) {
        sb.append("null");
      } else {
        sb.append(this.priorities);
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

  private static class TeamInfoStandardSchemeFactory implements SchemeFactory {
    public TeamInfoStandardScheme getScheme() {
      return new TeamInfoStandardScheme();
    }
  }

  private static class TeamInfoStandardScheme extends StandardScheme<TeamInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TeamInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BOOL_SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.boolSettings = new HashMap<String,Boolean>(2*_map0.size);
                String _key1;
                boolean _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readBool();
                  struct.boolSettings.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setBoolSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TEXT_SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                struct.textSettings = new HashMap<String,String>(2*_map4.size);
                String _key5;
                String _val6;
                for (int _i7 = 0; _i7 < _map4.size; ++_i7)
                {
                  _key5 = iprot.readString();
                  _val6 = iprot.readString();
                  struct.textSettings.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setTextSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPTION_SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.optionSettings = new HashMap<String,String>(2*_map8.size);
                String _key9;
                String _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readString();
                  _val10 = iprot.readString();
                  struct.optionSettings.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setOptionSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // PRIORITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
                struct.priorities = new ArrayList<com.wi.director.thrift.v1.job.PriorityLevel>(_list12.size);
                com.wi.director.thrift.v1.job.PriorityLevel _elem13;
                for (int _i14 = 0; _i14 < _list12.size; ++_i14)
                {
                  _elem13 = new com.wi.director.thrift.v1.job.PriorityLevel();
                  _elem13.read(iprot);
                  struct.priorities.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setPrioritiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TeamInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.boolSettings != null) {
        oprot.writeFieldBegin(BOOL_SETTINGS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.BOOL, struct.boolSettings.size()));
          for (Map.Entry<String, Boolean> _iter15 : struct.boolSettings.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            oprot.writeBool(_iter15.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.textSettings != null) {
        oprot.writeFieldBegin(TEXT_SETTINGS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.textSettings.size()));
          for (Map.Entry<String, String> _iter16 : struct.textSettings.entrySet())
          {
            oprot.writeString(_iter16.getKey());
            oprot.writeString(_iter16.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.optionSettings != null) {
        oprot.writeFieldBegin(OPTION_SETTINGS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.optionSettings.size()));
          for (Map.Entry<String, String> _iter17 : struct.optionSettings.entrySet())
          {
            oprot.writeString(_iter17.getKey());
            oprot.writeString(_iter17.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.priorities != null) {
        if (struct.isSetPriorities()) {
          oprot.writeFieldBegin(PRIORITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.priorities.size()));
            for (com.wi.director.thrift.v1.job.PriorityLevel _iter18 : struct.priorities)
            {
              _iter18.write(oprot);
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

