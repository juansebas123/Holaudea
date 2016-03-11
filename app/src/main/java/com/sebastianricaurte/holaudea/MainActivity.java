package com.sebastianricaurte.holaudea;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTo, eSubject, eMessage;
    Button bSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplocompleto);

        eTo=(EditText)findViewById(R.id.eTo);
        eSubject=(EditText)findViewById(R.id.eSubject);
        eMessage=(EditText)findViewById(R.id.eMessage);
        bSend=(Button)findViewById(R.id.bSend);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to, subject, message;

                to = eTo.getText().toString();
                subject = eSubject.toString();
                message = to + " y " + subject;
                eMessage.setText(message);
            }
        });

        }
}




