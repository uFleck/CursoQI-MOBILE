package bruno.koster.myeighthapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import bruno.koster.myeighthapp.model.Bank

class MainActivity2 : AppCompatActivity() {
    private lateinit var buttonAdd : Button
    private lateinit var buttonRemove : Button
    private lateinit var textViewMoney : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initializer()

        buttonAdd.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }

        buttonRemove.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity4::class.java)
            startActivity(intent)
        }
        val bank = intent.getParcelableExtra<Bank>("bank")
        textViewMoney.text = bank?.toString()
    }

    private fun initializer() {
        buttonAdd = findViewById(R.id.add_money)
        buttonRemove = findViewById(R.id.remove_money)
        textViewMoney = findViewById(R.id.money)
    }
}