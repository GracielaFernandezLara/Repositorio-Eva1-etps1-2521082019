package sv.edu.utec.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= etUsername.getText().toString();
                String password= etPassword.getText().toString();

                if(username.equals("parcialETps1")&& password.equals("p4rC141#tp$")){
                    Intent login =new Intent(MainActivity.this,IMCActivity.class);
                    startActivity(login);
                }else{
                    Toast.makeText(MainActivity.this,"El ususario o la contraseña son incorrectos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}