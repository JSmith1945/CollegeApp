package org.pltw.examples.collegeapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

/**
 * Created by PLTW on 1/27/2016.
 */

public class LanguageFragment extends DialogFragment {






    private void initView(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.addView(inflater.inflate(R.layout.language, null));
    }

    private void addView(View inflate) {
    }

    public static final String EXTRA_LANG =
            "org.pltw.examples.collegeapp.lang";


    public static LanguageFragment newInstance(String lang) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_LANG, lang);

        LanguageFragment fragment = new LanguageFragment();
        fragment.setArguments(args);

        return fragment;

    }
    }


