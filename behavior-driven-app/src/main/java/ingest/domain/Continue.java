package ingest.domain;

public record Continue<T>(T value) implements StepOutcome<T> {
}