package com.example.projcontrolesbasicos;

import com.example.projcontrolesbasicos.R;
import com.example.projcontrolesbasicos.Titular;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class PantList extends Activity{

	private ListView LstOpciones;
	private TextView LblEtiqueta;
	
	private Titular[] datos =
			new Titular[]{
					new Titular("Javi","Este es Javi"),
					new Titular("Alba","Esta es Alba"),
					new Titular("ONO","30Mbps")};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantlist);
		
		AdaptadorTitulares adaptadortitular = new AdaptadorTitulares(this);
		
		LstOpciones = (ListView)findViewById(R.id.LstOpciones);
		LblEtiqueta = (TextView)findViewById(R.id.LblEtiqueta);
		
		
		LstOpciones.setAdapter(adaptadortitular);
		
		LstOpciones.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,long id){
				String opcionSeleccionada = ((Titular)a.getAdapter().getItem(position)).getTitulo();
				LblEtiqueta.setText("Opcion seleccionada: "+opcionSeleccionada);
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
class AdaptadorTitulares extends ArrayAdapter<Titular>{
	Activity context;
	
	AdaptadorTitulares(Activity context){
		super(context, R.layout.listitem_titular,datos);
		this.context = context;
	}
	public View getView(int position,View convertView,ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.listitem_titular, null);
		
		TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
		lblTitulo.setText(datos[position].getTitulo());
		
		TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubtitulo);
		lblSubtitulo.setText(datos[position].getSubtitulo());

		return (item);
	}
}
}


