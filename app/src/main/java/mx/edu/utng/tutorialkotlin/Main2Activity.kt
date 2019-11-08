package mx.edu.utng.tutorialkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        if (bundle != null) {
            val word = bundle.getString("ID")
            val pic = bundle.getString("pic")
            val ima = bundle.getString("img")
            val text = bundle.getString("text")
            //PonerTexto
            tv1.text = word
            tv2.text=text

            //PonerImagen
            val uri = "drawable/$pic"
            val imageResource = resources.getIdentifier(uri, null, packageName)
            val image = resources.getDrawable(imageResource)
            imt.setImageDrawable(image)
            val uri2 = "drawable/$ima"
            val imageResource2 = resources.getIdentifier(uri2, null, packageName)
            val image2 = resources.getDrawable(imageResource2)
            img.setImageDrawable(image2)
        } else {
            Toast.makeText(this, "Error Fatal", Toast.LENGTH_LONG).show()
        }
    }
}
