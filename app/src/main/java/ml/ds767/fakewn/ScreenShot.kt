package ml.ds767.fakewn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ScreenShot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_shot)

        val scoreArr=intent.getIntArrayExtra(EXTRA_ARRAY)

    }

    //val textTime=findViewById<TextView>(R.id.Time).apply{}
    //val textScore=findViewById<TextView>(R.id.Score).apply {}




}
