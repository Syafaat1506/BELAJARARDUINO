package com.example.belajararduino

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VersionAdapter(val versionList:List<Versions>) :
        RecyclerView.Adapter<VersionAdapter.VersionVH>(){
    class VersionVH(itemView: View) :RecyclerView.ViewHolder(itemView){

        val jenis: TextView = itemView.findViewById(R.id.tvJenis)
        var pengertian : TextView = itemView.findViewById(R.id.tvPengertian)
        var uno : ImageView = itemView.findViewById(R.id.imgUno)
        var tvuno : TextView = itemView.findViewById(R.id.tvUno)
        var leo : ImageView = itemView.findViewById(R.id.imgLeo)
        var tvleo : TextView = itemView.findViewById(R.id.tvleonardo)
        var due : ImageView = itemView.findViewById(R.id.imgDue)
        var tvdue : TextView = itemView.findViewById(R.id.tvDue)
        var mega : ImageView = itemView.findViewById(R.id.imgMega)
        var tvmega : TextView = itemView.findViewById(R.id.tvMega)
        var linearLayout : LinearLayout = itemView.findViewById(R.id.linearLayout)
        var expandablelayout : RelativeLayout = itemView.findViewById(R.id.expandable_layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionVH {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)

        return VersionVH(view)
    }

    override fun onBindViewHolder(holder: VersionVH, position: Int) {

        val versions : Versions = versionList[position]
        holder.jenis.text = versions.jenis
        holder.pengertian.text = versions.pengertian
        holder.uno.setImageResource(versions.uno)
        holder.tvuno.text = versions.tvuno
        holder.leo.setImageResource(versions.leo)
        holder.tvleo.text = versions.tvleo
        holder.due.setImageResource(versions.due)
        holder.tvdue.text = versions.tvdue
        holder.mega.setImageResource(versions.mega)
        holder.tvmega.text = versions.tvmega

        val isExpandable : Boolean = versionList[position].expandable
        holder.expandablelayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.linearLayout.setOnClickListener{
            val versions = versionList[position]
            versions.expandable = !versions.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return versionList.size
    }
}