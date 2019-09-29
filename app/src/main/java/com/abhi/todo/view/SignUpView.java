package com.abhi.todo.view;

public interface SignUpView {

    void onSetProgressBarVisibility(int visibility);

    void showValidationErrorEmptyFirstName();

    void showValidationErrorEmptyLastName();

    void showValidationErrorEmptyEmail();

    void showValidationErrorInvalidEmail();

    void showValidationErrorEmptyPassword();

    void showValidationErrorInvalidPassword();

    void showValidationErrorEmptyConfirmPassword();

    void showValidationErrorConfirmPasswordNotMatch();

    void signUpSuccessFully();

    void signUpFail(String message);

}
