package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Names {

    private final List<Name> element;

    public Names(List<Name> names) {
        this.element = new ArrayList<>(names);
    }

    public String getElements() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        element.forEach(name -> stringJoiner.add(name.getValue()));
        return stringJoiner.toString();
    }

    public List<Name> getNames() {
        return Collections.unmodifiableList(element);
    }
}
