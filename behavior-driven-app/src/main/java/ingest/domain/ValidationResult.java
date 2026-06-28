package ingest.domain;

import java.util.List;

public record ValidationResult (
        boolean valid,
        List<String> errorDescription
){
}
