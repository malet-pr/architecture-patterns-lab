package validation.model;

public record Valid<T>(
        T value
) implements ValidationResult<T> {
}
