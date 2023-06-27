package persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyItemRepository extends JpaRepository<PartyItemEntity, Long> {

    List<PartyItemEntity> findAllByTrack(String Track);

}
