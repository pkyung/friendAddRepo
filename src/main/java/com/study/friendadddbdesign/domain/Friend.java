package com.study.friendadddbdesign.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Friend {
    @Id
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "one_member_id")
    private Member member1;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "two_member_id")
    private Member member2;

}
