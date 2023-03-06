public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

    public void setMinute(int newMinute) {
        this.minute = newMinute;
    }

    public void setSecond(int newSecond) {
        this.second = newSecond;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String hour = ((this.hour < 10) ? "0" : "") + this.hour;
        String minute = ((this.minute < 10) ? "0" : "") + this.minute;
        String second = ((this.second < 10) ? "0" : "") + this.second;

        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        if (this.second + 1 > 59) {
            this.minute += 1;
            this.second = 0;
        } else {
            this.second += 1;
        }
        if (this.minute > 59) {
            this.hour += 1;
            this.minute = 0;
        }
        if (this.hour > 23) {
            this.hour = 0;
        }

        return this;
    }

    public Time previousSecond() {
        if (this.second - 1 < 0) {
            this.minute -= 1;
            this.second = 59;
        } else {
            this.second -= 1;
        }
        if (this.minute < 0) {
            this.hour -= 1;
            this.minute = 59;
        }
        if (this.hour < 0) {
            this.hour = 23;
        }

        return this;
    }
}
