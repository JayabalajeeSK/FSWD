package com.jb.todo_management_system.entity;



import io.swagger.v3.oas.annotations.media.Schema;

// import jakarta.persistence.*;
// import lombok.Data;
// import lombok.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
// import jakarta.validation.constraints.Pattern;
// import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos")
@Data

public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // Primary Key (DO NOT CARE ABOUT GAPS)

    @NotNull(message = "Serial number cannot be null")
    private Integer serialNo;   // Continuous sequence

    @NotBlank(message = "Title cannot be blank")
    @Schema(name ="title", example = "Complete Jogging")
    private String title;

    // @NotBlank(message = "Description cannot be blank")
    // @Size(min = 5, max = 50)
    // // @Pattern(regexp = "^[0-9]{10}$") @Min() @Max()
    // private String description;

    private Boolean isCompleted;

    // @Email
    // String email;
}

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public Boolean getIsCompleted() {
    //     return isCompleted;
    // }

    // public void setIsCompleted(Boolean isCompleted) {
    //     this.isCompleted = isCompleted;
    // }


