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
public class MessageResult implements org.apache.thrift.TBase<MessageResult, MessageResult._Fields>, java.io.Serializable, Cloneable, Comparable<MessageResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MessageResult");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SEQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("seqId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("messages", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageResultStandardSchemeFactory());
  }

  public String id; // required
  public long seqId; // required
  public List<Message> messages; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    SEQ_ID((short)2, "seqId"),
    MESSAGES((short)3, "messages");

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
        case 2: // SEQ_ID
          return SEQ_ID;
        case 3: // MESSAGES
          return MESSAGES;
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
  private static final int __SEQID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEQ_ID, new org.apache.thrift.meta_data.FieldMetaData("seqId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("messages", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Message.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MessageResult.class, metaDataMap);
  }

  public MessageResult() {
  }

  public MessageResult(
    String id,
    long seqId,
    List<Message> messages)
  {
    this();
    this.id = id;
    this.seqId = seqId;
    setSeqIdIsSet(true);
    this.messages = messages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageResult(MessageResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.seqId = other.seqId;
    if (other.isSetMessages()) {
      List<Message> __this__messages = new ArrayList<Message>(other.messages.size());
      for (Message other_element : other.messages) {
        __this__messages.add(new Message(other_element));
      }
      this.messages = __this__messages;
    }
  }

  public MessageResult deepCopy() {
    return new MessageResult(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setSeqIdIsSet(false);
    this.seqId = 0;
    this.messages = null;
  }

  public String getId() {
    return this.id;
  }

  public MessageResult setId(String id) {
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

  public long getSeqId() {
    return this.seqId;
  }

  public MessageResult setSeqId(long seqId) {
    this.seqId = seqId;
    setSeqIdIsSet(true);
    return this;
  }

  public void unsetSeqId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQID_ISSET_ID);
  }

  /** Returns true if field seqId is set (has been assigned a value) and false otherwise */
  public boolean isSetSeqId() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQID_ISSET_ID);
  }

  public void setSeqIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQID_ISSET_ID, value);
  }

  public int getMessagesSize() {
    return (this.messages == null) ? 0 : this.messages.size();
  }

  public java.util.Iterator<Message> getMessagesIterator() {
    return (this.messages == null) ? null : this.messages.iterator();
  }

  public void addToMessages(Message elem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(elem);
  }

  public List<Message> getMessages() {
    return this.messages;
  }

  public MessageResult setMessages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public void unsetMessages() {
    this.messages = null;
  }

  /** Returns true if field messages is set (has been assigned a value) and false otherwise */
  public boolean isSetMessages() {
    return this.messages != null;
  }

  public void setMessagesIsSet(boolean value) {
    if (!value) {
      this.messages = null;
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

    case SEQ_ID:
      if (value == null) {
        unsetSeqId();
      } else {
        setSeqId((Long)value);
      }
      break;

    case MESSAGES:
      if (value == null) {
        unsetMessages();
      } else {
        setMessages((List<Message>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case SEQ_ID:
      return getSeqId();

    case MESSAGES:
      return getMessages();

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
    case SEQ_ID:
      return isSetSeqId();
    case MESSAGES:
      return isSetMessages();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageResult)
      return this.equals((MessageResult)that);
    return false;
  }

  public boolean equals(MessageResult that) {
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

    boolean this_present_seqId = true;
    boolean that_present_seqId = true;
    if (this_present_seqId || that_present_seqId) {
      if (!(this_present_seqId && that_present_seqId))
        return false;
      if (this.seqId != that.seqId)
        return false;
    }

    boolean this_present_messages = true && this.isSetMessages();
    boolean that_present_messages = true && that.isSetMessages();
    if (this_present_messages || that_present_messages) {
      if (!(this_present_messages && that_present_messages))
        return false;
      if (!this.messages.equals(that.messages))
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

    boolean present_seqId = true;
    list.add(present_seqId);
    if (present_seqId)
      list.add(seqId);

    boolean present_messages = true && (isSetMessages());
    list.add(present_messages);
    if (present_messages)
      list.add(messages);

    return list.hashCode();
  }

  @Override
  public int compareTo(MessageResult other) {
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
    lastComparison = Boolean.valueOf(isSetSeqId()).compareTo(other.isSetSeqId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeqId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seqId, other.seqId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessages()).compareTo(other.isSetMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messages, other.messages);
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
    StringBuilder sb = new StringBuilder("MessageResult(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("seqId:");
    sb.append(this.seqId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messages:");
    if (this.messages == null) {
      sb.append("null");
    } else {
      sb.append(this.messages);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MessageResultStandardSchemeFactory implements SchemeFactory {
    public MessageResultStandardScheme getScheme() {
      return new MessageResultStandardScheme();
    }
  }

  private static class MessageResultStandardScheme extends StandardScheme<MessageResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MessageResult struct) throws org.apache.thrift.TException {
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
          case 2: // SEQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.seqId = iprot.readI64();
              struct.setSeqIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list9 = iprot.readListBegin();
                struct.messages = new ArrayList<Message>(_list9.size);
                Message _elem10;
                for (int _i11 = 0; _i11 < _list9.size; ++_i11)
                {
                  _elem10 = new Message();
                  _elem10.read(iprot);
                  struct.messages.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setMessagesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MessageResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEQ_ID_FIELD_DESC);
      oprot.writeI64(struct.seqId);
      oprot.writeFieldEnd();
      if (struct.messages != null) {
        oprot.writeFieldBegin(MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.messages.size()));
          for (Message _iter12 : struct.messages)
          {
            _iter12.write(oprot);
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
