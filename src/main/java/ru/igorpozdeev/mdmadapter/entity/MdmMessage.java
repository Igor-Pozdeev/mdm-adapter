package ru.igorpozdeev.mdmadapter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import ru.igorpozdeev.mdmadapter.entity.enums.MessageType;

import java.util.UUID;

/**
 * Сущность события из MDM системы.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class MdmMessage extends AuditableEntity {

    /**
     * Уникальный идентификатор записи события.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    /**
     * Уникальный идентификатор сообщения из внешней MDM системы.
     */
    private UUID externalId;

    /**
     * Уникальный идентификатор клиента в системе.
     */
    private String guid;

    /**
     * Тип события из MDM системы.
     */
    @Enumerated(EnumType.STRING)
    private MessageType type;

    /**
     * Содержимое сообщения в формате JSON.
     */
    @JdbcTypeCode(SqlTypes.JSON)
    private String payload;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MdmMessage that = (MdmMessage) o;
        return id.equals(that.id) && externalId.equals(that.externalId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
