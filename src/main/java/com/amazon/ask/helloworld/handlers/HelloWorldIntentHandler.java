package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class HelloWorldIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("disaster_loan"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Thanks for checking with us. Please let me know your name and where you are calling from.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("SBA Disaster Assistance", speechText)
                .build();
    }

}



