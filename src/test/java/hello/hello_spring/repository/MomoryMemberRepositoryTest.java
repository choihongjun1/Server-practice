package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MomoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");
        repository.save(member);
        Member result = repository.findById(member.getId()).get();
//        System.out.println("result: " + (result == member));
//        Assertions.assertEquals(member, result);
//        Assertions.assertEquals(member, null);
        assertThat(member).isEqualTo(result);
//        assertThat(member).isEqualTo(null);
    }
}
