package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.slider.Slider

class customView : AppCompatActivity() {
    private lateinit var imageSlider: ImageSlider
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view)

        imageSlider = findViewById(R.id.img_slider)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(""))

        val view = layoutInflater.inflate(R.layout.activity_custom_view,null)
    }
}