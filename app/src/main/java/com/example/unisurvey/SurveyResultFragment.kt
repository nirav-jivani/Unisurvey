package com.example.unisurvey

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SurveyResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_survey_result, container, false)
        val name = arguments?.getString("NAME")
        val email = arguments?.getString("EMAIL")
        val studentId = arguments?.getString("STUDENT_ID")
        val resultTextView = view.findViewById<TextView>(R.id.resultTextView)
        resultTextView.text = "Name: $name\nEmail: $email\nStudent ID: $studentId\nReview : $studentId\n\nThank you for taking the survey....\n\nYour Response has been Recorded...."

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(name: String, email: String, studentId: String,review:String) =
            SurveyResultFragment().apply {
                arguments = Bundle().apply {
                    putString("NAME", name)
                    putString("EMAIL", email)
                    putString("STUDENT_ID", studentId)
                    putString("REVIEW", review)
                }
            }
    }
}
