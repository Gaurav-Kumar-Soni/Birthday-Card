package chatapp.example.birthdaycard

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetCardActivity : AppCompatActivity() {
    companion object{
        const val Name_Extra = "name extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet_card)
        val name = intent.getStringExtra(Name_Extra)

        val wishTextView:TextView = findViewById(R.id.wishTextView)
        wishTextView.text = "Happy Birthday $name"
    }
}



