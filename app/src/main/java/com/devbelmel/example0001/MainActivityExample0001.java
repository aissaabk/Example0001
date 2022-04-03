package com.devbelmel.example0001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityExample0001 extends AppCompatActivity {
//نقوم بتعرف المتغير textview
    TextView textView;
 //تعريف الزر Button
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_example0001);
        textView=(TextView)findViewById(R.id.textView);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new changeText());
    }

    private class changeText implements View.OnClickListener {
        @Override
        public void onClick(View view) {
if(textView.getText().toString().equals(getString(R.string.text_view)))
                textView.setText(R.string.text_after_change_text);
else
    textView.setText(R.string.text_view);
        }
    }
}