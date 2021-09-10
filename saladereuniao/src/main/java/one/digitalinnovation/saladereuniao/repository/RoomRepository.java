package one.digitalinnovation.saladereuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import one.digitalinnovation.saladereuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
