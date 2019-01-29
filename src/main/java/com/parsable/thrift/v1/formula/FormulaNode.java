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
 * A formula Node is an "Operation Tree" (usually just called OpTree) representation of a formula expression.
 * Valid formulae will have one of these once they are compiled from the list of tokens.  Each node represents
 * a single function call or operator, and the result of the entire expression is obtained by recursively
 * evaluating from the deepest node upwards.
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class FormulaNode implements org.apache.thrift.TBase<FormulaNode, FormulaNode._Fields>, java.io.Serializable, Cloneable, Comparable<FormulaNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FormulaNode");

  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NODE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FUNC_ARGS_FIELD_DESC = new org.apache.thrift.protocol.TField("funcArgs", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FormulaNodeStandardSchemeFactory());
  }

  /**
   * the content of this node - string or reference
   */
  public NodeContent content; // required
  /**
   * the return type of this formula node
   * 
   * @see com.wi.director.thrift.v1.field_data.FieldType
   */
  public com.wi.director.thrift.v1.field_data.FieldType nodeType; // required
  /**
   * if a function node, the parameters/arguments to the function
   */
  public List<FormulaNode> funcArgs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * the content of this node - string or reference
     */
    CONTENT((short)1, "content"),
    /**
     * the return type of this formula node
     * 
     * @see com.wi.director.thrift.v1.field_data.FieldType
     */
    NODE_TYPE((short)2, "nodeType"),
    /**
     * if a function node, the parameters/arguments to the function
     */
    FUNC_ARGS((short)3, "funcArgs");

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
        case 1: // CONTENT
          return CONTENT;
        case 2: // NODE_TYPE
          return NODE_TYPE;
        case 3: // FUNC_ARGS
          return FUNC_ARGS;
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
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NodeContent.class)));
    tmpMap.put(_Fields.NODE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("nodeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.wi.director.thrift.v1.field_data.FieldType.class)));
    tmpMap.put(_Fields.FUNC_ARGS, new org.apache.thrift.meta_data.FieldMetaData("funcArgs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "FormulaNode"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FormulaNode.class, metaDataMap);
  }

  public FormulaNode() {
  }

  public FormulaNode(
    NodeContent content,
    com.wi.director.thrift.v1.field_data.FieldType nodeType,
    List<FormulaNode> funcArgs)
  {
    this();
    this.content = content;
    this.nodeType = nodeType;
    this.funcArgs = funcArgs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FormulaNode(FormulaNode other) {
    if (other.isSetContent()) {
      this.content = new NodeContent(other.content);
    }
    if (other.isSetNodeType()) {
      this.nodeType = other.nodeType;
    }
    if (other.isSetFuncArgs()) {
      List<FormulaNode> __this__funcArgs = new ArrayList<FormulaNode>(other.funcArgs.size());
      for (FormulaNode other_element : other.funcArgs) {
        __this__funcArgs.add(new FormulaNode(other_element));
      }
      this.funcArgs = __this__funcArgs;
    }
  }

  public FormulaNode deepCopy() {
    return new FormulaNode(this);
  }

  @Override
  public void clear() {
    this.content = null;
    this.nodeType = null;
    this.funcArgs = null;
  }

  /**
   * the content of this node - string or reference
   */
  public NodeContent getContent() {
    return this.content;
  }

  /**
   * the content of this node - string or reference
   */
  public FormulaNode setContent(NodeContent content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  /**
   * the return type of this formula node
   * 
   * @see com.wi.director.thrift.v1.field_data.FieldType
   */
  public com.wi.director.thrift.v1.field_data.FieldType getNodeType() {
    return this.nodeType;
  }

  /**
   * the return type of this formula node
   * 
   * @see com.wi.director.thrift.v1.field_data.FieldType
   */
  public FormulaNode setNodeType(com.wi.director.thrift.v1.field_data.FieldType nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  public void unsetNodeType() {
    this.nodeType = null;
  }

  /** Returns true if field nodeType is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeType() {
    return this.nodeType != null;
  }

  public void setNodeTypeIsSet(boolean value) {
    if (!value) {
      this.nodeType = null;
    }
  }

  public int getFuncArgsSize() {
    return (this.funcArgs == null) ? 0 : this.funcArgs.size();
  }

  public java.util.Iterator<FormulaNode> getFuncArgsIterator() {
    return (this.funcArgs == null) ? null : this.funcArgs.iterator();
  }

  public void addToFuncArgs(FormulaNode elem) {
    if (this.funcArgs == null) {
      this.funcArgs = new ArrayList<FormulaNode>();
    }
    this.funcArgs.add(elem);
  }

  /**
   * if a function node, the parameters/arguments to the function
   */
  public List<FormulaNode> getFuncArgs() {
    return this.funcArgs;
  }

  /**
   * if a function node, the parameters/arguments to the function
   */
  public FormulaNode setFuncArgs(List<FormulaNode> funcArgs) {
    this.funcArgs = funcArgs;
    return this;
  }

  public void unsetFuncArgs() {
    this.funcArgs = null;
  }

  /** Returns true if field funcArgs is set (has been assigned a value) and false otherwise */
  public boolean isSetFuncArgs() {
    return this.funcArgs != null;
  }

  public void setFuncArgsIsSet(boolean value) {
    if (!value) {
      this.funcArgs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((NodeContent)value);
      }
      break;

    case NODE_TYPE:
      if (value == null) {
        unsetNodeType();
      } else {
        setNodeType((com.wi.director.thrift.v1.field_data.FieldType)value);
      }
      break;

    case FUNC_ARGS:
      if (value == null) {
        unsetFuncArgs();
      } else {
        setFuncArgs((List<FormulaNode>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTENT:
      return getContent();

    case NODE_TYPE:
      return getNodeType();

    case FUNC_ARGS:
      return getFuncArgs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONTENT:
      return isSetContent();
    case NODE_TYPE:
      return isSetNodeType();
    case FUNC_ARGS:
      return isSetFuncArgs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FormulaNode)
      return this.equals((FormulaNode)that);
    return false;
  }

  public boolean equals(FormulaNode that) {
    if (that == null)
      return false;

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_nodeType = true && this.isSetNodeType();
    boolean that_present_nodeType = true && that.isSetNodeType();
    if (this_present_nodeType || that_present_nodeType) {
      if (!(this_present_nodeType && that_present_nodeType))
        return false;
      if (!this.nodeType.equals(that.nodeType))
        return false;
    }

    boolean this_present_funcArgs = true && this.isSetFuncArgs();
    boolean that_present_funcArgs = true && that.isSetFuncArgs();
    if (this_present_funcArgs || that_present_funcArgs) {
      if (!(this_present_funcArgs && that_present_funcArgs))
        return false;
      if (!this.funcArgs.equals(that.funcArgs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_content = true && (isSetContent());
    list.add(present_content);
    if (present_content)
      list.add(content);

    boolean present_nodeType = true && (isSetNodeType());
    list.add(present_nodeType);
    if (present_nodeType)
      list.add(nodeType.getValue());

    boolean present_funcArgs = true && (isSetFuncArgs());
    list.add(present_funcArgs);
    if (present_funcArgs)
      list.add(funcArgs);

    return list.hashCode();
  }

  @Override
  public int compareTo(FormulaNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeType()).compareTo(other.isSetNodeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeType, other.nodeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFuncArgs()).compareTo(other.isSetFuncArgs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFuncArgs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.funcArgs, other.funcArgs);
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
    StringBuilder sb = new StringBuilder("FormulaNode(");
    boolean first = true;

    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodeType:");
    if (this.nodeType == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("funcArgs:");
    if (this.funcArgs == null) {
      sb.append("null");
    } else {
      sb.append(this.funcArgs);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FormulaNodeStandardSchemeFactory implements SchemeFactory {
    public FormulaNodeStandardScheme getScheme() {
      return new FormulaNodeStandardScheme();
    }
  }

  private static class FormulaNodeStandardScheme extends StandardScheme<FormulaNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FormulaNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.content = new NodeContent();
              struct.content.read(iprot);
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NODE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nodeType = com.wi.director.thrift.v1.field_data.FieldType.findByValue(iprot.readI32());
              struct.setNodeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FUNC_ARGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.funcArgs = new ArrayList<FormulaNode>(_list8.size);
                FormulaNode _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new FormulaNode();
                  _elem9.read(iprot);
                  struct.funcArgs.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setFuncArgsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FormulaNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        struct.content.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.nodeType != null) {
        oprot.writeFieldBegin(NODE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.nodeType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.funcArgs != null) {
        oprot.writeFieldBegin(FUNC_ARGS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.funcArgs.size()));
          for (FormulaNode _iter11 : struct.funcArgs)
          {
            _iter11.write(oprot);
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

