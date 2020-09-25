package com.example.bottomnav.ui.acc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AccViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Acc fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
