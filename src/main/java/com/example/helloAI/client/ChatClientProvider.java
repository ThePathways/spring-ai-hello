package com.example.helloAI.client;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatClientProvider {

    private final ChatClient.Builder chatClientBuilder;

    @Autowired
    public ChatClientProvider(OpenAiChatModel openAiChatModel) {
        this.chatClientBuilder = ChatClient.builder(openAiChatModel);
    }

    public ChatClient getChatClient() {
        return chatClientBuilder
                .defaultSystem("You are a helpful AI assistant.")
                .build();
    }
}

