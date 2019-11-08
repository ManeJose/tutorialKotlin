package mx.edu.utng.tutorialkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var TextoLista = ArrayList<String>()
        TextoLista.add("Manejo de ListView")
        TextoLista.add("Manejo de Activities")
        TextoLista.add("SharedPreferences")
        TextoLista.add("Controles De audio")
        TextoLista.add("SQLite")




        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,TextoLista)

        Lv.adapter=adapter

        Lv.setOnItemClickListener { adapterView, view, i, l ->
            if(i==0){
                val intent = Intent(this, Main2Activity::class.java)
                    .putExtra("ID","Manejo de ListView")
                    .putExtra("text","La clase que representa una lista vertical en el API de Android se llama ListView. Esta clase viene preparada para recibir los ítems que desplegará en la interfaz, facilitando al programador la implementación de sus características y comportamientos.")
                    .putExtra("pic","list")
                    .putExtra("img","lv")
                startActivity(intent)
            }
            if(i==1){
                val intent = Intent(this, Main2Activity::class.java)
                    .putExtra("ID","Manejo de Activities")
                    .putExtra("text","Una Activity es un componente de la aplicación que contiene una pantalla con la que los usuarios pueden interactuar para realizar una acción, como marcar un número telefónico, tomar una foto, enviar un correo electrónico o ver un mapa.")
                    .putExtra("pic","activity")
                    .putExtra("img","ma")
                startActivity(intent)
            }
            if(i==2){
                val intent = Intent(this, Main2Activity::class.java)
                    .putExtra("ID","SharedPreferences")
                    .putExtra("text","Android stores Shared Preferences settings as XML file in shared_prefs folder under DATA/data/{application package} directory. The DATA folder can be obtained by calling Environment.getDataDirectory().")
                    .putExtra("pic","shap")
                    .putExtra("img","sp")

                startActivity(intent)
            }
            if(i==3){
                val intent = Intent(this, Main2Activity::class.java)
                    .putExtra("ID","Controles De audio")
                    .putExtra("text","La clase MediaPlayer es la que nos proporciona Android para interactuar con elementos multimedia. Si añadimos el código anterior a nuestra Activity principal el audio comenzará a reproducirse en cuanto se lance la aplicación.")
                    .putExtra("pic","audio")
                    .putExtra("img","audi")

                startActivity(intent)
            }
            if(i==4){
                val intent = Intent(this, Main2Activity::class.java)
                    .putExtra("ID","SQLite")
                    .putExtra("text","\n" +
                            "SQLite es una biblioteca de software que implementa un motor de base de datos SQL transaccional autónomo, sin servidor, de configuración cero. SQLite es el motor de base de datos SQL más implementado en el mundo.")
                    .putExtra("pic","s")
                    .putExtra("img","sl")

                startActivity(intent)
            }
        }
    }
}

