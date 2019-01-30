/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.datasheet;

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
public class DataSheetDefinition implements org.apache.thrift.TBase<DataSheetDefinition, DataSheetDefinition._Fields>, java.io.Serializable, Cloneable, Comparable<DataSheetDefinition> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataSheetDefinition");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("createdAt", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAt", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField ARCHIVED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("archivedAt", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField SHEET_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("sheetValues", org.apache.thrift.protocol.TType.MAP, (short)8);
  private static final org.apache.thrift.protocol.TField ARCHIVE_ERR_FIELD_DESC = new org.apache.thrift.protocol.TField("archiveErr", org.apache.thrift.protocol.TType.STRUCT, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataSheetDefinitionStandardSchemeFactory());
  }

  public String id; // required
  public long createdAt; // required
  public long updatedAt; // required
  public long archivedAt; // required
  public String name; // required
  public int position; // required
  /**
   * 
   * @see DefinitionType
   */
  public DefinitionType type; // required
  /**
   * Map of data sheet id -> data sheet value <br>
   * Used to populate existing data sheet values for a new definition
   */
  public Map<String,DataSheetValue> sheetValues; // optional
  /**
   * Is set when the <code>checkArchiveId</code> action is used on <a href="#Fn_DataSheetService_definitionOps">DefinitionOps</a> and cannot be archived with this error
   */
  public com.wi.director.thrift.v1.common.SystemException archiveErr; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CREATED_AT((short)2, "createdAt"),
    UPDATED_AT((short)3, "updatedAt"),
    ARCHIVED_AT((short)4, "archivedAt"),
    NAME((short)5, "name"),
    POSITION((short)6, "position"),
    /**
     * 
     * @see DefinitionType
     */
    TYPE((short)7, "type"),
    /**
     * Map of data sheet id -> data sheet value <br>
     * Used to populate existing data sheet values for a new definition
     */
    SHEET_VALUES((short)8, "sheetValues"),
    /**
     * Is set when the <code>checkArchiveId</code> action is used on <a href="#Fn_DataSheetService_definitionOps">DefinitionOps</a> and cannot be archived with this error
     */
    ARCHIVE_ERR((short)9, "archiveErr");

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
        case 2: // CREATED_AT
          return CREATED_AT;
        case 3: // UPDATED_AT
          return UPDATED_AT;
        case 4: // ARCHIVED_AT
          return ARCHIVED_AT;
        case 5: // NAME
          return NAME;
        case 6: // POSITION
          return POSITION;
        case 7: // TYPE
          return TYPE;
        case 8: // SHEET_VALUES
          return SHEET_VALUES;
        case 9: // ARCHIVE_ERR
          return ARCHIVE_ERR;
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
  private static final int __CREATEDAT_ISSET_ID = 0;
  private static final int __UPDATEDAT_ISSET_ID = 1;
  private static final int __ARCHIVEDAT_ISSET_ID = 2;
  private static final int __POSITION_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SHEET_VALUES,_Fields.ARCHIVE_ERR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "UUID")));
    tmpMap.put(_Fields.CREATED_AT, new org.apache.thrift.meta_data.FieldMetaData("createdAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TimeInSecs")));
    tmpMap.put(_Fields.UPDATED_AT, new org.apache.thrift.meta_data.FieldMetaData("updatedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TimeInSecs")));
    tmpMap.put(_Fields.ARCHIVED_AT, new org.apache.thrift.meta_data.FieldMetaData("archivedAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TimeInSecs")));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POSITION, new org.apache.thrift.meta_data.FieldMetaData("position", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DefinitionType.class)));
    tmpMap.put(_Fields.SHEET_VALUES, new org.apache.thrift.meta_data.FieldMetaData("sheetValues", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "UUID"), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DataSheetValue.class))));
    tmpMap.put(_Fields.ARCHIVE_ERR, new org.apache.thrift.meta_data.FieldMetaData("archiveErr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataSheetDefinition.class, metaDataMap);
  }

  public DataSheetDefinition() {
  }

  public DataSheetDefinition(
    String id,
    long createdAt,
    long updatedAt,
    long archivedAt,
    String name,
    int position,
    DefinitionType type)
  {
    this();
    this.id = id;
    this.createdAt = createdAt;
    setCreatedAtIsSet(true);
    this.updatedAt = updatedAt;
    setUpdatedAtIsSet(true);
    this.archivedAt = archivedAt;
    setArchivedAtIsSet(true);
    this.name = name;
    this.position = position;
    setPositionIsSet(true);
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataSheetDefinition(DataSheetDefinition other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.createdAt = other.createdAt;
    this.updatedAt = other.updatedAt;
    this.archivedAt = other.archivedAt;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.position = other.position;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetSheetValues()) {
      Map<String,DataSheetValue> __this__sheetValues = new HashMap<String,DataSheetValue>(other.sheetValues.size());
      for (Map.Entry<String, DataSheetValue> other_element : other.sheetValues.entrySet()) {

        String other_element_key = other_element.getKey();
        DataSheetValue other_element_value = other_element.getValue();

        String __this__sheetValues_copy_key = other_element_key;

        DataSheetValue __this__sheetValues_copy_value = new DataSheetValue(other_element_value);

        __this__sheetValues.put(__this__sheetValues_copy_key, __this__sheetValues_copy_value);
      }
      this.sheetValues = __this__sheetValues;
    }
    if (other.isSetArchiveErr()) {
      this.archiveErr = new com.wi.director.thrift.v1.common.SystemException(other.archiveErr);
    }
  }

  public DataSheetDefinition deepCopy() {
    return new DataSheetDefinition(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setCreatedAtIsSet(false);
    this.createdAt = 0;
    setUpdatedAtIsSet(false);
    this.updatedAt = 0;
    setArchivedAtIsSet(false);
    this.archivedAt = 0;
    this.name = null;
    setPositionIsSet(false);
    this.position = 0;
    this.type = null;
    this.sheetValues = null;
    this.archiveErr = null;
  }

  public String getId() {
    return this.id;
  }

  public DataSheetDefinition setId(String id) {
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

  public long getCreatedAt() {
    return this.createdAt;
  }

  public DataSheetDefinition setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
    setCreatedAtIsSet(true);
    return this;
  }

  public void unsetCreatedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDAT_ISSET_ID);
  }

  /** Returns true if field createdAt is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDAT_ISSET_ID);
  }

  public void setCreatedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDAT_ISSET_ID, value);
  }

  public long getUpdatedAt() {
    return this.updatedAt;
  }

  public DataSheetDefinition setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
    setUpdatedAtIsSet(true);
    return this;
  }

  public void unsetUpdatedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATEDAT_ISSET_ID);
  }

  /** Returns true if field updatedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATEDAT_ISSET_ID);
  }

  public void setUpdatedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATEDAT_ISSET_ID, value);
  }

  public long getArchivedAt() {
    return this.archivedAt;
  }

  public DataSheetDefinition setArchivedAt(long archivedAt) {
    this.archivedAt = archivedAt;
    setArchivedAtIsSet(true);
    return this;
  }

  public void unsetArchivedAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARCHIVEDAT_ISSET_ID);
  }

  /** Returns true if field archivedAt is set (has been assigned a value) and false otherwise */
  public boolean isSetArchivedAt() {
    return EncodingUtils.testBit(__isset_bitfield, __ARCHIVEDAT_ISSET_ID);
  }

  public void setArchivedAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARCHIVEDAT_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public DataSheetDefinition setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getPosition() {
    return this.position;
  }

  public DataSheetDefinition setPosition(int position) {
    this.position = position;
    setPositionIsSet(true);
    return this;
  }

  public void unsetPosition() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __POSITION_ISSET_ID);
  }

  /** Returns true if field position is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition() {
    return EncodingUtils.testBit(__isset_bitfield, __POSITION_ISSET_ID);
  }

  public void setPositionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __POSITION_ISSET_ID, value);
  }

  /**
   * 
   * @see DefinitionType
   */
  public DefinitionType getType() {
    return this.type;
  }

  /**
   * 
   * @see DefinitionType
   */
  public DataSheetDefinition setType(DefinitionType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getSheetValuesSize() {
    return (this.sheetValues == null) ? 0 : this.sheetValues.size();
  }

  public void putToSheetValues(String key, DataSheetValue val) {
    if (this.sheetValues == null) {
      this.sheetValues = new HashMap<String,DataSheetValue>();
    }
    this.sheetValues.put(key, val);
  }

  /**
   * Map of data sheet id -> data sheet value <br>
   * Used to populate existing data sheet values for a new definition
   */
  public Map<String,DataSheetValue> getSheetValues() {
    return this.sheetValues;
  }

  /**
   * Map of data sheet id -> data sheet value <br>
   * Used to populate existing data sheet values for a new definition
   */
  public DataSheetDefinition setSheetValues(Map<String,DataSheetValue> sheetValues) {
    this.sheetValues = sheetValues;
    return this;
  }

  public void unsetSheetValues() {
    this.sheetValues = null;
  }

  /** Returns true if field sheetValues is set (has been assigned a value) and false otherwise */
  public boolean isSetSheetValues() {
    return this.sheetValues != null;
  }

  public void setSheetValuesIsSet(boolean value) {
    if (!value) {
      this.sheetValues = null;
    }
  }

  /**
   * Is set when the <code>checkArchiveId</code> action is used on <a href="#Fn_DataSheetService_definitionOps">DefinitionOps</a> and cannot be archived with this error
   */
  public com.wi.director.thrift.v1.common.SystemException getArchiveErr() {
    return this.archiveErr;
  }

  /**
   * Is set when the <code>checkArchiveId</code> action is used on <a href="#Fn_DataSheetService_definitionOps">DefinitionOps</a> and cannot be archived with this error
   */
  public DataSheetDefinition setArchiveErr(com.wi.director.thrift.v1.common.SystemException archiveErr) {
    this.archiveErr = archiveErr;
    return this;
  }

  public void unsetArchiveErr() {
    this.archiveErr = null;
  }

  /** Returns true if field archiveErr is set (has been assigned a value) and false otherwise */
  public boolean isSetArchiveErr() {
    return this.archiveErr != null;
  }

  public void setArchiveErrIsSet(boolean value) {
    if (!value) {
      this.archiveErr = null;
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

    case CREATED_AT:
      if (value == null) {
        unsetCreatedAt();
      } else {
        setCreatedAt((Long)value);
      }
      break;

    case UPDATED_AT:
      if (value == null) {
        unsetUpdatedAt();
      } else {
        setUpdatedAt((Long)value);
      }
      break;

    case ARCHIVED_AT:
      if (value == null) {
        unsetArchivedAt();
      } else {
        setArchivedAt((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case POSITION:
      if (value == null) {
        unsetPosition();
      } else {
        setPosition((Integer)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((DefinitionType)value);
      }
      break;

    case SHEET_VALUES:
      if (value == null) {
        unsetSheetValues();
      } else {
        setSheetValues((Map<String,DataSheetValue>)value);
      }
      break;

    case ARCHIVE_ERR:
      if (value == null) {
        unsetArchiveErr();
      } else {
        setArchiveErr((com.wi.director.thrift.v1.common.SystemException)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CREATED_AT:
      return getCreatedAt();

    case UPDATED_AT:
      return getUpdatedAt();

    case ARCHIVED_AT:
      return getArchivedAt();

    case NAME:
      return getName();

    case POSITION:
      return getPosition();

    case TYPE:
      return getType();

    case SHEET_VALUES:
      return getSheetValues();

    case ARCHIVE_ERR:
      return getArchiveErr();

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
    case CREATED_AT:
      return isSetCreatedAt();
    case UPDATED_AT:
      return isSetUpdatedAt();
    case ARCHIVED_AT:
      return isSetArchivedAt();
    case NAME:
      return isSetName();
    case POSITION:
      return isSetPosition();
    case TYPE:
      return isSetType();
    case SHEET_VALUES:
      return isSetSheetValues();
    case ARCHIVE_ERR:
      return isSetArchiveErr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataSheetDefinition)
      return this.equals((DataSheetDefinition)that);
    return false;
  }

  public boolean equals(DataSheetDefinition that) {
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

    boolean this_present_createdAt = true;
    boolean that_present_createdAt = true;
    if (this_present_createdAt || that_present_createdAt) {
      if (!(this_present_createdAt && that_present_createdAt))
        return false;
      if (this.createdAt != that.createdAt)
        return false;
    }

    boolean this_present_updatedAt = true;
    boolean that_present_updatedAt = true;
    if (this_present_updatedAt || that_present_updatedAt) {
      if (!(this_present_updatedAt && that_present_updatedAt))
        return false;
      if (this.updatedAt != that.updatedAt)
        return false;
    }

    boolean this_present_archivedAt = true;
    boolean that_present_archivedAt = true;
    if (this_present_archivedAt || that_present_archivedAt) {
      if (!(this_present_archivedAt && that_present_archivedAt))
        return false;
      if (this.archivedAt != that.archivedAt)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_position = true;
    boolean that_present_position = true;
    if (this_present_position || that_present_position) {
      if (!(this_present_position && that_present_position))
        return false;
      if (this.position != that.position)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_sheetValues = true && this.isSetSheetValues();
    boolean that_present_sheetValues = true && that.isSetSheetValues();
    if (this_present_sheetValues || that_present_sheetValues) {
      if (!(this_present_sheetValues && that_present_sheetValues))
        return false;
      if (!this.sheetValues.equals(that.sheetValues))
        return false;
    }

    boolean this_present_archiveErr = true && this.isSetArchiveErr();
    boolean that_present_archiveErr = true && that.isSetArchiveErr();
    if (this_present_archiveErr || that_present_archiveErr) {
      if (!(this_present_archiveErr && that_present_archiveErr))
        return false;
      if (!this.archiveErr.equals(that.archiveErr))
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

    boolean present_createdAt = true;
    list.add(present_createdAt);
    if (present_createdAt)
      list.add(createdAt);

    boolean present_updatedAt = true;
    list.add(present_updatedAt);
    if (present_updatedAt)
      list.add(updatedAt);

    boolean present_archivedAt = true;
    list.add(present_archivedAt);
    if (present_archivedAt)
      list.add(archivedAt);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_position = true;
    list.add(present_position);
    if (present_position)
      list.add(position);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_sheetValues = true && (isSetSheetValues());
    list.add(present_sheetValues);
    if (present_sheetValues)
      list.add(sheetValues);

    boolean present_archiveErr = true && (isSetArchiveErr());
    list.add(present_archiveErr);
    if (present_archiveErr)
      list.add(archiveErr);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataSheetDefinition other) {
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
    lastComparison = Boolean.valueOf(isSetCreatedAt()).compareTo(other.isSetCreatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdAt, other.createdAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdatedAt()).compareTo(other.isSetUpdatedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedAt, other.updatedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArchivedAt()).compareTo(other.isSetArchivedAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArchivedAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.archivedAt, other.archivedAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPosition()).compareTo(other.isSetPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position, other.position);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSheetValues()).compareTo(other.isSetSheetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSheetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sheetValues, other.sheetValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArchiveErr()).compareTo(other.isSetArchiveErr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArchiveErr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.archiveErr, other.archiveErr);
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
    StringBuilder sb = new StringBuilder("DataSheetDefinition(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdAt:");
    sb.append(this.createdAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedAt:");
    sb.append(this.updatedAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("archivedAt:");
    sb.append(this.archivedAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("position:");
    sb.append(this.position);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetSheetValues()) {
      if (!first) sb.append(", ");
      sb.append("sheetValues:");
      if (this.sheetValues == null) {
        sb.append("null");
      } else {
        sb.append(this.sheetValues);
      }
      first = false;
    }
    if (isSetArchiveErr()) {
      if (!first) sb.append(", ");
      sb.append("archiveErr:");
      if (this.archiveErr == null) {
        sb.append("null");
      } else {
        sb.append(this.archiveErr);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DataSheetDefinitionStandardSchemeFactory implements SchemeFactory {
    public DataSheetDefinitionStandardScheme getScheme() {
      return new DataSheetDefinitionStandardScheme();
    }
  }

  private static class DataSheetDefinitionStandardScheme extends StandardScheme<DataSheetDefinition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataSheetDefinition struct) throws org.apache.thrift.TException {
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
          case 2: // CREATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdAt = iprot.readI64();
              struct.setCreatedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updatedAt = iprot.readI64();
              struct.setUpdatedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ARCHIVED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.archivedAt = iprot.readI64();
              struct.setArchivedAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.position = iprot.readI32();
              struct.setPositionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.wi.director.thrift.v1.datasheet.DefinitionType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // SHEET_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.sheetValues = new HashMap<String,DataSheetValue>(2*_map0.size);
                String _key1;
                DataSheetValue _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = new DataSheetValue();
                  _val2.read(iprot);
                  struct.sheetValues.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setSheetValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // ARCHIVE_ERR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.archiveErr = new com.wi.director.thrift.v1.common.SystemException();
              struct.archiveErr.read(iprot);
              struct.setArchiveErrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataSheetDefinition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_AT_FIELD_DESC);
      oprot.writeI64(struct.createdAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATED_AT_FIELD_DESC);
      oprot.writeI64(struct.updatedAt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ARCHIVED_AT_FIELD_DESC);
      oprot.writeI64(struct.archivedAt);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(POSITION_FIELD_DESC);
      oprot.writeI32(struct.position);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.sheetValues != null) {
        if (struct.isSetSheetValues()) {
          oprot.writeFieldBegin(SHEET_VALUES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.sheetValues.size()));
            for (Map.Entry<String, DataSheetValue> _iter4 : struct.sheetValues.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              _iter4.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.archiveErr != null) {
        if (struct.isSetArchiveErr()) {
          oprot.writeFieldBegin(ARCHIVE_ERR_FIELD_DESC);
          struct.archiveErr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}
