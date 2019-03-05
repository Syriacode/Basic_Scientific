package example.org.test.basic_scientific;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView pant;
    public double operator01, operator02, res;
    int option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant=(TextView)findViewById(R.id.result_view);
    }
    public void seven(View view){
        String cap= pant.getText().toString();
        cap = cap+"7";
        pant.setText(cap);
    }
    public void eight(View view){
        String cap= pant.getText().toString();
        cap = cap+"8";
        pant.setText(cap);
    }
    public void nine(View view){
        String cap= pant.getText().toString();
        cap = cap+"9";
        pant.setText(cap);
    }
    public void four(View view){
        String cap= pant.getText().toString();
        cap = cap+"4";
        pant.setText(cap);
    }
    public void five(View view){
        String cap= pant.getText().toString();
        cap = cap+"5";
        pant.setText(cap);
    }
    public void six(View view){
        String cap= pant.getText().toString();
        cap = cap+"6";
        pant.setText(cap);
    }
    public void one(View view){
        String cap= pant.getText().toString();
        cap = cap+"1";
        pant.setText(cap);
    }
    public void two(View view){
        String cap= pant.getText().toString();
        cap = cap+"2";
        pant.setText(cap);
    }
    public void three(View view){
        String cap= pant.getText().toString();
        cap = cap+"3";
        pant.setText(cap);
    }
    public void zero(View view){
        String cap= pant.getText().toString();
        cap = cap+"0";
        pant.setText(cap);
    }
    public void dot(View view){
        String cap= pant.getText().toString();
        cap = cap+".";
        pant.setText(cap);
    }
    public void addition(View view){
        String aux01=pant.getText().toString();
        operator01=Double.parseDouble(aux01);
        pant.setText("");
        option=1;
    }
    public void division(View view){
        String aux01=pant.getText().toString();
        operator01=Double.parseDouble(aux01);
        pant.setText("");
        option=2;
    }
    public void mult(View view){
        String aux01=pant.getText().toString();
        operator01=Double.parseDouble(aux01);
        pant.setText("");
        option=3;
    }
    public void sub(View view){
        String aux01=pant.getText().toString();
        operator01=Double.parseDouble(aux01);
        pant.setText("");
        option=4;
    }
    public void per(View view){
        String aux01=pant.getText().toString();
        operator01=Double.parseDouble(aux01);
        pant.setText("");
        option=5;
    }
    public void power(View view){
        String aux01=pant.getText().toString();
        operator01=Double.parseDouble(aux01);
        pant.setText("");
        option=6;
    }
    public void equal(View view){
        String aux02 = pant.getText().toString();
        operator02 = Double.parseDouble(aux02);
        pant.setText("");
        if(option== 1){
            res= operator01+operator02;
        }
        else if(option==2){
            res = operator01/operator02;
            if(operator02==0){
                pant.setText("Error");
            }
        }
        else if(option==3){
            res = operator01*operator02;
        }
        else if (option==4){
            res = operator01-operator02;
        }
        else if(option ==5){
            res = operator01/100;
        }
        else if(option==6){
            res = Math.pow(operator01,operator02);
        }
        pant.setText(""+res);
        operator01=res;
    }
    public void delete (View view){
        if (!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0, pant.getText().length()-1)+"");
        }
    }
    public void off(View view){
        finish();
    }

}
