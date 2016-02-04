package org.pltw.examples.collegeapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PLTW on 1/26/2016.
 */
public class Language extends DialogFragment {
    private Button mLangButton;
    private String mLanguage;

    public Dialog onCreateDialog(Bundle savedInstanceState) {

  ;



    View v = getActivity().getLayoutInflater()
            .inflate(R.layout.language, null);



    return new AlertDialog.Builder(getActivity())
            .setView(v)
            .setTitle(R.string.language_title)
            .setPositiveButton(android.R.string.ok,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
            .create();
}
}
