package edu.bu.projectportal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var projTitle: TextView
    private lateinit var projDesc: TextView
    private lateinit var editProj: ImageButton
    private lateinit var projAuthor1: TextView
    private lateinit var projAuthor2: TextView
    private lateinit var projAuthor3: TextView
    private lateinit var projLink1: TextView
    private lateinit var projLink2: TextView
    private lateinit var projLink3: TextView
    private lateinit var projKey1: TextView
    private lateinit var projKey2: TextView
    private lateinit var projKey3: TextView
    private lateinit var favoriteDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        projTitle = findViewById(R.id.projTitle)
        projDesc =  findViewById(R.id.projDesc)
        projAuthor1 = findViewById(R.id.projAuthor1)
        projAuthor2 = findViewById(R.id.projAuthor2)
        projAuthor3 = findViewById(R.id.projAuthor3)
        projLink1 = findViewById(R.id.projLink1)
        projLink2 = findViewById(R.id.projLink2)
        projLink3 = findViewById(R.id.projLink3)
        projKey1 = findViewById(R.id.projKey1)
        projKey2 = findViewById(R.id.projKey2)
        projKey3 = findViewById(R.id.projKey3)
        favoriteDisplay = findViewById(R.id.favoriteDisplay)

        editProj = findViewById(R.id.editProj)

        projTitle.text =  Project.project.title
        projDesc.text = Project.project.description
        projAuthor1.text = Project.project.author1
        projAuthor2.text = Project.project.author2
        projAuthor3.text = Project.project.author3
        projLink1.text = Project.project.link1
        projLink2.text = Project.project.link2
        projLink3.text = Project.project.link3
        projKey1.text = Project.project.key1
        projKey2.text = Project.project.key2
        projKey3.text = Project.project.key3

        editProj.setOnClickListener {
            startActivity(Intent(this, EditProjectActivity::class.java))
        }
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.favorite -> {
                    if (checked) {
                        favoriteDisplay.text = "Yes"
                    } else {
                        favoriteDisplay.text = "No"
                    }
                }
            }
        }
    }

}