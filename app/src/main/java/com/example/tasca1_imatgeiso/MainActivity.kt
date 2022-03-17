package com.example.tasca1_imatgeiso

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    lateinit var soundPool: SoundPool
    lateinit var soundBar: SeekBar
    lateinit var media: String
    lateinit var media2: String
    lateinit var media3: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        media = "https://winaero.com/blog/wp-content/uploads/2018/01/Music-mute-sound-volume-speaker-audio-player-icon-256-02.png"
        media2 = "https://cdn.imgbin.com/7/9/14/imgbin-sound-volume-computer-icons-media-controls-others-ZWG2q4HMUMazz7Am3GswWU2sS.jpg"
        media3 = "https://toppng.com/uploads/preview/audio-sound-speaker-volume-icon-sound-icon-11553431922jq1uzaeypw.png"
        val imagen = findViewById<ImageView>(R.id.imageView2)
        soundBar = findViewById<SeekBar>(R.id.seekBar2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)

        soundPool = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool.load(baseContext, R.raw.sound00, 1)
        soundPool.load(baseContext, R.raw.sound2, 2)
        soundPool.load(baseContext, R.raw.sound3, 3)
        soundPool.load(baseContext, R.raw.sound4, 4)
        soundPool.load(baseContext, R.raw.sound5, 5)
        soundPool.load(baseContext, R.raw.sound6, 6)
        soundPool.load(baseContext, R.raw.sound7, 7)
        soundPool.load(baseContext, R.raw.sound8, 8)
        soundPool.load(baseContext, R.raw.sound9, 9)

        button1.setOnClickListener {
            playsound1()
            if (media !== null) {
                Glide.with(this)
                    .load(media)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button2.setOnClickListener {
            playsound2()
            if (media2 !== null) {
                Glide.with(this)
                    .load(media2)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button3.setOnClickListener {
            playsound3()
            if (media3 !== null) {
                Glide.with(this)
                    .load(media3)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button4.setOnClickListener {
            playsound4()
            if (media2 !== null) {
                Glide.with(this)
                    .load(media2)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button5.setOnClickListener {
            playsound5()
            if (media3 !== null) {
                Glide.with(this)
                    .load(media3)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button6.setOnClickListener {
            playsound6()
            if (media !== null) {
                Glide.with(this)
                    .load(media)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button7.setOnClickListener {
            playsound7()
            if (media2 !== null) {
                Glide.with(this)
                    .load(media2)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button8.setOnClickListener {
            playsound8()
            if (media !== null) {
                Glide.with(this)
                    .load(media)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }
        button9.setOnClickListener {
            playsound9()
            if (media3 !== null) {
                Glide.with(this)
                    .load(media3)
                    .into(imagen)
            } else {
                imagen.setImageResource(R.drawable.ic_launcher_background)
            }
        }

    }

    fun playsound1 () {
        soundPool?.play(1, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }

    fun playsound2 () {
        soundPool?.play(2, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }
    fun playsound3 () {
        soundPool?.play(3, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }
    fun playsound4 () {
        soundPool?.play(4, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }
    fun playsound5 () {
        soundPool?.play(5, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }
    fun playsound6 () {
        soundPool?.play(6, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }
    fun playsound7 () {
        soundPool?.play(7, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }
    fun playsound8 () {
        soundPool?.play(8, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }
    fun playsound9 () {
        soundPool?.play(9, soundBar.progress.toFloat(), soundBar.progress.toFloat(), 0, 0, 1F)
    }

}