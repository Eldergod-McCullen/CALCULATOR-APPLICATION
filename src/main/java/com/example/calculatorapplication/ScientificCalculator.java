package com.example.calculatorapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScientificCalculator extends AppCompatActivity {
    Button bac,bdel,bbo,bbc,bsin,bcos,btan,blog,bln,bfac,bsquare,broot,brec,bdiv,bmul,bminus,badd,bequal,bpi,bpoint,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView result,working;
    String pi = "3.1429";   // THE VARIABLE PI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.scientific_calculator);

        //DECLARING VARIABLES FOR THE BUTTONS THEN ASSIGNING THEM TO THE APPS ELEMENT IDs
        bac = findViewById(R.id.reset);
        bdel = findViewById(R.id.delete);
        bbo = findViewById(R.id.openbracket);
        bbc = findViewById(R.id.closebracket);
        bsin = findViewById(R.id.sin);
        bcos = findViewById(R.id.cosine);
        btan = findViewById(R.id.tangent);
        blog = findViewById(R.id.logarithm);
        bln = findViewById(R.id.natural_logarithm);
        bfac = findViewById(R.id.factorial);
        bsquare = findViewById(R.id.square);
        broot = findViewById(R.id.squareroot);
        brec = findViewById(R.id.reciprocal);
        bdiv = findViewById(R.id.division);
        bmul = findViewById(R.id.multiplication);
        bminus = findViewById(R.id.subtract);
        badd = findViewById(R.id.addition);
        bequal = findViewById(R.id.equal);
        bpi = findViewById(R.id.pi);
        bpoint = findViewById(R.id.point);
        b0 = findViewById(R.id.zero);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);

        result = findViewById(R.id.result);
        working = findViewById(R.id.working);  //VARIABLES FOR THE TEXTVIEWS:RESULT AND WORKING AREAS

        //ON-CLICK LISTENER FUNCTIONS FOR ALL BUTTONS
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");               // THESE INITIAL BUTTONS FOCUS ON THE NUMERICAL BUTTONS
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {                 // THE POINT BUTTON
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {                    // THE AC BUTTON
            @Override
            public void onClick(View v) {
                result.setText("");
                working.setText("");
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {                   // THE DELETE (DEL) BUTTON
            @Override
            public void onClick(View v) {
                String val = result.getText().toString();
                val = val.substring(0, val.length() - 1);
                result.setText(val);
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {                    // ADDITION
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"+");
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {                 // SUBTRACTION
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {                  // MULTIPLICATION
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {                 // DIVISION
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"÷");
            }
        });
        broot.setOnClickListener(new View.OnClickListener() {                // SQUARE ROOT
            @Override
            public void onClick(View v) {
                String val = result.getText().toString();
                double square_root= Math.sqrt(Double.parseDouble(val));
                result.setText(String.valueOf(square_root));
            }
        });
        bbo.setOnClickListener(new View.OnClickListener() {                // OPENING BRACKET
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"(");
            }
        });
        bbc.setOnClickListener(new View.OnClickListener() {               // CLOSING BRACKET
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {               // THE PI-BUTTON
            @Override
            public void onClick(View v) {
                working.setText(bpi.getText());
                result.setText(result.getText() + pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {            // SIN
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {           // COSINE
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {           // TANGENT
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "tan");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {          // NATURAL LOGARITHM
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {         // LOGARITHM
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "log");
            }
        });
        brec.setOnClickListener(new View.OnClickListener() {        // RECIPROCAL
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "^" + "(-1)");
            }
        });
        bfac.setOnClickListener(new View.OnClickListener() {              // FACTORIAL
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(result.getText().toString());
                int fact= factorial(val);
                result.setText(String.valueOf(fact));
                working.setText(val+"!");
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {                // SQUARE
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(result.getText().toString());
                double square = d * d;
                result.setText(String.valueOf(square));
                working.setText(d+"²");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {                    // TOTAL EVALUATION FOR THE EQUAL SIGN
            @Override
            public void onClick(View v) {
                String val = result.getText().toString();
                String replacedstr = val.replace('÷' , '/').replace('×', '*');
                double answer = eval(replacedstr);
                result.setText(String.valueOf(answer));
                working.setText(val);
            }
        });

       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // FACTORIAL FUNCTION
    int factorial(int n)
    {
        return (n==1 || n==0)? 1:n*factorial(n-1);
    }

    // FUNCTION FOR EVALUATING EVERY CALCULATION TO TAKE PLACE
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;      // POSITIONING OF THE CHARACTERS
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();                       // IF THERE IS NO CHARACTER
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }
            
            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm();           // ADDITION CALCULATION
                    else if (eat('-')) x -= parseTerm();      // SUBTRACTION CALCULATION
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor();         // MULTIPLICATION CALCULATION
                    else if (eat('/')) x /= parseFactor();   // DIVISION CALCULATION
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();           // UNARY PLUS
                if (eat('-')) return -parseFactor();          // UNARY MINUS

                double x;
                int startPos = this.pos;
                if (eat('(')) {     // FOR ADDING THE BRACKETS IN THE WORKING EXPRESSION
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {              // FOR ADDING THE NUMBERS AND THE DECIMAL POINT
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {                             // FOR THE FUNCTION NAMES SPECIFIED
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    switch (func) {                                            // THIS IS A SWITCH CASE STATEMENT FOR VARIOUS FUNCTIONS
                        case "sqrt":                            // SQUARE ROOT
                            x = Math.sqrt(x);
                            break;
                        case "sin":                             // SIN
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":                             // COSINE
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":                             // TANGENT
                            x = Math.tan(Math.toRadians(x));
                            break;
                        case "log":                             // LOGARITHM
                            x = Math.log10(x);
                            break;
                        case "ln":                              // NATURAL LOGARITHM
                            x = Math.log(x);
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected character: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor());    // EXPONENTIATION

                return x;
            }
        }.parse();
    }

}