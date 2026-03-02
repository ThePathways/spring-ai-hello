package com.example.helloAI.controller;

import com.example.helloAI.model.QuestionRequest;
import com.example.helloAI.service.AskAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {

    private final AskAIService askAIService;

    public AskController(AskAIService askAIService) {
        this.askAIService = askAIService;
    }

    @PostMapping("/Ask")
    public String askQuestion(@RequestBody QuestionRequest request) {
        return askAIService.getAnswer(request.question());
    }
}

