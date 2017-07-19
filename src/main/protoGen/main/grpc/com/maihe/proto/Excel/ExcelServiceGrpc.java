package com.maihe.proto.Excel;

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
    comments = "Source: Excel.proto")
public final class ExcelServiceGrpc {

  private ExcelServiceGrpc() {}

  public static final String SERVICE_NAME = "Excel.ExcelService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.maihe.proto.Excel.excelParams,
      com.maihe.proto.Excel.excelResponse> METHOD_GEN_EXCEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Excel.ExcelService", "genExcel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.Excel.excelParams.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.maihe.proto.Excel.excelResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExcelServiceStub newStub(io.grpc.Channel channel) {
    return new ExcelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExcelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExcelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ExcelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExcelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ExcelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *excel接口
     * </pre>
     */
    public void genExcel(com.maihe.proto.Excel.excelParams request,
        io.grpc.stub.StreamObserver<com.maihe.proto.Excel.excelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GEN_EXCEL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GEN_EXCEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.maihe.proto.Excel.excelParams,
                com.maihe.proto.Excel.excelResponse>(
                  this, METHODID_GEN_EXCEL)))
          .build();
    }
  }

  /**
   */
  public static final class ExcelServiceStub extends io.grpc.stub.AbstractStub<ExcelServiceStub> {
    private ExcelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExcelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExcelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExcelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *excel接口
     * </pre>
     */
    public void genExcel(com.maihe.proto.Excel.excelParams request,
        io.grpc.stub.StreamObserver<com.maihe.proto.Excel.excelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GEN_EXCEL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExcelServiceBlockingStub extends io.grpc.stub.AbstractStub<ExcelServiceBlockingStub> {
    private ExcelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExcelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExcelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExcelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *excel接口
     * </pre>
     */
    public com.maihe.proto.Excel.excelResponse genExcel(com.maihe.proto.Excel.excelParams request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GEN_EXCEL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExcelServiceFutureStub extends io.grpc.stub.AbstractStub<ExcelServiceFutureStub> {
    private ExcelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExcelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExcelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExcelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *excel接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.maihe.proto.Excel.excelResponse> genExcel(
        com.maihe.proto.Excel.excelParams request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GEN_EXCEL, getCallOptions()), request);
    }
  }

  private static final int METHODID_GEN_EXCEL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExcelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExcelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GEN_EXCEL:
          serviceImpl.genExcel((com.maihe.proto.Excel.excelParams) request,
              (io.grpc.stub.StreamObserver<com.maihe.proto.Excel.excelResponse>) responseObserver);
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

  private static final class ExcelServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.maihe.proto.Excel.Excel.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExcelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExcelServiceDescriptorSupplier())
              .addMethod(METHOD_GEN_EXCEL)
              .build();
        }
      }
    }
    return result;
  }
}
