/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.teamrole;

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
public class TeamTemplateSetPermissions implements org.apache.thrift.TBase<TeamTemplateSetPermissions, TeamTemplateSetPermissions._Fields>, java.io.Serializable, Cloneable, Comparable<TeamTemplateSetPermissions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TeamTemplateSetPermissions");

  private static final org.apache.thrift.protocol.TField VIEW_FIELD_DESC = new org.apache.thrift.protocol.TField("view", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField CREATE_AND_EDIT_FIELD_DESC = new org.apache.thrift.protocol.TField("createAndEdit", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField ARCHIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("archive", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField UNARCHIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("unarchive", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TeamTemplateSetPermissionsStandardSchemeFactory());
  }

  public boolean view; // required
  public boolean createAndEdit; // required
  public boolean archive; // required
  public boolean unarchive; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VIEW((short)1, "view"),
    CREATE_AND_EDIT((short)2, "createAndEdit"),
    ARCHIVE((short)3, "archive"),
    UNARCHIVE((short)4, "unarchive");

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
        case 1: // VIEW
          return VIEW;
        case 2: // CREATE_AND_EDIT
          return CREATE_AND_EDIT;
        case 3: // ARCHIVE
          return ARCHIVE;
        case 4: // UNARCHIVE
          return UNARCHIVE;
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
  private static final int __VIEW_ISSET_ID = 0;
  private static final int __CREATEANDEDIT_ISSET_ID = 1;
  private static final int __ARCHIVE_ISSET_ID = 2;
  private static final int __UNARCHIVE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VIEW, new org.apache.thrift.meta_data.FieldMetaData("view", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CREATE_AND_EDIT, new org.apache.thrift.meta_data.FieldMetaData("createAndEdit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ARCHIVE, new org.apache.thrift.meta_data.FieldMetaData("archive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.UNARCHIVE, new org.apache.thrift.meta_data.FieldMetaData("unarchive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TeamTemplateSetPermissions.class, metaDataMap);
  }

  public TeamTemplateSetPermissions() {
  }

  public TeamTemplateSetPermissions(
    boolean view,
    boolean createAndEdit,
    boolean archive,
    boolean unarchive)
  {
    this();
    this.view = view;
    setViewIsSet(true);
    this.createAndEdit = createAndEdit;
    setCreateAndEditIsSet(true);
    this.archive = archive;
    setArchiveIsSet(true);
    this.unarchive = unarchive;
    setUnarchiveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TeamTemplateSetPermissions(TeamTemplateSetPermissions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.view = other.view;
    this.createAndEdit = other.createAndEdit;
    this.archive = other.archive;
    this.unarchive = other.unarchive;
  }

  public TeamTemplateSetPermissions deepCopy() {
    return new TeamTemplateSetPermissions(this);
  }

  @Override
  public void clear() {
    setViewIsSet(false);
    this.view = false;
    setCreateAndEditIsSet(false);
    this.createAndEdit = false;
    setArchiveIsSet(false);
    this.archive = false;
    setUnarchiveIsSet(false);
    this.unarchive = false;
  }

  public boolean isView() {
    return this.view;
  }

  public TeamTemplateSetPermissions setView(boolean view) {
    this.view = view;
    setViewIsSet(true);
    return this;
  }

  public void unsetView() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIEW_ISSET_ID);
  }

  /** Returns true if field view is set (has been assigned a value) and false otherwise */
  public boolean isSetView() {
    return EncodingUtils.testBit(__isset_bitfield, __VIEW_ISSET_ID);
  }

  public void setViewIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIEW_ISSET_ID, value);
  }

  public boolean isCreateAndEdit() {
    return this.createAndEdit;
  }

  public TeamTemplateSetPermissions setCreateAndEdit(boolean createAndEdit) {
    this.createAndEdit = createAndEdit;
    setCreateAndEditIsSet(true);
    return this;
  }

  public void unsetCreateAndEdit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEANDEDIT_ISSET_ID);
  }

  /** Returns true if field createAndEdit is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateAndEdit() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEANDEDIT_ISSET_ID);
  }

  public void setCreateAndEditIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEANDEDIT_ISSET_ID, value);
  }

  public boolean isArchive() {
    return this.archive;
  }

  public TeamTemplateSetPermissions setArchive(boolean archive) {
    this.archive = archive;
    setArchiveIsSet(true);
    return this;
  }

  public void unsetArchive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARCHIVE_ISSET_ID);
  }

  /** Returns true if field archive is set (has been assigned a value) and false otherwise */
  public boolean isSetArchive() {
    return EncodingUtils.testBit(__isset_bitfield, __ARCHIVE_ISSET_ID);
  }

  public void setArchiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARCHIVE_ISSET_ID, value);
  }

  public boolean isUnarchive() {
    return this.unarchive;
  }

  public TeamTemplateSetPermissions setUnarchive(boolean unarchive) {
    this.unarchive = unarchive;
    setUnarchiveIsSet(true);
    return this;
  }

  public void unsetUnarchive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNARCHIVE_ISSET_ID);
  }

  /** Returns true if field unarchive is set (has been assigned a value) and false otherwise */
  public boolean isSetUnarchive() {
    return EncodingUtils.testBit(__isset_bitfield, __UNARCHIVE_ISSET_ID);
  }

  public void setUnarchiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNARCHIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VIEW:
      if (value == null) {
        unsetView();
      } else {
        setView((Boolean)value);
      }
      break;

    case CREATE_AND_EDIT:
      if (value == null) {
        unsetCreateAndEdit();
      } else {
        setCreateAndEdit((Boolean)value);
      }
      break;

    case ARCHIVE:
      if (value == null) {
        unsetArchive();
      } else {
        setArchive((Boolean)value);
      }
      break;

    case UNARCHIVE:
      if (value == null) {
        unsetUnarchive();
      } else {
        setUnarchive((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VIEW:
      return isView();

    case CREATE_AND_EDIT:
      return isCreateAndEdit();

    case ARCHIVE:
      return isArchive();

    case UNARCHIVE:
      return isUnarchive();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VIEW:
      return isSetView();
    case CREATE_AND_EDIT:
      return isSetCreateAndEdit();
    case ARCHIVE:
      return isSetArchive();
    case UNARCHIVE:
      return isSetUnarchive();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TeamTemplateSetPermissions)
      return this.equals((TeamTemplateSetPermissions)that);
    return false;
  }

  public boolean equals(TeamTemplateSetPermissions that) {
    if (that == null)
      return false;

    boolean this_present_view = true;
    boolean that_present_view = true;
    if (this_present_view || that_present_view) {
      if (!(this_present_view && that_present_view))
        return false;
      if (this.view != that.view)
        return false;
    }

    boolean this_present_createAndEdit = true;
    boolean that_present_createAndEdit = true;
    if (this_present_createAndEdit || that_present_createAndEdit) {
      if (!(this_present_createAndEdit && that_present_createAndEdit))
        return false;
      if (this.createAndEdit != that.createAndEdit)
        return false;
    }

    boolean this_present_archive = true;
    boolean that_present_archive = true;
    if (this_present_archive || that_present_archive) {
      if (!(this_present_archive && that_present_archive))
        return false;
      if (this.archive != that.archive)
        return false;
    }

    boolean this_present_unarchive = true;
    boolean that_present_unarchive = true;
    if (this_present_unarchive || that_present_unarchive) {
      if (!(this_present_unarchive && that_present_unarchive))
        return false;
      if (this.unarchive != that.unarchive)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_view = true;
    list.add(present_view);
    if (present_view)
      list.add(view);

    boolean present_createAndEdit = true;
    list.add(present_createAndEdit);
    if (present_createAndEdit)
      list.add(createAndEdit);

    boolean present_archive = true;
    list.add(present_archive);
    if (present_archive)
      list.add(archive);

    boolean present_unarchive = true;
    list.add(present_unarchive);
    if (present_unarchive)
      list.add(unarchive);

    return list.hashCode();
  }

  @Override
  public int compareTo(TeamTemplateSetPermissions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetView()).compareTo(other.isSetView());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetView()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.view, other.view);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateAndEdit()).compareTo(other.isSetCreateAndEdit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateAndEdit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createAndEdit, other.createAndEdit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArchive()).compareTo(other.isSetArchive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArchive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.archive, other.archive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnarchive()).compareTo(other.isSetUnarchive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnarchive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unarchive, other.unarchive);
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
    StringBuilder sb = new StringBuilder("TeamTemplateSetPermissions(");
    boolean first = true;

    sb.append("view:");
    sb.append(this.view);
    first = false;
    if (!first) sb.append(", ");
    sb.append("createAndEdit:");
    sb.append(this.createAndEdit);
    first = false;
    if (!first) sb.append(", ");
    sb.append("archive:");
    sb.append(this.archive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unarchive:");
    sb.append(this.unarchive);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TeamTemplateSetPermissionsStandardSchemeFactory implements SchemeFactory {
    public TeamTemplateSetPermissionsStandardScheme getScheme() {
      return new TeamTemplateSetPermissionsStandardScheme();
    }
  }

  private static class TeamTemplateSetPermissionsStandardScheme extends StandardScheme<TeamTemplateSetPermissions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TeamTemplateSetPermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VIEW
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.view = iprot.readBool();
              struct.setViewIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATE_AND_EDIT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.createAndEdit = iprot.readBool();
              struct.setCreateAndEditIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARCHIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.archive = iprot.readBool();
              struct.setArchiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UNARCHIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.unarchive = iprot.readBool();
              struct.setUnarchiveIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TeamTemplateSetPermissions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VIEW_FIELD_DESC);
      oprot.writeBool(struct.view);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CREATE_AND_EDIT_FIELD_DESC);
      oprot.writeBool(struct.createAndEdit);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ARCHIVE_FIELD_DESC);
      oprot.writeBool(struct.archive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNARCHIVE_FIELD_DESC);
      oprot.writeBool(struct.unarchive);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

