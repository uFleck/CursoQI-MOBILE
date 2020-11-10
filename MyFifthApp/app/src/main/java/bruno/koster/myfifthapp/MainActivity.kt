package bruno.koster.myfifthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var button1: Button? = null
    lateinit var button2: Button
    val button3 by lazy { findViewById<Button>(R.id.button3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.button1 -> {
                Toast.makeText(baseContext, "Olá, ${getName()}", Toast.LENGTH_LONG).show()
            }

            R.id.button2 -> {
                Toast.makeText(baseContext, "Seu último nome é ${getLastName()}", Toast.LENGTH_LONG).show()
            }

            R.id.button3 -> {
                Toast.makeText(baseContext, "Você nasceu em ${getNasc()}, portanto...", Toast.LENGTH_LONG).show()
            }

            R.id.button4 -> {
                Toast.makeText(baseContext, "Você tem ${getAge()} anos de idade!", Toast.LENGTH_LONG).show()
            }

            else -> {
                Toast.makeText(baseContext, "errozinho!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun getName(): String {
        return "Bruno"
    }

    fun getLastName(): String {
        return "Koster"
    }

    fun getNasc(): Int {
        return 2004
    }

    fun getAge(): Int {
        return 2020 - 2004
    }

    fun initializer() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        button1?.setOnClickListener(this@MainActivity)
        button2.setOnClickListener(this@MainActivity)
        button3.setOnClickListener(this@MainActivity)
        button4.setOnClickListener(this@MainActivity)
    }
}