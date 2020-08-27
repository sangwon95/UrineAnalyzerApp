package com.example.urineanalyzer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.urineanalyzer.R;

public class SettingFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_setting, container, false);

/*        editText = view.findViewById(R.id.search_edt);
        listview = view.findViewById(R.id.listview);
        editText.setImeOptions(EditorInfo.IME_ACTION_SEARCH);
        editText.setInputType(InputType.TYPE_CLASS_TEXT);
        editText.setOnEditorActionListener(this);*/

        return view;
    }
}
