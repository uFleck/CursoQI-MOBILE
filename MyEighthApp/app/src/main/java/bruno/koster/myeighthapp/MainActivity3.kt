package bruno.koster.myeighthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import bruno.koster.myeighthapp.model.Bank

class MainActivity3 : AppCompatActivity() {
    private lateinit var buttonBack : Button
    private lateinit var buttonAdd : Button
    private lateinit var spinnerMoney : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        initializer()
        var money: Double? = null

        buttonBack.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity2::class.java)
            startActivity(intent)
        }

        buttonAdd.setOnClickListener {
            if (spinnerMoney.selectedItemPosition == 0) {
                toast("${resources.getText(R.string.select)}")
            } else {
                when (spinnerMoney.selectedItem) {
                    "0,5" -> {
                        money = 0.5
                    }
                    "0,10" -> {
                        money = 0.10
                    }
                    "0,25" -> {
                        money = 0.25
                    }
                    "0,50" -> {
                        money = 0.50
                    }
                    "1" -> {
                        money = 1.0
                    }
                    "2" -> {
                        money = 2.0
                    }
                    "5" -> {
                        money = 5.0
                    }
                    "10" -> {
                        money = 10.0
                    }
                    "20" -> {
                        money = 20.0
                    }
                    "50" -> {
                        money = 50.0
                    }
                    "100" -> {
                        money = 100.0
                    }
                    "200" -> {
                        money = 200.0
                    }
                }

                val bank = Bank(money)
                val intent = Intent(this@MainActivity3, MainActivity2::class.java)
                intent.putExtra("bank", bank)
                startActivity(intent)
            }

        }
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_SHORT).show()
    }

    private fun initializer() {
        buttonBack = findViewById(R.id.back)
        buttonAdd = findViewById(R.id.add)
        spinnerMoney = findViewById(R.id.spinnerMoney)
    }
}