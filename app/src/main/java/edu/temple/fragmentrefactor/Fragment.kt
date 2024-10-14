package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment : Fragment() {
    //override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //arguments?.let {
      //  }
    //}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_, container, false).apply {
            val textView = findViewById<TextView>(R.id.displayTextView)
            val nameEditText = findViewById<EditText>(R.id.nameEditText)
            findViewById<Button>(R.id.changeButton).setOnClickListener {
                val name = nameEditText.text
                textView.text = if(name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }
            }
        }

    }
}











