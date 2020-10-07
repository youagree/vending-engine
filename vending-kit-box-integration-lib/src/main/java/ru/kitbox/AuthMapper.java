package ru.kitbox;

import org.mapstruct.Mapper;

@Mapper
public interface AuthMapper {

    AuthDto mapToAuthDto (Auth auth);
}