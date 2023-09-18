package racingcar.domain;

public class TryCount {

    private Integer tryCount;

    public TryCount(final Integer tryCount) {
        this.tryCount = tryCount;
    }

    public boolean hasNext() {
        return this.tryCount-- > 0;
    }
}
