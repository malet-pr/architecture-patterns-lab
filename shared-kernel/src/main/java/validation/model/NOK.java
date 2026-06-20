package validation.model;

import java.util.List;

public record NOK<T>(
        List<ValidationError> errors
) implements ValidationOutcome<T> {
}
