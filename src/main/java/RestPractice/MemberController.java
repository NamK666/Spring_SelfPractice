package RestPractice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    private List<Member> members = new ArrayList<>();
    private long nextId = 1;

    // 전체 멤버 리스트 조회
    @GetMapping
    public List<Member> getAllMembers() {
        return members;
    }

    // 멤버 생성
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        member.setId(nextId++);
        members.add(member);
        return member;
    }

    // id에 따른 멤버 조회
    @GetMapping
    public Member getMemberById(@PathVariable Long id){
        return members.stream()
                .filter(member -> member.getId()==id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Member not found"));
    }

    // 멤버 수정
    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Long id, @RequestBody Member updateMember) {
        Member member = members.stream()
                .filter(m -> m.getId()==id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Member not found"));

        member.setName(updateMember.getName());
        member.setEmail(updateMember.getEmail());
        return member;
    }

    // 멤버 삭제
    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Long id) {
        members.removeIf(m -> m.getId()==id);
    }
}


