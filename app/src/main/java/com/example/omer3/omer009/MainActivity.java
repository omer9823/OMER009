package com.example.omer3.omer009;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch st;
    LinearLayout bg;
    Button btn1;
    boolean bo1;
    boolean bo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.tb);
        st = (Switch) findViewById(R.id.st);
        bg = (LinearLayout) findViewById(R.id.bg);
        btn1 = (Button) findViewById(R.id.btn1);


    }

    public void omer1(View view) {
        bo1 = tb.isChecked();
    }

    public void omer2(View view) {
        bo2 = st.isChecked();
    }


    public void omer3(View view) {
        if (bo1 && bo2) {
            bg.setBackgroundColor(Color.GREEN);
        } else {
            if (bo1 && !bo2) {
                bg.setBackgroundColor(Color.GRAY);
            } else {
                if (!bo1 && bo2) {
                    bg.setBackgroundColor(Color.RED);
                } else {
                    if (!bo1 && !bo2) {
                        bg.setBackgroundColor(Color.BLUE);
                    }


                }
            }
        }
    }
}














