/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.jobtemplate;

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
public class TemplateDraft implements org.apache.thrift.TBase<TemplateDraft, TemplateDraft._Fields>, java.io.Serializable, Cloneable, Comparable<TemplateDraft> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TemplateDraft");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField AUTHORED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("authoredAt", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField AUTHOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("authorId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DISPLAY_FIELD_DESC = new org.apache.thrift.protocol.TField("display", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField PUBLIC_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("publicVersion", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField PUBLISHED_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("publishedVersion", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TemplateDraftStandardSchemeFactory());
  }

  public int version; // required
  public long authoredAt; // required
  public String authorId; // required
  public boolean display; // required
  public int publicVersion; // required
  /**
   * 
   * @see JobTemplateStatus
   */
  public JobTemplateStatus status; // required
  public int publishedVersion; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION((short)1, "version"),
    AUTHORED_AT((short)2, "authoredAt"),
    AUTHOR_ID((short)3, "authorId"),
    DISPLAY((short)4, "display"),
    PUBLIC_VERSION((short)5, "publicVersion"),
    /**
     * 
     * @see JobTemplateStatus
     */
    STATUS((short)6, "status"),
    PUBLISHED_VERSION((short)7, "publishedVersion");

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
        case 1: // VERSION
          return VERSION;
        case 2: // AUTHORED_AT
          return AUTHORED_AT;
        case 3: // AUTHOR_ID
          return AUTHOR_ID;
        case 4: // DISPLAY
          return DISPLAY;
        case 5: // PUBLIC_VERSION
          return PUBLIC_VERSION;
        case 6: // STATUS
          return STATUS;
        case 7: // PUBLISHED_VERSION
          return PUBLISHED_VERSION;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __AUTHOREDAT_ISSET_ID = 1;
  private static final int __DISPLAY_ISSET_ID = 2;
  private static final int __PUBLICVERSION_ISSET_ID = 3;
  private static final int __PUBLISHEDVERSION_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AUTHORED_AT, new org.apache.thrift.meta_data.FieldMetaData("authoredAt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.AUTHOR_ID, new org.apache.thrift.meta_data.FieldMetaData("authorId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY, new org.apache.thrift.meta_data.FieldMetaData("display", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PUBLIC_VERSION, new org.apache.thrift.meta_data.FieldMetaData("publicVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobTemplateStatus.class)));
    tmpMap.put(_Fields.PUBLISHED_VERSION, new org.apache.thrift.meta_data.FieldMetaData("publishedVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TemplateDraft.class, metaDataMap);
  }

  public TemplateDraft() {
  }

  public TemplateDraft(
    int version,
    long authoredAt,
    String authorId,
    boolean display,
    int publicVersion,
    JobTemplateStatus status,
    int publishedVersion)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.authoredAt = authoredAt;
    setAuthoredAtIsSet(true);
    this.authorId = authorId;
    this.display = display;
    setDisplayIsSet(true);
    this.publicVersion = publicVersion;
    setPublicVersionIsSet(true);
    this.status = status;
    this.publishedVersion = publishedVersion;
    setPublishedVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TemplateDraft(TemplateDraft other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    this.authoredAt = other.authoredAt;
    if (other.isSetAuthorId()) {
      this.authorId = other.authorId;
    }
    this.display = other.display;
    this.publicVersion = other.publicVersion;
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.publishedVersion = other.publishedVersion;
  }

  public TemplateDraft deepCopy() {
    return new TemplateDraft(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    setAuthoredAtIsSet(false);
    this.authoredAt = 0;
    this.authorId = null;
    setDisplayIsSet(false);
    this.display = false;
    setPublicVersionIsSet(false);
    this.publicVersion = 0;
    this.status = null;
    setPublishedVersionIsSet(false);
    this.publishedVersion = 0;
  }

  public int getVersion() {
    return this.version;
  }

  public TemplateDraft setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public long getAuthoredAt() {
    return this.authoredAt;
  }

  public TemplateDraft setAuthoredAt(long authoredAt) {
    this.authoredAt = authoredAt;
    setAuthoredAtIsSet(true);
    return this;
  }

  public void unsetAuthoredAt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AUTHOREDAT_ISSET_ID);
  }

  /** Returns true if field authoredAt is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthoredAt() {
    return EncodingUtils.testBit(__isset_bitfield, __AUTHOREDAT_ISSET_ID);
  }

  public void setAuthoredAtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AUTHOREDAT_ISSET_ID, value);
  }

  public String getAuthorId() {
    return this.authorId;
  }

  public TemplateDraft setAuthorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

  public void unsetAuthorId() {
    this.authorId = null;
  }

  /** Returns true if field authorId is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthorId() {
    return this.authorId != null;
  }

  public void setAuthorIdIsSet(boolean value) {
    if (!value) {
      this.authorId = null;
    }
  }

  public boolean isDisplay() {
    return this.display;
  }

  public TemplateDraft setDisplay(boolean display) {
    this.display = display;
    setDisplayIsSet(true);
    return this;
  }

  public void unsetDisplay() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DISPLAY_ISSET_ID);
  }

  /** Returns true if field display is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplay() {
    return EncodingUtils.testBit(__isset_bitfield, __DISPLAY_ISSET_ID);
  }

  public void setDisplayIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DISPLAY_ISSET_ID, value);
  }

  public int getPublicVersion() {
    return this.publicVersion;
  }

  public TemplateDraft setPublicVersion(int publicVersion) {
    this.publicVersion = publicVersion;
    setPublicVersionIsSet(true);
    return this;
  }

  public void unsetPublicVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PUBLICVERSION_ISSET_ID);
  }

  /** Returns true if field publicVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetPublicVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __PUBLICVERSION_ISSET_ID);
  }

  public void setPublicVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PUBLICVERSION_ISSET_ID, value);
  }

  /**
   * 
   * @see JobTemplateStatus
   */
  public JobTemplateStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see JobTemplateStatus
   */
  public TemplateDraft setStatus(JobTemplateStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getPublishedVersion() {
    return this.publishedVersion;
  }

  public TemplateDraft setPublishedVersion(int publishedVersion) {
    this.publishedVersion = publishedVersion;
    setPublishedVersionIsSet(true);
    return this;
  }

  public void unsetPublishedVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PUBLISHEDVERSION_ISSET_ID);
  }

  /** Returns true if field publishedVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetPublishedVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __PUBLISHEDVERSION_ISSET_ID);
  }

  public void setPublishedVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PUBLISHEDVERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case AUTHORED_AT:
      if (value == null) {
        unsetAuthoredAt();
      } else {
        setAuthoredAt((Long)value);
      }
      break;

    case AUTHOR_ID:
      if (value == null) {
        unsetAuthorId();
      } else {
        setAuthorId((String)value);
      }
      break;

    case DISPLAY:
      if (value == null) {
        unsetDisplay();
      } else {
        setDisplay((Boolean)value);
      }
      break;

    case PUBLIC_VERSION:
      if (value == null) {
        unsetPublicVersion();
      } else {
        setPublicVersion((Integer)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((JobTemplateStatus)value);
      }
      break;

    case PUBLISHED_VERSION:
      if (value == null) {
        unsetPublishedVersion();
      } else {
        setPublishedVersion((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case AUTHORED_AT:
      return getAuthoredAt();

    case AUTHOR_ID:
      return getAuthorId();

    case DISPLAY:
      return isDisplay();

    case PUBLIC_VERSION:
      return getPublicVersion();

    case STATUS:
      return getStatus();

    case PUBLISHED_VERSION:
      return getPublishedVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case AUTHORED_AT:
      return isSetAuthoredAt();
    case AUTHOR_ID:
      return isSetAuthorId();
    case DISPLAY:
      return isSetDisplay();
    case PUBLIC_VERSION:
      return isSetPublicVersion();
    case STATUS:
      return isSetStatus();
    case PUBLISHED_VERSION:
      return isSetPublishedVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TemplateDraft)
      return this.equals((TemplateDraft)that);
    return false;
  }

  public boolean equals(TemplateDraft that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_authoredAt = true;
    boolean that_present_authoredAt = true;
    if (this_present_authoredAt || that_present_authoredAt) {
      if (!(this_present_authoredAt && that_present_authoredAt))
        return false;
      if (this.authoredAt != that.authoredAt)
        return false;
    }

    boolean this_present_authorId = true && this.isSetAuthorId();
    boolean that_present_authorId = true && that.isSetAuthorId();
    if (this_present_authorId || that_present_authorId) {
      if (!(this_present_authorId && that_present_authorId))
        return false;
      if (!this.authorId.equals(that.authorId))
        return false;
    }

    boolean this_present_display = true;
    boolean that_present_display = true;
    if (this_present_display || that_present_display) {
      if (!(this_present_display && that_present_display))
        return false;
      if (this.display != that.display)
        return false;
    }

    boolean this_present_publicVersion = true;
    boolean that_present_publicVersion = true;
    if (this_present_publicVersion || that_present_publicVersion) {
      if (!(this_present_publicVersion && that_present_publicVersion))
        return false;
      if (this.publicVersion != that.publicVersion)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_publishedVersion = true;
    boolean that_present_publishedVersion = true;
    if (this_present_publishedVersion || that_present_publishedVersion) {
      if (!(this_present_publishedVersion && that_present_publishedVersion))
        return false;
      if (this.publishedVersion != that.publishedVersion)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_version = true;
    list.add(present_version);
    if (present_version)
      list.add(version);

    boolean present_authoredAt = true;
    list.add(present_authoredAt);
    if (present_authoredAt)
      list.add(authoredAt);

    boolean present_authorId = true && (isSetAuthorId());
    list.add(present_authorId);
    if (present_authorId)
      list.add(authorId);

    boolean present_display = true;
    list.add(present_display);
    if (present_display)
      list.add(display);

    boolean present_publicVersion = true;
    list.add(present_publicVersion);
    if (present_publicVersion)
      list.add(publicVersion);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_publishedVersion = true;
    list.add(present_publishedVersion);
    if (present_publishedVersion)
      list.add(publishedVersion);

    return list.hashCode();
  }

  @Override
  public int compareTo(TemplateDraft other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthoredAt()).compareTo(other.isSetAuthoredAt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthoredAt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authoredAt, other.authoredAt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthorId()).compareTo(other.isSetAuthorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authorId, other.authorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplay()).compareTo(other.isSetDisplay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplay()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.display, other.display);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPublicVersion()).compareTo(other.isSetPublicVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPublicVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.publicVersion, other.publicVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPublishedVersion()).compareTo(other.isSetPublishedVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPublishedVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.publishedVersion, other.publishedVersion);
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
    StringBuilder sb = new StringBuilder("TemplateDraft(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("authoredAt:");
    sb.append(this.authoredAt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("authorId:");
    if (this.authorId == null) {
      sb.append("null");
    } else {
      sb.append(this.authorId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("display:");
    sb.append(this.display);
    first = false;
    if (!first) sb.append(", ");
    sb.append("publicVersion:");
    sb.append(this.publicVersion);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("publishedVersion:");
    sb.append(this.publishedVersion);
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

  private static class TemplateDraftStandardSchemeFactory implements SchemeFactory {
    public TemplateDraftStandardScheme getScheme() {
      return new TemplateDraftStandardScheme();
    }
  }

  private static class TemplateDraftStandardScheme extends StandardScheme<TemplateDraft> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TemplateDraft struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AUTHORED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.authoredAt = iprot.readI64();
              struct.setAuthoredAtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AUTHOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authorId = iprot.readString();
              struct.setAuthorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISPLAY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.display = iprot.readBool();
              struct.setDisplayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PUBLIC_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.publicVersion = iprot.readI32();
              struct.setPublicVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.wi.director.thrift.v1.jobtemplate.JobTemplateStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PUBLISHED_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.publishedVersion = iprot.readI32();
              struct.setPublishedVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TemplateDraft struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AUTHORED_AT_FIELD_DESC);
      oprot.writeI64(struct.authoredAt);
      oprot.writeFieldEnd();
      if (struct.authorId != null) {
        oprot.writeFieldBegin(AUTHOR_ID_FIELD_DESC);
        oprot.writeString(struct.authorId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DISPLAY_FIELD_DESC);
      oprot.writeBool(struct.display);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PUBLIC_VERSION_FIELD_DESC);
      oprot.writeI32(struct.publicVersion);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PUBLISHED_VERSION_FIELD_DESC);
      oprot.writeI32(struct.publishedVersion);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

