package com.example.user.shke;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tr;
Switch st;
Button btn;
LinearLayout ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tr=(ToggleButton) findViewById(R.id.toggleButton2);
        st=(Switch) findViewById(R.id.switch1);
        ln=(LinearLayout) findViewById(R.id.albert);
    }
    public void shkede(View view) {
    if (tr.isChecked()&&(st.isChecked())){
        ln.setBackgroundColor(Color.BLACK);
    }
    if(!tr.isChecked()&&(st.isChecked())){
        ln.setBackgroundColor(Color.RED);
    }
    if(tr.isChecked()&&(!st.isChecked())){
        ln.setBackgroundColor(Color.BLUE);
    }
    if(!tr.isChecked()&&(!st.isChecked())) {
        ln.setBackgroundColor(Color.YELLOW);
    }
    }
}
