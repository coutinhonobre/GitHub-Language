package com.github.coutinhonobre.githublanguage.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.coutinhonobre.githublanguage.R
import com.github.coutinhonobre.githublanguage.domain.model.Item
import com.github.coutinhonobre.githublanguage.domain.model.Owner
import com.github.coutinhonobre.githublanguage.presentation.adapter.RepositoryListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RepositoryListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: MutableList<Item> = mutableListOf()
        for(i in 1..10) {
            list.add(
                Item(
                    name = "Repo test $i",
                    stargazersCount = 4,
                    forksCount = 1,
                    owner = Owner(
                        login = "User $i",
                        avatarUrl = "https://avatars.githubusercontent.com/u/82592?v=4"
                    )
                )
            )
        }

        adapter = RepositoryListAdapter(list = list)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}