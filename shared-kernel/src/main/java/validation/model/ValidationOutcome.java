package validation.model;

public sealed interface ValidationOutcome<T>
        permits OK, NOK {
}
