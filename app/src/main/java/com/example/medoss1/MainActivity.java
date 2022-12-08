package com.example.medoss1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.medoss1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }


    public void btnSerge1(View view) {
        Intent intent = new Intent(this, serge2.class);
        startActivity(intent);
    }


    // Appelle de la deuxieme classe2, y a deux boutons à déclarer ici

    public void btnSerge21(View view) {
        Intent intent = new Intent(this, serge3.class);
        startActivity(intent);

    }
}



    /////////////////  Ajout du bloc en bas

   // public class MainActivity extends AppCompatActivity {
   //     DatePicker picker;
   //     Button btnGetDate, btn_datePickerJava;
   //     TextView tvDate;
   //     @Override
   //     protected void onCreate(Bundle savedInstanceState) {
   //         super.onCreate(savedInstanceState);
   //         setContentView(R.layout.activity_main);
   //         tvDate = (TextView) findViewById(R.id.tvDate);
   //
   //         picker = (DatePicker) findViewById(R.id.datePicker1);
   //         btnGetDate = (Button) findViewById(R.id.btnGetDate);
   //         btnGetDate.setOnClickListener(new View.OnClickListener() {
   //             @Override
   //             public void onClick(View v) {
   //                 tvDate.setText("Nous sommes le : " + picker.getDayOfMonth() +
   //                         "/" + (picker.getMonth() + 1) + "/" + picker.getYear());
   //             }
   //         });
///** Créer en JAVA **/
//            btn_datePickerJava = (Button) findViewById(R.id.btn_datePickerJava);
//            btn_datePickerJava.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                   Calendar mCurrentDate = Calendar.getInstance();
//                    int mYear = mCurrentDate.get(Calendar.YEAR);
//                    int mMonth = mCurrentDate.get(Calendar.MONTH);
//                    int mDay = mCurrentDate.get(Calendar.DAY_OF_MONTH);
// // Avec l'appel du style dans themes.xml
//                    DatePickerDialog mDatePicker = new
//                            DatePickerDialog(MainActivity.this, R.style.DatePickerDialog, new
//                            DatePickerDialog.OnDateSetListener() {
//                                // Sans le style
// // DatePickerDialog mDatePicker = new
//                                DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
//                                    public void onDateSet(DatePicker datepicker, int
//                                    selectedYear, int selectedMonth, int selectedDay) {
// // Update the editText to display the selected date
//                                        tvDate.setText("Nous sommes le : " + selectedDay + "/" +
//                                                (selectedMonth + 1) + "/" + selectedYear);
//                                    }
//                                }, mYear, mMonth, mDay);
//mDatePicker.show();
//                            }
//                });
//            }
//        }
//
//}

