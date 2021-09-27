package com.app.hapimediapic


import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.blabla.sreenshot.ScreenShotPlugin
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //
        button.setOnClickListener {
           ScreenShotPlugin.getInstance().startMediaRecorder(this,
               object : ScreenShotPlugin.OnScreenShotListener {
                   override fun onFinish(bitmap: Bitmap?) {
                       TODO("Not yet implemented")
                   }

                   override fun onError(code: Int, msg: String?) {
                       TODO("Not yet implemented")
                   }

               })
        }

    }
}
