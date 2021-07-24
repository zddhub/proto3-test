// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.example.tutorial.protos;

/**
 * Protobuf type {@code Test}
 */
public final class Test extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Test)
    TestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Test.newBuilder() to construct.
  private Test(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Test() {
    str_ = "";
    arrays_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Test();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Test(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16: {

            id_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            str_ = s;
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              arrays_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            arrays_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              arrays_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              arrays_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case -8: {

            max_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        arrays_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.tutorial.protos.TestProtos.internal_static_Test_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.tutorial.protos.TestProtos.internal_static_Test_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.tutorial.protos.Test.class, com.example.tutorial.protos.Test.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 2;
  private int id_;
  /**
   * <code>int32 id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int STR_FIELD_NUMBER = 3;
  private volatile java.lang.Object str_;
  /**
   * <code>string str = 3;</code>
   * @return The str.
   */
  @java.lang.Override
  public java.lang.String getStr() {
    java.lang.Object ref = str_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      str_ = s;
      return s;
    }
  }
  /**
   * <code>string str = 3;</code>
   * @return The bytes for str.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStrBytes() {
    java.lang.Object ref = str_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      str_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARRAYS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList arrays_;
  /**
   * <code>repeated int32 arrays = 4;</code>
   * @return A list containing the arrays.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getArraysList() {
    return arrays_;
  }
  /**
   * <code>repeated int32 arrays = 4;</code>
   * @return The count of arrays.
   */
  public int getArraysCount() {
    return arrays_.size();
  }
  /**
   * <code>repeated int32 arrays = 4;</code>
   * @param index The index of the element to return.
   * @return The arrays at the given index.
   */
  public int getArrays(int index) {
    return arrays_.getInt(index);
  }
  private int arraysMemoizedSerializedSize = -1;

  public static final int MAX_FIELD_NUMBER = 536870911;
  private int max_;
  /**
   * <code>int32 max = 536870911;</code>
   * @return The max.
   */
  @java.lang.Override
  public int getMax() {
    return max_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (id_ != 0) {
      output.writeInt32(2, id_);
    }
    if (!getStrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, str_);
    }
    if (getArraysList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(arraysMemoizedSerializedSize);
    }
    for (int i = 0; i < arrays_.size(); i++) {
      output.writeInt32NoTag(arrays_.getInt(i));
    }
    if (max_ != 0) {
      output.writeInt32(536870911, max_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, id_);
    }
    if (!getStrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, str_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < arrays_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(arrays_.getInt(i));
      }
      size += dataSize;
      if (!getArraysList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      arraysMemoizedSerializedSize = dataSize;
    }
    if (max_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(536870911, max_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.tutorial.protos.Test)) {
      return super.equals(obj);
    }
    com.example.tutorial.protos.Test other = (com.example.tutorial.protos.Test) obj;

    if (getId()
        != other.getId()) return false;
    if (!getStr()
        .equals(other.getStr())) return false;
    if (!getArraysList()
        .equals(other.getArraysList())) return false;
    if (getMax()
        != other.getMax()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + STR_FIELD_NUMBER;
    hash = (53 * hash) + getStr().hashCode();
    if (getArraysCount() > 0) {
      hash = (37 * hash) + ARRAYS_FIELD_NUMBER;
      hash = (53 * hash) + getArraysList().hashCode();
    }
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash = (53 * hash) + getMax();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.tutorial.protos.Test parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.protos.Test parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.protos.Test parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.protos.Test parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.protos.Test parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.tutorial.protos.Test parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.tutorial.protos.Test parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.protos.Test parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.protos.Test parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.tutorial.protos.Test parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.tutorial.protos.Test parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.tutorial.protos.Test parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.tutorial.protos.Test prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code Test}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Test)
      com.example.tutorial.protos.TestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.tutorial.protos.TestProtos.internal_static_Test_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.tutorial.protos.TestProtos.internal_static_Test_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.tutorial.protos.Test.class, com.example.tutorial.protos.Test.Builder.class);
    }

    // Construct using com.example.tutorial.protos.Test.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      str_ = "";

      arrays_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      max_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.tutorial.protos.TestProtos.internal_static_Test_descriptor;
    }

    @java.lang.Override
    public com.example.tutorial.protos.Test getDefaultInstanceForType() {
      return com.example.tutorial.protos.Test.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.tutorial.protos.Test build() {
      com.example.tutorial.protos.Test result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.tutorial.protos.Test buildPartial() {
      com.example.tutorial.protos.Test result = new com.example.tutorial.protos.Test(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.str_ = str_;
      if (((bitField0_ & 0x00000001) != 0)) {
        arrays_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.arrays_ = arrays_;
      result.max_ = max_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.tutorial.protos.Test) {
        return mergeFrom((com.example.tutorial.protos.Test)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.tutorial.protos.Test other) {
      if (other == com.example.tutorial.protos.Test.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getStr().isEmpty()) {
        str_ = other.str_;
        onChanged();
      }
      if (!other.arrays_.isEmpty()) {
        if (arrays_.isEmpty()) {
          arrays_ = other.arrays_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureArraysIsMutable();
          arrays_.addAll(other.arrays_);
        }
        onChanged();
      }
      if (other.getMax() != 0) {
        setMax(other.getMax());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.tutorial.protos.Test parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.tutorial.protos.Test) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object str_ = "";
    /**
     * <code>string str = 3;</code>
     * @return The str.
     */
    public java.lang.String getStr() {
      java.lang.Object ref = str_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        str_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string str = 3;</code>
     * @return The bytes for str.
     */
    public com.google.protobuf.ByteString
        getStrBytes() {
      java.lang.Object ref = str_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        str_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string str = 3;</code>
     * @param value The str to set.
     * @return This builder for chaining.
     */
    public Builder setStr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      str_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string str = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStr() {
      
      str_ = getDefaultInstance().getStr();
      onChanged();
      return this;
    }
    /**
     * <code>string str = 3;</code>
     * @param value The bytes for str to set.
     * @return This builder for chaining.
     */
    public Builder setStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      str_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList arrays_ = emptyIntList();
    private void ensureArraysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        arrays_ = mutableCopy(arrays_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 arrays = 4;</code>
     * @return A list containing the arrays.
     */
    public java.util.List<java.lang.Integer>
        getArraysList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(arrays_) : arrays_;
    }
    /**
     * <code>repeated int32 arrays = 4;</code>
     * @return The count of arrays.
     */
    public int getArraysCount() {
      return arrays_.size();
    }
    /**
     * <code>repeated int32 arrays = 4;</code>
     * @param index The index of the element to return.
     * @return The arrays at the given index.
     */
    public int getArrays(int index) {
      return arrays_.getInt(index);
    }
    /**
     * <code>repeated int32 arrays = 4;</code>
     * @param index The index to set the value at.
     * @param value The arrays to set.
     * @return This builder for chaining.
     */
    public Builder setArrays(
        int index, int value) {
      ensureArraysIsMutable();
      arrays_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 arrays = 4;</code>
     * @param value The arrays to add.
     * @return This builder for chaining.
     */
    public Builder addArrays(int value) {
      ensureArraysIsMutable();
      arrays_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 arrays = 4;</code>
     * @param values The arrays to add.
     * @return This builder for chaining.
     */
    public Builder addAllArrays(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureArraysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, arrays_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 arrays = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearArrays() {
      arrays_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int max_ ;
    /**
     * <code>int32 max = 536870911;</code>
     * @return The max.
     */
    @java.lang.Override
    public int getMax() {
      return max_;
    }
    /**
     * <code>int32 max = 536870911;</code>
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(int value) {
      
      max_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max = 536870911;</code>
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      
      max_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Test)
  }

  // @@protoc_insertion_point(class_scope:Test)
  private static final com.example.tutorial.protos.Test DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.tutorial.protos.Test();
  }

  public static com.example.tutorial.protos.Test getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Test>
      PARSER = new com.google.protobuf.AbstractParser<Test>() {
    @java.lang.Override
    public Test parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Test(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Test> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Test> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.tutorial.protos.Test getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

