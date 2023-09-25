package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addition(View view){
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String num1 = myTextField.getText().toString();
        String num2 = myTextField2.getText().toString();
        String solution = num1 + num2;
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(solution);
    }
    public void goToActivity(String s) {
        Intent intent= new Intent(this, SolutionActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    /*
    public void addition(View view){
        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        // double solution = num1 + num2;
        goToActivity(myTextField.getText().toString());
    }
    public void goToActivity(String s){
        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

     */

    /*

    public void subtract(View view, double num1, double num2){
        double solution = num1 - num2;
        //goToActivity( "Solution is ", solution);
    }
    public void multiply( double num1, double num2){
        double solution = num1 * num2;
        goToActivity( "Solution is ", solution);
    }
    public void divide(View view, double num1, double num2){
        double solution = num1 / num2;
        goToActivity( "Solution is ", solution);
    }
*/

}