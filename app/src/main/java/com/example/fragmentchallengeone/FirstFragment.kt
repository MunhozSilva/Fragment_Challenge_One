package com.example.fragmentchallengeone

import android.os.Bundle
import android.provider.DocumentsContract.EXTRA_INFO
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_one) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.next_fragment_button)
        button.setOnClickListener {
            val textSent = view?.findViewById<EditText>(R.id.text_to_send)?.text.toString()

            val fragment = SecondFragment()
            val bundle = Bundle().apply { putString(EXTRA_INFO, textSent) }
            fragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, fragment)
                .addToBackStack(null)
                .commit()
        }
    }
}