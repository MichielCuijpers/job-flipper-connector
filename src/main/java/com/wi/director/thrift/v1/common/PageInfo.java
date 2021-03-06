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
/**
 * This data structure is included in the result for endpoints which
 *  support pagination or streaming of results.<br /><br/>
 * 
 * To facilitate efficient paging around the results with the fewest
 * possible API calls, it is appropriate to cache the <tt>pageToken</tt>
 * values by merging into a client-side map, but the items in the map
 * should be invalidated in the following situations:
 * 
 * <ul>
 *  <li>when paging backwards, if any token mismatches the previously
 *  held token for that page number, all following cached tokens should be
 *  discarded.</li>
 * <li>When changing the query terms or sort order, all tokens should be
 *  discarded.</li>
 * </ul>
 * 
 * This behavior can be approximated by always discarding any old tokens
 * with a higher page number than the highest page number in the
 * <tt>pageTokens</tt> map, and then merging in.
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class PageInfo implements org.apache.thrift.TBase<PageInfo, PageInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PageInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PageInfo");

  private static final org.apache.thrift.protocol.TField NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("num", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LEFT_FIELD_DESC = new org.apache.thrift.protocol.TField("left", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PAGE_TOKENS_FIELD_DESC = new org.apache.thrift.protocol.TField("pageTokens", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PageInfoStandardSchemeFactory());
  }

  /**
   * The current page's number.  The first page is page 1.
   */
  public int num; // required
  /**
   * The number of pages left.  If the <tt>count</tt> parameter was set
   * to <tt>false</tt> to the query, then this can be less than the
   * number of pages remaining, but it will always be non-zero if there
   * are more pages of data.
   */
  public int left; // required
  /**
   * Page tokens for nearby pages.  The keys of this map are the page
   * numbers, and the value is an opaque printable character string
   * which can be passed as the <tt>pageToken</tt> field in
   * <tt>PageReq</tt> to request that page.
   */
  public Map<Integer,String> pageTokens; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The current page's number.  The first page is page 1.
     */
    NUM((short)1, "num"),
    /**
     * The number of pages left.  If the <tt>count</tt> parameter was set
     * to <tt>false</tt> to the query, then this can be less than the
     * number of pages remaining, but it will always be non-zero if there
     * are more pages of data.
     */
    LEFT((short)2, "left"),
    /**
     * Page tokens for nearby pages.  The keys of this map are the page
     * numbers, and the value is an opaque printable character string
     * which can be passed as the <tt>pageToken</tt> field in
     * <tt>PageReq</tt> to request that page.
     */
    PAGE_TOKENS((short)3, "pageTokens");

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
        case 1: // NUM
          return NUM;
        case 2: // LEFT
          return LEFT;
        case 3: // PAGE_TOKENS
          return PAGE_TOKENS;
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
  private static final int __NUM_ISSET_ID = 0;
  private static final int __LEFT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM, new org.apache.thrift.meta_data.FieldMetaData("num", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LEFT, new org.apache.thrift.meta_data.FieldMetaData("left", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_TOKENS, new org.apache.thrift.meta_data.FieldMetaData("pageTokens", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PageInfo.class, metaDataMap);
  }

  public PageInfo() {
  }

  public PageInfo(
    int num,
    int left,
    Map<Integer,String> pageTokens)
  {
    this();
    this.num = num;
    setNumIsSet(true);
    this.left = left;
    setLeftIsSet(true);
    this.pageTokens = pageTokens;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PageInfo(PageInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num = other.num;
    this.left = other.left;
    if (other.isSetPageTokens()) {
      Map<Integer,String> __this__pageTokens = new HashMap<Integer,String>(other.pageTokens);
      this.pageTokens = __this__pageTokens;
    }
  }

  public PageInfo deepCopy() {
    return new PageInfo(this);
  }

  @Override
  public void clear() {
    setNumIsSet(false);
    this.num = 0;
    setLeftIsSet(false);
    this.left = 0;
    this.pageTokens = null;
  }

  /**
   * The current page's number.  The first page is page 1.
   */
  public int getNum() {
    return this.num;
  }

  /**
   * The current page's number.  The first page is page 1.
   */
  public PageInfo setNum(int num) {
    this.num = num;
    setNumIsSet(true);
    return this;
  }

  public void unsetNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  /** Returns true if field num is set (has been assigned a value) and false otherwise */
  public boolean isSetNum() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  public void setNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_ISSET_ID, value);
  }

  /**
   * The number of pages left.  If the <tt>count</tt> parameter was set
   * to <tt>false</tt> to the query, then this can be less than the
   * number of pages remaining, but it will always be non-zero if there
   * are more pages of data.
   */
  public int getLeft() {
    return this.left;
  }

  /**
   * The number of pages left.  If the <tt>count</tt> parameter was set
   * to <tt>false</tt> to the query, then this can be less than the
   * number of pages remaining, but it will always be non-zero if there
   * are more pages of data.
   */
  public PageInfo setLeft(int left) {
    this.left = left;
    setLeftIsSet(true);
    return this;
  }

  public void unsetLeft() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEFT_ISSET_ID);
  }

  /** Returns true if field left is set (has been assigned a value) and false otherwise */
  public boolean isSetLeft() {
    return EncodingUtils.testBit(__isset_bitfield, __LEFT_ISSET_ID);
  }

  public void setLeftIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEFT_ISSET_ID, value);
  }

  public int getPageTokensSize() {
    return (this.pageTokens == null) ? 0 : this.pageTokens.size();
  }

  public void putToPageTokens(int key, String val) {
    if (this.pageTokens == null) {
      this.pageTokens = new HashMap<Integer,String>();
    }
    this.pageTokens.put(key, val);
  }

  /**
   * Page tokens for nearby pages.  The keys of this map are the page
   * numbers, and the value is an opaque printable character string
   * which can be passed as the <tt>pageToken</tt> field in
   * <tt>PageReq</tt> to request that page.
   */
  public Map<Integer,String> getPageTokens() {
    return this.pageTokens;
  }

  /**
   * Page tokens for nearby pages.  The keys of this map are the page
   * numbers, and the value is an opaque printable character string
   * which can be passed as the <tt>pageToken</tt> field in
   * <tt>PageReq</tt> to request that page.
   */
  public PageInfo setPageTokens(Map<Integer,String> pageTokens) {
    this.pageTokens = pageTokens;
    return this;
  }

  public void unsetPageTokens() {
    this.pageTokens = null;
  }

  /** Returns true if field pageTokens is set (has been assigned a value) and false otherwise */
  public boolean isSetPageTokens() {
    return this.pageTokens != null;
  }

  public void setPageTokensIsSet(boolean value) {
    if (!value) {
      this.pageTokens = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM:
      if (value == null) {
        unsetNum();
      } else {
        setNum((Integer)value);
      }
      break;

    case LEFT:
      if (value == null) {
        unsetLeft();
      } else {
        setLeft((Integer)value);
      }
      break;

    case PAGE_TOKENS:
      if (value == null) {
        unsetPageTokens();
      } else {
        setPageTokens((Map<Integer,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM:
      return getNum();

    case LEFT:
      return getLeft();

    case PAGE_TOKENS:
      return getPageTokens();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM:
      return isSetNum();
    case LEFT:
      return isSetLeft();
    case PAGE_TOKENS:
      return isSetPageTokens();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PageInfo)
      return this.equals((PageInfo)that);
    return false;
  }

  public boolean equals(PageInfo that) {
    if (that == null)
      return false;

    boolean this_present_num = true;
    boolean that_present_num = true;
    if (this_present_num || that_present_num) {
      if (!(this_present_num && that_present_num))
        return false;
      if (this.num != that.num)
        return false;
    }

    boolean this_present_left = true;
    boolean that_present_left = true;
    if (this_present_left || that_present_left) {
      if (!(this_present_left && that_present_left))
        return false;
      if (this.left != that.left)
        return false;
    }

    boolean this_present_pageTokens = true && this.isSetPageTokens();
    boolean that_present_pageTokens = true && that.isSetPageTokens();
    if (this_present_pageTokens || that_present_pageTokens) {
      if (!(this_present_pageTokens && that_present_pageTokens))
        return false;
      if (!this.pageTokens.equals(that.pageTokens))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_num = true;
    list.add(present_num);
    if (present_num)
      list.add(num);

    boolean present_left = true;
    list.add(present_left);
    if (present_left)
      list.add(left);

    boolean present_pageTokens = true && (isSetPageTokens());
    list.add(present_pageTokens);
    if (present_pageTokens)
      list.add(pageTokens);

    return list.hashCode();
  }

  @Override
  public int compareTo(PageInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNum()).compareTo(other.isSetNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num, other.num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLeft()).compareTo(other.isSetLeft());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeft()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.left, other.left);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPageTokens()).compareTo(other.isSetPageTokens());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageTokens()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageTokens, other.pageTokens);
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
    StringBuilder sb = new StringBuilder("PageInfo(");
    boolean first = true;

    sb.append("num:");
    sb.append(this.num);
    first = false;
    if (!first) sb.append(", ");
    sb.append("left:");
    sb.append(this.left);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pageTokens:");
    if (this.pageTokens == null) {
      sb.append("null");
    } else {
      sb.append(this.pageTokens);
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

  private static class PageInfoStandardSchemeFactory implements SchemeFactory {
    public PageInfoStandardScheme getScheme() {
      return new PageInfoStandardScheme();
    }
  }

  private static class PageInfoStandardScheme extends StandardScheme<PageInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num = iprot.readI32();
              struct.setNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEFT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.left = iprot.readI32();
              struct.setLeftIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PAGE_TOKENS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                struct.pageTokens = new HashMap<Integer,String>(2*_map4.size);
                int _key5;
                String _val6;
                for (int _i7 = 0; _i7 < _map4.size; ++_i7)
                {
                  _key5 = iprot.readI32();
                  _val6 = iprot.readString();
                  struct.pageTokens.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setPageTokensIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PageInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_FIELD_DESC);
      oprot.writeI32(struct.num);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LEFT_FIELD_DESC);
      oprot.writeI32(struct.left);
      oprot.writeFieldEnd();
      if (struct.pageTokens != null) {
        oprot.writeFieldBegin(PAGE_TOKENS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.pageTokens.size()));
          for (Map.Entry<Integer, String> _iter8 : struct.pageTokens.entrySet())
          {
            oprot.writeI32(_iter8.getKey());
            oprot.writeString(_iter8.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

}

