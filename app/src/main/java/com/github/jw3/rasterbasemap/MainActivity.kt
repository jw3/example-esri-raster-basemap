package com.github.jw3.rasterbasemap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.esri.arcgisruntime.geometry.SpatialReferences
import com.esri.arcgisruntime.mapping.ArcGISMap
import com.esri.arcgisruntime.mapping.Basemap
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapView.map = ArcGISMap(Basemap.Type.IMAGERY, 42.0, 42.0, 4)
    }

    companion object {
        private const val TAG = "MainActivity"
        private const val LocationPermissionRequest = 111
        private val SR = SpatialReferences.getWgs84()
    }
}
