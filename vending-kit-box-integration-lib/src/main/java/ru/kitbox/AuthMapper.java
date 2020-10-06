package ru.kitbox.;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import ru.vending.dto.AuthDto;
import ru.vending.entity.Auth;

@Mapper
public interface AuthMapper {

    AuthDto mapToAuthDto (Auth auth);
}