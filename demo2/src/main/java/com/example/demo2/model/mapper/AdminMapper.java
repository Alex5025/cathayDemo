package com.example.demo2.model.mapper;

import com.example.demo2.model.bo.AdminBO;
import com.example.demo2.model.dto.AdminDTO;
import com.example.demo2.model.user.Admin;
import com.example.demo2.model.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AdminMapper {
//    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

    @Mappings({
            @Mapping(source = "a1Authority.authority", target = "a1AuthorityVo.authority"),
            @Mapping(source = "a1Authority.state", target = "a1AuthorityVo.state")
    })
    AdminVO toVO(Admin admin);

    @Mappings({
            @Mapping(source = "authorityDTO.authority", target = "a1Authority.authority"),
            @Mapping(source = "authorityDTO.state", target = "a1Authority.state")
    })
    Admin toPO(AdminDTO adminDTO);

    AdminBO toBO(Admin admin);
}
