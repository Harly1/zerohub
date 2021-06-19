package com.zerohub.challenge.service;

import com.google.protobuf.Empty;
import com.zerohub.challenge.proto.ConvertRequest;
import com.zerohub.challenge.proto.ConvertResponse;
import com.zerohub.challenge.proto.PublishRequest;
import com.zerohub.challenge.proto.RatesServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class RatesServiceImpl extends RatesServiceGrpc.RatesServiceImplBase {
    @Override
    public void publish(PublishRequest request, StreamObserver<Empty> responseObserver) {
        super.publish(request, responseObserver);
    }

    @Override
    public void convert(ConvertRequest request, StreamObserver<ConvertResponse> responseObserver) {
        super.convert(request, responseObserver);
    }
}
