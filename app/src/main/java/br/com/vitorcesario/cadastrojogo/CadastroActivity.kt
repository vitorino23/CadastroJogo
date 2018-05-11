package br.com.vitorcesario.cadastrojogo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btCadastrar.setOnClickListener {
            val telaSucesso = Intent(this, SucessoCadastroActivity::class.java)
            //telaSucesso.putExtra("nome", etNome.text.toString())
            val jogo = Jogo(etNome.text.toString(), etGenero.text.toString(), etAno.text.toString().toInt())
            telaSucesso.putExtra("jogo", jogo)
            startActivity(telaSucesso)
            Limpar()
        }

        btLimpar.setOnClickListener {
            Limpar()
        }
    }

    fun Limpar(){
        etNome.setText("")
        etGenero.setText("")
        etAno.setText("")
    }
}
