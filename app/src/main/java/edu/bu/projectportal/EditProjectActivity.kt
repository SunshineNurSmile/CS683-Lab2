package edu.bu.projectportal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class EditProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_project)

        val projTitle = findViewById<EditText> (R.id.projTitleEdit)
        val projDesc =  findViewById<EditText> (R.id.projDescEdit)
        val projAuthor1 = findViewById<EditText> (R.id.projAuthorEdit1)
        val projAuthor2 = findViewById<EditText> (R.id.projAuthorEdit2)
        val projAuthor3 = findViewById<EditText> (R.id.projAuthorEdit3)
        val projLink1 = findViewById<EditText> (R.id.projLinkEdit1)
        val projLink2 = findViewById<EditText> (R.id.projLinkEdit2)
        val projLink3 = findViewById<EditText> (R.id.projLinkEdit3)
        val projKey1 = findViewById<EditText> (R.id.projKeyEdit1)
        val projKey2 = findViewById<EditText> (R.id.projKeyEdit2)
        val projKey3 = findViewById<EditText> (R.id.projKeyEdit3)

        val submit = findViewById<Button>(R.id.submit)
        val cancel = findViewById<Button>(R.id.cancel)

        projTitle.setText(Project.project.title)
        projDesc.setText(Project.project.description)
        projAuthor1.setText(Project.project.author1)
        projAuthor2.setText(Project.project.author2)
        projAuthor3.setText(Project.project.author3)
        projLink1.setText(Project.project.link1)
        projLink2.setText(Project.project.link2)
        projLink3.setText(Project.project.link3)
        projKey1.setText(Project.project.key1)
        projKey2.setText(Project.project.key2)
        projKey3.setText(Project.project.key3)


        val editProjDoneListener = View.OnClickListener{ view ->
            if (view.id == R.id.submit) {
                Project.project.title = projTitle.text.toString()
                Project.project.description = projDesc.text.toString()
                Project.project.author1 = projAuthor1.text.toString()
                Project.project.author2 = projAuthor2.text.toString()
                Project.project.author3 = projAuthor3.text.toString()
                Project.project.link1 = projLink1.text.toString()
                Project.project.link2 = projLink2.text.toString()
                Project.project.link3 = projLink3.text.toString()
                Project.project.key1 = projKey1.text.toString()
                Project.project.key2 = projKey2.text.toString()
                Project.project.key3 = projKey3.text.toString()
            }
            startActivity(Intent(this, MainActivity::class.java))

        }

        submit.setOnClickListener (editProjDoneListener)
        cancel.setOnClickListener (editProjDoneListener)

    }
}