public enum Weekdays {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
    static void isHoliday(Weekdays day) {
        if (day == Weekdays.Saturday) {
            System.out.println("Суббота выходной");
        } else if (day == Weekdays.Sunday)
            System.out.println("Воскресенье выходной");
        else {
            System.out.println("Будний день");
        }
    }}