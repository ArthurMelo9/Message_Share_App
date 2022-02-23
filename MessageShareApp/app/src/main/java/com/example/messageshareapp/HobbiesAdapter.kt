package com.example.messageshareapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class HobbiesAdapter(val context: Context, val hobbies:List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){


    lateinit var  textViewTitle : TextView


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
         val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
         return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)


    }

    override fun getItemCount(): Int {
         return hobbies.size
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        lateinit var textViewTitle : TextView

        var currentHobby:Hobby? = null
        var currentPosition:Int = 0

        init{
           itemView.setOnClickListener {
               //Toast.makeText(this, "${currentHobby!!.title} clicked!", Toast.LENGTH_SHORT).
           }
        }
        fun setData(hobby:Hobby?, pos:Int){
            itemView.findViewById<TextView>(R.id.txvTitle).text = hobby!!.title

            this.currentHobby = hobby
            this.currentPosition = pos
        }

    }
}