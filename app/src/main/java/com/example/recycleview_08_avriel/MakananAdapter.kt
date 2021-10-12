package com.example.recycleview_08_avriel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter (private  val context: Context, private val makanan: List<Makanan>, val listener: (Makanan) -> Unit)
    : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>(){

        class  MakananViewHolder(view: View): RecyclerView.ViewHolder(view) {

            val imgMakanan = view.findViewById<ImageView>(R.id.img_item_photo)
            val nameMakanan = view.findViewById<TextView>(R.id.tv_item_name)
            val descMakanan = view.findViewById<TextView>(R.id.tv_item_description)

            fun bindview(makanan: Makanan, listener: (Makanan) -> kotlin.Unit){
                imgMakanan.setImageResource(makanan.imgMakanan)
                nameMakanan.text = makanan.nameMakanan
                descMakanan.text = makanan.descMakanan
                itemView.setOnClickListener{
                    listener(makanan)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        return MakananViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        holder.bindview(makanan[position],listener)
    }

    override fun getItemCount(): Int = makanan.size
}