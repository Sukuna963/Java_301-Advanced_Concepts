package org.example.exception.challenge;

public class TeaPotException {
    public static void main(String[] args) {
        try {
            StatusCode statusCode = new StatusCode();
            statusCode.arrorCode = 418;
            System.out.println(verifyStatusCode(statusCode));
        } catch (TeaPotCustom exc) {
            System.out.println(exc.toString());
        }
    }

    public static int verifyStatusCode(StatusCode statusCode) throws TeaPotCustom{
        if(statusCode.arrorCode != 418) {
            return statusCode.arrorCode;
        } else {
            throw new TeaPotCustom();
        }
    }
}

class TeaPotCustom extends Exception {
    @Override
    public String toString() {
        return "I'm a teapot";
    }
}

class StatusCode {
    public int arrorCode = 418;
}