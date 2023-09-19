package racingcar.constant;

public enum PrintElement {

    NEW_LINE("\n"),
    SEPARATOR(", ");

    private final String element;

    PrintElement(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }
}
