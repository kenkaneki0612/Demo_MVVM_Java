package com.example.demo_mvvm_java;

public interface LoginResultCallback {
    public void onSuccess (String message);
    public void onError (String message);
}
