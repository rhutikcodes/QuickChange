package dicy.aldindo.quickchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
private ConstraintLayout constraintLayout;
private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout=findViewById(R.id.layout);
        radioGroup=findViewById(R.id.radio);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedViewID) {
                switch (checkedViewID){

                    case R.id.blue:
                        constraintLayout.setBackgroundColor(Color.parseColor("#0ABDE3"));
                        break;
                    case R.id.Red:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FF3031"));
                        break;
                    case R.id.green:
                        constraintLayout.setBackgroundColor(Color.parseColor("#45CE30"));
                        break;
                }


            }
        });


    }
}
