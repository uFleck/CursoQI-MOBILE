package bruno.koster.myninthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import bruno.koster.myninthapp.adapters.ClientAdapter
import bruno.koster.myninthapp.dao.AppDatabase
import bruno.koster.myninthapp.dao.ClientDAO
import bruno.koster.myninthapp.extensions.toast
import bruno.koster.myninthapp.model.Client
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ClientAdapter
    private var clients = arrayListOf<Client>()

//    private lateinit var clientDAO: ClientDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = AppDatabase.openDatabase(this@MainActivity)
        this.clients = database!!.clientDAO().fetchClients() as ArrayList<Client>

        adapter = ClientAdapter(clients, this@MainActivity) { client: Client ->
            resultItemClicked(
                client
            )
        }

        recyclerViewClients.adapter = adapter
        recyclerViewClients.layoutManager = LinearLayoutManager(this@MainActivity)

        buttonOK.setOnClickListener {
            var client = Client(
                null,
                editTextName.text.toString(),
                editTextGender.text.toString(),
                editTextIncome.text.toString().toDouble())

            this.clients.add(client) // salvando no array

            database.clientDAO().store(client)
            database.clientDAO().store(client)

//            this.clientDAO.store(client) //salvando no banco!

            adapter.notifyInsertedItemList()

            toast("Cliente cadastrado com sucesso!")
        }
    }

    override fun onPause() {
        super.onPause()
//        clientDAO.closeDatabase()
    }

    override fun onRestart() {
        super.onRestart()
//        clientDAO.openDatabaseWritable()
    }

    private fun resultItemClicked(client: Client) {
        toast("Você clicou em: $client")
        Log.d("tag clicou", "tag clicou result ma")

        val dialogBuilder = AlertDialog.Builder(this@MainActivity)

        val alert = dialogBuilder
            .setTitle("Atenção")
            .setCancelable(false)
            .setMessage("Alterar ou ir para a próxima tela?")
            .setPositiveButton("Alterar") { _, _: Int ->
                val client1 = Client(10, "Juninho", "M", 1341.4)
                this.adapter.notifyDataChanged() //notifiquei o adapter sobre a mudança

                toast("Cliente alterado com sucesso")
            }
            .setNegativeButton("Ir para próxima tela") { _, _ ->

                //programacao... se ele clicar no proxima tela
                val intent = Intent(this@MainActivity, ClientDetail::class.java)
                intent.putExtra("client", client)
                startActivity(intent)

            }.create()
        alert.show()
    }
}