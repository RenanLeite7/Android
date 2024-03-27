
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.R
import carreiras.com.github.orgs.model.Produto
import carreiras.com.github.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    @@ -14,16 +17,23 @@ class MainActivity : Activity() {

        // Binding: processo de vinculação do código fonte com o arquivo de layout.
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas") ou
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e uva"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
        context = this,
        produtos = listOf(
        Produto("Teste 0", "Teste Descrição 0", BigDecimal("19.90")),
        Produto("Teste 1", "Teste Descrição 1", BigDecimal("29.90")),
        Produto("Teste 2", "Teste Descrição 2", BigDecimal("39.90")),
        )
        )
        // Pode ser configurado no layout
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}