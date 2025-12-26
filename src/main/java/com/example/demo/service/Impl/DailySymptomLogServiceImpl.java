@Service
public class DailySymptomLogServiceImpl implements DailySymptomLogService {

    @Autowired
    private DailySymptomLogRepository repository;

    @Override
    public DailySymptomLog save(DailySymptomLog log) {
        return repository.save(log);
    }

    @Override
    public List<DailySymptomLog> getAll() {
        return repository.findAll();
    }
}
