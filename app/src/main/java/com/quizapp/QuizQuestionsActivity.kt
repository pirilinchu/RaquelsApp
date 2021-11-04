package com.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null

    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var answer: Int = 0

    // TODO (STEP 3: Create a variable for getting the name from intent.)
    // START
    private var mUserName: String? = null
    // END

    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_quiz_questions)

        // TODO (STEP 4: Get the NAME from intent and assign it the variable.)
        // START
        mUserName = intent.getStringExtra(Constants.USER_NAME)
        // END

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tv_option_one -> {

                selectedOptionView(tv_option_one, 1)
            }

            R.id.tv_option_two -> {

                selectedOptionView(tv_option_two, 2)
            }

            R.id.tv_option_three -> {

                selectedOptionView(tv_option_three, 3)
            }

            R.id.tv_option_four -> {

                selectedOptionView(tv_option_four, 4)
            }

            R.id.btn_submit -> {

                if (mSelectedOptionPosition == 0) {
                    Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    answer += ( question!!.options[mSelectedOptionPosition - 1].second * question!!.pValue )
                    goToNextQuestion()

                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun goToNextQuestion() {
        mCurrentPosition++

        when {

            mCurrentPosition <= mQuestionsList!!.size -> {

                setQuestion()
            }
            else -> {

                // TODO (STEP 5: Now remove the toast message and launch the result screen which we have created and also pass the user name and score details to it.)
                // START
                val intent =
                    Intent(this@QuizQuestionsActivity, ResultActivity::class.java)
                intent.putExtra(Constants.USER_NAME, mUserName)
                intent.putExtra(Constants.CORRECT_ANSWERS, computeAnswer(answer))
                intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                startActivity(intent)
                finish()
                // END
            }
        }
    }


    private fun computeAnswer(result: Int): Int {
        //TODO: Compute Answer
        return result + 5
    }

    /**
     * A function for setting the question to UI components.
     */
    private fun setQuestion() {

        val question = mQuestionsList!!.get(mCurrentPosition - 1) // Getting the question from the list with the help of current position.

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btn_submit.text = "TERMINAR"
        } else {
            btn_submit.text = "CONTINUAR"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.getMax()

        tv_question.text = question.question
        if (question.options.size > 0) {
            tv_option_one.text = question.options[0].first
            tv_option_one.visibility = View.VISIBLE
        } else {
            tv_option_one.visibility = View.INVISIBLE
        }

        if (question.options.size > 1) {
            tv_option_two.text = question.options[1].first
            tv_option_two.visibility = View.VISIBLE
        } else {
            tv_option_two.visibility = View.INVISIBLE
        }

        if (question.options.size > 2) {
            tv_option_three.text = question.options[2].first
            tv_option_three.visibility = View.VISIBLE
        } else {
            tv_option_three.visibility = View.INVISIBLE
        }

        if (question.options.size > 3) {
            tv_option_four.text = question.options[3].first
            tv_option_four.visibility = View.VISIBLE
        } else {
            tv_option_four.visibility = View.INVISIBLE
        }
    }

    /**
     * A function to set the view of selected option view.
     */
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this@QuizQuestionsActivity,
                R.drawable.selected_option_border_bg
        )
    }

    /**
     * A function to set default options view when the new question is loaded or when the answer is reselected.
     */
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    R.drawable.default_option_border_bg
            )
        }
    }

    /**
     * A function for answer view which is used to highlight the answer is wrong or right.
     */
    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                        this@QuizQuestionsActivity,
                        drawableView
                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                        this@QuizQuestionsActivity,
                        drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                        this@QuizQuestionsActivity,
                        drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                        this@QuizQuestionsActivity,
                        drawableView
                )
            }
        }
    }
}