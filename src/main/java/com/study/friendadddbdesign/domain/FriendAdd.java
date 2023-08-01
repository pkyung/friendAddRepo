package com.study.friendadddbdesign.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FriendAdd {
    @Id
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "send_member_id")
    private Member sendMember;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receive_member_id")
    private Member receiveMember;
}
