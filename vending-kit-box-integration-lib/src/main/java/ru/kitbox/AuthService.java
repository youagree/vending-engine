package ru.kitbox;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import ru.vending.dto.AuthDto;
import ru.vending.entity.Auth;
import ru.vending.mapper.AuthMapper;

import java.util.Date;

@Service
@Slf4j
public class AuthService {
    private static final String PASSWORD = "jkUI03n093JKlrZnm";
    private static final String USER_LOGIN = "UnitLaTechno";
    private static final Integer COMPANY_ID = 383361;

    private final AuthMapper authMapper;

    @Autowired
    public AuthService (AuthMapper authMapper) {
        this.authMapper = authMapper;
    }

    private Long generateUniqueRequestId () {
        Date date = new Date();
        Long uniqueRequestId = date.getTime();

        return uniqueRequestId;
    }

    public AuthDto getAuthDto() {
        Auth auth = new Auth();
        auth.setUserLogin(USER_LOGIN);
        auth.setCompanyId(COMPANY_ID);
        auth.setRequestId(generateUniqueRequestId());
        String sign = COMPANY_ID + PASSWORD + auth.getRequestId();
        auth.setSign(DigestUtils.md5DigestAsHex(sign.getBytes()));
        return authMapper.mapToAuthDto(auth);
    }
}
