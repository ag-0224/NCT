package back.springbootdeveloper.seungchan.constant.filter;

public enum CustomHttpStatus {
    WEEKEND(-480, "Weekend"),
    USER_NOT_EXIST(-481, "User Not Exist"),
    DATA_VALID(-482, "Data Valid");

    private final int value;


    private final String reasonPhrase;

    CustomHttpStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }
}
