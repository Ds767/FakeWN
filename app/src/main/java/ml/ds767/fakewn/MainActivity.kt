package ml.ds767.fakewn

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


const val EXTRA_ARRAY="ml.ds767.FakeWN.ARRAY"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun create(view: View){
        val scoreArr= arrayOf(30,30,30,30,30,30,30,30)
        val intent=Intent(this,ScreenShot::class.java).apply {
            putExtra(EXTRA_ARRAY,scoreArr)
        }
        startActivity(intent)
    }

}
