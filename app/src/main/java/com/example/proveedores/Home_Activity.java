package com.example.proveedores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity {

    RecyclerView Rvproveedores;
    ArrayList<Proveedor> lista_proveedores = new ArrayList<>();
    //adaptador_proveedores adaptador_proveedores;
    FirebaseDatabase firebaseDatabase;
    FirebaseAuth mi_autenticacion;
    FirebaseUser mi_usuario;
    DatabaseReference PROVEEDORES;
    ImageView Btn_cerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Rvproveedores = findViewById(R.id.rv_proveedores);
        firebaseDatabase = FirebaseDatabase.getInstance();
        PROVEEDORES = firebaseDatabase.getReference("Proveedores");
        mi_autenticacion = FirebaseAuth.getInstance();
        mi_usuario = mi_autenticacion.getCurrentUser();
        consulta_proveedor();
        //construir_recycleView();

    }

    private  void consulta_proveedor(){
        PROVEEDORES.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for(DataSnapshot ds: snapshot.getChildren()){
                        String nombre = ""+ds.child("nombre").getValue().toString();
                        String url = ""+ds.child("imagen").getValue().toString();

                        Proveedor p = new Proveedor(nombre,url,"","");
                        lista_proveedores.add(p);
                    }//adaptador_proveedores.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    /*public void construir_recycleView(){
        Rvproveedores.setLayoutManager(new GridLayoutManager(this,2));
        adaptador_proveedores = new adaptador_proveedores(lista_proveedores,this);
        Rvproveedores.setAdapter(adaptador_proveedores);

    }

    public void Onclick(View view){
        switch (view.getId()){
            case R.id.btn_cerrar:
            {
                mi_autenticacion.getInstance().signOut();




            }
        }

    }*/
}