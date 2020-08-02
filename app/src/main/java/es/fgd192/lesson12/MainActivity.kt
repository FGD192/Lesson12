package es.fgd192.lesson12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var button: Button? = null
    var adapter = ItemsAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupRecyclerView()
        setupListener()
        getData()
    }

    private fun setupView() {
        recyclerView = findViewById(R.id.ReVi)
        button = findViewById(R.id.button)

    }

    private fun setupRecyclerView() {
        recyclerView?.adapter = adapter
        adapter.update(getData())
    }
    private fun getData(): ArrayList<ItemData> {
        var list = arrayListOf<ItemData>()
        for (i in 1..50){
            list.add(ItemData("Hello$i", "World$i"))
        }
        return list
    }
    private fun setupListener() {
        button?.setOnClickListener{
            adapter.delete(0)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    }
    