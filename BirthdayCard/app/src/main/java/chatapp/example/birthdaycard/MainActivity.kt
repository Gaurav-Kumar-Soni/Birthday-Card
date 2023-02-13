package chatapp.example.birthdaycard
//
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardMakerBtn:Button = findViewById(R.id.btnCardMaker)
        val inputName:EditText = findViewById(R.id.inputName)

        cardMakerBtn.setOnClickListener{
            val name = inputName.text.toString()
            val intent = Intent(this, GreetCardActivity::class.java)
            intent.putExtra("PersonName", name)
            startActivity(intent)
        }


    }

}
