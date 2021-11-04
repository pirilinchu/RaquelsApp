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
            1, "Edad",
            arrayListOf(Pair("25-35 años", 1), Pair("36 – 55 años", 1), Pair("56 años en adelante", 0) ), 5
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Género",
            arrayListOf(Pair("Femenino", 0), Pair("Masculino", 1)), 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Nivel de educación",
            arrayListOf(Pair("Primaria", 0), Pair("Secundaria/Bachil", 0), Pair("Titulación universitaria", 1), Pair("Superior", 1)), 5
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "¿Realiza una planificación sobre la administración de sus recursos, sobre la base de cómo los obtendrá, dónde los aplicará (sus inversiones y gastos) y una proyección de sus futuros ingresos?",
            arrayListOf(Pair("No lo hago", 0), Pair("Lo básico", 0), Pair("Gestiono muy bien mis recursos porque tengo conocimiento en finanzas.", 1)), 10
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Indique el valor de sus ingresos anuales en bolivianos:",
            arrayListOf(Pair("X<= 25.968", 0), Pair("25.968 <X<=60.000", 1), Pair("X>60.000", 1) ), 8
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "¿Cuán estables son mis ingresos futuros?",
            arrayListOf(Pair("Inestables", 0), Pair("Estables", 1), Pair("Muy estables", 1) ), 8
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "¿Tiene patrimonio (casas, terrenos, joyas, cuadros, etc.)? Indique una aproximación de su valor en Bs.:",
            arrayListOf(Pair("X<= 35.000", 0), Pair("35000 <X<=70.000 ", 1), Pair("X>70.000 ", 1) ), 8
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "¿Cuánto aproximadamente gasta de sus ingresos mensuales?",
            arrayListOf(Pair("Menos del 50%", 0), Pair("El 50%.", 1), Pair("Más del 50%.", 1) ), 5
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "¿Ha realizado alguna vez una inversión?",
            arrayListOf(Pair("Sí", 1), Pair("No", 0)), 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "¿Ha realizado una inversión a través de una agencia de bolsa?",
            arrayListOf(Pair("Ninguna", 0), Pair("Una vez.", 1), Pair("Dos veces o más.", 1) ), 10
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "A la hora de realizar una inversión con mis ahorros prefiero:",
            arrayListOf(Pair("Tenerlos siempre disponibles para cualquier eventualidad.", 0), Pair("Mantenerlos en una inversión hasta tres años si las ganancias son atractivas.", 1), Pair("Mantener mi inversión por más de tres años exigiendo mayor rentabilidad.", 1) ), 5
        )

        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "¿Qué posición tomaría si se entera a través de los medios de comunicación que la bolsa cayó en un 5%?",
            arrayListOf(Pair("Retiro el total de mi inversión.", 0), Pair("Mantengo una parte.", 0), Pair("Mantengo mi posición y espero su recuperación.", 1) ), 12
        )

        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "¿Con cuál posición se siente más cómodo al momento de realizar una inversión?",
            arrayListOf(Pair("Ganar poco, exponiéndome a poco riesgo.", 0), Pair("Ganar con función al riesgo al que me estoy exponiendo, 50-50.", 1), Pair("Ganar más, exponiéndome a mayor riesgo.", 1) ), 10
        )

        questionsList.add(que13)

        // 14
        val que14 = Question(
            14, "¿Cuánto tiempo estoy dispuesto a dejar mis ahorros en el mercado de inversiones?",
            arrayListOf(Pair("Tres meses.", 0), Pair("Hasta un año.", 0), Pair("Más de un año.", 1) ), 8
        )

        questionsList.add(que14)

        return questionsList
    }

    fun getProfiles(): ArrayList<Profile> {
        val profileList = ArrayList<Profile>()
        var profile = Profile("Perfil conservador", "Valores de deuda (debt): Al ser un inversor con un perfil conservador no está dispuesto a perder dinero, por lo cual prefiere mantener su exposición al riesgo a un nivel mínimo. Los instrumentos adecuados para que pueda conformar una cartera son aquellos de contenido crediticio, por ejemplo: los bonos, pagarés, depósitos a plazo fijo, entre otros. Estos son valores que representan una obligación para el emisor, se podría decir que es un crédito para ellos, en donde usted como inversor invierte capital a cambio de un rendimiento o una ganancia por hacerlo. \n" +
                "Los valores de deuda tienen como característica el previo establecimiento del monto de capital o precio del valor a adquirir, la fecha de vencimiento o devolución de su inversión y los plazos en los cuales se cancelarán los flujos o rendimientos de su inversión. El plazo de vencimiento puede ser de corto, mediano o largo plazo.\n" +
                "En nuestra Bolsa Boliviana de Valores se negocian los siguientes títulos de deuda:\n" +
                "Bonos corporativos \n" +
                "Bonos convertibles\n" +
                "Bonos subordinados\n" +
                "Bonos participativos \n" +
                "Valores de titularización \n" +
                "Pagarés bursátiles \n" +
                "Pagarés en mesa de negociación \n" +
                "Certificados de depósito a plazo fijo\n" +
                "Letras del Tesoro General de la Nación y del Banco Central de Bolivia \n" +
                "Bonos del Tesoro General de la Nación y del Banco Central de Bolivia \n")
        profileList.add(profile)

        profile = Profile("Perfil moderado", "Valores participativos (equity) y deuda (debt): Al ser inversor conservador es precavido, pero está dispuesto a asumir riesgos en sus inversiones. Su cartera de inversión adecuada debería estar compuesta de valores participativos que son aquellos que emiten las empresas y que son parte de su capital social o patrimonio, tales como las acciones, estos valores presentan mayor riesgo, puesto que el pago de los dividendos de la gestión está en función a sus utilidades o en algunos casos se establece un porcentaje fijo, además se pueden generar ganancias por un incremento del precio de la acción.\n" +
                "Por otro lado, los valores de deuda permitirán diversificar su portafolio, que son aquellos que representan una obligación para el emisor, en donde el inversor coloca parte de su capital a cambio de un rendimiento o ganancia en plazos de pago previamente establecidos, así como la devolución del capital.\n" +
                "En nuestra Bolsa Boliviana de Valores se negocian los siguientes títulos de participación:\n" +
                "Acciones (ACC)\n" +
                "Cuotas de participación de Fondos de Inversión cerrados \n" +
                "En nuestra Bolsa Boliviana de Valores se negocian los siguientes títulos de deuda:\n" +
                "Bonos corporativos \n" +
                "Bonos convertibles\n" +
                "Bonos subordinados\n" +
                "Bonos participativos \n" +
                "Valores de titularización \n" +
                "Pagarés bursátiles \n" +
                "Pagarés en mesa de negociación \n" +
                "Certificados de depósito a plazo fijo\n" +
                "Letras del Tesoro General de la Nación y del Banco Central de Bolivia \n" +
                "Bonos del Tesoro General de la Nación y del Banco Central de Bolivia \n")
        profileList.add(profile)

        profile = Profile("Perfil arriesgado", "Como inversor arriesgado busca asumir más riesgo para maximizar su rentabilidad y obtener mejores resultados. Una cartera de inversión adecuada para su perfil debería tener una perspectiva de mediano plazo y mezclar valores, comprar, esperar a que suba el precio y posteriormente vender; si de valores participativos se trata, el portafolio debe conformarse con empresas que tengan planes de crecimiento o de cuotas de participación de fondos de inversión que sigan el comportamiento de algún índice. \n" +
                "Asimismo, el portafolio debe contar con un porcentaje de liquidez, para ello los valores a corto plazo o del mercado de dinero tienen una fecha de vencimiento menor a un año y se caracterizan por tener mayor liquidez, son importantes para una buena diversificación del portafolio y poder tener un porcentaje de reserva ante alguna eventualidad. Ahora bien, como inversor arriesgado también puede tomar posiciones en el mercado de derivados.\n" +
                "En nuestra Bolsa Boliviana de Valores se negocian los siguientes títulos de participación:\n" +
                "Acciones (ACC)\n" +
                "Cuotas de participación de Fondos de Inversión cerrados \n")
        profileList.add(profile)

        return profileList
    }

    fun getProfile(n: Int): Profile {
        return if ( n <= 33) getProfiles().find { profile -> profile.profileName == "Perfil conservador" }!!
        else if (n <= 67) getProfiles().find { profile -> profile.profileName == "Perfil moderado" }!!
        else getProfiles().find { profile -> profile.profileName == "Perfil arriesgado" }!!
    }
}