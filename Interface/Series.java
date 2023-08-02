package Algorithms.lesson2.Interface;

public interface Series {
    int getNext();//возврат следующего по порядку числа ** Gibt die nächste fortlaufende Nummer zurück
    void reset();//сброс ** zurücksetzen
    void setStart(int x);//установка начального значения ** den Anfangswert festlegen
}
