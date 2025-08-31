public class Enums {
    public static void main(String[] args) {
        System.out.println("enum Day: " + Day.MONDAY);
        System.out.println("enum HttpStatus: " + HttpStatus.OK + " with code " + HttpStatus.OK.getCode());
    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum HttpStatus {
    OK(200), NOT_FOUND(404), INTERNAL_SERVER_ERROR(500);

    private final int code;

    HttpStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}