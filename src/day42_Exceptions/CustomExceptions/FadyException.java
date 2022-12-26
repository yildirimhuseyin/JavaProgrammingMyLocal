package day42_Exceptions.CustomExceptions;

class FadyException extends RuntimeException { // custom unchecked exception

    public FadyException() {
        super("Time for a short break");
    }

    public FadyException(String message) {
        super(message);
    }

}
