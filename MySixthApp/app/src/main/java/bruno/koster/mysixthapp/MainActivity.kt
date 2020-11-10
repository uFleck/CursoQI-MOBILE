package bruno.koster.mysixthapp

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var age: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializer()

        button.setOnClickListener {
            var name: String = name.text.toString()
            var age: Int = age.text.toString().toInt()
            generateRandomNumber()

            val info = listOf(name, age)
            message2.text = "$info"
        }

    }

    private fun generateRandomNumber() {
        vibrate()
        var randomNumber = (0..100).shuffled().first()
        message.text = "A sua probabilidade de ser corno é: $randomNumber %"

        if(randomNumber >= 90){
            toast("Você é o rei dos cornos.")
        } else {
            toast("Pequeno corninho.")
        }
    }

    private fun vibrate(){
        val pattern = longArrayOf(0, 200, 100, 300)

        val hardware = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        hardware.let {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                hardware.vibrate(VibrationEffect.createWaveform(pattern, -1))
            } else {
                hardware.vibrate(pattern, -1)
            }
        }
    }

    private fun toast(message: String){
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

    private fun initializer() {
        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
        button = findViewById(R.id.verificar)
    }
}