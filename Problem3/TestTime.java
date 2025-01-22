public class TestTime {
    public static void main(String[] args) {
        
        // #3: Create two time objects with time set to 21:10:15 and 19:20:25
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(19, 20, 25);

        // #4: Display the times
        System.out.println("Hour: " + t1.getHour() + " Minute: " + t1.getMinute() + " Second: " + t1.getSecond());
        System.out.println("Hour: " + t2.getHour() + " Minute: " + t2.getMinute() + " Second: " + t2.getSecond());
        
        // #5: Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // #6: Display the times again using toString()
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
    }
}
