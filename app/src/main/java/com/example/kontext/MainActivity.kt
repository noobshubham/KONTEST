package com.example.kontext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.kontext.network.KontextData
import com.example.kontext.network.KontextService
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getData()
    }

    /*
    private fun getData() {
        val kontext: Call<KontextData> = KontextService.kontextInstance.getKontext()
        kontext.enqueue(object : Callback<KontextData> {
            override fun onResponse(call: Call<KontextData>, response: Response<KontextData>) {
                val kontext: KontextData? = response.body()
                if (kontext != null) {
                    Log.d("MAIN", kontext.toString())
                    val textView: TextView = findViewById(R.id.textview)
                    textView.text = kontext.toString()
                }
            }

            override fun onFailure(call: Call<KontextData>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Failed to fetch the data!", Toast.LENGTH_SHORT).show()
            }

        })


    }
     */
}