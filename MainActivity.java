package com.example.wrathspectre.numeralsystemconverter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button1, button2, button3, button4, button5, button6, button7, button8;

    int inputSystem = 0, outputSystem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText);

        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setInputType(InputType.TYPE_NULL);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);

        final Button inputButtons[] = new Button[4];
        inputButtons[0] = button1;
        inputButtons[1] = button2;
        inputButtons[2] = button3;
        inputButtons[3] = button4;

        final Button outputButtons[] = new Button[4];
        outputButtons[0] = button5;
        outputButtons[1] = button6;
        outputButtons[2] = button7;
        outputButtons[3] = button8;

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(InputValidation(value, inputSystem)) {
                        if(editText1.getCurrentTextColor() == Color.parseColor("#ff0000"))
                            editText1.setTextColor(Color.parseColor("#000000"));

                        if(inputSystem != 0 && outputSystem != 0) {
                            String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                            editText2.setText(convertedValue);
                        }
                    }

                    else {
                        editText1.setTextColor(Color.parseColor("#ff0000"));
                        ResetButtons(inputButtons);
                        ResetButtons(outputButtons);
                        editText2.setText("");
                        inputSystem = 0;
                        outputSystem = 0;

                        Toast.makeText(getApplicationContext(), "Input value contains invalid numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                else {
                    ResetButtons(inputButtons);
                    ResetButtons(outputButtons);
                    editText2.setText("");
                    inputSystem = 0;
                    outputSystem = 0;

                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(InputValidation(value, 2)) {
                        if(editText1.getCurrentTextColor() == Color.parseColor("#ff0000"))
                            editText1.setTextColor(Color.parseColor("#000000"));

                        ResetButtons(inputButtons);
                        button1.setTextColor(Color.parseColor("#ff6d00"));

                        inputSystem = 2;

                        if(outputSystem != 0) {
                            String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                            editText2.setText(convertedValue);

                            editText2.requestFocus();
                        }
                    }

                    else {
                        editText1.setTextColor(Color.parseColor("#ff0000"));
                        ResetButtons(inputButtons);
                        ResetButtons(outputButtons);
                        editText2.setText("");
                        inputSystem = 0;
                        outputSystem = 0;

                        Toast.makeText(getApplicationContext(), "Input value contains invalid numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(InputValidation(value, 8)) {
                        if(editText1.getCurrentTextColor() == Color.parseColor("#ff0000"))
                            editText1.setTextColor(Color.parseColor("#000000"));

                        ResetButtons(inputButtons);
                        button2.setTextColor(Color.parseColor("#ff6d00"));

                        inputSystem = 8;

                        if(outputSystem != 0) {
                            String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                            editText2.setText(convertedValue);

                            editText2.requestFocus();
                        }
                    }

                    else {
                        editText1.setTextColor(Color.parseColor("#ff0000"));
                        ResetButtons(inputButtons);
                        ResetButtons(outputButtons);
                        editText2.setText("");
                        inputSystem = 0;
                        outputSystem = 0;

                        Toast.makeText(getApplicationContext(), "Input value contains invalid numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(InputValidation(value, 10)) {
                        if(editText1.getCurrentTextColor() == Color.parseColor("#ff0000"))
                            editText1.setTextColor(Color.parseColor("#000000"));

                        ResetButtons(inputButtons);
                        button3.setTextColor(Color.parseColor("#ff6d00"));

                        inputSystem = 10;

                        if(outputSystem != 0) {
                            String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                            editText2.setText(convertedValue);

                            editText2.requestFocus();
                        }
                    }

                    else {
                        editText1.setTextColor(Color.parseColor("#ff0000"));
                        ResetButtons(inputButtons);
                        ResetButtons(outputButtons);
                        editText2.setText("");
                        inputSystem = 0;
                        outputSystem = 0;

                        Toast.makeText(getApplicationContext(), "Input value contains invalid numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(InputValidation(value, 16)) {
                        if(editText1.getCurrentTextColor() == Color.parseColor("#ff0000"))
                            editText1.setTextColor(Color.parseColor("#000000"));

                        ResetButtons(inputButtons);
                        button4.setTextColor(Color.parseColor("#ff6d00"));

                        inputSystem = 16;

                        if(outputSystem != 0) {
                            String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                            editText2.setText(convertedValue);

                            editText2.requestFocus();
                        }
                    }

                    else {
                        editText1.setTextColor(Color.parseColor("#ff0000"));
                        ResetButtons(inputButtons);
                        ResetButtons(outputButtons);
                        editText2.setText("");
                        inputSystem = 0;
                        outputSystem = 0;

                        Toast.makeText(getApplicationContext(), "Input value contains invalid numbers", Toast.LENGTH_SHORT).show();
                    }
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(inputSystem != 0) {
                        ResetButtons(outputButtons);
                        button5.setTextColor(Color.parseColor("#ff6d00"));

                        outputSystem = 2;

                        String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                        editText2.setText(convertedValue);

                        editText2.requestFocus();
                    }

                    else
                        Toast.makeText(getApplicationContext(), "Choose input system", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(inputSystem != 0) {
                        ResetButtons(outputButtons);
                        button6.setTextColor(Color.parseColor("#ff6d00"));

                        outputSystem = 8;

                        String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                        editText2.setText(convertedValue);

                        editText2.requestFocus();
                    }

                    else
                        Toast.makeText(getApplicationContext(), "Choose input system", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(inputSystem != 0) {
                        ResetButtons(outputButtons);
                        button7.setTextColor(Color.parseColor("#ff6d00"));

                        outputSystem = 10;

                        String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                        editText2.setText(convertedValue);

                        editText2.requestFocus();
                    }

                    else
                        Toast.makeText(getApplicationContext(), "Choose input system", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText1.getText().toString();

                if(!value.isEmpty()) {
                    if(inputSystem != 0) {
                        ResetButtons(outputButtons);
                        button8.setTextColor(Color.parseColor("#ff6d00"));

                        outputSystem = 16;

                        String convertedValue = SystemConverter(value, inputSystem, outputSystem);
                        editText2.setText(convertedValue);

                        editText2.requestFocus();
                    }

                    else
                        Toast.makeText(getApplicationContext(), "Choose input system", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(getApplicationContext(), "Empty input value", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void ResetButtons(Button buttons[]) {
        for(Button bt: buttons) {
            if(bt.getCurrentTextColor() == Color.parseColor("#ff6d00"))
                bt.setTextColor(Color.parseColor("#000000"));
        }
    }

    private Boolean InputValidation(final String value, final int system) {
        Character[] bin = new Character[] {'0', '1'};
        Character[] oct = new Character[] {'0', '1', '2', '3', '4', '5', '6', '7'};
        Character[] dec = new Character[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Character[] hex = new Character[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        ArrayList<Character> list = new ArrayList<Character>();

        switch(system) {
            case 2:
                list.addAll(Arrays.asList(bin));

                for(int i = 0; i < value.length(); i++)
                    if(!list.contains(value.charAt(i))) return false;

                break;

            case 8:
                list.addAll(Arrays.asList(oct));

                for(int i = 0; i < value.length(); i++)
                    if(!list.contains(value.charAt(i))) return false;

                break;

            case 10:
                list.addAll(Arrays.asList(dec));

                for(int i = 0; i < value.length(); i++)
                    if(!list.contains(value.charAt(i))) return false;

                break;

            case 16:
                list.addAll(Arrays.asList(hex));

                for(int i = 0; i < value.length(); i++)
                    if(!list.contains(value.charAt(i))) return false;

                break;
        }

        return true;
    }

    private String SystemConverter(final String value, final int inputSystem, final int outputSystem) {
        String returnValue = "";

        switch(inputSystem) {
            case 2:
                if(outputSystem == 2)
                    returnValue = value;

                else {
                    long intValue = Long.parseLong(value);
                    returnValue = DecimalToSystem(SystemToDecimal(intValue, inputSystem), outputSystem);
                }

                break;

            case 8:
                if(outputSystem == 8)
                    returnValue = value;

                else {
                    long intValue = Long.parseLong(value);
                    returnValue = DecimalToSystem(SystemToDecimal(intValue, inputSystem), outputSystem);
                }

                break;

            case 10:
                if(outputSystem == 10)
                    returnValue = value;

                else {
                    long intValue = Long.parseLong(value);
                    returnValue = DecimalToSystem(intValue, outputSystem);
                }

                break;

            case 16:
                if(outputSystem == 16)
                    returnValue = value;

                else {
                    long intValue = Integer.parseInt(HexToInt(value));
                    returnValue = DecimalToSystem(SystemToDecimal(intValue, inputSystem), outputSystem);
                }

                break;
        }

        return returnValue;
    }

    private long SystemToDecimal(final long value, final int system) {
        long decVal = 0, tmp = value;
        int factor = 1;

        while(tmp > 0) {
            decVal += (tmp % 10) * factor;
            tmp /= 10;
            factor *= system;
        }

        return decVal;
    }

    private String DecimalToSystem(final long value, final int system) {
        String retVal = "";
        long tmp = value;

        while(tmp > 0) {
            if(tmp % system < 10)
                retVal += String.valueOf(Character.toChars((int) tmp % system + 48));

            else
                retVal +=  String.valueOf(Character.toChars((int)tmp % system + 55));

            tmp /= system;
        }

        StringBuilder stringBuilder = new StringBuilder(retVal);
        retVal = stringBuilder.reverse().toString();

        return retVal;
    }

    private String HexToInt(final String value) {
        StringBuilder returnValue = new StringBuilder();

        Map<String, String> values = new HashMap<String, String>();
        values.put("A", "10");
        values.put("B", "11");
        values.put("C", "12");
        values.put("D", "13");
        values.put("E", "14");
        values.put("F", "15");

        for(int i = 0; i < value.length(); i++)
        {
            if(values.containsKey(Character.toString(value.charAt(i))))
                returnValue.append(values.get(Character.toString(value.charAt(i))));

            else
                returnValue.append(value.charAt(i));
        }

        return returnValue.toString();
    }
}
