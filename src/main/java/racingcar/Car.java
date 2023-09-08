package racingcar;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    // 추가 기능 구현
    public void validateCarNameLength(String name){
        if (name.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException(ErrorMessage.NAME_LENGTH_ERROR.getMessage());
        }
    }

    public void movePosition(){
        position++;
    }

    public StringBuilder makeScreen(StringBuilder stringBuilder) {
        stringBuilder.append(name).append(" : ");
        for (int i = 0; i < position; i++){
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        return stringBuilder;
    }
}
