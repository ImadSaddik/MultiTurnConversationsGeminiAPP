package com.example.multiturnconversationsgeminiapp;

public interface ResponseCallback {
    void onResponse(String response);
    void onError(Throwable throwable);
}
