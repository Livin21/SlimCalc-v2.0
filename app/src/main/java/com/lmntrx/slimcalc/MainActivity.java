package com.lmntrx.slimcalc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnMultiply, btnDivide, btnA, btnB, btnC, btnEquals, btnDot, btnClear;
    TextView Display;
    String operator = "", lastPress = "", op = "";
    double a = 0;
    boolean memoryCleared = false, longClickA = false, longClickB = false, longClickBack = false, negativeInitiated, isVibrationOn, isThemeDark;
    Context con;
    MenuItem about;
    Vibrator mVibrator;
    SettingsActivity settings;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        settings = new SettingsActivity();
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        isVibrationOn = sp.getBoolean("VIBRATE_CHECKBOX", true);
        isThemeDark = sp.getBoolean("THEME_CHECKBOX", true);
        if(isThemeDark){
            setContentView(R.layout.activity_main);
        }
        else {
            setContentView(R.layout.light_theme);
        }
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mVibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        toast=Toast.makeText(this,"",Toast.LENGTH_SHORT);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnA = (Button) findViewById(R.id.storeA);
        btnB = (Button) findViewById(R.id.storeB);
        btnC = (Button) findViewById(R.id.storeC);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEquals = (Button) findViewById(R.id.btnEqual);
        Display = (TextView) findViewById(R.id.display);
        con = this;
        about = (MenuItem) findViewById(R.id.action_about);
        View.OnLongClickListener bt_Click = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                A = 0;
                B = 0;
                memoryCleared = true;
                longClickBack = true;
                vibrate(200);
                toast.setText("Memory Cleared");
                toast.show();
                return false;
            }
        };
        btnClear.setOnLongClickListener(bt_Click);
        View.OnLongClickListener A_LongClick = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                A = 0;
                longClickA = true;
                vibrate(200);
                toast.setText("A Cleared");
                toast.show();
                return false;
            }
        };
        btnA.setOnLongClickListener(A_LongClick);
        View.OnLongClickListener B_LongClick = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                B = 0;
                longClickB = true;
                vibrate(200);
                toast.setText("B Cleared");
                toast.show();
                return false;
            }
        };
        btnB.setOnLongClickListener(B_LongClick);
    }


    public void readAndDisplay(View v) {
        vibrate(25);
        if (lastPress.equals("=")) {
            clearAll();
            lastPress = "";
        }
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        switch (v.getId()) {
            case R.id.btn0:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "0");
                break;
            case R.id.btn1:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "1");
                break;
            case R.id.btn2:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "2");
                break;
            case R.id.btn3:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "3");
                break;
            case R.id.btn4:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "4");
                break;
            case R.id.btn5:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "5");
                break;
            case R.id.btn6:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "6");
                break;
            case R.id.btn7:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "7");
                break;
            case R.id.btn8:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "8");
                break;
            case R.id.btn9:
                if (lastPress.equals("+") || lastPress.equals("*") || lastPress.equals("/") || lastPress.equals("A") || lastPress.equals("B")) {
                    clearAll();
                    lastPress = "";
                } else if (lastPress.equals("-")) {
                    if (negativeInitiated) {
                        lastPress = "";
                    } else {
                        clearAll();
                        lastPress = "";
                    }

                }
                Display.setText(Display.getText() + "9");
                break;
        }
    }

    public void add(View v) {
        op = "+";
        if ((Display.getText() + "").equals("") || (Display.getText() + "").equals(".")) {
            ;
        } else if (lastPress == "+" || lastPress == "-" || lastPress == "*" || lastPress == "/") {
            switch (op) {
                case "+":
                    lastPress = "+";
                    operator = "+";
                    break;
                case "-":
                    lastPress = "-";
                    operator = "-";
                    break;
                case "*":
                    lastPress = "*";
                    operator = "*";
                    break;
                case "/":
                    lastPress = "/";
                    operator = "/";
                    break;
            }
            vibrate(25);
        } else {
            if (operator.equals("+")) {
                a += Double.parseDouble(Display.getText() + "");
                operator = "+";
                lastPress = "+";

            } else if (operator.equals("-")) {
                a -= Double.parseDouble(Display.getText() + "");
                operator = "+";
                lastPress = "+";

            } else if (operator.equals("*")) {
                a *= Double.parseDouble(Display.getText() + "");
                operator = "+";
                lastPress = "+";

            } else if (operator.equals("/")) {
                a /= Double.parseDouble(Display.getText() + "");
                operator = "+";
                lastPress = "+";

            } else {
                a = Double.parseDouble(Display.getText() + "");
                operator = "+";
                lastPress = "+";

            }
            vibrate(25);
        }

    }

    public void sub(View v) {
        if (negative(v)) {
            lastPress = "-";
        } else {
            op = "-";
            if ((Display.getText() + "").equals("") || (Display.getText() + "").equals(".")) {
                ;
            } else if (lastPress == "+" || lastPress == "-" || lastPress == "*" || lastPress == "/") {
                switch (op) {
                    case "+":
                        lastPress = "+";
                        operator = "+";
                        break;
                    case "-":
                        lastPress = "-";
                        operator = "-";
                        break;
                    case "*":
                        lastPress = "*";
                        operator = "*";
                        break;
                    case "/":
                        lastPress = "/";
                        operator = "/";
                        break;
                }
                vibrate(25);
            } else {
                if (operator.equals("+")) {
                    a += Double.parseDouble(Display.getText() + "");
                    operator = "-";
                    lastPress = "-";

                } else if (operator.equals("-")) {
                    a -= Double.parseDouble(Display.getText() + "");
                    operator = "-";
                    lastPress = "-";

                } else if (operator.equals("*")) {
                    a *= Double.parseDouble(Display.getText() + "");
                    operator = "-";
                    lastPress = "-";

                } else if (operator.equals("/")) {
                    a /= Double.parseDouble(Display.getText() + "");
                    operator = "-";
                    lastPress = "-";

                } else {
                    a = Double.parseDouble(Display.getText() + "");
                    operator = "-";
                    lastPress = "-";

                }
                vibrate(25);
            }
        }
    }

    public boolean negative(View v) {
        if (((Display.getText() + "").equals("") && a == 0) || ((Display.getText() + "").equals(".") && a == 0)) {
            Display.setText("-");
            negativeInitiated = true;
            vibrate(25);
            return true;
        } else {
            negativeInitiated = false;
            return false;
        }
    }

    public void multiply(View v) {
        op = "*";
        if ((Display.getText() + "").equals("") || (Display.getText() + "").equals(".")) {
            ;
        } else if (lastPress == "+" || lastPress == "-" || lastPress == "*" || lastPress == "/") {
            switch (op) {
                case "+":
                    lastPress = "+";
                    operator = "+";
                    break;
                case "-":
                    lastPress = "-";
                    operator = "-";
                    break;
                case "*":
                    lastPress = "*";
                    operator = "*";
                    break;
                case "/":
                    lastPress = "/";
                    operator = "/";
                    break;
            }
            vibrate(25);
        } else {
            if (operator.equals("+")) {
                a += Double.parseDouble(Display.getText() + "");
                operator = "*";
                lastPress = "*";

            } else if (operator.equals("-")) {
                a -= Double.parseDouble(Display.getText() + "");
                operator = "*";

                lastPress = "*";
            } else if (operator.equals("*")) {
                a *= Double.parseDouble(Display.getText() + "");
                operator = "*";
                lastPress = "*";

            } else if (operator.equals("/")) {
                a /= Double.parseDouble(Display.getText() + "");
                operator = "*";
                lastPress = "*";

            } else {
                a = Double.parseDouble(Display.getText() + "");
                operator = "*";
                lastPress = "*";

            }
            vibrate(25);
        }
    }

    public void divide(View v) {
        op = "/";
        if ((Display.getText() + "").equals("") || (Display.getText() + "").equals(".")) {
            ;
        } else if (lastPress == "+" || lastPress == "-" || lastPress == "*" || lastPress == "/") {
            switch (op) {
                case "+":
                    lastPress = "+";
                    operator = "+";
                    break;
                case "-":
                    lastPress = "-";
                    operator = "-";
                    break;
                case "*":
                    lastPress = "*";
                    operator = "*";
                    break;
                case "/":
                    lastPress = "/";
                    operator = "/";
                    break;
            }
            vibrate(25);
        } else {
            if (operator.equals("+")) {
                a += Double.parseDouble(Display.getText() + "");
                operator = "/";
                lastPress = "/";
            } else if (operator.equals("-")) {
                a -= Double.parseDouble(Display.getText() + "");
                operator = "/";
                lastPress = "/";
            } else if (operator.equals("*")) {
                a *= Double.parseDouble(Display.getText() + "");
                operator = "/";
                lastPress = "/";

            } else if (operator.equals("/")) {
                a /= Double.parseDouble(Display.getText() + "");
                operator = "/";
                lastPress = "/";

            } else {
                a = Double.parseDouble(Display.getText() + "");
                operator = "/";
                lastPress = "/";

            }
            vibrate(25);
        }
    }

    public void equal(View v) {
        switch (operator) {
            case "+": {
                try {
                    Display.setText(Double.parseDouble(Display.getText() + "") + a + "");
                } catch (Exception e) {
                }
                break;
            }
            case "-": {
                try {
                    Display.setText(a - Double.parseDouble(Display.getText() + "") + "");
                } catch (Exception e) {
                }
                break;
            }
            case "*": {
                try {
                    Display.setText(a * Double.parseDouble(Display.getText() + "") + "");
                } catch (Exception e) {
                }
                break;

            }
            case "/": {
                try {
                    Display.setText(a / Double.parseDouble(Display.getText() + "") + "");
                } catch (Exception e) {
                }
                break;
            }
        }
        vibrate(25);
        a = 0;
        lastPress = "=";
        operator = "";

    }

    public void decimal(View v) {
        if (lastPress.equals("=")) {
            clearAll();
            lastPress = "";
        }
        Display.append(".");
        vibrate(25);
    }

    public void clearAll() {
        Display.setText("");
    }

    public void back(View v) {
        if (longClickBack == false) {
            String h = Display.getText() + "", k = "";
            int l = h.length();
            int i = 0, j = 0;
            while (i < (l - 1)) {
                k += h.charAt(i);
                i++;
            }
            Display.setText(k);
            k = "";
            vibrate(25);
        } else
            ;
        longClickBack = false;
    }

    boolean A_On = false, B_On = false;
    double A = 0, B = 0;

    public void storeA(View v) {
        if (longClickA == false) {
            if (A == 0 && B == 0)
                memoryCleared = true;
            else if (A != 0 || B != 0)
                memoryCleared = false;
            if (memoryCleared || A == 0) {
                if (Display.getText().toString().isEmpty())
                    ;
                else {
                    A = Double.parseDouble(Display.getText() + "");
                    vibrate(100);
                    toast.setText("Value stored in A");
                    toast.show();
                    lastPress = "A";
                }
            } else {
                clearAll();
                vibrate(25);
                Display.setText(A + "");
                A_On = false;
            }
        } else
            ;

        longClickA = false;

    }

    public void storeB(View v) {
        if (longClickB == false) {
            if (A == 0 && B == 0)
                memoryCleared = true;
            else if (A != 0 || B != 0)
                memoryCleared = false;
            if (memoryCleared || B == 0) {
                if (Display.getText().toString().isEmpty())
                    ;
                else {
                    B = Double.parseDouble(Display.getText() + "");
                    memoryCleared = false;
                    vibrate(100);
                    toast.setText("Value stored in B");
                    toast.show();
                    lastPress = "B";
                }
            } else {
                clearAll();
                vibrate(25);
                Display.setText(B + "");
                B_On = false;
            }
        } else
            ;

        longClickB = false;
    }

    public void clear(View v) {
        clearAll();
        vibrate(50);
        a = 0;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_about) {
            Intent intent = new Intent(con, About.class);
            startActivity(intent);
        } else if (id == R.id.action_settings) {
            Intent intent = new Intent(con, SettingsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        isVibrationOn = sp.getBoolean("VIBRATE_CHECKBOX", true);
        isThemeDark = sp.getBoolean("THEME_CHECKBOX", true);
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    public void vibrate(long l) {

        if (isVibrationOn) {
            mVibrator.vibrate(l);
        } else if ((isVibrationOn + "").equals("")) {
            mVibrator.vibrate(l);
        }
    }
}



