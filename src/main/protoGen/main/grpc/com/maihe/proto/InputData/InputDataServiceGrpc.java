package com.maihe.proto.InputData;

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
    comments = "Source: InputData.proto")
public final class InputDataServiceGrpc {

  private InputDataServiceGrpc() {}

  public static final String SERVICE_NAME = "InputDataPackage.InputDataService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.maihe.proto.InputData.inputDataMessage,
      com.maihe.proto.InputData.inputDataResponse> METHOD_INPUT_DATA =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "InputDataPackage.InputDataService", "inputData"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.InputData.inputDataMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.InputData.inputDataResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InputDataServiceStub newStub(io.grpc.Channel channel) {
    return new InputDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InputDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InputDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static InputDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InputDataServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InputDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *批量导入数据接口
     * </pre>
     */
    public void inputData(com.maihe.proto.InputData.inputDataMessage request,
        io.grpc.stub.StreamObserver<com.maihe.proto.InputData.inputDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INPUT_DATA, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_INPUT_DATA,
            asyncUnaryCall(
              new MethodHandlers<
                com.maihe.proto.InputData.inputDataMessage,
                com.maihe.proto.InputData.inputDataResponse>(
                  this, METHODID_INPUT_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class InputDataServiceStub extends io.grpc.stub.AbstractStub<InputDataServiceStub> {
    private InputDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InputDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InputDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *批量导入数据接口
     * </pre>
     */
    public void inputData(com.maihe.proto.InputData.inputDataMessage request,
        io.grpc.stub.StreamObserver<com.maihe.proto.InputData.inputDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INPUT_DATA, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InputDataServiceBlockingStub extends io.grpc.stub.AbstractStub<InputDataServiceBlockingStub> {
    private InputDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InputDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InputDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *批量导入数据接口
     * </pre>
     */
    public com.maihe.proto.InputData.inputDataResponse inputData(com.maihe.proto.InputData.inputDataMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INPUT_DATA, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InputDataServiceFutureStub extends io.grpc.stub.AbstractStub<InputDataServiceFutureStub> {
    private InputDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InputDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InputDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InputDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *批量导入数据接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maihe.proto.InputData.inputDataResponse> inputData(
        com.maihe.proto.InputData.inputDataMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INPUT_DATA, getCallOptions()), request);
    }
  }

  private static final int METHODID_INPUT_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InputDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InputDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INPUT_DATA:
          serviceImpl.inputData((com.maihe.proto.InputData.inputDataMessage) request,
              (io.grpc.stub.StreamObserver<com.maihe.proto.InputData.inputDataResponse>) responseObserver);
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

  private static final class InputDataServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.maihe.proto.InputData.Excel.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InputDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InputDataServiceDescriptorSupplier())
              .addMethod(METHOD_INPUT_DATA)
              .build();
        }
      }
    }
    return result;
  }
}
