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
 * A Formula is the container structure for a formula on a field.  You create a formula by sending a list of
 * tokens and attaching it.  The response will have expr set if valid, and error set if not valid.
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class Formula implements org.apache.thrift.TBase<Formula, Formula._Fields>, java.io.Serializable, Cloneable, Comparable<Formula> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Formula");

  private static final org.apache.thrift.protocol.TField FORMULA_TOKENS_FIELD_DESC = new org.apache.thrift.protocol.TField("formulaTokens", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EXPR_FIELD_DESC = new org.apache.thrift.protocol.TField("expr", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FormulaStandardSchemeFactory());
  }

  public List<FormulaToken> formulaTokens; // required
  public FormulaNode expr; // optional
  public FormulaError error; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FORMULA_TOKENS((short)1, "formulaTokens"),
    EXPR((short)2, "expr"),
    ERROR((short)3, "error");

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
        case 1: // FORMULA_TOKENS
          return FORMULA_TOKENS;
        case 2: // EXPR
          return EXPR;
        case 3: // ERROR
          return ERROR;
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
  private static final _Fields optionals[] = {_Fields.EXPR,_Fields.ERROR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FORMULA_TOKENS, new org.apache.thrift.meta_data.FieldMetaData("formulaTokens", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FormulaToken.class))));
    tmpMap.put(_Fields.EXPR, new org.apache.thrift.meta_data.FieldMetaData("expr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FormulaNode.class)));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FormulaError.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Formula.class, metaDataMap);
  }

  public Formula() {
  }

  public Formula(
    List<FormulaToken> formulaTokens)
  {
    this();
    this.formulaTokens = formulaTokens;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Formula(Formula other) {
    if (other.isSetFormulaTokens()) {
      List<FormulaToken> __this__formulaTokens = new ArrayList<FormulaToken>(other.formulaTokens.size());
      for (FormulaToken other_element : other.formulaTokens) {
        __this__formulaTokens.add(new FormulaToken(other_element));
      }
      this.formulaTokens = __this__formulaTokens;
    }
    if (other.isSetExpr()) {
      this.expr = new FormulaNode(other.expr);
    }
    if (other.isSetError()) {
      this.error = new FormulaError(other.error);
    }
  }

  public Formula deepCopy() {
    return new Formula(this);
  }

  @Override
  public void clear() {
    this.formulaTokens = null;
    this.expr = null;
    this.error = null;
  }

  public int getFormulaTokensSize() {
    return (this.formulaTokens == null) ? 0 : this.formulaTokens.size();
  }

  public java.util.Iterator<FormulaToken> getFormulaTokensIterator() {
    return (this.formulaTokens == null) ? null : this.formulaTokens.iterator();
  }

  public void addToFormulaTokens(FormulaToken elem) {
    if (this.formulaTokens == null) {
      this.formulaTokens = new ArrayList<FormulaToken>();
    }
    this.formulaTokens.add(elem);
  }

  public List<FormulaToken> getFormulaTokens() {
    return this.formulaTokens;
  }

  public Formula setFormulaTokens(List<FormulaToken> formulaTokens) {
    this.formulaTokens = formulaTokens;
    return this;
  }

  public void unsetFormulaTokens() {
    this.formulaTokens = null;
  }

  /** Returns true if field formulaTokens is set (has been assigned a value) and false otherwise */
  public boolean isSetFormulaTokens() {
    return this.formulaTokens != null;
  }

  public void setFormulaTokensIsSet(boolean value) {
    if (!value) {
      this.formulaTokens = null;
    }
  }

  public FormulaNode getExpr() {
    return this.expr;
  }

  public Formula setExpr(FormulaNode expr) {
    this.expr = expr;
    return this;
  }

  public void unsetExpr() {
    this.expr = null;
  }

  /** Returns true if field expr is set (has been assigned a value) and false otherwise */
  public boolean isSetExpr() {
    return this.expr != null;
  }

  public void setExprIsSet(boolean value) {
    if (!value) {
      this.expr = null;
    }
  }

  public FormulaError getError() {
    return this.error;
  }

  public Formula setError(FormulaError error) {
    this.error = error;
    return this;
  }

  public void unsetError() {
    this.error = null;
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return this.error != null;
  }

  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FORMULA_TOKENS:
      if (value == null) {
        unsetFormulaTokens();
      } else {
        setFormulaTokens((List<FormulaToken>)value);
      }
      break;

    case EXPR:
      if (value == null) {
        unsetExpr();
      } else {
        setExpr((FormulaNode)value);
      }
      break;

    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((FormulaError)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FORMULA_TOKENS:
      return getFormulaTokens();

    case EXPR:
      return getExpr();

    case ERROR:
      return getError();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FORMULA_TOKENS:
      return isSetFormulaTokens();
    case EXPR:
      return isSetExpr();
    case ERROR:
      return isSetError();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Formula)
      return this.equals((Formula)that);
    return false;
  }

  public boolean equals(Formula that) {
    if (that == null)
      return false;

    boolean this_present_formulaTokens = true && this.isSetFormulaTokens();
    boolean that_present_formulaTokens = true && that.isSetFormulaTokens();
    if (this_present_formulaTokens || that_present_formulaTokens) {
      if (!(this_present_formulaTokens && that_present_formulaTokens))
        return false;
      if (!this.formulaTokens.equals(that.formulaTokens))
        return false;
    }

    boolean this_present_expr = true && this.isSetExpr();
    boolean that_present_expr = true && that.isSetExpr();
    if (this_present_expr || that_present_expr) {
      if (!(this_present_expr && that_present_expr))
        return false;
      if (!this.expr.equals(that.expr))
        return false;
    }

    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_formulaTokens = true && (isSetFormulaTokens());
    list.add(present_formulaTokens);
    if (present_formulaTokens)
      list.add(formulaTokens);

    boolean present_expr = true && (isSetExpr());
    list.add(present_expr);
    if (present_expr)
      list.add(expr);

    boolean present_error = true && (isSetError());
    list.add(present_error);
    if (present_error)
      list.add(error);

    return list.hashCode();
  }

  @Override
  public int compareTo(Formula other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFormulaTokens()).compareTo(other.isSetFormulaTokens());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFormulaTokens()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.formulaTokens, other.formulaTokens);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpr()).compareTo(other.isSetExpr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expr, other.expr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError()).compareTo(other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
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
    StringBuilder sb = new StringBuilder("Formula(");
    boolean first = true;

    sb.append("formulaTokens:");
    if (this.formulaTokens == null) {
      sb.append("null");
    } else {
      sb.append(this.formulaTokens);
    }
    first = false;
    if (isSetExpr()) {
      if (!first) sb.append(", ");
      sb.append("expr:");
      if (this.expr == null) {
        sb.append("null");
      } else {
        sb.append(this.expr);
      }
      first = false;
    }
    if (isSetError()) {
      if (!first) sb.append(", ");
      sb.append("error:");
      if (this.error == null) {
        sb.append("null");
      } else {
        sb.append(this.error);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (expr != null) {
      expr.validate();
    }
    if (error != null) {
      error.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FormulaStandardSchemeFactory implements SchemeFactory {
    public FormulaStandardScheme getScheme() {
      return new FormulaStandardScheme();
    }
  }

  private static class FormulaStandardScheme extends StandardScheme<Formula> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Formula struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FORMULA_TOKENS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list12 = iprot.readListBegin();
                struct.formulaTokens = new ArrayList<FormulaToken>(_list12.size);
                FormulaToken _elem13;
                for (int _i14 = 0; _i14 < _list12.size; ++_i14)
                {
                  _elem13 = new FormulaToken();
                  _elem13.read(iprot);
                  struct.formulaTokens.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setFormulaTokensIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXPR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.expr = new FormulaNode();
              struct.expr.read(iprot);
              struct.setExprIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.error = new FormulaError();
              struct.error.read(iprot);
              struct.setErrorIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Formula struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.formulaTokens != null) {
        oprot.writeFieldBegin(FORMULA_TOKENS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.formulaTokens.size()));
          for (FormulaToken _iter15 : struct.formulaTokens)
          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.expr != null) {
        if (struct.isSetExpr()) {
          oprot.writeFieldBegin(EXPR_FIELD_DESC);
          struct.expr.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.error != null) {
        if (struct.isSetError()) {
          oprot.writeFieldBegin(ERROR_FIELD_DESC);
          struct.error.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

