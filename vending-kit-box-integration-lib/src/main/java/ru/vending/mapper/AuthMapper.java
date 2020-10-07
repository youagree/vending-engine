package ru.vending.mapper;

import org.mapstruct.Mapper;
import ru.vending.component.Auth;
import ru.vending.dto.AuthDto;

@Mapper
public interface AuthMapper {

    AuthDto map (Auth auth);
}