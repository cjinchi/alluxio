// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

public interface RegisterWorkerPOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.RegisterWorkerPOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .alluxio.grpc.ConfigProperty configs = 1;</code>
   */
  java.util.List<alluxio.grpc.ConfigProperty> 
      getConfigsList();
  /**
   * <code>repeated .alluxio.grpc.ConfigProperty configs = 1;</code>
   */
  alluxio.grpc.ConfigProperty getConfigs(int index);
  /**
   * <code>repeated .alluxio.grpc.ConfigProperty configs = 1;</code>
   */
  int getConfigsCount();
  /**
   * <code>repeated .alluxio.grpc.ConfigProperty configs = 1;</code>
   */
  java.util.List<? extends alluxio.grpc.ConfigPropertyOrBuilder> 
      getConfigsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.ConfigProperty configs = 1;</code>
   */
  alluxio.grpc.ConfigPropertyOrBuilder getConfigsOrBuilder(
      int index);
}
