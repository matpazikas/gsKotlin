package matpazikas.com.github.matheuspazikas_rm94463_recyclerview

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import matpazikas.com.github.matheuspazikas_rm94463_recyclerview.adapter.ItemsAdapter
import matpazikas.com.github.matheuspazikas_rm94463_recyclerview.model.ItemModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        val itemsAdapter = ItemsAdapter()
        recyclerView.adapter = itemsAdapter

        val buttonPraia = findViewById<ImageButton>(R.id.deletePraia)
        val editTextPraia = findViewById<EditText>(R.id.editPraia)
        val buttonCidade = findViewById<ImageButton>(R.id.deleteCidade)
        val editTextCidade = findViewById<EditText>(R.id.editCidade)
        val buttonEstado = findViewById<ImageButton>(R.id.deleteEstado)
        val editTextEstado = findViewById<EditText>(R.id.editEstado)
        val buttonInserir = findViewById<Button>(R.id.buttonInserir)

        buttonPraia.setOnClickListener {
            if (editTextPraia.text.isEmpty()) {
                editTextPraia.error = "Preencha um valor"
                return@setOnClickListener
            }
            val item = ItemModel(
                name = editTextPraia.text.toString(),
                onRemove = {
                    itemsAdapter.removeItem(it)
                }
            )
            editTextPraia.text.clear()
        }

        buttonCidade.setOnClickListener {
            if (editTextCidade.text.isEmpty()) {
                editTextCidade.error = "Preencha um valor"
                return@setOnClickListener
            }
            val item = ItemModel(
                name = editTextCidade.text.toString(),
                onRemove = {
                    itemsAdapter.removeItem(it)
                }
            )
            editTextCidade.text.clear()
        }

        buttonEstado.setOnClickListener {
            if (editTextEstado.text.isEmpty()) {
                editTextEstado.error = "Preencha um valor"
                return@setOnClickListener
            }
            val item = ItemModel(
                name = editTextEstado.text.toString(),
                onRemove = {
                    itemsAdapter.removeItem(it)
                }
            )
            editTextEstado.text.clear()
        }

        buttonInserir.setOnClickListener {
            val praia = ItemModel(
                name = editTextPraia.text.toString(),
                onRemove = {
                    itemsAdapter.removeItem(it)
                }
            )
            itemsAdapter.addItem(praia)
            editTextPraia.text.clear()

            val cidade = ItemModel(
                name = editTextCidade.text.toString(),
                onRemove = {
                    itemsAdapter.removeItem(it)
                }
            )
            itemsAdapter.addItem(cidade)
            editTextCidade.text.clear()

            val estado = ItemModel(
                name = editTextEstado.text.toString(),
                onRemove = {
                    itemsAdapter.removeItem(it)
                }
            )
            itemsAdapter.addItem(estado)
            editTextEstado.text.clear()
        }
    }
}