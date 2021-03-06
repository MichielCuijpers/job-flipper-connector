/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.websocket;

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
 * Schema for events pushed up from clients via websocket
 */
public class WebsocketUpSchema extends org.apache.thrift.TUnion<WebsocketUpSchema, WebsocketUpSchema._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WebsocketUpSchema");
  private static final org.apache.thrift.protocol.TField THREAD_SUBSCRIBE_FIELD_DESC = new org.apache.thrift.protocol.TField("threadSubscribe", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TEMPLATE_SUBSCRIBE_FIELD_DESC = new org.apache.thrift.protocol.TField("templateSubscribe", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField THREAD_UNSUBSCRIBE_FIELD_DESC = new org.apache.thrift.protocol.TField("threadUnsubscribe", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TEMPLATE_UNSUBSCRIBE_FIELD_DESC = new org.apache.thrift.protocol.TField("templateUnsubscribe", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField LEGACY_EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("legacyEvent", org.apache.thrift.protocol.TType.STRING, (short)20);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_SUBSCRIBE((short)1, "threadSubscribe"),
    TEMPLATE_SUBSCRIBE((short)2, "templateSubscribe"),
    THREAD_UNSUBSCRIBE((short)3, "threadUnsubscribe"),
    TEMPLATE_UNSUBSCRIBE((short)4, "templateUnsubscribe"),
    LEGACY_EVENT((short)20, "legacyEvent");

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
        case 1: // THREAD_SUBSCRIBE
          return THREAD_SUBSCRIBE;
        case 2: // TEMPLATE_SUBSCRIBE
          return TEMPLATE_SUBSCRIBE;
        case 3: // THREAD_UNSUBSCRIBE
          return THREAD_UNSUBSCRIBE;
        case 4: // TEMPLATE_UNSUBSCRIBE
          return TEMPLATE_UNSUBSCRIBE;
        case 20: // LEGACY_EVENT
          return LEGACY_EVENT;
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
    tmpMap.put(_Fields.THREAD_SUBSCRIBE, new org.apache.thrift.meta_data.FieldMetaData("threadSubscribe", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThreadSubscribe.class)));
    tmpMap.put(_Fields.TEMPLATE_SUBSCRIBE, new org.apache.thrift.meta_data.FieldMetaData("templateSubscribe", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TemplateSubscribe.class)));
    tmpMap.put(_Fields.THREAD_UNSUBSCRIBE, new org.apache.thrift.meta_data.FieldMetaData("threadUnsubscribe", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThreadUnsubscribe.class)));
    tmpMap.put(_Fields.TEMPLATE_UNSUBSCRIBE, new org.apache.thrift.meta_data.FieldMetaData("templateUnsubscribe", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TemplateUnsubscribe.class)));
    tmpMap.put(_Fields.LEGACY_EVENT, new org.apache.thrift.meta_data.FieldMetaData("legacyEvent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WebsocketUpSchema.class, metaDataMap);
  }

  public WebsocketUpSchema() {
    super();
  }

  public WebsocketUpSchema(_Fields setField, Object value) {
    super(setField, value);
  }

  public WebsocketUpSchema(WebsocketUpSchema other) {
    super(other);
  }
  public WebsocketUpSchema deepCopy() {
    return new WebsocketUpSchema(this);
  }

  public static WebsocketUpSchema threadSubscribe(ThreadSubscribe value) {
    WebsocketUpSchema x = new WebsocketUpSchema();
    x.setThreadSubscribe(value);
    return x;
  }

  public static WebsocketUpSchema templateSubscribe(TemplateSubscribe value) {
    WebsocketUpSchema x = new WebsocketUpSchema();
    x.setTemplateSubscribe(value);
    return x;
  }

  public static WebsocketUpSchema threadUnsubscribe(ThreadUnsubscribe value) {
    WebsocketUpSchema x = new WebsocketUpSchema();
    x.setThreadUnsubscribe(value);
    return x;
  }

  public static WebsocketUpSchema templateUnsubscribe(TemplateUnsubscribe value) {
    WebsocketUpSchema x = new WebsocketUpSchema();
    x.setTemplateUnsubscribe(value);
    return x;
  }

  public static WebsocketUpSchema legacyEvent(String value) {
    WebsocketUpSchema x = new WebsocketUpSchema();
    x.setLegacyEvent(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case THREAD_SUBSCRIBE:
        if (value instanceof ThreadSubscribe) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ThreadSubscribe for field 'threadSubscribe', but got " + value.getClass().getSimpleName());
      case TEMPLATE_SUBSCRIBE:
        if (value instanceof TemplateSubscribe) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TemplateSubscribe for field 'templateSubscribe', but got " + value.getClass().getSimpleName());
      case THREAD_UNSUBSCRIBE:
        if (value instanceof ThreadUnsubscribe) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ThreadUnsubscribe for field 'threadUnsubscribe', but got " + value.getClass().getSimpleName());
      case TEMPLATE_UNSUBSCRIBE:
        if (value instanceof TemplateUnsubscribe) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TemplateUnsubscribe for field 'templateUnsubscribe', but got " + value.getClass().getSimpleName());
      case LEGACY_EVENT:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'legacyEvent', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case THREAD_SUBSCRIBE:
          if (field.type == THREAD_SUBSCRIBE_FIELD_DESC.type) {
            ThreadSubscribe threadSubscribe;
            threadSubscribe = new ThreadSubscribe();
            threadSubscribe.read(iprot);
            return threadSubscribe;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TEMPLATE_SUBSCRIBE:
          if (field.type == TEMPLATE_SUBSCRIBE_FIELD_DESC.type) {
            TemplateSubscribe templateSubscribe;
            templateSubscribe = new TemplateSubscribe();
            templateSubscribe.read(iprot);
            return templateSubscribe;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case THREAD_UNSUBSCRIBE:
          if (field.type == THREAD_UNSUBSCRIBE_FIELD_DESC.type) {
            ThreadUnsubscribe threadUnsubscribe;
            threadUnsubscribe = new ThreadUnsubscribe();
            threadUnsubscribe.read(iprot);
            return threadUnsubscribe;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TEMPLATE_UNSUBSCRIBE:
          if (field.type == TEMPLATE_UNSUBSCRIBE_FIELD_DESC.type) {
            TemplateUnsubscribe templateUnsubscribe;
            templateUnsubscribe = new TemplateUnsubscribe();
            templateUnsubscribe.read(iprot);
            return templateUnsubscribe;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LEGACY_EVENT:
          if (field.type == LEGACY_EVENT_FIELD_DESC.type) {
            String legacyEvent;
            legacyEvent = iprot.readString();
            return legacyEvent;
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
      case THREAD_SUBSCRIBE:
        ThreadSubscribe threadSubscribe = (ThreadSubscribe)value_;
        threadSubscribe.write(oprot);
        return;
      case TEMPLATE_SUBSCRIBE:
        TemplateSubscribe templateSubscribe = (TemplateSubscribe)value_;
        templateSubscribe.write(oprot);
        return;
      case THREAD_UNSUBSCRIBE:
        ThreadUnsubscribe threadUnsubscribe = (ThreadUnsubscribe)value_;
        threadUnsubscribe.write(oprot);
        return;
      case TEMPLATE_UNSUBSCRIBE:
        TemplateUnsubscribe templateUnsubscribe = (TemplateUnsubscribe)value_;
        templateUnsubscribe.write(oprot);
        return;
      case LEGACY_EVENT:
        String legacyEvent = (String)value_;
        oprot.writeString(legacyEvent);
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
        case THREAD_SUBSCRIBE:
          ThreadSubscribe threadSubscribe;
          threadSubscribe = new ThreadSubscribe();
          threadSubscribe.read(iprot);
          return threadSubscribe;
        case TEMPLATE_SUBSCRIBE:
          TemplateSubscribe templateSubscribe;
          templateSubscribe = new TemplateSubscribe();
          templateSubscribe.read(iprot);
          return templateSubscribe;
        case THREAD_UNSUBSCRIBE:
          ThreadUnsubscribe threadUnsubscribe;
          threadUnsubscribe = new ThreadUnsubscribe();
          threadUnsubscribe.read(iprot);
          return threadUnsubscribe;
        case TEMPLATE_UNSUBSCRIBE:
          TemplateUnsubscribe templateUnsubscribe;
          templateUnsubscribe = new TemplateUnsubscribe();
          templateUnsubscribe.read(iprot);
          return templateUnsubscribe;
        case LEGACY_EVENT:
          String legacyEvent;
          legacyEvent = iprot.readString();
          return legacyEvent;
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
      case THREAD_SUBSCRIBE:
        ThreadSubscribe threadSubscribe = (ThreadSubscribe)value_;
        threadSubscribe.write(oprot);
        return;
      case TEMPLATE_SUBSCRIBE:
        TemplateSubscribe templateSubscribe = (TemplateSubscribe)value_;
        templateSubscribe.write(oprot);
        return;
      case THREAD_UNSUBSCRIBE:
        ThreadUnsubscribe threadUnsubscribe = (ThreadUnsubscribe)value_;
        threadUnsubscribe.write(oprot);
        return;
      case TEMPLATE_UNSUBSCRIBE:
        TemplateUnsubscribe templateUnsubscribe = (TemplateUnsubscribe)value_;
        templateUnsubscribe.write(oprot);
        return;
      case LEGACY_EVENT:
        String legacyEvent = (String)value_;
        oprot.writeString(legacyEvent);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case THREAD_SUBSCRIBE:
        return THREAD_SUBSCRIBE_FIELD_DESC;
      case TEMPLATE_SUBSCRIBE:
        return TEMPLATE_SUBSCRIBE_FIELD_DESC;
      case THREAD_UNSUBSCRIBE:
        return THREAD_UNSUBSCRIBE_FIELD_DESC;
      case TEMPLATE_UNSUBSCRIBE:
        return TEMPLATE_UNSUBSCRIBE_FIELD_DESC;
      case LEGACY_EVENT:
        return LEGACY_EVENT_FIELD_DESC;
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


  public ThreadSubscribe getThreadSubscribe() {
    if (getSetField() == _Fields.THREAD_SUBSCRIBE) {
      return (ThreadSubscribe)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'threadSubscribe' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setThreadSubscribe(ThreadSubscribe value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.THREAD_SUBSCRIBE;
    value_ = value;
  }

  public TemplateSubscribe getTemplateSubscribe() {
    if (getSetField() == _Fields.TEMPLATE_SUBSCRIBE) {
      return (TemplateSubscribe)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'templateSubscribe' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTemplateSubscribe(TemplateSubscribe value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.TEMPLATE_SUBSCRIBE;
    value_ = value;
  }

  public ThreadUnsubscribe getThreadUnsubscribe() {
    if (getSetField() == _Fields.THREAD_UNSUBSCRIBE) {
      return (ThreadUnsubscribe)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'threadUnsubscribe' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setThreadUnsubscribe(ThreadUnsubscribe value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.THREAD_UNSUBSCRIBE;
    value_ = value;
  }

  public TemplateUnsubscribe getTemplateUnsubscribe() {
    if (getSetField() == _Fields.TEMPLATE_UNSUBSCRIBE) {
      return (TemplateUnsubscribe)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'templateUnsubscribe' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTemplateUnsubscribe(TemplateUnsubscribe value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.TEMPLATE_UNSUBSCRIBE;
    value_ = value;
  }

  public String getLegacyEvent() {
    if (getSetField() == _Fields.LEGACY_EVENT) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'legacyEvent' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLegacyEvent(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LEGACY_EVENT;
    value_ = value;
  }

  public boolean isSetThreadSubscribe() {
    return setField_ == _Fields.THREAD_SUBSCRIBE;
  }


  public boolean isSetTemplateSubscribe() {
    return setField_ == _Fields.TEMPLATE_SUBSCRIBE;
  }


  public boolean isSetThreadUnsubscribe() {
    return setField_ == _Fields.THREAD_UNSUBSCRIBE;
  }


  public boolean isSetTemplateUnsubscribe() {
    return setField_ == _Fields.TEMPLATE_UNSUBSCRIBE;
  }


  public boolean isSetLegacyEvent() {
    return setField_ == _Fields.LEGACY_EVENT;
  }


  public boolean equals(Object other) {
    if (other instanceof WebsocketUpSchema) {
      return equals((WebsocketUpSchema)other);
    } else {
      return false;
    }
  }

  public boolean equals(WebsocketUpSchema other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(WebsocketUpSchema other) {
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
