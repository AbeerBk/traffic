package com.example.nev.ui.massage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class MassageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MassageViewModel() {
        mText = new MutableLiveData<>();
      //  mText.setValue("This is Email fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}