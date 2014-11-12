package com.example.googlemaps;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnClickListener {
	
	private GoogleMap mMap;
	 
	 EditText etlatitud;
	 EditText etlongitud;
	 Button btir;
	 Button btbogota;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		
		etlatitud= (EditText) findViewById(R.id.editTextlatitud);
		etlongitud=(EditText) findViewById(R.id.editTextlongitud);
		btir= (Button) findViewById(R.id.buttonir);
		btbogota= (Button) findViewById(R.id.buttonbogota);
		
		btir.setOnClickListener(this);
		btbogota.setOnClickListener(this);
	
		
	    mMap.setMyLocationEnabled(true);
	    
	    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		
		//mMap.setMapType(2);
		
		mMap.setBuildingsEnabled(true);
		
		CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(4.1156735, -72.9301367)).zoom(4).tilt(70).build();
		
	mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
		
		
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.63408, -74.067017)).title("Universidad catolica de Colombia").icon(BitmapDescriptorFactory.fromResource(R.drawable.ucatolica)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(48.779209, 9.1772152)).title("Stuttgart"));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.6073906, -74.0556718)).title("Monserrate").icon(BitmapDescriptorFactory.fromResource(R.drawable.church)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.95024, -73.96445)).title("Parque Jaime Duque").icon(BitmapDescriptorFactory.fromResource(R.drawable.park)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.645855, -74.077377)).title("Estadio Nemesio Camacho el Campin").icon(BitmapDescriptorFactory.fromResource(R.drawable.stadium)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.612037, -74.068778)).title("Planetario de Bogota").icon(BitmapDescriptorFactory.fromResource(R.drawable.planet)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.631081, -74.0687810)).title("Desayunadero de la 42").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.650990,  -74.051922)).title("Tramonti").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.643067, -74.075227)).title("Galerías").icon(BitmapDescriptorFactory.fromResource(R.drawable.cc)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.609958, -74.055364)).title("San Isidro").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.645035, -74.070035)).title("Cañón del chicamocha").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.653513, -74.061804)).title("Teatro astor plaza").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.632694, -74.068042)).title("Teatro Ditriambo").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.5968513878562 ,  -74.0774309635162)).title("Iglesia de santa clara").icon(BitmapDescriptorFactory.fromResource(R.drawable.church)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.6016959003558 ,   -74.0720236301422)).title("Museo del Oro").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.6665963413624,  -74.098920822)).title("Jardín Botánico José Celestino Mutis").icon(BitmapDescriptorFactory.fromResource(R.drawable.park)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.6156303738013, -74.0686869621277)).title("Plaza de Bolívar").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.5981026227174, -74.073150)).title("Museo Botero").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.603828,  -74.064734)).title("Museo quinta de bolivar").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.597087, -74.073114)).title("Museo de Bogotá").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.612352, -74.075115)).title("Museo de de arte Colonial").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.596967, -74.074458)).title("Teatro Cristobal Colón").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.598168, -74.078678)).title("Museo historico de la policía nacional").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.596603, -74.074021)).title("Museo militar de Colombia").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.610614, -74.069345)).title("Casa de la moneda").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.623771, -74.135406)).title("Estadio de techo").icon(BitmapDescriptorFactory.fromResource(R.drawable.stadium)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.678254,  -74.049683)).title("Andres carne de res express").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.678254,  -74.049683)).title("Centro Cultural Gabriel García Márquez").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.643688,  -74.072111)).title("Juan Valdez Café").icon(BitmapDescriptorFactory.fromResource(R.drawable.coffee)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.649831,   -74.062661)).title("Iglesia nuestra señora de Lourdes").icon(BitmapDescriptorFactory.fromResource(R.drawable.church)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.638991,   -74.066435)).title("Hotel el gran marquéz").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.632489,-74.068119)).title("Hotel el gran marquéz").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotel)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.637590,-74.070844)).title("Escuela nacional de carreras industriales sede c").icon(BitmapDescriptorFactory.fromResource(R.drawable.univer)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.629388, -74.070147)).title("Fundación Universitaria INPAHU").icon(BitmapDescriptorFactory.fromResource(R.drawable.univer)));
		mMap.addMarker(new MarkerOptions().position(new LatLng(4.655672, -74.058690)).title("Teatro Nacional Fanny Mikey").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.649206, -74.061236)).title("Teatro La Mama").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.658274, -74.065184)).title("Teatro Quimera").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.640052, -74.062009)).title("Teatro la Baranda").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.644329, -74.069218)).title("Teatro santafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.684707, -74.073252)).title("Teatro de Bellas Artes de Bogotá").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.626173, -74.073858)).title("Casa del Teatro Nacional").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.622408, -74.068794)).title("Teatro Metro").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.608463, -74.070940)).title("Teatro Municipal Jorge Eliecer Gaitn").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.595374, -74.074630)).title("Fundacion Teatro Camarn del Carmen").icon(BitmapDescriptorFactory.fromResource(R.drawable.teatro)));


		mMap.addMarker(new MarkerOptions().position(new LatLng(4.621297, -74.135028)).title("Mundo Aventura").icon(BitmapDescriptorFactory.fromResource(R.drawable.rollcoaster)));


		mMap.addMarker(new MarkerOptions().position(new LatLng(4.655134, -74.109738)).title("SALITRE MAGICO").icon(BitmapDescriptorFactory.fromResource(R.drawable.rollcoaster)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.603828,  -74.064734)).title("Maloka Centro Interactivo").icon(BitmapDescriptorFactory.fromResource(R.drawable.museum)));

		mMap.addMarker(new MarkerOptions().position(new LatLng(4.700733, -74.144549)).title("Aeropuerto Internacional El Dorado").icon(BitmapDescriptorFactory.fromResource(R.drawable.airport)));
		
		
		Toast.makeText(getBaseContext(), " Maps Cristian Franco - Sebastian Calvo - Michael Gallego", Toast.LENGTH_LONG).show();
		
	
	
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
      switch (item.getItemId()) {
		
		case R.id.item1:
			
			Toast.makeText(getBaseContext(), "Tipos de maps", Toast.LENGTH_SHORT).show();
		
			return true;
			
		case R.id.item2:
		
		mMap.setMapType(GoogleMap.MAP_TYPE_NONE);
			return true;
			
		case R.id.item3:
			
			mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
			
			return true;
		case R.id.item4:
			
			mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
		
		
			return true;
			
		case R.id.item5:
			
			mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			
		
			return true;
			
			
		case R.id.item6:
			
			mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
			return true;

		default:
			return super.onOptionsItemSelected(item);
			
		}
	}

@Override
public void onClick(View v) {
	
	Intent i;
	
	if(v.getId()==R.id.buttonir) {
		CameraUpdate camUpd =CameraUpdateFactory.newLatLng(new LatLng(Double.parseDouble(etlatitud.getText().toString()), Double.parseDouble(etlongitud.getText().toString())));
		mMap.moveCamera(camUpd);
		
	}
	
if (v.getId()==R.id.buttonbogota){
	
	
	i = new Intent("android.intent.action.VIEW",
            Uri.parse("http://www.bogotaturismo.gov.co/"));
            startActivity(i);
		

	
}
	
	

}
}
