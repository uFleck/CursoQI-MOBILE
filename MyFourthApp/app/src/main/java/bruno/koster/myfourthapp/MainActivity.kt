package bruno.koster.myfourthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var buttonFiora: Button
    lateinit var buttonLillia: Button
    lateinit var buttonMissFortune: Button
    lateinit var buttonPoppy: Button
    lateinit var buttonTalon: Button
    lateinit var buttonShaco: Button
    lateinit var buttonYone: Button
    lateinit var buttonVayne: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Fiora Settings
        buttonFiora = findViewById(R.id.fiora)

        buttonFiora.setOnClickListener {
            Snackbar.make(it, getText(R.string.fiora_name), Snackbar.LENGTH_LONG).show()
        }

        buttonFiora.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.fiora_name))
            alert.setMessage(getText(R.string.fiora_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.fiora))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }

//      Lillia Settings
        buttonLillia = findViewById(R.id.lillia)

        buttonLillia.setOnClickListener {
            Snackbar.make(it, getText(R.string.lillia_name), Snackbar.LENGTH_LONG).show()
        }

        buttonLillia.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.lillia_name))
            alert.setMessage(getText(R.string.lillia_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.lillia))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }

//      Miss Fortune Settings
        buttonMissFortune = findViewById(R.id.missFortune)

        buttonMissFortune.setOnClickListener {
            Snackbar.make(it, getText(R.string.missFortune_name), Snackbar.LENGTH_LONG).show()
        }

        buttonMissFortune.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.missFortune_name))
            alert.setMessage(getText(R.string.missFortune_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.miss_fortune))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }

//      Poppy Settings
        buttonPoppy = findViewById(R.id.poppy)

        buttonPoppy.setOnClickListener {
            Snackbar.make(it, getText(R.string.poppy_name), Snackbar.LENGTH_LONG).show()
        }

        buttonPoppy.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.poppy_name))
            alert.setMessage(getText(R.string.poppy_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.poppy))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }

//      Talon Settings
        buttonTalon = findViewById(R.id.talon)

        buttonTalon.setOnClickListener {
            Snackbar.make(it, getText(R.string.talon_name), Snackbar.LENGTH_LONG).show()
        }

        buttonTalon.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.talon_name))
            alert.setMessage(getText(R.string.talon_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.talon))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }

//      Shaco Settings
        buttonShaco = findViewById(R.id.shaco)

        buttonShaco.setOnClickListener {
            Snackbar.make(it, getText(R.string.shaco_name), Snackbar.LENGTH_LONG).show()
        }

        buttonShaco.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.shaco_name))
            alert.setMessage(getText(R.string.shaco_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.shaco))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }

//      Yone Settings
        buttonYone = findViewById(R.id.yone)

        buttonYone.setOnClickListener {
            Snackbar.make(it, getText(R.string.yone_name), Snackbar.LENGTH_LONG).show()
        }

        buttonYone.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.yone_name))
            alert.setMessage(getText(R.string.yone_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.yone))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }

//      Vayne Settings
        buttonVayne = findViewById(R.id.vayne)

        buttonVayne.setOnClickListener {
            Snackbar.make(it, getText(R.string.vayne_name), Snackbar.LENGTH_LONG).show()
        }

        buttonVayne.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle(getText(R.string.vayne_name))
            alert.setMessage(getText(R.string.vayne_bibliography))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.vayne))
            alert.setNeutralButton("OK!", null)
            alert.show()
            true
        }
    }
}