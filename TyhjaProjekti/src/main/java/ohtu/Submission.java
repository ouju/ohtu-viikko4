package ohtu;

public class Submission {

    private String student_number;
    private int week;
    private int points;
    private int hours;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
    private boolean a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public boolean onkoA1() {
        return a1;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public boolean onkoA2() {
        return a2;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public boolean onkoA3() {
        return a3;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public boolean onkoA4() {
        return a4;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public boolean onkoA5() {
        return a5;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    public boolean onkoA6() {
        return a6;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    public boolean onkoA7() {
        return a7;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    public boolean onkoA8() {
        return a8;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    public boolean onkoA9() {
        return a9;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    public boolean onkoA10() {
        return a10;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;
    }

    public boolean onkoA11() {
        return a11;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    public boolean onkoA12(){
        return a12;
    }
    
    public void setA12(boolean a12){
        this.a12 = a12;
    }
public boolean onkoA13(){
        return a13;
    }
    
    public void setA13(boolean a13){
        this.a13 = a13;
    }
public boolean onkoA14(){
        return a14;
    }
    
    public void setA14(boolean a14){
        this.a14 = a14;
    }
public boolean onkoA15(){
        return a15;
    }
    
    public void setA15(boolean a15){
        this.a15 = a15;
    }
public boolean onkoA16(){
        return a16;
    }
    
    public void setA16(boolean a16){
        this.a16 = a16;
    }
public boolean onkoA17(){
        return a17;
    }
    
    public void setA17(boolean a17){
        this.a17 = a17;
    }
public boolean onkoA18(){
        return a18;
    }
    
    public void setA18(boolean a18){
        this.a18 = a18;
    }
public boolean onkoA19(){
        return a19;
    }
    
    public void setA19(boolean a19){
        this.a19 = a19;
    }
public boolean onkoA20(){
        return a20;
    }
    
    public void setA20(boolean a20){
        this.a20 = a20;
    }

    public String tehtavat(){
        String lista = "";
        
        if (a1){
            lista += "1 ";
        }
        if (a2){
            lista += "2 ";
        }
        if (a3){
            lista += "3 ";
        }
        if (a4){
            lista += "4 ";
        }
        if (a5){
            lista += "5 ";
        }
        if (a6){
            lista += "6 ";
        }
        if (a7){
            lista += "7 ";
        }
        if (a8){
            lista += "8 ";
        }
        if (a9){
            lista += "9 ";
        }
        if (a10){
            lista += "10 ";
        }
        if (a11){
            lista += "11 ";
        }
        if (a12){
            lista += "12 ";
        }
        if (a13){
            lista += "13 ";
        }
        if (a14){
            lista += "14 ";
        }
        if (a15){
            lista += "15 ";
        }
        if (a16){
            lista += "16 ";
        }
        if (a17){
            lista += "17 ";
        }
        if (a18){
            lista += "18 ";
        }
        if (a19){
            lista += "19 ";
        }
        if (a20){
            lista += "20";
        }
        
        return lista;
    }
    
    public int yhteensa(){
        int yht = 0;
         if (a1){
            yht += 1;
        }
        if (a2){
            yht += 1;
        }
        if (a3){
            yht += 1;
        }
        if (a4){
            yht += 1;
        }
        if (a5){
            yht += 1;
        }
        if (a6){
            yht += 1;
        }
        if (a7){
            yht += 1;
        }
        if (a8){
            yht += 1;
        }
        if (a9){
            yht += 1;
        }
        if (a10){
            yht += 1;
        }
        if (a11){
            yht += 1;
        }
        if (a12){
            yht += 1;
        }
        if (a13){
            yht += 1;
        }
        if (a14){
            yht += 1;
        }
        if (a15){
            yht += 1;
        }
        if (a16){
            yht += 1;
        }
        if (a17){
            yht += 1;
        }
        if (a18){
            yht += 1;
        }
        if (a19){
            yht += 1;
        }
        if (a20){
            yht += 1;
        }
        
        return yht;
    }
    @Override
    public String toString() {
        String tuloste = "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + yhteensa() + 
                ", aikaa kului " + hours + " tuntia, tehdyt tehtävät: " + tehtavat();
        return tuloste;
    }

}
