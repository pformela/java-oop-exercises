public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int newDay) {
        this.day = newDay;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String day = ((this.day < 10) ? "0" : "") + this.day;
        String month = ((this.month < 10) ? "0" : "") + this.month;

        return day + "/" + month + "/" + this.year;
    }
}
