/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

/**
 *
 *
 * <pre>
 * Response message for TablesService.BatchCreateRows.
 * </pre>
 *
 * Protobuf type {@code google.area120.tables.v1alpha1.BatchCreateRowsResponse}
 */
public final class BatchCreateRowsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.area120.tables.v1alpha1.BatchCreateRowsResponse)
    BatchCreateRowsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateRowsResponse.newBuilder() to construct.
  private BatchCreateRowsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateRowsResponse() {
    rows_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateRowsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_BatchCreateRowsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_BatchCreateRowsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.area120.tables.v1alpha1.BatchCreateRowsResponse.class,
            com.google.area120.tables.v1alpha1.BatchCreateRowsResponse.Builder.class);
  }

  public static final int ROWS_FIELD_NUMBER = 1;
  private java.util.List<com.google.area120.tables.v1alpha1.Row> rows_;
  /**
   *
   *
   * <pre>
   * The created rows.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.area120.tables.v1alpha1.Row> getRowsList() {
    return rows_;
  }
  /**
   *
   *
   * <pre>
   * The created rows.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.area120.tables.v1alpha1.RowOrBuilder>
      getRowsOrBuilderList() {
    return rows_;
  }
  /**
   *
   *
   * <pre>
   * The created rows.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
   */
  @java.lang.Override
  public int getRowsCount() {
    return rows_.size();
  }
  /**
   *
   *
   * <pre>
   * The created rows.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
   */
  @java.lang.Override
  public com.google.area120.tables.v1alpha1.Row getRows(int index) {
    return rows_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The created rows.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
   */
  @java.lang.Override
  public com.google.area120.tables.v1alpha1.RowOrBuilder getRowsOrBuilder(int index) {
    return rows_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < rows_.size(); i++) {
      output.writeMessage(1, rows_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rows_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, rows_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.area120.tables.v1alpha1.BatchCreateRowsResponse)) {
      return super.equals(obj);
    }
    com.google.area120.tables.v1alpha1.BatchCreateRowsResponse other =
        (com.google.area120.tables.v1alpha1.BatchCreateRowsResponse) obj;

    if (!getRowsList().equals(other.getRowsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRowsCount() > 0) {
      hash = (37 * hash) + ROWS_FIELD_NUMBER;
      hash = (53 * hash) + getRowsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.area120.tables.v1alpha1.BatchCreateRowsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for TablesService.BatchCreateRows.
   * </pre>
   *
   * Protobuf type {@code google.area120.tables.v1alpha1.BatchCreateRowsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.area120.tables.v1alpha1.BatchCreateRowsResponse)
      com.google.area120.tables.v1alpha1.BatchCreateRowsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_BatchCreateRowsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_BatchCreateRowsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.area120.tables.v1alpha1.BatchCreateRowsResponse.class,
              com.google.area120.tables.v1alpha1.BatchCreateRowsResponse.Builder.class);
    }

    // Construct using com.google.area120.tables.v1alpha1.BatchCreateRowsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
      } else {
        rows_ = null;
        rowsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_BatchCreateRowsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.BatchCreateRowsResponse getDefaultInstanceForType() {
      return com.google.area120.tables.v1alpha1.BatchCreateRowsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.BatchCreateRowsResponse build() {
      com.google.area120.tables.v1alpha1.BatchCreateRowsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.BatchCreateRowsResponse buildPartial() {
      com.google.area120.tables.v1alpha1.BatchCreateRowsResponse result =
          new com.google.area120.tables.v1alpha1.BatchCreateRowsResponse(this);
      int from_bitField0_ = bitField0_;
      if (rowsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rows_ = java.util.Collections.unmodifiableList(rows_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rows_ = rows_;
      } else {
        result.rows_ = rowsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.area120.tables.v1alpha1.BatchCreateRowsResponse) {
        return mergeFrom((com.google.area120.tables.v1alpha1.BatchCreateRowsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.area120.tables.v1alpha1.BatchCreateRowsResponse other) {
      if (other == com.google.area120.tables.v1alpha1.BatchCreateRowsResponse.getDefaultInstance())
        return this;
      if (rowsBuilder_ == null) {
        if (!other.rows_.isEmpty()) {
          if (rows_.isEmpty()) {
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRowsIsMutable();
            rows_.addAll(other.rows_);
          }
          onChanged();
        }
      } else {
        if (!other.rows_.isEmpty()) {
          if (rowsBuilder_.isEmpty()) {
            rowsBuilder_.dispose();
            rowsBuilder_ = null;
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rowsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRowsFieldBuilder()
                    : null;
          } else {
            rowsBuilder_.addAllMessages(other.rows_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.area120.tables.v1alpha1.Row m =
                    input.readMessage(
                        com.google.area120.tables.v1alpha1.Row.parser(), extensionRegistry);
                if (rowsBuilder_ == null) {
                  ensureRowsIsMutable();
                  rows_.add(m);
                } else {
                  rowsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.area120.tables.v1alpha1.Row> rows_ =
        java.util.Collections.emptyList();

    private void ensureRowsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rows_ = new java.util.ArrayList<com.google.area120.tables.v1alpha1.Row>(rows_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.area120.tables.v1alpha1.Row,
            com.google.area120.tables.v1alpha1.Row.Builder,
            com.google.area120.tables.v1alpha1.RowOrBuilder>
        rowsBuilder_;

    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public java.util.List<com.google.area120.tables.v1alpha1.Row> getRowsList() {
      if (rowsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rows_);
      } else {
        return rowsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public int getRowsCount() {
      if (rowsBuilder_ == null) {
        return rows_.size();
      } else {
        return rowsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public com.google.area120.tables.v1alpha1.Row getRows(int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);
      } else {
        return rowsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder setRows(int index, com.google.area120.tables.v1alpha1.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.set(index, value);
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder setRows(
        int index, com.google.area120.tables.v1alpha1.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.set(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder addRows(com.google.area120.tables.v1alpha1.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder addRows(int index, com.google.area120.tables.v1alpha1.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(index, value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder addRows(com.google.area120.tables.v1alpha1.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder addRows(
        int index, com.google.area120.tables.v1alpha1.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder addAllRows(
        java.lang.Iterable<? extends com.google.area120.tables.v1alpha1.Row> values) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rows_);
        onChanged();
      } else {
        rowsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder clearRows() {
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rowsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public Builder removeRows(int index) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.remove(index);
        onChanged();
      } else {
        rowsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public com.google.area120.tables.v1alpha1.Row.Builder getRowsBuilder(int index) {
      return getRowsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public com.google.area120.tables.v1alpha1.RowOrBuilder getRowsOrBuilder(int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);
      } else {
        return rowsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public java.util.List<? extends com.google.area120.tables.v1alpha1.RowOrBuilder>
        getRowsOrBuilderList() {
      if (rowsBuilder_ != null) {
        return rowsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rows_);
      }
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public com.google.area120.tables.v1alpha1.Row.Builder addRowsBuilder() {
      return getRowsFieldBuilder()
          .addBuilder(com.google.area120.tables.v1alpha1.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public com.google.area120.tables.v1alpha1.Row.Builder addRowsBuilder(int index) {
      return getRowsFieldBuilder()
          .addBuilder(index, com.google.area120.tables.v1alpha1.Row.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The created rows.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.Row rows = 1;</code>
     */
    public java.util.List<com.google.area120.tables.v1alpha1.Row.Builder> getRowsBuilderList() {
      return getRowsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.area120.tables.v1alpha1.Row,
            com.google.area120.tables.v1alpha1.Row.Builder,
            com.google.area120.tables.v1alpha1.RowOrBuilder>
        getRowsFieldBuilder() {
      if (rowsBuilder_ == null) {
        rowsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.area120.tables.v1alpha1.Row,
                com.google.area120.tables.v1alpha1.Row.Builder,
                com.google.area120.tables.v1alpha1.RowOrBuilder>(
                rows_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        rows_ = null;
      }
      return rowsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.area120.tables.v1alpha1.BatchCreateRowsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.area120.tables.v1alpha1.BatchCreateRowsResponse)
  private static final com.google.area120.tables.v1alpha1.BatchCreateRowsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.area120.tables.v1alpha1.BatchCreateRowsResponse();
  }

  public static com.google.area120.tables.v1alpha1.BatchCreateRowsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateRowsResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateRowsResponse>() {
        @java.lang.Override
        public BatchCreateRowsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<BatchCreateRowsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateRowsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.area120.tables.v1alpha1.BatchCreateRowsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
