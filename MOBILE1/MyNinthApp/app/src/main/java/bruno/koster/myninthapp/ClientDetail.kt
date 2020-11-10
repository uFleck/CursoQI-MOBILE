package bruno.koster.myninthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bruno.koster.myninthapp.extensions.toast
import bruno.koster.myninthapp.model.Client

class ClientDetail : AppCompatActivity() {

    private lateinit var client: Client

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_detail)

        client = intent.getSerializableExtra("client") as Client

        toast("Cliente que chegou: $client")
    }
}