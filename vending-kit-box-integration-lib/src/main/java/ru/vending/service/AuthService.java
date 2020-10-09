package ru.vending.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import ru.vending.dto.AuthDto;
import ru.vending.dto.AuthDtoWrapper;
import ru.vending.dto.AuthDtoWrapperWithId;

import java.util.Date;

@Service
@Slf4j
public class AuthService {

    //TODO @Value
    private static final String PASSWORD = "11qq22ww33ee";
    private static final String USER_LOGIN = "Api_User";
    private static final Integer COMPANY_ID = 383361;

    private Long generateUniqueRequestId () {
        Date date = new Date();
        return date.getTime();
    }

    public AuthDtoWrapper getAuthDto() {
        Long aLong = generateUniqueRequestId();
        String sign = COMPANY_ID + PASSWORD + aLong;
        return new AuthDtoWrapper()
                                    .setAuth(new AuthDto()
                                            .setCompanyId(COMPANY_ID)
                                            .setRequestId(aLong)
                                            .setSign(DigestUtils.md5DigestAsHex(sign.getBytes()))
                                            .setUserLogin(USER_LOGIN));
    }

    public AuthDtoWrapperWithId getAuthDtoWithId(Long id) {
        Long aLong = generateUniqueRequestId();
        String sign = COMPANY_ID + PASSWORD + aLong;
        return new AuthDtoWrapperWithId()
                .setAuth(new AuthDto()
                        .setCompanyId(COMPANY_ID)
                        .setRequestId(aLong)
                        .setSign(DigestUtils.md5DigestAsHex(sign.getBytes()))
                        .setUserLogin(USER_LOGIN))
                .setId(id);
    }
}
