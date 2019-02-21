package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.input;
import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    void convertKGTOALL() {
        EditText kg = (EditText) findViewById(R.id.kg);
        kg.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText g = (EditText) findViewById(R.id.g);
        g.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText mg = (EditText) findViewById(R.id.mg);
        mg.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(kg.getText().toString());
        double result = a * 1000;
        double result2 = a * 10000;
        g.setText(String.valueOf(result));
        mg.setText(String.valueOf(result2));

    }

    void convertGTOALL() {
        EditText kg = (EditText) findViewById(R.id.kg);
        kg.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText g = (EditText) findViewById(R.id.g);
        g.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText mg = (EditText) findViewById(R.id.mg);
        mg.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(g.getText().toString());
        double result = a / 1000;
        double result2 = a * 10;
        kg.setText(String.valueOf(result));
        mg.setText(String.valueOf(result2));

    }

    void convertMGTOALL() {
        EditText kg = (EditText) findViewById(R.id.kg);
        kg.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText g = (EditText) findViewById(R.id.g);
        g.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText mg = (EditText) findViewById(R.id.mg);
        mg.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(mg.getText().toString());
        double result = a / 1000;
        double result2 = a / 10;
        kg.setText(String.valueOf(result));
        g.setText(String.valueOf(result2));

    }


    public void click (View view) {
        convertKGTOALL();
    }

    public void click2 (View view) {
        convertGTOALL();
    }

    public void click3 (View view) {
        convertMGTOALL();
    }

    public void reset(View view) {
        Button submit = (Button) findViewById(R.id.submit);
        submit.setEnabled(true);


        EditText kg = (EditText) findViewById(R.id.kg);
        EditText g = (EditText) findViewById(R.id.g);
        EditText mg = (EditText) findViewById(R.id.mg);
        kg.setText("");
        g.setText("");
        mg.setText("");
    }


    void convertLTOALL() {
        EditText l = (EditText) findViewById(R.id.l);
        l.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText ml = (EditText) findViewById(R.id.ml);
        ml.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText o = (EditText) findViewById(R.id.o);
        o.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(l.getText().toString());
        double result = a * 1000;
        double result2 = a * 33.814;
        ml.setText(String.valueOf(result));
        o.setText(String.valueOf(result2));

    }

    void convertMLTOALL() {
        EditText l = (EditText) findViewById(R.id.l);
        l.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText ml = (EditText) findViewById(R.id.ml);
        ml.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText o = (EditText) findViewById(R.id.o);
        o.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(ml.getText().toString());
        double result = a / 1000;
        double result2 = a / 0.033814;
        l.setText(String.valueOf(result));
        o.setText(String.valueOf(result2));

    }

    void convertOTOALL() {
        EditText l = (EditText) findViewById(R.id.l);
        l.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText ml = (EditText) findViewById(R.id.ml);
        ml.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText o = (EditText) findViewById(R.id.o);
        o.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(o.getText().toString());
        double result = a / 33.814;
        double result2 = a * 29.574;
        l.setText(String.valueOf(result));
        ml.setText(String.valueOf(result2));

    }


    public void click4 (View view) {
        convertLTOALL();
    }

    public void click5 (View view) {
        convertMLTOALL();
    }

    public void click6 (View view) {
        convertOTOALL();
    }

    public void reset2(View view) {
        Button submit = (Button) findViewById(R.id.submit);
        submit.setEnabled(true);


        EditText l = (EditText) findViewById(R.id.l);
        EditText ml = (EditText) findViewById(R.id.ml);
        EditText o = (EditText) findViewById(R.id.o);
        l.setText("");
        ml.setText("");
        o.setText("");
    }

    void convertKMTOALL() {
        EditText km = (EditText) findViewById(R.id.km);
        km.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText m = (EditText) findViewById(R.id.m);
        m.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText cm = (EditText) findViewById(R.id.cm);
        cm.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText mm = (EditText) findViewById(R.id.mm);
        mm.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(km.getText().toString());
        double result = a * 1000;
        double result2 = a * 100000;
        double result3 = a * 1000000;
        m.setText(String.valueOf(result));
        cm.setText(String.valueOf(result2));
        mm.setText(String.valueOf(result3));
    }

    void convertMTOALL() {
        EditText km = (EditText) findViewById(R.id.km);
        km.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText m = (EditText) findViewById(R.id.m);
        m.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText cm = (EditText) findViewById(R.id.cm);
        cm.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText mm = (EditText) findViewById(R.id.mm);
        mm.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(m.getText().toString());
        double result = a / 1000;
        double result2 = a * 100;
        double result3 = a * 1000;
        km.setText(String.valueOf(result));
        cm.setText(String.valueOf(result2));
        mm.setText(String.valueOf(result3));

    }

    void convertCMTOALL() {
        EditText km = (EditText) findViewById(R.id.km);
        km.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText m = (EditText) findViewById(R.id.m);
        m.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText cm = (EditText) findViewById(R.id.cm);
        cm.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText mm = (EditText) findViewById(R.id.mm);
        mm.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(cm.getText().toString());
        double result = a / 1000;
        double result2 = a / 100;
        double result3 = a * 10;
        km.setText(String.valueOf(result));
        m.setText(String.valueOf(result2));
        mm.setText(String.valueOf(result3));

    }

    void convertMMTOALL() {
        EditText km = (EditText) findViewById(R.id.km);
        km.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText m = (EditText) findViewById(R.id.m);
        m.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText cm = (EditText) findViewById(R.id.cm);
        cm.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText mm = (EditText) findViewById(R.id.mm);
        mm.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = Double.parseDouble(mm.getText().toString());
        double result = a / 1000;
        double result2 = a / 100;
        double result3 = a / 10;
        km.setText(String.valueOf(result));
        m.setText(String.valueOf(result2));
        cm.setText(String.valueOf(result3));

    }


    public void click7 (View view) {
        convertKMTOALL();
    }

    public void click8 (View view) {
        convertMTOALL();
    }

    public void click9 (View view) {
        convertCMTOALL();
    }

    public void click10 (View view) {
        convertMMTOALL();
    }

    public void reset3(View view) {
        Button submit = (Button) findViewById(R.id.submit);
        submit.setEnabled(true);


        EditText km = (EditText) findViewById(R.id.km);
        EditText m = (EditText) findViewById(R.id.m);
        EditText cm = (EditText) findViewById(R.id.cm);
        EditText mm = (EditText) findViewById(R.id.mm);
        km.setText("");
        m.setText("");
        cm.setText("");
        mm.setText("");
    }
}


