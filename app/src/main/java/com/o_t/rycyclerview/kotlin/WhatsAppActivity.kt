package com.o_t.rycyclerview.kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.o_t.rycyclerview.R
import com.o_t.rycyclerview.databinding.ActivityWhatsAppBinding
import com.o_t.rycyclerview.kotlin.Fragments.ChatsFragment
import com.o_t.rycyclerview.kotlin.Fragments.CommunityFragment
import com.o_t.rycyclerview.kotlin.Fragments.UpdatesFragment

class WhatsAppActivity : AppCompatActivity() {
    lateinit var binding: ActivityWhatsAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWhatsAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chatsButton.setOnClickListener {
            it
            pushFragment(ChatsFragment())
        }

        binding.updatesButton.setOnClickListener {
            it
            pushFragment(UpdatesFragment())
        }

        binding.comunitiesButton.setOnClickListener {
            it
            pushFragment(CommunityFragment())
        }

    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(
            binding.whatsAppFragmentContainer.id,
            fragment
        ).addToBackStack(null).commit()

    }
}