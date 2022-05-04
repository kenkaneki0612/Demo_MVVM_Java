package com.example.demo_mvvm_java;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallback loginResultCallback;

    public LoginViewModel(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
        this.user = new User();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LoginResultCallback getLoginResultCallback() {
        return loginResultCallback;
    }

    public void setLoginResultCallback(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
    }

    public TextWatcher emailTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setEmail(editable.toString());
            }
        };
    }

    public TextWatcher passwordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setPassword(editable.toString());
            }
        };
    }

    public void onLoginBtnClick(View view) {
        if (user.isValidData()) {
            loginResultCallback.onSuccess("Login OK!");
        } else {
            loginResultCallback.onError("NO NO NO");
        }
    }
}
