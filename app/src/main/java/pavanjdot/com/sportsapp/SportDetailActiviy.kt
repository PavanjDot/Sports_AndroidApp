package pavanjdot.com.sportsapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sport_detail_activiy.*

class SportDetailActiviy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_detail_activiy)

        val receivedData = intent.extras

        val sportImage = receivedData.getInt("image")
        val sportdetails = receivedData.getString("details")

        detailImage.setImageResource(sportImage)
        detailText.setText(sportdetails)
    }
}
