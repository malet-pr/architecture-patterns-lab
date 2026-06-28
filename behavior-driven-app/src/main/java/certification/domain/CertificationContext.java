package certification.domain;

import java.time.Instant;

public record CertificationContext(
        Instant requestedAt,
        String requestedBy
) {
}