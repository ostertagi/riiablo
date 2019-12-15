// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.d2gs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Velocity extends Table {
  public static Velocity getRootAsVelocity(ByteBuffer _bb) { return getRootAsVelocity(_bb, new Velocity()); }
  public static Velocity getRootAsVelocity(ByteBuffer _bb, Velocity obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Velocity __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float y() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createVelocity(FlatBufferBuilder builder,
      float x,
      float y) {
    builder.startObject(2);
    Velocity.addY(builder, y);
    Velocity.addX(builder, x);
    return Velocity.endVelocity(builder);
  }

  public static void startVelocity(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addX(FlatBufferBuilder builder, float x) { builder.addFloat(0, x, 0.0f); }
  public static void addY(FlatBufferBuilder builder, float y) { builder.addFloat(1, y, 0.0f); }
  public static int endVelocity(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

