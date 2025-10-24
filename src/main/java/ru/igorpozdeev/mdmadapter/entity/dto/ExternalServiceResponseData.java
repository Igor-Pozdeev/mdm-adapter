package ru.igorpozdeev.mdmadapter.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для хранения ответа внешнего сервиса и ошибок.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalServiceResponseData {

    /**
     * Статус ответа от внешнего сервиса.
     */
    private String status;

    /**
     * Сообщение об ошибке, если произошла ошибка.
     */
    private String errorMessage;
}
