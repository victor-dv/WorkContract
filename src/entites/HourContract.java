package entites;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private int hours;

    public HourContract(){
    }
    public HourContract(double valuePerHour, int hours){
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue(){ //Feito por mim, se der erro tirar o parametro double total
        return hours * valuePerHour;

    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
