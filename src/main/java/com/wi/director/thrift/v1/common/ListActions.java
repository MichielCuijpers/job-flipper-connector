/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.common;

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
public class ListActions extends org.apache.thrift.TUnion<ListActions, ListActions._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ListActions");
  private static final org.apache.thrift.protocol.TField ADD_FIELD_DESC = new org.apache.thrift.protocol.TField("add", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField REMOVE_FIELD_DESC = new org.apache.thrift.protocol.TField("remove", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MOVE_FIELD_DESC = new org.apache.thrift.protocol.TField("move", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField EDIT_FIELD_DESC = new org.apache.thrift.protocol.TField("edit", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADD((short)1, "add"),
    REMOVE((short)2, "remove"),
    MOVE((short)3, "move"),
    EDIT((short)4, "edit");

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
        case 1: // ADD
          return ADD;
        case 2: // REMOVE
          return REMOVE;
        case 3: // MOVE
          return MOVE;
        case 4: // EDIT
          return EDIT;
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
    tmpMap.put(_Fields.ADD, new org.apache.thrift.meta_data.FieldMetaData("add", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AddAction.class)));
    tmpMap.put(_Fields.REMOVE, new org.apache.thrift.meta_data.FieldMetaData("remove", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RemoveAction.class)));
    tmpMap.put(_Fields.MOVE, new org.apache.thrift.meta_data.FieldMetaData("move", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MoveAction.class)));
    tmpMap.put(_Fields.EDIT, new org.apache.thrift.meta_data.FieldMetaData("edit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EditAction.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ListActions.class, metaDataMap);
  }

  public ListActions() {
    super();
  }

  public ListActions(_Fields setField, Object value) {
    super(setField, value);
  }

  public ListActions(ListActions other) {
    super(other);
  }
  public ListActions deepCopy() {
    return new ListActions(this);
  }

  public static ListActions add(AddAction value) {
    ListActions x = new ListActions();
    x.setAdd(value);
    return x;
  }

  public static ListActions remove(RemoveAction value) {
    ListActions x = new ListActions();
    x.setRemove(value);
    return x;
  }

  public static ListActions move(MoveAction value) {
    ListActions x = new ListActions();
    x.setMove(value);
    return x;
  }

  public static ListActions edit(EditAction value) {
    ListActions x = new ListActions();
    x.setEdit(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case ADD:
        if (value instanceof AddAction) {
          break;
        }
        throw new ClassCastException("Was expecting value of type AddAction for field 'add', but got " + value.getClass().getSimpleName());
      case REMOVE:
        if (value instanceof RemoveAction) {
          break;
        }
        throw new ClassCastException("Was expecting value of type RemoveAction for field 'remove', but got " + value.getClass().getSimpleName());
      case MOVE:
        if (value instanceof MoveAction) {
          break;
        }
        throw new ClassCastException("Was expecting value of type MoveAction for field 'move', but got " + value.getClass().getSimpleName());
      case EDIT:
        if (value instanceof EditAction) {
          break;
        }
        throw new ClassCastException("Was expecting value of type EditAction for field 'edit', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case ADD:
          if (field.type == ADD_FIELD_DESC.type) {
            AddAction add;
            add = new AddAction();
            add.read(iprot);
            return add;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case REMOVE:
          if (field.type == REMOVE_FIELD_DESC.type) {
            RemoveAction remove;
            remove = new RemoveAction();
            remove.read(iprot);
            return remove;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MOVE:
          if (field.type == MOVE_FIELD_DESC.type) {
            MoveAction move;
            move = new MoveAction();
            move.read(iprot);
            return move;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case EDIT:
          if (field.type == EDIT_FIELD_DESC.type) {
            EditAction edit;
            edit = new EditAction();
            edit.read(iprot);
            return edit;
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
      case ADD:
        AddAction add = (AddAction)value_;
        add.write(oprot);
        return;
      case REMOVE:
        RemoveAction remove = (RemoveAction)value_;
        remove.write(oprot);
        return;
      case MOVE:
        MoveAction move = (MoveAction)value_;
        move.write(oprot);
        return;
      case EDIT:
        EditAction edit = (EditAction)value_;
        edit.write(oprot);
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
        case ADD:
          AddAction add;
          add = new AddAction();
          add.read(iprot);
          return add;
        case REMOVE:
          RemoveAction remove;
          remove = new RemoveAction();
          remove.read(iprot);
          return remove;
        case MOVE:
          MoveAction move;
          move = new MoveAction();
          move.read(iprot);
          return move;
        case EDIT:
          EditAction edit;
          edit = new EditAction();
          edit.read(iprot);
          return edit;
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
      case ADD:
        AddAction add = (AddAction)value_;
        add.write(oprot);
        return;
      case REMOVE:
        RemoveAction remove = (RemoveAction)value_;
        remove.write(oprot);
        return;
      case MOVE:
        MoveAction move = (MoveAction)value_;
        move.write(oprot);
        return;
      case EDIT:
        EditAction edit = (EditAction)value_;
        edit.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case ADD:
        return ADD_FIELD_DESC;
      case REMOVE:
        return REMOVE_FIELD_DESC;
      case MOVE:
        return MOVE_FIELD_DESC;
      case EDIT:
        return EDIT_FIELD_DESC;
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


  public AddAction getAdd() {
    if (getSetField() == _Fields.ADD) {
      return (AddAction)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'add' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setAdd(AddAction value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.ADD;
    value_ = value;
  }

  public RemoveAction getRemove() {
    if (getSetField() == _Fields.REMOVE) {
      return (RemoveAction)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'remove' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRemove(RemoveAction value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.REMOVE;
    value_ = value;
  }

  public MoveAction getMove() {
    if (getSetField() == _Fields.MOVE) {
      return (MoveAction)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'move' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMove(MoveAction value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.MOVE;
    value_ = value;
  }

  public EditAction getEdit() {
    if (getSetField() == _Fields.EDIT) {
      return (EditAction)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'edit' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setEdit(EditAction value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.EDIT;
    value_ = value;
  }

  public boolean isSetAdd() {
    return setField_ == _Fields.ADD;
  }


  public boolean isSetRemove() {
    return setField_ == _Fields.REMOVE;
  }


  public boolean isSetMove() {
    return setField_ == _Fields.MOVE;
  }


  public boolean isSetEdit() {
    return setField_ == _Fields.EDIT;
  }


  public boolean equals(Object other) {
    if (other instanceof ListActions) {
      return equals((ListActions)other);
    } else {
      return false;
    }
  }

  public boolean equals(ListActions other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ListActions other) {
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
