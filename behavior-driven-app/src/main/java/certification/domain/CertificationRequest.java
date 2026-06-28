package certification.domain;

public record CertificationRequest(
        WorkOrderSnapshot workOrder,
        CertificationContext context
) {}