package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Here comes question one",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            1, "Here comes question two",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            1, "Here comes question three",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            1, "Here comes question four",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            1, "Here comes question five",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            1, "Here comes question six",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            1, "Here comes question seven",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            1, "Here comes question eight",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            1, "Here comes question nine",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            1, "Here comes question ten",
            R.drawable.ic_flag_of_argentina,
            "Answer 1", "Answer 2",
            "Answer 3", "Answer 4", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}