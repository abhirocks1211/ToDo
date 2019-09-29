package com.abhi.todo.view;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.abhi.todo.models.ToDoModel;

public interface ToDoListingView {

    void onGetDataSuccess(FirestoreRecyclerOptions<ToDoModel> list);

    void onGetDataFailure(String message);

    void logoutUser();

}
