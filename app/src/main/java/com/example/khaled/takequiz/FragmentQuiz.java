package com.example.khaled.takequiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.rest.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class FragmentQuiz extends Fragment {
    private TextView ques;
    private RadioButton ans;
    private RadioGroup radioGroup;
    private List<RadioButton> choicecontainer = new Vector<RadioButton>();



@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View question = (ScrollView)inflater.inflate(R.layout.activity_questions,
                container, false);
        choicecontainer.add(0,ans);
        ques = (TextView)question.findViewById(R.id.textView2);
        ans = (RadioButton)question.findViewById(R.id.radioButton);
        radioGroup = (RadioGroup)question.findViewById(R.id.radio);
        return question;
    }
    public RadioGroup getRadioGroup()
    {
        return radioGroup;
    }
    public TextView getTextView ()
    {
        return ques;
    }
    public RadioButton getRadioButton()
    {
        return ans;
    }
    public List<RadioButton> getChoicecontainer()
    {
        return choicecontainer;
    }
    public void setChoicecontainer(int i,RadioButton R)
    {
        choicecontainer.add(i,R);
    }
}