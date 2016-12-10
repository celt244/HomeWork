public enum Month {
    JANUARY (1, "January", "Январь", 31),
    FEBRUARY(2, "February", "Февраль", 28),
    MARCH(3, "March", "Март", 31),
    APRIL(4, "April", "Апрель", 30),
    MAY(5, "May", "Май", 31),
    JUNE(6, "June", "Июнь", 30),
    JULY(7, "July", "Июнь", 31),
    AUGUST(8, "August", "Август", 31),
    SEPTEMBER(9, "September", "Сунтябрь", 30),
    OCTOBER(10, "October", "Октябрь", 31),
    NOVEMBER(11, "November", "Нобрь", 30),
    DECEMBER(12, "December", "Декабрь", 31);

    private int numMonth;
    private String endlishMonth;
    private String russianMonth;
    private int dayMonth;

    Month(int numMonth, String endlishMonth, String russianMonth, int dayMonth) {
        this.numMonth = numMonth;
        this.endlishMonth = endlishMonth;
        this.russianMonth = russianMonth;
        this.dayMonth = dayMonth;
    }

    public int getNumMonth() {
        return this.numMonth;
    }

    public String getEndlishMonth() {
        return endlishMonth;
    }

    public String getRussianMonth() {
        return russianMonth;
    }

    public int getDayMonth() {
        return dayMonth;
    }
}
