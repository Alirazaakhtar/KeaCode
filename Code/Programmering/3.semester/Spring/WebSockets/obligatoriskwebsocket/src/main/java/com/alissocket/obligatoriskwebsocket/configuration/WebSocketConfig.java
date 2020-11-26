package com.alissocket.obligatoriskwebsocket.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // registerer simpelthen endpoint på server, så browser kan sige: var socket = new SockJS('/gs-guide-websocket');
        // Her kan man også registrere et fallback, hvis Websocket ikke er tilgængelig.
        registry.addEndpoint("/gs-guide-websocket")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); // server will listen for this topic
        registry.setApplicationDestinationPrefixes("/app"); // set global prefix for all topics
    }
}
