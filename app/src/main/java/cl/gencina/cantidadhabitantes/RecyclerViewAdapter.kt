package cl.gencina.cantidadhabitantes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.gencina.cantidadhabitantes.databinding.ItemBinding
import coil.load

class RecyclerViewAdapter():RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var listaPaises: List<Pais> = mutableListOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
       return ViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
       )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaPaises[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return listaPaises.size
    }

    fun setData(listaPaises: List<Pais>){
        this.listaPaises = listaPaises
    }

    inner class ViewHolder (private val binding:ItemBinding): RecyclerView.ViewHolder(binding.root){

       fun bind(item: Pais){
           binding.tvPaisNombre.text = item.nombre
           binding.ivBandera.load(item.imgUrl)

           binding.cvPais.setOnClickListener {
               //MainActivity().showData(item)
           }
       }
    }
}