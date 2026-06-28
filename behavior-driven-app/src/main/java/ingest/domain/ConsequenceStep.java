package ingest.domain;

public interface ConsequenceStep<I, O> {
    StepOutcome<O> apply(I input);
}
