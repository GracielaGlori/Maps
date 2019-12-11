package com.example.maps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.GroundOverlayOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

override fun onMapReady(googleMap: GoogleMap) {
    mMap = googleMap

    val zoomLevel=15f
    val overlaySize=100f
    val latitude =-7.747033
    val longitude= 110.355398
    val larmh=-7.737480
    val longrmh=110.327100
    val lagrj=-7.769005
    val longgrj=110.361060

    val uty=LatLng(latitude, longitude)
    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(uty,zoomLevel))
    mMap.addMarker(MarkerOptions().position(uty).title("Universitas Teknologi Yogyakarta").snippet("-7.747033/110.355398"))
    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(uty,zoomLevel))


    val rmh=LatLng(larmh,longrmh)
    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rmh,zoomLevel))
    mMap.addMarker(MarkerOptions().position(rmh).title("Rumah").snippet("-7.737480/110.327100")
        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))

    val grj=LatLng(lagrj,longgrj)
    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(grj,zoomLevel))
    mMap.addMarker(MarkerOptions().position(grj).title("GBI Aletheia").snippet("-7.769005/110.361060").icon(
        BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))


}
}

