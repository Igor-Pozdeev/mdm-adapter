package ru.igorpozdeev.mdmadapter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.igorpozdeev.mdmadapter.entity.MdmMessage;

import java.util.UUID;

/**
 * Репозиторий для работы с событиями MDM системы
 */
@Repository
public interface MdmMessageRepository extends JpaRepository<MdmMessage, UUID> {

}
