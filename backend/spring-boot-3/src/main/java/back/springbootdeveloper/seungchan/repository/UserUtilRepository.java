package back.springbootdeveloper.seungchan.repository;

import back.springbootdeveloper.seungchan.entity.UserUtill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserUtilRepository extends JpaRepository<UserUtill, Long> {

  UserUtill findByUserId(Long userId);

  @Transactional
  @Modifying
  @Query("UPDATE UserUtill u SET u.cntVacation = :cntVacation WHERE u.userId = :userId")
  void updateCntVacationUserUtilData(Long userId, int cntVacation);

  @Transactional
  @Modifying
  @Query("UPDATE UserUtill u SET u.isNuriKing = :isNuriKing WHERE u.userId = :userId")
  void updateIsKingNuri(Long userId, boolean isNuriKing);

  @Transactional
  @Modifying
  @Query("UPDATE UserUtill u SET u.cntVacation = :cntVacation")
  void resetCntVacation(int cntVacation);

  void deleteByUserId(Long userId);
}
