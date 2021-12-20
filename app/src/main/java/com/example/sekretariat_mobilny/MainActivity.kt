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

        var TableUczen: kotlin.Array<Uczen?> = arrayOfNulls(0)
        var TableNauczyciel: kotlin.Array<Nauczyciel?> = arrayOfNulls(0)
        var TablePracownik: kotlin.Array<Pracownik?> = arrayOfNulls(0)

        fun Update_Widok(TempUczen: kotlin.Array<Uczen?>,TempNauczyciel: kotlin.Array<Nauczyciel?> ,TempPracownik: kotlin.Array<Pracownik?> )
        {
            TextView_Widok.text = "";
            if (TempUczen.size <= 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Uczniów\n";}else{
                for (i in 0 until TempUczen.size) {

                }}
            if (TempNauczyciel.size <= 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Nauczycieli\n"}else{
                for (i in 0 until TempNauczyciel.size)
                {

                }}
            if (TempPracownik.size <= 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Pracowników\n"}else{
                for (i in 0 until TempPracownik.size)
                {

                }}
        }

        fun Sortuj(UczenTemp: ArrayList<Uczen>,NauczycielTemp: ArrayList<Nauczyciel> ,PracownikTemp: ArrayList<Pracownik>, WybranePole: Int) //funkcja sortująca
        {
            if (UczenTemp.size + NauczycielTemp.size + PracownikTemp.size > 0)
            {
                var zmienne = arrayOf("")
                for (U in 0 until UczenTemp.size)
                {
                    UczenTemp?.let{
                    var temp= arrayOf("")
                    when(WybranePole) //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                    {
                        0-> temp[0] = UczenTemp[U].Imie + U.toString() + "U"
                        1-> temp[0] = UczenTemp[U].DrugieImie + U.toString() + "U"
                        2-> temp[0] = UczenTemp[U].Nazwisko + U.toString() + "U"
                        3-> temp[0] = UczenTemp[U].NazwiskoPaniejskie + U.toString() + "U"
                        4-> temp[0] = UczenTemp[U].ImieMatki + U.toString() + "U"
                        5-> temp[0] = UczenTemp[U].ImieOjca + U.toString() + "U"
                        6-> temp[0] = UczenTemp[U].DataUrodzenia + U.toString() + "U"
                        7-> temp[0] = UczenTemp[U].Pesel + U.toString() + "U"
                        8-> temp[0] = UczenTemp[U].Plec + U.toString() + "U"
                        9-> temp[0] = UczenTemp[U].Klasa + U.toString() + "U" //klasa
                        10-> temp[0] = UczenTemp[U].Grupy + U.toString() + "U"//grupy
                    }
                    zmienne = zmienne.plus(elements = temp)
                    }
                }
                for (U in 0 until NauczycielTemp.size)
                {
                    NauczycielTemp?.let {
                        var temp = arrayOf("")
                        when (WybranePole) //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                        {
                            0 -> temp[0] = NauczycielTemp[U].Imie + U.toString() + "N"
                            1 -> temp[0] = NauczycielTemp[U].DrugieImie + U.toString() + "N"
                            2 -> temp[0] = NauczycielTemp[U].Nazwisko + U.toString() + "N"
                            3 -> temp[0] = NauczycielTemp[U].NazwiskoPaniejskie + U.toString() + "N"
                            4 -> temp[0] = NauczycielTemp[U].ImieMatki + U.toString() + "N"
                            5 -> temp[0] = NauczycielTemp[U].ImieOjca + U.toString() + "N"
                            6 -> temp[0] = NauczycielTemp[U].DataUrodzenia + U.toString() + "N"
                            7 -> temp[0] = NauczycielTemp[U].Pesel + U.toString() + "N"
                            8 -> temp[0] = NauczycielTemp[U].Plec + U.toString() + "N"
                            11 -> temp[0] = NauczycielTemp[U].WychowawcaKlasa + U.toString() + "N"//Wychowawstwo
                            12 -> temp[0] = NauczycielTemp[U].PrzedmiotyNauczane + U.toString() + "N"//Przedmioty
                            13 -> temp[0] = NauczycielTemp[U].Zajecia + U.toString() + "N"//Zajecia
                            14 -> temp[0] = NauczycielTemp[U].DataZatrudnienia + U.toString() + "N"//DataZatrudnienia
                        }
                        zmienne = zmienne.plus(elements = temp)
                    }
                }
                for (U in 0 until PracownikTemp.size)
                {
                    PracownikTemp?.let{
                    var temp= arrayOf("")
                    when(WybranePole) //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                    {
                        0-> temp[0] = PracownikTemp[U].Imie + U.toString() + "P"
                        1-> temp[0] = PracownikTemp[U].DrugieImie + U.toString() + "P"
                        2-> temp[0] = PracownikTemp[U].Nazwisko + U.toString() + "P"
                        3-> temp[0] = PracownikTemp[U].NazwiskoPaniejskie + U.toString() + "P"
                        4-> temp[0] = PracownikTemp[U].ImieMatki + U.toString() + "P"
                        5-> temp[0] = PracownikTemp[U].ImieOjca + U.toString() + "P"
                        6-> temp[0] = PracownikTemp[U].DataUrodzenia + U.toString() + "P"
                        7-> temp[0] = PracownikTemp[U].Pesel + U.toString() + "P"
                        8-> temp[0] = PracownikTemp[U].Plec + U.toString() + "P"
                        14-> temp[0] = PracownikTemp[U].DataZatrudnienia + U.toString() + "P"//DataZatrudnienia
                        15-> temp[0] = PracownikTemp[U].Etat + U.toString() + "P"//Etat
                        16-> temp[0] = PracownikTemp[U].Opis + U.toString() + "P"//Opis
                    }
                    zmienne = zmienne.plus(elements = temp)
                    }
                }

                zmienne.sortDescending()
                if (false)
                {

                }
                TextView_Widok.text = "";
                for (U in 0 until zmienne.size)
                {
                    //W tej częsci jest dekodowanie i wypisywanie
                    //2 ostatnie znaki, które zostały dodane wczesniej przed sortowaniem
                    //są teraz sprawdzane, i jesli jest U to Uczen, N dla Nauczyciela, P Pracownik
                    //Potem jest sprawdzana lizba, czy pod tym indexem jest wlasciwie ten rekord
                    var String: String = zmienne[U]
                    if (String.endsWith("U"))
                    {
                        var i: Int = String.subSequence(String.length - 2,String.length - 1).toString().toInt()
                        //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                        var StringB: String = zmienne[U].subSequence(0,String.length - 2).toString()
                        when(WybranePole)
                        {
                            0->
                            if (UczenTemp[i].Imie==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            1->
                            if (UczenTemp[i].DrugieImie==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            2->
                            if (UczenTemp[i].Nazwisko==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            3->
                            if (UczenTemp[i].NazwiskoPaniejskie==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            4->
                            if (UczenTemp[i].ImieMatki==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            5->
                            if (UczenTemp[i].ImieOjca==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            6->
                            if (UczenTemp[i].DataUrodzenia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            7->
                            if (UczenTemp[i].Pesel==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            8->
                            if (UczenTemp[i].Plec==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            9->//klasa
                            if (UczenTemp[i].Klasa==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                            10 ->//grupy
                            if (UczenTemp[i].Grupy==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                            }
                        }
                    }
                    if (String.endsWith("N"))
                    {
                        var i: Int = String.subSequence(String.length - 2,String.length - 1).toString().toInt()
                        //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                        var StringB: String = zmienne[U].subSequence(0,String.length - 2).toString()
                        when(WybranePole)
                        {
                            0->
                                if (NauczycielTemp[i].Imie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            1->
                                if (NauczycielTemp[i].DrugieImie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            2->
                                if (NauczycielTemp[i].Nazwisko==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            3->
                                if (NauczycielTemp[i].NazwiskoPaniejskie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            4->
                                if (NauczycielTemp[i].ImieMatki==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            5->
                                if (NauczycielTemp[i].ImieOjca==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            6->
                                if (NauczycielTemp[i].DataUrodzenia==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            7->
                                if (NauczycielTemp[i].Pesel==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            8->
                                if (NauczycielTemp[i].Plec==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            11->//Wychowawstwo
                            if (NauczycielTemp[i].WychowawcaKlasa==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i].ReturnForPrint();
                            }
                            12->//Przedmioty
                            if (NauczycielTemp[i].PrzedmiotyNauczane==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i].ReturnForPrint();
                            }
                            13->//Zajecia
                            if (NauczycielTemp[i].Zajecia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i].ReturnForPrint();
                            }
                            14->//Data Zatrudnienia
                            if (NauczycielTemp[i].DataZatrudnienia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i].ReturnForPrint();
                            }
                        }

                    }
                    if (String.endsWith("P"))
                    {
                        var i: Int = String.subSequence(String.length - 2,String.length - 1).toString().toInt()
                        //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                        var StringB: String = zmienne[U].subSequence(0,String.length - 2).toString()
                        when(WybranePole)
                        {
                            0->
                                if (PracownikTemp[i].Imie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            1->
                                if (PracownikTemp[i].DrugieImie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            2->
                                if (PracownikTemp[i].Nazwisko==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            3->
                                if (PracownikTemp[i].NazwiskoPaniejskie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            4->
                                if (PracownikTemp[i].ImieMatki==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            5->
                                if (PracownikTemp[i].ImieOjca==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            6->
                                if (PracownikTemp[i].DataUrodzenia==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            7->
                                if (PracownikTemp[i].Pesel==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            8->
                                if (PracownikTemp[i].Plec==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i].ReturnForPrint()
                                }
                            14->//Data Zatrudnienia
                            if (PracownikTemp[i].DataZatrudnienia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + PracownikTemp[i].ReturnForPrint();
                            }
                            15->//Etat
                            if (PracownikTemp[i].Etat==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + PracownikTemp[i].ReturnForPrint();
                            }
                            16->//Opis
                            if (PracownikTemp[i].Opis==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + PracownikTemp[i].ReturnForPrint();
                            }
                        }
                    }
                }
            }
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