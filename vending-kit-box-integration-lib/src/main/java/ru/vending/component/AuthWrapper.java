package ru.vending.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.vending.component.Auth;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class AuthWrapper {
    private Auth auth;
}
