package certification.domain;

@FunctionalInterface
public interface CertificationDecision {
    CertificationStep next(WorkOrderSnapshot wo, CertificationStep certificationStep);
}
