/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.formula;

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
 * A formula token is something that can be entered or selected by a user and appear in a formula
 * input box.
 */
public class FormulaToken extends org.apache.thrift.TUnion<FormulaToken, FormulaToken._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FormulaToken");
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("num", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STR_FIELD_DESC = new org.apache.thrift.protocol.TField("str", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField REF_FIELD_DESC = new org.apache.thrift.protocol.TField("ref", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField SYM_FIELD_DESC = new org.apache.thrift.protocol.TField("sym", org.apache.thrift.protocol.TType.STRING, (short)5);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see OpName
     */
    OP((short)1, "op"),
    NUM((short)2, "num"),
    STR((short)3, "str"),
    REF((short)4, "ref"),
    SYM((short)5, "sym");

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
        case 1: // OP
          return OP;
        case 2: // NUM
          return NUM;
        case 3: // STR
          return STR;
        case 4: // REF
          return REF;
        case 5: // SYM
          return SYM;
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
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, OpName.class)));
    tmpMap.put(_Fields.NUM, new org.apache.thrift.meta_data.FieldMetaData("num", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "NumberToken")));
    tmpMap.put(_Fields.STR, new org.apache.thrift.meta_data.FieldMetaData("str", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "StringToken")));
    tmpMap.put(_Fields.REF, new org.apache.thrift.meta_data.FieldMetaData("ref", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FieldReference.class)));
    tmpMap.put(_Fields.SYM, new org.apache.thrift.meta_data.FieldMetaData("sym", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Symbol")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FormulaToken.class, metaDataMap);
  }

  public FormulaToken() {
    super();
  }

  public FormulaToken(_Fields setField, Object value) {
    super(setField, value);
  }

  public FormulaToken(FormulaToken other) {
    super(other);
  }
  public FormulaToken deepCopy() {
    return new FormulaToken(this);
  }

  public static FormulaToken op(OpName value) {
    FormulaToken x = new FormulaToken();
    x.setOp(value);
    return x;
  }

  public static FormulaToken num(String value) {
    FormulaToken x = new FormulaToken();
    x.setNum(value);
    return x;
  }

  public static FormulaToken str(String value) {
    FormulaToken x = new FormulaToken();
    x.setStr(value);
    return x;
  }

  public static FormulaToken ref(FieldReference value) {
    FormulaToken x = new FormulaToken();
    x.setRef(value);
    return x;
  }

  public static FormulaToken sym(String value) {
    FormulaToken x = new FormulaToken();
    x.setSym(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case OP:
        if (value instanceof OpName) {
          break;
        }
        throw new ClassCastException("Was expecting value of type OpName for field 'op', but got " + value.getClass().getSimpleName());
      case NUM:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'num', but got " + value.getClass().getSimpleName());
      case STR:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'str', but got " + value.getClass().getSimpleName());
      case REF:
        if (value instanceof FieldReference) {
          break;
        }
        throw new ClassCastException("Was expecting value of type FieldReference for field 'ref', but got " + value.getClass().getSimpleName());
      case SYM:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'sym', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case OP:
          if (field.type == OP_FIELD_DESC.type) {
            OpName op;
            op = com.parsable.thrift.v1.formula.OpName.findByValue(iprot.readI32());
            return op;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NUM:
          if (field.type == NUM_FIELD_DESC.type) {
            String num;
            num = iprot.readString();
            return num;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STR:
          if (field.type == STR_FIELD_DESC.type) {
            String str;
            str = iprot.readString();
            return str;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case REF:
          if (field.type == REF_FIELD_DESC.type) {
            FieldReference ref;
            ref = new FieldReference();
            ref.read(iprot);
            return ref;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SYM:
          if (field.type == SYM_FIELD_DESC.type) {
            String sym;
            sym = iprot.readString();
            return sym;
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
      case OP:
        OpName op = (OpName)value_;
        oprot.writeI32(op.getValue());
        return;
      case NUM:
        String num = (String)value_;
        oprot.writeString(num);
        return;
      case STR:
        String str = (String)value_;
        oprot.writeString(str);
        return;
      case REF:
        FieldReference ref = (FieldReference)value_;
        ref.write(oprot);
        return;
      case SYM:
        String sym = (String)value_;
        oprot.writeString(sym);
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
        case OP:
          OpName op;
          op = com.parsable.thrift.v1.formula.OpName.findByValue(iprot.readI32());
          return op;
        case NUM:
          String num;
          num = iprot.readString();
          return num;
        case STR:
          String str;
          str = iprot.readString();
          return str;
        case REF:
          FieldReference ref;
          ref = new FieldReference();
          ref.read(iprot);
          return ref;
        case SYM:
          String sym;
          sym = iprot.readString();
          return sym;
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
      case OP:
        OpName op = (OpName)value_;
        oprot.writeI32(op.getValue());
        return;
      case NUM:
        String num = (String)value_;
        oprot.writeString(num);
        return;
      case STR:
        String str = (String)value_;
        oprot.writeString(str);
        return;
      case REF:
        FieldReference ref = (FieldReference)value_;
        ref.write(oprot);
        return;
      case SYM:
        String sym = (String)value_;
        oprot.writeString(sym);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case OP:
        return OP_FIELD_DESC;
      case NUM:
        return NUM_FIELD_DESC;
      case STR:
        return STR_FIELD_DESC;
      case REF:
        return REF_FIELD_DESC;
      case SYM:
        return SYM_FIELD_DESC;
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


  /**
   * 
   * @see OpName
   */
  public OpName getOp() {
    if (getSetField() == _Fields.OP) {
      return (OpName)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'op' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * 
   * @see OpName
   */
  public void setOp(OpName value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.OP;
    value_ = value;
  }

  public String getNum() {
    if (getSetField() == _Fields.NUM) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'num' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNum(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.NUM;
    value_ = value;
  }

  public String getStr() {
    if (getSetField() == _Fields.STR) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'str' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStr(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STR;
    value_ = value;
  }

  public FieldReference getRef() {
    if (getSetField() == _Fields.REF) {
      return (FieldReference)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'ref' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRef(FieldReference value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.REF;
    value_ = value;
  }

  public String getSym() {
    if (getSetField() == _Fields.SYM) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'sym' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSym(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SYM;
    value_ = value;
  }

  public boolean isSetOp() {
    return setField_ == _Fields.OP;
  }


  public boolean isSetNum() {
    return setField_ == _Fields.NUM;
  }


  public boolean isSetStr() {
    return setField_ == _Fields.STR;
  }


  public boolean isSetRef() {
    return setField_ == _Fields.REF;
  }


  public boolean isSetSym() {
    return setField_ == _Fields.SYM;
  }


  public boolean equals(Object other) {
    if (other instanceof FormulaToken) {
      return equals((FormulaToken)other);
    } else {
      return false;
    }
  }

  public boolean equals(FormulaToken other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(FormulaToken other) {
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