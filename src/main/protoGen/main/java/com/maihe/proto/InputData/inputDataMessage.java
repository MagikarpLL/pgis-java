// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InputData.proto

package com.maihe.proto.InputData;

/**
 * Protobuf type {@code InputDataPackage.inputDataMessage}
 */
public  final class inputDataMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:InputDataPackage.inputDataMessage)
    inputDataMessageOrBuilder {
  // Use inputDataMessage.newBuilder() to construct.
  private inputDataMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private inputDataMessage() {
    inputDataSql_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private inputDataMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            inputDataSql_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.maihe.proto.InputData.Excel.internal_static_InputDataPackage_inputDataMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.maihe.proto.InputData.Excel.internal_static_InputDataPackage_inputDataMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.maihe.proto.InputData.inputDataMessage.class, com.maihe.proto.InputData.inputDataMessage.Builder.class);
  }

  public static final int INPUTDATASQL_FIELD_NUMBER = 1;
  private volatile java.lang.Object inputDataSql_;
  /**
   * <code>string inputDataSql = 1;</code>
   */
  public java.lang.String getInputDataSql() {
    java.lang.Object ref = inputDataSql_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputDataSql_ = s;
      return s;
    }
  }
  /**
   * <code>string inputDataSql = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInputDataSqlBytes() {
    java.lang.Object ref = inputDataSql_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inputDataSql_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getInputDataSqlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inputDataSql_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInputDataSqlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inputDataSql_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.maihe.proto.InputData.inputDataMessage)) {
      return super.equals(obj);
    }
    com.maihe.proto.InputData.inputDataMessage other = (com.maihe.proto.InputData.inputDataMessage) obj;

    boolean result = true;
    result = result && getInputDataSql()
        .equals(other.getInputDataSql());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INPUTDATASQL_FIELD_NUMBER;
    hash = (53 * hash) + getInputDataSql().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.maihe.proto.InputData.inputDataMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.maihe.proto.InputData.inputDataMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.maihe.proto.InputData.inputDataMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code InputDataPackage.inputDataMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InputDataPackage.inputDataMessage)
      com.maihe.proto.InputData.inputDataMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.maihe.proto.InputData.Excel.internal_static_InputDataPackage_inputDataMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.maihe.proto.InputData.Excel.internal_static_InputDataPackage_inputDataMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.maihe.proto.InputData.inputDataMessage.class, com.maihe.proto.InputData.inputDataMessage.Builder.class);
    }

    // Construct using com.maihe.proto.InputData.inputDataMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      inputDataSql_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.maihe.proto.InputData.Excel.internal_static_InputDataPackage_inputDataMessage_descriptor;
    }

    public com.maihe.proto.InputData.inputDataMessage getDefaultInstanceForType() {
      return com.maihe.proto.InputData.inputDataMessage.getDefaultInstance();
    }

    public com.maihe.proto.InputData.inputDataMessage build() {
      com.maihe.proto.InputData.inputDataMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.maihe.proto.InputData.inputDataMessage buildPartial() {
      com.maihe.proto.InputData.inputDataMessage result = new com.maihe.proto.InputData.inputDataMessage(this);
      result.inputDataSql_ = inputDataSql_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.maihe.proto.InputData.inputDataMessage) {
        return mergeFrom((com.maihe.proto.InputData.inputDataMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.maihe.proto.InputData.inputDataMessage other) {
      if (other == com.maihe.proto.InputData.inputDataMessage.getDefaultInstance()) return this;
      if (!other.getInputDataSql().isEmpty()) {
        inputDataSql_ = other.inputDataSql_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.maihe.proto.InputData.inputDataMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.maihe.proto.InputData.inputDataMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object inputDataSql_ = "";
    /**
     * <code>string inputDataSql = 1;</code>
     */
    public java.lang.String getInputDataSql() {
      java.lang.Object ref = inputDataSql_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputDataSql_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inputDataSql = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInputDataSqlBytes() {
      java.lang.Object ref = inputDataSql_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputDataSql_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inputDataSql = 1;</code>
     */
    public Builder setInputDataSql(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inputDataSql_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string inputDataSql = 1;</code>
     */
    public Builder clearInputDataSql() {
      
      inputDataSql_ = getDefaultInstance().getInputDataSql();
      onChanged();
      return this;
    }
    /**
     * <code>string inputDataSql = 1;</code>
     */
    public Builder setInputDataSqlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inputDataSql_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:InputDataPackage.inputDataMessage)
  }

  // @@protoc_insertion_point(class_scope:InputDataPackage.inputDataMessage)
  private static final com.maihe.proto.InputData.inputDataMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.maihe.proto.InputData.inputDataMessage();
  }

  public static com.maihe.proto.InputData.inputDataMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<inputDataMessage>
      PARSER = new com.google.protobuf.AbstractParser<inputDataMessage>() {
    public inputDataMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new inputDataMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<inputDataMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<inputDataMessage> getParserForType() {
    return PARSER;
  }

  public com.maihe.proto.InputData.inputDataMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
