/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.mesh;

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
public class MeshHeader implements org.apache.thrift.TBase<MeshHeader, MeshHeader._Fields>, java.io.Serializable, Cloneable, Comparable<MeshHeader> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MeshHeader");

  private static final org.apache.thrift.protocol.TField DEVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("deviceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IP_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("ipAddress", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DEVICE_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("deviceAddress", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FRIENDLY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("friendlyName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField MESH_GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("meshGroup", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MeshHeaderStandardSchemeFactory());
  }

  public String deviceId; // required
  public String ipAddress; // required
  public int port; // required
  public String deviceAddress; // required
  public String friendlyName; // required
  public String userId; // required
  public MeshGroup meshGroup; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEVICE_ID((short)1, "deviceId"),
    IP_ADDRESS((short)2, "ipAddress"),
    PORT((short)3, "port"),
    DEVICE_ADDRESS((short)4, "deviceAddress"),
    FRIENDLY_NAME((short)5, "friendlyName"),
    USER_ID((short)6, "userId"),
    MESH_GROUP((short)7, "meshGroup");

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
        case 1: // DEVICE_ID
          return DEVICE_ID;
        case 2: // IP_ADDRESS
          return IP_ADDRESS;
        case 3: // PORT
          return PORT;
        case 4: // DEVICE_ADDRESS
          return DEVICE_ADDRESS;
        case 5: // FRIENDLY_NAME
          return FRIENDLY_NAME;
        case 6: // USER_ID
          return USER_ID;
        case 7: // MESH_GROUP
          return MESH_GROUP;
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
  private static final int __PORT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("deviceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IP_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("ipAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEVICE_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("deviceAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FRIENDLY_NAME, new org.apache.thrift.meta_data.FieldMetaData("friendlyName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESH_GROUP, new org.apache.thrift.meta_data.FieldMetaData("meshGroup", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MeshGroup.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MeshHeader.class, metaDataMap);
  }

  public MeshHeader() {
  }

  public MeshHeader(
    String deviceId,
    String ipAddress,
    int port,
    String deviceAddress,
    String friendlyName,
    String userId,
    MeshGroup meshGroup)
  {
    this();
    this.deviceId = deviceId;
    this.ipAddress = ipAddress;
    this.port = port;
    setPortIsSet(true);
    this.deviceAddress = deviceAddress;
    this.friendlyName = friendlyName;
    this.userId = userId;
    this.meshGroup = meshGroup;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MeshHeader(MeshHeader other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDeviceId()) {
      this.deviceId = other.deviceId;
    }
    if (other.isSetIpAddress()) {
      this.ipAddress = other.ipAddress;
    }
    this.port = other.port;
    if (other.isSetDeviceAddress()) {
      this.deviceAddress = other.deviceAddress;
    }
    if (other.isSetFriendlyName()) {
      this.friendlyName = other.friendlyName;
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetMeshGroup()) {
      this.meshGroup = new MeshGroup(other.meshGroup);
    }
  }

  public MeshHeader deepCopy() {
    return new MeshHeader(this);
  }

  @Override
  public void clear() {
    this.deviceId = null;
    this.ipAddress = null;
    setPortIsSet(false);
    this.port = 0;
    this.deviceAddress = null;
    this.friendlyName = null;
    this.userId = null;
    this.meshGroup = null;
  }

  public String getDeviceId() {
    return this.deviceId;
  }

  public MeshHeader setDeviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  public void unsetDeviceId() {
    this.deviceId = null;
  }

  /** Returns true if field deviceId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeviceId() {
    return this.deviceId != null;
  }

  public void setDeviceIdIsSet(boolean value) {
    if (!value) {
      this.deviceId = null;
    }
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  public MeshHeader setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public void unsetIpAddress() {
    this.ipAddress = null;
  }

  /** Returns true if field ipAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetIpAddress() {
    return this.ipAddress != null;
  }

  public void setIpAddressIsSet(boolean value) {
    if (!value) {
      this.ipAddress = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public MeshHeader setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public String getDeviceAddress() {
    return this.deviceAddress;
  }

  public MeshHeader setDeviceAddress(String deviceAddress) {
    this.deviceAddress = deviceAddress;
    return this;
  }

  public void unsetDeviceAddress() {
    this.deviceAddress = null;
  }

  /** Returns true if field deviceAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetDeviceAddress() {
    return this.deviceAddress != null;
  }

  public void setDeviceAddressIsSet(boolean value) {
    if (!value) {
      this.deviceAddress = null;
    }
  }

  public String getFriendlyName() {
    return this.friendlyName;
  }

  public MeshHeader setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  public void unsetFriendlyName() {
    this.friendlyName = null;
  }

  /** Returns true if field friendlyName is set (has been assigned a value) and false otherwise */
  public boolean isSetFriendlyName() {
    return this.friendlyName != null;
  }

  public void setFriendlyNameIsSet(boolean value) {
    if (!value) {
      this.friendlyName = null;
    }
  }

  public String getUserId() {
    return this.userId;
  }

  public MeshHeader setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public MeshGroup getMeshGroup() {
    return this.meshGroup;
  }

  public MeshHeader setMeshGroup(MeshGroup meshGroup) {
    this.meshGroup = meshGroup;
    return this;
  }

  public void unsetMeshGroup() {
    this.meshGroup = null;
  }

  /** Returns true if field meshGroup is set (has been assigned a value) and false otherwise */
  public boolean isSetMeshGroup() {
    return this.meshGroup != null;
  }

  public void setMeshGroupIsSet(boolean value) {
    if (!value) {
      this.meshGroup = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVICE_ID:
      if (value == null) {
        unsetDeviceId();
      } else {
        setDeviceId((String)value);
      }
      break;

    case IP_ADDRESS:
      if (value == null) {
        unsetIpAddress();
      } else {
        setIpAddress((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((Integer)value);
      }
      break;

    case DEVICE_ADDRESS:
      if (value == null) {
        unsetDeviceAddress();
      } else {
        setDeviceAddress((String)value);
      }
      break;

    case FRIENDLY_NAME:
      if (value == null) {
        unsetFriendlyName();
      } else {
        setFriendlyName((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((String)value);
      }
      break;

    case MESH_GROUP:
      if (value == null) {
        unsetMeshGroup();
      } else {
        setMeshGroup((MeshGroup)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVICE_ID:
      return getDeviceId();

    case IP_ADDRESS:
      return getIpAddress();

    case PORT:
      return getPort();

    case DEVICE_ADDRESS:
      return getDeviceAddress();

    case FRIENDLY_NAME:
      return getFriendlyName();

    case USER_ID:
      return getUserId();

    case MESH_GROUP:
      return getMeshGroup();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVICE_ID:
      return isSetDeviceId();
    case IP_ADDRESS:
      return isSetIpAddress();
    case PORT:
      return isSetPort();
    case DEVICE_ADDRESS:
      return isSetDeviceAddress();
    case FRIENDLY_NAME:
      return isSetFriendlyName();
    case USER_ID:
      return isSetUserId();
    case MESH_GROUP:
      return isSetMeshGroup();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MeshHeader)
      return this.equals((MeshHeader)that);
    return false;
  }

  public boolean equals(MeshHeader that) {
    if (that == null)
      return false;

    boolean this_present_deviceId = true && this.isSetDeviceId();
    boolean that_present_deviceId = true && that.isSetDeviceId();
    if (this_present_deviceId || that_present_deviceId) {
      if (!(this_present_deviceId && that_present_deviceId))
        return false;
      if (!this.deviceId.equals(that.deviceId))
        return false;
    }

    boolean this_present_ipAddress = true && this.isSetIpAddress();
    boolean that_present_ipAddress = true && that.isSetIpAddress();
    if (this_present_ipAddress || that_present_ipAddress) {
      if (!(this_present_ipAddress && that_present_ipAddress))
        return false;
      if (!this.ipAddress.equals(that.ipAddress))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_deviceAddress = true && this.isSetDeviceAddress();
    boolean that_present_deviceAddress = true && that.isSetDeviceAddress();
    if (this_present_deviceAddress || that_present_deviceAddress) {
      if (!(this_present_deviceAddress && that_present_deviceAddress))
        return false;
      if (!this.deviceAddress.equals(that.deviceAddress))
        return false;
    }

    boolean this_present_friendlyName = true && this.isSetFriendlyName();
    boolean that_present_friendlyName = true && that.isSetFriendlyName();
    if (this_present_friendlyName || that_present_friendlyName) {
      if (!(this_present_friendlyName && that_present_friendlyName))
        return false;
      if (!this.friendlyName.equals(that.friendlyName))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_meshGroup = true && this.isSetMeshGroup();
    boolean that_present_meshGroup = true && that.isSetMeshGroup();
    if (this_present_meshGroup || that_present_meshGroup) {
      if (!(this_present_meshGroup && that_present_meshGroup))
        return false;
      if (!this.meshGroup.equals(that.meshGroup))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_deviceId = true && (isSetDeviceId());
    list.add(present_deviceId);
    if (present_deviceId)
      list.add(deviceId);

    boolean present_ipAddress = true && (isSetIpAddress());
    list.add(present_ipAddress);
    if (present_ipAddress)
      list.add(ipAddress);

    boolean present_port = true;
    list.add(present_port);
    if (present_port)
      list.add(port);

    boolean present_deviceAddress = true && (isSetDeviceAddress());
    list.add(present_deviceAddress);
    if (present_deviceAddress)
      list.add(deviceAddress);

    boolean present_friendlyName = true && (isSetFriendlyName());
    list.add(present_friendlyName);
    if (present_friendlyName)
      list.add(friendlyName);

    boolean present_userId = true && (isSetUserId());
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_meshGroup = true && (isSetMeshGroup());
    list.add(present_meshGroup);
    if (present_meshGroup)
      list.add(meshGroup);

    return list.hashCode();
  }

  @Override
  public int compareTo(MeshHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDeviceId()).compareTo(other.isSetDeviceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeviceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deviceId, other.deviceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIpAddress()).compareTo(other.isSetIpAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIpAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ipAddress, other.ipAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeviceAddress()).compareTo(other.isSetDeviceAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeviceAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deviceAddress, other.deviceAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFriendlyName()).compareTo(other.isSetFriendlyName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFriendlyName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.friendlyName, other.friendlyName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMeshGroup()).compareTo(other.isSetMeshGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMeshGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.meshGroup, other.meshGroup);
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
    StringBuilder sb = new StringBuilder("MeshHeader(");
    boolean first = true;

    sb.append("deviceId:");
    if (this.deviceId == null) {
      sb.append("null");
    } else {
      sb.append(this.deviceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ipAddress:");
    if (this.ipAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.ipAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("deviceAddress:");
    if (this.deviceAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.deviceAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("friendlyName:");
    if (this.friendlyName == null) {
      sb.append("null");
    } else {
      sb.append(this.friendlyName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("meshGroup:");
    if (this.meshGroup == null) {
      sb.append("null");
    } else {
      sb.append(this.meshGroup);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (meshGroup != null) {
      meshGroup.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MeshHeaderStandardSchemeFactory implements SchemeFactory {
    public MeshHeaderStandardScheme getScheme() {
      return new MeshHeaderStandardScheme();
    }
  }

  private static class MeshHeaderStandardScheme extends StandardScheme<MeshHeader> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MeshHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deviceId = iprot.readString();
              struct.setDeviceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IP_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ipAddress = iprot.readString();
              struct.setIpAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.setPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEVICE_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deviceAddress = iprot.readString();
              struct.setDeviceAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FRIENDLY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.friendlyName = iprot.readString();
              struct.setFriendlyNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MESH_GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.meshGroup = new MeshGroup();
              struct.meshGroup.read(iprot);
              struct.setMeshGroupIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MeshHeader struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.deviceId != null) {
        oprot.writeFieldBegin(DEVICE_ID_FIELD_DESC);
        oprot.writeString(struct.deviceId);
        oprot.writeFieldEnd();
      }
      if (struct.ipAddress != null) {
        oprot.writeFieldBegin(IP_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.ipAddress);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      if (struct.deviceAddress != null) {
        oprot.writeFieldBegin(DEVICE_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.deviceAddress);
        oprot.writeFieldEnd();
      }
      if (struct.friendlyName != null) {
        oprot.writeFieldBegin(FRIENDLY_NAME_FIELD_DESC);
        oprot.writeString(struct.friendlyName);
        oprot.writeFieldEnd();
      }
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.meshGroup != null) {
        oprot.writeFieldBegin(MESH_GROUP_FIELD_DESC);
        struct.meshGroup.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

