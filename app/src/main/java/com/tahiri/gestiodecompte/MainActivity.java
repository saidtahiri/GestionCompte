package com.tahiri.gestiodecompte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView txt;
    Compte compte;
    EditText montantInput;
    Button debiter,crediter;
    double sold;
    int mnt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.montantTextView);
        montantInput = findViewById(R.id.montantEditText);
        debiter = findViewById(R.id.btnDebiter);
        crediter = findViewById(R.id.btnCrediter);


         compte = new Compte();

       debiter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(!montantInput.getText().toString().isEmpty()){
                   mnt = Integer.parseInt(montantInput.getText().toString());
                   if(compte.getSolde()-mnt<0){
                       Toast.makeText(MainActivity.this, "Vous ne pouvez pas rendre votre compte moins de 0", Toast.LENGTH_SHORT).show();
                   }
                   else{
                       compte.setSolde(compte.getSolde()-mnt);
                       txt.setText(compte.getSolde()+"");
                       montantInput.setText("");
                       Toast.makeText(MainActivity.this, "Vous avez debiter votre compte de  "+mnt, Toast.LENGTH_SHORT).show();
                   }

               }
               else{
                   Toast.makeText(MainActivity.this, "Veuillez Remplir le champs", Toast.LENGTH_SHORT).show();
               }


           }
       });

      crediter.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(!montantInput.getText().toString().isEmpty()){
                  mnt = Integer.parseInt(montantInput.getText().toString());
                  Toast.makeText(MainActivity.this, "Vous avez crediter votre compte de " + mnt, Toast.LENGTH_SHORT).show();
                  compte.setSolde(compte.getSolde()+mnt);
                  txt.setText(compte.getSolde()+"");
                  montantInput.setText("");
              }
              else{
                  Toast.makeText(MainActivity.this, "Veuillez Remplir le champs", Toast.LENGTH_SHORT).show();
              }

          }
      });


    }
}