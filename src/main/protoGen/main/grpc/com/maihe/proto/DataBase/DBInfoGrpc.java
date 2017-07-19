package com.maihe.proto.DataBase;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: DataBase.proto")
public final class DBInfoGrpc {

  private DBInfoGrpc() {}

  public static final String SERVICE_NAME = "DataBase.DBInfo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.maihe.proto.DataBase.DBRequest,
      com.maihe.proto.DataBase.DBResponse> METHOD_GET_PROS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "DataBase.DBInfo", "getPros"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.DataBase.DBRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.DataBase.DBResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.maihe.proto.DataBase.SQLRequest,
      com.maihe.proto.DataBase.SQLResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "DataBase.DBInfo", "query"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.DataBase.SQLRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.DataBase.SQLResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.maihe.proto.DataBase.SQLRequest,
      com.maihe.proto.DataBase.SQLResponse> METHOD_EDIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "DataBase.DBInfo", "edit"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.DataBase.SQLRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.DataBase.SQLResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DBInfoStub newStub(io.grpc.Channel channel) {
    return new DBInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DBInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DBInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DBInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DBInfoFutureStub(channel);
  }

  /**
   */
  public static abstract class DBInfoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * get database's properties
     * </pre>
     */
    public void getPros(com.maihe.proto.DataBase.DBRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.DBResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PROS, responseObserver);
    }

    /**
     * <pre>
     *query
     * </pre>
     */
    public void query(com.maihe.proto.DataBase.SQLRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.SQLResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     * <pre>
     *update or save or drop
     * </pre>
     */
    public void edit(com.maihe.proto.DataBase.SQLRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.SQLResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EDIT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PROS,
            asyncUnaryCall(
              new MethodHandlers<
                com.maihe.proto.DataBase.DBRequest,
                com.maihe.proto.DataBase.DBResponse>(
                  this, METHODID_GET_PROS)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                com.maihe.proto.DataBase.SQLRequest,
                com.maihe.proto.DataBase.SQLResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_EDIT,
            asyncUnaryCall(
              new MethodHandlers<
                com.maihe.proto.DataBase.SQLRequest,
                com.maihe.proto.DataBase.SQLResponse>(
                  this, METHODID_EDIT)))
          .build();
    }
  }

  /**
   */
  public static final class DBInfoStub extends io.grpc.stub.AbstractStub<DBInfoStub> {
    private DBInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DBInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DBInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DBInfoStub(channel, callOptions);
    }

    /**
     * <pre>
     * get database's properties
     * </pre>
     */
    public void getPros(com.maihe.proto.DataBase.DBRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.DBResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PROS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *query
     * </pre>
     */
    public void query(com.maihe.proto.DataBase.SQLRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.SQLResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *update or save or drop
     * </pre>
     */
    public void edit(com.maihe.proto.DataBase.SQLRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.SQLResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EDIT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DBInfoBlockingStub extends io.grpc.stub.AbstractStub<DBInfoBlockingStub> {
    private DBInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DBInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DBInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DBInfoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * get database's properties
     * </pre>
     */
    public com.maihe.proto.DataBase.DBResponse getPros(com.maihe.proto.DataBase.DBRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PROS, getCallOptions(), request);
    }

    /**
     * <pre>
     *query
     * </pre>
     */
    public com.maihe.proto.DataBase.SQLResponse query(com.maihe.proto.DataBase.SQLRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     *update or save or drop
     * </pre>
     */
    public com.maihe.proto.DataBase.SQLResponse edit(com.maihe.proto.DataBase.SQLRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EDIT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DBInfoFutureStub extends io.grpc.stub.AbstractStub<DBInfoFutureStub> {
    private DBInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DBInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DBInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DBInfoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * get database's properties
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maihe.proto.DataBase.DBResponse> getPros(
        com.maihe.proto.DataBase.DBRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PROS, getCallOptions()), request);
    }

    /**
     * <pre>
     *query
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maihe.proto.DataBase.SQLResponse> query(
        com.maihe.proto.DataBase.SQLRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     *update or save or drop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maihe.proto.DataBase.SQLResponse> edit(
        com.maihe.proto.DataBase.SQLRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EDIT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROS = 0;
  private static final int METHODID_QUERY = 1;
  private static final int METHODID_EDIT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DBInfoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DBInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROS:
          serviceImpl.getPros((com.maihe.proto.DataBase.DBRequest) request,
              (io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.DBResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((com.maihe.proto.DataBase.SQLRequest) request,
              (io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.SQLResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((com.maihe.proto.DataBase.SQLRequest) request,
              (io.grpc.stub.StreamObserver<com.maihe.proto.DataBase.SQLResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class DBInfoDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.maihe.proto.DataBase.DataBase.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DBInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DBInfoDescriptorSupplier())
              .addMethod(METHOD_GET_PROS)
              .addMethod(METHOD_QUERY)
              .addMethod(METHOD_EDIT)
              .build();
        }
      }
    }
    return result;
  }
}
