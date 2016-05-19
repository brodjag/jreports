package com.jackreports;



import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;


import java.util.List;

/**
 * Created by brodjag on 17.10.15.
 */
public class mapSet {
    MainActivity con;
    private GoogleMap mMap;

    PolylineOptions polylineOptions;

    public mapSet(MainActivity c){
        con=c;
        MapFragment mapFragment = (MapFragment) con.getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap=googleMap;

                setPosition(38.14,-120.45);

            }
        });

    }


    public void setPosition(double lan, double lon){
        LatLng PERTH = new LatLng(lan,lon);


        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(lan, lon))
                .zoom(13)
                .bearing(0)
                .tilt(20)
                .build();
        CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition);
        mMap.animateCamera(cameraUpdate);
        addMarks();
    }


   void addMarks(){
       if(mMap==null)return;
       mMap.clear();
       addMSMark();
   }

   void addMSMark(){
       LatLng PERTH = new LatLng(38.18,-120.45);
       Marker perth = mMap.addMarker(new MarkerOptions()
               .position(PERTH)
               .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_favorite_black_24dp))
               .draggable(true));

        PERTH = new LatLng(38.14,-120.45);
        perth = mMap.addMarker(new MarkerOptions()
               .position(PERTH)
              // .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_favorite_black_24dp))
               .draggable(true));

   }


}
