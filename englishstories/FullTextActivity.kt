package com.example.englishstories

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_full_text.*
import kotlinx.android.synthetic.main.content_full_text.*

class FullTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_text)
        setSupportActionBar(toolbar)

        //Read extra value
        val itemIndex= intent.extras?.get("ITEM_INDEX").toString().toInt()

        //display Item Index
        Toast.makeText(this,"Item Index is ${itemIndex}", Toast.LENGTH_LONG).show()

        title=Data.stories[itemIndex].Title
        TextViewFullTextStory.setText(Data.stories[itemIndex].FullStoryText)
    }
}
