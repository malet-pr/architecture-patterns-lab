package validation.model;

public record ValidationError(
        String code,
        String message,
        Severity severity
) {
}
