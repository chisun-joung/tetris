package com.example.chisunjoung.tetris

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.chisunjoung.tetris.storage.AppPreferences

class GameActivity : AppCompatActivity() {

    var tvHighScore: TextView? = null
    var tvCurrentScore: TextView? = null
    var appPreferrences: AppPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        appPreferrences = AppPreferences(this)
        val btnRestart = findViewById<Button>(R.id.btn_restart)
        tvHighScore = findViewById(R.id.tv_high_score)
        tvCurrentScore = findViewById(R.id.tv_current_score)

        updateHighScore()
        updateCurrentScore()
    }

    private fun updateHighScore() {
        tvHighScore?.text = "${appPreferrences?.getHighScore()}"
    }

    private fun updateCurrentScore() {
        tvCurrentScore?.text = "0"
    }
}
