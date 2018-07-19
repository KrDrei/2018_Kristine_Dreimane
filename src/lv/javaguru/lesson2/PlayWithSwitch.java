package lv.javaguru.lesson2;

public class PlayWithSwitch {

    public static void main(String[] args) {

        System.out.println(translateHttpCode(200));
        System.out.println(translateHttpCode(400));
        System.out.println(translateHttpCode(500));
        System.out.println(translateHttpCode(501));
        System.out.println(translateHttpCode(900));

    }

    private static String translateHttpCode(int httpCode) {
        String message = null;
        switch(httpCode) {
            case 200: message = "Ok"; break;
            case 201: message = "Created"; break;
            case 400: message = "Bad request"; break;
            case 404: message = "Page not found"; break;
            case 500:
                System.out.println("Server error - 500");
            case 501: message = "Server error"; break;
            default: message = "Unknown error";
        }
        return message;
    }

}
