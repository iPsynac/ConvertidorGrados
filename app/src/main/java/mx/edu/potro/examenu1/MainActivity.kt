package mx.edu.potro.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC : EditText = findViewById(R.id.etC)
        val etF : EditText = findViewById(R.id.etF)

        val btnGC : Button = findViewById(R.id.btnGC)
        val btnGF :Button = findViewById(R.id.btnGF)

        btnGF.setOnClickListener {
            var  celsius = etC.text.toString().toDouble();
            var farenheitC = celsiusToFahrenheit(celsius)
            etF.setText(String.format("%.2f",farenheitC))
        }

        btnGC.setOnClickListener {
            var fahrenheit = etF.text.toString().toDouble();
            var celsiusF = fahrenheitToCelsius(fahrenheit)
            etC.setText(String.format("%.2f", celsiusF))
        }

    }

    private fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9 / 5 + 32
    }

    private fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5 / 9
    }
}