import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "prediction_rule",
    uniqueConstraints = @UniqueConstraint(columnNames = "rule_name")
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PredictionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "rule_name", nullable = false, unique = true)
    private String ruleName;

    @Min(1)
    @Column(nullable = false)
    private Integer averageDaysWindow;

    @Min(0)
    @Column(nullable = false)
    private Integer minDailyUsage;

    @Min(0)
    @Column(nullable = false)
    private Integer maxDailyUsage;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    private void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @AssertTrue(message = "minDailyUsage must be <= maxDailyUsage")
    private boolean isUsageRangeValid() {
        return minDailyUsage == null || maxDailyUsage == null
                || minDailyUsage <= maxDailyUsage;
    }
}
