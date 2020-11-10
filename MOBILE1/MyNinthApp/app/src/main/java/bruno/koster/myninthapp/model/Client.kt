package bruno.koster.myninthapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class Client (
              @PrimaryKey(autoGenerate = true)
              var id: Int?,
              var name: String?,
              var gender: String?,
              var income: Double?) : Serializable {

    override fun toString(): String {
        return "Client(name='$name', gender='$gender', income=$income)"
    }
}