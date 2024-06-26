package back.springbootdeveloper.seungchan.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "periodic_data")
@AllArgsConstructor
@Builder
public class PeriodicData {

  @Id // id 필드를 기본키로 지정
  @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동으로 1씩 증가
  @Column(name = "id", updatable = false)
  private Long id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "name", length = 10, nullable = false)
  private String name;

  @Column(name = "weekly_data", length = 20, nullable = false)
  private String weeklyData;

  @Column(name = "this_month", length = 100, nullable = false)
  private String thisMonth;

  @Column(name = "previous_month", length = 100, nullable = false)
  private String previousMonth;
}
