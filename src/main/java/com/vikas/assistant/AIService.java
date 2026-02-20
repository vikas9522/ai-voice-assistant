package com.vikas.assistant;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class AIService {

    
    private static final String SARVAM_API_KEY = System.getenv("SARVAM_API_KEY");

static {
    if (SARVAM_API_KEY == null) {
        throw new RuntimeException("SARVAM_API_KEY environment variable not set!");
    }
}

    public String getAIResponse(String prompt) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            JSONObject body = new JSONObject();
            body.put("model", "sarvam-m");

            JSONArray messages = new JSONArray();
            JSONObject userMessage = new JSONObject();
            userMessage.put("role", "user");
            userMessage.put("content", prompt);
            messages.put(userMessage);
            body.put("messages", messages);

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.sarvam.ai/v1/chat/completions"))
                .header("Content-Type", "application/json")
                .header("api-subscription-key", SARVAM_API_KEY)
                .POST(HttpRequest.BodyPublishers.ofString(body.toString()))
                .build();

            HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
            );

            JSONObject jsonResponse = new JSONObject(response.body());
            return jsonResponse
                    .getJSONArray("choices")
                    .getJSONObject(0)
                    .getJSONObject("message")
                    .getString("content");

        } catch (Exception e) {
            e.printStackTrace();
            return "Error calling Sarvam API.";
        }
    }
}