package ru.vending.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import ru.vending.component.Auth;
import ru.vending.component.AuthWrapper;
import ru.vending.dto.AuthDtoWrapper;
import ru.vending.mapper.AuthWrapperMapper;

import java.util.Date;

@Service
@Slf4j
public class AuthService {
    private static final String PASSWORD = "11qq22ww33ee";
    private static final String USER_LOGIN = "Api_User";
    private static final Integer COMPANY_ID = 383361;

    private final AuthWrapperMapper authWrapperMapper;

    @Autowired
    public AuthService (AuthWrapperMapper authWrapperMapper) {
        this.authWrapperMapper = authWrapperMapper;
    }

    private Long generateUniqueRequestId () {
        Date date = new Date();

        return date.getTime();
    }

    public AuthDtoWrapper getAuthDto() {
        AuthWrapper wrap = new AuthWrapper();
        Auth auth = new Auth();
        auth.setUserLogin(USER_LOGIN);
        auth.setCompanyId(COMPANY_ID);
        auth.setRequestId(generateUniqueRequestId());
        String sign = COMPANY_ID + PASSWORD + auth.getRequestId();
        auth.setSign(DigestUtils.md5DigestAsHex(sign.getBytes()));
        wrap.setAuth(auth);
        return authWrapperMapper.mapToDto(wrap);
    }
}
