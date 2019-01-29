/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.wi.director.thrift.v1.messaging;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MessageCategory implements org.apache.thrift.TEnum {
  USER_CHAT(1),
  STATUS_ADD_USER(2),
  STATUS_COMPLETE_STEP(3),
  STATUS_COMPLETE_JOB(4),
  STATUS_ADD_STEP(5),
  STATUS_ADD_DOCUMENT(6),
  STATUS_ADD_DOCUMENT_BY_EMAIL(7),
  STATUS_CREATE_JOB(8),
  USER_PING(9),
  STATUS_START_JOB(10),
  STATUS_APPLICABLE_STEP(11),
  STATUS_NON_APPLICABLE_STEP(12),
  STATUS_REMOVE_USER(13),
  STATUS_REMOVE_DOCUMENT(14),
  STATUS_UNCOMPLETE_JOB(15),
  STATUS_UNCOMPLETE_STEP(16),
  STATUS_CONDITIONAL_YES(17),
  STATUS_CONDITIONAL_NO(18),
  STATUS_APPLICABLE_STEP_GROUP(19),
  STATUS_NON_APPLICABLE_STEP_GROUP(20),
  STATUS_APPLICABLE_FIELD(21),
  STATUS_NON_APPLICABLE_FIELD(22),
  STATUS_JOB_CREATED_ISSUE(23),
  STATUS_CREATE_ISSUE_ON_JOB(24),
  STATUS_RESOLVE_ISSUE_ON_JOB(25),
  STATUS_COMPLETE_JOB_ON_ISSUE(26),
  STATUS_ADD_ROLE(27),
  STATUS_REMOVE_ROLE(28),
  STATUS_REOPEN_JOB(29),
  STATUS_REOPEN_ISSUE(30),
  STATUS_REOPEN_STANDALONE_ISSUE(31),
  STATUS_RESOLVE_STANDALONE_ISSUE(32),
  STATUS_COMMENT_THREAD(33);

  private final int value;

  private MessageCategory(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MessageCategory findByValue(int value) { 
    switch (value) {
      case 1:
        return USER_CHAT;
      case 2:
        return STATUS_ADD_USER;
      case 3:
        return STATUS_COMPLETE_STEP;
      case 4:
        return STATUS_COMPLETE_JOB;
      case 5:
        return STATUS_ADD_STEP;
      case 6:
        return STATUS_ADD_DOCUMENT;
      case 7:
        return STATUS_ADD_DOCUMENT_BY_EMAIL;
      case 8:
        return STATUS_CREATE_JOB;
      case 9:
        return USER_PING;
      case 10:
        return STATUS_START_JOB;
      case 11:
        return STATUS_APPLICABLE_STEP;
      case 12:
        return STATUS_NON_APPLICABLE_STEP;
      case 13:
        return STATUS_REMOVE_USER;
      case 14:
        return STATUS_REMOVE_DOCUMENT;
      case 15:
        return STATUS_UNCOMPLETE_JOB;
      case 16:
        return STATUS_UNCOMPLETE_STEP;
      case 17:
        return STATUS_CONDITIONAL_YES;
      case 18:
        return STATUS_CONDITIONAL_NO;
      case 19:
        return STATUS_APPLICABLE_STEP_GROUP;
      case 20:
        return STATUS_NON_APPLICABLE_STEP_GROUP;
      case 21:
        return STATUS_APPLICABLE_FIELD;
      case 22:
        return STATUS_NON_APPLICABLE_FIELD;
      case 23:
        return STATUS_JOB_CREATED_ISSUE;
      case 24:
        return STATUS_CREATE_ISSUE_ON_JOB;
      case 25:
        return STATUS_RESOLVE_ISSUE_ON_JOB;
      case 26:
        return STATUS_COMPLETE_JOB_ON_ISSUE;
      case 27:
        return STATUS_ADD_ROLE;
      case 28:
        return STATUS_REMOVE_ROLE;
      case 29:
        return STATUS_REOPEN_JOB;
      case 30:
        return STATUS_REOPEN_ISSUE;
      case 31:
        return STATUS_REOPEN_STANDALONE_ISSUE;
      case 32:
        return STATUS_RESOLVE_STANDALONE_ISSUE;
      case 33:
        return STATUS_COMMENT_THREAD;
      default:
        return null;
    }
  }
}
