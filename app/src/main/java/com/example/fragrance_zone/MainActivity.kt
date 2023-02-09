package com.example.fragrance_zone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragrance_zone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<fragranceData>
    lateinit var imageId: Array<Int>
    lateinit var title: Array<String>
    lateinit var details: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbar)
        initNavigation()

        imageId = arrayOf(R.drawable.per1,
        R.drawable.per2,
        R.drawable.per3,
        R.drawable.par4
        )
        title = arrayOf(
            "Dolce Gabana",
            "Bergamot",
            "panzer",
            "Love and Life"
        )
        details = arrayOf(
            "World's best smell",
            "Love of your life and energy",
            "Magic Blooms around you",
            "That is called a vibe for you"
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        newArrayList = arrayListOf<fragranceData>()
        getUserdata()
    }

    private fun getUserdata() {
    for (i in imageId.indices){
   val fragrancedata = fragranceData(imageId[i].toString(),title[i],details[i])
        newArrayList.add(fragrancedata)
    }
        recyclerView.adapter = MyFragranceAdapter(newArrayList)
    }

    private fun initNavigation() {
        val navHost = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        navController = navHost.navController
        NavigationUI.setupWithNavController(binding.toolbar, navController)
        binding.bottomNavigation.setupWithNavController(navController)
        binding.bottomNavigation.setOnNavigationItemReselectedListener {
            "Reselect blocked."
        }

        binding.toolbar.setNavigationOnClickListener {
            when (navController.currentDestination?.id) {
                R.id.searchFragment, R.id.gamesFragment, R.id.notificationsFragment -> {
                    if (onBackPressedDispatcher.hasEnabledCallbacks())
                        onBackPressedDispatcher.onBackPressed()
                    else
                        navController.navigateUp()
                }
                else -> navController.navigateUp()
            }
        }
    }
}