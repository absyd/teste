package allaphsamples.servegame.com.pedale.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import allaphsamples.servegame.com.pedale.R;
import allaphsamples.servegame.com.pedale.showbikes.ShowBikesActivity;

public class LoginActivity extends AppCompatActivity {


    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_act);

        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, ShowBikesActivity.class);
                startActivity(i);
            }
        });
    }

}
