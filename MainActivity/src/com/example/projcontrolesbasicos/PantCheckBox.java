package com.example.projcontrolesbasicos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class PantCheckBox extends Activity{

	CheckBox cbMarcame;
	CheckBox ChkAtrevete;
	
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantcheckbox);
		
		initialUISetup();
			
		}
	
	public void initialUISetup(){
		 cbMarcame = (CheckBox)findViewById(R.id.ChkMarcame);
		 ChkAtrevete = (CheckBox)findViewById(R.id.ChkAtrevete);	
	}
	
	public void getClick(View v){
		String Mensaje = "";

		if (cbMarcame.isChecked()){
			Mensaje += "Me has marcado";
		}
		if (ChkAtrevete.isChecked()){
			Mensaje += "COMO TE ATREVES A MARCARME!!";
		}
		 showTextNotification(Mensaje);
		
	}
	public void showTextNotification(String MensajeToDisplay){
				
			Toast.makeText(this, MensajeToDisplay, Toast.LENGTH_SHORT).show();
	}
}
