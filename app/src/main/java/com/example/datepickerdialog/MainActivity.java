package com.example.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
     private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdata ();
            }
        });
    }
  public   void  showdata()
  {
      DatePickerDialog datePickerDialogd=new DatePickerDialog(
              this,this,Calendar.getInstance().get(Calendar.YEAR),
              Calendar.getInstance().get(Calendar.MONTH),
              Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

      );
      datePickerDialogd.show();
  }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        String date =+dayOfMonth+"/" + (month+1)+ "/" + year;
        textView.setText(date);
    }
}