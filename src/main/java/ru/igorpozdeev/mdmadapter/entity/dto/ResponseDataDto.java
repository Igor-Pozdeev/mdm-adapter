package ru.igorpozdeev.mdmadapter.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO для хранения ответа внешнего сервиса и ошибок.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDataDto {

    /**
     * Ответ от внешнего сервиса в сериализованном виде.
     */
    private String response;

    /**
     * Список ошибок, возникших в процессе отправки запроса и обработке ответа от внешнего сервиса.
     */
    private List<String> errors;
}
