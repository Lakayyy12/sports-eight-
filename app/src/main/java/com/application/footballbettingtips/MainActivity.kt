package com.application.footballbettingtips

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var btn1 : Button? = null
    private var tip1 : Button? = null

    private var exit = 0

    //actionbar
    private  lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init actionbar
        loadCards()
        //add page change listener
        viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

                //change title of actionbar
                var title = myModelList[position].title

            }

            override fun onPageSelected(position: Int) {
            }
            override fun onPageScrollStateChanged(state: Int) {
            }
        })
        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener{
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)}

        tip1 = findViewById(R.id.tip1)
        tip1?.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)}
    }
    private fun loadCards(){
        //init list
        myModelList = ArrayList()

        //add items/data to list
        myModelList.add(MyModel(
            "Today's game predictions: what are the best bets?",
        R.string.desc1,
        R.drawable.f1))
        myModelList.add(MyModel(
            "What factors do specialists consider when predicting a match?",
            R.string.desc2,
            R.drawable.f2))
        myModelList.add(MyModel(
            "How to Make Money Betting on Football",
            R.string.desc3,
            R.drawable.f3))
        myModelList.add(MyModel(
            "The foundation for your sports betting",
            R.string.desc4,
            R.drawable.f4))
        myModelList.add(MyModel(
            "How can I get started betting online?",
            R.string.desc5,
            R.drawable.f5))
        myModelList.add(MyModel(
            "Online betting forecasts and news",

            R.string.desc6,
            R.drawable.f6))
        myModelList.add(MyModel(
            "Total Objectives",
            R.string.desc7,
            R.drawable.f7))

        //setup adapter
        myAdapter = MyAdapter(this, myModelList)

        //set adapter to viewpager
        viewPager.adapter = myAdapter

        // set default padding
        viewPager.setPadding(100,0,100,0)
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}