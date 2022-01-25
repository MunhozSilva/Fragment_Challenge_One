package com.example.fragmentchallengeone

import android.os.Bundle
import android.provider.DocumentsContract.EXTRA_INFO
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_two) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textInfo = arguments?.getString(EXTRA_INFO)
        val fragTwoText = view.findViewById<TextView>(R.id.fragment_two_text)
        fragTwoText.text = textInfo.toString()
    }
}

