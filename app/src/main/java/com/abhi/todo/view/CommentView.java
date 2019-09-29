package com.abhi.todo.view;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.abhi.todo.models.CommentModel;

public interface CommentView {

    void setToolbarTitle(String title);

    void onGetDataSuccess(FirestoreRecyclerOptions<CommentModel> list);

    void onGetDataFailure(String message);

    void showValidationErrorEmptyComment();

    void clearCommentText();

    void onSendCommentSuccess();

    void onSendCommentFailure(String message);
}
