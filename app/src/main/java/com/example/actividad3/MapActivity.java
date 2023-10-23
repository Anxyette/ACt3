package com.example.actividad3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener{
    Double latitud, longitud;
    GoogleMap mMap;
    String[] items = {"Arica","Iquique","Antofagasta","La Serena","Viña del Mar","Santiago","Talca","Concepción","Los Angeles","Temuco","Valdivia","Osorno","Puerto Montt"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);

        autoCompleteTxt = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, items);
        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),""+item, Toast.LENGTH_SHORT).show();

                if (position == 0){
                    LatLng Sede = new LatLng(-18.48315154834498, -70.31033248871047);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Arica"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 1) {
                    LatLng Sede = new LatLng(-20.21908950137325,-70.14076366793061);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Iquique"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 2) {
                    LatLng Sede = new LatLng(-23.634574216258383, -70.39399895973817);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Antofagasta"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 3) {
                    LatLng Sede = new LatLng(-29.908036069239916, -71.25763862031306);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas La Serena"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 4) {
                    LatLng Sede = new LatLng(-33.03752532402711, -71.5220978111519);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Viña del Mar"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 5) {
                    LatLng Sede = new LatLng(-33.44851641784077, -70.66055637976577);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Santiago"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 6) {
                    LatLng Sede = new LatLng(-35.4271619985037, -71.67261338174886);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Talca"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 7) {
                    LatLng Sede = new LatLng(-36.82621741787062, -73.06173566850416);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Concepcion"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 8) {
                    LatLng Sede = new LatLng(-37.471877358064354, -72.35398417456436);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Los Angeles"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 9) {
                    LatLng Sede = new LatLng(-38.733424882807235, -72.60185853799517);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Temuco"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));

                } else if (position == 10) {
                    LatLng Sede = new LatLng(-39.81725205734873, -73.23310061678478);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Valdivia"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));
                } else if (position == 11) {
                    LatLng Sede = new LatLng(-40.571660378747126, -73.13759718606221);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Osorno"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));
                } else if (position == 12) {
                    LatLng Sede = new LatLng(-41.47243530232441, -72.9287575923956);
                    mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas Puerto Montt"));
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));
                }

            }
        });
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        LatLng Sede = new LatLng(-38.733424882807235, -72.60185853799517);
        mMap.addMarker(new MarkerOptions().position(Sede).title("Santo Tomas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sede));
    }
    @Override
    public void onMapClick(@NonNull LatLng latLng){

    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng){

    }
}