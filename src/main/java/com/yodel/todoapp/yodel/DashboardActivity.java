package com.yodel.todoapp.yodel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class DashboardActivity extends Activity {
    UserFunctions userFunctions;
    Button btnContinue;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        btnContinue = (Button) findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent register = new Intent(getApplicationContext(), RegisterActivity.class);
                register.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(register);
                // Closing dashboard screen
                finish();
            }
        });
        /**
         * Dashboard Screen for the application
         * */
        // Check login status in database
//        userFunctions = new UserFunctions();
//        if(userFunctions.isUserLoggedIn(getApplicationContext())){
//
//
//        }else{
//            // user is not logged in show login screen
//            Intent login = new Intent(getApplicationContext(), LoginActivity.class);
//            login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(login);
//            // Closing dashboard screen
//            finish();
//        }

//
//


    }
}