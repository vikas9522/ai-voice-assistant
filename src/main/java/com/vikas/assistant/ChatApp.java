package com.vikas.assistant;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ChatApp extends Application {

    private TextArea chatArea;
    private TextField inputField;
    private AIService aiService = new AIService();

    @Override
    public void start(Stage stage) {

        chatArea = new TextArea();
        chatArea.setEditable(false);
        chatArea.setWrapText(true);

        inputField = new TextField();
        inputField.setPromptText("Type your message...");

        Button sendButton = new Button("Send");

        sendButton.setOnAction(e -> sendMessage());
        inputField.setOnAction(e -> sendMessage());

        HBox inputBox = new HBox(10, inputField, sendButton);
        inputBox.setHgrow(inputField, Priority.ALWAYS);

        VBox root = new VBox(10, chatArea, inputBox);
        VBox.setVgrow(chatArea, Priority.ALWAYS);

        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("AI Assistant - Sarvam Powered");
        stage.setScene(scene);
        stage.show();
    }

    private void sendMessage() {
        String userText = inputField.getText().trim();
        if (userText.isEmpty()) return;

        chatArea.appendText("You: " + userText + "\n");
        inputField.clear();

        new Thread(() -> {
            String response = aiService.getAIResponse(userText);
            Platform.runLater(() ->
                    chatArea.appendText("Assistant: " + response + "\n\n")
            );
        }).start();
    }

    public static void main(String[] args) {
        launch();
    }
}