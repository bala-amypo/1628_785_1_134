import java.time.LocalDate;

@Entity
public class DailySymptomLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate logDate;   // ✅ change from String → LocalDate
    private int painLevel;
    private int mobilityLevel;
    private int fatigueLevel;
    private String notes;

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }
}
