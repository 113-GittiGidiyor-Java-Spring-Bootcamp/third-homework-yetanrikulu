package com.example.thirdhomeworkyetanrikulu.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PermanentInstructor.class, name = "PermanentInstructor"),
        @JsonSubTypes.Type(value = VisitingResearcher.class, name = "VisitingResearcher")
})
public abstract class Instructor extends Person {
    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courseList = new ArrayList<>();
}