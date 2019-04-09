package ru.javabegin.training.hibernate.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // генерация ID через Autoincrement в MySQL
    private long id;

    @NonNull
    private String name;

    @NonNull
    private long author_id;

}
