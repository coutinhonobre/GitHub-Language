package com.github.coutinhonobre.githublanguage.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.coutinhonobre.githublanguage.domain.model.Item
import com.github.coutinhonobre.githublanguage.R

internal class RepositoryListAdapter(
    private val list: MutableList<Item> = mutableListOf()
) : RecyclerView.Adapter<RepositoryListAdapter.RepositoryListAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryListAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_repository, parent, false)
        return RepositoryListAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: RepositoryListAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class RepositoryListAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val nameRepo: TextView = itemView.findViewById(R.id.nameRepoTextView)
        private val nameUser: TextView = itemView.findViewById(R.id.nameUserTextView)
        private val forks: TextView = itemView.findViewById(R.id.forksTextView)
        private val repoRatingBar: RatingBar = itemView.findViewById(R.id.repoRatingBar)

        fun bind(contact: Item) {
            with(contact) {
                nameRepo.text = name
                nameUser.text = owner?.login
                forks.text = forksCount.toString()
                repoRatingBar.rating = stargazersCount.toFloat()
            }
        }
    }
}