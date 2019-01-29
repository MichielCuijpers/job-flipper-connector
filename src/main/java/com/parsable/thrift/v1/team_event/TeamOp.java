/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.parsable.thrift.v1.team_event;

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
public class TeamOp extends org.apache.thrift.TUnion<TeamOp, TeamOp._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TeamOp");
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("config", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField TEMPLATE_APPROVAL_WEBHOOK_FIELD_DESC = new org.apache.thrift.protocol.TField("templateApprovalWebhook", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TEMPLATE_SET_APPROVAL_WEBHOOK_FIELD_DESC = new org.apache.thrift.protocol.TField("templateSetApprovalWebhook", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField SUBDOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("subdomain", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField CREATION_FIELD_DESC = new org.apache.thrift.protocol.TField("creation", org.apache.thrift.protocol.TType.STRUCT, (short)21);
  private static final org.apache.thrift.protocol.TField ADD_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("addUser", org.apache.thrift.protocol.TType.STRUCT, (short)22);
  private static final org.apache.thrift.protocol.TField REMOVE_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("removeUser", org.apache.thrift.protocol.TType.STRUCT, (short)23);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "title"),
    CONFIG((short)2, "config"),
    TEMPLATE_APPROVAL_WEBHOOK((short)3, "templateApprovalWebhook"),
    TEMPLATE_SET_APPROVAL_WEBHOOK((short)4, "templateSetApprovalWebhook"),
    SUBDOMAIN((short)5, "subdomain"),
    CREATION((short)21, "creation"),
    ADD_USER((short)22, "addUser"),
    REMOVE_USER((short)23, "removeUser");

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
        case 1: // TITLE
          return TITLE;
        case 2: // CONFIG
          return CONFIG;
        case 3: // TEMPLATE_APPROVAL_WEBHOOK
          return TEMPLATE_APPROVAL_WEBHOOK;
        case 4: // TEMPLATE_SET_APPROVAL_WEBHOOK
          return TEMPLATE_SET_APPROVAL_WEBHOOK;
        case 5: // SUBDOMAIN
          return SUBDOMAIN;
        case 21: // CREATION
          return CREATION;
        case 22: // ADD_USER
          return ADD_USER;
        case 23: // REMOVE_USER
          return REMOVE_USER;
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
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.parsable.thrift.v1.common_event.TitleProperty.class)));
    tmpMap.put(_Fields.CONFIG, new org.apache.thrift.meta_data.FieldMetaData("config", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigProperty.class)));
    tmpMap.put(_Fields.TEMPLATE_APPROVAL_WEBHOOK, new org.apache.thrift.meta_data.FieldMetaData("templateApprovalWebhook", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TemplateApprovalWebhookProperty.class)));
    tmpMap.put(_Fields.TEMPLATE_SET_APPROVAL_WEBHOOK, new org.apache.thrift.meta_data.FieldMetaData("templateSetApprovalWebhook", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TemplateSetApprovalWebhookProperty.class)));
    tmpMap.put(_Fields.SUBDOMAIN, new org.apache.thrift.meta_data.FieldMetaData("subdomain", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SubdomainProperty.class)));
    tmpMap.put(_Fields.CREATION, new org.apache.thrift.meta_data.FieldMetaData("creation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CreateTeamOp.class)));
    tmpMap.put(_Fields.ADD_USER, new org.apache.thrift.meta_data.FieldMetaData("addUser", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AddUserOp.class)));
    tmpMap.put(_Fields.REMOVE_USER, new org.apache.thrift.meta_data.FieldMetaData("removeUser", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RemoveUserOp.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TeamOp.class, metaDataMap);
  }

  public TeamOp() {
    super();
  }

  public TeamOp(_Fields setField, Object value) {
    super(setField, value);
  }

  public TeamOp(TeamOp other) {
    super(other);
  }
  public TeamOp deepCopy() {
    return new TeamOp(this);
  }

  public static TeamOp title(com.parsable.thrift.v1.common_event.TitleProperty value) {
    TeamOp x = new TeamOp();
    x.setTitle(value);
    return x;
  }

  public static TeamOp config(ConfigProperty value) {
    TeamOp x = new TeamOp();
    x.setConfig(value);
    return x;
  }

  public static TeamOp templateApprovalWebhook(TemplateApprovalWebhookProperty value) {
    TeamOp x = new TeamOp();
    x.setTemplateApprovalWebhook(value);
    return x;
  }

  public static TeamOp templateSetApprovalWebhook(TemplateSetApprovalWebhookProperty value) {
    TeamOp x = new TeamOp();
    x.setTemplateSetApprovalWebhook(value);
    return x;
  }

  public static TeamOp subdomain(SubdomainProperty value) {
    TeamOp x = new TeamOp();
    x.setSubdomain(value);
    return x;
  }

  public static TeamOp creation(CreateTeamOp value) {
    TeamOp x = new TeamOp();
    x.setCreation(value);
    return x;
  }

  public static TeamOp addUser(AddUserOp value) {
    TeamOp x = new TeamOp();
    x.setAddUser(value);
    return x;
  }

  public static TeamOp removeUser(RemoveUserOp value) {
    TeamOp x = new TeamOp();
    x.setRemoveUser(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case TITLE:
        if (value instanceof com.parsable.thrift.v1.common_event.TitleProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type com.parsable.thrift.v1.common_event.TitleProperty for field 'title', but got " + value.getClass().getSimpleName());
      case CONFIG:
        if (value instanceof ConfigProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ConfigProperty for field 'config', but got " + value.getClass().getSimpleName());
      case TEMPLATE_APPROVAL_WEBHOOK:
        if (value instanceof TemplateApprovalWebhookProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TemplateApprovalWebhookProperty for field 'templateApprovalWebhook', but got " + value.getClass().getSimpleName());
      case TEMPLATE_SET_APPROVAL_WEBHOOK:
        if (value instanceof TemplateSetApprovalWebhookProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TemplateSetApprovalWebhookProperty for field 'templateSetApprovalWebhook', but got " + value.getClass().getSimpleName());
      case SUBDOMAIN:
        if (value instanceof SubdomainProperty) {
          break;
        }
        throw new ClassCastException("Was expecting value of type SubdomainProperty for field 'subdomain', but got " + value.getClass().getSimpleName());
      case CREATION:
        if (value instanceof CreateTeamOp) {
          break;
        }
        throw new ClassCastException("Was expecting value of type CreateTeamOp for field 'creation', but got " + value.getClass().getSimpleName());
      case ADD_USER:
        if (value instanceof AddUserOp) {
          break;
        }
        throw new ClassCastException("Was expecting value of type AddUserOp for field 'addUser', but got " + value.getClass().getSimpleName());
      case REMOVE_USER:
        if (value instanceof RemoveUserOp) {
          break;
        }
        throw new ClassCastException("Was expecting value of type RemoveUserOp for field 'removeUser', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case TITLE:
          if (field.type == TITLE_FIELD_DESC.type) {
            com.parsable.thrift.v1.common_event.TitleProperty title;
            title = new com.parsable.thrift.v1.common_event.TitleProperty();
            title.read(iprot);
            return title;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case CONFIG:
          if (field.type == CONFIG_FIELD_DESC.type) {
            ConfigProperty config;
            config = new ConfigProperty();
            config.read(iprot);
            return config;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TEMPLATE_APPROVAL_WEBHOOK:
          if (field.type == TEMPLATE_APPROVAL_WEBHOOK_FIELD_DESC.type) {
            TemplateApprovalWebhookProperty templateApprovalWebhook;
            templateApprovalWebhook = new TemplateApprovalWebhookProperty();
            templateApprovalWebhook.read(iprot);
            return templateApprovalWebhook;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TEMPLATE_SET_APPROVAL_WEBHOOK:
          if (field.type == TEMPLATE_SET_APPROVAL_WEBHOOK_FIELD_DESC.type) {
            TemplateSetApprovalWebhookProperty templateSetApprovalWebhook;
            templateSetApprovalWebhook = new TemplateSetApprovalWebhookProperty();
            templateSetApprovalWebhook.read(iprot);
            return templateSetApprovalWebhook;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SUBDOMAIN:
          if (field.type == SUBDOMAIN_FIELD_DESC.type) {
            SubdomainProperty subdomain;
            subdomain = new SubdomainProperty();
            subdomain.read(iprot);
            return subdomain;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case CREATION:
          if (field.type == CREATION_FIELD_DESC.type) {
            CreateTeamOp creation;
            creation = new CreateTeamOp();
            creation.read(iprot);
            return creation;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case ADD_USER:
          if (field.type == ADD_USER_FIELD_DESC.type) {
            AddUserOp addUser;
            addUser = new AddUserOp();
            addUser.read(iprot);
            return addUser;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case REMOVE_USER:
          if (field.type == REMOVE_USER_FIELD_DESC.type) {
            RemoveUserOp removeUser;
            removeUser = new RemoveUserOp();
            removeUser.read(iprot);
            return removeUser;
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
      case TITLE:
        com.parsable.thrift.v1.common_event.TitleProperty title = (com.parsable.thrift.v1.common_event.TitleProperty)value_;
        title.write(oprot);
        return;
      case CONFIG:
        ConfigProperty config = (ConfigProperty)value_;
        config.write(oprot);
        return;
      case TEMPLATE_APPROVAL_WEBHOOK:
        TemplateApprovalWebhookProperty templateApprovalWebhook = (TemplateApprovalWebhookProperty)value_;
        templateApprovalWebhook.write(oprot);
        return;
      case TEMPLATE_SET_APPROVAL_WEBHOOK:
        TemplateSetApprovalWebhookProperty templateSetApprovalWebhook = (TemplateSetApprovalWebhookProperty)value_;
        templateSetApprovalWebhook.write(oprot);
        return;
      case SUBDOMAIN:
        SubdomainProperty subdomain = (SubdomainProperty)value_;
        subdomain.write(oprot);
        return;
      case CREATION:
        CreateTeamOp creation = (CreateTeamOp)value_;
        creation.write(oprot);
        return;
      case ADD_USER:
        AddUserOp addUser = (AddUserOp)value_;
        addUser.write(oprot);
        return;
      case REMOVE_USER:
        RemoveUserOp removeUser = (RemoveUserOp)value_;
        removeUser.write(oprot);
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
        case TITLE:
          com.parsable.thrift.v1.common_event.TitleProperty title;
          title = new com.parsable.thrift.v1.common_event.TitleProperty();
          title.read(iprot);
          return title;
        case CONFIG:
          ConfigProperty config;
          config = new ConfigProperty();
          config.read(iprot);
          return config;
        case TEMPLATE_APPROVAL_WEBHOOK:
          TemplateApprovalWebhookProperty templateApprovalWebhook;
          templateApprovalWebhook = new TemplateApprovalWebhookProperty();
          templateApprovalWebhook.read(iprot);
          return templateApprovalWebhook;
        case TEMPLATE_SET_APPROVAL_WEBHOOK:
          TemplateSetApprovalWebhookProperty templateSetApprovalWebhook;
          templateSetApprovalWebhook = new TemplateSetApprovalWebhookProperty();
          templateSetApprovalWebhook.read(iprot);
          return templateSetApprovalWebhook;
        case SUBDOMAIN:
          SubdomainProperty subdomain;
          subdomain = new SubdomainProperty();
          subdomain.read(iprot);
          return subdomain;
        case CREATION:
          CreateTeamOp creation;
          creation = new CreateTeamOp();
          creation.read(iprot);
          return creation;
        case ADD_USER:
          AddUserOp addUser;
          addUser = new AddUserOp();
          addUser.read(iprot);
          return addUser;
        case REMOVE_USER:
          RemoveUserOp removeUser;
          removeUser = new RemoveUserOp();
          removeUser.read(iprot);
          return removeUser;
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
      case TITLE:
        com.parsable.thrift.v1.common_event.TitleProperty title = (com.parsable.thrift.v1.common_event.TitleProperty)value_;
        title.write(oprot);
        return;
      case CONFIG:
        ConfigProperty config = (ConfigProperty)value_;
        config.write(oprot);
        return;
      case TEMPLATE_APPROVAL_WEBHOOK:
        TemplateApprovalWebhookProperty templateApprovalWebhook = (TemplateApprovalWebhookProperty)value_;
        templateApprovalWebhook.write(oprot);
        return;
      case TEMPLATE_SET_APPROVAL_WEBHOOK:
        TemplateSetApprovalWebhookProperty templateSetApprovalWebhook = (TemplateSetApprovalWebhookProperty)value_;
        templateSetApprovalWebhook.write(oprot);
        return;
      case SUBDOMAIN:
        SubdomainProperty subdomain = (SubdomainProperty)value_;
        subdomain.write(oprot);
        return;
      case CREATION:
        CreateTeamOp creation = (CreateTeamOp)value_;
        creation.write(oprot);
        return;
      case ADD_USER:
        AddUserOp addUser = (AddUserOp)value_;
        addUser.write(oprot);
        return;
      case REMOVE_USER:
        RemoveUserOp removeUser = (RemoveUserOp)value_;
        removeUser.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case TITLE:
        return TITLE_FIELD_DESC;
      case CONFIG:
        return CONFIG_FIELD_DESC;
      case TEMPLATE_APPROVAL_WEBHOOK:
        return TEMPLATE_APPROVAL_WEBHOOK_FIELD_DESC;
      case TEMPLATE_SET_APPROVAL_WEBHOOK:
        return TEMPLATE_SET_APPROVAL_WEBHOOK_FIELD_DESC;
      case SUBDOMAIN:
        return SUBDOMAIN_FIELD_DESC;
      case CREATION:
        return CREATION_FIELD_DESC;
      case ADD_USER:
        return ADD_USER_FIELD_DESC;
      case REMOVE_USER:
        return REMOVE_USER_FIELD_DESC;
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


  public com.parsable.thrift.v1.common_event.TitleProperty getTitle() {
    if (getSetField() == _Fields.TITLE) {
      return (com.parsable.thrift.v1.common_event.TitleProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'title' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTitle(com.parsable.thrift.v1.common_event.TitleProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.TITLE;
    value_ = value;
  }

  public ConfigProperty getConfig() {
    if (getSetField() == _Fields.CONFIG) {
      return (ConfigProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'config' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setConfig(ConfigProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.CONFIG;
    value_ = value;
  }

  public TemplateApprovalWebhookProperty getTemplateApprovalWebhook() {
    if (getSetField() == _Fields.TEMPLATE_APPROVAL_WEBHOOK) {
      return (TemplateApprovalWebhookProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'templateApprovalWebhook' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTemplateApprovalWebhook(TemplateApprovalWebhookProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.TEMPLATE_APPROVAL_WEBHOOK;
    value_ = value;
  }

  public TemplateSetApprovalWebhookProperty getTemplateSetApprovalWebhook() {
    if (getSetField() == _Fields.TEMPLATE_SET_APPROVAL_WEBHOOK) {
      return (TemplateSetApprovalWebhookProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'templateSetApprovalWebhook' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTemplateSetApprovalWebhook(TemplateSetApprovalWebhookProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.TEMPLATE_SET_APPROVAL_WEBHOOK;
    value_ = value;
  }

  public SubdomainProperty getSubdomain() {
    if (getSetField() == _Fields.SUBDOMAIN) {
      return (SubdomainProperty)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'subdomain' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSubdomain(SubdomainProperty value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SUBDOMAIN;
    value_ = value;
  }

  public CreateTeamOp getCreation() {
    if (getSetField() == _Fields.CREATION) {
      return (CreateTeamOp)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'creation' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setCreation(CreateTeamOp value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.CREATION;
    value_ = value;
  }

  public AddUserOp getAddUser() {
    if (getSetField() == _Fields.ADD_USER) {
      return (AddUserOp)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'addUser' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setAddUser(AddUserOp value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.ADD_USER;
    value_ = value;
  }

  public RemoveUserOp getRemoveUser() {
    if (getSetField() == _Fields.REMOVE_USER) {
      return (RemoveUserOp)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'removeUser' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRemoveUser(RemoveUserOp value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.REMOVE_USER;
    value_ = value;
  }

  public boolean isSetTitle() {
    return setField_ == _Fields.TITLE;
  }


  public boolean isSetConfig() {
    return setField_ == _Fields.CONFIG;
  }


  public boolean isSetTemplateApprovalWebhook() {
    return setField_ == _Fields.TEMPLATE_APPROVAL_WEBHOOK;
  }


  public boolean isSetTemplateSetApprovalWebhook() {
    return setField_ == _Fields.TEMPLATE_SET_APPROVAL_WEBHOOK;
  }


  public boolean isSetSubdomain() {
    return setField_ == _Fields.SUBDOMAIN;
  }


  public boolean isSetCreation() {
    return setField_ == _Fields.CREATION;
  }


  public boolean isSetAddUser() {
    return setField_ == _Fields.ADD_USER;
  }


  public boolean isSetRemoveUser() {
    return setField_ == _Fields.REMOVE_USER;
  }


  public boolean equals(Object other) {
    if (other instanceof TeamOp) {
      return equals((TeamOp)other);
    } else {
      return false;
    }
  }

  public boolean equals(TeamOp other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TeamOp other) {
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
