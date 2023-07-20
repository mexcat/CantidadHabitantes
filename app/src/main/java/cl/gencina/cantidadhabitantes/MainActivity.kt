package cl.gencina.cantidadhabitantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.gencina.cantidadhabitantes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), PaisCallback {
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
        adapter.callback = this
        binding.rvPaises.adapter = adapter
    }

    override fun mostrarPais(data: String) {
        binding.tvData.text = data
    }
}