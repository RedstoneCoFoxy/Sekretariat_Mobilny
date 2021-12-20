package com.example.sekretariat_mobilny

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import android.content.Intent
import android.app.Activity
import android.R.string
import android.R.string.no














class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextView_Widok: TextView = findViewById(R.id.Main_Widok)
        //deklaracja obiektów poszcególnych osób (przekopiowana z desktopowej wersji programu)
        class Uczen constructor() {
            var Rodzaj: String = "U"
            var Imie: String = ""
            var DrugieImie: String = ""
            var Nazwisko: String = ""
            var NazwiskoPaniejskie: String = ""
            var ImieOjca: String = ""
            var ImieMatki: String = ""
            var DataUrodzenia: String = ""
            var Pesel: String = ""
            var Plec: String = ""
            var Zdjecie: String = ""
            var Klasa: String = ""
            var Grupy: String = ""

            fun ReturnForPrint(): String {
                var Temp: String = ""
                Temp = Temp.toString() + "U: "
                Temp = Temp.toString() + "Imie: " + Imie + " "
                Temp = Temp.toString() + "D.Imie: " + DrugieImie + " "
                Temp = Temp.toString() + "Nazwisko: " + Nazwisko + " "
                Temp = Temp.toString() + "N.Paniejskie: " + NazwiskoPaniejskie + " "
                Temp = Temp.toString() + "I.Ojca: " + ImieOjca + " "
                Temp = Temp.toString() + "I.Matki: " + ImieMatki + " "
                Temp = Temp.toString() + "Data Urodzenia: " + DataUrodzenia + " "
                Temp = Temp.toString() + "Pesel: " + Pesel + " "
                Temp = Temp.toString() + "Plec: " + Plec + " "
                Temp = Temp.toString() + "Klasa: " + Klasa + " "
                Temp = Temp.toString() + "Grupy: " + Grupy + " "
                Temp = Temp.toString() + "\n"
                return Temp
            }
        }

        class Nauczyciel constructor() {
            var Rodzaj: String = "N"
            var Imie: String = ""
            var DrugieImie: String = ""
            var Nazwisko: String = ""
            var NazwiskoPaniejskie: String = ""
            var ImieOjca: String = ""
            var ImieMatki: String = ""
            var DataUrodzenia: String = ""
            var Pesel: String = ""
            var Plec: String = ""
            var Zdjecie: String = ""
            var WychowawcaKlasa: String = ""
            var PrzedmiotyNauczane: String = ""
            var Zajecia: String = ""
            var DataZatrudnienia: String = ""

            fun ReturnForPrint(): String {
                var Temp: String = ""
                Temp = Temp.toString() + "N: "
                Temp = Temp.toString() + "Imie: " + Imie + " "
                Temp = Temp.toString() + "D.Imie: " + DrugieImie + " "
                Temp = Temp.toString() + "Nazwisko: " + Nazwisko + " "
                Temp = Temp.toString() + "N.Paniejskie: " + NazwiskoPaniejskie + " "
                Temp = Temp.toString() + "I.Ojca: " + ImieOjca + " "
                Temp = Temp.toString() + "I.Matki: " + ImieMatki + " "
                Temp = Temp.toString() + "Data Urodzenia: " + DataUrodzenia + " "
                Temp = Temp.toString() + "Pesel: " + Pesel + " "
                Temp = Temp.toString() + "Plec: " + Plec + " "
                Temp = Temp.toString() + "Wychowawstwo: " + WychowawcaKlasa + " "
                Temp = Temp.toString() + "P. Nauczane: " + PrzedmiotyNauczane + " "
                Temp = Temp.toString() + "Zajecia: " + Zajecia + " "
                Temp = Temp.toString() + "Data Zatrudnienia: " + DataZatrudnienia + " "
                Temp = Temp.toString() + "\n"
                return Temp
            }
        }

        class Pracownik constructor() {
            var Rodzaj: String = "P"
            var Imie: String = ""
            var DrugieImie: String = ""
            var Nazwisko: String = ""
            var NazwiskoPaniejskie: String = ""
            var ImieOjca: String = ""
            var ImieMatki: String = ""
            var DataUrodzenia: String = ""
            var Pesel: String = ""
            var Plec: String = ""
            var Zdjecie: String = ""
            var Etat: String = ""
            var Opis: String = ""
            var DataZatrudnienia: String = ""

            fun ReturnForPrint(): String {
                var Temp: String = ""
                Temp = Temp.toString() + "P: "
                Temp = Temp.toString() + "Imie: " + Imie + " "
                Temp = Temp.toString() + "D.Imie: " + DrugieImie + " "
                Temp = Temp.toString() + "Nazwisko: " + Nazwisko + " "
                Temp = Temp.toString() + "N.Paniejskie: " + NazwiskoPaniejskie + " "
                Temp = Temp.toString() + "I.Ojca: " + ImieOjca + " "
                Temp = Temp.toString() + "I.Matki: " + ImieMatki + " "
                Temp = Temp.toString() + "Data Urodzenia: " + DataUrodzenia + " "
                Temp = Temp.toString() + "Pesel: " + Pesel + " "
                Temp = Temp.toString() + "Plec: " + Plec + " "
                Temp = Temp.toString() + "Etat: " + Etat + " "
                Temp = Temp.toString() + "Opis: " + Opis + " "
                Temp = Temp.toString() + "Data Zatrudnienia: " + DataZatrudnienia + " "
                Temp = Temp.toString() + "\n"
                return Temp
            }
        }

        val TableUczen: kotlin.Array<Uczen?> = arrayOfNulls<Uczen?>(0)
        val TableNauczyciel: kotlin.Array<Nauczyciel?> = arrayOfNulls<Nauczyciel>(0)
        val TablePracownik: kotlin.Array<Pracownik?> = arrayOfNulls<Pracownik>(0)

        fun Update_Widok(TempUczen: kotlin.Array<Uczen?>,TempNauczyciel: kotlin.Array<Nauczyciel?> ,TempPracownik: kotlin.Array<Pracownik?> )
        {
            TextView_Widok.text = "";
            if (TempUczen.size == 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Uczniów\n";}else{
                for (i in 0 until TempUczen.size) {

                }}
            if (TempNauczyciel.size == 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Nauczycieli\n"}else{
                for (i in 0 until TempNauczyciel.size)
                {
//aaaa
                }}
            if (TempPracownik.size == 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Pracowników\n"}else{
                for (i in 0 until TempPracownik.size)
                {

                }}
        }

        val Button_OtworzPlik: Button = findViewById(R.id.Main_ButtoOtworz)
        Button_OtworzPlik.setOnClickListener {

            Update_Widok(TableUczen,TableNauczyciel,TablePracownik);
            /*java.lang.Thread(object : java.lang.Runnable {
                open override fun run() {
                    var urls: ArrayList<kotlin.String?>? = ArrayList<kotlin.String?>() //to read each line
                    //TextView t; //to show the result, please declare and find it inside onCreate()
                    try {
                        // Create a URL for the desired page
                        var url: java.net.URL? = java.net.URL("https://github.com/RedstoneCoFoxy/Sekretariat_Mobilny/blob/master/text.txt") //My text file location
                        //First open the connection
                        var conn: java.net.HttpURLConnection? = url.openConnection() as java.net.HttpURLConnection?
                        conn.setConnectTimeout(60000) // timing out in a minute
                        var `in`: java.io.BufferedReader? = java.io.BufferedReader(java.io.InputStreamReader(conn.getInputStream()))

                        //t=(TextView)findViewById(R.id.TextView1); // ideally do this in onCreate()
                        var str: kotlin.String?
                        while ((`in`.readLine().also({ str = it })) != null) {
                            urls.add(str)
                        }
                        `in`.close()
                    } catch (e: java.lang.Exception) {
                        android.util.Log.d("MyTag", e.toString())
                    }

                    //since we are in background thread, to post results we have to go back to ui thread. do the following for that
                    this.runOnUiThread(object : java.lang.Runnable {
                        open override fun run() {
                            TextView_Widok.setText(urls.get(0)) // My TextFile has 3 lines
                        }
                    })
                }
            }).start()*/

        }//button function end

    }//on create end
}//main end