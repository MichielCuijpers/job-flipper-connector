/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.analytics;

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
public class DashFilter implements org.apache.thrift.TBase<DashFilter, DashFilter._Fields>, java.io.Serializable, Cloneable, Comparable<DashFilter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DashFilter");

  private static final org.apache.thrift.protocol.TField WHAT_FIELD_DESC = new org.apache.thrift.protocol.TField("what", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ARG_FIELD_DESC = new org.apache.thrift.protocol.TField("arg", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DashFilterStandardSchemeFactory());
  }

  public DashFilterKey what; // required
  /**
   * 
   * @see FilterOp
   */
  public FilterOp op; // required
  public FilterArg arg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WHAT((short)1, "what"),
    /**
     * 
     * @see FilterOp
     */
    OP((short)2, "op"),
    ARG((short)3, "arg");

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
        case 1: // WHAT
          return WHAT;
        case 2: // OP
          return OP;
        case 3: // ARG
          return ARG;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WHAT, new org.apache.thrift.meta_data.FieldMetaData("what", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DashFilterKey.class)));
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FilterOp.class)));
    tmpMap.put(_Fields.ARG, new org.apache.thrift.meta_data.FieldMetaData("arg", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FilterArg.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DashFilter.class, metaDataMap);
  }

  public DashFilter() {
  }

  public DashFilter(
    DashFilterKey what,
    FilterOp op,
    FilterArg arg)
  {
    this();
    this.what = what;
    this.op = op;
    this.arg = arg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DashFilter(DashFilter other) {
    if (other.isSetWhat()) {
      this.what = new DashFilterKey(other.what);
    }
    if (other.isSetOp()) {
      this.op = other.op;
    }
    if (other.isSetArg()) {
      this.arg = new FilterArg(other.arg);
    }
  }

  public DashFilter deepCopy() {
    return new DashFilter(this);
  }

  @Override
  public void clear() {
    this.what = null;
    this.op = null;
    this.arg = null;
  }

  public DashFilterKey getWhat() {
    return this.what;
  }

  public DashFilter setWhat(DashFilterKey what) {
    this.what = what;
    return this;
  }

  public void unsetWhat() {
    this.what = null;
  }

  /** Returns true if field what is set (has been assigned a value) and false otherwise */
  public boolean isSetWhat() {
    return this.what != null;
  }

  public void setWhatIsSet(boolean value) {
    if (!value) {
      this.what = null;
    }
  }

  /**
   * 
   * @see FilterOp
   */
  public FilterOp getOp() {
    return this.op;
  }

  /**
   * 
   * @see FilterOp
   */
  public DashFilter setOp(FilterOp op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  /** Returns true if field op is set (has been assigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }

  public FilterArg getArg() {
    return this.arg;
  }

  public DashFilter setArg(FilterArg arg) {
    this.arg = arg;
    return this;
  }

  public void unsetArg() {
    this.arg = null;
  }

  /** Returns true if field arg is set (has been assigned a value) and false otherwise */
  public boolean isSetArg() {
    return this.arg != null;
  }

  public void setArgIsSet(boolean value) {
    if (!value) {
      this.arg = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WHAT:
      if (value == null) {
        unsetWhat();
      } else {
        setWhat((DashFilterKey)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((FilterOp)value);
      }
      break;

    case ARG:
      if (value == null) {
        unsetArg();
      } else {
        setArg((FilterArg)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WHAT:
      return getWhat();

    case OP:
      return getOp();

    case ARG:
      return getArg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WHAT:
      return isSetWhat();
    case OP:
      return isSetOp();
    case ARG:
      return isSetArg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DashFilter)
      return this.equals((DashFilter)that);
    return false;
  }

  public boolean equals(DashFilter that) {
    if (that == null)
      return false;

    boolean this_present_what = true && this.isSetWhat();
    boolean that_present_what = true && that.isSetWhat();
    if (this_present_what || that_present_what) {
      if (!(this_present_what && that_present_what))
        return false;
      if (!this.what.equals(that.what))
        return false;
    }

    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }

    boolean this_present_arg = true && this.isSetArg();
    boolean that_present_arg = true && that.isSetArg();
    if (this_present_arg || that_present_arg) {
      if (!(this_present_arg && that_present_arg))
        return false;
      if (!this.arg.equals(that.arg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_what = true && (isSetWhat());
    list.add(present_what);
    if (present_what)
      list.add(what);

    boolean present_op = true && (isSetOp());
    list.add(present_op);
    if (present_op)
      list.add(op.getValue());

    boolean present_arg = true && (isSetArg());
    list.add(present_arg);
    if (present_arg)
      list.add(arg);

    return list.hashCode();
  }

  @Override
  public int compareTo(DashFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWhat()).compareTo(other.isSetWhat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.what, other.what);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op, other.op);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArg()).compareTo(other.isSetArg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arg, other.arg);
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
    StringBuilder sb = new StringBuilder("DashFilter(");
    boolean first = true;

    sb.append("what:");
    if (this.what == null) {
      sb.append("null");
    } else {
      sb.append(this.what);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("op:");
    if (this.op == null) {
      sb.append("null");
    } else {
      sb.append(this.op);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("arg:");
    if (this.arg == null) {
      sb.append("null");
    } else {
      sb.append(this.arg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (what == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'what' was not present! Struct: " + toString());
    }
    if (op == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'op' was not present! Struct: " + toString());
    }
    if (arg == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'arg' was not present! Struct: " + toString());
    }
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

  private static class DashFilterStandardSchemeFactory implements SchemeFactory {
    public DashFilterStandardScheme getScheme() {
      return new DashFilterStandardScheme();
    }
  }

  private static class DashFilterStandardScheme extends StandardScheme<DashFilter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DashFilter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WHAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.what = new DashFilterKey();
              struct.what.read(iprot);
              struct.setWhatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.op = com.parsable.thrift.v1.analytics.FilterOp.findByValue(iprot.readI32());
              struct.setOpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.arg = new FilterArg();
              struct.arg.read(iprot);
              struct.setArgIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DashFilter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.what != null) {
        oprot.writeFieldBegin(WHAT_FIELD_DESC);
        struct.what.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.op != null) {
        oprot.writeFieldBegin(OP_FIELD_DESC);
        oprot.writeI32(struct.op.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.arg != null) {
        oprot.writeFieldBegin(ARG_FIELD_DESC);
        struct.arg.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

