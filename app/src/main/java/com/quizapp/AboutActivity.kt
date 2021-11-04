package com.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        app_description.text = "El primer paso para realizar una inversión consiste en conocer su posición con relación al riesgo e identificar a qué nivel podemos exponernos para obtener mayores ganancias y poder seguir “durmiendo tranquilos” con nuestras inversiones. Además, es importante poder combinar distintos instrumentos para evitar “poner todos los huevos en una misma canasta”, debido a que nos exponemos a las variaciones del mercado o a tener resultados muy distintos a los esperados de una forma negativa.\n" +
                "\n" +
                "Un robo-advisor es una herramienta que, a través de un cuestionario permite la identificación de su perfil de inversor, en donde se distinguen aspectos como su conocimiento y experiencia en el mercado de inversiones, objetivos, actitud ante distintos escenarios hipotéticos del mercado, entre otros, para así poder sugerir una cartera adecuada según sus características como inversor con instrumentos del mercado de valores boliviano.  \n" +
                "\n" +
                "El mercado de valores es parte de sistema financiero y abarca el mercado de dinero, de corto plazo, y de capitales, de largo plazo, en donde se reúnen oferentes y demandantes de valores. La Bolsa Boliviana de Valores está en crecimiento y es una alternativa muy atractiva a la hora de ampliar nuestra cartera de inversión, a fin de buscar mayores rendimientos o poder disminuir los riesgos a los que se expone el inversor. \n" +
                "\n" +
                "La seguridad que la Bolsa Boliviana de Valores brinda al inversor es muy eficiente, ya que sus requerimientos garantizan la recuperación de su capital y el cumplimiento de los pagos en los plazos establecidos, haciendo énfasis en la capacidad de pago de las entidades que emiten los valores. \n"
        btn_ok.setOnClickListener {
            finish()
        }
    }
}