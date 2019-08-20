package ml.ds767.fakewn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.TextView
import java.sql.Date
import java.sql.Time
import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter

class ScreenShot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_shot)

        val scoreArr=intent.getIntArrayExtra(EXTRA_ARRAY)
//日期格式等
        val sdf=SimpleDateFormat("yyyy.MM.dd")
        val sdfmd=SimpleDateFormat("MM.dd")

        val today=Date(System.currentTimeMillis())
        val ymd=sdf.format(today)
//当日日期
        findViewById<TextView>(R.id.Time).apply { text=ymd}
//进度条上日期
        val cal= Calendar.getInstance()
        cal.setTime(today)
        cal.add(Calendar.DAY_OF_MONTH,-1)
        findViewById<TextView>(R.id.date1).apply { text=sdfmd.format(cal.time)}
        cal.add(Calendar.DAY_OF_MONTH,-1)
        findViewById<TextView>(R.id.date2).apply { text=sdfmd.format(cal.time)}
        cal.add(Calendar.DAY_OF_MONTH,-1)
        findViewById<TextView>(R.id.date3).apply { text=sdfmd.format(cal.time)}
        cal.add(Calendar.DAY_OF_MONTH,-1)
        findViewById<TextView>(R.id.date4).apply { text=sdfmd.format(cal.time)}
        cal.add(Calendar.DAY_OF_MONTH,-1)
        findViewById<TextView>(R.id.date5).apply { text=sdfmd.format(cal.time)}
        cal.add(Calendar.DAY_OF_MONTH,-1)
        findViewById<TextView>(R.id.date6).apply { text=sdfmd.format(cal.time)}
        cal.add(Calendar.DAY_OF_MONTH,-1)
        findViewById<TextView>(R.id.date7).apply { text=sdfmd.format(cal.time)}
//时分设置
        val sdfhm=SimpleDateFormat("HH:mm")
        cal.setTime(today)
        val random=Random().nextInt(10)
        cal.add(Calendar.MINUTE,-random)
        findViewById<TextView>(R.id.clock1).apply { text=sdfhm.format(cal.time) }
        cal.add(Calendar.MINUTE,-random)
        findViewById<TextView>(R.id.clock2).apply { text=sdfhm.format(cal.time) }
        cal.add(Calendar.MINUTE,-random)
        findViewById<TextView>(R.id.clock3).apply { text=sdfhm.format(cal.time) }
        cal.add(Calendar.MINUTE,-random)
        findViewById<TextView>(R.id.clock4).apply { text=sdfhm.format(cal.time) }

    }


    //val textScore=findViewById<TextView>(R.id.Score).apply {}




}
