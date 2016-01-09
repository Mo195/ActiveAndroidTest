package de.krischkes.moritz.activeandroidapplication;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Moritzkrischke on 05/01/16.
 */
//Table Annotation erstellt den Namen der Tabelle in der Daten abgespeichert werden sollen
@Table(name="Personen")
public class Person extends Model {

    //Das Column Tag berschreibt den Spaltennamen in der SQL Tabelle
    @Column(name="Vorname")
    private String mVorname;
    @Column(name="Nachname")
    private String mNachname;


    public Person(String vorName, String nachName){
        super();
        this.setmVorname(vorName);
        this.setmNachname(nachName);
    }

    public String getmVorname() {
        return mVorname;
    }

    public void setmVorname(String mVorname) {
        this.mVorname = mVorname;
    }

    public String getmNachname() {
        return mNachname;
    }

    public void setmNachname(String mNachname) {
        this.mNachname = mNachname;
    }
}
