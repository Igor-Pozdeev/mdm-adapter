package ru.igorpozdeev.mdmadapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.igorpozdeev.mdmadapter.entity.MdmMessageOutbox;

/**
 * Репозиторий для работы со статусами отправки MDM событий
 */
@Repository
public interface MdmMessageOutboxRepository extends JpaRepository<MdmMessageOutbox, Long> {

}
