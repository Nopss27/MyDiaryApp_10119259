//package com.naufal.mydiary10119259;
//

/*
* Naufal Daffa Ilyasa
* 10119259
* IF7
* */

//import android.content.Intent;
//import android.os.Bundle;
//
//import com.google.android.material.snackbar.Snackbar;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.view.View;
//import android.widget.Toast;
//
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//
//import com.naufal.mydiary10119259.databinding.ActivityDetails2Binding;
//
//public class Details extends AppCompatActivity {
//
//    private AppBarConfiguration appBarConfiguration;
//    private ActivityDetails2Binding binding;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        binding = ActivityDetails2Binding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        setSupportActionBar(binding.toolbar);
//
//        Intent i = getIntent();
//        Long id = i.getLongExtra("ID",0);
//
//        Toast.makeText(this, "ID -> " + id, Toast.LENGTH_SHORT).show();
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_details2);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_details2);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
//}
