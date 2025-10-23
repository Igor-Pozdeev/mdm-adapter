package ru.igorpozdeev.mdmadapter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import ru.igorpozdeev.mdmadapter.entity.dto.ResponseDataDto;
import ru.igorpozdeev.mdmadapter.entity.enums.DeliveryStatus;
import ru.igorpozdeev.mdmadapter.entity.enums.TargetService;

import java.util.UUID;

/**
 * Сущность статуса отправки MDM события во внешний сервис.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class MdmMessageOutbox {

    /**
     * Уникальный числовой идентификатор записи.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Уникальный идентификатор события из таблицы mdm_message.
     */
    private UUID mdmMessageId;

    /**
     * Статус доставки сообщения во внешний сервис.
     */
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    /**
     * Направление доставки сообщения.
     */
    @Enumerated(EnumType.STRING)
    private TargetService target;

    /**
     * Ответ внешнего сервиса и ошибки в структурированном виде.
     */
    @JdbcTypeCode(SqlTypes.JSON)
    private ResponseDataDto responseData;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MdmMessageOutbox that = (MdmMessageOutbox) o;
        return id.equals(that.id) && mdmMessageId.equals(that.mdmMessageId);
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
