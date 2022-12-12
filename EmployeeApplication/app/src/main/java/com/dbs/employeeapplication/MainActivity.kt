package com.dbs.employeeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.dbs.employeeapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.activity_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when (item.itemId) {
            R.id.action_SignIn -> {
                val intent = Intent(this,SignInActivity::class.java)
                startActivity(intent)
            }
            R.id.action_SignUp -> {
                val intent1 = Intent(this,RegistrationActivity::class.java)
                startActivity(intent1)
            }
            R.id.action_History -> {
                val intent = Intent(this, HistoryActivity::class.java)
                startActivity(intent)
            }
        }
    return super.onOptionsItemSelected(item)

    }

        override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}