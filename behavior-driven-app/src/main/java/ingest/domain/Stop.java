package ingest.domain;

import java.util.List;

public record Stop<T>(List<String> reasons) implements StepOutcome<T> {
}