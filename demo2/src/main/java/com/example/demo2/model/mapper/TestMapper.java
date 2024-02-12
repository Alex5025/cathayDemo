package com.example.demo2.model.mapper;

import com.example.demo2.model.entity.Child;
import com.example.demo2.model.entity.Parent;
import com.example.demo2.model.entity.Pet;
import com.example.demo2.model.vo.OtherVO;
import com.example.demo2.model.vo.ParentVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;



    @Mapper
    public interface TestMapper {
        TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

        @Mapping(source = "childList", target = "childVOList")
        ParentVO toVO(Parent parent);


        @Mappings({
                @Mapping(source = "pet.petuuid",target = "petuuid"),
                @Mapping(source = "pet.type",target = "type"),
                @Mapping(source = "parent.pname",target = "ownername")
        })
        OtherVO toVO(Parent parent, Pet pet);
        @Mappings({
                @Mapping(source = "pet.petuuid",target = "petuuid"),
                @Mapping(source = "pet.type",target = "type"),
                @Mapping(source = "child.cname",target = "ownername")
        })
        OtherVO toVO(Child child, Pet pet);
}
