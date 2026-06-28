package ingest.domain;

public sealed interface StepOutcome<T>
        permits Continue, Stop {
}