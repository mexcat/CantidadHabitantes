package cl.gencina.cantidadhabitantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.gencina.cantidadhabitantes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        initAdapter()

        setContentView(binding.root)
    }

    private fun initAdapter() {
        val adapter = RecyclerViewAdapter()
        adapter.setData(PaisesLatam.paises)
        binding.rvPaises.adapter = adapter
    }

    fun showData(pais: Pais){
        binding.tvData.text = "La cantidad de habitantes de ${pais.nombre} es de ${pais.poblacion}"
    }
}