/**
 * 
 */
package com.nayosx.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Nayosx
 *
 */
public class Presentacion extends Activity{
	TextView nombreAnime;
	ImageView imaAnime;
	Bundle bl;
	String nombre;
	int imagen=0;
	final String NOMBRE="nombre", IMAGEN = "imagen";
	int [] anime = {
	                R.drawable.img01,
	                R.drawable.img02,
	                R.drawable.img03,
	                R.drawable.img04,
	                R.drawable.img05,
	                R.drawable.img06
	};
	@Override
    protected void onCreate(Bundle p_savedInstanceState) {
	    // TODO Auto-generated method stub
	    super.onCreate(p_savedInstanceState);
	    setContentView(R.layout.presentacion);
	    inicializar();
    }
	private void inicializar()
	{
		nombreAnime = (TextView) findViewById(R.id.nombreAnime);
		imaAnime = (ImageView) findViewById(R.id.imagenAnime);
		bl = this.getIntent().getExtras();
		nombre = bl.getString(NOMBRE);
		imagen = bl.getInt(IMAGEN);
		nombreAnime.setText(nombre);
		imaAnime.setImageResource(anime[imagen]);
	} 
}
