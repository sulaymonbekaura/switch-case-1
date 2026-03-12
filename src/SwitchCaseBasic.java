public class SwitchCaseBasic {
    public static void main(String[] args) {
        // Classic switch-case
        System.out.println("=== Day of Week (classic switch) ===");
        int day = 3;
        String dayName;
        switch (day) {
            case 1: dayName = "Monday";    break;
            case 2: dayName = "Tuesday";   break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday";  break;
            case 5: dayName = "Friday";    break;
            case 6: dayName = "Saturday";  break;
            case 7: dayName = "Sunday";    break;
            default: dayName = "Invalid";
        }
        System.out.println("Day " + day + " = " + dayName);

        // Modern switch expression (Java 14+)
        System.out.println("\n=== Season Finder (modern switch) ===");
        String[] months = {"January","March","June","September","November","December"};
        for (String month : months) {
            String season = switch (month) {
                case "December","January","February" -> "Winter";
                case "March","April","May"           -> "Spring";
                case "June","July","August"          -> "Summer";
                case "September","October","November"-> "Autumn";
                default                              -> "Unknown";
            };
            System.out.printf("%-12s → %s%n", month, season);
        }

        // Switch with String — Calculator menu
        System.out.println("\n=== Simple Calculator Menu ===");
        double x = 15.0, y = 4.0;
        String[] ops = {"+", "-", "*", "/", "%"};
        for (String op : ops) {
            double result = switch (op) {
                case "+"  -> x + y;
                case "-"  -> x - y;
                case "*"  -> x * y;
                case "/"  -> y != 0 ? x / y : Double.NaN;
                case "%"  -> x % y;
                default   -> throw new IllegalArgumentException("Unknown op: " + op);
            };
            System.out.printf("%.1f %s %.1f = %.2f%n", x, op, y, result);
        }
    }
}
