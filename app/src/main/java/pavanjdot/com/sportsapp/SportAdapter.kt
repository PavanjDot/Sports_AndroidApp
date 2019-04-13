package pavanjdot.com.sportsapp

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.sport_item.view.*

class SportAdapter: BaseAdapter {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

       var sport: Sport =  sportDatabase?.sports?.get(position)
            ?: Sport("No Name", "No Details", R.drawable.placeholder)

        var inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var sportItem = inflater.inflate(R.layout.sport_item, null)

        sportItem.sportimage.setImageResource(sport.sportImgae ?: R.drawable.placeholder )
        sportItem.sportname.setText(sport.sportName)

        sportItem.setOnClickListener {

            val detailIntent: Intent = Intent(context, SportDetailActiviy::class.java)
            detailIntent.putExtra("image", sport.sportImgae)
            detailIntent.putExtra("details", sport.sportDetails)
            ContextCompat.startActivity(context!!, detailIntent, null)
        }


        return sportItem




    }


    override fun getItem(position: Int): Any {

        return sportDatabase?.sports?.get(position)
            ?: Sport("No Name", "No Details",
                R.drawable.placeholder)
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getCount(): Int {

        return sportDatabase?.sports?.size ?: 0


    }

    private var context: Context? = null
    private var sportDatabase: SportDatabase? = null

    constructor(context: Context){

        this.context = context
        sportDatabase = SportDatabase()




    }





}