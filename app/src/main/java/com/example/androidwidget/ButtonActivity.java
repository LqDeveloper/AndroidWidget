package com.example.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        RadioGroup radioGroup = findViewById(R.id.rg);

        radioGroup.setOnCheckedChangeListener((group,checkedId)->{
            if (checkedId == R.id.rg_man){
                Log.d("RadioGroup","选择了男的");
            }else {
                Log.d("RadioGroup","选择了女的");
            }
        });


        CheckBox checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(( buttonView,isChecked)->{
           if (isChecked){
               Log.d("CheckBox","选中了");
           }else {
               Log.d("CheckBox","未选中了");
           }
        });

    }
}
