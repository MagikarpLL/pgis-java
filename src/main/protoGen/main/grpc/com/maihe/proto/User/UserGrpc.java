package com.maihe.proto.User;

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
    comments = "Source: User.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User.User";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.maihe.proto.User.UserRequest,
      com.maihe.proto.User.ResultResponse> METHOD_SAVE_USER_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "User.User", "saveUserInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.User.UserRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.User.ResultResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.maihe.proto.User.UserNameRequest,
      com.maihe.proto.User.UserResponse> METHOD_GET_USER_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "User.User", "getUserInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.User.UserNameRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.User.UserResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * insert user's info
     * </pre>
     */
    public void saveUserInfo(com.maihe.proto.User.UserRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.User.ResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_USER_INFO, responseObserver);
    }

    /**
     * <pre>
     *get user's info
     * </pre>
     */
    public void getUserInfo(com.maihe.proto.User.UserNameRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.User.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_INFO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_USER_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.maihe.proto.User.UserRequest,
                com.maihe.proto.User.ResultResponse>(
                  this, METHODID_SAVE_USER_INFO)))
          .addMethod(
            METHOD_GET_USER_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.maihe.proto.User.UserNameRequest,
                com.maihe.proto.User.UserResponse>(
                  this, METHODID_GET_USER_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     * <pre>
     * insert user's info
     * </pre>
     */
    public void saveUserInfo(com.maihe.proto.User.UserRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.User.ResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_USER_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get user's info
     * </pre>
     */
    public void getUserInfo(com.maihe.proto.User.UserNameRequest request,
        io.grpc.stub.StreamObserver<com.maihe.proto.User.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * insert user's info
     * </pre>
     */
    public com.maihe.proto.User.ResultResponse saveUserInfo(com.maihe.proto.User.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_USER_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     *get user's info
     * </pre>
     */
    public com.maihe.proto.User.UserResponse getUserInfo(com.maihe.proto.User.UserNameRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_INFO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * insert user's info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maihe.proto.User.ResultResponse> saveUserInfo(
        com.maihe.proto.User.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_USER_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     *get user's info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maihe.proto.User.UserResponse> getUserInfo(
        com.maihe.proto.User.UserNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_USER_INFO = 0;
  private static final int METHODID_GET_USER_INFO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_USER_INFO:
          serviceImpl.saveUserInfo((com.maihe.proto.User.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.maihe.proto.User.ResultResponse>) responseObserver);
          break;
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.maihe.proto.User.UserNameRequest) request,
              (io.grpc.stub.StreamObserver<com.maihe.proto.User.UserResponse>) responseObserver);
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

  private static final class UserDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.maihe.proto.User.TokenProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserDescriptorSupplier())
              .addMethod(METHOD_SAVE_USER_INFO)
              .addMethod(METHOD_GET_USER_INFO)
              .build();
        }
      }
    }
    return result;
  }
}
