package com.openparty.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "problem_sheet")
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="description")
    private String description;
    @Column(name="user")
    private String user;
    @Column(name="upvotes")
    private int upvotes;
    @Column(name="downvotes")
    private int downvotes;
}

