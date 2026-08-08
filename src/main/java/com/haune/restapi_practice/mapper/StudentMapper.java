package com.haune.restapi_practice.mapper;

import com.haune.restapi_practice.dto.StudentDTO;
import com.haune.restapi_practice.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentDTO toDTO(Student student) {
        if (student == null) return null;
        return StudentDTO.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .age(student.getAge())
                .build();
    }

    public Student toEntity(StudentDTO dto) {
        if (dto == null) return null;
        return Student.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .age(dto.getAge())
                .build();
    }
}
