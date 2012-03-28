package com.nayosx.list;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class ListToActivityActivity extends Activity {
    /** Called when the activity is first created. */
	ListView lista;
	Resources r;
	String [] anime;
	String nombre;
	int imagen=0;
	Intent i;
	final String NOMBRE="nombre", IMAGEN = "imagen";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        inicializar();
    }
    private void inicializar()
    {
    	lista = (ListView) findViewById(R.id.listaAnime);
    	r = ListToActivityActivity.this.getResources();
    	anime = r.getStringArray(R.array.anime);
    	lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
            public void onItemClick(AdapterView<?> p_arg0, View p_arg1, int p_arg2, long p_arg3) {
	            // TODO Auto-generated method stub
	            nombre = anime[p_arg2];
	            imagen = p_arg2;
	            i = new Intent(ListToActivityActivity.this, Presentacion.class);
	            i.putExtra(NOMBRE, nombre);
	            i.putExtra(IMAGEN, imagen);
	            startActivity(i);
            }
    		
    	});
    }
}