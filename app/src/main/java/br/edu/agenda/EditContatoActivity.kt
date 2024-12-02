package br.edu.agenda

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import br.edu.agenda.databinding.ActivityEditContatoBinding

class EditContatoActivity : ComponentActivity() {

    private lateinit var binding: ActivityEditContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditContatoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contatoId = intent.getLongExtra("id", -1)
        val nome = intent.getStringExtra("nome") ?: ""
        val fone = intent.getStringExtra("fone") ?: ""


        if (nome != null) binding.editTextNome.setText(nome)
        if (fone != null) binding.editTextFone.setText(fone)

        binding.buttonSave.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("id", contatoId)
            resultIntent.putExtra("nome", binding.editTextNome.text.toString())
            resultIntent.putExtra("fone", binding.editTextFone.text.toString())
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}

