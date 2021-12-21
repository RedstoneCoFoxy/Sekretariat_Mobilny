package com.example.sekretariat_mobilny

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.RadioButton
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextView_Widok: TextView = findViewById(R.id.Main_Widok)
        val Button_OtworzPlik: Button = findViewById(R.id.Main_ButtonOtworz)
        val Button_Gotowe: Button = findViewById(R.id.Main_ButtonGotowe)
        val Button_OdswiezWidok: Button = findViewById(R.id.main_ButtonOdswiez)

        val CheckSzukaj: CheckBox = findViewById(R.id.Main_SzukajCheck)
        val CheckSortuj: CheckBox = findViewById(R.id.main_SortujCheck)

        val Spinner_SzukajPoPolu: Spinner = findViewById(R.id.Main_ListSzukajPoPolu)
        val Spinner_SzukajSposob: Spinner = findViewById(R.id.Main_ListSzukajSposob)
        val Spinner_SortujPoPolu: Spinner = findViewById(R.id.Main_ListSortujPoPolu)

        val RadioAscending: RadioButton = findViewById(R.id.Main_RadioASC)
        val RadioDescending: RadioButton = findViewById(R.id.main_RadioDESC)
        val RadioGroup: RadioGroup = findViewById(R.id.Main_RadioGroup)
        val FiltrTextBox: EditText = findViewById(R.id.Main_FiltrBox)

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
                    TextView_Widok.text = TextView_Widok.text.toString()+TempUczen[i]?.ReturnForPrint()
                }}
            if (TempNauczyciel.size <= 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Nauczycieli\n"}else{
                for (i in 0 until TempNauczyciel.size)
                {
                    TextView_Widok.text = TextView_Widok.text.toString()+TempNauczyciel[i]?.ReturnForPrint()
                }}
            if (TempPracownik.size <= 0) {TextView_Widok.text = TextView_Widok.text.toString() + "Brak rekordów Pracowników\n"}else{
                for (i in 0 until TempPracownik.size)
                {
                    TextView_Widok.text = TextView_Widok.text.toString()+TempPracownik[i]?.ReturnForPrint()
                }}
        }

        fun Sortuj(UczenTemp: Array<Uczen?>,NauczycielTemp: Array<Nauczyciel?> ,PracownikTemp: Array<Pracownik?>, WybranePole: Int) //funkcja sortująca
        {
            if (UczenTemp.size + NauczycielTemp.size + PracownikTemp.size > 0)
            {
                var zmienne = arrayOf("")
                for (U in 0 until UczenTemp.size)
                {
                    var temp= arrayOf("")
                    when(WybranePole) //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                    {
                        0-> temp[0] = UczenTemp[U]?.Imie + U.toString() + "U"
                        1-> temp[0] = UczenTemp[U]?.DrugieImie + U.toString() + "U"
                        2-> temp[0] = UczenTemp[U]?.Nazwisko + U.toString() + "U"
                        3-> temp[0] = UczenTemp[U]?.NazwiskoPaniejskie + U.toString() + "U"
                        4-> temp[0] = UczenTemp[U]?.ImieMatki + U.toString() + "U"
                        5-> temp[0] = UczenTemp[U]?.ImieOjca + U.toString() + "U"
                        6-> temp[0] = UczenTemp[U]?.DataUrodzenia + U.toString() + "U"
                        7-> temp[0] = UczenTemp[U]?.Pesel + U.toString() + "U"
                        8-> temp[0] = UczenTemp[U]?.Plec + U.toString() + "U"
                        9-> temp[0] = UczenTemp[U]?.Klasa + U.toString() + "U" //klasa
                        10-> temp[0] = UczenTemp[U]?.Grupy + U.toString() + "U"//grupy
                    }
                    zmienne = zmienne.plus(elements = temp)
                }
                for (U in 0 until NauczycielTemp.size)
                {
                        var temp = arrayOf("")
                        when (WybranePole) //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                        {
                            0 -> temp[0] = NauczycielTemp[U]?.Imie + U.toString() + "N"
                            1 -> temp[0] = NauczycielTemp[U]?.DrugieImie + U.toString() + "N"
                            2 -> temp[0] = NauczycielTemp[U]?.Nazwisko + U.toString() + "N"
                            3 -> temp[0] = NauczycielTemp[U]?.NazwiskoPaniejskie + U.toString() + "N"
                            4 -> temp[0] = NauczycielTemp[U]?.ImieMatki + U.toString() + "N"
                            5 -> temp[0] = NauczycielTemp[U]?.ImieOjca + U.toString() + "N"
                            6 -> temp[0] = NauczycielTemp[U]?.DataUrodzenia + U.toString() + "N"
                            7 -> temp[0] = NauczycielTemp[U]?.Pesel + U.toString() + "N"
                            8 -> temp[0] = NauczycielTemp[U]?.Plec + U.toString() + "N"
                            11 -> temp[0] = NauczycielTemp[U]?.WychowawcaKlasa + U.toString() + "N"//Wychowawstwo
                            12 -> temp[0] = NauczycielTemp[U]?.PrzedmiotyNauczane + U.toString() + "N"//Przedmioty
                            13 -> temp[0] = NauczycielTemp[U]?.Zajecia + U.toString() + "N"//Zajecia
                            14 -> temp[0] = NauczycielTemp[U]?.DataZatrudnienia + U.toString() + "N"//DataZatrudnienia
                        }
                        zmienne = zmienne.plus(elements = temp)
                    }
                for (U in 0 until PracownikTemp.size)
                {
                    var temp= arrayOf("")
                    when(WybranePole) //MEGA switch sprawdzający wszystkie mozliwe pola jakie uzytkownik mogl wybrac w sortowaniu
                    {
                        0-> temp[0] = PracownikTemp[U]?.Imie + U.toString() + "P"
                        1-> temp[0] = PracownikTemp[U]?.DrugieImie + U.toString() + "P"
                        2-> temp[0] = PracownikTemp[U]?.Nazwisko + U.toString() + "P"
                        3-> temp[0] = PracownikTemp[U]?.NazwiskoPaniejskie + U.toString() + "P"
                        4-> temp[0] = PracownikTemp[U]?.ImieMatki + U.toString() + "P"
                        5-> temp[0] = PracownikTemp[U]?.ImieOjca + U.toString() + "P"
                        6-> temp[0] = PracownikTemp[U]?.DataUrodzenia + U.toString() + "P"
                        7-> temp[0] = PracownikTemp[U]?.Pesel + U.toString() + "P"
                        8-> temp[0] = PracownikTemp[U]?.Plec + U.toString() + "P"
                        14-> temp[0] = PracownikTemp[U]?.DataZatrudnienia + U.toString() + "P"//DataZatrudnienia
                        15-> temp[0] = PracownikTemp[U]?.Etat + U.toString() + "P"//Etat
                        16-> temp[0] = PracownikTemp[U]?.Opis + U.toString() + "P"//Opis
                    }
                    zmienne = zmienne.plus(elements = temp)
                }

                zmienne.sortDescending()
                if (RadioAscending.isChecked)
                {
                    zmienne.reverse()
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
                            if (UczenTemp[i]?.Imie==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            1->
                            if (UczenTemp[i]?.DrugieImie==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            2->
                            if (UczenTemp[i]?.Nazwisko==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            3->
                            if (UczenTemp[i]?.NazwiskoPaniejskie==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            4->
                            if (UczenTemp[i]?.ImieMatki==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            5->
                            if (UczenTemp[i]?.ImieOjca==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            6->
                            if (UczenTemp[i]?.DataUrodzenia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            7->
                            if (UczenTemp[i]?.Pesel==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            8->
                            if (UczenTemp[i]?.Plec==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            9->//klasa
                            if (UczenTemp[i]?.Klasa==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                            }
                            10 ->//grupy
                            if (UczenTemp[i]?.Grupy==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
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
                                if (NauczycielTemp[i]?.Imie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            1->
                                if (NauczycielTemp[i]?.DrugieImie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            2->
                                if (NauczycielTemp[i]?.Nazwisko==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            3->
                                if (NauczycielTemp[i]?.NazwiskoPaniejskie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            4->
                                if (NauczycielTemp[i]?.ImieMatki==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            5->
                                if (NauczycielTemp[i]?.ImieOjca==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            6->
                                if (NauczycielTemp[i]?.DataUrodzenia==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            7->
                                if (NauczycielTemp[i]?.Pesel==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            8->
                                if (NauczycielTemp[i]?.Plec==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            11->//Wychowawstwo
                            if (NauczycielTemp[i]?.WychowawcaKlasa==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i]?.ReturnForPrint();
                            }
                            12->//Przedmioty
                            if (NauczycielTemp[i]?.PrzedmiotyNauczane==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i]?.ReturnForPrint();
                            }
                            13->//Zajecia
                            if (NauczycielTemp[i]?.Zajecia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i]?.ReturnForPrint();
                            }
                            14->//Data Zatrudnienia
                            if (NauczycielTemp[i]?.DataZatrudnienia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + NauczycielTemp[i]?.ReturnForPrint();
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
                                if (PracownikTemp[i]?.Imie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            1->
                                if (PracownikTemp[i]?.DrugieImie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            2->
                                if (PracownikTemp[i]?.Nazwisko==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            3->
                                if (PracownikTemp[i]?.NazwiskoPaniejskie==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            4->
                                if (PracownikTemp[i]?.ImieMatki==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            5->
                                if (PracownikTemp[i]?.ImieOjca==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            6->
                                if (PracownikTemp[i]?.DataUrodzenia==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            7->
                                if (PracownikTemp[i]?.Pesel==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            8->
                                if (PracownikTemp[i]?.Plec==StringB)
                                {
                                    TextView_Widok.text = TextView_Widok.text.toString() + UczenTemp[i]?.ReturnForPrint()
                                }
                            14->//Data Zatrudnienia
                            if (PracownikTemp[i]?.DataZatrudnienia==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + PracownikTemp[i]?.ReturnForPrint();
                            }
                            15->//Etat
                            if (PracownikTemp[i]?.Etat==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + PracownikTemp[i]?.ReturnForPrint();
                            }
                            16->//Opis
                            if (PracownikTemp[i]?.Opis==StringB)
                            {
                                TextView_Widok.text = TextView_Widok.text.toString() + PracownikTemp[i]?.ReturnForPrint();
                            }
                        }
                    }
                }
            }
        }

        fun Szukaj()
        {
            var SelectedSearchIndex : Int = Spinner_SzukajPoPolu.selectedItemPosition-1
            var SelectedSearchTypeIndex : Int = Spinner_SzukajSposob.selectedItemPosition-1
            var Filtr: String = FiltrTextBox.text.toString()
            var okej:Boolean = true;

            var TempUczen: Array<Uczen?> = arrayOfNulls(0)
            var TempNauczyciel: Array<Nauczyciel?> = arrayOfNulls(0)
            var TempPracownik: Array<Pracownik?> = arrayOfNulls(0)
            if ((SelectedSearchIndex != 6 || SelectedSearchIndex != 14 )&& (SelectedSearchTypeIndex == 4 || SelectedSearchTypeIndex==5))
            {
                okej = false;
                //Spinner_SzukajPoPolu.foreground=R.color.red
               // Spinner_SzukajPoPolu.foreground=R.color.red
            }
            else
            {
                //Spinner_SzukajPoPolu.foreground=new Drawable
                //Spinner_SzukajPoPolu.foreground=R.color.black
            }

            if (okej) {
                for(i in 0 until  TableUczen.size)
                {
                    var wartosc: String?=""
                    when(SelectedSearchIndex)
                    {
                        0->wartosc = TableUczen[i]?.Imie
                        1->wartosc = TableUczen[i]?.DrugieImie
                        2->wartosc = TableUczen[i]?.Nazwisko
                        3->wartosc = TableUczen[i]?.NazwiskoPaniejskie
                        4->wartosc = TableUczen[i]?.ImieMatki
                        5->wartosc = TableUczen[i]?.ImieOjca
                        6->wartosc = TableUczen[i]?.DataUrodzenia
                        7->wartosc = TableUczen[i]?.Pesel
                        8->wartosc = TableUczen[i]?.Plec

                        9->wartosc = TableUczen[i]?.Klasa
                        10->wartosc = TableUczen[i]?.Grupy
                    }
                    var TempTempUczen: Array<Uczen?> = arrayOfNulls(0)
                    var Good:Boolean = false
                    when(SelectedSearchTypeIndex)
                    {
                        0->if (wartosc?.contains(Filtr)==true) { Good = true }
                        1->if (wartosc==Filtr) { Good = true }
                        2->if (wartosc?.endsWith(Filtr)==true) { Good = true }
                        3->if (wartosc?.startsWith(Filtr)==true) { Good = true }
                        4->if (Filtr.compareTo(wartosc.toString()) ==1) { Good = true }
                        5->if (wartosc?.compareTo(Filtr) ==1) { Good = true }
                    }
                    if (Good)
                    {
                        TempTempUczen[0] = TableUczen[i];
                        TempUczen = TempUczen.plus(elements = TempTempUczen)
                    }
                }

                for (i in 0 until TableNauczyciel.size)
                {
                    var wartosc: String?=""
                    when(SelectedSearchIndex)
                    {
                        0->wartosc = TableNauczyciel[i]?.Imie
                        1->wartosc = TableNauczyciel[i]?.DrugieImie
                        2->wartosc = TableNauczyciel[i]?.Nazwisko
                        3->wartosc = TableNauczyciel[i]?.NazwiskoPaniejskie
                        4->wartosc = TableNauczyciel[i]?.ImieMatki
                        5->wartosc = TableNauczyciel[i]?.ImieOjca
                        6->wartosc = TableNauczyciel[i]?.DataUrodzenia
                        7->wartosc = TableNauczyciel[i]?.Pesel
                        8->wartosc = TableNauczyciel[i]?.Plec

                        11->wartosc = TableNauczyciel[i]?.WychowawcaKlasa
                        12->wartosc = TableNauczyciel[i]?.PrzedmiotyNauczane
                        13->wartosc = TableNauczyciel[i]?.Zajecia
                        14->wartosc = TableNauczyciel[i]?.DataZatrudnienia
                    }
                    var TempTempNauczyciel: Array<Nauczyciel?> = arrayOfNulls(0)
                    var Good: Boolean = false
                    when(SelectedSearchTypeIndex)
                    {
                        0->if (wartosc?.contains(Filtr)==true) { Good = true }
                        1->if (wartosc==Filtr) { Good = true }
                        2->if (wartosc?.endsWith(Filtr)==true) { Good = true }
                        3->if (wartosc?.startsWith(Filtr)==true) { Good = true }
                        4->if (Filtr.compareTo(wartosc.toString()) ==1) { Good = true }
                        5->if (wartosc?.compareTo(Filtr) ==1) { Good = true }
                    }
                    if (Good)
                    {
                        TempTempNauczyciel[0] = TableNauczyciel[i]
                        TempNauczyciel = TempNauczyciel.plus(elements = TempTempNauczyciel)
                    }
                }

                for (i in 0 until TablePracownik.size)
                {
                    var wartosc: String?=""
                    when(SelectedSearchIndex)
                    {
                        0->wartosc = TablePracownik[i]?.Imie
                        1-> wartosc = TablePracownik[i]?.DrugieImie
                        2-> wartosc = TablePracownik[i]?.Nazwisko
                        3-> wartosc = TablePracownik[i]?.NazwiskoPaniejskie
                        4-> wartosc = TablePracownik[i]?.ImieMatki
                        5-> wartosc = TablePracownik[i]?.ImieOjca
                        6-> wartosc = TablePracownik[i]?.DataUrodzenia
                        7-> wartosc = TablePracownik[i]?.Pesel
                        8-> wartosc = TablePracownik[i]?.Plec

                        14-> wartosc = TablePracownik[i]?.DataZatrudnienia
                        15-> wartosc = TablePracownik[i]?.Etat
                        16-> wartosc = TablePracownik[i]?.Opis
                    }
                    var TempTempPracownik: Array<Pracownik?> = arrayOfNulls(0)
                    var Good: Boolean = false
                    when(SelectedSearchTypeIndex)
                    {
                        0->if (wartosc?.contains(Filtr)==true) { Good = true }
                        1->if (wartosc==Filtr) { Good = true }
                        2->if (wartosc?.endsWith(Filtr)==true) { Good = true }
                        3->if (wartosc?.startsWith(Filtr)==true) { Good = true }
                        4->if (Filtr.compareTo(wartosc.toString()) ==1) { Good = true }
                        5->if (wartosc?.compareTo(Filtr) ==1) { Good = true }
                    }
                    if (Good)
                    {
                        TempTempPracownik[0] = TablePracownik[i]
                        TempPracownik = TempPracownik.plus(elements = TempTempPracownik)
                    }
                }

                if (CheckSortuj.isChecked) {

                    Sortuj(TempUczen, TempNauczyciel, TempPracownik, 1);
                }
                else
                {
                    Update_Widok(TempUczen,TempNauczyciel,TempPracownik);
                }
            }
        }

        fun ZaladujRekordDoBazy(linia: String)
        {
            //wszystkie dzialaja na tej samej zasadzie, roznią się jednyie iloscią pól które muszą prowadzic i do której tabeli
            //najpierw sprawdza do której tabeli idzie U, N, P
            //potem pierwsza czesc od początku do specjalnego znaku ( Ø ), jest wkladana, usuwa ten segment i idzie do następnego i tak az do konća
            var line:String = linia
            if (line.startsWith("U")){
                var Temp : Uczen = Uczen()

                Temp.Rodzaj = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Imie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DrugieImie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Nazwisko = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.NazwiskoPaniejskie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.ImieOjca = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.ImieMatki = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DataUrodzenia = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Pesel = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Plec = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);


                Temp.Klasa = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length-1);

                Temp.Grupy = line.substring(0, line.length);

                var TempTableUczen: Array<Uczen?> = arrayOf(Temp)
                TableUczen = TableUczen.plus(elements = TempTableUczen)
            }
            if (line.startsWith("N"))
            {

                var Temp : Nauczyciel = Nauczyciel()

                Temp.Rodzaj = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Imie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DrugieImie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Nazwisko = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.NazwiskoPaniejskie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.ImieOjca = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.ImieMatki = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DataUrodzenia = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Pesel = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Plec = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.WychowawcaKlasa = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.PrzedmiotyNauczane = line.substring(0, line.indexOf("Ø"));
                line = line.substring(  line.indexOf("Ø") + 1,line.length);

                Temp.Zajecia = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DataZatrudnienia = line.substring(0, line.length-1);

                var TempTableNauczyciel: Array<Nauczyciel?> = arrayOf(Temp)
                TableNauczyciel = TableNauczyciel.plus(elements = TempTableNauczyciel)
            }
            if (line.startsWith("P"))
            {
                var Temp : Pracownik = Pracownik()

                Temp.Rodzaj = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Imie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DrugieImie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Nazwisko = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.NazwiskoPaniejskie = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.ImieOjca = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.ImieMatki = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DataUrodzenia = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Pesel = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Plec = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Etat = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.Opis = line.substring(0, line.indexOf("Ø"));
                line = line.substring( line.indexOf("Ø") + 1,line.length);

                Temp.DataZatrudnienia = line.substring(0, line.length-1);

                var TempTablePracownik: Array<Pracownik?> = arrayOf(Temp)
                TablePracownik = TablePracownik.plus(elements = TempTablePracownik)
            }
        }

        CheckSzukaj.setOnClickListener{
            if(CheckSzukaj.isChecked){
                Spinner_SzukajPoPolu.isEnabled=true
                Spinner_SzukajSposob.isEnabled=true
                FiltrTextBox.isEnabled=true
            }else{
                Spinner_SzukajPoPolu.isEnabled=false
                Spinner_SzukajSposob.isEnabled=false
                FiltrTextBox.isEnabled=false
            }
        }
        CheckSortuj.setOnClickListener{
            if(CheckSzukaj.isChecked){
                RadioGroup.isEnabled=true
                Spinner_SortujPoPolu.isEnabled=true
            }else{
                RadioGroup.isEnabled=false
                Spinner_SortujPoPolu.isEnabled=false
            }
        }


        Button_OtworzPlik.setOnClickListener {


            ZaladujRekordDoBazy("UØAdamØAleksanderØNowakØKowalØIgnacyØKatarzynaØ27.08.2018Ø31235836438ØMężczyznaØ3AØkółko teatralneØ")
            ZaladujRekordDoBazy("UØEwaØMariannaØNowakØZielonaØKazimierzØElaØ26.12.2016Ø12348626499ØKobietaØ3BØkółko teatralne;kącik kulinarnyØ")
            ZaladujRekordDoBazy("UØAnnaØKatarzynaØKwiatkowskaØØJanuszØElaØ07.07.2014Ø21356713254ØKobietaØ3BØkółko teatralneØ")
            ZaladujRekordDoBazy("UØMariannaØEwelinaØCegielskaØØZdzisławØØ25.03.2013Ø65497612376ØKobietaØ3BØkącik kulinarnyØ")
            ZaladujRekordDoBazy("NØDawidØCØBrodziczØWisielskiØJanØElaØ06.10.2020Ø45632187621ØMężczyznaØ3AØAngielskiØPoniedziałek 9.00Ø10.07.2019Ø")
            ZaladujRekordDoBazy("NØKubaØCØMedzielØBombaØFilipØFilipØ25.09.2019Ø23445789233ØMężczyznaØ3BØPolskiØWtorek 10.00Ø03.07.2017Ø")
            ZaladujRekordDoBazy("PØKazimierzØØWolnyØØØØ25.09.2019Ø12345678911ØMężczyznaØPelenØWoźnyØ05.04.2021Ø")
            Update_Widok(TableUczen,TableNauczyciel,TablePracownik)
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