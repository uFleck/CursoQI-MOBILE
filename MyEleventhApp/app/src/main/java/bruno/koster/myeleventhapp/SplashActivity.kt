package bruno.koster.myeleventhapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private var delayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 2500

    internal val runnable = Runnable {
        if(!isFinishing){
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        delayHandler = Handler()
        delayHandler!!.postDelayed(runnable, SPLASH_DELAY)
    }

    override fun onDestroy() {
        super.onDestroy()
        delayHandler?.let {
            it.removeCallbacks(runnable)
        }
    }
}