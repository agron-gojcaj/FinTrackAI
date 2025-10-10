import java.util.UUID;

@Entity @Table(name = "accounts")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Account {
    @Id @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private UUID userId; // keep simple for now

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type; // enum-enforced in DB

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private Instant createdAt = Instant.now();
}