package com.example.helloAI.service;

import com.example.helloAI.client.ChatClientProvider;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AskAIService {

    private final ChatClient chatClient;

    public AskAIService(ChatClientProvider chatClientProvider) {
        this.chatClient = chatClientProvider.getChatClient();
    }

    public String getAnswer(String question) {
        return chatClient.prompt()
                .user(question)
                .call()
                .content();
    }
}

