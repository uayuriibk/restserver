package com.restby.models.data;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pages")
@Data
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=2)
    private String title;

    private String slug;

    @Size(min=5)
    private String content;

    private int sorting;

}
