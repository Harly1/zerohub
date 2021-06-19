package com.zerohub.challenge.service;

import com.zerohub.challenge.converter.currency.CurrencyConverter;
import com.zerohub.challenge.factory.CurrencyConverterFactory;
import com.zerohub.challenge.proto.ConvertRequest;
import com.zerohub.challenge.proto.ConvertResponse;
import com.zerohub.challenge.proto.ConverterServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.math.BigDecimal;

@GrpcService
public class ConverterServiceImpl extends ConverterServiceGrpc.ConverterServiceImplBase {
    final
    CurrencyConverterFactory converterFactory;

    public ConverterServiceImpl(CurrencyConverterFactory converterFactory) {
        this.converterFactory = converterFactory;
    }

    @Override
    public void convert(ConvertRequest request, StreamObserver<ConvertResponse> responseObserver) {
        CurrencyConverter currencyConverter = converterFactory.getConverterByCurrency(request.getFromCurrency());

        BigDecimal fromAmount = new BigDecimal(request.getFromAmount());

        BigDecimal price =  currencyConverter.convert(request.getToCurrency(), fromAmount);

        ConvertResponse convertResponse = ConvertResponse
                .newBuilder()
                .setPrice(price.toString())
                .build();

        responseObserver.onNext(convertResponse);
        responseObserver.onCompleted();
    }

}
