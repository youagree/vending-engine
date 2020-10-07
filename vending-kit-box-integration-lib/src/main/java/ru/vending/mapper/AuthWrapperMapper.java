package ru.vending.mapper;

import org.mapstruct.Mapper;
import ru.vending.component.AuthWrapper;
import ru.vending.dto.AuthDtoWrapper;

@Mapper(uses = AuthMapper.class)
public interface AuthWrapperMapper {

    AuthDtoWrapper mapToDto (AuthWrapper authWrapper);
}
