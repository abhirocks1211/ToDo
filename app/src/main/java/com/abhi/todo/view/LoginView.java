package com.abhi.todo.view;

public interface LoginView {

    void onSetProgressBarVisibility(int visibility);

    void showValidationErrorEmptyEmail();

    void showValidationErrorInvalidEmail();

    void showValidationErrorEmptyPassword();

    void loginSuccessFully();

    void loginFail(String message);

}
