package edu.upc.dsa.miappcalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    boolean radianes = false;
    boolean sin = false;
    boolean cos = false;
    boolean tan = false;
    Double[] numero = new Double[20];
    Double dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dígitos y la coma
        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        //Operaciones
        Button buttonDividir = (Button) findViewById(R.id.button16);
        buttonDividir.setOnClickListener(this);
        Button buttonMultiplicar = (Button) findViewById(R.id.button11);
        buttonMultiplicar.setOnClickListener(this);
        Button buttonResta = (Button) findViewById(R.id.button12);
        buttonResta.setOnClickListener(this);
        Button buttonSuma = (Button) findViewById(R.id.button13);
        buttonSuma.setOnClickListener(this);

        //Igual y borrar
        Button buttonBorrar = (Button) findViewById(R.id.button14);
        buttonBorrar.setOnClickListener(this);
        Button buttonIgual = (Button) findViewById(R.id.button15);
        buttonIgual.setOnClickListener(this);

        //Trigonométricas
        Button buttonSin = (Button) findViewById(R.id.button17);
        buttonSin.setOnClickListener(this);
        Button buttonCos = (Button) findViewById(R.id.button18);
        buttonCos.setOnClickListener(this);
        Button buttonTan = (Button) findViewById(R.id.button19);
        buttonTan.setOnClickListener(this);

    }
    public void onClick(View view) {
        TextView pantalla = (TextView) findViewById(R.id.textView);
        int selector = view.getId();
        String x = pantalla.getText().toString();
        try {
            switch (selector) {
                case R.id.button0:
                    pantalla.setText(x + "0");
                    break;
                case R.id.button1:
                    pantalla.setText(x + "1");
                    break;
                case R.id.button2:
                    pantalla.setText(x + "2");
                    break;
                case R.id.button3:
                    pantalla.setText(x + "3");
                    break;
                case R.id.button4:
                    pantalla.setText(x + "4");
                    break;
                case R.id.button5:
                    pantalla.setText(x + "5");
                    break;
                case R.id.button6:
                    pantalla.setText(x + "6");
                    break;
                case R.id.button7:
                    pantalla.setText(x + "7");
                    break;
                case R.id.button8:
                    pantalla.setText(x + "8");
                    break;
                case R.id.button9:
                    pantalla.setText(x + "9");
                    break;
                case R.id.buttonComa: //Decimal
                    if (decimal == false) {
                        pantalla.setText(x + ".");
                        decimal = true;
                    } else return;
                    break;
                case R.id.button14: //Borrar
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.button16: //División
                    division = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.button11: //Multiplicación
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.button12: //Resta
                    resta = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("-");
                    decimal = false;
                    break;
                case R.id.button13: //Suma
                    suma = true;
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("+");
                    decimal = false;
                    break;
                case R.id.button17://Sin
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    if(radianes == true) {
                        dato = Math.sin(numero[0]);
                    }
                    else
                        dato = Math.sin(Math.toRadians(numero[0]));
                    pantalla.setText(String.valueOf(dato));
                    break;
                case R.id.button18://Cos
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    if(radianes == true) {
                        dato = Math.cos(numero[0]);
                    }
                    else
                        dato = Math.cos(Math.toRadians(numero[0]));
                    pantalla.setText(String.valueOf(dato));
                    break;
                case R.id.button19://Tan
                    numero[0] = Double.parseDouble(x);
                    pantalla.setText("");
                    decimal = false;
                    if(radianes == true) {
                        dato = Math.tan(numero[0]);
                    }
                    else
                        dato = Math.tan(Math.toRadians(numero[0]));
                    pantalla.setText(String.valueOf(dato));
                    break;
                case R.id.button15: //Igual
                    numero[1] = Double.parseDouble(x);
                    if (suma == true) {
                        dato = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(dato));
                    } else if (resta == true) {
                        dato = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(dato));
                    } else if (multiplicacion == true) {
                        dato = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(dato));
                    } else if (division == true) {
                        dato = numero[0] / numero[1];
                        pantalla.setText(String.valueOf(dato));
                    }
                    decimal = false;
                    suma = false;
                    division = false;
                    multiplicacion = false;
                    resta = false;
                    break;
            }
        } catch (Exception e) {
            pantalla.setText("Error");
        }

    }


}