package validation.model;

public sealed interface ValidationResult<T> permits Valid, Invalid {
}

