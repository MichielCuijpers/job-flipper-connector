/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.field_data;

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
 * Union representing the various field input types
 * Don't confuse with various ExecutionData types in job.thrift [VR]
 * This is a slight misnomer. FieldEntry might've been a better name [VR]
 * Since there is no longer a 1to1 mapping of field types to execution data fields, there will be
 * comments indicating which field types maps to each exection data type
 * 
 */
public class ExecutionData extends org.apache.thrift.TUnion<ExecutionData, ExecutionData._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExecutionData");
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("number", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("option", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PHOTO_FIELD_DESC = new org.apache.thrift.protocol.TField("photo", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField VIDEO_FIELD_DESC = new org.apache.thrift.protocol.TField("video", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField AUDIO_FIELD_DESC = new org.apache.thrift.protocol.TField("audio", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField SIGNATURE_FIELD_DESC = new org.apache.thrift.protocol.TField("signature", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField YES_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("yesNo", org.apache.thrift.protocol.TType.BOOL, (short)9);
  private static final org.apache.thrift.protocol.TField PRECISE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("preciseNumber", org.apache.thrift.protocol.TType.STRUCT, (short)10);
  private static final org.apache.thrift.protocol.TField LINK_FIELD_DESC = new org.apache.thrift.protocol.TField("link", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField SELECTED_LIST_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("selectedListValues", org.apache.thrift.protocol.TType.STRUCT, (short)12);
  private static final org.apache.thrift.protocol.TField FILE_FIELD_DESC = new org.apache.thrift.protocol.TField("file", org.apache.thrift.protocol.TType.STRING, (short)13);
  private static final org.apache.thrift.protocol.TField UNIT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("unitNumber", org.apache.thrift.protocol.TType.STRUCT, (short)14);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEXT((short)1, "text"),
    NUMBER((short)2, "number"),
    OPTION((short)3, "option"),
    PHOTO((short)4, "photo"),
    VIDEO((short)5, "video"),
    AUDIO((short)6, "audio"),
    SIGNATURE((short)7, "signature"),
    DATE((short)8, "date"),
    YES_NO((short)9, "yesNo"),
    PRECISE_NUMBER((short)10, "preciseNumber"),
    LINK((short)11, "link"),
    SELECTED_LIST_VALUES((short)12, "selectedListValues"),
    FILE((short)13, "file"),
    UNIT_NUMBER((short)14, "unitNumber");

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
        case 1: // TEXT
          return TEXT;
        case 2: // NUMBER
          return NUMBER;
        case 3: // OPTION
          return OPTION;
        case 4: // PHOTO
          return PHOTO;
        case 5: // VIDEO
          return VIDEO;
        case 6: // AUDIO
          return AUDIO;
        case 7: // SIGNATURE
          return SIGNATURE;
        case 8: // DATE
          return DATE;
        case 9: // YES_NO
          return YES_NO;
        case 10: // PRECISE_NUMBER
          return PRECISE_NUMBER;
        case 11: // LINK
          return LINK;
        case 12: // SELECTED_LIST_VALUES
          return SELECTED_LIST_VALUES;
        case 13: // FILE
          return FILE;
        case 14: // UNIT_NUMBER
          return UNIT_NUMBER;
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
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER, new org.apache.thrift.meta_data.FieldMetaData("number", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.OPTION, new org.apache.thrift.meta_data.FieldMetaData("option", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHOTO, new org.apache.thrift.meta_data.FieldMetaData("photo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIDEO, new org.apache.thrift.meta_data.FieldMetaData("video", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUDIO, new org.apache.thrift.meta_data.FieldMetaData("audio", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SIGNATURE, new org.apache.thrift.meta_data.FieldMetaData("signature", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.YES_NO, new org.apache.thrift.meta_data.FieldMetaData("yesNo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PRECISE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("preciseNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.common.PreciseNumber.class)));
    tmpMap.put(_Fields.LINK, new org.apache.thrift.meta_data.FieldMetaData("link", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SELECTED_LIST_VALUES, new org.apache.thrift.meta_data.FieldMetaData("selectedListValues", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.wi.director.thrift.v1.common.SelectedListValues.class)));
    tmpMap.put(_Fields.FILE, new org.apache.thrift.meta_data.FieldMetaData("file", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNIT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("unitNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MeasuredUnitNumber.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExecutionData.class, metaDataMap);
  }

  public ExecutionData() {
    super();
  }

  public ExecutionData(_Fields setField, Object value) {
    super(setField, value);
  }

  public ExecutionData(ExecutionData other) {
    super(other);
  }
  public ExecutionData deepCopy() {
    return new ExecutionData(this);
  }

  public static ExecutionData text(String value) {
    ExecutionData x = new ExecutionData();
    x.setText(value);
    return x;
  }

  public static ExecutionData number(double value) {
    ExecutionData x = new ExecutionData();
    x.setNumber(value);
    return x;
  }

  public static ExecutionData option(String value) {
    ExecutionData x = new ExecutionData();
    x.setOption(value);
    return x;
  }

  public static ExecutionData photo(String value) {
    ExecutionData x = new ExecutionData();
    x.setPhoto(value);
    return x;
  }

  public static ExecutionData video(String value) {
    ExecutionData x = new ExecutionData();
    x.setVideo(value);
    return x;
  }

  public static ExecutionData audio(String value) {
    ExecutionData x = new ExecutionData();
    x.setAudio(value);
    return x;
  }

  public static ExecutionData signature(String value) {
    ExecutionData x = new ExecutionData();
    x.setSignature(value);
    return x;
  }

  public static ExecutionData date(long value) {
    ExecutionData x = new ExecutionData();
    x.setDate(value);
    return x;
  }

  public static ExecutionData yesNo(boolean value) {
    ExecutionData x = new ExecutionData();
    x.setYesNo(value);
    return x;
  }

  public static ExecutionData preciseNumber(com.wi.director.thrift.v1.common.PreciseNumber value) {
    ExecutionData x = new ExecutionData();
    x.setPreciseNumber(value);
    return x;
  }

  public static ExecutionData link(String value) {
    ExecutionData x = new ExecutionData();
    x.setLink(value);
    return x;
  }

  public static ExecutionData selectedListValues(com.wi.director.thrift.v1.common.SelectedListValues value) {
    ExecutionData x = new ExecutionData();
    x.setSelectedListValues(value);
    return x;
  }

  public static ExecutionData file(String value) {
    ExecutionData x = new ExecutionData();
    x.setFile(value);
    return x;
  }

  public static ExecutionData unitNumber(MeasuredUnitNumber value) {
    ExecutionData x = new ExecutionData();
    x.setUnitNumber(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case TEXT:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'text', but got " + value.getClass().getSimpleName());
      case NUMBER:
        if (value instanceof Double) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Double for field 'number', but got " + value.getClass().getSimpleName());
      case OPTION:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'option', but got " + value.getClass().getSimpleName());
      case PHOTO:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'photo', but got " + value.getClass().getSimpleName());
      case VIDEO:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'video', but got " + value.getClass().getSimpleName());
      case AUDIO:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'audio', but got " + value.getClass().getSimpleName());
      case SIGNATURE:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'signature', but got " + value.getClass().getSimpleName());
      case DATE:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'date', but got " + value.getClass().getSimpleName());
      case YES_NO:
        if (value instanceof Boolean) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Boolean for field 'yesNo', but got " + value.getClass().getSimpleName());
      case PRECISE_NUMBER:
        if (value instanceof com.wi.director.thrift.v1.common.PreciseNumber) {
          break;
        }
        throw new ClassCastException("Was expecting value of type com.wi.director.thrift.v1.common.PreciseNumber for field 'preciseNumber', but got " + value.getClass().getSimpleName());
      case LINK:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'link', but got " + value.getClass().getSimpleName());
      case SELECTED_LIST_VALUES:
        if (value instanceof com.wi.director.thrift.v1.common.SelectedListValues) {
          break;
        }
        throw new ClassCastException("Was expecting value of type com.wi.director.thrift.v1.common.SelectedListValues for field 'selectedListValues', but got " + value.getClass().getSimpleName());
      case FILE:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'file', but got " + value.getClass().getSimpleName());
      case UNIT_NUMBER:
        if (value instanceof MeasuredUnitNumber) {
          break;
        }
        throw new ClassCastException("Was expecting value of type MeasuredUnitNumber for field 'unitNumber', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case TEXT:
          if (field.type == TEXT_FIELD_DESC.type) {
            String text;
            text = iprot.readString();
            return text;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NUMBER:
          if (field.type == NUMBER_FIELD_DESC.type) {
            Double number;
            number = iprot.readDouble();
            return number;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case OPTION:
          if (field.type == OPTION_FIELD_DESC.type) {
            String option;
            option = iprot.readString();
            return option;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PHOTO:
          if (field.type == PHOTO_FIELD_DESC.type) {
            String photo;
            photo = iprot.readString();
            return photo;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case VIDEO:
          if (field.type == VIDEO_FIELD_DESC.type) {
            String video;
            video = iprot.readString();
            return video;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case AUDIO:
          if (field.type == AUDIO_FIELD_DESC.type) {
            String audio;
            audio = iprot.readString();
            return audio;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SIGNATURE:
          if (field.type == SIGNATURE_FIELD_DESC.type) {
            String signature;
            signature = iprot.readString();
            return signature;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DATE:
          if (field.type == DATE_FIELD_DESC.type) {
            Long date;
            date = iprot.readI64();
            return date;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case YES_NO:
          if (field.type == YES_NO_FIELD_DESC.type) {
            Boolean yesNo;
            yesNo = iprot.readBool();
            return yesNo;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PRECISE_NUMBER:
          if (field.type == PRECISE_NUMBER_FIELD_DESC.type) {
            com.wi.director.thrift.v1.common.PreciseNumber preciseNumber;
            preciseNumber = new com.wi.director.thrift.v1.common.PreciseNumber();
            preciseNumber.read(iprot);
            return preciseNumber;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LINK:
          if (field.type == LINK_FIELD_DESC.type) {
            String link;
            link = iprot.readString();
            return link;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SELECTED_LIST_VALUES:
          if (field.type == SELECTED_LIST_VALUES_FIELD_DESC.type) {
            com.wi.director.thrift.v1.common.SelectedListValues selectedListValues;
            selectedListValues = new com.wi.director.thrift.v1.common.SelectedListValues();
            selectedListValues.read(iprot);
            return selectedListValues;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FILE:
          if (field.type == FILE_FIELD_DESC.type) {
            String file;
            file = iprot.readString();
            return file;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case UNIT_NUMBER:
          if (field.type == UNIT_NUMBER_FIELD_DESC.type) {
            MeasuredUnitNumber unitNumber;
            unitNumber = new MeasuredUnitNumber();
            unitNumber.read(iprot);
            return unitNumber;
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
      case TEXT:
        String text = (String)value_;
        oprot.writeString(text);
        return;
      case NUMBER:
        Double number = (Double)value_;
        oprot.writeDouble(number);
        return;
      case OPTION:
        String option = (String)value_;
        oprot.writeString(option);
        return;
      case PHOTO:
        String photo = (String)value_;
        oprot.writeString(photo);
        return;
      case VIDEO:
        String video = (String)value_;
        oprot.writeString(video);
        return;
      case AUDIO:
        String audio = (String)value_;
        oprot.writeString(audio);
        return;
      case SIGNATURE:
        String signature = (String)value_;
        oprot.writeString(signature);
        return;
      case DATE:
        Long date = (Long)value_;
        oprot.writeI64(date);
        return;
      case YES_NO:
        Boolean yesNo = (Boolean)value_;
        oprot.writeBool(yesNo);
        return;
      case PRECISE_NUMBER:
        com.wi.director.thrift.v1.common.PreciseNumber preciseNumber = (com.wi.director.thrift.v1.common.PreciseNumber)value_;
        preciseNumber.write(oprot);
        return;
      case LINK:
        String link = (String)value_;
        oprot.writeString(link);
        return;
      case SELECTED_LIST_VALUES:
        com.wi.director.thrift.v1.common.SelectedListValues selectedListValues = (com.wi.director.thrift.v1.common.SelectedListValues)value_;
        selectedListValues.write(oprot);
        return;
      case FILE:
        String file = (String)value_;
        oprot.writeString(file);
        return;
      case UNIT_NUMBER:
        MeasuredUnitNumber unitNumber = (MeasuredUnitNumber)value_;
        unitNumber.write(oprot);
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
        case TEXT:
          String text;
          text = iprot.readString();
          return text;
        case NUMBER:
          Double number;
          number = iprot.readDouble();
          return number;
        case OPTION:
          String option;
          option = iprot.readString();
          return option;
        case PHOTO:
          String photo;
          photo = iprot.readString();
          return photo;
        case VIDEO:
          String video;
          video = iprot.readString();
          return video;
        case AUDIO:
          String audio;
          audio = iprot.readString();
          return audio;
        case SIGNATURE:
          String signature;
          signature = iprot.readString();
          return signature;
        case DATE:
          Long date;
          date = iprot.readI64();
          return date;
        case YES_NO:
          Boolean yesNo;
          yesNo = iprot.readBool();
          return yesNo;
        case PRECISE_NUMBER:
          com.wi.director.thrift.v1.common.PreciseNumber preciseNumber;
          preciseNumber = new com.wi.director.thrift.v1.common.PreciseNumber();
          preciseNumber.read(iprot);
          return preciseNumber;
        case LINK:
          String link;
          link = iprot.readString();
          return link;
        case SELECTED_LIST_VALUES:
          com.wi.director.thrift.v1.common.SelectedListValues selectedListValues;
          selectedListValues = new com.wi.director.thrift.v1.common.SelectedListValues();
          selectedListValues.read(iprot);
          return selectedListValues;
        case FILE:
          String file;
          file = iprot.readString();
          return file;
        case UNIT_NUMBER:
          MeasuredUnitNumber unitNumber;
          unitNumber = new MeasuredUnitNumber();
          unitNumber.read(iprot);
          return unitNumber;
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
      case TEXT:
        String text = (String)value_;
        oprot.writeString(text);
        return;
      case NUMBER:
        Double number = (Double)value_;
        oprot.writeDouble(number);
        return;
      case OPTION:
        String option = (String)value_;
        oprot.writeString(option);
        return;
      case PHOTO:
        String photo = (String)value_;
        oprot.writeString(photo);
        return;
      case VIDEO:
        String video = (String)value_;
        oprot.writeString(video);
        return;
      case AUDIO:
        String audio = (String)value_;
        oprot.writeString(audio);
        return;
      case SIGNATURE:
        String signature = (String)value_;
        oprot.writeString(signature);
        return;
      case DATE:
        Long date = (Long)value_;
        oprot.writeI64(date);
        return;
      case YES_NO:
        Boolean yesNo = (Boolean)value_;
        oprot.writeBool(yesNo);
        return;
      case PRECISE_NUMBER:
        com.wi.director.thrift.v1.common.PreciseNumber preciseNumber = (com.wi.director.thrift.v1.common.PreciseNumber)value_;
        preciseNumber.write(oprot);
        return;
      case LINK:
        String link = (String)value_;
        oprot.writeString(link);
        return;
      case SELECTED_LIST_VALUES:
        com.wi.director.thrift.v1.common.SelectedListValues selectedListValues = (com.wi.director.thrift.v1.common.SelectedListValues)value_;
        selectedListValues.write(oprot);
        return;
      case FILE:
        String file = (String)value_;
        oprot.writeString(file);
        return;
      case UNIT_NUMBER:
        MeasuredUnitNumber unitNumber = (MeasuredUnitNumber)value_;
        unitNumber.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case TEXT:
        return TEXT_FIELD_DESC;
      case NUMBER:
        return NUMBER_FIELD_DESC;
      case OPTION:
        return OPTION_FIELD_DESC;
      case PHOTO:
        return PHOTO_FIELD_DESC;
      case VIDEO:
        return VIDEO_FIELD_DESC;
      case AUDIO:
        return AUDIO_FIELD_DESC;
      case SIGNATURE:
        return SIGNATURE_FIELD_DESC;
      case DATE:
        return DATE_FIELD_DESC;
      case YES_NO:
        return YES_NO_FIELD_DESC;
      case PRECISE_NUMBER:
        return PRECISE_NUMBER_FIELD_DESC;
      case LINK:
        return LINK_FIELD_DESC;
      case SELECTED_LIST_VALUES:
        return SELECTED_LIST_VALUES_FIELD_DESC;
      case FILE:
        return FILE_FIELD_DESC;
      case UNIT_NUMBER:
        return UNIT_NUMBER_FIELD_DESC;
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


  public String getText() {
    if (getSetField() == _Fields.TEXT) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'text' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setText(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.TEXT;
    value_ = value;
  }

  public double getNumber() {
    if (getSetField() == _Fields.NUMBER) {
      return (Double)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'number' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNumber(double value) {
    setField_ = _Fields.NUMBER;
    value_ = value;
  }

  public String getOption() {
    if (getSetField() == _Fields.OPTION) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'option' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setOption(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.OPTION;
    value_ = value;
  }

  public String getPhoto() {
    if (getSetField() == _Fields.PHOTO) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'photo' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPhoto(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PHOTO;
    value_ = value;
  }

  public String getVideo() {
    if (getSetField() == _Fields.VIDEO) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'video' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setVideo(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.VIDEO;
    value_ = value;
  }

  public String getAudio() {
    if (getSetField() == _Fields.AUDIO) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'audio' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setAudio(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.AUDIO;
    value_ = value;
  }

  public String getSignature() {
    if (getSetField() == _Fields.SIGNATURE) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'signature' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSignature(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SIGNATURE;
    value_ = value;
  }

  public long getDate() {
    if (getSetField() == _Fields.DATE) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'date' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDate(long value) {
    setField_ = _Fields.DATE;
    value_ = value;
  }

  public boolean getYesNo() {
    if (getSetField() == _Fields.YES_NO) {
      return (Boolean)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'yesNo' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setYesNo(boolean value) {
    setField_ = _Fields.YES_NO;
    value_ = value;
  }

  public com.wi.director.thrift.v1.common.PreciseNumber getPreciseNumber() {
    if (getSetField() == _Fields.PRECISE_NUMBER) {
      return (com.wi.director.thrift.v1.common.PreciseNumber)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'preciseNumber' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPreciseNumber(com.wi.director.thrift.v1.common.PreciseNumber value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PRECISE_NUMBER;
    value_ = value;
  }

  public String getLink() {
    if (getSetField() == _Fields.LINK) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'link' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLink(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LINK;
    value_ = value;
  }

  public com.wi.director.thrift.v1.common.SelectedListValues getSelectedListValues() {
    if (getSetField() == _Fields.SELECTED_LIST_VALUES) {
      return (com.wi.director.thrift.v1.common.SelectedListValues)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'selectedListValues' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSelectedListValues(com.wi.director.thrift.v1.common.SelectedListValues value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SELECTED_LIST_VALUES;
    value_ = value;
  }

  public String getFile() {
    if (getSetField() == _Fields.FILE) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'file' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFile(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.FILE;
    value_ = value;
  }

  public MeasuredUnitNumber getUnitNumber() {
    if (getSetField() == _Fields.UNIT_NUMBER) {
      return (MeasuredUnitNumber)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'unitNumber' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUnitNumber(MeasuredUnitNumber value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.UNIT_NUMBER;
    value_ = value;
  }

  public boolean isSetText() {
    return setField_ == _Fields.TEXT;
  }


  public boolean isSetNumber() {
    return setField_ == _Fields.NUMBER;
  }


  public boolean isSetOption() {
    return setField_ == _Fields.OPTION;
  }


  public boolean isSetPhoto() {
    return setField_ == _Fields.PHOTO;
  }


  public boolean isSetVideo() {
    return setField_ == _Fields.VIDEO;
  }


  public boolean isSetAudio() {
    return setField_ == _Fields.AUDIO;
  }


  public boolean isSetSignature() {
    return setField_ == _Fields.SIGNATURE;
  }


  public boolean isSetDate() {
    return setField_ == _Fields.DATE;
  }


  public boolean isSetYesNo() {
    return setField_ == _Fields.YES_NO;
  }


  public boolean isSetPreciseNumber() {
    return setField_ == _Fields.PRECISE_NUMBER;
  }


  public boolean isSetLink() {
    return setField_ == _Fields.LINK;
  }


  public boolean isSetSelectedListValues() {
    return setField_ == _Fields.SELECTED_LIST_VALUES;
  }


  public boolean isSetFile() {
    return setField_ == _Fields.FILE;
  }


  public boolean isSetUnitNumber() {
    return setField_ == _Fields.UNIT_NUMBER;
  }


  public boolean equals(Object other) {
    if (other instanceof ExecutionData) {
      return equals((ExecutionData)other);
    } else {
      return false;
    }
  }

  public boolean equals(ExecutionData other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ExecutionData other) {
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
