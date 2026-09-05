package net.javaguides.springboot.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - raul.perez.vicente@gmail.com
 * @version 05/09/2026 - 09:37
 * @since 1.25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private int id;
    private String firstName;
    private String lastName;

}
