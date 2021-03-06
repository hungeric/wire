// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/edge_cases.proto
package com.squareup.wire.protos.edgecases;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

public final class Recursive extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_VALUE = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer value;

  @ProtoField(tag = 2)
  public final Recursive recursive;

  public Recursive(Integer value, Recursive recursive) {
    this.value = value;
    this.recursive = recursive;
  }

  private Recursive(Builder builder) {
    this(builder.value, builder.recursive);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Recursive)) return false;
    Recursive o = (Recursive) other;
    return equals(value, o.value)
        && equals(recursive, o.recursive);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = value != null ? value.hashCode() : 0;
      result = result * 37 + (recursive != null ? recursive.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Recursive> {

    public Integer value;
    public Recursive recursive;

    public Builder() {
    }

    public Builder(Recursive message) {
      super(message);
      if (message == null) return;
      this.value = message.value;
      this.recursive = message.recursive;
    }

    public Builder value(Integer value) {
      this.value = value;
      return this;
    }

    public Builder recursive(Recursive recursive) {
      this.recursive = recursive;
      return this;
    }

    @Override
    public Recursive build() {
      return new Recursive(this);
    }
  }
}
