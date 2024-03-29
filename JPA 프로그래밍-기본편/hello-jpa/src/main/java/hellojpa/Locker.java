package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Locker {

    @Id @GeneratedValue
    private Long id;

    private String name;

//    @OneToOne(mappedBy = "locker") //읽기 전용
//    private Member member;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
}
